package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class TeleportProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput))),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput))),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput))),
							ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection
						.teleport(
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f)
												.add(entity.getViewVector(1f).scale(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput))),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
								(entity.level
										.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f)
														.add(entity.getViewVector(1f).scale(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput))),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
										.getBlockPos().getY()),
								(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f)
												.add(entity.getViewVector(1f).scale(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput))),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
								_ent.getYRot(), _ent.getXRot());
		}
	}
}
