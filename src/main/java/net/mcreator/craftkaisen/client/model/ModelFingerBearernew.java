package net.mcreator.craftkaisen.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFingerBearernew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_finger_bearernew"), "main");
	public final ModelPart head;
	public final ModelPart left_arm;
	public final ModelPart right_arm;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	public final ModelPart Body;

	public ModelFingerBearernew(ModelPart root) {
		this.head = root.getChild("head");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(9, 41).addBox(-3.0F, -8.5F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 24)
						.addBox(-3.0F, -8.0F, -4.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 22).addBox(-2.5F, -7.25F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(1.5F, -7.25F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 22).addBox(1.5F, -9.0F, -3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 6)
						.addBox(-2.5F, -9.0F, -3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 6).addBox(-2.5F, -9.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 19)
						.addBox(1.5F, -9.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-1.75F, -9.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 3)
						.addBox(0.75F, -9.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 7).addBox(1.0F, -8.0F, -4.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(1.0F, -6.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 16).addBox(-2.0F, -6.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(1.0F, -8.5F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-1.0F, -8.55F, 2.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 17)
						.addBox(3.5F, -6.0F, -3.95F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 7).addBox(-4.5F, -6.0F, -3.95F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(3.05F, -5.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-4.05F, -5.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
						.addBox(-1.5F, 0.6486F, 3.823F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 34).addBox(-1.0F, -4.2567F, 3.6525F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(35, 0).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 7.0465F, 4.5766F, 0.1745F, 0.0F, 0.0F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(41, 46).addBox(-0.5F, 11.75F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -7.1439F, 3.7951F, 0.0873F, 0.0F, 0.0F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(48, 34).addBox(-1.0F, 4.75F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0757F, 4.2347F, 0.0873F, 0.0F, 0.0F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(10, 47).addBox(-1.0F, -2.25F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 4.5F, 0.0873F, 0.0F, 0.0F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(36, 46).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4487F, -5.9454F, 3.8945F, 1.7083F, 1.2624F, 1.715F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(22, 28).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8036F, -5.8928F, 3.7275F, 0.3674F, 0.5788F, 0.2075F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.502F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 46).addBox(-8.498F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -5.4048F, 2.1799F, 0.3054F, 0.0F, 0.0F));
		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(44, 46).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4487F, -5.9454F, 3.8945F, 1.7083F, -1.2624F, -1.715F));
		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(20, 32).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8036F, -5.8928F, 3.7275F, 0.3674F, -0.5788F, -0.2075F));
		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(15, 28).addBox(-1.0F, -0.498F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4598F, -8.0F, 1.9368F, 0.0F, -0.4363F, 0.0F));
		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(35, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1049F, -8.0F, 3.3924F, 0.0F, -1.2654F, 0.0F));
		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(20, 35).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1049F, -8.0F, 3.3924F, 0.0F, 1.2654F, 0.0F));
		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(46, 0).addBox(-1.0F, -0.498F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4598F, -8.0F, 1.9368F, 0.0F, 0.4363F, 0.0F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(30, 11).addBox(-1.5F, -2.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(6.5F, 0.0F, 0.0F));
		PartDefinition lowerarm = left_arm.addOrReplaceChild("lowerarm", CubeListBuilder.create().texOffs(36, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 3.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(30, 11).mirror().addBox(-3.5F, -2.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-6.5F, 0.0F, 0.0F));
		PartDefinition lowerarm2 = right_arm.addOrReplaceChild("lowerarm2", CubeListBuilder.create().texOffs(36, 34).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.0F, 3.0F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 28).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 11.0F, 0.0F));
		PartDefinition lowerleg = left_leg.addOrReplaceChild("lowerleg",
				CubeListBuilder.create().texOffs(20, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 7).addBox(-2.0F, 6.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-2.5F, 0.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 11.0F, 0.0F));
		PartDefinition lowerleg2 = right_leg.addOrReplaceChild("lowerleg2", CubeListBuilder.create().texOffs(20, 34).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 7).mirror()
				.addBox(-2.0F, 6.0F, -4.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition torso = Body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(26, 24).addBox(-4.0F, 7.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -26.0F, 0.0F));
		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.5F, -2.5F, -0.1309F, 0.0F, 0.0F));
		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(24, 0).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 9.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(35, 1).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, 9.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition uppertorso = torso.addOrReplaceChild("uppertorso", CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, -7.0F, -2.5F, 10.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
