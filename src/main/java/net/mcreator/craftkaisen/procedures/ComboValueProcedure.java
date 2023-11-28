package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ComboValueProcedure {
	public static String execute() {
		return "Combo: " + new java.text.DecimalFormat("#").format();
	}
}
