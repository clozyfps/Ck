package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class ForwardbuttonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("moveNumber") < entity.getPersistentData().getDouble("maxMoves")) {
			entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("moveNumber") + 1));
		} else if (entity.getPersistentData().getDouble("moveNumber") >= entity.getPersistentData().getDouble("maxMoves")) {
			entity.getPersistentData().putDouble("moveNumber", 1);
		}
	}
}
