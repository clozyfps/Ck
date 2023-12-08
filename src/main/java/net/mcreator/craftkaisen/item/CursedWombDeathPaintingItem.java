
package net.mcreator.craftkaisen.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.init.CraftKaisenModTabs;

import java.util.List;

public class CursedWombDeathPaintingItem extends Item {
	public CursedWombDeathPaintingItem() {
		super(new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7l\u00A75Special Grade Cursed Object: Death Painting"));
	}
}
