
package net.mcreator.craftkaisen.client.renderer;

public class MaxMeteorRenderer extends MobRenderer<MaxMeteorEntity, Modelmaximummeteornewwww<MaxMeteorEntity>> {

	public MaxMeteorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaximummeteornewwww(context.bakeLayer(Modelmaximummeteornewwww.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MaxMeteorEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/maximummeteor.png");
	}

}
