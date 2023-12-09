package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnTargetOneProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String v = "";
		if ((entity.getPersistentData().getString("clapTargetOne")).isEmpty()) {
			v = "Target One : None";
		} else {
			v = "Target One : " + entity.getPersistentData().getString("clapTargetOne");
		}
		return v;
	}
}
