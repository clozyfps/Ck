package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class FindBlueLocationProjectileHitsBlockProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("blueX", x);
		entity.getPersistentData().putDouble("blueY", y);
		entity.getPersistentData().putDouble("blueZ", z);
	}
}
