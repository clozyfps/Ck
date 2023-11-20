package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.MainMenuMenu;
import net.mcreator.craftkaisen.procedures.ReturnStrengthProcedure;
import net.mcreator.craftkaisen.procedures.ReturnSpeedProcedure;
import net.mcreator.craftkaisen.procedures.ReturnSpecialProcedure;
import net.mcreator.craftkaisen.procedures.ReturnSkillpointsProcedure;
import net.mcreator.craftkaisen.procedures.ReturnRepProcedure;
import net.mcreator.craftkaisen.procedures.ReturnPlayerProcedure;
import net.mcreator.craftkaisen.procedures.ReturnLevelProcedure;
import net.mcreator.craftkaisen.procedures.ReturnHumanProcedure;
import net.mcreator.craftkaisen.procedures.ReturnHealthProcedure;
import net.mcreator.craftkaisen.procedures.ReturnExpDisplayProcedure;
import net.mcreator.craftkaisen.procedures.ReturnEnergyControlProcedure;
import net.mcreator.craftkaisen.procedures.ReturnCursedSpiritProcedure;
import net.mcreator.craftkaisen.procedures.ReturnCursedEnergyProcedure;
import net.mcreator.craftkaisen.procedures.ReturnAffiliationProcedure;
import net.mcreator.craftkaisen.network.MainMenuButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MainMenuScreen extends AbstractContainerScreen<MainMenuMenu> {
	private final static HashMap<String, Object> guistate = MainMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button1png;
	ImageButton imagebutton_smallbutton1png;
	ImageButton imagebutton_smallbutton1png1;
	ImageButton imagebutton_smallbutton1png3;
	ImageButton imagebutton_smallbutton1png2;
	ImageButton imagebutton_smallbutton1png4;

	public MainMenuScreen(MainMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/main_menu.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		if (ReturnPlayerProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryRaw(this.leftPos + -24, this.topPos + 0, 30, 0f, 0, livingEntity);
		}
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + 32 && mouseX < leftPos + 57 && mouseY > topPos + 76 && mouseY < topPos + 87)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_cursed_technique"), mouseX, mouseY);
		if (mouseX > leftPos + 48 && mouseX < leftPos + 67 && mouseY > topPos + 6 && mouseY < topPos + 15)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increases_attack_damage"), mouseX, mouseY);
		if (mouseX > leftPos + 48 && mouseX < leftPos + 68 && mouseY > topPos + 16 && mouseY < topPos + 25)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increase_max_health"), mouseX, mouseY);
		if (mouseX > leftPos + 48 && mouseX < leftPos + 67 && mouseY > topPos + 24 && mouseY < topPos + 34)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increase_max_cursed_energy"), mouseX, mouseY);
		if (mouseX > leftPos + 41 && mouseX < leftPos + 60 && mouseY > topPos + 34 && mouseY < topPos + 43)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increase_energy_regen_rate_and_m"), mouseX, mouseY);
		if (mouseX > leftPos + 41 && mouseX < leftPos + 61 && mouseY > topPos + 44 && mouseY < topPos + 53)
			this.renderTooltip(ms, Component.translatable("gui.craft_kaisen.main_menu.tooltip_increase_movement_speed"), mouseX, mouseY);
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
		if (ReturnHumanProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_race_human"), 0, -66, -11112336);
		this.font.draw(poseStack,

				ReturnSkillpointsProcedure.execute(entity), -3, -56, -12829636);
		if (ReturnCursedSpiritProcedure.execute(entity))
			this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_curse"), 0, -66, -11005165);
		this.font.draw(poseStack,

				ReturnExpDisplayProcedure.execute(entity), -3, -47, -12829636);
		this.font.draw(poseStack,

				ReturnRepProcedure.execute(entity), -3, -38, -12829636);
		this.font.draw(poseStack,

				ReturnAffiliationProcedure.execute(entity), -3, -29, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty"), -41, -3, -11253961);
		this.font.draw(poseStack,

				ReturnLevelProcedure.execute(entity), -3, -20, -12829636);
		this.font.draw(poseStack,

				ReturnSpecialProcedure.execute(entity), -3, -11, -12829636);
		this.font.draw(poseStack,

				ReturnStrengthProcedure.execute(entity), -41, 5, -12829636);
		this.font.draw(poseStack,

				ReturnHealthProcedure.execute(entity), -41, 14, -12829636);
		this.font.draw(poseStack,

				ReturnCursedEnergyProcedure.execute(entity), -41, 23, -12829636);
		this.font.draw(poseStack,

				ReturnEnergyControlProcedure.execute(entity), -41, 32, -12829636);
		this.font.draw(poseStack,

				ReturnSpeedProcedure.execute(entity), -41, 41, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty1"), 38, 78, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty2"), 55, 8, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty3"), 55, 18, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty4"), 55, 27, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty5"), 48, 35, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.main_menu.label_empty6"), 48, 45, -12829636);
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
		imagebutton_button1png = new ImageButton(this.leftPos + 32, this.topPos + 76, 23, 12, 0, 0, 12, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_button1png.png"), 23, 24, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(0, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button1png", imagebutton_button1png);
		this.addRenderableWidget(imagebutton_button1png);
		imagebutton_smallbutton1png = new ImageButton(this.leftPos + 48, this.topPos + 6, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(1, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png", imagebutton_smallbutton1png);
		this.addRenderableWidget(imagebutton_smallbutton1png);
		imagebutton_smallbutton1png1 = new ImageButton(this.leftPos + 48, this.topPos + 16, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png1.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(2, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png1", imagebutton_smallbutton1png1);
		this.addRenderableWidget(imagebutton_smallbutton1png1);
		imagebutton_smallbutton1png3 = new ImageButton(this.leftPos + 41, this.topPos + 34, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png3.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(3, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png3", imagebutton_smallbutton1png3);
		this.addRenderableWidget(imagebutton_smallbutton1png3);
		imagebutton_smallbutton1png2 = new ImageButton(this.leftPos + 48, this.topPos + 26, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png2.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(4, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png2", imagebutton_smallbutton1png2);
		this.addRenderableWidget(imagebutton_smallbutton1png2);
		imagebutton_smallbutton1png4 = new ImageButton(this.leftPos + 41, this.topPos + 44, 20, 10, 0, 0, 10, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_smallbutton1png4.png"), 20, 20, e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MainMenuButtonMessage(5, x, y, z));
				MainMenuButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_smallbutton1png4", imagebutton_smallbutton1png4);
		this.addRenderableWidget(imagebutton_smallbutton1png4);
	}
}
