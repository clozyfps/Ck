package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;
import net.mcreator.craftkaisen.entity.YujiItadoriEntity;
import net.mcreator.craftkaisen.entity.TojiFushiguroEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.entity.RugbyFieldCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RoppongiCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RikaEntity;
import net.mcreator.craftkaisen.entity.ResurrectedTojiEntity;
import net.mcreator.craftkaisen.entity.NanamiKentoEntity;
import net.mcreator.craftkaisen.entity.MouthCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.KoGuyEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.entity.HeianEraSukunaEntity;
import net.mcreator.craftkaisen.entity.HanamiEntity;
import net.mcreator.craftkaisen.entity.ChosoEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetEntityReputationsProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ChosoEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof HanamiEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof HeianEraSukunaEntity) {
			entity.getPersistentData().putDouble("rep", (-1000));
		}
		if (entity instanceof JogoEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof KoGuyEntity) {
			entity.getPersistentData().putDouble("rep", (-30));
		}
		if (entity instanceof MahitoEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof MouthCursedSpiritEntity) {
			entity.getPersistentData().putDouble("rep", (-10));
		}
		if (entity instanceof NanamiKentoEntity) {
			entity.getPersistentData().putDouble("rep", 100);
		}
		if (entity instanceof ResurrectedTojiEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof RikaEntity) {
			entity.getPersistentData().putDouble("rep", 100);
		}
		if (entity instanceof RoppongiCursedSpiritEntity) {
			entity.getPersistentData().putDouble("rep", (-20));
		}
		if (entity instanceof RugbyFieldCursedSpiritEntity) {
			entity.getPersistentData().putDouble("rep", (-20));
		}
		if (entity instanceof RyomenSukunaEntity) {
			entity.getPersistentData().putDouble("rep", (-500));
		}
		if (entity instanceof SatoruGojoEntity) {
			entity.getPersistentData().putDouble("rep", 500);
		}
		if (entity instanceof TojiFushiguroEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof YujiItadoriEntity) {
			entity.getPersistentData().putDouble("rep", 80);
		}
		if (entity instanceof YutaOkkotsuEntity) {
			entity.getPersistentData().putDouble("rep", 100);
		}
	}
}
