package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftkaisen.entity.RainbowDragonEntity;

public class RainbowDragonModel extends AnimatedGeoModel<RainbowDragonEntity> {
	@Override
	public ResourceLocation getAnimationResource(RainbowDragonEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/rainbowdragon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RainbowDragonEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/rainbowdragon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RainbowDragonEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}
