
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.HanamiEntity;
import net.mcreator.craftkaisen.client.model.Modelhanami;

public class HanamiRenderer extends MobRenderer<HanamiEntity, Modelhanami<HanamiEntity>> {
	public HanamiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhanami(context.bakeLayer(Modelhanami.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HanamiEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/hanami.png");
	}
}
