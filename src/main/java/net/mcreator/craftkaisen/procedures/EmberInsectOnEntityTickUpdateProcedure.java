package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EmberInsectOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(entityiterator instanceof EmberInsectEntity)) {
						if (!entityiterator.getPersistentData().getBoolean("insect")) {
							if (entityiterator instanceof LivingEntity) {
								if (!entity.level.isClientSide())
									entity.discard();
								entityiterator.hurt(DamageSource.GENERIC, 10);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1, 1, 2, 1, 0);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 0.1, 2, 0.1, 0);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.LAVA, x, y, z, 3, 0.1, 2, 0.1, 0);
							}
						}
					}
				}
			}
		}
	}
}
