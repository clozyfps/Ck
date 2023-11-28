package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CoffinOfTheIronMountainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("domain")) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(35 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entity.getPersistentData().putBoolean("domain", true);
						entity.getPersistentData().putDouble("domainx", (entity.getX()));
						entity.getPersistentData().putDouble("domainy", (entity.getY()));
						entity.getPersistentData().putDouble("domainz", (entity.getZ()));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 30, 1, false, false));
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A76Domain Expansion: Coffin Of The Iron Mountain"), false);
						CraftKaisenMod.queueServerWork(20, () -> {
							int horizontalRadiusHemiTop = (int) 30 - 1;
							int verticalRadiusHemiTop = (int) 30;
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
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR
													|| (world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("craft_kaisen:tangible_block")))) {
												world.setBlock(new BlockPos(x + xi, y + i, z + zi), CraftKaisenModBlocks.BARRIER_BLOCK.get().defaultBlockState(), 3);
											}
										}
									}
								}
							}
							int horizontalRadiusHemiBot = (int) 30 - 1;
							int verticalRadiusHemiBot = (int) 30;
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
											if ((world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR
													|| (world.getBlockState(new BlockPos(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("craft_kaisen:tangible_block")))) {
												world.setBlock(new BlockPos(x + xi, y + i, z + zi), CraftKaisenModBlocks.BARRIER_BLOCK.get().defaultBlockState(), 3);
											}
										}
									}
								}
							}
							CoffinMountainrReplaceProcedure.execute(world, x, y, z);
						});
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new CoffinMountainEntity(CraftKaisenModEntities.COFFIN_MOUNTAIN.get(), _level);
							entityToSpawn.moveTo(x, y, z, 0, 0);
							entityToSpawn.setYBodyRot(0);
							entityToSpawn.setYHeadRot(0);
							entityToSpawn.setDeltaMovement(0, 0, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						CraftKaisenMod.queueServerWork(5, () -> {
							if (((Entity) world.getEntitiesOfClass(CoffinMountainEntity.class, AABB.ofSize(new Vec3(x, y, z), 5, 5, 5), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
								_toTame.tame(_owner);
							CoffinMountainSecondProcedure.execute(world, x, y, z);
							CoffinMountainReplaceMagmaProcedure.execute(world, x, y, z);
							CraftKaisenMod.queueServerWork(1, () -> {
								CoffinMakeGroundMagmaProcedure.execute(world, x, y, z);
							});
						});
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("domain")) {
			entity.getPersistentData().putBoolean("domain", false);
			RemoveCoffinProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
		}
	}
}
