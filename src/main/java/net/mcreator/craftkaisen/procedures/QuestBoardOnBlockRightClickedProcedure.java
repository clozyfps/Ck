package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class QuestBoardOnBlockRightClickedProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
double random = 0;double grade3 = 0;double grade2 = 0;double grade1 = 0;double specialgrade = 0;
if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {{
boolean _setval = true;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.DoingMission = _setval;
capability.syncPlayerVariables(entity);
});
}if (().equals("Grade 4")) {random = Mth.nextInt(RandomSource.create(), 1, 3);if (random==1) {{
String _setval = "Exorcise 5 Cursed Spirits "+entity.getPersistentData().getDouble("exorcise5spirits")+"/5";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (random==2) {{
String _setval = "Exorcise 2 Cursed Spirits "+entity.getPersistentData().getDouble("exorcise2spirits")+"/2";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (random==3) {{
String _setval = "Exorcise a Cursed Spirit without taking damage";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}}else if (().equals("Grade 3")) {random = Mth.nextInt(RandomSource.create(), 1, 4);if (random==1) {{
String _setval = "Execute 5 Evil Mobs "+entity.getPersistentData().getDouble("execute5mobs")+"/5";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (random==2) {{
String _setval = "Exorcise a Finger Bearer";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (random==3) {{
String _setval = "Deliver the medicine to a hospital";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (random==4) {{
String _setval = "Find a Cursed Tool";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}}else if (().equals("Semi Grade 2")||().equals("Grade 2")) {random = Mth.nextInt(RandomSource.create(), 1, 4);if (random==1) {{
String _setval = "Escort The Star Plasma Vessel";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (random==2) {{
String _setval = "tf";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (random==3) {{
String _setval = "Deliver the medicine to a hospital";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}else if (random==4) {{
String _setval = "Find a Cursed Tool";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.CurrentMission = _setval;
capability.syncPlayerVariables(entity);
});
}}}}
}
}
