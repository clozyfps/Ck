package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class ReturnHealthProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Health: " + new java.text.DecimalFormat("##.##").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).healthStat);
	}
}
