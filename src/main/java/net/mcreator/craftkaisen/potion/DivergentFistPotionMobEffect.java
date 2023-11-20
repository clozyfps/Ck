
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.DivergentFistPotionOnEffectActiveTickProcedure;

public class DivergentFistPotionMobEffect extends MobEffect {
	public DivergentFistPotionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.divergent_fist_potion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DivergentFistPotionOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
