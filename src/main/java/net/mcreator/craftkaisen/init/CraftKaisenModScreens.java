
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.craftkaisen.client.gui.StartScreenScreen;
import net.mcreator.craftkaisen.client.gui.MoveGuiScreen;
import net.mcreator.craftkaisen.client.gui.MainMenuScreen;
import net.mcreator.craftkaisen.client.gui.InventoryCurseGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftKaisenModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CraftKaisenModMenus.MOVE_GUI.get(), MoveGuiScreen::new);
			MenuScreens.register(CraftKaisenModMenus.START_SCREEN.get(), StartScreenScreen::new);
			MenuScreens.register(CraftKaisenModMenus.MAIN_MENU.get(), MainMenuScreen::new);
			MenuScreens.register(CraftKaisenModMenus.INVENTORY_CURSE_GUI.get(), InventoryCurseGuiScreen::new);
		});
	}
}
