package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class BlueTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		int horizontalRadiusSphere = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 30) - 1;
		int verticalRadiusSphere = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 30) - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						if (world.getBlockState(new BlockPos(x + xi, y + i, z + zi)).canOcclude()) {
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level, new BlockPos(x + xi, y + i, z + zi), (world.getBlockState(new BlockPos(x + xi, y + i, z + zi))));
							{
								final Vec3 _center = new Vec3(x + xi, y + i, z + zi);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class,
										new AABB(_center, _center).inflate(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 2) / 2d), e -> true)
										.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entity == entityiterator) && !(entityiterator instanceof FallingBlockEntity)) {
										entityiterator.setDeltaMovement(new Vec3(((x + xi - entityiterator.getX()) / 7), ((y + i - entityiterator.getY()) / 7), ((z + zi - entityiterator.getZ()) / 7)));
									} else if (entityiterator instanceof ItemEntity) {
										if (!entityiterator.level.isClientSide())
											entityiterator.discard();
									} else if (entityiterator instanceof FallingBlockEntity) {
										entityiterator.setDeltaMovement(new Vec3(((x + xi - entityiterator.getX()) / 4), ((y + i - entityiterator.getY()) / 4), ((z + zi - entityiterator.getZ()) / 4)));
										if (Math.random() < 0.2) {
											{
												Entity _ent = entityiterator;
												_ent.teleportTo(x + xi, y + i, z + zi);
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport(x + xi, y + i, z + zi, _ent.getYRot(), _ent.getXRot());
											}
										}
									}
								}
							}
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x + xi, y + i, z + zi, 20,
										((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 30),
										((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 30),
										((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 30), 0);
						}
					}
				}
			}
		}
	}
}
