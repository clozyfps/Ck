package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhitelistProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getDisplayName().getString()).equals("MyNameIsName3134") || (entity.getDisplayName().getString()).equals("vampricboss") || (entity.getDisplayName().getString()).equals("clozy_3")
				|| (entity.getDisplayName().getString()).equals("Dev") || (entity.getDisplayName().getString()).equals("guiiws") || (entity.getDisplayName().getString()).equals("rubymoon6") || (entity.getDisplayName().getString()).equals("AraSARTR")
				|| (entity.getDisplayName().getString()).equals("DonquixoteSteel") || (entity.getDisplayName().getString()).equals("notpatientthe") || (entity.getDisplayName().getString()).equals("Marylotl")
				|| (entity.getDisplayName().getString()).equals("Zamp_zap132") || (entity.getDisplayName().getString()).equals("minicrafter0810") || (entity.getDisplayName().getString()).equals("Blackdyn0mite26")
				|| (entity.getDisplayName().getString()).equals("Ditto_Guy"))) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1000, Explosion.BlockInteraction.DESTROY);
			entity.setDeltaMovement(new Vec3(0, 1e+73, 0));
		}
	}
}
