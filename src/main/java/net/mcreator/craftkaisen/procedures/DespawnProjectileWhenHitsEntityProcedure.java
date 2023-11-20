package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class DespawnProjectileWhenHitsEntityProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level.isClientSide())
			immediatesourceentity.discard();
	}
}
