
package net.mcreator.craftkaisen.client.renderer;

public class SmallPoxDeityRenderer extends GeoEntityRenderer<SmallPoxDeityEntity> {
	public SmallPoxDeityRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SmallPoxDeityModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(SmallPoxDeityEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}