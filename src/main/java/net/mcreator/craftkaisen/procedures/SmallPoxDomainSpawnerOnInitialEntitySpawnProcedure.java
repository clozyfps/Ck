package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SmallPoxDomainSpawnerOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "spforest2"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 10, y, z - 10), new BlockPos(x - 10, y, z - 10), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
			}
		}
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
