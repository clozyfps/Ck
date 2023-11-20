
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftkaisen.world.inventory.StartScreenMenu;
import net.mcreator.craftkaisen.world.inventory.MoveGuiMenu;
import net.mcreator.craftkaisen.world.inventory.MainMenuMenu;
import net.mcreator.craftkaisen.world.inventory.InventoryCurseGuiMenu;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftKaisenMod.MODID);
	public static final RegistryObject<MenuType<MoveGuiMenu>> MOVE_GUI = REGISTRY.register("move_gui", () -> IForgeMenuType.create(MoveGuiMenu::new));
	public static final RegistryObject<MenuType<StartScreenMenu>> START_SCREEN = REGISTRY.register("start_screen", () -> IForgeMenuType.create(StartScreenMenu::new));
	public static final RegistryObject<MenuType<MainMenuMenu>> MAIN_MENU = REGISTRY.register("main_menu", () -> IForgeMenuType.create(MainMenuMenu::new));
	public static final RegistryObject<MenuType<InventoryCurseGuiMenu>> INVENTORY_CURSE_GUI = REGISTRY.register("inventory_curse_gui", () -> IForgeMenuType.create(InventoryCurseGuiMenu::new));
}
