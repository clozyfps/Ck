
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.ReversalRedEntityEntity;
import net.mcreator.craftkaisen.client.model.Modelreversalred;

public class ReversalRedEntityRenderer extends MobRenderer<ReversalRedEntityEntity, Modelreversalred<ReversalRedEntityEntity>> {
	public ReversalRedEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelreversalred(context.bakeLayer(Modelreversalred.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ReversalRedEntityEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/redtexture.png");
	}
}
