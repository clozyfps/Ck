
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.InventoryCurseMobEntity;
import net.mcreator.craftkaisen.client.model.Modelinventorycurseground;

public class InventoryCurseMobRenderer extends MobRenderer<InventoryCurseMobEntity, Modelinventorycurseground<InventoryCurseMobEntity>> {
	public InventoryCurseMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinventorycurseground(context.bakeLayer(Modelinventorycurseground.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InventoryCurseMobEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/inventorycursetexture.png");
	}
}
