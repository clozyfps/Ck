
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.GreatSerpentEntity;
import net.mcreator.craftkaisen.client.model.Modelserpentground;

public class GreatSerpentRenderer extends MobRenderer<GreatSerpentEntity, Modelserpentground<GreatSerpentEntity>> {
	public GreatSerpentRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelserpentground(context.bakeLayer(Modelserpentground.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GreatSerpentEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/serpent.png");
	}
}
