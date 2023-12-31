package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.entity.BlueEntityEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class LapseBlueRangedWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle minecraft:dust 0.01 0.77 0.99 2.5 ^0 ^0 ^0 1.5 1.5 1.5 0 15");
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
										entityiterator.setDeltaMovement(new Vec3(((x + xi - entityiterator.getX()) / 4), ((y + i - entityiterator.getY()) / 4), ((z + zi - entityiterator.getZ()) / 4)));
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
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					}
				}
			}
		}
		immediatesourceentity.setNoGravity(true);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof BlueEntityEntity) {
					if (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						{
							Entity _ent = entityiterator;
							_ent.teleportTo((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
		}
		if (!(!world.getEntitiesOfClass(BlueEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty())) {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		} else if (!world.getEntitiesOfClass(BlueEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).isEmpty()
				&& !(((Entity) world.getEntitiesOfClass(BlueEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get()) : false) {
			{
				Entity _ent = immediatesourceentity;
				_ent.teleportTo((entity.level
						.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getX()),
						(entity.level.clip(
								new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getY()),
						(entity.level.clip(
								new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getBlockPos().getZ()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX()),
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getY()),
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getZ()),
							_ent.getYRot(), _ent.getXRot());
			}
		}
		CraftKaisenMod.queueServerWork(250, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
			if (!((Entity) world.getEntitiesOfClass(BlueEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
				((Entity) world.getEntitiesOfClass(BlueEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
		});
	}
}
