package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InventoryCurseMobRightClickedOnEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7lEquipped Inventory Curse"), true);
	}
}
