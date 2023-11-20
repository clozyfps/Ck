package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class BlockPointsProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("blockpoint")) + "";
	}
}
