package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class DomainClashUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).DomainClashCombo + 1;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.DomainClashCombo = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		entity.getPersistentData().putDouble("domainClashNum", (Mth.nextInt(RandomSource.create(), 1, 7)));
	}
}
