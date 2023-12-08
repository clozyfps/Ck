package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class PurpleProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("hollowPurple", 35);
	}
}
