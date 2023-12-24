
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.craftkaisen.item.YutaOutfitItem;
import net.mcreator.craftkaisen.item.YutaKatanaItem;
import net.mcreator.craftkaisen.item.WaterMaximumElephantItem;
import net.mcreator.craftkaisen.item.VolcanicEruptionItem;
import net.mcreator.craftkaisen.item.TwistRangedItem;
import net.mcreator.craftkaisen.item.TojiOutfitItem;
import net.mcreator.craftkaisen.item.TojiCurseArmorItem;
import net.mcreator.craftkaisen.item.TestItem;
import net.mcreator.craftkaisen.item.SukunaOutfitItem;
import net.mcreator.craftkaisen.item.SukunaFingerItem;
import net.mcreator.craftkaisen.item.StronghitItem;
import net.mcreator.craftkaisen.item.SplitSoulKatanaItem;
import net.mcreator.craftkaisen.item.SlicingExcorismItem;
import net.mcreator.craftkaisen.item.SleepRangedItem;
import net.mcreator.craftkaisen.item.RunAwayRangedItem;
import net.mcreator.craftkaisen.item.RootProjectileItem;
import net.mcreator.craftkaisen.item.ReversalRedProjectileItem;
import net.mcreator.craftkaisen.item.ReversalRedItem;
import net.mcreator.craftkaisen.item.PureLoveBeamRangedItem;
import net.mcreator.craftkaisen.item.PlayfulCloudItem;
import net.mcreator.craftkaisen.item.PhoneItem;
import net.mcreator.craftkaisen.item.NobaraOutfitItem;
import net.mcreator.craftkaisen.item.NanamiKnifeItem;
import net.mcreator.craftkaisen.item.NailProjectileItem;
import net.mcreator.craftkaisen.item.NailItem;
import net.mcreator.craftkaisen.item.NaginataItem;
import net.mcreator.craftkaisen.item.MiwaKatanaItem;
import net.mcreator.craftkaisen.item.MedicineItem;
import net.mcreator.craftkaisen.item.MahoragaWheelItem;
import net.mcreator.craftkaisen.item.JujutsuSorcererUniformItem;
import net.mcreator.craftkaisen.item.InvertedSpearItem;
import net.mcreator.craftkaisen.item.HollowPurpleProjectileItem;
import net.mcreator.craftkaisen.item.HammerItem;
import net.mcreator.craftkaisen.item.GetoOutfitItem;
import net.mcreator.craftkaisen.item.FlowerProjectileItem;
import net.mcreator.craftkaisen.item.FireArrowMobItem;
import net.mcreator.craftkaisen.item.FireArrowItem;
import net.mcreator.craftkaisen.item.FindBlueLocationItem;
import net.mcreator.craftkaisen.item.ExplodeRangedItem;
import net.mcreator.craftkaisen.item.EmberInsectProjectileItem;
import net.mcreator.craftkaisen.item.DontMoveRangedItem;
import net.mcreator.craftkaisen.item.DismantleItem;
import net.mcreator.craftkaisen.item.DisasterFlameRangedItem;
import net.mcreator.craftkaisen.item.CursedWombDeathPaintingItem;
import net.mcreator.craftkaisen.item.CursedSpiritOrbItem;
import net.mcreator.craftkaisen.item.CursedRingItem;
import net.mcreator.craftkaisen.item.CrushedRangedItem;
import net.mcreator.craftkaisen.item.CrumbleAwayRangedItem;
import net.mcreator.craftkaisen.item.ChosoArmorItem;
import net.mcreator.craftkaisen.item.BloodSpearItem;
import net.mcreator.craftkaisen.item.BloodMeteoriteItem;
import net.mcreator.craftkaisen.item.BloodBladeItem;
import net.mcreator.craftkaisen.item.BloodAxeItem;
import net.mcreator.craftkaisen.item.BlastAwayRangedItem;
import net.mcreator.craftkaisen.item.BlackMucusItem;
import net.mcreator.craftkaisen.item.BlackBlindFoldItem;
import net.mcreator.craftkaisen.item.BandageBlindFoldItem;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftKaisenMod.MODID);
	public static final RegistryObject<Item> REVERSAL_RED_PROJECTILE = REGISTRY.register("reversal_red_projectile", () -> new ReversalRedProjectileItem());
	public static final RegistryObject<Item> SATORU_GOJO_SPAWN_EGG = REGISTRY.register("satoru_gojo_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.SATORU_GOJO, -16514039, -1, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> EXPLODE_RANGED = REGISTRY.register("explode_ranged", () -> new ExplodeRangedItem());
	public static final RegistryObject<Item> TWIST_RANGED = REGISTRY.register("twist_ranged", () -> new TwistRangedItem());
	public static final RegistryObject<Item> CRUSHED_RANGED = REGISTRY.register("crushed_ranged", () -> new CrushedRangedItem());
	public static final RegistryObject<Item> CRUMBLE_AWAY_RANGED = REGISTRY.register("crumble_away_ranged", () -> new CrumbleAwayRangedItem());
	public static final RegistryObject<Item> DONT_MOVE_RANGED = REGISTRY.register("dont_move_ranged", () -> new DontMoveRangedItem());
	public static final RegistryObject<Item> SLEEP_RANGED = REGISTRY.register("sleep_ranged", () -> new SleepRangedItem());
	public static final RegistryObject<Item> RUN_AWAY_RANGED = REGISTRY.register("run_away_ranged", () -> new RunAwayRangedItem());
	public static final RegistryObject<Item> BLAST_AWAY_RANGED = REGISTRY.register("blast_away_ranged", () -> new BlastAwayRangedItem());
	public static final RegistryObject<Item> BLACK_BLIND_FOLD_HELMET = REGISTRY.register("black_blind_fold_helmet", () -> new BlackBlindFoldItem.Helmet());
	public static final RegistryObject<Item> BANDAGE_BLIND_FOLD_HELMET = REGISTRY.register("bandage_blind_fold_helmet", () -> new BandageBlindFoldItem.Helmet());
	public static final RegistryObject<Item> JUJUTSU_SORCERER_UNIFORM_CHESTPLATE = REGISTRY.register("jujutsu_sorcerer_uniform_chestplate", () -> new JujutsuSorcererUniformItem.Chestplate());
	public static final RegistryObject<Item> JUJUTSU_SORCERER_UNIFORM_LEGGINGS = REGISTRY.register("jujutsu_sorcerer_uniform_leggings", () -> new JujutsuSorcererUniformItem.Leggings());
	public static final RegistryObject<Item> INVERTED_SPEAR = REGISTRY.register("inverted_spear", () -> new InvertedSpearItem());
	public static final RegistryObject<Item> SPLIT_SOUL_KATANA = REGISTRY.register("split_soul_katana", () -> new SplitSoulKatanaItem());
	public static final RegistryObject<Item> NAGINATA = REGISTRY.register("naginata", () -> new NaginataItem());
	public static final RegistryObject<Item> YUTA_KATANA = REGISTRY.register("yuta_katana", () -> new YutaKatanaItem());
	public static final RegistryObject<Item> MIWA_KATANA = REGISTRY.register("miwa_katana", () -> new MiwaKatanaItem());
	public static final RegistryObject<Item> TOJI_OUTFIT_CHESTPLATE = REGISTRY.register("toji_outfit_chestplate", () -> new TojiOutfitItem.Chestplate());
	public static final RegistryObject<Item> TOJI_OUTFIT_LEGGINGS = REGISTRY.register("toji_outfit_leggings", () -> new TojiOutfitItem.Leggings());
	public static final RegistryObject<Item> TOJI_FUSHIGURO_SPAWN_EGG = REGISTRY.register("toji_fushiguro_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.TOJI_FUSHIGURO, -15001056, -1, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> YUJI_ITADORI_SPAWN_EGG = REGISTRY.register("yuji_itadori_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.YUJI_ITADORI, -15395555, -4712424, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> SUKUNA_OUTFIT_CHESTPLATE = REGISTRY.register("sukuna_outfit_chestplate", () -> new SukunaOutfitItem.Chestplate());
	public static final RegistryObject<Item> SUKUNA_OUTFIT_LEGGINGS = REGISTRY.register("sukuna_outfit_leggings", () -> new SukunaOutfitItem.Leggings());
	public static final RegistryObject<Item> RYOMEN_SUKUNA_SPAWN_EGG = REGISTRY.register("ryomen_sukuna_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.RYOMEN_SUKUNA, -1, -3835270, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> ROPPONGI_CURSED_SPIRIT_SPAWN_EGG = REGISTRY.register("roppongi_cursed_spirit_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.ROPPONGI_CURSED_SPIRIT, -2829154, -10795978, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> FIRE_ARROW = REGISTRY.register("fire_arrow", () -> new FireArrowItem());
	public static final RegistryObject<Item> FIRE_ARROW_MOB = REGISTRY.register("fire_arrow_mob", () -> new FireArrowMobItem());
	public static final RegistryObject<Item> YUTA_OKKOTSU_SPAWN_EGG = REGISTRY.register("yuta_okkotsu_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.YUTA_OKKOTSU, -1, -15066598, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> RIKA_SPAWN_EGG = REGISTRY.register("rika_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.RIKA, -1, -15527149, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> GREAT_SERPENT_SPAWN_EGG = REGISTRY.register("great_serpent_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.GREAT_SERPENT, -1, -16777216, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> PLAYFUL_CLOUD = REGISTRY.register("playful_cloud", () -> new PlayfulCloudItem());
	public static final RegistryObject<Item> RUGBY_FIELD_CURSED_SPIRIT_SPAWN_EGG = REGISTRY.register("rugby_field_cursed_spirit_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.RUGBY_FIELD_CURSED_SPIRIT, -16764058, -6750208, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> KO_GUY_SPAWN_EGG = REGISTRY.register("ko_guy_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.KO_GUY, -6831509, -2237795, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> BLACK_MUCUS = REGISTRY.register("black_mucus", () -> new BlackMucusItem());
	public static final RegistryObject<Item> TOJI_CURSE_ARMOR_CHESTPLATE = REGISTRY.register("toji_curse_armor_chestplate", () -> new TojiCurseArmorItem.Chestplate());
	public static final RegistryObject<Item> DISMANTLE = REGISTRY.register("dismantle", () -> new DismantleItem());
	public static final RegistryObject<Item> HEIAN_ERA_SUKUNA_SPAWN_EGG = REGISTRY.register("heian_era_sukuna_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.HEIAN_ERA_SUKUNA, -403824, -21804, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> FIND_BLUE_LOCATION = REGISTRY.register("find_blue_location", () -> new FindBlueLocationItem());
	public static final RegistryObject<Item> TOAD_SPAWN_EGG = REGISTRY.register("toad_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.TOAD, -10841282, -3619735, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	public static final RegistryObject<Item> DOMAIN_BLOCK = block(CraftKaisenModBlocks.DOMAIN_BLOCK, null);
	public static final RegistryObject<Item> TALISMAN_BLOCK = block(CraftKaisenModBlocks.TALISMAN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SHIBUYA_GATES = block(CraftKaisenModBlocks.SHIBUYA_GATES, null);
	public static final RegistryObject<Item> NUE_SPAWN_EGG = REGISTRY.register("nue_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.NUE, -38604, -8816263, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> SPRINKLER = block(CraftKaisenModBlocks.SPRINKLER, CraftKaisenModTabs.TAB_CK_BLOCKS);
	public static final RegistryObject<Item> SPRINKLER_ON = block(CraftKaisenModBlocks.SPRINKLER_ON, null);
	public static final RegistryObject<Item> CHOSO_ARMOR_CHESTPLATE = REGISTRY.register("choso_armor_chestplate", () -> new ChosoArmorItem.Chestplate());
	public static final RegistryObject<Item> CHOSO_ARMOR_LEGGINGS = REGISTRY.register("choso_armor_leggings", () -> new ChosoArmorItem.Leggings());
	public static final RegistryObject<Item> CHOSO_SPAWN_EGG = REGISTRY.register("choso_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.CHOSO, -15002845, -4473925, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> GETO_OUTFIT_CHESTPLATE = REGISTRY.register("geto_outfit_chestplate", () -> new GetoOutfitItem.Chestplate());
	public static final RegistryObject<Item> GETO_OUTFIT_LEGGINGS = REGISTRY.register("geto_outfit_leggings", () -> new GetoOutfitItem.Leggings());
	public static final RegistryObject<Item> GETO_OUTFIT_BOOTS = REGISTRY.register("geto_outfit_boots", () -> new GetoOutfitItem.Boots());
	public static final RegistryObject<Item> MOUTH_CURSED_SPIRIT_SPAWN_EGG = REGISTRY.register("mouth_cursed_spirit_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.MOUTH_CURSED_SPIRIT, -1, -3776159, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> MAHITO_SPAWN_EGG = REGISTRY.register("mahito_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.MAHITO, -15197403, -3342339, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> NANAMI_KENTO_SPAWN_EGG = REGISTRY.register("nanami_kento_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.NANAMI_KENTO, -1, -1316965, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> NANAMI_KNIFE = REGISTRY.register("nanami_knife", () -> new NanamiKnifeItem());
	public static final RegistryObject<Item> SLICING_EXCORISM = REGISTRY.register("slicing_excorism", () -> new SlicingExcorismItem());
	public static final RegistryObject<Item> BLOOD_METEORITE = REGISTRY.register("blood_meteorite", () -> new BloodMeteoriteItem());
	public static final RegistryObject<Item> BLOOD_BLADE = REGISTRY.register("blood_blade", () -> new BloodBladeItem());
	public static final RegistryObject<Item> BLOOD_SPEAR = REGISTRY.register("blood_spear", () -> new BloodSpearItem());
	public static final RegistryObject<Item> BLOOD_AXE = REGISTRY.register("blood_axe", () -> new BloodAxeItem());
	public static final RegistryObject<Item> HANAMI_SPAWN_EGG = REGISTRY.register("hanami_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.HANAMI, -1712445, -8700868, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> JOGO_SPAWN_EGG = REGISTRY.register("jogo_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.JOGO, -9138105, -3920640, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> ROUND_DEER_SPAWN_EGG = REGISTRY.register("round_deer_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.ROUND_DEER, -12966123, -6121343, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> RESURRECTED_TOJI_SPAWN_EGG = REGISTRY.register("resurrected_toji_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.RESURRECTED_TOJI, -1, -10092544, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> REVERSAL_RED = REGISTRY.register("reversal_red", () -> new ReversalRedItem());
	public static final RegistryObject<Item> MAXIMUM_ELEPHANT_SPAWN_EGG = REGISTRY.register("maximum_elephant_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.MAXIMUM_ELEPHANT, -2509095, -2507960, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> WATER_MAXIMUM_ELEPHANT = REGISTRY.register("water_maximum_elephant", () -> new WaterMaximumElephantItem());
	public static final RegistryObject<Item> BLACK_DIVINE_DOG_SPAWN_EGG = REGISTRY.register("black_divine_dog_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.BLACK_DIVINE_DOG, -16777216, -6750208, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> WHITE_DIVINE_DOG_SPAWN_EGG = REGISTRY.register("white_divine_dog_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.WHITE_DIVINE_DOG, -1, -6750208, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> TEN_SHADOW_RABBIT_SPAWN_EGG = REGISTRY.register("ten_shadow_rabbit_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.TEN_SHADOW_RABBIT, -986896, -1825242, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> YUTA_OUTFIT_CHESTPLATE = REGISTRY.register("yuta_outfit_chestplate", () -> new YutaOutfitItem.Chestplate());
	public static final RegistryObject<Item> YUTA_OUTFIT_LEGGINGS = REGISTRY.register("yuta_outfit_leggings", () -> new YutaOutfitItem.Leggings());
	public static final RegistryObject<Item> NOBARA_KUGISAKI_SPAWN_EGG = REGISTRY.register("nobara_kugisaki_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.NOBARA_KUGISAKI, -13357747, -2718400, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> NOBARA_OUTFIT_CHESTPLATE = REGISTRY.register("nobara_outfit_chestplate", () -> new NobaraOutfitItem.Chestplate());
	public static final RegistryObject<Item> NOBARA_OUTFIT_LEGGINGS = REGISTRY.register("nobara_outfit_leggings", () -> new NobaraOutfitItem.Leggings());
	public static final RegistryObject<Item> NAIL = REGISTRY.register("nail", () -> new NailItem());
	public static final RegistryObject<Item> NAIL_PROJECTILE = REGISTRY.register("nail_projectile", () -> new NailProjectileItem());
	public static final RegistryObject<Item> BARRIER_BLOCK = block(CraftKaisenModBlocks.BARRIER_BLOCK, null);
	public static final RegistryObject<Item> QUEST_BOARD = block(CraftKaisenModBlocks.QUEST_BOARD, CraftKaisenModTabs.TAB_CK_BLOCKS);
	public static final RegistryObject<Item> DISASTER_FLAME_RANGED = REGISTRY.register("disaster_flame_ranged", () -> new DisasterFlameRangedItem());
	public static final RegistryObject<Item> EMBER_INSECT_SPAWN_EGG = REGISTRY.register("ember_insect_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.EMBER_INSECT, -13434829, -6710887, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> VOLCANIC_ERUPTION = REGISTRY.register("volcanic_eruption", () -> new VolcanicEruptionItem());
	public static final RegistryObject<Item> INVENTORY_CURSE_MOB_SPAWN_EGG = REGISTRY.register("inventory_curse_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.INVENTORY_CURSE_MOB, -13556943, -13885397, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> SUKUNA_FINGER = REGISTRY.register("sukuna_finger", () -> new SukunaFingerItem());
	public static final RegistryObject<Item> FINGER_BEARER_SPAWN_EGG = REGISTRY.register("finger_bearer_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.FINGER_BEARER, -2960686, -15527136, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> EIGHT_HANDLED_SWORD_DIVERGENT_SILA_DIVINE_GENERAL_MAHORAGA_SPAWN_EGG = REGISTRY.register("eight_handled_sword_divergent_sila_divine_general_mahoraga_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.EIGHT_HANDLED_SWORD_DIVERGENT_SILA_DIVINE_GENERAL_MAHORAGA, -1710619, -6710887, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> PURE_LOVE_BEAM_RANGED = REGISTRY.register("pure_love_beam_ranged", () -> new PureLoveBeamRangedItem());
	public static final RegistryObject<Item> RAINBOW_DRAGON_SPAWN_EGG = REGISTRY.register("rainbow_dragon_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.RAINBOW_DRAGON, -6426, -9728, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> SMALL_POX_DEITY_SPAWN_EGG = REGISTRY.register("small_pox_deity_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.SMALL_POX_DEITY, -10921639, -197380, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> MAHORAGA_WHEEL_HELMET = REGISTRY.register("mahoraga_wheel_helmet", () -> new MahoragaWheelItem.Helmet());
	public static final RegistryObject<Item> HOLLOW_PURPLE_PROJECTILE = REGISTRY.register("hollow_purple_projectile", () -> new HollowPurpleProjectileItem());
	public static final RegistryObject<Item> ROOT_PROJECTILE = REGISTRY.register("root_projectile", () -> new RootProjectileItem());
	public static final RegistryObject<Item> EMBER_INSECT_PROJECTILE = REGISTRY.register("ember_insect_projectile", () -> new EmberInsectProjectileItem());
	public static final RegistryObject<Item> FLOWER_PROJECTILE = REGISTRY.register("flower_projectile", () -> new FlowerProjectileItem());
	public static final RegistryObject<Item> CURSED_SPIRIT_ORB = REGISTRY.register("cursed_spirit_orb", () -> new CursedSpiritOrbItem());
	public static final RegistryObject<Item> STRONGHIT = REGISTRY.register("stronghit", () -> new StronghitItem());
	public static final RegistryObject<Item> CURSED_RING = REGISTRY.register("cursed_ring", () -> new CursedRingItem());
	public static final RegistryObject<Item> CURSED_WOMB_DEATH_PAINTING = REGISTRY.register("cursed_womb_death_painting", () -> new CursedWombDeathPaintingItem());
	public static final RegistryObject<Item> FLY_HEAD_SPAWN_EGG = REGISTRY.register("fly_head_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.FLY_HEAD, -12965318, -11711155, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_CURSES)));
	public static final RegistryObject<Item> PHONE = REGISTRY.register("phone", () -> new PhoneItem());
	public static final RegistryObject<Item> OLD_LADY_SPAWN_EGG = REGISTRY.register("old_lady_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.OLD_LADY, -3447118, -2894893, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> MEDICINE = REGISTRY.register("medicine", () -> new MedicineItem());
	public static final RegistryObject<Item> RIKO_AMANAI_SPAWN_EGG = REGISTRY.register("riko_amanai_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.RIKO_AMANAI, -1, -16760428, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
