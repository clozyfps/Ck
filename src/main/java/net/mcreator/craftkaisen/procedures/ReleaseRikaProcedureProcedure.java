package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReleaseRikaProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("releaserika")) {
			CraftKaisenMod.queueServerWork(1, () -> {
				entity.getPersistentData().putBoolean("releaserika", true);
			});
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Rika, Go!!"), true);
		} else if (entity.getPersistentData().getBoolean("releaserika")) {
			CraftKaisenMod.queueServerWork(1, () -> {
				entity.getPersistentData().putBoolean("releaserika", false);
			});
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Rika, Return!!"), true);
		}
	}
}
