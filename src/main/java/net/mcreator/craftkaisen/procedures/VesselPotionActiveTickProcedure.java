package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

import java.util.ArrayList;

public class VesselPotionActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity, double amplifier) {
		if (entity == null)
			return;
		if (amplifier == 0) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.VESSEL_POTION_EFFECT.get()) : false) && !(entity == entityiterator)) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
					{
						Entity _ent = entity;
						_ent.teleportTo((entityiterator.getX()), (entityiterator.getY() + 1), (entityiterator.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY() + 1), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
		} else if (amplifier == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 3, true, false));
		}
	}
}
