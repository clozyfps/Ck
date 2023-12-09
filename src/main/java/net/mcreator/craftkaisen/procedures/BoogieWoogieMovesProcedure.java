package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BoogieWoogieMovesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xLook = 0;
		double yLook = 0;
		double zLook = 0;
		Entity targetOne = null;
		Entity targetTwo = null;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput > 0) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Clap")) {
				xLook = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
				yLook = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
				zLook = entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(15)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
				if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy >= 20
						* ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10)) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy
								- 20 * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10);
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentCursedEnergy = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (!((entity.getPersistentData().getString("clapTargetOne")).isEmpty() && (entity.getPersistentData().getString("clapTargetTwo")).isEmpty())) {
						if (!entity.isShiftKeyDown()) {
							{
								Entity _ent = targetOne;
								_ent.teleportTo(xLook, xLook, xLook);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(xLook, xLook, xLook, _ent.getYRot(), _ent.getXRot());
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if ((entity.getPersistentData().getString("clapTargetOne")).equals(targetOne.getDisplayName().getString())) {
										{
											Entity _ent = entityiterator;
											_ent.teleportTo(x, y, z);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
										}
									} else if ((entity.getPersistentData().getString("clapTargetTwo")).equals(targetTwo.getDisplayName().getString())) {
										{
											Entity _ent = entityiterator;
											_ent.teleportTo(x, y, z);
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
										}
									}
								}
							}
							entity.getPersistentData().putString("clapTargetOne", "");
							entity.getPersistentData().putString("clapTargetTwo", "");
							entity.getPersistentData().putBoolean("clapTargetFound", false);
						} else {
							entity.getPersistentData().putString("clapTargetOne", "");
							entity.getPersistentData().putString("clapTargetTwo", "");
							entity.getPersistentData().putBoolean("clapTargetFound", false);
						}
					} else {
						if (entity.isShiftKeyDown()) {
							if (!((entity.getPersistentData().getString("clapTargetOne")).equals(entity.getDisplayName().getString()) || (entity.getPersistentData().getString("clapTargetTwo")).equals(entity.getDisplayName().getString()))) {
								if ((entity.getPersistentData().getString("clapTargetOne")).isEmpty()) {
									targetOne = entity;
									entity.getPersistentData().putString("clapTargetOne", (entity.getDisplayName().getString()));
								} else {
									targetTwo = entity;
									entity.getPersistentData().putString("clapTargetTwo", (entity.getDisplayName().getString()));
								}
							}
						} else {
							{
								final Vec3 _center = new Vec3(xLook, yLook, zLook);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!entity.getPersistentData().getBoolean("clapTargetFound")) {
										entity.getPersistentData().putBoolean("clapTargetFound", true);
										if ((entity.getPersistentData().getString("clapTargetOne")).isEmpty()) {
											targetOne = entityiterator;
											entity.getPersistentData().putString("clapTargetOne", (entityiterator.getDisplayName().getString()));
										} else {
											targetTwo = entityiterator;
											entity.getPersistentData().putString("clapTargetTwo", (entityiterator.getDisplayName().getString()));
										}
									}
								}
							}
						}
					}
					entity.getPersistentData().putDouble(("cooldown" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("coolset"))),
							(10 * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 20)));
				} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy < 20
						* ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10)) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(
								("You need " + new java.text.DecimalFormat("#").format(20 * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10))
										+ " cursed energy to use this move.")),
								true);
				}
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
