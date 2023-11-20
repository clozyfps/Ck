package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TimersProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("cooldown1") > 0) {
			entity.getPersistentData().putDouble("cooldown1", (entity.getPersistentData().getDouble("cooldown1") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown2") > 0) {
			entity.getPersistentData().putDouble("cooldown2", (entity.getPersistentData().getDouble("cooldown2") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown3") > 0) {
			entity.getPersistentData().putDouble("cooldown3", (entity.getPersistentData().getDouble("cooldown3") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown4") > 0) {
			entity.getPersistentData().putDouble("cooldown4", (entity.getPersistentData().getDouble("cooldown4") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown5") > 0) {
			entity.getPersistentData().putDouble("cooldown5", (entity.getPersistentData().getDouble("cooldown5") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown6") > 0) {
			entity.getPersistentData().putDouble("cooldown6", (entity.getPersistentData().getDouble("cooldown6") - 1));
		}
	}
}
