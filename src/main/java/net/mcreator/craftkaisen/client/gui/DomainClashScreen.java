package net.mcreator.craftkaisen.client.gui;

public class DomainClashScreen extends AbstractContainerScreen<DomainClashMenu> {

	private final static HashMap<String, Object> guistate = DomainClashMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_x;

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
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.domain_clash.label_domain_clash"), -8, -13, -1);
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.domain_clash.label_press_the_button_as_many_times_a"), -80, 57, -1);
		this.font.draw(poseStack,

				ComboValueProcedure.execute(), -4, 84, -16750849);
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

		button_x = new Button(this.leftPos + 8, this.topPos + 14, 30, 20, Component.translatable("gui.craft_kaisen.domain_clash.button_x"), e -> {
			if (true) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashButtonMessage(0, x, y, z));
				DomainClashButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:button_x", button_x);
		this.addRenderableWidget(button_x);

	}

}
