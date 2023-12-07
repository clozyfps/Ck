package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;
import net.mcreator.craftkaisen.entity.RikaEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class YutaSummonRikaProcedure {
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
		if (entity instanceof YutaOkkotsuEntity) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if (Math.random() < 0.007) {
					if (entity.getPersistentData().getBoolean("prerika")) {
						entity.getPersistentData().putBoolean("prerika", false);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new RikaEntity(CraftKaisenModEntities.RIKA.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Yuta: come, rika."), false);
						CraftKaisenMod.queueServerWork(10, () -> {
							if (((Entity) world.getEntitiesOfClass(RikaEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
								_toTame.tame(_owner);
						});
					}
					if (!entity.getPersistentData().getBoolean("prerika")) {
						if (Math.random() < 0.001) {
							entity.getPersistentData().putBoolean("release", true);
						}
					}
				}
			}
		}
	}
}
