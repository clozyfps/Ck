package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Slot2CSMProcedureProcedure {
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
if (!().isEmpty()) {if (world instanceof ServerLevel _level)
_level.getServer().getCommands().performPrefixedCommand(
new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), ("summon "+));CraftKaisenMod.queueServerWork(5, () -> {
if (!world.getEntitiesOfClass(LivingEntity.class,
AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true)
.isEmpty()&&(((Entity) world.getEntitiesOfClass(LivingEntity.class,
AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).getDisplayName().getString()).equals()) {((Entity) world.getEntitiesOfClass(LivingEntity.class,
AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("csmtame", (entity.getDisplayName().getString()));}
});
}
}
}
