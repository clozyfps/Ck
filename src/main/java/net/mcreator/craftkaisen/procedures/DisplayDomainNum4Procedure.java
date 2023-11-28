package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class DisplayDomainNum4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean v = false;
		if (entity.getPersistentData().getDouble("domainClashNum") == 4) {
			v = true;
		} else {
			v = false;
		}
		return v;
	}
}
