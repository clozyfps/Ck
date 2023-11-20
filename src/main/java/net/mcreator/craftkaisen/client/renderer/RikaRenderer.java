
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.RikaEntity;
import net.mcreator.craftkaisen.client.model.ModelRika;

public class RikaRenderer extends MobRenderer<RikaEntity, ModelRika<RikaEntity>> {
	public RikaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRika(context.bakeLayer(ModelRika.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RikaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/rikatexture.png");
	}
}
