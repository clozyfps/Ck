package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class FlowingRedScaleProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("flowingredscale")) {
			entity.getPersistentData().putBoolean("flowingredscale", true);
		}
	}
}
