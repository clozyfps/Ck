package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Direction;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class LimitlessTick2Procedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("hollowPurple") >= 0) {
			entity.getPersistentData().putDouble("hollowPurple", (entity.getPersistentData().getDouble("hollowPurple") - 1));
			entity.getPersistentData().putDouble("hollowDistance", (entity.getPersistentData().getDouble("hollowDistance") + 0.12857143));
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_ELECTRICITY.get()), x, y, z, 1, 1.5, 1, 1.5, 1);
			if (entity.getPersistentData().getDouble("hollowPurple") >= 1) {
				if ((entity.getDirection()) == Direction.EAST) {
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = x + xx;
										double posY = (y + 0.5) + yy;
										double posZ = (z + 4.5 - entity.getPersistentData().getDouble("hollowDistance")) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = x + xx;
										double posY = (y + 0.5) + yy;
										double posZ = (z - (4.5 - entity.getPersistentData().getDouble("hollowDistance"))) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
				} else if ((entity.getDirection()) == Direction.WEST) {
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = x + xx;
										double posY = (y + 0.5) + yy;
										double posZ = (z + 4.5 - entity.getPersistentData().getDouble("hollowDistance")) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = x + xx;
										double posY = (y + 0.5) + yy;
										double posZ = (z - (4.5 - entity.getPersistentData().getDouble("hollowDistance"))) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
				} else if ((entity.getDirection()) == Direction.NORTH) {
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = (x + 4.5 - entity.getPersistentData().getDouble("hollowDistance")) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = z + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = (x - (4.5 - entity.getPersistentData().getDouble("hollowDistance"))) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = z + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
				} else if ((entity.getDirection()) == Direction.SOUTH) {
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = (x + 4.5 - entity.getPersistentData().getDouble("hollowDistance")) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = z + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = (x - (4.5 - entity.getPersistentData().getDouble("hollowDistance"))) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = z + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("hollowPurple") == 1) {
				entity.getPersistentData().putDouble("purpleDistance", 0);
				entity.getPersistentData().putBoolean("purple", true);
			}
		}
		if (entity.getPersistentData().getBoolean("purple") == true) {
			entity.getPersistentData().putDouble("purpleDistance", (entity.getPersistentData().getDouble("purpleDistance") + 1));
			HollowPurpeWhilstFlyingProcedure.execute(world, (x + entity.getLookAngle().x * (entity.getPersistentData().getDouble("purpleDistance") + 3)), (y + entity.getLookAngle().y * entity.getPersistentData().getDouble("purpleDistance")),
					(z + entity.getLookAngle().z * (entity.getPersistentData().getDouble("purpleDistance") + 3)), entity);
			{
				final Vec3 _center = new Vec3((x + entity.getLookAngle().x * entity.getPersistentData().getDouble("purpleDistance")), (y + entity.getLookAngle().y * entity.getPersistentData().getDouble("purpleDistance")),
						(z + entity.getLookAngle().z * entity.getPersistentData().getDouble("purpleDistance")));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("purpleCharge") / 20) / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.setDeltaMovement(new Vec3((((x + entity.getLookAngle().x * entity.getPersistentData().getDouble("purpleDistance")) - entityiterator.getX()) / 3),
								(((y + entity.getLookAngle().y * entity.getPersistentData().getDouble("purpleDistance")) - entityiterator.getY()) / 3),
								(((z + entity.getLookAngle().z * entity.getPersistentData().getDouble("purpleDistance")) - entityiterator.getZ()) / 3)));
					}
				}
			}
			if (entity.getPersistentData().getDouble("purpleDistance") >= entity.getPersistentData().getDouble("purpleCharge") * 1) {
				entity.getPersistentData().putBoolean("purple", false);
				entity.getPersistentData().putDouble("purpleCharge", 0);
			}
		}
	}
}
