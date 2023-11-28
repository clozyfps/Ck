package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
