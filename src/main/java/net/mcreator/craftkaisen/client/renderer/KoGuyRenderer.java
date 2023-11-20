
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.KoGuyEntity;
import net.mcreator.craftkaisen.client.model.Modelcursedspiritgrasshopper;

public class KoGuyRenderer extends MobRenderer<KoGuyEntity, Modelcursedspiritgrasshopper<KoGuyEntity>> {
	public KoGuyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursedspiritgrasshopper(context.bakeLayer(Modelcursedspiritgrasshopper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KoGuyEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/grasshoppercursedspirit.png");
	}
}
