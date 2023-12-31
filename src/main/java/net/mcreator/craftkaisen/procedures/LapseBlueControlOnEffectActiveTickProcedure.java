package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

public class LapseBlueControlOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get(), 999999, 0, false, false));
		} else if (!entity.isShiftKeyDown()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get());
		}
		if (Screen.hasControlDown()) {
			entity.getPersistentData().putDouble("bluex", (entity.getPersistentData().getDouble("bluex") + 1));
			entity.getPersistentData().putDouble("bluez", (entity.getPersistentData().getDouble("bluez") + 1));
		} else if (Screen.hasAltDown()) {
			entity.getPersistentData().putDouble("bluex", (entity.getPersistentData().getDouble("bluex") - 1));
			entity.getPersistentData().putDouble("bluez", (entity.getPersistentData().getDouble("bluez") - 1));
		}
	}
}
