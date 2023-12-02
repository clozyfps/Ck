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
		if (!((entity.getDisplayName().getString()).equals("MyNameIsName1213") || (entity.getDisplayName().getString()).equals("vampricboss") || (entity.getDisplayName().getString()).equals("clozy_3")
				|| (entity.getDisplayName().getString()).equals("Dev") || (entity.getDisplayName().getString()).equals("guiiws") || (entity.getDisplayName().getString()).equals("rubymoon6") || (entity.getDisplayName().getString()).equals("AraSARTR")
				|| (entity.getDisplayName().getString()).equals("DonquixoteSteel") || (entity.getDisplayName().getString()).equals("notpatientthe") || (entity.getDisplayName().getString()).equals("Marylotl")
				|| (entity.getDisplayName().getString()).equals("Zamp_zap132") || (entity.getDisplayName().getString()).equals("minicrafter0810") || (entity.getDisplayName().getString()).equals("Blackdyn0mite26")
				|| (entity.getDisplayName().getString()).equals("Dev") || (entity.getDisplayName().getString()).equals("GaloHumano") || (entity.getDisplayName().getString()).equals("clozy_3")
				|| (entity.getDisplayName().getString()).equals("Void_Asriel") || (entity.getDisplayName().getString()).equals("Bode97") || (entity.getDisplayName().getString()).equals("ShadowSideX2")
				|| (entity.getDisplayName().getString()).equals("enzyo112") || (entity.getDisplayName().getString()).equals("Tremolicious") || (entity.getDisplayName().getString()).equals("POKE_theboxcats")
				|| (entity.getDisplayName().getString()).equals("_foily") || (entity.getDisplayName().getString()).equals("RealPancakes3") || (entity.getDisplayName().getString()).equals("Marylotl")
				|| (entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("RedRabbitPlayz") || (entity.getDisplayName().getString()).equals("Ninjamaster1052")
				|| (entity.getDisplayName().getString()).equals("NortherrorZaGod") || (entity.getDisplayName().getString()).equals("DevilWhoDares") || (entity.getDisplayName().getString()).equals("CatProtector24")
				|| (entity.getDisplayName().getString()).equals("Shadow843671") || (entity.getDisplayName().getString()).equals("Blackdyn0nite26") || (entity.getDisplayName().getString()).equals("vampricboss")
				|| (entity.getDisplayName().getString()).equals("DonquixoteSteel") || (entity.getDisplayName().getString()).equals("babiedes26") || (entity.getDisplayName().getString()).equals("MrSkalter")
				|| (entity.getDisplayName().getString()).equals("Ditto_Guy") || (entity.getDisplayName().getString()).equals("bruh") || (entity.getDisplayName().getString()).equals("Mindlesshas234")
				|| (entity.getDisplayName().getString()).equals("Ducky_Ben") || (entity.getDisplayName().getString()).equals("ShadowStar4343") || (entity.getDisplayName().getString()).equals("Mr_MonkeStrong")
				|| (entity.getDisplayName().getString()).equals("ZarekX2") || (entity.getDisplayName().getString()).equals("Tiaayo") || (entity.getDisplayName().getString()).equals("notpatientthe")
				|| (entity.getDisplayName().getString()).equals("Marylotl") || (entity.getDisplayName().getString()).equals("bode97") || (entity.getDisplayName().getString()).equals("minicrafter0810")
				|| (entity.getDisplayName().getString()).equals("KashenGames") || (entity.getDisplayName().getString()).equals("HZD_Hybrid") || (entity.getDisplayName().getString()).equals("TheRealDemonKing")
				|| (entity.getDisplayName().getString()).equals("CreepyDisc68031") || (entity.getDisplayName().getString()).equals("Azj12365") || (entity.getDisplayName().getString()).equals("Void_Asriel")
				|| (entity.getDisplayName().getString()).equals("NoNameIsMyName") || (entity.getDisplayName().getString()).equals("Seiji5961") || (entity.getDisplayName().getString()).equals("stewyRobin75588")
				|| (entity.getDisplayName().getString()).equals("4NIlx") || (entity.getDisplayName().getString()).equals(" ProCombatCarl") || (entity.getDisplayName().getString()).equals("InfiniteGF")
				|| (entity.getDisplayName().getString()).equals("saika71") || (entity.getDisplayName().getString()).equals("FireGolems") || (entity.getDisplayName().getString()).equals("ActuallyFrogdog")
				|| (entity.getDisplayName().getString()).equals("KrakensOrphan") || (entity.getDisplayName().getString()).equals("Ferdex") || (entity.getDisplayName().getString()).equals("AraSARTR")
				|| (entity.getDisplayName().getString()).equals("HZDHybrid") || (entity.getDisplayName().getString()).equals("Yvorxe") || (entity.getDisplayName().getString()).equals("Welcsz") || (entity.getDisplayName().getString()).equals("guiiws")
				|| (entity.getDisplayName().getString()).equals("Seiji5961") || (entity.getDisplayName().getString()).equals("NortherrorZaGod") || (entity.getDisplayName().getString()).equals("RamenTaken")
				|| (entity.getDisplayName().getString()).equals("JTFire2320") || (entity.getDisplayName().getString()).equals("Theadesy") || (entity.getDisplayName().getString()).equals("LocalSnake_")
				|| (entity.getDisplayName().getString()).equals("Rai0n_") || (entity.getDisplayName().getString()).equals("MyNameIsName1213"))) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1000, Explosion.BlockInteraction.DESTROY);
			entity.setDeltaMovement(new Vec3(0, 1e+73, 0));
		}
	}
}
