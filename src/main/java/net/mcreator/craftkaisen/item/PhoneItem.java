
package net.mcreator.craftkaisen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.craftkaisen.init.CraftKaisenModTabs;

public class PhoneItem extends Item {
	public PhoneItem() {
		super(new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_ITEMS).stacksTo(1).rarity(Rarity.COMMON));
	}
}
