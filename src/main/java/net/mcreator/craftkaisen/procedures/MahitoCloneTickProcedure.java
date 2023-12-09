package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MahitoCloneTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 50) {
			if (entity.getPersistentData().getBoolean("freemahito") == false) {
				if (((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getBoolean("split")) {
					if (entity instanceof Mob _entity && ((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
					if (((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 150, 150, 150), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _entity && entity instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
					entity.getPersistentData().putBoolean("freemahito", true);
				}
			}
		}
		if (entity.getPersistentData().getBoolean("freemahito") == true) {
			if (((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 3, 3, 3), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getBoolean("split")) {
				if (((Entity) world.getEntitiesOfClass(MahitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 3, 3, 3), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 50, 3, false, true));
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
