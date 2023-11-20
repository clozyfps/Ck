package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class SlicingExcorismProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		world.levelEvent(2001, new BlockPos(entity.getX(), y, entity.getZ()), Block.getId(Blocks.RED_CONCRETE.defaultBlockState()));
	}
}
