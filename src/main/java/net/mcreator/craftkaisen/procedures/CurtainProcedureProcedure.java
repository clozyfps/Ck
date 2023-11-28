package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CurtainProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("veil")) {
			entity.getPersistentData().putBoolean("veil", true);
			entity.getPersistentData().putDouble("veilx", (entity.getX()));
			entity.getPersistentData().putDouble("veily", (entity.getY()));
			entity.getPersistentData().putDouble("veilz", (entity.getZ()));
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput <= 60) {
				int horizontalRadiusHemiTop = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput) - 1;
				int verticalRadiusHemiTop = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput);
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
								if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR) {
									world.setBlock(new BlockPos(x + xi, y + i, z + zi), CraftKaisenModBlocks.BARRIER_BLOCK.get().defaultBlockState(), 3);
								}
							}
						}
					}
				}
				int horizontalRadiusHemiBot = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput) - 1;
				int verticalRadiusHemiBot = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput);
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
								if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
									world.setBlock(new BlockPos(x + xi, y + i, z + zi), CraftKaisenModBlocks.BARRIER_BLOCK.get().defaultBlockState(), 3);
								}
							}
						}
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput > 60) {
				int horizontalRadiusHemiTop = (int) 50 - 1;
				int verticalRadiusHemiTop = (int) 50;
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
								if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
									world.setBlock(new BlockPos(x + xi, y + i, z + zi), CraftKaisenModBlocks.BARRIER_BLOCK.get().defaultBlockState(), 3);
								}
							}
						}
					}
				}
				int horizontalRadiusHemiBot = (int) 50 - 1;
				int verticalRadiusHemiBot = (int) 50;
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
								if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
									world.setBlock(new BlockPos(x + xi, y + i, z + zi), CraftKaisenModBlocks.BARRIER_BLOCK.get().defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("veil")) {
			entity.getPersistentData().putBoolean("veil", false);
			int horizontalRadiusSphere = (int) 50 - 1;
			int verticalRadiusSphere = (int) 50 - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == CraftKaisenModBlocks.BARRIER_BLOCK.get()) {
								world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							}
						}
					}
				}
			}
		}
	}
}
