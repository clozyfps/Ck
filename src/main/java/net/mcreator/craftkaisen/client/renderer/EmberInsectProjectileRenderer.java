package net.mcreator.craftkaisen.client.renderer;

public class EmberInsectProjectileRenderer extends EntityRenderer<EmberInsectProjectileEntity> {

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/entities/emberinsect.png");

	private final Modelemberinsect model;

	public EmberInsectProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelemberinsect(context.bakeLayer(Modelemberinsect.LAYER_LOCATION));
	}

	@Override
	public void render(EmberInsectProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(EmberInsectProjectileEntity entity) {
		return texture;
	}

}
