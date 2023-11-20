package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class SleepOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("sleep")) {
			return true;
		}
		return false;
	}
}
