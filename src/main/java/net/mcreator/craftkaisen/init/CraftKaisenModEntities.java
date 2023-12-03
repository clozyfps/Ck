
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.entity.YutaOkkotsuEntity;
import net.mcreator.craftkaisen.entity.YujiItadoriEntity;
import net.mcreator.craftkaisen.entity.WoodenBoxEntity;
import net.mcreator.craftkaisen.entity.WhiteDivineDogEntity;
import net.mcreator.craftkaisen.entity.WaterMaximumElephantEntity;
import net.mcreator.craftkaisen.entity.VolcanicEruptionEntity;
import net.mcreator.craftkaisen.entity.UnlimitedVoidMobEntity;
import net.mcreator.craftkaisen.entity.TwistRangedEntity;
import net.mcreator.craftkaisen.entity.TojiFushiguroEntity;
import net.mcreator.craftkaisen.entity.ToadEntity;
import net.mcreator.craftkaisen.entity.TenShadowRabbitEntity;
import net.mcreator.craftkaisen.entity.StronghitEntity;
import net.mcreator.craftkaisen.entity.SmallPoxDomainSpawnerEntity;
import net.mcreator.craftkaisen.entity.SmallPoxDeityEntity;
import net.mcreator.craftkaisen.entity.SlicingExcorismEntity;
import net.mcreator.craftkaisen.entity.SleepRangedEntity;
import net.mcreator.craftkaisen.entity.ShadowFrogEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.entity.RunAwayRangedEntity;
import net.mcreator.craftkaisen.entity.RugbyFieldCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RoundDeerEntity;
import net.mcreator.craftkaisen.entity.RoppongiCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.RootProjectileEntity;
import net.mcreator.craftkaisen.entity.RikaEntity;
import net.mcreator.craftkaisen.entity.ReversalRedProjectileEntity;
import net.mcreator.craftkaisen.entity.ReversalRedEntityEntity;
import net.mcreator.craftkaisen.entity.ReversalRedEntity;
import net.mcreator.craftkaisen.entity.ResurrectedTojiEntity;
import net.mcreator.craftkaisen.entity.RainbowDragonEntity;
import net.mcreator.craftkaisen.entity.PureLoveBeamRangedEntity;
import net.mcreator.craftkaisen.entity.PoxDeityDomainEntity;
import net.mcreator.craftkaisen.entity.NueEntity;
import net.mcreator.craftkaisen.entity.NobaraKugisakiEntity;
import net.mcreator.craftkaisen.entity.NanamiKentoEntity;
import net.mcreator.craftkaisen.entity.NailProjectileEntity;
import net.mcreator.craftkaisen.entity.MouthCursedSpiritEntity;
import net.mcreator.craftkaisen.entity.MaximumElephantEntity;
import net.mcreator.craftkaisen.entity.MaxMeteorEntity;
import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;
import net.mcreator.craftkaisen.entity.MahitoEntity;
import net.mcreator.craftkaisen.entity.KoGuyEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.entity.InventoryCurseMobEntity;
import net.mcreator.craftkaisen.entity.HollowPurpleProjectileEntity;
import net.mcreator.craftkaisen.entity.HeianEraSukunaEntity;
import net.mcreator.craftkaisen.entity.HanamiEntity;
import net.mcreator.craftkaisen.entity.GreatSerpentEntity;
import net.mcreator.craftkaisen.entity.FlowerProjectileEntity;
import net.mcreator.craftkaisen.entity.FireArrowMobEntity;
import net.mcreator.craftkaisen.entity.FireArrowEntity;
import net.mcreator.craftkaisen.entity.FingerBearerEntity;
import net.mcreator.craftkaisen.entity.FindBlueLocationEntity;
import net.mcreator.craftkaisen.entity.ExplodeRangedEntity;
import net.mcreator.craftkaisen.entity.EmberInsectProjectileEntity;
import net.mcreator.craftkaisen.entity.EmberInsectEntity;
import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;
import net.mcreator.craftkaisen.entity.DontMoveRangedEntity;
import net.mcreator.craftkaisen.entity.DismantleEntity;
import net.mcreator.craftkaisen.entity.DisasterFlameRangedEntity;
import net.mcreator.craftkaisen.entity.CrushedRangedEntity;
import net.mcreator.craftkaisen.entity.CrumbleAwayRangedEntity;
import net.mcreator.craftkaisen.entity.CoffinMountainEntity;
import net.mcreator.craftkaisen.entity.ChosoEntity;
import net.mcreator.craftkaisen.entity.ChimeraShadowGardenMobEntity;
import net.mcreator.craftkaisen.entity.BloodMeteoriteEntity;
import net.mcreator.craftkaisen.entity.BlastAwayRangedEntity;
import net.mcreator.craftkaisen.entity.BlackMucusEntity;
import net.mcreator.craftkaisen.entity.BlackDivineDogEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftKaisenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CraftKaisenMod.MODID);
	public static final RegistryObject<EntityType<ReversalRedEntityEntity>> REVERSAL_RED_ENTITY = register("reversal_red_entity", EntityType.Builder.<ReversalRedEntityEntity>of(ReversalRedEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReversalRedEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReversalRedProjectileEntity>> REVERSAL_RED_PROJECTILE = register("projectile_reversal_red_projectile",
			EntityType.Builder.<ReversalRedProjectileEntity>of(ReversalRedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ReversalRedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SatoruGojoEntity>> SATORU_GOJO = register("satoru_gojo",
			EntityType.Builder.<SatoruGojoEntity>of(SatoruGojoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SatoruGojoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExplodeRangedEntity>> EXPLODE_RANGED = register("projectile_explode_ranged",
			EntityType.Builder.<ExplodeRangedEntity>of(ExplodeRangedEntity::new, MobCategory.MISC).setCustomClientFactory(ExplodeRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TwistRangedEntity>> TWIST_RANGED = register("projectile_twist_ranged",
			EntityType.Builder.<TwistRangedEntity>of(TwistRangedEntity::new, MobCategory.MISC).setCustomClientFactory(TwistRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrushedRangedEntity>> CRUSHED_RANGED = register("projectile_crushed_ranged",
			EntityType.Builder.<CrushedRangedEntity>of(CrushedRangedEntity::new, MobCategory.MISC).setCustomClientFactory(CrushedRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrumbleAwayRangedEntity>> CRUMBLE_AWAY_RANGED = register("projectile_crumble_away_ranged", EntityType.Builder.<CrumbleAwayRangedEntity>of(CrumbleAwayRangedEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CrumbleAwayRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DontMoveRangedEntity>> DONT_MOVE_RANGED = register("projectile_dont_move_ranged",
			EntityType.Builder.<DontMoveRangedEntity>of(DontMoveRangedEntity::new, MobCategory.MISC).setCustomClientFactory(DontMoveRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SleepRangedEntity>> SLEEP_RANGED = register("projectile_sleep_ranged",
			EntityType.Builder.<SleepRangedEntity>of(SleepRangedEntity::new, MobCategory.MISC).setCustomClientFactory(SleepRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RunAwayRangedEntity>> RUN_AWAY_RANGED = register("projectile_run_away_ranged",
			EntityType.Builder.<RunAwayRangedEntity>of(RunAwayRangedEntity::new, MobCategory.MISC).setCustomClientFactory(RunAwayRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlastAwayRangedEntity>> BLAST_AWAY_RANGED = register("projectile_blast_away_ranged", EntityType.Builder.<BlastAwayRangedEntity>of(BlastAwayRangedEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlastAwayRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TojiFushiguroEntity>> TOJI_FUSHIGURO = register("toji_fushiguro",
			EntityType.Builder.<TojiFushiguroEntity>of(TojiFushiguroEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TojiFushiguroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YujiItadoriEntity>> YUJI_ITADORI = register("yuji_itadori",
			EntityType.Builder.<YujiItadoriEntity>of(YujiItadoriEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YujiItadoriEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RyomenSukunaEntity>> RYOMEN_SUKUNA = register("ryomen_sukuna",
			EntityType.Builder.<RyomenSukunaEntity>of(RyomenSukunaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RyomenSukunaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoppongiCursedSpiritEntity>> ROPPONGI_CURSED_SPIRIT = register("roppongi_cursed_spirit",
			EntityType.Builder.<RoppongiCursedSpiritEntity>of(RoppongiCursedSpiritEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RoppongiCursedSpiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireArrowEntity>> FIRE_ARROW = register("projectile_fire_arrow",
			EntityType.Builder.<FireArrowEntity>of(FireArrowEntity::new, MobCategory.MISC).setCustomClientFactory(FireArrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireArrowMobEntity>> FIRE_ARROW_MOB = register("projectile_fire_arrow_mob",
			EntityType.Builder.<FireArrowMobEntity>of(FireArrowMobEntity::new, MobCategory.MISC).setCustomClientFactory(FireArrowMobEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<YutaOkkotsuEntity>> YUTA_OKKOTSU = register("yuta_okkotsu",
			EntityType.Builder.<YutaOkkotsuEntity>of(YutaOkkotsuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YutaOkkotsuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RikaEntity>> RIKA = register("rika",
			EntityType.Builder.<RikaEntity>of(RikaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RikaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GreatSerpentEntity>> GREAT_SERPENT = register("great_serpent",
			EntityType.Builder.<GreatSerpentEntity>of(GreatSerpentEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreatSerpentEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RugbyFieldCursedSpiritEntity>> RUGBY_FIELD_CURSED_SPIRIT = register("rugby_field_cursed_spirit",
			EntityType.Builder.<RugbyFieldCursedSpiritEntity>of(RugbyFieldCursedSpiritEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RugbyFieldCursedSpiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KoGuyEntity>> KO_GUY = register("ko_guy",
			EntityType.Builder.<KoGuyEntity>of(KoGuyEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KoGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlackMucusEntity>> BLACK_MUCUS = register("projectile_black_mucus",
			EntityType.Builder.<BlackMucusEntity>of(BlackMucusEntity::new, MobCategory.MISC).setCustomClientFactory(BlackMucusEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DismantleEntity>> DISMANTLE = register("projectile_dismantle",
			EntityType.Builder.<DismantleEntity>of(DismantleEntity::new, MobCategory.MISC).setCustomClientFactory(DismantleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HeianEraSukunaEntity>> HEIAN_ERA_SUKUNA = register("heian_era_sukuna",
			EntityType.Builder.<HeianEraSukunaEntity>of(HeianEraSukunaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HeianEraSukunaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FindBlueLocationEntity>> FIND_BLUE_LOCATION = register("projectile_find_blue_location", EntityType.Builder.<FindBlueLocationEntity>of(FindBlueLocationEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FindBlueLocationEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ToadEntity>> TOAD = register("toad",
			EntityType.Builder.<ToadEntity>of(ToadEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToadEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UnlimitedVoidMobEntity>> UNLIMITED_VOID_MOB = register("unlimited_void_mob", EntityType.Builder.<UnlimitedVoidMobEntity>of(UnlimitedVoidMobEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UnlimitedVoidMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NueEntity>> NUE = register("nue",
			EntityType.Builder.<NueEntity>of(NueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChosoEntity>> CHOSO = register("choso",
			EntityType.Builder.<ChosoEntity>of(ChosoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChosoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MouthCursedSpiritEntity>> MOUTH_CURSED_SPIRIT = register("mouth_cursed_spirit",
			EntityType.Builder.<MouthCursedSpiritEntity>of(MouthCursedSpiritEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MouthCursedSpiritEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MahitoEntity>> MAHITO = register("mahito",
			EntityType.Builder.<MahitoEntity>of(MahitoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MahitoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NanamiKentoEntity>> NANAMI_KENTO = register("nanami_kento",
			EntityType.Builder.<NanamiKentoEntity>of(NanamiKentoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NanamiKentoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MalevolentShrineEntity>> MALEVOLENT_SHRINE = register("malevolent_shrine", EntityType.Builder.<MalevolentShrineEntity>of(MalevolentShrineEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(500).setUpdateInterval(3).setCustomClientFactory(MalevolentShrineEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SlicingExcorismEntity>> SLICING_EXCORISM = register("projectile_slicing_excorism", EntityType.Builder.<SlicingExcorismEntity>of(SlicingExcorismEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SlicingExcorismEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BloodMeteoriteEntity>> BLOOD_METEORITE = register("projectile_blood_meteorite",
			EntityType.Builder.<BloodMeteoriteEntity>of(BloodMeteoriteEntity::new, MobCategory.MISC).setCustomClientFactory(BloodMeteoriteEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HanamiEntity>> HANAMI = register("hanami",
			EntityType.Builder.<HanamiEntity>of(HanamiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HanamiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JogoEntity>> JOGO = register("jogo",
			EntityType.Builder.<JogoEntity>of(JogoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JogoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoundDeerEntity>> ROUND_DEER = register("round_deer",
			EntityType.Builder.<RoundDeerEntity>of(RoundDeerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoundDeerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ResurrectedTojiEntity>> RESURRECTED_TOJI = register("resurrected_toji",
			EntityType.Builder.<ResurrectedTojiEntity>of(ResurrectedTojiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ResurrectedTojiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReversalRedEntity>> REVERSAL_RED = register("projectile_reversal_red",
			EntityType.Builder.<ReversalRedEntity>of(ReversalRedEntity::new, MobCategory.MISC).setCustomClientFactory(ReversalRedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MaximumElephantEntity>> MAXIMUM_ELEPHANT = register("maximum_elephant",
			EntityType.Builder.<MaximumElephantEntity>of(MaximumElephantEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MaximumElephantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WaterMaximumElephantEntity>> WATER_MAXIMUM_ELEPHANT = register("projectile_water_maximum_elephant", EntityType.Builder.<WaterMaximumElephantEntity>of(WaterMaximumElephantEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WaterMaximumElephantEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlackDivineDogEntity>> BLACK_DIVINE_DOG = register("black_divine_dog",
			EntityType.Builder.<BlackDivineDogEntity>of(BlackDivineDogEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackDivineDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhiteDivineDogEntity>> WHITE_DIVINE_DOG = register("white_divine_dog",
			EntityType.Builder.<WhiteDivineDogEntity>of(WhiteDivineDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhiteDivineDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TenShadowRabbitEntity>> TEN_SHADOW_RABBIT = register("ten_shadow_rabbit",
			EntityType.Builder.<TenShadowRabbitEntity>of(TenShadowRabbitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TenShadowRabbitEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowFrogEntity>> SHADOW_FROG = register("shadow_frog", EntityType.Builder.<ShadowFrogEntity>of(ShadowFrogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(ShadowFrogEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChimeraShadowGardenMobEntity>> CHIMERA_SHADOW_GARDEN_MOB = register("chimera_shadow_garden_mob",
			EntityType.Builder.<ChimeraShadowGardenMobEntity>of(ChimeraShadowGardenMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ChimeraShadowGardenMobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NobaraKugisakiEntity>> NOBARA_KUGISAKI = register("nobara_kugisaki",
			EntityType.Builder.<NobaraKugisakiEntity>of(NobaraKugisakiEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NobaraKugisakiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NailProjectileEntity>> NAIL_PROJECTILE = register("projectile_nail_projectile",
			EntityType.Builder.<NailProjectileEntity>of(NailProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(NailProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DisasterFlameRangedEntity>> DISASTER_FLAME_RANGED = register("projectile_disaster_flame_ranged", EntityType.Builder.<DisasterFlameRangedEntity>of(DisasterFlameRangedEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DisasterFlameRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EmberInsectEntity>> EMBER_INSECT = register("ember_insect",
			EntityType.Builder.<EmberInsectEntity>of(EmberInsectEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmberInsectEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VolcanicEruptionEntity>> VOLCANIC_ERUPTION = register("projectile_volcanic_eruption", EntityType.Builder.<VolcanicEruptionEntity>of(VolcanicEruptionEntity::new, MobCategory.MISC)
			.setCustomClientFactory(VolcanicEruptionEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MaxMeteorEntity>> MAX_METEOR = register("max_meteor",
			EntityType.Builder.<MaxMeteorEntity>of(MaxMeteorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MaxMeteorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CoffinMountainEntity>> COFFIN_MOUNTAIN = register("coffin_mountain", EntityType.Builder.<CoffinMountainEntity>of(CoffinMountainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CoffinMountainEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InventoryCurseMobEntity>> INVENTORY_CURSE_MOB = register("inventory_curse_mob",
			EntityType.Builder.<InventoryCurseMobEntity>of(InventoryCurseMobEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InventoryCurseMobEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FingerBearerEntity>> FINGER_BEARER = register("finger_bearer",
			EntityType.Builder.<FingerBearerEntity>of(FingerBearerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FingerBearerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity>> EIGHT_HANDLED_SWORD_DIVERGENT_SILA_DIVINE_GENERAL_MAHORAGA = register("eight_handled_sword_divergent_sila_divine_general_mahoraga",
			EntityType.Builder.<EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity>of(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PureLoveBeamRangedEntity>> PURE_LOVE_BEAM_RANGED = register("projectile_pure_love_beam_ranged", EntityType.Builder.<PureLoveBeamRangedEntity>of(PureLoveBeamRangedEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PureLoveBeamRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RainbowDragonEntity>> RAINBOW_DRAGON = register("rainbow_dragon",
			EntityType.Builder.<RainbowDragonEntity>of(RainbowDragonEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RainbowDragonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SmallPoxDeityEntity>> SMALL_POX_DEITY = register("small_pox_deity",
			EntityType.Builder.<SmallPoxDeityEntity>of(SmallPoxDeityEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SmallPoxDeityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WoodenBoxEntity>> WOODEN_BOX = register("wooden_box",
			EntityType.Builder.<WoodenBoxEntity>of(WoodenBoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WoodenBoxEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SmallPoxDomainSpawnerEntity>> SMALL_POX_DOMAIN_SPAWNER = register("small_pox_domain_spawner",
			EntityType.Builder.<SmallPoxDomainSpawnerEntity>of(SmallPoxDomainSpawnerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SmallPoxDomainSpawnerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PoxDeityDomainEntity>> POX_DEITY_DOMAIN = register("pox_deity_domain",
			EntityType.Builder.<PoxDeityDomainEntity>of(PoxDeityDomainEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoxDeityDomainEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HollowPurpleProjectileEntity>> HOLLOW_PURPLE_PROJECTILE = register("projectile_hollow_purple_projectile",
			EntityType.Builder.<HollowPurpleProjectileEntity>of(HollowPurpleProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(HollowPurpleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RootProjectileEntity>> ROOT_PROJECTILE = register("projectile_root_projectile",
			EntityType.Builder.<RootProjectileEntity>of(RootProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(RootProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EmberInsectProjectileEntity>> EMBER_INSECT_PROJECTILE = register("projectile_ember_insect_projectile",
			EntityType.Builder.<EmberInsectProjectileEntity>of(EmberInsectProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EmberInsectProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlowerProjectileEntity>> FLOWER_PROJECTILE = register("projectile_flower_projectile", EntityType.Builder.<FlowerProjectileEntity>of(FlowerProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FlowerProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StronghitEntity>> STRONGHIT = register("projectile_stronghit",
			EntityType.Builder.<StronghitEntity>of(StronghitEntity::new, MobCategory.MISC).setCustomClientFactory(StronghitEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ReversalRedEntityEntity.init();
			SatoruGojoEntity.init();
			TojiFushiguroEntity.init();
			YujiItadoriEntity.init();
			RyomenSukunaEntity.init();
			RoppongiCursedSpiritEntity.init();
			YutaOkkotsuEntity.init();
			RikaEntity.init();
			GreatSerpentEntity.init();
			RugbyFieldCursedSpiritEntity.init();
			KoGuyEntity.init();
			HeianEraSukunaEntity.init();
			ToadEntity.init();
			UnlimitedVoidMobEntity.init();
			NueEntity.init();
			ChosoEntity.init();
			MouthCursedSpiritEntity.init();
			MahitoEntity.init();
			NanamiKentoEntity.init();
			MalevolentShrineEntity.init();
			HanamiEntity.init();
			JogoEntity.init();
			RoundDeerEntity.init();
			ResurrectedTojiEntity.init();
			MaximumElephantEntity.init();
			BlackDivineDogEntity.init();
			WhiteDivineDogEntity.init();
			TenShadowRabbitEntity.init();
			ShadowFrogEntity.init();
			ChimeraShadowGardenMobEntity.init();
			NobaraKugisakiEntity.init();
			EmberInsectEntity.init();
			MaxMeteorEntity.init();
			CoffinMountainEntity.init();
			InventoryCurseMobEntity.init();
			FingerBearerEntity.init();
			EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity.init();
			RainbowDragonEntity.init();
			SmallPoxDeityEntity.init();
			WoodenBoxEntity.init();
			SmallPoxDomainSpawnerEntity.init();
			PoxDeityDomainEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(REVERSAL_RED_ENTITY.get(), ReversalRedEntityEntity.createAttributes().build());
		event.put(SATORU_GOJO.get(), SatoruGojoEntity.createAttributes().build());
		event.put(TOJI_FUSHIGURO.get(), TojiFushiguroEntity.createAttributes().build());
		event.put(YUJI_ITADORI.get(), YujiItadoriEntity.createAttributes().build());
		event.put(RYOMEN_SUKUNA.get(), RyomenSukunaEntity.createAttributes().build());
		event.put(ROPPONGI_CURSED_SPIRIT.get(), RoppongiCursedSpiritEntity.createAttributes().build());
		event.put(YUTA_OKKOTSU.get(), YutaOkkotsuEntity.createAttributes().build());
		event.put(RIKA.get(), RikaEntity.createAttributes().build());
		event.put(GREAT_SERPENT.get(), GreatSerpentEntity.createAttributes().build());
		event.put(RUGBY_FIELD_CURSED_SPIRIT.get(), RugbyFieldCursedSpiritEntity.createAttributes().build());
		event.put(KO_GUY.get(), KoGuyEntity.createAttributes().build());
		event.put(HEIAN_ERA_SUKUNA.get(), HeianEraSukunaEntity.createAttributes().build());
		event.put(TOAD.get(), ToadEntity.createAttributes().build());
		event.put(UNLIMITED_VOID_MOB.get(), UnlimitedVoidMobEntity.createAttributes().build());
		event.put(NUE.get(), NueEntity.createAttributes().build());
		event.put(CHOSO.get(), ChosoEntity.createAttributes().build());
		event.put(MOUTH_CURSED_SPIRIT.get(), MouthCursedSpiritEntity.createAttributes().build());
		event.put(MAHITO.get(), MahitoEntity.createAttributes().build());
		event.put(NANAMI_KENTO.get(), NanamiKentoEntity.createAttributes().build());
		event.put(MALEVOLENT_SHRINE.get(), MalevolentShrineEntity.createAttributes().build());
		event.put(HANAMI.get(), HanamiEntity.createAttributes().build());
		event.put(JOGO.get(), JogoEntity.createAttributes().build());
		event.put(ROUND_DEER.get(), RoundDeerEntity.createAttributes().build());
		event.put(RESURRECTED_TOJI.get(), ResurrectedTojiEntity.createAttributes().build());
		event.put(MAXIMUM_ELEPHANT.get(), MaximumElephantEntity.createAttributes().build());
		event.put(BLACK_DIVINE_DOG.get(), BlackDivineDogEntity.createAttributes().build());
		event.put(WHITE_DIVINE_DOG.get(), WhiteDivineDogEntity.createAttributes().build());
		event.put(TEN_SHADOW_RABBIT.get(), TenShadowRabbitEntity.createAttributes().build());
		event.put(SHADOW_FROG.get(), ShadowFrogEntity.createAttributes().build());
		event.put(CHIMERA_SHADOW_GARDEN_MOB.get(), ChimeraShadowGardenMobEntity.createAttributes().build());
		event.put(NOBARA_KUGISAKI.get(), NobaraKugisakiEntity.createAttributes().build());
		event.put(EMBER_INSECT.get(), EmberInsectEntity.createAttributes().build());
		event.put(MAX_METEOR.get(), MaxMeteorEntity.createAttributes().build());
		event.put(COFFIN_MOUNTAIN.get(), CoffinMountainEntity.createAttributes().build());
		event.put(INVENTORY_CURSE_MOB.get(), InventoryCurseMobEntity.createAttributes().build());
		event.put(FINGER_BEARER.get(), FingerBearerEntity.createAttributes().build());
		event.put(EIGHT_HANDLED_SWORD_DIVERGENT_SILA_DIVINE_GENERAL_MAHORAGA.get(), EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity.createAttributes().build());
		event.put(RAINBOW_DRAGON.get(), RainbowDragonEntity.createAttributes().build());
		event.put(SMALL_POX_DEITY.get(), SmallPoxDeityEntity.createAttributes().build());
		event.put(WOODEN_BOX.get(), WoodenBoxEntity.createAttributes().build());
		event.put(SMALL_POX_DOMAIN_SPAWNER.get(), SmallPoxDomainSpawnerEntity.createAttributes().build());
		event.put(POX_DEITY_DOMAIN.get(), PoxDeityDomainEntity.createAttributes().build());
	}
}
