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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelcustom_model"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart RightArm3;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelcustom_model(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.RightArm3 = root.getChild("RightArm3");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 52).mirror().addBox(-0.75F, -0.5F, 0.0F, 1.5F, 0.75F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3553F, -2.4547F, -4.1428F, 0.1712F, -0.1044F, -0.4641F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 58).addBox(-2.2F, -8.7F, -3.375F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1869F, 0.0163F, -0.5657F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 7).mirror().addBox(-4.0F, -4.0F, 4.75F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 7).mirror().addBox(-4.0F, -2.5F, 2.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(40, 7).mirror().addBox(-4.0F, -0.75F, -0.25F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 7).addBox(-4.0F, -1.75F, 1.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(40, 7).addBox(-4.0F, -3.0F, 3.25F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 7).addBox(-4.0F, -0.25F, -1.5F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.5F, -1.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 7).mirror().addBox(-5.0F, -2.0F, 0.5F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.5F, -8.25F, -1.0F, 0.0F, 1.5708F, -0.3054F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 7).addBox(-3.0F, -2.0F, 0.5F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -8.25F, -1.0F, 0.0F, -1.5708F, 0.3054F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-4.0F, 2.0F, -1.0F, -0.5201F, 0.1812F, 1.0507F));
		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3561F, 0.4887F, -0.8337F));
		PartDefinition cube_r6 = RightArm2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 52).mirror().addBox(-2.75F, -1.0F, -1.5F, 3.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, 12.0F, -7.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition bone = RightArm.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3495F, 10.7581F, -0.7761F, -0.0524F, -0.0873F, -0.3491F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(44, 48).mirror().addBox(-2.0F, 0.75F, -18.0F, 6.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 56).mirror()
						.addBox(0.0F, 0.75F, -11.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 56).mirror().addBox(0.0F, 0.75F, -3.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 55).mirror()
						.addBox(0.0F, 0.75F, 21.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 56).mirror().addBox(0.0F, 0.75F, 13.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(42, 56).mirror()
						.addBox(0.0F, 0.75F, 5.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5875F, -1.23F, -4.7465F, -0.0005F, 0.1764F, 0.275F));
		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(31, 50).mirror().addBox(-4.0F, -0.025F, -2.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(31, 50).mirror()
				.addBox(-4.0F, 0.025F, -2.0F, 2.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7123F, 0.7588F, -12.6912F, -0.0029F, -1.3944F, 0.278F));
		PartDefinition RightArm3 = partdefinition.addOrReplaceChild("RightArm3", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 32).mirror()
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(4.0F, 2.0F, -1.0F, -0.5201F, -0.1812F, -1.0507F));
		PartDefinition RightArm4 = RightArm3.addOrReplaceChild("RightArm4", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 32).mirror()
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3561F, -0.4887F, 0.8337F));
		PartDefinition bone2 = RightArm3.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3495F, 10.7581F, -0.7761F, -0.0524F, 0.0873F, 0.3491F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
