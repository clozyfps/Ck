package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class SetPlayerTwoProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftKaisenModVariables.MapVariables.get(world).vesselPlayerTwo = entity.getDisplayName().getString();
		CraftKaisenModVariables.MapVariables.get(world).syncData(world);
	}
}
