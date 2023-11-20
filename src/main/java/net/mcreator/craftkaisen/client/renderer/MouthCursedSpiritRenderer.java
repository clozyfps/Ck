
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MouthCursedSpiritEntity;
import net.mcreator.craftkaisen.client.model.Modelmouthcursedspirit;

public class MouthCursedSpiritRenderer extends MobRenderer<MouthCursedSpiritEntity, Modelmouthcursedspirit<MouthCursedSpiritEntity>> {
	public MouthCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmouthcursedspirit(context.bakeLayer(Modelmouthcursedspirit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MouthCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/mouthcursedspirit.png");
	}
}
