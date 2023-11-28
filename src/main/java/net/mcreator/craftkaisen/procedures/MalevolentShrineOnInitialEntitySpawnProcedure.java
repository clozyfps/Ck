package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MalevolentShrineOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(MalevolentShrineEntity.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).isEmpty()) {
			if (!entity.level.isClientSide())
				entity.discard();
			(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().putBoolean("domain", false);
			(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getPersistentData().putBoolean("predomain", false);
		}
	}
}
