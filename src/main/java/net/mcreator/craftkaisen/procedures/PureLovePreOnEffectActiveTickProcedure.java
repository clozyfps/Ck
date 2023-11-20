package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;

public class PureLovePreOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_ELECTRICITY.get()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), 1, 0.1, 1, 0.1, 1);
		{
			// Get the radius of the sphere
			double radius = 2; // 3 blocks
			// Set the tolerance for how close to the surface a point must be to create a particle
			double tolerance = 0.15; // 0.1 blocks
			for (double xx = -radius; xx <= radius; xx += 0.1) {
				for (double yy = -radius; yy <= radius; yy += 0.1) {
					for (double zz = -radius; zz <= radius; zz += 0.1) {
						if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
							// Calculate the position of the particle
							double posX = (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getX()) + xx;
							double posY = (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getY()) + yy;
							double posZ = (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(1)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getZ()) + zz;
							if (true) {
								if (world instanceof ServerLevel)
									((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
							} else {
								world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
							}
						}
					}
				}
			}
		}
	}
}
