
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftKaisenModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> MAXIMUM_SUKUNA_VESSEL_PLAYERS = GameRules.register("maximumSukunaVesselPlayers", GameRules.Category.MISC, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.BooleanValue> FORCE_SUKUNA_TECHNIQUE = GameRules.register("forceSukunaTechnique", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SUKUNA_VESSEL_MODE = GameRules.register("sukunaVesselMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
}
