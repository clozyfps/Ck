package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class PartyTpProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).InParty == true) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Squad).contains((new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "tpname");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getDisplayName().getString())) {
				if (((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "tpname");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).InCombat == false) {
					if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).InCombat == false) {
						(new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "tpname");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getPersistentData().putBoolean("pendingtp", true);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Tp Request Sent"), true);
						entity.getPersistentData().putString("tpsender", (entity.getDisplayName().getString()));
						entity.getPersistentData().putString("tpreceiver", ((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "tpname");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()).getDisplayName().getString()));
						if ((new Object() {
							public Entity getEntity() {
								try {
									return EntityArgument.getEntity(arguments, "tpname");
								} catch (CommandSyntaxException e) {
									e.printStackTrace();
									return null;
								}
							}
						}.getEntity()) instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + " Wants to teleport to you!")), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("You're in combat!"), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("This player is in combat!"), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("This player isnt in your party!"), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You arent in a party!"), true);
		}
	}
}
