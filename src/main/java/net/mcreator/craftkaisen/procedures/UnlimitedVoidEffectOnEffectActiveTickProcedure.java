package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class UnlimitedVoidEffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		{
			// Get the radius of the sphere
			double radius = 1; // 3 blocks
			// Set the tolerance for how close to the surface a point must be to create a particle
			double tolerance = 0.15; // 0.1 blocks
			for (double xx = -radius; xx <= radius; xx += 0.1) {
				for (double yy = -radius; yy <= radius; yy += 0.1) {
					for (double zz = -radius; zz <= radius; zz += 0.1) {
						if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
							// Calculate the position of the particle
							double posX = x + xx;
							double posY = (entity.getY() + 1) + yy;
							double posZ = z + zz;
							if (true) {
								if (world instanceof ServerLevel)
									((ServerLevel) world).sendParticles(ParticleTypes.ENCHANT, posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
							} else {
								world.addParticle(ParticleTypes.ENCHANT, posX, posY, posZ, 0, 0, 0);
							}
						}
					}
				}
			}
		}
	}
}
