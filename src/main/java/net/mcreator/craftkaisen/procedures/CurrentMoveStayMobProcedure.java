package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

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
