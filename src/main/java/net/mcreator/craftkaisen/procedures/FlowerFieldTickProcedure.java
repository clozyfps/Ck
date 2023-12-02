package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FlowerFieldTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("ff")) {
			entity.getPersistentData().putDouble("ffcooldown", (entity.getPersistentData().getDouble("ffcooldown") + 1));
			if (entity.getPersistentData().getDouble("ffcooldown") >= 200) {
				entity.getPersistentData().putDouble("ffcooldown", 0);
				entity.getPersistentData().putBoolean("ff", false);
				entity.getPersistentData().putDouble("ffx", 0);
				entity.getPersistentData().putDouble("ffy", 0);
				entity.getPersistentData().putDouble("ffz", 0);
				int horizontalRadiusSphere = (int) 12 - 1;
				int verticalRadiusSphere = (int) 12 - 1;
				int yIterationsSphere = verticalRadiusSphere;
				for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
					for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
						for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
							double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
									+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
							if (distanceSq <= 1.0) {
								if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("craft_kaisen:flowers_disaster")))) {
									world.destroyBlock(new BlockPos(x + xi, y + i, z + zi), false);
								}
							}
						}
					}
				}
			}
		}
	}
}
