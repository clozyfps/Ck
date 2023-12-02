
package net.mcreator.craftkaisen.potion;

public class ZoneMobEffect extends MobEffect {

	public ZoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16724737);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.zone";
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

		});
	}
}
