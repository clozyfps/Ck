
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.ToadEntity;
import net.mcreator.craftkaisen.client.model.Modeltstoad;

public class ToadRenderer extends MobRenderer<ToadEntity, Modeltstoad<ToadEntity>> {
	public ToadRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltstoad(context.bakeLayer(Modeltstoad.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToadEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/toadtexture.png");
	}
}
