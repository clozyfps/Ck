
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.EmberInsectEntity;
import net.mcreator.craftkaisen.client.model.Modelemberinsect;

public class EmberInsectRenderer extends MobRenderer<EmberInsectEntity, Modelemberinsect<EmberInsectEntity>> {
	public EmberInsectRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelemberinsect(context.bakeLayer(Modelemberinsect.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmberInsectEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/emberinsect.png");
	}
}
