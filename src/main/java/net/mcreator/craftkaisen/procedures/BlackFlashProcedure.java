package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.CraftKaisenMod;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class BlackFlashProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity.getLevel(), entity, event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		double v = 0;
		double vanim = 0;
		sourceentity.getPersistentData().putDouble("bf", (Mth.nextInt(RandomSource.create(), 1, 1000)));
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.ZONE.get()) : false)) {
			vanim = Mth.nextInt(RandomSource.create(), 1, 10000);
		} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.ZONE.get()) : false) {
			vanim = Mth.nextInt(RandomSource.create(), 1, 2000);
		}
		if ((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy > 0) {
			if (sourceentity.getPersistentData().getDouble("bf") < (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).BlackFlashRarity) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0 0 0 3 ^0 ^0 ^0 2.2 1.5 2.2 0 20");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 1 0 0 3 ^0 ^0 ^0 2.2 1.5 2.2 0 30");
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLACK_FLASH_LIGHTNING.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 4, 1, 0.5, 1, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, (entity.getX()), (entity.getY()), (entity.getZ()), 5, 0.5, 2, 0.5, 0.5);
				entity.hurt((new EntityDamageSource("magic.player", sourceentity)), (float) (amount * 2.5));
				if (sourceentity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:black_flash_advancement"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.ZONE.get(), 1000, 0));
				if (vanim == 1) {
					sourceentity.getPersistentData().putDouble("screen", 1);
					CraftKaisenMod.queueServerWork(1, () -> {
						sourceentity.getPersistentData().putDouble("screen", 2);
						CraftKaisenMod.queueServerWork(1, () -> {
							sourceentity.getPersistentData().putDouble("screen", 3);
							CraftKaisenMod.queueServerWork(1, () -> {
								sourceentity.getPersistentData().putDouble("screen", 4);
								CraftKaisenMod.queueServerWork(1, () -> {
									sourceentity.getPersistentData().putDouble("screen", 5);
									CraftKaisenMod.queueServerWork(1, () -> {
										sourceentity.getPersistentData().putDouble("screen", 6);
										CraftKaisenMod.queueServerWork(1, () -> {
											sourceentity.getPersistentData().putDouble("screen", 7);
											CraftKaisenMod.queueServerWork(1, () -> {
												sourceentity.getPersistentData().putDouble("screen", 8);
												CraftKaisenMod.queueServerWork(1, () -> {
													sourceentity.getPersistentData().putDouble("screen", 9);
													CraftKaisenMod.queueServerWork(1, () -> {
														sourceentity.getPersistentData().putDouble("screen", 10);
														CraftKaisenMod.queueServerWork(1, () -> {
															sourceentity.getPersistentData().putDouble("screen", 11);
															CraftKaisenMod.queueServerWork(1, () -> {
																sourceentity.getPersistentData().putDouble("screen", 12);
																CraftKaisenMod.queueServerWork(1, () -> {
																	sourceentity.getPersistentData().putDouble("screen", 13);
																	CraftKaisenMod.queueServerWork(1, () -> {
																		sourceentity.getPersistentData().putDouble("screen", 14);
																		CraftKaisenMod.queueServerWork(1, () -> {
																			sourceentity.getPersistentData().putDouble("screen", 15);
																			CraftKaisenMod.queueServerWork(1, () -> {
																				sourceentity.getPersistentData().putDouble("screen", 16);
																				CraftKaisenMod.queueServerWork(1, () -> {
																					sourceentity.getPersistentData().putDouble("screen", 17);
																					CraftKaisenMod.queueServerWork(1, () -> {
																						sourceentity.getPersistentData().putDouble("screen", 18);
																						CraftKaisenMod.queueServerWork(1, () -> {
																							sourceentity.getPersistentData().putDouble("screen", 19);
																							CraftKaisenMod.queueServerWork(1, () -> {
																								sourceentity.getPersistentData().putDouble("screen", 20);
																								CraftKaisenMod.queueServerWork(1, () -> {
																									sourceentity.getPersistentData().putDouble("screen", 21);
																									CraftKaisenMod.queueServerWork(1, () -> {
																										sourceentity.getPersistentData().putDouble("screen", 22);
																										CraftKaisenMod.queueServerWork(1, () -> {
																											sourceentity.getPersistentData().putDouble("screen", 23);
																											CraftKaisenMod.queueServerWork(1, () -> {
																												sourceentity.getPersistentData().putDouble("screen", 24);
																												CraftKaisenMod.queueServerWork(1, () -> {
																													sourceentity.getPersistentData().putDouble("screen", 25);
																													CraftKaisenMod.queueServerWork(1, () -> {
																														sourceentity.getPersistentData().putDouble("screen", 26);
																														CraftKaisenMod.queueServerWork(1, () -> {
																															sourceentity.getPersistentData().putDouble("screen", 27);
																															CraftKaisenMod.queueServerWork(1, () -> {
																																sourceentity.getPersistentData().putDouble("screen", 28);
																																CraftKaisenMod.queueServerWork(1, () -> {
																																	sourceentity.getPersistentData().putDouble("screen", 29);
																																	CraftKaisenMod.queueServerWork(1, () -> {
																																		sourceentity.getPersistentData().putDouble("screen", 30);
																																		CraftKaisenMod.queueServerWork(1, () -> {
																																			sourceentity.getPersistentData().putDouble("screen", 31);
																																			CraftKaisenMod.queueServerWork(1, () -> {
																																				sourceentity.getPersistentData().putDouble("screen", 0);
																																			});
																																		});
																																	});
																																});
																															});
																														});
																													});
																												});
																											});
																										});
																									});
																								});
																							});
																						});
																					});
																				});
																			});
																		});
																	});
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				}
			}
		}
	}
}
