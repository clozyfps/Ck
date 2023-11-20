package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.world.inventory.MoveGuiMenu;
import net.mcreator.craftkaisen.procedures.ShowUnlockProcedure;
import net.mcreator.craftkaisen.procedures.ReturnTechniqueProcedure;
import net.mcreator.craftkaisen.procedures.ReturnSkillpointsProcedure;
import net.mcreator.craftkaisen.procedures.ReturnMoveDisplayProcedure;
import net.mcreator.craftkaisen.procedures.ReturnMoveCostProcedure;
import net.mcreator.craftkaisen.network.MoveGuiButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MoveGuiScreen extends AbstractContainerScreen<MoveGuiMenu> {
	private final static HashMap<String, Object> guistate = MoveGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_1;
	Button button_2;
	Button button_3;
	Button button_4;
	Button button_5;
	Button button_6;
	Button button_unlock;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;

	public MoveGuiScreen(MoveGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 126;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/move_gui.png");

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
		this.font.draw(poseStack,

				ReturnTechniqueProcedure.execute(entity), 22, 10, -16777216);
		this.font.draw(poseStack,

				ReturnMoveDisplayProcedure.execute(entity), 12, 27, -3434702);
		this.font.draw(poseStack,

				ReturnMoveCostProcedure.execute(entity), 8, 43, -12829636);
		this.font.draw(poseStack,

				ReturnSkillpointsProcedure.execute(entity), 8, 142, -12829636);
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
		button_1 = new Button(this.leftPos + 125, this.topPos + 7, 30, 20, Component.translatable("gui.craft_kaisen.move_gui.button_1"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(0, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_1", button_1);
		this.addRenderableWidget(button_1);
		button_2 = new Button(this.leftPos + 125, this.topPos + 34, 30, 20, Component.translatable("gui.craft_kaisen.move_gui.button_2"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(1, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_2", button_2);
		this.addRenderableWidget(button_2);
		button_3 = new Button(this.leftPos + 125, this.topPos + 61, 30, 20, Component.translatable("gui.craft_kaisen.move_gui.button_3"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(2, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_3", button_3);
		this.addRenderableWidget(button_3);
		button_4 = new Button(this.leftPos + 125, this.topPos + 87, 30, 20, Component.translatable("gui.craft_kaisen.move_gui.button_4"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(3, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_4", button_4);
		this.addRenderableWidget(button_4);
		button_5 = new Button(this.leftPos + 125, this.topPos + 115, 30, 20, Component.translatable("gui.craft_kaisen.move_gui.button_5"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(4, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_5", button_5);
		this.addRenderableWidget(button_5);
		button_6 = new Button(this.leftPos + 125, this.topPos + 142, 30, 20, Component.translatable("gui.craft_kaisen.move_gui.button_6"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(5, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_6", button_6);
		this.addRenderableWidget(button_6);
		button_unlock = new Button(this.leftPos + 35, this.topPos + 115, 56, 20, Component.translatable("gui.craft_kaisen.move_gui.button_unlock"), e -> {
			if (ShowUnlockProcedure.execute(entity)) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(6, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowUnlockProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:button_unlock", button_unlock);
		this.addRenderableWidget(button_unlock);
		button_empty = new Button(this.leftPos + 107, this.topPos + 115, 9, 20, Component.translatable("gui.craft_kaisen.move_gui.button_empty"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(7, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + 8, this.topPos + 115, 9, 20, Component.translatable("gui.craft_kaisen.move_gui.button_empty1"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(8, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = new Button(this.leftPos + 4, this.topPos + 5, 10, 20, Component.translatable("gui.craft_kaisen.move_gui.button_empty2"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(9, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_empty3 = new Button(this.leftPos + 111, this.topPos + 5, 9, 20, Component.translatable("gui.craft_kaisen.move_gui.button_empty3"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MoveGuiButtonMessage(10, x, y, z));
				MoveGuiButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);
	}
}
