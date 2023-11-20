package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class RandomiseCursedTechniqueProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double techniqueNumber = 0;
		double restrictionNumber = 0;
		techniqueNumber = Mth.nextInt(RandomSource.create(), 1, 12);
		if (techniqueNumber == 1) {
			{
				String _setval = "Limitless";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 2) {
			{
				String _setval = "Disaster Flames";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 3) {
			{
				String _setval = "Roots";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 4) {
			{
				String _setval = "Idle Transfiguration";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 5) {
			{
				String _setval = "Ten Shadows";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 6) {
			{
				String _setval = "Cursed Speech";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 7) {
			{
				String _setval = "Boogie Woogie";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 8) {
			{
				String _setval = "Copy";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 9) {
			{
				String _setval = "Ratio";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 10) {
			{
				String _setval = "Straw Doll";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 11) {
			{
				String _setval = "Inverse";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (techniqueNumber == 12) {
			{
				String _setval = "Miracle";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (Math.random() < 0.05) {
			restrictionNumber = Mth.nextInt(RandomSource.create(), 1, 4);
			if (restrictionNumber == 1) {
				{
					String _setval = "Fragile Body";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.special = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (restrictionNumber == 2) {
				{
					String _setval = "Physically Gifted";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.special = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (restrictionNumber == 3) {
				{
					String _setval = "No Energy";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.special = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (restrictionNumber == 4) {
				{
					String _setval = "Six Eyes";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.special = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(
					Component.literal(("You were born with the " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique + " cursed technique")), false);
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special).equals("Fragile Body")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You were born with an incredibly fragile body (Capped at -5 strength, speed and health stats) (granted 100 cursed energy and energy control stats)"), false);
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special).equals("Physically Gifted")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You were born with very little cursed energy but a physically gifted body (Capped at 3 cursed energy and energy control stats) (granted 25 strength and health stats + 10 speed stat)"),
						false);
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special).equals("No Energy")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						Component.literal("You were born with absolutely no cursed energy but an incredibly physically gifted body (Capped at 0 cursed energy and energy control stats) (granted 50 strength and health stats + 25 speed stat)"), false);
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special).equals("Six Eyes")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You were born with the Six Eyes (granted 50 cursed energy and energy control stats)"), false);
		}
	}
}
