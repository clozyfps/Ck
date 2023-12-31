
package net.mcreator.craftkaisen.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.procedures.LapseBlueOverlayDisplayOverlayIngameProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class LapseBlueOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (LapseBlueOverlayDisplayOverlayIngameProcedure.execute(entity)) {
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.lapse_blue_overlay.label_ctrl_move_away"), posX + 122, posY + -110, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.craft_kaisen.lapse_blue_overlay.label_alt_move_closer"), posX + 122, posY + -97, -1);
		}
	}
}
