
package net.mcreator.craftkaisen.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.procedures.SukunaFingerPlayerFinishesUsingItemProcedure;
import net.mcreator.craftkaisen.init.CraftKaisenModTabs;

import java.util.List;

public class SukunaFingerItem extends Item {
	public SukunaFingerItem() {
		super(new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_ITEMS).stacksTo(20).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 25;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7l\u00A75Special Grade Cursed Object: Finger"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SukunaFingerPlayerFinishesUsingItemProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}
