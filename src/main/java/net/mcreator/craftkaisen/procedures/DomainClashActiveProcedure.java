package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DomainClashActiveProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if (entity.getPersistentData().getBoolean("domainclash")==true) {if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,5,250, false, false));if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,5,250, false, false));entity.getPersistentData().putDouble("domainclashtimer", (entity.getPersistentData().getDouble("domainclashtimer")+1));if (entity.getPersistentData().getDouble("domainclashtimer")>=200) {{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (!(entity == entityiterator)) {if (entityiterator.getPersistentData().getBoolean("domainclash")==true) {if (>) {entity.getPersistentData().putBoolean("domainclash", false);entityiterator.getPersistentData().putBoolean("domainclash", false);entityiterator.getPersistentData().putDouble("domainclashtimer", 0);}}}
}
}
entity.getPersistentData().putBoolean("domainclash", false);if(entity instanceof Player _player) _player.closeContainer();entity.getPersistentData().putDouble("domainclashtimer", 0);}if (!(entity instanceof Player _plr ? _plr.containerMenu instanceof DomainClashMenu : false)) {{
if(entity instanceof ServerPlayer _ent) {
BlockPos _bpos = new BlockPos(x,y,z);
NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
@Override public Component getDisplayName() {
return Component.literal("DomainClash");
}
@Override public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
return new DomainClashMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
}
}, _bpos);
}
}
if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 20, 15, 0.2, 15, 0);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
SoundSource.NEUTRAL, 1, 1, false);
}
}}}
}
}
