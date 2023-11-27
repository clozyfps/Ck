package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CoffinMountainEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RemoveCoffinProcedure.execute(world, x, y, z);
	}
}
