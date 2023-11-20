package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class ReleaseRikaProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("releaserika")) {
			entity.getPersistentData().putBoolean("releaserika", true);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Rika, Go!!"), true);
		} else if (entity.getPersistentData().getBoolean("releaserika")) {
			entity.getPersistentData().putBoolean("releaserika", false);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Rika, Return!!"), true);
		}
	}
}
