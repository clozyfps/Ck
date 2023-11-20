
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.RugbyFieldCursedSpiritEntity;
import net.mcreator.craftkaisen.client.model.Modelcursedspiritrugbyfield;

public class RugbyFieldCursedSpiritRenderer extends MobRenderer<RugbyFieldCursedSpiritEntity, Modelcursedspiritrugbyfield<RugbyFieldCursedSpiritEntity>> {
	public RugbyFieldCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursedspiritrugbyfield(context.bakeLayer(Modelcursedspiritrugbyfield.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RugbyFieldCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/rugbyfieldcursedspirit_3.png");
	}
}
