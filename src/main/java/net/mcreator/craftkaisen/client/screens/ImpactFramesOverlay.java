
package net.mcreator.craftkaisen.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.procedures.DisplayFramesProcedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame9Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame8Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame7Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame6Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame5Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame4Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame31Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame30Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame29Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame28Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame27Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame26Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame25Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame24Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame23Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame22Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame21Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame20Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame19Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame18Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame17Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame16Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame15Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame14Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame13Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame12Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame11Procedure;
import net.mcreator.craftkaisen.procedures.DisplayFrame10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ImpactFramesOverlay {
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
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (DisplayFramesProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/screenshot_2023-10-31_140759.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), 0, 0, 0, 0, w, h, w, h);
			if (DisplayFrame1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/8.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/9.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/10.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame11Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/11.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame12Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/12.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame13Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/13.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame14Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/14.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame15Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/15.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame16Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/16.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame17Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/17.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame18Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/18.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame19Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/19.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame20Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/20.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame21Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/21.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame22Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/22.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame23Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/23.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame24Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/24.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame25Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/25.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame26Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/26.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame27Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/27.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame28Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/28.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame29Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/29.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame30Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/30.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
			if (DisplayFrame31Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/31.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -213, posY + -120, 0, 0, 427, 240, 427, 240);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
