
package net.mcreator.craftkaisen.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.craftkaisen.entity.model.EightHandledSwordDivergentSilaDivineGeneralMahoragaModel;
import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EightHandledSwordDivergentSilaDivineGeneralMahoragaRenderer extends GeoEntityRenderer<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity> {
	public EightHandledSwordDivergentSilaDivineGeneralMahoragaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EightHandledSwordDivergentSilaDivineGeneralMahoragaModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
