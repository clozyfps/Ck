
package net.mcreator.craftkaisen.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;

import net.mcreator.craftkaisen.procedures.NueElectricityEffectOnEffectActiveTickProcedure;

import com.mojang.blaze3d.vertex.PoseStack;

public class NueElectricityEffectMobEffect extends MobEffect {
	public NueElectricityEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -4700706);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.nue_electricity_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		NueElectricityEffectOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, PoseStack poseStack, int x, int y, int blitOffset) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
