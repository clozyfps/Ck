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
public class Modelmaximumelephantnew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelmaximumelephantnew"), "main");
	public final ModelPart BackRightLeg;
	public final ModelPart BackLeftLeg;
	public final ModelPart FrontLeftLeg;
	public final ModelPart FrontRightLeg;
	public final ModelPart Head;

	public Modelmaximumelephantnew(ModelPart root) {
		this.BackRightLeg = root.getChild("BackRightLeg");
		this.BackLeftLeg = root.getChild("BackLeftLeg");
		this.FrontLeftLeg = root.getChild("FrontLeftLeg");
		this.FrontRightLeg = root.getChild("FrontRightLeg");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition BackRightLeg = partdefinition.addOrReplaceChild("BackRightLeg", CubeListBuilder.create(), PartPose.offset(-10.0F, -15.5F, 23.0F));
		PartDefinition leg3_r1 = BackRightLeg.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(27, 75).mirror().addBox(-5.1F, -20.1F, -1.5F, 14.2F, 20.2F, 14.2F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 19.5F, -8.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition elephant5 = BackRightLeg.addOrReplaceChild("elephant5", CubeListBuilder.create().texOffs(29, 79).mirror().addBox(-6.0F, -0.5F, -6.0F, 12.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(204, 0).mirror()
				.addBox(-7.0F, 13.5F, -7.8F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 20.0F, -2.0F));
		PartDefinition BackLeftLeg = partdefinition.addOrReplaceChild("BackLeftLeg", CubeListBuilder.create(), PartPose.offset(10.0F, -15.5F, 23.0F));
		PartDefinition leg2_r1 = BackLeftLeg.addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(27, 75).addBox(-9.1F, -20.1F, -1.5F, 14.2F, 20.2F, 14.2F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(2.0F, 19.5F, -8.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition elephant24 = BackLeftLeg.addOrReplaceChild("elephant24",
				CubeListBuilder.create().texOffs(29, 79).addBox(-6.0F, -0.5F, -6.0F, 12.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(204, 0).addBox(-7.0F, 13.5F, -7.8F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, -2.0F));
		PartDefinition FrontLeftLeg = partdefinition.addOrReplaceChild("FrontLeftLeg", CubeListBuilder.create(), PartPose.offset(10.0F, -16.0F, -17.0F));
		PartDefinition leg0_r1 = FrontLeftLeg.addOrReplaceChild("leg0_r1", CubeListBuilder.create().texOffs(180, 120).addBox(-9.1F, -20.1F, -1.3F, 14.2F, 20.2F, 14.2F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(2.0F, 20.0F, -8.4F, -0.1309F, 0.0F, 0.0F));
		PartDefinition elephant20 = FrontLeftLeg.addOrReplaceChild("elephant20",
				CubeListBuilder.create().texOffs(240, 194).addBox(-6.0F, -0.5F, -6.2F, 12.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(220, 20).addBox(-7.0F, 13.5F, -8.0F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.5F, -2.0F));
		PartDefinition elephant19 = elephant20.addOrReplaceChild("elephant19",
				CubeListBuilder.create().texOffs(80, 84).addBox(-15.0F, -29.0F, -21.0F, 30.0F, 4.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-17.0F, -27.4F, -22.0F, 34.0F, 30.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, -12.5F, 17.0F));
		PartDefinition body_r1 = elephant19.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(109, 40).addBox(-15.25F, -2.25F, -11.25F, 30.5F, 4.5F, 22.5F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -25.0F, 21.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition body_r2 = elephant19.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(0, 62).addBox(-16.0F, -27.4F, 0.0F, 32.0F, 30.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition elephant18 = elephant19.addOrReplaceChild("elephant18", CubeListBuilder.create().texOffs(43, 60).addBox(-2.0F, -2.0F, -0.2F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -22.0F, 30.0F, -1.0908F, 0.0F, 0.0F));
		PartDefinition elephant17 = elephant18.addOrReplaceChild("elephant17", CubeListBuilder.create().texOffs(48, 26).addBox(-1.9F, -1.9F, -1.1F, 3.8F, 3.8F, 9.8F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition elephant16 = elephant17.addOrReplaceChild("elephant16",
				CubeListBuilder.create().texOffs(37, 80).addBox(-1.8F, -1.8F, -1.0F, 3.6F, 3.6F, 7.6F, new CubeDeformation(-0.2F)).texOffs(28, 90).addBox(-2.15F, -2.15F, 6.45F, 4.3F, 4.3F, 6.3F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 9.2F, -0.0873F, 0.0F, 0.0F));
		PartDefinition elephant8 = elephant19.addOrReplaceChild("elephant8", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, -22.0F));
		PartDefinition FrontRightLeg = partdefinition.addOrReplaceChild("FrontRightLeg", CubeListBuilder.create(), PartPose.offset(-10.0F, -16.0F, -17.0F));
		PartDefinition leg1_r1 = FrontRightLeg.addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(180, 120).mirror().addBox(-5.1F, -20.1F, -1.3F, 14.2F, 20.2F, 14.2F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 20.0F, -8.4F, -0.1309F, 0.0F, 0.0F));
		PartDefinition elephant6 = FrontRightLeg.addOrReplaceChild("elephant6", CubeListBuilder.create().texOffs(240, 194).mirror().addBox(-6.0F, -0.5F, -6.2F, 12.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(220, 20).mirror()
				.addBox(-7.0F, 13.5F, -8.0F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 20.5F, -2.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 116).addBox(-14.0F, -28.0F, -20.0F, 28.0F, 28.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.0F, -24.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition elephant10 = Head.addOrReplaceChild("elephant10", CubeListBuilder.create().texOffs(0, 164).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, -13.4F, -0.6981F, 0.0F, 0.0F));
		PartDefinition elephant11 = elephant10.addOrReplaceChild("elephant11", CubeListBuilder.create().texOffs(120, 186).addBox(-7.0F, 0.0F, -8.0F, 14.0F, 16.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition elephant12 = elephant11.addOrReplaceChild("elephant12", CubeListBuilder.create().texOffs(0, 224).addBox(-6.0F, 2.0F, -7.0F, 12.0F, 14.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.2F, -1.4F, 0.2618F, 0.0F, 0.0F));
		PartDefinition elephant13 = elephant12.addOrReplaceChild("elephant13", CubeListBuilder.create().texOffs(228, 78).addBox(-5.0F, 0.0F, -5.8F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, -1.4F, 0.3054F, 0.0F, 0.0F));
		PartDefinition elephant14 = elephant13.addOrReplaceChild("elephant14", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -5.8F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition elephant15 = elephant14.addOrReplaceChild("elephant15", CubeListBuilder.create().texOffs(1, 251).addBox(-3.75F, -1.75F, -3.55F, 7.5F, 7.5F, 7.5F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, -2.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition elephant2 = Head.addOrReplaceChild("elephant2", CubeListBuilder.create(), PartPose.offsetAndRotation(14.0F, -20.0F, -4.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition oreja0_r1 = elephant2.addOrReplaceChild("oreja0_r1", CubeListBuilder.create().texOffs(88, 80).addBox(-4.475F, -3.475F, -0.975F, 9.95F, 3.95F, 1.95F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(18.9353F, 12.8024F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition oreja0_r2 = elephant2.addOrReplaceChild("oreja0_r2",
				CubeListBuilder.create().texOffs(88, 74).addBox(-16.0F, 12.0F, -1.0F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(218, 52).addBox(-16.975F, -11.825F, -1.125F, 26.25F, 2.25F, 2.25F, new CubeDeformation(0.125F))
						.texOffs(144, 216).addBox(7.05F, -11.8F, -1.1F, 2.2F, 24.2F, 2.2F, new CubeDeformation(0.1F)).texOffs(222, 100).addBox(-16.0F, -12.0F, -1.0F, 24.0F, 24.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition elephant7 = Head.addOrReplaceChild("elephant7", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.0F, -20.0F, -4.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition oreja1_r1 = elephant7.addOrReplaceChild("oreja1_r1", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-5.475F, -3.475F, -0.975F, 9.95F, 3.95F, 1.95F, new CubeDeformation(-0.025F)).mirror(false),
				PartPose.offsetAndRotation(-18.9353F, 12.8024F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition oreja1_r2 = elephant7.addOrReplaceChild("oreja1_r2",
				CubeListBuilder.create().texOffs(88, 74).mirror().addBox(0.0F, 12.0F, -1.0F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(218, 52).mirror()
						.addBox(-9.275F, -11.825F, -1.125F, 26.25F, 2.25F, 2.25F, new CubeDeformation(0.125F)).mirror(false).texOffs(144, 216).mirror().addBox(-9.25F, -11.8F, -1.1F, 2.2F, 24.2F, 2.2F, new CubeDeformation(0.1F)).mirror(false)
						.texOffs(222, 100).mirror().addBox(-8.0F, -12.0F, -1.0F, 24.0F, 24.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition elephant3 = Head.addOrReplaceChild("elephant3", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.0F, -20.0F, -4.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition elephant4 = Head.addOrReplaceChild("elephant4", CubeListBuilder.create().texOffs(144, 66).addBox(-2.9F, 0.1F, -2.9F, 5.8F, 11.8F, 5.8F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(10.6F, -2.2F, -13.4F, -0.7854F, -0.0873F, 0.0F));
		PartDefinition colmillo0_r1 = elephant4.addOrReplaceChild("colmillo0_r1", CubeListBuilder.create().texOffs(111, 183).addBox(-1.7F, 9.6F, 6.45F, 3.4F, 7.4F, 3.4F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition colmillo0_r2 = elephant4.addOrReplaceChild("colmillo0_r2", CubeListBuilder.create().texOffs(195, 32).addBox(-2.25F, 6.35F, 0.15F, 4.5F, 7.5F, 4.5F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition elephant9 = Head.addOrReplaceChild("elephant9", CubeListBuilder.create().texOffs(144, 66).mirror().addBox(-2.9F, 0.1F, -2.9F, 5.8F, 11.8F, 5.8F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(-10.6F, -2.2F, -13.4F, -0.7854F, 0.0873F, 0.0F));
		PartDefinition colmillo1_r1 = elephant9.addOrReplaceChild("colmillo1_r1", CubeListBuilder.create().texOffs(111, 183).mirror().addBox(-1.7F, 9.6F, 6.45F, 3.4F, 7.4F, 3.4F, new CubeDeformation(-0.3F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition colmillo1_r2 = elephant9.addOrReplaceChild("colmillo1_r2", CubeListBuilder.create().texOffs(195, 32).mirror().addBox(-2.25F, 6.35F, 0.15F, 4.5F, 7.5F, 4.5F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		BackRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.FrontRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.BackLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.FrontLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.BackRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
