package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.ArrayList;

public class PartyDeclineProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("pending", false);
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getPersistentData().getString("Receiver")).equals(entity.getDisplayName().getString())) {
				if (entityiterator instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + " Declined Your Party Invite!")), false);
			}
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("Declined the party invite"), false);
	}
}
