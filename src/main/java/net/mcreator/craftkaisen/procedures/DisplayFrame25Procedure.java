package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DisplayFrame25Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean v = false;
		if (entity.getPersistentData().getDouble("screen") == 25) {
			v = true;
		} else {
			v = false;
		}
		return v;
	}
}
