package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class WeaponSwitchProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxMoves", 4);
		if (entity.getPersistentData().getDouble("moveNumber") == 1) {
			entity.getPersistentData().putString("moveDisplay", "Quick Slice");
			entity.getPersistentData().putDouble("moveCost", 5);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
			entity.getPersistentData().putString("moveDisplay", "Rapid Slices");
			entity.getPersistentData().putDouble("moveCost", 10);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
			entity.getPersistentData().putString("moveDisplay", "Batto Sword Drawing");
			entity.getPersistentData().putDouble("moveCost", 13);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
			entity.getPersistentData().putString("moveDisplay", "Blade Counter");
			entity.getPersistentData().putDouble("moveCost", 15);
		}
	}
}
