package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.init.CraftKaisenModItems;

public class BloodEdgeProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double randomblood = 0;
		if ((entity.getPersistentData().getString("bloodtype")).isEmpty()) {
			randomblood = Mth.nextInt(RandomSource.create(), 1, 3);
			if (randomblood == 1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(CraftKaisenModItems.BLOOD_BLADE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				entity.getPersistentData().putString("bloodtype", "Dagger");
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7c\u00A7l Created Dagger"), true);
			} else if (randomblood == 2) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(CraftKaisenModItems.BLOOD_SPEAR.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				entity.getPersistentData().putString("bloodtype", "Spear");
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7c\u00A7l Created Spear"), true);
			} else if (randomblood == 3) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(CraftKaisenModItems.BLOOD_AXE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				entity.getPersistentData().putString("bloodtype", "Axe");
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7c\u00A7l Created Axe"), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You already have a blood weapon"), false);
		}
	}
}
