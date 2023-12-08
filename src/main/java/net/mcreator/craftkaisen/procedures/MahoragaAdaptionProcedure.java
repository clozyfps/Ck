package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MahoragaAdaptionProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity, event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity) {
			entity.getPersistentData().putString("Adapting", (entity.getPersistentData().getString("Adapting") + " " + sourceentity.getPersistentData().getString("currentmoveactive")));
			entity.getPersistentData().putDouble("adaptingtimergoal", (Mth.nextInt(RandomSource.create(), 500, 1000)));
			if ((entity.getPersistentData().getString("Adapted")).contains(sourceentity.getPersistentData().getString("currentmoveactive"))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (sourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Mahoraga Adapted To This Already"), true);
			}
		}
	}
}
