
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.RoppongiCursedSpiritEntity;
import net.mcreator.craftkaisen.client.model.Modelroppongicursedspirit;

public class RoppongiCursedSpiritRenderer extends MobRenderer<RoppongiCursedSpiritEntity, Modelroppongicursedspirit<RoppongiCursedSpiritEntity>> {
	public RoppongiCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelroppongicursedspirit(context.bakeLayer(Modelroppongicursedspirit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RoppongiCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/roppongicursedspirit.png");
	}
}
