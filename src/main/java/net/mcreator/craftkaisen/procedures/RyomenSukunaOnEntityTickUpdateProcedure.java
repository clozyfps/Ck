package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;
import net.mcreator.craftkaisen.entity.DismantleEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RyomenSukunaOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double move = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity.getPersistentData().getDouble("cooldown") >= 1) {
			entity.getPersistentData().putDouble("cooldown", (entity.getPersistentData().getDouble("cooldown") - 1));
		}
		if (entity.getPersistentData().getDouble("domainCooldown") >= 1) {
			entity.getPersistentData().putDouble("domainCooldown", (entity.getPersistentData().getDouble("domainCooldown") - 3));
		}
		if (entity.getPersistentData().getDouble("dashAttack") >= 1) {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										("execute as " + entity.getStringUUID() + " at @s run tp @s ~ ~ ~ facing entity " + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()));
					}
				}
			}
			entity.getPersistentData().putDouble("dashAttack", (entity.getPersistentData().getDouble("dashAttack") - 1));
			entity.setDeltaMovement(new Vec3((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) / 3), (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY()) / 3),
					(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) / 3)));
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && entityiterator == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null)) {
						entityiterator.hurt((new EntityDamageSource("thorns", entity)), 6);
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 0.1, 0.1, 0.1, 1);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.2, (entityiterator.getBbHeight()), 0.2, 0.1);
					}
				}
			}
		}
		if (entity.getPersistentData().getBoolean("dismantleSphere") == true) {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			entity.getPersistentData().putDouble("sphereSize", (entity.getPersistentData().getDouble("sphereSize") + 1));
			{
				// Get the radius of the sphere
				double radius = (entity.getPersistentData().getDouble("sphereSize") / 10); // 3 blocks
				// Set the tolerance for how close to the surface a point must be to create a particle
				double tolerance = 0.005; // 0.1 blocks
				for (double xx = -radius; xx <= radius; xx += 0.1) {
					for (double yy = -radius; yy <= radius; yy += 0.1) {
						for (double zz = -radius; zz <= radius; zz += 0.1) {
							if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
								// Calculate the position of the particle
								double posX = x + xx;
								double posY = y + yy;
								double posZ = z + zz;
								if (true) {
									if (world instanceof ServerLevel)
										((ServerLevel) world).sendParticles(ParticleTypes.SWEEP_ATTACK, posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
								} else {
									world.addParticle(ParticleTypes.SWEEP_ATTACK, posX, posY, posZ, 0, 0, 0);
								}
							}
						}
					}
				}
			}
			int horizontalRadiusSphere = (int) (entity.getPersistentData().getDouble("sphereSize") / 10) - 1;
			int verticalRadiusSphere = (int) (entity.getPersistentData().getDouble("sphereSize") / 30) - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x + xi, y + i, z + zi, 3, 0.1, 0.1, 0.1, 1);
							world.destroyBlock(new BlockPos(x + xi, y + i, z + zi), false);
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("sphereSize") / 10) / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity)) {
						entityiterator.hurt((new EntityDamageSource("thorns", entity)), 1);
						entityiterator.setDeltaMovement(new Vec3(((entityiterator.getX() - entity.getX()) / 12), ((entityiterator.getY() - entity.getY()) / 12), ((entityiterator.getZ() - entity.getZ()) / 12)));
					}
				}
			}
			if (entity.getPersistentData().getDouble("sphereSize") >= 60) {
				entity.getPersistentData().putBoolean("dismantleSphere", false);
			}
		}
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (entity.getPersistentData().getDouble("cooldown") == 0) {
				move = Mth.nextInt(RandomSource.create(), 1, 6);
				if (move == 1) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new DismantleEntity(CraftKaisenModEntities.DISMANTLE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 5, 1, (byte) 50);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					entity.getPersistentData().putDouble("cooldown", 40);
				} else if (move == 2) {
					entity.getPersistentData().putBoolean("dismantleSphere", true);
					entity.getPersistentData().putDouble("sphereSize", 0);
					entity.getPersistentData().putDouble("cooldown", 100);
				} else if (move == 3) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new DismantleEntity(CraftKaisenModEntities.DISMANTLE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 5, 1, (byte) 50);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					CraftKaisenMod.queueServerWork(20, () -> {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level;
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new DismantleEntity(CraftKaisenModEntities.DISMANTLE.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 5, 1, (byte) 50);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						CraftKaisenMod.queueServerWork(20, () -> {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level;
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new DismantleEntity(CraftKaisenModEntities.DISMANTLE.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 5, 1, (byte) 50);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						});
					});
					entity.getPersistentData().putDouble("cooldown", 80);
				} else if (move == 4) {
					entity.getPersistentData().putDouble("dashAttack", 60);
					entity.getPersistentData().putDouble("cooldown", 80);
				} else if (move == 5) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.PRE_FIRE_ARROW.get(), 60, 1, false, false));
					entity.getPersistentData().putDouble("cooldown", 80);
				} else if (move == 6) {
					if (Math.random() < 0.05) {
						if (entity.getPersistentData().getDouble("domainCooldown") <= 0) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MalevolentShrineEntity(CraftKaisenModEntities.MALEVOLENT_SHRINE.get(), _level);
								entityToSpawn.moveTo((entity.getX() + entity.getLookAngle().x * (-1)), (entity.getY() - 2), (entity.getZ() + entity.getLookAngle().z * (-1)), entity.getYRot(), entity.getXRot());
								entityToSpawn.setYBodyRot(entity.getYRot());
								entityToSpawn.setYHeadRot(entity.getYRot());
								entityToSpawn.setDeltaMovement(0, 0, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn) {
									_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									if (entityToSpawn instanceof TamableAnimal _toTame && entity instanceof Player _owner) {
										_toTame.tame(_owner);
									}
								}
								_level.addFreshEntity(entityToSpawn);
							}
							entity.getPersistentData().putDouble("domainCooldown", 1200);
							entity.getPersistentData().putDouble("cooldown", 80);
						}
					}
				}
			}
		}
	}
}
