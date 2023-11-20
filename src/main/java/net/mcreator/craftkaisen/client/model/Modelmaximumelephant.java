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
public class Modelmaximumelephant<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelmaximumelephant"), "main");
	public final ModelPart Head;
	public final ModelPart BackLeftLeg;
	public final ModelPart BackRightLeg;
	public final ModelPart elephantfron;
	public final ModelPart FrontLeftLeg;
	public final ModelPart FrontRightLeg;

	public Modelmaximumelephant(ModelPart root) {
		this.Head = root.getChild("Head");
		this.BackLeftLeg = root.getChild("BackLeftLeg");
		this.BackRightLeg = root.getChild("BackRightLeg");
		this.elephantfron = root.getChild("elephantfron");
		this.FrontLeftLeg = root.getChild("FrontLeftLeg");
		this.FrontRightLeg = root.getChild("FrontRightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 58).addBox(-7.0F, -14.0F, -10.0F, 14.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -12.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition elephant10 = Head.addOrReplaceChild("elephant10", CubeListBuilder.create().texOffs(0, 82).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -6.7F, -0.6981F, 0.0F, 0.0F));
		PartDefinition elephant11 = elephant10.addOrReplaceChild("elephant11", CubeListBuilder.create().texOffs(60, 93).addBox(-3.5F, 0.0F, -4.0F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition elephant12 = elephant11.addOrReplaceChild("elephant12", CubeListBuilder.create().texOffs(0, 112).addBox(-3.0F, 1.0F, -3.5F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.1F, -0.7F, 0.2618F, 0.0F, 0.0F));
		PartDefinition elephant13 = elephant12.addOrReplaceChild("elephant13", CubeListBuilder.create().texOffs(114, 39).addBox(-2.5F, 0.0F, -2.9F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -0.7F, 0.3054F, 0.0F, 0.0F));
		PartDefinition elephant14 = elephant13.addOrReplaceChild("elephant14", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -2.9F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition elephant15 = elephant14.addOrReplaceChild("elephant15", CubeListBuilder.create().texOffs(0, 125).addBox(-2.0F, -1.0F, -1.9F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -1.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition elephant2 = Head.addOrReplaceChild("elephant2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, -10.0F, -2.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition oreja0_r1 = elephant2.addOrReplaceChild("oreja0_r1", CubeListBuilder.create().texOffs(44, 40).addBox(-2.25F, -1.75F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(9.4677F, 6.4012F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition oreja0_r2 = elephant2.addOrReplaceChild("oreja0_r2",
				CubeListBuilder.create().texOffs(44, 37).addBox(-8.0F, 6.0F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 33).addBox(-8.425F, -5.85F, -0.5F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)).texOffs(72, 108)
						.addBox(3.575F, -5.85F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(111, 50).addBox(-8.0F, -6.0F, -0.5F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition elephant3 = Head.addOrReplaceChild("elephant3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0F, -10.0F, -2.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition oreja1_r1 = elephant3.addOrReplaceChild("oreja1_r1", CubeListBuilder.create().texOffs(0, 40).addBox(-2.8F, -1.75F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-9.4677F, 6.4012F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition oreja1_r2 = elephant3.addOrReplaceChild("oreja1_r2",
				CubeListBuilder.create().texOffs(66, 15).addBox(0.0F, 6.0F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 35).addBox(-3.575F, -5.85F, -0.5F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)).texOffs(28, 98)
						.addBox(-4.575F, -5.85F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(107, 26).addBox(-4.0F, -6.0F, -0.5F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition elephant4 = Head.addOrReplaceChild("elephant4", CubeListBuilder.create().texOffs(72, 33).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(5.3F, -1.1F, -6.7F, -0.7854F, -0.0873F, 0.0F));
		PartDefinition colmillo0_r1 = elephant4.addOrReplaceChild("colmillo0_r1", CubeListBuilder.create().texOffs(54, 91).addBox(-1.0F, 4.65F, 3.075F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition colmillo0_r2 = elephant4.addOrReplaceChild("colmillo0_r2", CubeListBuilder.create().texOffs(96, 15).addBox(-1.25F, 3.05F, -0.05F, 2.5F, 4.0F, 2.5F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition elephant5 = Head.addOrReplaceChild("elephant5", CubeListBuilder.create().texOffs(0, 31).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-5.3F, -1.1F, -6.7F, -0.7854F, 0.0873F, 0.0F));
		PartDefinition colmillo1_r1 = elephant5.addOrReplaceChild("colmillo1_r1", CubeListBuilder.create().texOffs(37, 83).addBox(-1.0F, 4.65F, 3.075F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition colmillo1_r2 = elephant5.addOrReplaceChild("colmillo1_r2", CubeListBuilder.create().texOffs(86, 50).addBox(-1.25F, 3.05F, -0.05F, 2.5F, 4.0F, 2.5F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition BackLeftLeg = partdefinition.addOrReplaceChild("BackLeftLeg", CubeListBuilder.create(), PartPose.offset(5.0F, 4.25F, 11.5F));
		PartDefinition leg2_r1 = BackLeftLeg.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(86, 33).addBox(-4.5F, -10.0F, -0.7F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(1.0F, 9.75F, -4.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition elephantreal = BackLeftLeg.addOrReplaceChild("elephantreal",
				CubeListBuilder.create().texOffs(118, 63).addBox(-3.0F, -0.25F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(102, 77).addBox(-3.5F, 6.75F, -3.9F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, -1.0F));
		PartDefinition BackRightLeg = partdefinition.addOrReplaceChild("BackRightLeg", CubeListBuilder.create(), PartPose.offset(-5.0F, 4.25F, 11.5F));
		PartDefinition leg3_r1 = BackRightLeg.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(81, 83).addBox(-4.5F, -10.0F, -0.7F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(1.0F, 9.75F, -4.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition elephantfake = BackRightLeg.addOrReplaceChild("elephantfake",
				CubeListBuilder.create().texOffs(114, 114).addBox(-3.0F, -0.25F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(-3.5F, 6.75F, -3.9F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, -1.0F));
		PartDefinition elephantfron = partdefinition.addOrReplaceChild("elephantfron",
				CubeListBuilder.create().texOffs(40, 42).addBox(-7.5F, -14.5F, -10.5F, 15.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.5F, -13.7F, -11.0F, 17.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, -1.0F));
		PartDefinition body_r1 = elephantfron.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(55, 20).addBox(-7.5F, -1.0F, -5.5F, 15.0F, 2.0F, 11.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -12.5F, 10.5F, -0.0873F, 0.0F, 0.0F));
		PartDefinition body_r2 = elephantfron.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(0, 31).addBox(-8.0F, -13.7F, 0.0F, 16.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition elephant18 = elephantfron.addOrReplaceChild("elephant18", CubeListBuilder.create().texOffs(50, 7).addBox(-1.0F, -1.0F, -0.1F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, 15.0F, -1.0908F, 0.0F, 0.0F));
		PartDefinition elephant17 = elephant18.addOrReplaceChild("elephant17", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition elephant16 = elephant17.addOrReplaceChild("elephant16",
				CubeListBuilder.create().texOffs(38, 60).addBox(-1.0F, -1.0F, -0.6F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).texOffs(0, 58).addBox(-1.0F, -1.0F, 3.3F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 4.6F, -0.0873F, 0.0F, 0.0F));
		PartDefinition elephant8 = elephantfron.addOrReplaceChild("elephant8", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, -11.0F));
		PartDefinition FrontLeftLeg = partdefinition.addOrReplaceChild("FrontLeftLeg", CubeListBuilder.create(), PartPose.offset(5.0F, 4.0F, -8.5F));
		PartDefinition leg0_r1 = FrontLeftLeg.addOrReplaceChild("leg0_r1", CubeListBuilder.create().texOffs(90, 60).addBox(-4.5F, -10.0F, -0.6F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(1.0F, 10.0F, -4.2F, -0.1309F, 0.0F, 0.0F));
		PartDefinition elephantnew = FrontLeftLeg.addOrReplaceChild("elephantnew",
				CubeListBuilder.create().texOffs(120, 97).addBox(-3.0F, -0.25F, -3.1F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(110, 10).addBox(-3.5F, 6.75F, -4.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.25F, -1.0F));
		PartDefinition FrontRightLeg = partdefinition.addOrReplaceChild("FrontRightLeg", CubeListBuilder.create(), PartPose.offset(-5.0F, 4.0F, -8.5F));
		PartDefinition leg1_r1 = FrontRightLeg.addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(32, 90).addBox(-4.5F, -10.0F, -0.6F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(1.0F, 10.0F, -4.2F, -0.1309F, 0.0F, 0.0F));
		PartDefinition elephantmom = FrontRightLeg.addOrReplaceChild("elephantmom",
				CubeListBuilder.create().texOffs(72, 119).addBox(-3.0F, -0.25F, -3.1F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(111, 87).addBox(-3.5F, 6.75F, -4.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.25F, -1.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		elephantfron.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.FrontRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.BackLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.FrontLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.BackRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
