package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.init.CraftKaisenModBlocks;
import net.mcreator.craftkaisen.entity.WoodenBoxEntity;
import net.mcreator.craftkaisen.entity.PoxDeityDomainEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SmallPoxDeityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		double v = 0;
		if (!((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("craft_kaisen:small_pox_domain_dimension"))))) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if (Math.random() < 0.1) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 90) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(14 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof ServerPlayer _player && !_player.level.isClientSide()) {
									ResourceKey<Level> destinationType = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("craft_kaisen:small_pox_domain_dimension"));
									if (_player.level.dimension() == destinationType)
										return;
									ServerLevel nextLevel = _player.server.getLevel(destinationType);
									if (nextLevel != null) {
										_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
										_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
										_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
										for (MobEffectInstance _effectinstance : _player.getActiveEffects())
											_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
										_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
									}
								}
							}
						}
						if (!entity.level.isClientSide())
							entity.discard();
						int horizontalRadiusHemiTop = (int) 15 - 1;
						int verticalRadiusHemiTop = (int) 15;
						int yIterationsHemiTop = verticalRadiusHemiTop;
						for (int i = 0; i < yIterationsHemiTop; i++) {
							if (i == verticalRadiusHemiTop) {
								continue;
							}
							for (int xi = -horizontalRadiusHemiTop; xi <= horizontalRadiusHemiTop; xi++) {
								for (int zi = -horizontalRadiusHemiTop; zi <= horizontalRadiusHemiTop; zi++) {
									double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop) + (i * i) / (double) (verticalRadiusHemiTop * verticalRadiusHemiTop)
											+ (zi * zi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop);
									if (distanceSq <= 1.0) {
										world.setBlock(new BlockPos(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLOCK.get().defaultBlockState(), 3);
									}
								}
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new PoxDeityDomainEntity(CraftKaisenModEntities.POX_DEITY_DOMAIN.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						SmallBoxReplaceProcedure.execute(world, x, y, z);
					}
				}
			}
		} else if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("craft_kaisen:small_pox_domain_dimension")))) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.SMALL_POX_DEITY_COOLDOWN.get()) : false)) {
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.SMALL_POX_DEITY_COOLDOWN.get(), 100, 0, false, false));
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(14 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator)) {
								if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
									_entity.setTarget(_ent);
							}
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new WoodenBoxEntity(CraftKaisenModEntities.WOODEN_BOX.get(), _level);
						entityToSpawn.moveTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
