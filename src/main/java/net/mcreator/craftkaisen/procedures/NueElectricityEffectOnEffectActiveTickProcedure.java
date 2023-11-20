package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;

public class NueElectricityEffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.NUE_ELECTRICITY.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 8, 4, 3, 4, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 4, 3, 4, 0);
	}
}
