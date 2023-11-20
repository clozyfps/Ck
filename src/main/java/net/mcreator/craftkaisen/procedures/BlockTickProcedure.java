package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlockTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("preblock")) {
			entity.getPersistentData().putDouble("blocktick", (entity.getPersistentData().getDouble("blocktick") + 1));
			if (entity.getPersistentData().getDouble("blocktick") >= 10) {
				entity.getPersistentData().putDouble("blocktick", 0);
				entity.getPersistentData().putBoolean("blocktick", false);
			}
		}
		if (entity.getPersistentData().getBoolean("block")) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CRIT, x, y, z, 12, 0.5, 2, 0.5, 0);
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 6, false, false));
		}
		if (!entity.getPersistentData().getBoolean("block")) {
			if (entity.getPersistentData().getDouble("blockpoint") < 4) {
				entity.getPersistentData().putDouble("betweenblock", (entity.getPersistentData().getDouble("betweenblock") + 1));
				if (entity.getPersistentData().getDouble("betweenblock") >= 20) {
					entity.getPersistentData().putDouble("betweenblock", 0);
					entity.getPersistentData().putDouble("blockpoint", (entity.getPersistentData().getDouble("blockpoint") + 1));
				}
			}
		}
	}
}
