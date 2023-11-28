
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MaxMeteorEntity;
import net.mcreator.craftkaisen.client.model.Modelmaximummeteornewwww;

public class MaxMeteorRenderer extends MobRenderer<MaxMeteorEntity, Modelmaximummeteornewwww<MaxMeteorEntity>> {
	public MaxMeteorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaximummeteornewwww(context.bakeLayer(Modelmaximummeteornewwww.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MaxMeteorEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/maximummeteor.png");
	}
}
