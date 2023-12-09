package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;
import net.mcreator.craftkaisen.entity.RikaEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RikaCopyHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity, event.getSource().getDirectEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		execute(null, entity, immediatesourceentity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		if (immediatesourceentity instanceof RikaEntity) {
			if (!((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof YutaOkkotsuEntity)) {
				if (entity instanceof Player || entity instanceof ServerPlayer) {
					if (!((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == null) && !((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == null)) {
						if (Math.random() < 0.5) {
							if ((((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new CraftKaisenModVariables.PlayerVariables())).ability1).equals("Copy")) {
								{
									String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability1;
									(immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ability1 = _setval;
										capability.syncPlayerVariables((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
									});
								}
								if ((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(
											Component.literal(("Copied Technique " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability1 + "To Slot 1!")),
											true);
							} else if ((((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new CraftKaisenModVariables.PlayerVariables())).ability2).equals("Copy")) {
								{
									String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability2;
									(immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ability2 = _setval;
										capability.syncPlayerVariables((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
									});
								}
								if ((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(
											Component.literal(("Copied Technique " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability2 + "To Slot 2!")),
											true);
							} else if ((((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new CraftKaisenModVariables.PlayerVariables())).ability3).equals("Copy")) {
								{
									String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability3;
									(immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ability3 = _setval;
										capability.syncPlayerVariables((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
									});
								}
								if ((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(
											Component.literal(("Copied Technique " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability3 + "To Slot 3!")),
											true);
							} else if ((((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new CraftKaisenModVariables.PlayerVariables())).ability4).equals("Copy")) {
								{
									String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability4;
									(immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ability4 = _setval;
										capability.syncPlayerVariables((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
									});
								}
								if ((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(
											Component.literal(("Copied Technique " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability4 + "To Slot 4!")),
											true);
							} else if ((((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new CraftKaisenModVariables.PlayerVariables())).ability5).equals("Copy")) {
								{
									String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5;
									(immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ability5 = _setval;
										capability.syncPlayerVariables((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
									});
								}
								if ((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(
											Component.literal(("Copied Technique " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5 + "To Slot 5!")),
											true);
							} else if ((((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new CraftKaisenModVariables.PlayerVariables())).ability6).equals("Copy")) {
								{
									String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability6;
									(immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ability6 = _setval;
										capability.syncPlayerVariables((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null));
									});
								}
								if ((immediatesourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(
											Component.literal(("Copied Technique " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability6 + "To Slot 6!")),
											true);
							}
						}
					}
				}
			}
		}
	}
}
