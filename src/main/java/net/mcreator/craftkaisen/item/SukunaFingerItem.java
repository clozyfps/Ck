
package net.mcreator.craftkaisen.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SukunaFingerItem extends Item {

	public SukunaFingerItem() {
		super(new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
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

		SukunaFingerPlayerFinishesUsingItemProcedure.execute();

		return retval;
	}

}
