package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class BlockPointOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("block")) {
			return true;
		}
		return false;
	}
}
