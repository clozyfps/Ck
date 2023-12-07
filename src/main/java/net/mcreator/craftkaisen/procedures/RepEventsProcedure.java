package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RepEventsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double y, double z, Entity entity) {
		execute(null, world, y, z, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).reputation<-50) {entity.getPersistentData().putDouble("repeventtimer", (entity.getPersistentData().getDouble("repeventtimer")-1));if (entity.getPersistentData().getDouble("repeventtimer")>=15000) {entity.getPersistentData().putDouble("repeventtimer", 0);entity.getPersistentData().putDouble("repevent", (Mth.nextInt(RandomSource.create(), 1, 6)));if (==false) {if (entity.getPersistentData().getDouble("repevent")==1) {
YutaAmbushProcedureProcedure.execute(world,y,z,entity)
;
}}}}
}
}
