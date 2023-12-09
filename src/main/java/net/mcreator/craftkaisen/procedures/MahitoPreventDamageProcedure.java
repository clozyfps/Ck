package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MahitoPreventDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity, event.getSource().getDirectEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		execute(null, entity, immediatesourceentity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity immediatesourceentity, Entity sourceentity) {
		if (entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		if (entity instanceof MahitoEntity) {
			if (!(sourceentity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:deleted_mod_element"))).isDone())
					&& !(immediatesourceentity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
							&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:deleted_mod_element"))).isDone())
					&& sourceentity instanceof Player && sourceentity instanceof ServerPlayer && immediatesourceentity instanceof Player && immediatesourceentity instanceof ServerPlayer
					&& !((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftKaisenModItems.SPLIT_SOUL_KATANA.get()
							&& (immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftKaisenModItems.SPLIT_SOUL_KATANA.get())) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
