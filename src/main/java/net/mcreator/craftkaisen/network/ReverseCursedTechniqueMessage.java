
package net.mcreator.craftkaisen.network;

import net.mcreator.craftkaisen.CraftKaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReverseCursedTechniqueMessage {

	int type, pressedms;

	public ReverseCursedTechniqueMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public ReverseCursedTechniqueMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(ReverseCursedTechniqueMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(ReverseCursedTechniqueMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(ReverseCursedTechniqueMessage.class, ReverseCursedTechniqueMessage::buffer, ReverseCursedTechniqueMessage::new, ReverseCursedTechniqueMessage::handler);
	}

}
