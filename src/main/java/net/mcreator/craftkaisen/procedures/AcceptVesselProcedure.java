package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftKaisenModGameRules;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class AcceptVesselProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((CraftKaisenModVariables.MapVariables.get(world).vesselPlayerOne).equals(entity.getDisplayName().getString()) || (CraftKaisenModVariables.MapVariables.get(world).vesselPlayerTwo).equals(entity.getDisplayName().getString())) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if (!(entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString()) && entity.getPersistentData().getBoolean("bodyRequested")
							&& ((CraftKaisenModVariables.MapVariables.get(world).vesselPlayerOne).equals(entityiterator.getDisplayName().getString())
									|| (CraftKaisenModVariables.MapVariables.get(world).vesselPlayerTwo).equals(entityiterator.getDisplayName().getString()))) {
						entity.getPersistentData().putDouble("vesselX", (entity.getX()));
						entity.getPersistentData().putDouble("vesselY", (entity.getY()));
						entity.getPersistentData().putDouble("vesselZ", (entity.getZ()));
						if (!world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.FORCE_SUKUNA_TECHNIQUE)) {
							CraftKaisenModVariables.MapVariables.get(world).vesselTechnique = (entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique;
							CraftKaisenModVariables.MapVariables.get(world).syncData(world);
							{
								String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique;
								entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.technique = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
						} else {
							{
								String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique;
								entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.technique = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
						}
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("<" + entity.getDisplayName().getString() + "> Fine.")), false);
						entity.getPersistentData().putBoolean("prohibitUse", true);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.VESSEL_POTION_EFFECT.get(), (int) entity.getPersistentData().getDouble("controlTime"), 0, true, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.VESSEL_POTION_EFFECT.get(), (int) entity.getPersistentData().getDouble("controlTime"), 1, true, false));
					} else if ((entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString())) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Cannot request to use your own body!"), true);
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		}
	}
}
