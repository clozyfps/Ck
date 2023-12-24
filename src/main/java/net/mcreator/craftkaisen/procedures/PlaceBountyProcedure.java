package net.mcreator.craftkaisen.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import java.util.HashMap;
import java.util.ArrayList;

public class PlaceBountyProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (!(guistate.containsKey("text:PlayerBounty") ? ((EditBox) guistate.get("text:PlayerBounty")).getValue() : "").isEmpty()
					&& !(guistate.containsKey("text:BountyPlayer") ? ((EditBox) guistate.get("text:BountyPlayer")).getValue() : "").isEmpty()) {
				if ((entityiterator.getDisplayName().getString()).equals(guistate.containsKey("text:PlayerBounty") ? ((EditBox) guistate.get("text:PlayerBounty")).getValue() : "")) {
					if ((entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).HasBounty == false) {
						{
							boolean _setval = true;
							entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.HasBounty = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("A bounty of \u00A5" + (guistate.containsKey("text:BountyPlayer") ? ((EditBox) guistate.get("text:BountyPlayer")).getValue() : "") + " Yen has been placed on your head.")),
									false);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Bounty Placed"), false);
						if (entity instanceof Player _player)
							_player.closeContainer();
						{
							double _setval = new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:BountyPlayer") ? ((EditBox) guistate.get("text:BountyPlayer")).getValue() : "");
							entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Bounty = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					} else if ((entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).HasBounty == true) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("They already have a bounty of \u00A5" + new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:BountyPlayer") ? ((EditBox) guistate.get("text:BountyPlayer")).getValue() : ""))), false);
					}
				}
			}
		}
	}
}
