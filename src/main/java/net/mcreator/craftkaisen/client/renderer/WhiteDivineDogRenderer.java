
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.WhiteDivineDogEntity;
import net.mcreator.craftkaisen.client.model.Modeldivinedog;

public class WhiteDivineDogRenderer extends MobRenderer<WhiteDivineDogEntity, Modeldivinedog<WhiteDivineDogEntity>> {
	public WhiteDivineDogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldivinedog(context.bakeLayer(Modeldivinedog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhiteDivineDogEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/whitedivinedog.png");
	}
}
