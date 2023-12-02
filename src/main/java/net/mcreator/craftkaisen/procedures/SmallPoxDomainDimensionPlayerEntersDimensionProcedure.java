package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SmallPoxDomainDimensionPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double v = 0;
		{
			Entity _ent = entity;
			_ent.teleportTo((world.getLevelData().getXSpawn()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, world.getLevelData().getXSpawn(), world.getLevelData().getZSpawn())), (world.getLevelData().getZSpawn()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((world.getLevelData().getXSpawn()), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, world.getLevelData().getXSpawn(), world.getLevelData().getZSpawn())),
						(world.getLevelData().getZSpawn()), _ent.getYRot(), _ent.getXRot());
		}
		CraftKaisenMod.queueServerWork(30, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new SmallPoxDomainSpawnerEntity(CraftKaisenModEntities.SMALL_POX_DOMAIN_SPAWNER.get(), _level);
				entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		});
	}
}
