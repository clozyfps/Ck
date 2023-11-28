package net.mcreator.craftkaisen.client.gui;

public class DomainClashScreen extends AbstractContainerScreen<DomainClashMenu> {

	private final static HashMap<String, Object> guistate = DomainClashMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	ImageButton imagebutton_press;
	ImageButton imagebutton_press1;
	ImageButton imagebutton_press2;
	ImageButton imagebutton_press3;
	ImageButton imagebutton_press4;
	ImageButton imagebutton_press5;
	ImageButton imagebutton_press6;

	public DomainClashScreen(DomainClashMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 50;
		this.imageHeight = 50;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/domain_clash.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/gui.png"));
		this.blit(ms, this.leftPos + -64, this.topPos + -66, 0, 0, 178, 178, 178, 178);

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

		imagebutton_press = new ImageButton(this.leftPos + -25, this.topPos + -22, 40, 24, 0, 0, 24, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_press.png"), 40, 48, e -> {
			if (

			DisplayDomainNum1Procedure.execute(entity)

			) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashButtonMessage(0, x, y, z));
				DomainClashButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				DisplayDomainNum1Procedure.execute(entity)

				)
					super.render(ms, gx, gy, ticks);
			}
		};

		guistate.put("button:imagebutton_press", imagebutton_press);
		this.addRenderableWidget(imagebutton_press);

		imagebutton_press1 = new ImageButton(this.leftPos + 34, this.topPos + -15, 40, 24, 0, 0, 24, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_press1.png"), 40, 48, e -> {
			if (

			DisplayDomainNum2Procedure.execute(entity)

			) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashButtonMessage(1, x, y, z));
				DomainClashButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				DisplayDomainNum2Procedure.execute(entity)

				)
					super.render(ms, gx, gy, ticks);
			}
		};

		guistate.put("button:imagebutton_press1", imagebutton_press1);
		this.addRenderableWidget(imagebutton_press1);

		imagebutton_press2 = new ImageButton(this.leftPos + -45, this.topPos + 9, 40, 24, 0, 0, 24, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_press2.png"), 40, 48, e -> {
			if (

			DisplayDomainNum3Procedure.execute(entity)

			) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashButtonMessage(2, x, y, z));
				DomainClashButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				DisplayDomainNum3Procedure.execute(entity)

				)
					super.render(ms, gx, gy, ticks);
			}
		};

		guistate.put("button:imagebutton_press2", imagebutton_press2);
		this.addRenderableWidget(imagebutton_press2);

		imagebutton_press3 = new ImageButton(this.leftPos + 1, this.topPos + 37, 40, 24, 0, 0, 24, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_press3.png"), 40, 48, e -> {
			if (

			DisplayDomainNum5Procedure.execute(entity)

			) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashButtonMessage(3, x, y, z));
				DomainClashButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				DisplayDomainNum5Procedure.execute(entity)

				)
					super.render(ms, gx, gy, ticks);
			}
		};

		guistate.put("button:imagebutton_press3", imagebutton_press3);
		this.addRenderableWidget(imagebutton_press3);

		imagebutton_press4 = new ImageButton(this.leftPos + -46, this.topPos + 70, 40, 24, 0, 0, 24, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_press4.png"), 40, 48, e -> {
			if (

			DisplayDomainNum6Procedure.execute(entity)

			) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashButtonMessage(4, x, y, z));
				DomainClashButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				DisplayDomainNum6Procedure.execute(entity)

				)
					super.render(ms, gx, gy, ticks);
			}
		};

		guistate.put("button:imagebutton_press4", imagebutton_press4);
		this.addRenderableWidget(imagebutton_press4);

		imagebutton_press5 = new ImageButton(this.leftPos + 60, this.topPos + 19, 40, 24, 0, 0, 24, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_press5.png"), 40, 48, e -> {
			if (

			DisplayDomainNum7Procedure.execute(entity)

			) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashButtonMessage(5, x, y, z));
				DomainClashButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				DisplayDomainNum7Procedure.execute(entity)

				)
					super.render(ms, gx, gy, ticks);
			}
		};

		guistate.put("button:imagebutton_press5", imagebutton_press5);
		this.addRenderableWidget(imagebutton_press5);

		imagebutton_press6 = new ImageButton(this.leftPos + 42, this.topPos + 65, 40, 24, 0, 0, 24, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_press6.png"), 40, 48, e -> {
			if (

			DisplayDomainNum4Procedure.execute(entity)

			) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashButtonMessage(6, x, y, z));
				DomainClashButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				DisplayDomainNum4Procedure.execute(entity)

				)
					super.render(ms, gx, gy, ticks);
			}
		};

		guistate.put("button:imagebutton_press6", imagebutton_press6);
		this.addRenderableWidget(imagebutton_press6);

	}

}
