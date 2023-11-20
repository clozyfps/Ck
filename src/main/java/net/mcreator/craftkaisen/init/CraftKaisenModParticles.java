
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftkaisen.client.particle.SoundWaveParticle;
import net.mcreator.craftkaisen.client.particle.SnowflakeParticle;
import net.mcreator.craftkaisen.client.particle.RedParticleParticle;
import net.mcreator.craftkaisen.client.particle.PurplePulseParticle;
import net.mcreator.craftkaisen.client.particle.PurpleParticleParticle;
import net.mcreator.craftkaisen.client.particle.PurpleElectricityParticleParticle;
import net.mcreator.craftkaisen.client.particle.PurpleElectricityParticle;
import net.mcreator.craftkaisen.client.particle.PunchImpactParticle;
import net.mcreator.craftkaisen.client.particle.NueElectricityParticle;
import net.mcreator.craftkaisen.client.particle.MistPurpleParticle;
import net.mcreator.craftkaisen.client.particle.LapseParticleParticle;
import net.mcreator.craftkaisen.client.particle.InfinityParticleParticle;
import net.mcreator.craftkaisen.client.particle.FireArrowParticleParticle;
import net.mcreator.craftkaisen.client.particle.EvadeParticleParticle;
import net.mcreator.craftkaisen.client.particle.ClashParticleParticle;
import net.mcreator.craftkaisen.client.particle.BlueParticleParticle;
import net.mcreator.craftkaisen.client.particle.BloodSplashParticle;
import net.mcreator.craftkaisen.client.particle.BloodParticle;
import net.mcreator.craftkaisen.client.particle.BlackFlashPulseParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftKaisenModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(CraftKaisenModParticleTypes.PURPLE_ELECTRICITY.get(), PurpleElectricityParticle::provider);
		event.register(CraftKaisenModParticleTypes.SNOWFLAKE.get(), SnowflakeParticle::provider);
		event.register(CraftKaisenModParticleTypes.SOUND_WAVE.get(), SoundWaveParticle::provider);
		event.register(CraftKaisenModParticleTypes.RED_PARTICLE.get(), RedParticleParticle::provider);
		event.register(CraftKaisenModParticleTypes.BLOOD.get(), BloodParticle::provider);
		event.register(CraftKaisenModParticleTypes.BLUE_PARTICLE.get(), BlueParticleParticle::provider);
		event.register(CraftKaisenModParticleTypes.INFINITY_PARTICLE.get(), InfinityParticleParticle::provider);
		event.register(CraftKaisenModParticleTypes.FIRE_ARROW_PARTICLE.get(), FireArrowParticleParticle::provider);
		event.register(CraftKaisenModParticleTypes.NUE_ELECTRICITY.get(), NueElectricityParticle::provider);
		event.register(CraftKaisenModParticleTypes.BLACK_FLASH_PULSE.get(), BlackFlashPulseParticle::provider);
		event.register(CraftKaisenModParticleTypes.CLASH_PARTICLE.get(), ClashParticleParticle::provider);
		event.register(CraftKaisenModParticleTypes.PUNCH_IMPACT.get(), PunchImpactParticle::provider);
		event.register(CraftKaisenModParticleTypes.BLOOD_SPLASH.get(), BloodSplashParticle::provider);
		event.register(CraftKaisenModParticleTypes.MIST_PURPLE.get(), MistPurpleParticle::provider);
		event.register(CraftKaisenModParticleTypes.PURPLE_PULSE.get(), PurplePulseParticle::provider);
		event.register(CraftKaisenModParticleTypes.EVADE_PARTICLE.get(), EvadeParticleParticle::provider);
		event.register(CraftKaisenModParticleTypes.LAPSE_PARTICLE.get(), LapseParticleParticle::provider);
		event.register(CraftKaisenModParticleTypes.PURPLE_PARTICLE.get(), PurpleParticleParticle::provider);
		event.register(CraftKaisenModParticleTypes.PURPLE_ELECTRICITY_PARTICLE.get(), PurpleElectricityParticleParticle::provider);
	}
}
