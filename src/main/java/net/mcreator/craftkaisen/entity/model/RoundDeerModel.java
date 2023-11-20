package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftkaisen.entity.RoundDeerEntity;

public class RoundDeerModel extends AnimatedGeoModel<RoundDeerEntity> {
	@Override
	public ResourceLocation getAnimationResource(RoundDeerEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/rounddear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoundDeerEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/rounddear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoundDeerEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}
