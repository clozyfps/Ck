
package net.mcreator.craftkaisen.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.craftkaisen.procedures.SetTenShadowsProcedure;
import net.mcreator.craftkaisen.procedures.SetSukunaProcedure;
import net.mcreator.craftkaisen.procedures.SetStrengthStatProcedure;
import net.mcreator.craftkaisen.procedures.SetStrawDollProcedure;
import net.mcreator.craftkaisen.procedures.SetSpeedStatProcedure;
import net.mcreator.craftkaisen.procedures.SetSkillPointsProcedure;
import net.mcreator.craftkaisen.procedures.SetSixEyesProcedure;
import net.mcreator.craftkaisen.procedures.SetPhysicallyGiftedProcedure;
import net.mcreator.craftkaisen.procedures.SetNoEnergyProcedure;
import net.mcreator.craftkaisen.procedures.SetMiracleProcedure;
import net.mcreator.craftkaisen.procedures.SetLimitlessProcedure;
import net.mcreator.craftkaisen.procedures.SetLevelProcedure;
import net.mcreator.craftkaisen.procedures.SetInverseProcedure;
import net.mcreator.craftkaisen.procedures.SetHumanProcedure;
import net.mcreator.craftkaisen.procedures.SetHealthStatProcedure;
import net.mcreator.craftkaisen.procedures.SetFragileBodyProcedure;
import net.mcreator.craftkaisen.procedures.SetExpProcedure;
import net.mcreator.craftkaisen.procedures.SetEnergyControlProcedure;
import net.mcreator.craftkaisen.procedures.SetDisasterPlantsProcedure;
import net.mcreator.craftkaisen.procedures.SetDisasterFlamesProcedure;
import net.mcreator.craftkaisen.procedures.SetCursedSpeechProcedure;
import net.mcreator.craftkaisen.procedures.SetCursedEnergyStatProcedure;
import net.mcreator.craftkaisen.procedures.SetCurseProcedure;
import net.mcreator.craftkaisen.procedures.SetCopyProcedure;
import net.mcreator.craftkaisen.procedures.SetCSMProcedure;
import net.mcreator.craftkaisen.procedures.SetBoogieWoogieProcedure;
import net.mcreator.craftkaisen.procedures.SetBloodManipulationProcedure;
import net.mcreator.craftkaisen.procedures.ResetButtonProcedure;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class SetCommandCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("craftKaisen").requires(s -> s.hasPermission(2)).then(Commands.literal("Technique").then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("Limitless").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetLimitlessProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("CursedSpeech").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetCursedSpeechProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("Sukuna").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetSukunaProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("Copy").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetCopyProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("BloodManipulation").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetBloodManipulationProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("Miracle").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetMiracleProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("Inverse").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetInverseProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("TenShadows").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetTenShadowsProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("StrawDoll").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetStrawDollProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("DisasterFlames").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetDisasterFlamesProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("DisasterPlants").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetDisasterPlantsProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("CursedSpiritManipulation").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetCSMProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("BoogieWoogie").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetBoogieWoogieProcedure.execute(entity);
					return 0;
				})))).then(Commands.literal("Race").then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("Human").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetHumanProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("Curse").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetCurseProcedure.execute(entity);
					return 0;
				})))).then(Commands.literal("Stat").then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("CursedEnergy").then(Commands.argument("cursedEnergy", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetCursedEnergyStatProcedure.execute(arguments);
					return 0;
				}))).then(Commands.literal("Strength").then(Commands.argument("strength", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetStrengthStatProcedure.execute(arguments);
					return 0;
				}))).then(Commands.literal("Speed").then(Commands.argument("speed", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetSpeedStatProcedure.execute(arguments);
					return 0;
				}))).then(Commands.literal("Health").then(Commands.argument("health", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetHealthStatProcedure.execute(arguments);
					return 0;
				}))).then(Commands.literal("EnergyControl").then(Commands.argument("energyControl", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetEnergyControlProcedure.execute(arguments);
					return 0;
				}))).then(Commands.literal("SkillPoints").then(Commands.argument("skillPoints", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetSkillPointsProcedure.execute(arguments);
					return 0;
				}))).then(Commands.literal("Level").then(Commands.argument("Level", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetLevelProcedure.execute(arguments);
					return 0;
				}))).then(Commands.literal("Experience").then(Commands.argument("Exp", DoubleArgumentType.doubleArg()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetExpProcedure.execute(arguments);
					return 0;
				}))))).then(Commands.literal("Special").then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("SixEyes").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetSixEyesProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("PhysicallyGifted").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetPhysicallyGiftedProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("NoEnergy").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetNoEnergyProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("FragileBody").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					SetFragileBodyProcedure.execute(entity);
					return 0;
				})))).then(Commands.literal("Reset").then(Commands.argument("name", EntityArgument.player()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					ResetButtonProcedure.execute(entity);
					return 0;
				}))));
	}
}
