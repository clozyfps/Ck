package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.entity.YujiItadoriEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MobBlackFlashProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity.getLevel(), entity, event.getSource().getDirectEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity, double amount) {
		execute(null, world, entity, immediatesourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity immediatesourceentity, double amount) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (immediatesourceentity instanceof YujiItadoriEntity) {
			if (Math.random() < 0.04) {
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
					_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLACK_FLASH_PULSE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 1);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, (entity.getX()), (entity.getY()), (entity.getZ()), 1, 1, 2, 1, 0);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, (entity.getX()), (entity.getY()), (entity.getZ()), 10, 0.5, 2, 0.5, 0.5);
				entity.hurt(DamageSource.GENERIC, (float) (amount * 2.5));
			}
		}
	}
}
