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
public class Modelgetolegs<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelgetolegs"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelgetolegs(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(16, 5).addBox(-2.0F, -0.4F, -1.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
				.addBox(-2.0F, 0.0F, 1.7F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(37, 29).addBox(-1.9F, -5.3F, -1.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0F, -1.5708F, -0.1309F));
		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(28, 18).addBox(-1.9F, -12.0F, -0.7F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-1.9F, -12.0F, 3.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition RightLeg_r3 = RightLeg.addOrReplaceChild("RightLeg_r3", CubeListBuilder.create().texOffs(29, 35).addBox(-1.9F, -4.8F, 4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.1309F));
		PartDefinition RightLeg_r4 = RightLeg.addOrReplaceChild("RightLeg_r4", CubeListBuilder.create().texOffs(38, 8).addBox(-3.9F, -5.0F, -3.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition RightLeg_r5 = RightLeg.addOrReplaceChild("RightLeg_r5", CubeListBuilder.create().texOffs(10, 38).addBox(-3.9F, -5.0F, 2.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild(
				"LeftLeg", CubeListBuilder.create().texOffs(16, 5).mirror().addBox(-2.0F, -0.4F, -1.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 0).mirror()
						.addBox(-2.0F, 0.0F, 1.7F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 32).mirror().addBox(-2.0F, 0.0F, -2.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg_r6 = LeftLeg.addOrReplaceChild("RightLeg_r6", CubeListBuilder.create().texOffs(37, 29).mirror().addBox(-2.1F, -5.3F, -1.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0F, 1.5708F, 0.1309F));
		PartDefinition RightLeg_r7 = LeftLeg.addOrReplaceChild("RightLeg_r7", CubeListBuilder.create().texOffs(28, 18).mirror().addBox(-2.1F, -12.0F, -0.7F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 24).mirror()
				.addBox(-2.1F, -12.0F, 3.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition RightLeg_r8 = LeftLeg.addOrReplaceChild("RightLeg_r8", CubeListBuilder.create().texOffs(29, 35).mirror().addBox(-2.1F, -4.8F, 4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0F, 1.5708F, -0.1309F));
		PartDefinition RightLeg_r9 = LeftLeg.addOrReplaceChild("RightLeg_r9", CubeListBuilder.create().texOffs(38, 8).mirror().addBox(-0.1F, -5.0F, -3.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition RightLeg_r10 = LeftLeg.addOrReplaceChild("RightLeg_r10", CubeListBuilder.create().texOffs(10, 38).mirror().addBox(-0.1F, -5.0F, 2.4F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
