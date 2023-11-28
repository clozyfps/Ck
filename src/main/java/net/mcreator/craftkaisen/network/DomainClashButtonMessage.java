
package net.mcreator.craftkaisen.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DomainClashButtonMessage {

	private final int buttonID, x, y, z;

	public DomainClashButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public DomainClashButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(DomainClashButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(DomainClashButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;

			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = DomainClashMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			DomainClashUpProcedure.execute(entity);
		}
		if (buttonID == 1) {

			DomainClashUpProcedure.execute(entity);
		}
		if (buttonID == 2) {

			DomainClashUpProcedure.execute(entity);
		}
		if (buttonID == 3) {

			DomainClashUpProcedure.execute(entity);
		}
		if (buttonID == 4) {

			DomainClashUpProcedure.execute(entity);
		}
		if (buttonID == 5) {

			DomainClashUpProcedure.execute(entity);
		}
		if (buttonID == 6) {

			DomainClashUpProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(DomainClashButtonMessage.class, DomainClashButtonMessage::buffer, DomainClashButtonMessage::new, DomainClashButtonMessage::handler);
	}

}
