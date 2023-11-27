package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PreDomainTimerProcedure {
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
		if (!entity.getPersistentData().getBoolean("domain") && entity.getPersistentData().getBoolean("predomain")) {
			entity.getPersistentData().putDouble("predomaintimer", (entity.getPersistentData().getDouble("predomaintimer") + 1));
			if (entity.getPersistentData().getDouble("predomaintimer") >= 40) {
				entity.getPersistentData().putBoolean("predomain", false);
			}
		}
	}
}
