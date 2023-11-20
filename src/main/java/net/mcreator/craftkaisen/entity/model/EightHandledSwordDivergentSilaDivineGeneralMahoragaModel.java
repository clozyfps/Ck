package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;

public class EightHandledSwordDivergentSilaDivineGeneralMahoragaModel extends AnimatedGeoModel<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity> {
	@Override
	public ResourceLocation getAnimationResource(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/mahoraga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/mahoraga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}
