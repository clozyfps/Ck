package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SorcererFameTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {if (<5000) {}else if (>=5000&&<15000) {}else if (>=15000&&<40000) {}else if (>=40000&&<70000) {}else if (>=70000&&<120000) {}else if (>=120000&&<200000) {}else if (>=200000&&<300000) {}else if (>=300000&&<450000) {}}
}
}
