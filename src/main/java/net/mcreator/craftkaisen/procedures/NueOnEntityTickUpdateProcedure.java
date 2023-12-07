package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class NueOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.01) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.NUE_ELECTRICITY_EFFECT.get(), 120, 1, false, false));
			}
			if (Math.random() < 0.01) {
				entity.setDeltaMovement(new Vec3((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) / 4),
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY()) / 4), (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) / 4)));
				CraftKaisenMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 10, 3, 3, 3, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.POOF, x, y, z, 7, 3, 3, 3, 0);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					int horizontalRadiusSphere = (int) 5 - 1;
					int verticalRadiusSphere = (int) 5 - 1;
					int yIterationsSphere = verticalRadiusSphere;
					for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
						for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
							for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
								double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
										+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
								if (distanceSq <= 1.0) {
									world.destroyBlock(new BlockPos(x + xi, y + i, z + zi), false);
									world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
								}
							}
						}
					}
				});
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.NUE_ELECTRICITY_EFFECT.get()) : false) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entity == entityiterator) {
						if (!(entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
							if (entityiterator instanceof LivingEntity) {
								entityiterator.hurt((new DamageSource("lightningBolt")), 11);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.NUE_ELECTRICITY.get()), x, y, z, 25, 6, 3, 6, 0);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.FLASH, x, y, z, 3, 3, 3, 3, 0);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 3, 3, 3, 0);
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
									entityToSpawn.setVisualOnly(true);
									_level.addFreshEntity(entityToSpawn);
								}
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(CraftKaisenModMobEffects.NUE_ELECTRICITY_EFFECT.get());
							}
						}
					}
				}
			}
		}
	}
}
