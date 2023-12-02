package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CurrentMoveStayProcedure {
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
		if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).isEmpty()) {
			entity.getPersistentData().putString("currentmoveactive", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove));
		}
		if (!(entity.getPersistentData().getString("currentmoveactive")).isEmpty()) {
			entity.getPersistentData().putDouble("moveactivetimer", (entity.getPersistentData().getDouble("moveactivetimer") + 1));
			if (entity.getPersistentData().getDouble("moveactivetimer") >= 35) {
				entity.getPersistentData().putDouble("moveactivetimer", 0);
				entity.getPersistentData().putString("currentmoveactive", "");
			}
		}
	}
}
