package net.mcreator.craftkaisen.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltenshadowsgreatserpent<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modeltenshadowsgreatserpent"), "main");
	public final ModelPart serpent;

	public Modeltenshadowsgreatserpent(ModelPart root) {
		this.serpent = root.getChild("serpent");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition serpent = partdefinition.addOrReplaceChild("serpent", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.0F, 0.0F, 3.1416F, 0.0F, 3.1416F));
		PartDefinition Head = serpent.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(44, 77).addBox(-6.0F, -23.0F, -7.0F, 12.0F, 20.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(-9.725F, -3.0F, -7.0F, 19.425F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -57.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(35.025F, 6.675F, -5.425F, 0.0F, 4.25F, 2.95F, new CubeDeformation(0.0F)).texOffs(84, 94).addBox(29.0F, -5.325F, -7.425F, 6.0F, 20.25F, 7.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.4116F, -11.2139F, 0.45F, 0.0F, 0.0F, -0.1833F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 4).addBox(-35.025F, 6.675F, -5.425F, 0.0F, 4.25F, 2.95F, new CubeDeformation(0.0F)).texOffs(32, 105).addBox(-35.0F, -5.325F, -7.425F, 6.0F, 20.25F, 7.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4116F, -11.2139F, 0.45F, 0.0F, 0.0F, 0.1833F));
		PartDefinition Jaw = Head.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(86, 17).addBox(-9.725F, -5.0F, -1.0F, 19.425F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 94).addBox(-6.0F, -25.0F, -1.0F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Jaw.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 118).addBox(29.0F, -5.325F, -1.425F, 6.0F, 20.25F, 3.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.4116F, -13.2139F, 0.45F, 0.0F, 0.0F, -0.1833F));
		PartDefinition cube_r4 = Jaw.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(120, 65).addBox(-35.0F, -5.325F, -1.425F, 6.0F, 20.25F, 3.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4116F, -13.2139F, 0.45F, 0.0F, 0.0F, 0.1833F));
		PartDefinition RightEye = Head.addOrReplaceChild("RightEye", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = RightEye.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(2, 0).addBox(-35.075F, 8.175F, -4.925F, 0.0F, 1.25F, 1.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4116F, -11.2139F, 0.45F, 0.0F, 0.0F, 0.1833F));
		PartDefinition LeftEye = Head.addOrReplaceChild("LeftEye", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r6 = LeftEye.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(35.075F, 8.175F, -4.925F, 0.0F, 1.25F, 1.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.4116F, -11.2139F, 0.45F, 0.0F, 0.0F, -0.1833F));
		PartDefinition Body = serpent.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0125F, -0.25F, -5.0F, 16.0F, 17.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -51.25F, -3.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(40, 48).addBox(-7.0125F, -0.25F, -4.0F, 14.0F, 17.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(0, 31).addBox(-7.0125F, -0.25F, -4.0F, 14.0F, 17.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(0, 67).addBox(-6.0125F, -0.25F, -3.0F, 12.0F, 17.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create().texOffs(52, 21).addBox(-6.0125F, -0.25F, -3.0F, 12.0F, 17.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition Body6 = Body5.addOrReplaceChild("Body6", CubeListBuilder.create().texOffs(92, 40).addBox(-5.0125F, -0.25F, -2.0F, 10.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Body7 = Body6.addOrReplaceChild("Body7", CubeListBuilder.create().texOffs(84, 69).addBox(-5.0125F, -0.25F, -2.0F, 10.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, -0.48F));
		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create().texOffs(58, 115).addBox(-4.0125F, -0.25F, -1.0F, 8.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition Body9 = Body8.addOrReplaceChild("Body9", CubeListBuilder.create().texOffs(110, 94).addBox(-4.0125F, -0.25F, -1.0F, 8.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition Body10 = Body9.addOrReplaceChild("Body10", CubeListBuilder.create().texOffs(106, 117).addBox(-3.0125F, -0.25F, 0.0F, 6.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, 0.0F, 0.0F, 0.0F, -0.48F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		serpent.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
