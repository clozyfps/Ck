package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.IndirectEntityDamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class StronghitWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CRIT, x, y, z, 3, 0.1, 1, 0.1, 0);
		CraftKaisenMod.queueServerWork(10, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 1, 0.1, 1, 0.1, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(immediatesourceentity == entityiterator) && !(entity == entityiterator)) {
						entityiterator.setDeltaMovement(new Vec3((0.9 * immediatesourceentity.getLookAngle().x), (0.5 * immediatesourceentity.getLookAngle().y), (0.9 * immediatesourceentity.getLookAngle().z)));
						entityiterator.hurt((new IndirectEntityDamageSource("generic.player", immediatesourceentity, entity)),
								(float) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).strengthStat / 3));
					}
				}
			}
		});
	}
}
