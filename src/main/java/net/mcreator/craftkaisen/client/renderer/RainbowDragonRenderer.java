
package net.mcreator.craftkaisen.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.craftkaisen.entity.model.RainbowDragonModel;
import net.mcreator.craftkaisen.entity.RainbowDragonEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

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
