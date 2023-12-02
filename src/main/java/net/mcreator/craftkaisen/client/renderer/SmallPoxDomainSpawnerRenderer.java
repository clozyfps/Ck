
package net.mcreator.craftkaisen.client.renderer;

public class SmallPoxDomainSpawnerRenderer extends HumanoidMobRenderer<SmallPoxDomainSpawnerEntity, HumanoidModel<SmallPoxDomainSpawnerEntity>> {

	public SmallPoxDomainSpawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(SmallPoxDomainSpawnerEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/a2ie_layer_2.png");
	}

}
