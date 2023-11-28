
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.FingerBearerEntity;
import net.mcreator.craftkaisen.client.model.ModelFingerBearernew;

public class FingerBearerRenderer extends MobRenderer<FingerBearerEntity, ModelFingerBearernew<FingerBearerEntity>> {
	public FingerBearerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFingerBearernew(context.bakeLayer(ModelFingerBearernew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FingerBearerEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/fingerbearertexture.png");
	}
}
