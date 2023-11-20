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
public class Modeltojipants<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modeltojipants"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart bone;

	public Modeltojipants(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 10).addBox(1.7F, -1.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(1.7F, 7.6F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 10)
						.addBox(-2.7F, -1.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 20).addBox(-2.7F, 7.6F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-2.1F, -1.0F, -2.6F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 21).addBox(-2.1F, 7.6F, -2.6F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -0.2F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg_r1 = RightLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(38, 3).addBox(-2.0F, -5.9F, 2.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 12.0F, 4.6F, -3.0107F, 0.0F, 3.1416F));
		PartDefinition LeftLeg_r2 = RightLeg.addOrReplaceChild("LeftLeg_r2", CubeListBuilder.create().texOffs(36, 34).addBox(-2.0F, -8.3F, 0.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 12.0F, 4.6F, 3.0107F, 0.0F, -3.1416F));
		PartDefinition LeftLeg_r3 = RightLeg.addOrReplaceChild("LeftLeg_r3",
				CubeListBuilder.create().texOffs(26, 26).addBox(-2.0F, -13.0F, 1.9F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 6).addBox(-2.0F, -4.4F, 1.9F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 12.0F, 4.6F, -3.1416F, 0.0F, -3.1416F));
		PartDefinition LeftLeg_r4 = RightLeg.addOrReplaceChild("LeftLeg_r4", CubeListBuilder.create().texOffs(38, 0).addBox(-2.0F, -5.9F, 2.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 12.0F, -4.5F, 0.1309F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r5 = RightLeg.addOrReplaceChild("LeftLeg_r5", CubeListBuilder.create().texOffs(36, 25).addBox(-2.0F, -8.3F, 0.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 12.0F, -4.5F, -0.1309F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r6 = RightLeg.addOrReplaceChild("LeftLeg_r6", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -12.0F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 12.0F, -3.8F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftLeg_r7 = RightLeg.addOrReplaceChild("LeftLeg_r7", CubeListBuilder.create().texOffs(0, 32).addBox(2.4F, -5.9F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, 12.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftLeg_r8 = RightLeg.addOrReplaceChild("LeftLeg_r8", CubeListBuilder.create().texOffs(16, 24).addBox(0.8F, -8.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, 12.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftLeg_r9 = RightLeg.addOrReplaceChild("LeftLeg_r9", CubeListBuilder.create().texOffs(20, 30).addBox(-3.4F, -5.9F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, 12.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftLeg_r10 = RightLeg.addOrReplaceChild("LeftLeg_r10", CubeListBuilder.create().texOffs(22, 20).addBox(-1.8F, -8.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, 12.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 15).addBox(-2.7F, -1.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 12).addBox(-2.7F, 7.6F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(1.7F, -1.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 5).addBox(1.7F, 7.6F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-1.9F, -1.0F, -2.6F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 36).addBox(-1.9F, 7.6F, -2.6F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-2.0F, -0.2F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg_r11 = LeftLeg.addOrReplaceChild("LeftLeg_r11", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -12.0F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 12.0F, -3.8F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftLeg_r12 = LeftLeg.addOrReplaceChild("LeftLeg_r12", CubeListBuilder.create().texOffs(38, 10).addBox(-2.0F, -5.9F, 2.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 12.0F, 4.6F, -3.0107F, 0.0F, -3.1416F));
		PartDefinition LeftLeg_r13 = LeftLeg.addOrReplaceChild("LeftLeg_r13", CubeListBuilder.create().texOffs(35, 37).addBox(-2.0F, -8.3F, 0.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 12.0F, 4.6F, 3.0107F, 0.0F, 3.1416F));
		PartDefinition LeftLeg_r14 = LeftLeg.addOrReplaceChild("LeftLeg_r14",
				CubeListBuilder.create().texOffs(10, 30).addBox(-2.0F, -13.0F, 1.9F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 14).addBox(-2.0F, -4.4F, 1.9F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 12.0F, 4.6F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition LeftLeg_r15 = LeftLeg.addOrReplaceChild("LeftLeg_r15", CubeListBuilder.create().texOffs(38, 18).addBox(-2.0F, -5.9F, 2.4F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 12.0F, -4.5F, 0.1309F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r16 = LeftLeg.addOrReplaceChild("LeftLeg_r16", CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, -8.3F, 0.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 12.0F, -4.5F, -0.1309F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r17 = LeftLeg.addOrReplaceChild("LeftLeg_r17", CubeListBuilder.create().texOffs(26, 32).addBox(-3.4F, -5.9F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, 12.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftLeg_r18 = LeftLeg.addOrReplaceChild("LeftLeg_r18", CubeListBuilder.create().texOffs(28, 8).addBox(-1.8F, -8.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, 12.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftLeg_r19 = LeftLeg.addOrReplaceChild("LeftLeg_r19", CubeListBuilder.create().texOffs(32, 28).addBox(2.4F, -5.9F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, 12.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftLeg_r20 = LeftLeg.addOrReplaceChild("LeftLeg_r20", CubeListBuilder.create().texOffs(28, 15).addBox(0.8F, -8.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, 12.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body = bone.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition LeftArm = bone.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, -22.0F, 0.0F));
		PartDefinition RightArm = bone.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, -22.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
