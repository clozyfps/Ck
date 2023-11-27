package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class DisasterFlameRangedProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
		entity.getPersistentData().putBoolean("vector", true);
		CraftKaisenMod.queueServerWork(1, () -> {
			entity.getPersistentData().putBoolean("vector", false);
		});
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.LAVA, x, y, z, 3, 0.1, 2, 0.1, 0);
	}
}
