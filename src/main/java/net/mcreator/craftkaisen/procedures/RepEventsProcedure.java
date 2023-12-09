package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

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

	private static void execute(@Nullable Event event, LevelAccessor world, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).reputation < -50) {
			entity.getPersistentData().putDouble("repeventtimer", (entity.getPersistentData().getDouble("repeventtimer") - 1));
			if (entity.getPersistentData().getDouble("repeventtimer") >= 15000) {
				entity.getPersistentData().putDouble("repeventtimer", 0);
				entity.getPersistentData().putDouble("repevent", (Mth.nextInt(RandomSource.create(), 1, 6)));
				if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).YutaEventHappened == false) {
					if (entity.getPersistentData().getDouble("repevent") == 1) {
						YutaAmbushProcedureProcedure.execute(world, y, z, entity);
						{
							boolean _setval = true;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.YutaEventHappened = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
	}
}
