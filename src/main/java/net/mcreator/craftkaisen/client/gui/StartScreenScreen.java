package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.StartScreenMenu;
import net.mcreator.craftkaisen.procedures.ReturnHumanProcedure;
import net.mcreator.craftkaisen.procedures.ReturnCursedSpiritProcedure;
import net.mcreator.craftkaisen.network.StartScreenButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class StartScreenScreen extends AbstractContainerScreen<StartScreenMenu> {
	private final static HashMap<String, Object> guistate = StartScreenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button1png;
	ImageButton imagebutton_smallbutton1png;
	ImageButton imagebutton_smallbutton1png1;

	public StartScreenScreen(StartScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/start_screen.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/startscroll-1.png_1.png"));
		this.blit(ms, this.leftPos + -72, this.topPos + -112, 0, 0, 140, 212, 140, 212);

		if (ReturnHumanProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/humanicon-1.png.png"));
			this.blit(ms, this.leftPos + -72, this.topPos + -115, 0, 0, 140, 212, 140, 212);
		}
		if (ReturnCursedSpiritProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/spiriticon-1.png.png"));
			this.blit(ms, this.leftPos + -72, this.topPos + -115, 0, 0, 140, 212, 140, 212);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.start_screen.label_empty"), 12, 24, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.start_screen.label_empty1"), -22, 24, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.start_screen.label_race"), -11, -65, -13421773);
		if (ReturnHumanProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.start_screen.label_human"), -13, -44, -13547705);
		if (ReturnCursedSpiritProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.start_screen.label_cursed_spirit"), -13, -44, -12380907);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.start_screen.label_finish"), -12, 37, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		imagebutton_button1png = new ImageButton(this.leftPos + -12, this.topPos + 37, 23, 12, 0, 0, 12, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_button1png.png"), 23, 24, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new StartScreenButtonMessage(0, x, y, z));
				StartScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button1png", imagebutton_button1png);
		this.addRenderableWidget(imagebutton_button1png);
		imagebutton_smallbutton1png = new ImageButton(this.leftPos + -27, this.topPos + 24, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new StartScreenButtonMessage(1, x, y, z));
				StartScreenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png", imagebutton_smallbutton1png);
		this.addRenderableWidget(imagebutton_smallbutton1png);
		imagebutton_smallbutton1png1 = new ImageButton(this.leftPos + 5, this.topPos + 24, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png1.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new StartScreenButtonMessage(2, x, y, z));
				StartScreenButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png1", imagebutton_smallbutton1png1);
		this.addRenderableWidget(imagebutton_smallbutton1png1);
	}
}
