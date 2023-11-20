
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.BlackDivineDogEntity;
import net.mcreator.craftkaisen.client.model.Modeldivinedog;

public class BlackDivineDogRenderer extends MobRenderer<BlackDivineDogEntity, Modeldivinedog<BlackDivineDogEntity>> {
	public BlackDivineDogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldivinedog(context.bakeLayer(Modeldivinedog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlackDivineDogEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/blackdivinedog.png");
	}
}
