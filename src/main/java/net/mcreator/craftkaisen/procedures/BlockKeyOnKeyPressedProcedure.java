package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class BlockKeyOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("blockcooldown")) {
			if (entity.getPersistentData().getDouble("blockpoint") > 0) {
				entity.getPersistentData().putBoolean("block", true);
				entity.getPersistentData().putBoolean("preblock", true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Block on cooldown!"), false);
		}
	}
}
