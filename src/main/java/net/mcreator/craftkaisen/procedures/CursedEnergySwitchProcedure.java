package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class CursedEnergySwitchProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxMoves", 6);
		if (entity.getPersistentData().getDouble("moveNumber") == 1) {
			entity.getPersistentData().putString("moveDisplay", "Divergent Fists");
			entity.getPersistentData().putDouble("moveCost", 5);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
			entity.getPersistentData().putString("moveDisplay", "Cursed Energy Imbue");
			entity.getPersistentData().putDouble("moveCost", 10);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
			entity.getPersistentData().putString("moveDisplay", "Simple Domain");
			entity.getPersistentData().putDouble("moveCost", 20);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
			entity.getPersistentData().putString("moveDisplay", "Curtain");
			entity.getPersistentData().putDouble("moveCost", 20);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
			entity.getPersistentData().putString("moveDisplay", "Falling Blossom Emotion");
			entity.getPersistentData().putDouble("moveCost", 30);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
			entity.getPersistentData().putString("moveDisplay", "Domain Amplification");
			entity.getPersistentData().putDouble("moveCost", 35);
		}
	}
}
