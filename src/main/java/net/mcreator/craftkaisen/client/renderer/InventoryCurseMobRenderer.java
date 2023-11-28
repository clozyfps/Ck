
package net.mcreator.craftkaisen.client.renderer;

public class InventoryCurseMobRenderer extends MobRenderer<InventoryCurseMobEntity, Modelinventorycurseground<InventoryCurseMobEntity>> {

	public InventoryCurseMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinventorycurseground(context.bakeLayer(Modelinventorycurseground.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(InventoryCurseMobEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/inventorycursetexture.png");
	}

}
