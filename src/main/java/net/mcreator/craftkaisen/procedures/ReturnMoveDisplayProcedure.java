package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnMoveDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getPersistentData().getString("moveDisplay");
	}
}
