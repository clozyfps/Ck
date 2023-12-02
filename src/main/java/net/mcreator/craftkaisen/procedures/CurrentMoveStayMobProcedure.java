package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CurrentMoveStayMobProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player || entity instanceof ServerPlayer)) {
			if (!(entity.getPersistentData().getString("currentmoveactive")).isEmpty()) {
				entity.getPersistentData().putDouble("moveactivetimer", (entity.getPersistentData().getDouble("moveactivetimer") + 1));
				if (entity.getPersistentData().getDouble("moveactivetimer") >= 35) {
					entity.getPersistentData().putDouble("moveactivetimer", 0);
					entity.getPersistentData().putString("currentmoveactive", "");
				}
			}
		}
	}
}
