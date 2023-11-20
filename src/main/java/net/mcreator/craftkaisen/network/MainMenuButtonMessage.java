
package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.MainMenuMenu;
import net.mcreator.craftkaisen.procedures.StrengthButtonProcedure;
import net.mcreator.craftkaisen.procedures.SpeedButtonProcedure;
import net.mcreator.craftkaisen.procedures.OpenMovesProcedure;
import net.mcreator.craftkaisen.procedures.HealthButtonProcedure;
import net.mcreator.craftkaisen.procedures.EnergyButtonProcedure;
import net.mcreator.craftkaisen.procedures.ControlButtonProcedure;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MainMenuButtonMessage {
	private final int buttonID, x, y, z;

	public MainMenuButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MainMenuButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MainMenuButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MainMenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = MainMenuMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenMovesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			StrengthButtonProcedure.execute(entity);
		}
		if (buttonID == 2) {

			HealthButtonProcedure.execute(entity);
		}
		if (buttonID == 3) {

			ControlButtonProcedure.execute(entity);
		}
		if (buttonID == 4) {

			EnergyButtonProcedure.execute(entity);
		}
		if (buttonID == 5) {

			SpeedButtonProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(MainMenuButtonMessage.class, MainMenuButtonMessage::buffer, MainMenuButtonMessage::new, MainMenuButtonMessage::handler);
	}
}
