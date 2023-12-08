package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VillagerCurseTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Villager) {
			if (entity.getPersistentData().getDouble("villagermood") <= -1) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 25, 3, 2, 3, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 25, 3, 2, 3, 0);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vex.charge")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vex.charge")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				entity.getPersistentData().putDouble("villagermood", 1);
				entity.getPersistentData().putDouble("villagerandom", (Mth.nextInt(RandomSource.create(), 1, 3)));
				if (entity.getPersistentData().getDouble("villagerandom") == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MouthCursedSpiritEntity(CraftKaisenModEntities.MOUTH_CURSED_SPIRIT.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (entity.getPersistentData().getDouble("villagerandom") == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RugbyFieldCursedSpiritEntity(CraftKaisenModEntities.RUGBY_FIELD_CURSED_SPIRIT.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (entity.getPersistentData().getDouble("villagerandom") == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RoppongiCursedSpiritEntity(CraftKaisenModEntities.ROPPONGI_CURSED_SPIRIT.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			} else if (entity.getPersistentData().getDouble("villagermood") > -1) {
				if (world.getMaxLocalRawBrightness(new BlockPos(x, y + 1, z)) < 10) {
					entity.getPersistentData().putDouble("villagermood", (entity.getPersistentData().getDouble("villagermood") - 0.03));
				}
				if (!world.getEntitiesOfClass(Monster.class, AABB.ofSize(new Vec3(x, y, z), 25, 25, 25), e -> true).isEmpty()) {
					entity.getPersistentData().putDouble("villagermood", (entity.getPersistentData().getDouble("villagermood") - 0.03));
				}
			}
		}
	}
}
