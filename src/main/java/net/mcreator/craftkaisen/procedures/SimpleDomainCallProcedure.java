package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

public class SimpleDomainCallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		if (entity.getPersistentData().getDouble("simpledomainlevel") == 4) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = 5;
			zRadius = 5;
			for (int index0 = 0; index0 < 36; index0++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				degree = degree + Math.toRadians(5);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = -5;
			zRadius = -5;
			for (int index1 = 0; index1 < 36; index1++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				degree = degree + Math.toRadians(5);
			}
		} else if (entity.getPersistentData().getDouble("simpledomainlevel") == 3) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = 4;
			zRadius = 4;
			for (int index2 = 0; index2 < 36; index2++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				degree = degree + Math.toRadians(5);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = -4;
			zRadius = -4;
			for (int index3 = 0; index3 < 36; index3++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				degree = degree + Math.toRadians(5);
			}
		} else if (entity.getPersistentData().getDouble("simpledomainlevel") == 2) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = 3;
			zRadius = 3;
			for (int index4 = 0; index4 < 36; index4++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				degree = degree + Math.toRadians(5);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = -3;
			zRadius = -3;
			for (int index5 = 0; index5 < 36; index5++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				degree = degree + Math.toRadians(5);
			}
		} else if (entity.getPersistentData().getDouble("simpledomainlevel") == 1) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = 2;
			zRadius = 2;
			for (int index6 = 0; index6 < 36; index6++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				degree = degree + Math.toRadians(5);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = -2;
			zRadius = -2;
			for (int index7 = 0; index7 < 36; index7++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.5;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				degree = degree + Math.toRadians(5);
			}
		} else if (entity.getPersistentData().getDouble("simpledomainlevel") == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get());
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.SIMPLE_DOMAIN_COOLDOWN.get(), 200, 0, false, false));
		}
	}
}
