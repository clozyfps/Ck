package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

public class LapseBlueOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get()) : false) {
			return true;
		}
		return false;
	}
}
