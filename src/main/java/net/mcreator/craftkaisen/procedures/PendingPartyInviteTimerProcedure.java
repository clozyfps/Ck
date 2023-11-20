package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PendingPartyInviteTimerProcedure {
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
		if (entity.getPersistentData().getBoolean("pending")) {
			if (entity.getPersistentData().getDouble("pendingtimer") < 1500) {
				entity.getPersistentData().putDouble("pendingtimer", (entity.getPersistentData().getDouble("pendingtimer") + 1));
			} else if (entity.getPersistentData().getDouble("pendingtimer") >= 1500) {
				entity.getPersistentData().putDouble("pendingtimer", 0);
				entity.getPersistentData().putBoolean("pending", false);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Party Invite Expired."), false);
			}
		}
		if (entity.getPersistentData().getBoolean("pendingtp")) {
			if (entity.getPersistentData().getDouble("tptimer") < 1500) {
				entity.getPersistentData().putDouble("tptimer", (entity.getPersistentData().getDouble("tptimer") + 1));
			} else if (entity.getPersistentData().getDouble("tptimer") >= 1500) {
				entity.getPersistentData().putDouble("tptimer", 0);
				entity.getPersistentData().putBoolean("pendingtp", false);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Tp Invite Expired."), false);
			}
		}
		if (entity.getPersistentData().getBoolean("gojopending")) {
			if (entity.getPersistentData().getDouble("gojopending") < 1500) {
				entity.getPersistentData().putDouble("gojopending", (entity.getPersistentData().getDouble("gojopending") + 1));
			} else if (entity.getPersistentData().getDouble("gojopending") >= 1500) {
				entity.getPersistentData().putDouble("gojopending", 0);
				entity.getPersistentData().putBoolean("gojopending", false);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You never responded to Gojo!"), false);
			}
		}
	}
}
