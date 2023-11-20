package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class DenyVesselProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((CraftKaisenModVariables.MapVariables.get(world).vesselPlayerOne).equals(entity.getDisplayName().getString()) || (CraftKaisenModVariables.MapVariables.get(world).vesselPlayerTwo).equals(entity.getDisplayName().getString())) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if (!(entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString()) && entity.getPersistentData().getBoolean("bodyRequested")
							&& ((CraftKaisenModVariables.MapVariables.get(world).vesselPlayerOne).equals(entityiterator.getDisplayName().getString())
									|| (CraftKaisenModVariables.MapVariables.get(world).vesselPlayerTwo).equals(entityiterator.getDisplayName().getString()))) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> No.")), false);
						entity.getPersistentData().putBoolean("prohibitUse", true);
						entity.getPersistentData().putDouble("controlTime", 0);
						entity.getPersistentData().putBoolean("bodyRequested", false);
					} else if ((entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString())) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Cannot request to use your own body!"), true);
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		}
	}
}
