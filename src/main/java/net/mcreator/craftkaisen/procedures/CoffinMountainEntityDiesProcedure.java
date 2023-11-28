package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CoffinMountainEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RemoveCoffinProcedure.execute(world, x, y, z);
	}
}
