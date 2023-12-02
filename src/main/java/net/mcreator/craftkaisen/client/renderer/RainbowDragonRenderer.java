
package net.mcreator.craftkaisen.client.renderer;

public class RainbowDragonRenderer extends GeoEntityRenderer<RainbowDragonEntity> {
	public RainbowDragonRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RainbowDragonModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(RainbowDragonEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}