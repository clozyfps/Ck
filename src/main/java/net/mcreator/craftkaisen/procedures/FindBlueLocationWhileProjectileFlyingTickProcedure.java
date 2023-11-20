package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class FindBlueLocationWhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
	}
}
