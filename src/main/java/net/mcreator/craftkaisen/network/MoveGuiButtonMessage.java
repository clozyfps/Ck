
package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.MoveGuiMenu;
import net.mcreator.craftkaisen.procedures.UnlockButtonProcedure;
import net.mcreator.craftkaisen.procedures.SetAbility6Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility5Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility4Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility3Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility2Procedure;
import net.mcreator.craftkaisen.procedures.SetAbility1Procedure;
import net.mcreator.craftkaisen.procedures.ForwardbuttonProcedure;
import net.mcreator.craftkaisen.procedures.ForwardPageProcedure;
import net.mcreator.craftkaisen.procedures.BackPageProcedure;
import net.mcreator.craftkaisen.procedures.BackButtonProcedure;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoveGuiButtonMessage {
	private final int buttonID, x, y, z;

	public MoveGuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MoveGuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MoveGuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MoveGuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = MoveGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SetAbility1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			SetAbility2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			SetAbility3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			SetAbility4Procedure.execute(entity);
		}
		if (buttonID == 4) {

			SetAbility5Procedure.execute(entity);
		}
		if (buttonID == 5) {

			SetAbility6Procedure.execute(entity);
		}
		if (buttonID == 6) {

			UnlockButtonProcedure.execute(entity);
		}
		if (buttonID == 7) {

			ForwardbuttonProcedure.execute(entity);
		}
		if (buttonID == 8) {

			BackButtonProcedure.execute(entity);
		}
		if (buttonID == 9) {

			BackPageProcedure.execute(entity);
		}
		if (buttonID == 10) {

			ForwardPageProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(MoveGuiButtonMessage.class, MoveGuiButtonMessage::buffer, MoveGuiButtonMessage::new, MoveGuiButtonMessage::handler);
	}
}
