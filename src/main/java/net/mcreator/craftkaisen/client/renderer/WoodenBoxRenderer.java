
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.WoodenBoxEntity;
import net.mcreator.craftkaisen.client.model.Modelcabin;

public class WoodenBoxRenderer extends MobRenderer<WoodenBoxEntity, Modelcabin<WoodenBoxEntity>> {
	public WoodenBoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcabin(context.bakeLayer(Modelcabin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WoodenBoxEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/planks_spruce.png");
	}
}
