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
public class Modelsorcerernew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelsorcerernew"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelsorcerernew(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 48).addBox(-4.2F, -4.8F, -4.2F, 8.4F, 1.9F, 8.4F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Body_r1 = Head.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(47, 0).addBox(6.0F, -1.05F, -2.125F, 0.5F, 0.5F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 2.4F, -2.375F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 10).addBox(-4.1F, -0.1F, -2.1F, 8.2F, 12.2F, 4.2F, new CubeDeformation(0.0F)).texOffs(36, 30).addBox(-4.1F, 4.9F, -2.25F, 6.7F, 2.95F, 0.15F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-4.1F, 7.85F, -2.25F, 7.2F, 4.25F, 0.15F, new CubeDeformation(0.0F)).texOffs(36, 27).addBox(-4.1F, 1.9F, -2.25F, 7.2F, 3.0F, 0.15F, new CubeDeformation(0.0F)).texOffs(24, 20)
						.addBox(-4.1F, -0.1F, -2.25F, 6.2F, 2.0F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(0, 2).addBox(-4.6F, 0.0F, -0.075F, 1.45F, 1.825F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9566F, 4.7185F, -2.175F, 0.0F, 0.0F, -0.5105F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(2, 0).addBox(-0.85F, -1.0F, -0.075F, 1.45F, 1.825F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0879F, 5.4793F, -2.175F, 0.0F, 0.0F, 0.5105F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.85F, -1.0F, -0.075F, 1.45F, 2.25F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0143F, 1.063F, -2.175F, 0.0F, 0.0F, -0.4669F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(44, 0).addBox(0.0F, -0.3F, -0.125F, 0.5F, 0.5F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 2.4F, -2.375F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(28, 52).addBox(-4.6F, -2.125F, -0.075F, 8.2F, 1.25F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 14.2204F, 2.2584F, 0.0393F, 0.0F, 0.0F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(2, 2).addBox(-0.5F, -0.625F, 0.0F, 1.0F, 1.25F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 12.7245F, -2.1245F, -0.0393F, 0.0F, 0.0F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(24, 5).addBox(-3.6F, -2.125F, -0.075F, 7.2F, 1.25F, 0.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 14.2204F, -2.2584F, -0.0393F, 0.0F, 0.0F));
		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -0.625F, -2.1F, 0.0F, 1.25F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1F, 12.725F, 0.0F, 0.0F, 0.0F, 0.1134F));
		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(0, 1).addBox(0.05F, -0.625F, -2.1F, 0.0F, 1.25F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1F, 12.725F, 0.0F, 0.0F, 0.0F, -0.1134F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 26).addBox(-1.2F, -2.1F, -2.2F, 4.4F, 11.0F, 4.4F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(20, 22).addBox(-3.2F, -2.1F, -2.2F, 4.4F, 11.0F, 4.4F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(32, 33).addBox(-2.1F, 0.0F, -2.1F, 4.2F, 10.0F, 4.2F, new CubeDeformation(0.0F)).texOffs(45, 57).addBox(-2.1F, 10.425F, -2.9F, 4.2F, 1.6F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(28, 6).addBox(-2.1F, 0.0F, -2.1F, 4.2F, 10.0F, 4.2F, new CubeDeformation(0.0F)).texOffs(45, 57).mirror().addBox(-2.1F, 10.425F, -2.9F, 4.2F, 1.6F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
