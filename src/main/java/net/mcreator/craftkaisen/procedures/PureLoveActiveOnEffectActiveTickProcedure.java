package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class PureLoveActiveOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		raytrace_distance = 10;
		for (int index0 = 0; index0 < 14; index0++) {
			if (!world.getBlockState(new BlockPos(
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
					entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()))
					.canOcclude() || raytrace_distance < 14) {
				raytrace_distance = raytrace_distance + 1;
				world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.MIST_PURPLE.get()), x, (y + 1), z, ((Math.sin(Math.toRadians(entity.getYRot() + 180)) * raytrace_distance) / 2),
						((Math.sin(Math.toRadians(0 - entity.getXRot())) * raytrace_distance) / 2), ((Math.cos(Math.toRadians(entity.getYRot())) * raytrace_distance) / 2));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null,
								new BlockPos(
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getX(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getY(),
										entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
												.getBlockPos().getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getX()),
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getY()),
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getZ()),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				{
					final Vec3 _center = new Vec3(
							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getX()),
							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getY()),
							(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytrace_distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos()
									.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && entityiterator instanceof LivingEntity && !((entity.getVehicle()) == entityiterator) && !((entityiterator.getVehicle()) == entity)) {
							entityiterator.hurt((new EntityDamageSource("generic.player", (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null))), 15);
						}
					}
				}
			}
		}
	}
}
