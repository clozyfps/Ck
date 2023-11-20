
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.ShadowFrogEntity;
import net.mcreator.craftkaisen.client.model.Modelchimerafrog;

public class ShadowFrogRenderer extends MobRenderer<ShadowFrogEntity, Modelchimerafrog<ShadowFrogEntity>> {
	public ShadowFrogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchimerafrog(context.bakeLayer(Modelchimerafrog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowFrogEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/chimeratexture.png");
	}
}
