package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class BlockKeyOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("block", false);
		entity.getPersistentData().putDouble("blocktick", 0);
	}
}
