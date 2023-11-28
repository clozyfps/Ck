
package net.mcreator.craftkaisen.network;

import net.mcreator.craftkaisen.CraftKaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ArmorSpecialMessage {

	int type, pressedms;

	public ArmorSpecialMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ArmorSpecialMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ArmorSpecialMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ArmorSpecialMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			ArmorSpecialOnKeyPressedProcedure.execute();
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(ArmorSpecialMessage.class, ArmorSpecialMessage::buffer, ArmorSpecialMessage::new, ArmorSpecialMessage::handler);
	}

}
