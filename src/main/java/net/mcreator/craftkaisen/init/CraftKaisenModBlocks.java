
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.craftkaisen.block.TalismanBlockBlock;
import net.mcreator.craftkaisen.block.SprinklerOnBlock;
import net.mcreator.craftkaisen.block.SprinklerBlock;
import net.mcreator.craftkaisen.block.ShibuyaGatesBlock;
import net.mcreator.craftkaisen.block.QuestBoardBlock;
import net.mcreator.craftkaisen.block.DomainBlockBlock;
import net.mcreator.craftkaisen.block.BarrierBlockBlock;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftKaisenMod.MODID);
	public static final RegistryObject<Block> DOMAIN_BLOCK = REGISTRY.register("domain_block", () -> new DomainBlockBlock());
	public static final RegistryObject<Block> TALISMAN_BLOCK = REGISTRY.register("talisman_block", () -> new TalismanBlockBlock());
	public static final RegistryObject<Block> SHIBUYA_GATES = REGISTRY.register("shibuya_gates", () -> new ShibuyaGatesBlock());
	public static final RegistryObject<Block> SPRINKLER = REGISTRY.register("sprinkler", () -> new SprinklerBlock());
	public static final RegistryObject<Block> SPRINKLER_ON = REGISTRY.register("sprinkler_on", () -> new SprinklerOnBlock());
	public static final RegistryObject<Block> BARRIER_BLOCK = REGISTRY.register("barrier_block", () -> new BarrierBlockBlock());
	public static final RegistryObject<Block> QUEST_BOARD = REGISTRY.register("quest_board", () -> new QuestBoardBlock());
}
