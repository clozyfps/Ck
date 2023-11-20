
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;
import net.mcreator.craftkaisen.client.model.Modelnewmuzi;

public class MalevolentShrineRenderer extends MobRenderer<MalevolentShrineEntity, Modelnewmuzi<MalevolentShrineEntity>> {
	public MalevolentShrineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnewmuzi(context.bakeLayer(Modelnewmuzi.LAYER_LOCATION)), 20f);
	}

	@Override
	public ResourceLocation getTextureLocation(MalevolentShrineEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/sukunasshieinetexture.png");
	}
}
