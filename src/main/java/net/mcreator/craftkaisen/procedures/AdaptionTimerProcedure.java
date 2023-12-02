package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AdaptionTimerProcedure {
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
		if (entity.getPersistentData().getDouble("adaptingtimergoal") > 0) {
			if (entity.getPersistentData().getDouble("adaptingtimer") >= entity.getPersistentData().getDouble("adaptingtimergoal")) {
				entity.getPersistentData().putDouble("adaptingtimer", 0);
				entity.getPersistentData().putDouble("adaptingtimergoal", 0);
				entity.getPersistentData().putString("Adapted", (entity.getPersistentData().getString("Adapting")));
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7lMahoraga Adapted in" + "\u00A7" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("adaptingtimergoal") / 20) + " Seconds")), false);
					}
				}
			} else if (entity.getPersistentData().getDouble("adaptingtimer") < entity.getPersistentData().getDouble("adaptingtimergoal")) {
				entity.getPersistentData().putDouble("adaptingtimer", (entity.getPersistentData().getDouble("adaptingtimer") + 1));
			}
		}
	}
}
