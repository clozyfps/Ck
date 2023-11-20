
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.HeianEraSukunaEntity;
import net.mcreator.craftkaisen.client.model.Modelcustom_model;

public class HeianEraSukunaRenderer extends MobRenderer<HeianEraSukunaEntity, Modelcustom_model<HeianEraSukunaEntity>> {
	public HeianEraSukunaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HeianEraSukunaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/sukuna-jujutsu-kaisen-on-planetminecraft-com_1.png");
	}
}
