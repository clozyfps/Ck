package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class RikaOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"particle minecraft:dust 0 0 0 7 ^0 ^0 ^0 5.2 3 5.2 0 85");
		CraftKaisenMod.queueServerWork(1, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0 0 0 7 ^0 ^0 ^0 5.2 3 5.2 0 85");
			CraftKaisenMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0 0 0 7 ^0 ^0 ^0 5.2 3 5.2 0 85");
				CraftKaisenMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0 0 0 7 ^0 ^0 ^0 5.2 3 5.2 0 85");
					CraftKaisenMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"particle minecraft:dust 0 0 0 7 ^0 ^0 ^0 5.2 3 5.2 0 85");
					});
				});
			});
		});
	}
}
