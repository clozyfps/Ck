package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MeteorCallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		int horizontalRadiusSphere = (int) 30 - 1;
		int verticalRadiusSphere = (int) 30 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						world.destroyBlock(new BlockPos(x + xi, y + i, z + zi), false);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x + xi, y + i, z + zi, 50, 5, 5, 5, 0);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, x + xi, y + i, z + zi, 50, 5, 5, 5, 0);
					}
				}
			}
		}
		if (!entity.level.isClientSide())
			entity.discard();
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(90 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.hurt(DamageSource.GENERIC, 50);
				}
			}
		}
	}
}
