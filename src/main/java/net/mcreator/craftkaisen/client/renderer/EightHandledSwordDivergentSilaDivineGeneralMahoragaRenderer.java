
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;
import net.mcreator.craftkaisen.client.model.Modeldivinemahoraga;

public class EightHandledSwordDivergentSilaDivineGeneralMahoragaRenderer extends MobRenderer<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity, Modeldivinemahoraga<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity>> {
	public EightHandledSwordDivergentSilaDivineGeneralMahoragaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldivinemahoraga(context.bakeLayer(Modeldivinemahoraga.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/mahoragatexturemain.png");
	}
}
