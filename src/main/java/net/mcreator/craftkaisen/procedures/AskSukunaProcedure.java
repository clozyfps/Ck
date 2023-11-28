package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AskSukunaProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent.Submitted event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		execute(null, world, x, y, z, entity, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		double random = 0;
		if (text.contains("Sukuna Come Out")) {
			if (!entity.getPersistentData().getBoolean("sukunacooldown")) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.SUKUNA.get()) : false)) {
					random = Mth.nextInt(RandomSource.create(), 1, 2);
					if (random == 1) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7l\u00A74Why Should I?"), true);
						entity.getPersistentData().putBoolean("sukunacooldown", true);
					} else if (random == 2) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7l\u00A74Sure."), true);
						entity.getPersistentData().putBoolean("sukunacooldown", true);
						CallSukunaActivationProcedure.execute(world, x, y, z, entity);
					}
				} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.SUKUNA.get()) : false) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7l\u00A74Im Already Out."), true);
				}
			}
		} else if (text.contains("Sukuna Leave")) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.SUKUNA.get()) : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftKaisenModMobEffects.SUKUNA.get());
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7l\u00A74Sure."), true);
			}
		}
	}
}
