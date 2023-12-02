package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FlowerFieldHanamiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		int horizontalRadiusHemiTop = (int) 7 - 1;
		int verticalRadiusHemiTop = (int) 7;
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
						if (!((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR) && (world.getBlockState(new BlockPos(x + xi, y + i + 1, z + zi))).getBlock() == Blocks.AIR) {
							world.setBlock(new BlockPos(x + xi, y + i + 1, z + zi),
									(ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("craft_kaisen:flowers_disaster"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState(), 3);
							world.levelEvent(2001, new BlockPos(x + xi, y + i + 1, z + zi),
									Block.getId((ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("craft_kaisen:flowers_disaster"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR)).defaultBlockState()));
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entity == entityiterator)) {
										entityiterator.hurt((new EntityDamageSource("generic.player", entity)), 16);
									}
								}
							}
						}
					}
				}
			}
		}
		CraftKaisenMod.queueServerWork(100, () -> {
			FlowerFieldHanamiReplaceProcedure.execute(world, x, y, z, entity);
		});
	}
}
