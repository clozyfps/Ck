package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetMovesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Innate")) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Limitless")) {
				entity.getPersistentData().putDouble("maxMoves", 7);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Lapse Blue");
					entity.getPersistentData().putDouble("moveCost", 7);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Reversal Red");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Teleport");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Flight");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Hollow Purple");
					entity.getPersistentData().putDouble("moveCost", 25);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Infinity");
					entity.getPersistentData().putDouble("moveCost", 30);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
					entity.getPersistentData().putString("moveDisplay", "Unlimited Void");
					entity.getPersistentData().putDouble("moveCost", 50);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Cursed Speech")) {
				entity.getPersistentData().putDouble("maxMoves", 8);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Explode");
					entity.getPersistentData().putDouble("moveCost", 7);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Twist");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Crush");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Crumble Away");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Dont Move");
					entity.getPersistentData().putDouble("moveCost", 20);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Sleep");
					entity.getPersistentData().putDouble("moveCost", 25);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
					entity.getPersistentData().putString("moveDisplay", "Run Away");
					entity.getPersistentData().putDouble("moveCost", 30);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 8) {
					entity.getPersistentData().putString("moveDisplay", "Blast Away");
					entity.getPersistentData().putDouble("moveCost", 35);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Sukuna Vessel")) {
				entity.getPersistentData().putDouble("maxMoves", 5);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Dismantle");
					entity.getPersistentData().putDouble("moveCost", 7);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Cleave");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Constant Distmantle");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Fire Arrow");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Malevolent Shrine");
					entity.getPersistentData().putDouble("moveCost", 40);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Copy")) {
				entity.getPersistentData().putDouble("maxMoves", 5);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Summon Rika");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Release Rika");
					entity.getPersistentData().putDouble("moveCost", 2);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Copy");
					entity.getPersistentData().putDouble("moveCost", 12);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Pure Love");
					entity.getPersistentData().putDouble("moveCost", 25);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Blood Manipulation")) {
				entity.getPersistentData().putDouble("maxMoves", 6);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Piercing Blood");
					entity.getPersistentData().putDouble("moveCost", 7);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Slicing Excorsism");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Blood Edge");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Blood Meteorite");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Flowing Red Scale");
					entity.getPersistentData().putDouble("moveCost", 20);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Super Nova");
					entity.getPersistentData().putDouble("moveCost", 23);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Antigravity System")) {
				entity.getPersistentData().putDouble("maxMoves", 6);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Float");
					entity.getPersistentData().putDouble("moveCost", 3);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Anti Gravity Imbue");
					entity.getPersistentData().putDouble("moveCost", 8);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Anti Gravity Field");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Pressure");
					entity.getPersistentData().putDouble("moveCost", 17);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Pressure Imbue");
					entity.getPersistentData().putDouble("moveCost", 20);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Pressure Field");
					entity.getPersistentData().putDouble("moveCost", 25);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Ten Shadows")) {
				entity.getPersistentData().putDouble("maxMoves", 11);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Black Divine Dog");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "White Divine Dog");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Divine Dog Totality");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Toad");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Great Serpent");
					entity.getPersistentData().putDouble("moveCost", 21);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Maximum: Elephant");
					entity.getPersistentData().putDouble("moveCost", 26);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
					entity.getPersistentData().putString("moveDisplay", "Rabbit Escape");
					entity.getPersistentData().putDouble("moveCost", 20);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 8) {
					entity.getPersistentData().putString("moveDisplay", "Round Deer");
					entity.getPersistentData().putDouble("moveCost", 28);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 8) {
					entity.getPersistentData().putString("moveDisplay", "Piercing Ox");
					entity.getPersistentData().putDouble("moveCost", 28);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 9) {
					entity.getPersistentData().putString("moveDisplay", "Nue Totality");
					entity.getPersistentData().putDouble("moveCost", 35);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 10) {
					entity.getPersistentData().putString("moveDisplay", "Divine Mahoraga");
					entity.getPersistentData().putDouble("moveCost", 50);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 11) {
					entity.getPersistentData().putString("moveDisplay", "Chimera Shadow Garden");
					entity.getPersistentData().putDouble("moveCost", 40);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Disaster Flames")) {
				entity.getPersistentData().putDouble("maxMoves", 5);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Disaster Flames");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Ember Insects");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Volcanic Eruption");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Maximum: Meteor");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Coffin of the Iron Mountain");
					entity.getPersistentData().putDouble("moveCost", 35);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Disaster Plants")) {
				entity.getPersistentData().putDouble("maxMoves", 5);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Roots");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Flower Field");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Wooden Ball");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Cursed Bud");
					entity.getPersistentData().putDouble("moveCost", 18);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Flower Offering");
					entity.getPersistentData().putDouble("moveCost", 35);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Cursed Spirit Manipulation")) {
				entity.getPersistentData().putDouble("maxMoves", 6);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Return Curses");
					entity.getPersistentData().putDouble("moveCost", 0);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", ("Summon" + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM1));
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM2));
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM3));
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", ("Summon " + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CSM4));
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Maximum: Uzumaki");
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Idle Transfiguration")) {
				entity.getPersistentData().putDouble("maxMoves", 6);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Idle Transfiguration");
					entity.getPersistentData().putDouble("moveCost", 5);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
					entity.getPersistentData().putString("moveDisplay", "Soul Multiplicity");
					entity.getPersistentData().putDouble("moveCost", 10);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
					entity.getPersistentData().putString("moveDisplay", "Body Repel");
					entity.getPersistentData().putDouble("moveCost", 15);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
					entity.getPersistentData().putString("moveDisplay", "Polymorphic Soul Isomer");
					entity.getPersistentData().putDouble("moveCost", 25);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
					entity.getPersistentData().putString("moveDisplay", "Instant Spirit Body of Distorted Killing");
					entity.getPersistentData().putDouble("moveCost", 30);
				} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
					entity.getPersistentData().putString("moveDisplay", "Self-Embodiment of Perfection");
					entity.getPersistentData().putDouble("moveCost", 40);
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Boogie Woogie")) {
				entity.getPersistentData().putDouble("maxMoves", 1);
				if (entity.getPersistentData().getDouble("moveNumber") == 1) {
					entity.getPersistentData().putString("moveDisplay", "Clap");
					entity.getPersistentData().putDouble("moveCost", 7);
				}
			}
		} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Cursed Energy")) {
			CursedEnergySwitchProcedure.execute(entity);
		} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Page).equals("Melee")) {
			MeleeSwitchProcedure.execute(entity);
		}
	}
}
