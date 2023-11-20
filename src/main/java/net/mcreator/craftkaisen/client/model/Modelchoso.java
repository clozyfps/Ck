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
public class Modelchoso<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelchoso"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart Body;
	public final ModelPart Head;

	public Modelchoso(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(105, 35).addBox(-2.1F, 0.0F, -2.35F, 4.6F, 9.75F, 4.7F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(105, 35).mirror().addBox(-2.5F, 0.0F, -2.35F, 4.6F, 9.75F, 4.7F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(20, 45).addBox(-3.5F, -2.1F, -2.5F, 5.0F, 8.55F, 5.0F, new CubeDeformation(0.0F)).texOffs(67, 11).addBox(-1.0F, -2.25F, -2.625F, 3.5F, 2.5F, 5.15F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(68, 52).addBox(-1.6F, 2.2F, -2.2F, 4.75F, 1.3F, 4.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 41).addBox(3.5F, -2.1F, -2.5F, 5.0F, 8.55F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 44).addBox(2.5F, -2.25F, -2.625F, 3.5F, 2.5F, 5.15F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(-3.15F, 2.2F, -2.2F, 4.75F, 1.3F, 4.35F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.0F, 3.5F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(89, 1).addBox(-4.075F, 4.0F, -2.675F, 8.15F, 8.1F, 5.275F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-4.075F, 0.0F, 1.325F, 8.15F, 4.0F, 1.275F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-2.0F, 12.1F, -2.5F, 4.0F, 2.5F, 0.75F, new CubeDeformation(0.0F)).texOffs(15, 41).addBox(-2.0F, 12.1F, 1.75F, 4.0F, 2.5F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(54, 17).mirror().addBox(-2.75F, -3.25F, -2.65F, 3.75F, 5.75F, 5.225F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 3.5F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(54, 17).addBox(-1.0F, -3.25F, -2.65F, 3.75F, 5.75F, 5.225F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.75F, -1.25F, 1.75F, 3.25F, 2.5F, 0.725F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-1.75F, -1.25F, -2.475F, 3.25F, 2.5F, 0.725F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9215F, 12.649F, 0.0F, 0.0F, 0.0F, 0.9163F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.25F, 1.75F, 3.25F, 2.5F, 0.725F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-1.5F, -1.25F, -2.475F, 3.25F, 2.5F, 0.725F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9215F, 12.649F, 0.0F, 0.0F, 0.0F, -0.9163F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r5 = Head.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(0, 16).addBox(-4.35F, -1.25F, -4.25F, 8.7F, 2.75F, 8.9F, new CubeDeformation(0.0F)).texOffs(89, 53)
				.addBox(-4.5F, -1.0F, -4.5F, 9.0F, 1.0F, 9.25F, new CubeDeformation(0.0F)).texOffs(86, 18).addBox(-4.5F, 0.25F, -4.5F, 9.0F, 1.0F, 9.25F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
