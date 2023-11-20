package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class ImpactFrameDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("screen") > 0) {
			return true;
		}
		return false;
	}
}
