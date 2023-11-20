
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MaximumElephantEntity;
import net.mcreator.craftkaisen.client.model.Modelmaximumelephantnew;

public class MaximumElephantRenderer extends MobRenderer<MaximumElephantEntity, Modelmaximumelephantnew<MaximumElephantEntity>> {
	public MaximumElephantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaximumelephantnew(context.bakeLayer(Modelmaximumelephantnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MaximumElephantEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/maximumelephantexture.png");
	}
}
