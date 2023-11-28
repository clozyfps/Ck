
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.craftkaisen.network.ToggleCTSpecialMessage;
import net.mcreator.craftkaisen.network.OutputMessage;
import net.mcreator.craftkaisen.network.MenuMessage;
import net.mcreator.craftkaisen.network.EvadeMessage;
import net.mcreator.craftkaisen.network.ChargeCursedEnergyMessage;
import net.mcreator.craftkaisen.network.ArmorSpecialMessage;
import net.mcreator.craftkaisen.network.Ability6Message;
import net.mcreator.craftkaisen.network.Ability5Message;
import net.mcreator.craftkaisen.network.Ability4Message;
import net.mcreator.craftkaisen.network.Ability3Message;
import net.mcreator.craftkaisen.network.Ability2Message;
import net.mcreator.craftkaisen.network.Ability1Message;
import net.mcreator.craftkaisen.CraftKaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftKaisenModKeyMappings {
	public static final KeyMapping ABILITY_2 = new KeyMapping("key.craft_kaisen.ability_2", GLFW.GLFW_KEY_C, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new Ability2Message(0, 0));
				Ability2Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_1 = new KeyMapping("key.craft_kaisen.ability_1", GLFW.GLFW_KEY_X, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new Ability1Message(0, 0));
				Ability1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_3 = new KeyMapping("key.craft_kaisen.ability_3", GLFW.GLFW_KEY_V, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new Ability3Message(0, 0));
				Ability3Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_4 = new KeyMapping("key.craft_kaisen.ability_4", GLFW.GLFW_KEY_B, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new Ability4Message(0, 0));
				Ability4Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CHARGE_CURSED_ENERGY = new KeyMapping("key.craft_kaisen.charge_cursed_energy", GLFW.GLFW_KEY_Z, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new ChargeCursedEnergyMessage(0, 0));
				ChargeCursedEnergyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				CHARGE_CURSED_ENERGY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - CHARGE_CURSED_ENERGY_LASTPRESS);
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new ChargeCursedEnergyMessage(1, dt));
				ChargeCursedEnergyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_5 = new KeyMapping("key.craft_kaisen.ability_5", GLFW.GLFW_KEY_N, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new Ability5Message(0, 0));
				Ability5Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ABILITY_6 = new KeyMapping("key.craft_kaisen.ability_6", GLFW.GLFW_KEY_M, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new Ability6Message(0, 0));
				Ability6Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OUTPUT = new KeyMapping("key.craft_kaisen.output", GLFW.GLFW_KEY_R, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new OutputMessage(0, 0));
				OutputMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping MENU = new KeyMapping("key.craft_kaisen.menu", GLFW.GLFW_KEY_G, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new MenuMessage(0, 0));
				MenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TOGGLE_CT_SPECIAL = new KeyMapping("key.craft_kaisen.toggle_ct_special", GLFW.GLFW_KEY_J, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new ToggleCTSpecialMessage(0, 0));
				ToggleCTSpecialMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping EVADE = new KeyMapping("key.craft_kaisen.evade", GLFW.GLFW_KEY_F, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new EvadeMessage(0, 0));
				EvadeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping REVERSE_CURSED_TECHNIQUE = new KeyMapping("key.craft_kaisen.reverse_cursed_technique", GLFW.GLFW_KEY_H, "key.categories.craft_kaisen");
	public static final KeyMapping ARMOR_SPECIAL = new KeyMapping("key.craft_kaisen.armor_special", GLFW.GLFW_KEY_O, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new ArmorSpecialMessage(0, 0));
				ArmorSpecialMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long CHARGE_CURSED_ENERGY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ABILITY_2);
		event.register(ABILITY_1);
		event.register(ABILITY_3);
		event.register(ABILITY_4);
		event.register(CHARGE_CURSED_ENERGY);
		event.register(ABILITY_5);
		event.register(ABILITY_6);
		event.register(OUTPUT);
		event.register(MENU);
		event.register(TOGGLE_CT_SPECIAL);
		event.register(EVADE);
		event.register(REVERSE_CURSED_TECHNIQUE);
		event.register(ARMOR_SPECIAL);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ABILITY_2.consumeClick();
				ABILITY_1.consumeClick();
				ABILITY_3.consumeClick();
				ABILITY_4.consumeClick();
				CHARGE_CURSED_ENERGY.consumeClick();
				ABILITY_5.consumeClick();
				ABILITY_6.consumeClick();
				OUTPUT.consumeClick();
				MENU.consumeClick();
				TOGGLE_CT_SPECIAL.consumeClick();
				EVADE.consumeClick();
				ARMOR_SPECIAL.consumeClick();
			}
		}
	}
}
