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

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmahoraga_wheel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelmahoraga_wheel"), "main");
	public final ModelPart Head;

	public Modelmahoraga_wheel(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition center_r1 = Head.addOrReplaceChild("center_r1",
				CubeListBuilder.create().texOffs(51, 68).addBox(-2.0F, -3.0F, -16.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 34).addBox(-2.0F, 2.0F, -16.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 77)
						.addBox(2.0F, -2.0F, -16.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 77).addBox(-3.0F, -2.0F, -16.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-2.0F, -2.0F, -17.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(77, 40).addBox(-3.0F, -2.0F, 12.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 79)
						.addBox(2.0F, -2.0F, 12.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 74).addBox(-2.0F, 2.0F, 12.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 74)
						.addBox(-2.0F, -3.0F, 12.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 0).addBox(-2.0F, -2.0F, 11.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(13, 27)
						.addBox(-1.0F, -1.0F, -11.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 19).addBox(-1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(76, 56)
						.addBox(-2.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(73, 76).addBox(-2.0F, 2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 79)
						.addBox(-3.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 0).addBox(-11.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 63)
						.addBox(3.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 0).addBox(-16.0F, -2.0F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 52)
						.addBox(12.0F, -2.0F, 2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 35).addBox(-16.0F, -2.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 80)
						.addBox(12.0F, -2.0F, -3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 68).addBox(-16.0F, 2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(12.0F, 2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 71).addBox(-16.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 73)
						.addBox(12.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 26).addBox(-17.0F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(11.0F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 14).addBox(2.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 32)
						.addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition center_r2 = Head.addOrReplaceChild("center_r2",
				CubeListBuilder.create().texOffs(66, 6).addBox(-16.5F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(-16.5F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(41, 11)
						.addBox(-17.5F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 65).addBox(-16.5F, 2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 45)
						.addBox(12.5F, 2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(12.5F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(41, 20)
						.addBox(12.5F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 38).addBox(11.5F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0242F, -14.9887F, -0.0155F, -0.1841F, 0.7854F, -0.1298F));
		PartDefinition center_r3 = Head.addOrReplaceChild("center_r3",
				CubeListBuilder.create().texOffs(0, 67).addBox(12.5F, 2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 5).addBox(12.5F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(66, 28)
						.addBox(12.5F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 43).addBox(11.5F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 43)
						.addBox(-17.5F, -2.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 16).addBox(-16.5F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(67, 12)
						.addBox(-16.5F, 2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 67).addBox(-16.5F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0242F, -14.9887F, -0.0155F, -0.181F, -0.7686F, 0.1277F));
		PartDefinition center_r4 = Head.addOrReplaceChild("center_r4",
				CubeListBuilder.create().texOffs(62, 23).addBox(-11.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 62).addBox(2.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0242F, -14.9887F, -0.0155F, -0.181F, -0.7686F, 0.1277F));
		PartDefinition center_r5 = Head.addOrReplaceChild("center_r5", CubeListBuilder.create().texOffs(63, 0).addBox(-4.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9323F, -15.6293F, -4.9652F, -0.1841F, 0.7854F, -0.1298F));
		PartDefinition center_r6 = Head.addOrReplaceChild("center_r6", CubeListBuilder.create().texOffs(57, 55).addBox(-3.0F, -1.0F, 0.4928F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -14.3474F, 4.9572F, -0.1841F, 0.7854F, -0.1298F));
		PartDefinition center_r7 = Head.addOrReplaceChild("center_r7", CubeListBuilder.create().texOffs(52, 45).addBox(-1.0F, -0.9645F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3088F, -15.9855F, -7.6803F, -2.8065F, -1.1663F, 2.8329F));
		PartDefinition center_r8 = Head.addOrReplaceChild("center_r8", CubeListBuilder.create().texOffs(52, 45).addBox(7.5F, -0.9809F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1219F, -14.9691F, 0.1338F, -2.8065F, -1.1663F, 2.8329F));
		PartDefinition center_r9 = Head.addOrReplaceChild("center_r9",
				CubeListBuilder.create().texOffs(52, 45).addBox(-9.5F, -0.9809F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(51, 44).addBox(7.5F, -0.9809F, -4.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1219F, -14.9691F, 0.1338F, -0.3569F, -1.1913F, 0.3346F));
		PartDefinition center_r10 = Head.addOrReplaceChild("center_r10",
				CubeListBuilder.create().texOffs(52, 45).addBox(-9.5F, -0.9809F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 45).addBox(7.5F, -0.9809F, -4.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1219F, -14.9691F, 0.1338F, -0.1425F, -0.424F, 0.0601F));
		PartDefinition center_r11 = Head.addOrReplaceChild("center_r11",
				CubeListBuilder.create().texOffs(52, 45).addBox(7.5F, -0.9809F, -4.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 45).addBox(-9.5F, -0.9809F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1219F, -14.9691F, 0.1338F, -0.1384F, 0.3544F, -0.0472F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
