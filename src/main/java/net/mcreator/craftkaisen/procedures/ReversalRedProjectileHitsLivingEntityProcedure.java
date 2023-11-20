package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class ReversalRedProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		entity.setDeltaMovement(new Vec3(((immediatesourceentity.getX() + entity.getX()) / 6), ((immediatesourceentity.getY() + entity.getY()) / 6), ((immediatesourceentity.getZ() + entity.getZ()) / 6)));
	}
}
