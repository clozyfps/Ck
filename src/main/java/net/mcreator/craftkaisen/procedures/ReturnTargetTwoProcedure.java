package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReturnTargetTwoProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String v = "";
		if ((entity.getPersistentData().getString("clapTargetTwo")).isEmpty()) {
			v = "Target Two : None";
		} else {
			v = "Target Two : " + entity.getPersistentData().getString("clapTargetTwo");
		}
		return v;
	}
}
