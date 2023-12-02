package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CursedSpiritManipulationMovesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput>0) {if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Summon "+)) {if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy>=50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10)) {entity.getPersistentData().putDouble(("cooldown"+new java.text.DecimalFormat("##.##").format(entity.getPersistentData().getDouble("coolset"))), 0);}else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy<50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10)) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You need "+new java.text.DecimalFormat("##.##").format(50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10))+" cursed energy to use this move.")), true);}{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Summon "+)) {if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy>=50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10)) {entity.getPersistentData().putDouble(("cooldown"+new java.text.DecimalFormat("##.##").format(entity.getPersistentData().getDouble("coolset"))), 0);}else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy<50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10)) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You need "+new java.text.DecimalFormat("##.##").format(50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10))+" cursed energy to use this move.")), true);}{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Summon "+)) {if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy>=50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10)) {entity.getPersistentData().putDouble(("cooldown"+new java.text.DecimalFormat("##.##").format(entity.getPersistentData().getDouble("coolset"))), 0);}else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy<50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10)) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You need "+new java.text.DecimalFormat("##.##").format(50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10))+" cursed energy to use this move.")), true);}{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Summon "+)) {if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy>=50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10)) {
Slot4CSMProcedureProcedure.execute(world,x,y,z,entity)
;
entity.getPersistentData().putDouble(("cooldown"+new java.text.DecimalFormat("##.##").format(entity.getPersistentData().getDouble("coolset"))), 0);}else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy<50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10)) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You need "+new java.text.DecimalFormat("##.##").format(50*((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10))+" cursed energy to use this move.")), true);}{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}}}
}
}
