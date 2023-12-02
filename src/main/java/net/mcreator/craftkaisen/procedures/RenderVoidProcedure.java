package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class RenderVoidProcedure {
	@SubscribeEvent
	public static void renderSky(RenderLevelStageEvent event) {
		try {
			if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY) {
				Minecraft minecraft = Minecraft.getInstance();
				ClientLevel clientLevel = minecraft.level;
				PoseStack poseStack = event.getPoseStack();
				Camera camera = event.getCamera();
				Entity entity = camera.getEntity();
				Vec3 cameraPos = camera.getPosition();
				Vec3 entityPos = entity.getPosition(minecraft.getPartialTick());
				RenderSystem.depthMask(false);
				RenderSystem.enableBlend();
				RenderSystem.defaultBlendFunc();
				RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.setShaderTexture(0, new ResourceLocation("minecraft", "textures/block/grass_block_side.png"));
				poseStack.pushPose();
				execute(null, clientLevel, entity, poseStack);
				poseStack.popPose();
				RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.disableBlend();
				RenderSystem.enableCull();
				RenderSystem.enableDepthTest();
				RenderSystem.depthMask(true);
			}
		} catch (Exception e) {
		}
	}

	public static void execute(LevelAccessor world, Entity entity, PoseStack pose) {
		execute(null, world, entity, pose);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, PoseStack pose) {
		if (entity == null || pose == null)
			return;
		if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("craft_kaisen:deleted_mod_element")))) {
			RenderSystem.setShaderTexture(0, new ResourceLocation(("craft_kaisen" + ":textures/" + "galaxy" + ".png")));
			{
				int _color = (int) (255 << 24 | 255 << 16 | 255 << 8 | 255);
				float _red = (_color >> 16 & 255) / 255.0F;
				float _green = (_color >> 8 & 255) / 255.0F;
				float _blue = (_color & 255) / 255.0F;
				float _alpha = (_color >>> 24) / 255.0F;
				RenderSystem.setShaderColor(_red, _green, _blue, _alpha);
			}
			(pose).popPose();
			(pose).pushPose();
			(pose).mulPose(Vector3f.YN.rotationDegrees(15));
			(pose).mulPose(Vector3f.XP.rotationDegrees(-15));
			(pose).mulPose(Vector3f.ZN.rotationDegrees(2));
			if (world instanceof ClientLevel _clientLevel) {
				RenderSystem.enableTexture();
				RenderSystem.setShader(GameRenderer::getPositionTexColorShader);
				BufferBuilder _bufferBuilder = Tesselator.getInstance().getBuilder();
				_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
				Matrix4f _matrix4f = pose.last().pose();
				float _size = 350;
				int _alpha = 255;
				_bufferBuilder.vertex(_matrix4f, _size, _size, 100.0F).uv(0.0F, 0.0F).color(255, 255, 255, _alpha).endVertex();
				_bufferBuilder.vertex(_matrix4f, _size, -_size, 100.0F).uv(0.0F, 1.0F).color(255, 255, 255, _alpha).endVertex();
				_bufferBuilder.vertex(_matrix4f, -_size, -_size, 100.0F).uv(1.0F, 1.0F).color(255, 255, 255, _alpha).endVertex();
				_bufferBuilder.vertex(_matrix4f, -_size, _size, 100.0F).uv(1.0F, 0.0F).color(255, 255, 255, _alpha).endVertex();
				BufferUploader.drawWithShader(_bufferBuilder.end());
			}
		}
	}
}
