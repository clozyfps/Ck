
package net.mcreator.craftkaisen.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

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
