package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SukunaFingerPlayerFinishesUsingItemProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if (<=0) {if (Math.random()<0.08) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("\u00A7l\u00A74I feel more powerful.."), true);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:sukuna")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:sukuna")),
SoundSource.NEUTRAL, 1, 1, false);
}
}if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.elder_guardian.curse")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.elder_guardian.curse")),
SoundSource.NEUTRAL, 1, 1, false);
}
}if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS,30,1, false, false));{
double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).cursedEnergyStat+50;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.cursedEnergyStat = _setval;
capability.syncPlayerVariables(entity);
});
}if (entity instanceof LivingEntity _entity) {
ItemStack _setstack = new ItemStack(Blocks.AIR);
_setstack.setCount(1);
_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
if (_entity instanceof Player _player) _player.getInventory().setChanged();
}}else{entity.kill();
if (entity instanceof LivingEntity _entity) {
ItemStack _setstack = new ItemStack(Blocks.AIR);
_setstack.setCount(1);
_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
if (_entity instanceof Player _player) _player.getInventory().setChanged();
}if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((entity.getDisplayName().getString()+" Failed to eat a Sukuna Finger.")), false);}}
}
}
