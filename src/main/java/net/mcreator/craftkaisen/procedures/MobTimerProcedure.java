package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MobTimerProcedure {
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
		if (entity.getPersistentData().getBoolean("release")) {
			if (entity.getPersistentData().getDouble("releasetimer") < 200) {
				entity.getPersistentData().putDouble("releasetimer", (entity.getPersistentData().getDouble("releasetimer") + 1));
			} else if (entity.getPersistentData().getDouble("releasetimer") >= 200) {
				entity.getPersistentData().putDouble("releasetimer", 0);
				entity.getPersistentData().putBoolean("release", false);
			}
		}
	}
}
