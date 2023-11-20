package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class FindBlueLocationProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("blueX", (entity.getX()));
		entity.getPersistentData().putDouble("blueY", (entity.getY()));
		entity.getPersistentData().putDouble("blueZ", (entity.getZ()));
	}
}
