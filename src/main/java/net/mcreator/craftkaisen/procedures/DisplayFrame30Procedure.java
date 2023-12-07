package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class DisplayFrame30Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean v = false;
		if (entity.getPersistentData().getDouble("screen") == 30) {
			v = true;
		} else {
			v = false;
		}
		return v;
	}
}
