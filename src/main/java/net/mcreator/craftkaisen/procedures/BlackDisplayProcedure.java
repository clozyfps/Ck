package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class BlackDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("screen") == 2) {
			return true;
		}
		return false;
	}
}
