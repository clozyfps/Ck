
package net.mcreator.craftkaisen.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.craftkaisen.procedures.SukunaFingerPlayerFinishesUsingItemProcedure;
import net.mcreator.craftkaisen.init.CraftKaisenModTabs;

public class SukunaFingerItem extends Item {
	public SukunaFingerItem() {
		super(new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_ITEMS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 25;
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
