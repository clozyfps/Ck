package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class ReversalRedProceduresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("redCharge") == false && entity.getPersistentData().getDouble("redDistance") == 0) {
			entity.getPersistentData().putBoolean("redCharge", true);
			entity.getPersistentData().putDouble("redTick", 0);
		}
	}
}
