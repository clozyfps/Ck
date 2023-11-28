package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CoffinMountainrReplaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		int horizontalRadiusHemiTop = (int) 29 - 1;
		int verticalRadiusHemiTop = (int) 29;
		int yIterationsHemiTop = verticalRadiusHemiTop;
		for (int i = 0; i < yIterationsHemiTop; i++) {
			if (i == verticalRadiusHemiTop) {
				continue;
			}
			for (int xi = -horizontalRadiusHemiTop; xi <= horizontalRadiusHemiTop; xi++) {
				for (int zi = -horizontalRadiusHemiTop; zi <= horizontalRadiusHemiTop; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop) + (i * i) / (double) (verticalRadiusHemiTop * verticalRadiusHemiTop)
							+ (zi * zi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop);
					if (distanceSq <= 1.0) {
						if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == CraftKaisenModBlocks.DOMAIN_BLOCK.get()) {
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				}
			}
		}
		int horizontalRadiusHemiBot = (int) 29 - 1;
		int verticalRadiusHemiBot = (int) 29;
		int yIterationsHemiBot = verticalRadiusHemiBot;
		for (int i = -yIterationsHemiBot; i <= 0; i++) {
			if (i == -verticalRadiusHemiBot) {
				continue;
			}
			for (int xi = -horizontalRadiusHemiBot; xi <= horizontalRadiusHemiBot; xi++) {
				for (int zi = -horizontalRadiusHemiBot; zi <= horizontalRadiusHemiBot; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiBot * horizontalRadiusHemiBot) + (i * i) / (double) (verticalRadiusHemiBot * verticalRadiusHemiBot)
							+ (zi * zi) / (double) (horizontalRadiusHemiBot * horizontalRadiusHemiBot);
					if (distanceSq <= 1.0) {
						if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == CraftKaisenModBlocks.DOMAIN_BLOCK.get()) {
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				}
			}
		}
	}
}
