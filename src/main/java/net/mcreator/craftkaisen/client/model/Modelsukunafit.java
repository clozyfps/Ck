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
public class Modelsukunafit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelsukunafit"), "main");
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelsukunafit(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, new CubeDeformation(0.25F)).texOffs(0, 26)
				.addBox(-4.5F, 10.25F, -3.0F, 9.0F, 2.0F, 6.0F, new CubeDeformation(0.25F)).texOffs(0, 17).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition HatLayer_r1 = Body.addOrReplaceChild("HatLayer_r1", CubeListBuilder.create().texOffs(25, 19).addBox(-4.0F, -0.5F, -3.5F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition HatLayer_r2 = Body.addOrReplaceChild("HatLayer_r2", CubeListBuilder.create().texOffs(24, 10).addBox(-4.0F, -0.5F, -3.5F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(26, 30).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r1 = LeftArm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(72, 1).addBox(-3.9952F, -1.0F, -8.0F, 0.0F, 11.25F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4548F, 0.124F, 1.7499F, 0.0F, -1.5708F, -0.1745F));
		PartDefinition cube_r2 = LeftArm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(78, 1).addBox(8.0001F, -1.0F, -8.0F, 0.0F, 11.25F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4548F, 0.124F, -5.7513F, 0.0F, -1.5708F, -0.1745F));
		PartDefinition cube_r3 = LeftArm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 3).addBox(3.5003F, -2.0F, -9.0F, 4.5F, 11.25F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.266F, 1.2824F, -5.7504F, 0.0F, -1.5708F, -0.1745F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(26, 30).mirror().addBox(-3.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r4 = RightArm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(72, 1).mirror().addBox(3.9952F, -1.0F, -8.0F, 0.0F, 11.25F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.4548F, 0.124F, 1.7499F, 0.0F, 1.5708F, 0.1745F));
		PartDefinition cube_r5 = RightArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(78, 1).mirror().addBox(-8.0001F, -1.0F, -8.0F, 0.0F, 11.25F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.4548F, 0.124F, -5.7513F, 0.0F, 1.5708F, 0.1745F));
		PartDefinition cube_r6 = RightArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 3).mirror().addBox(-8.0003F, -2.0F, -9.0F, 4.5F, 11.25F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.266F, 1.2824F, -5.7504F, 0.0F, 1.5708F, 0.1745F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(42, 27).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(38, 2).addBox(-2.0F, 10.5F, -2.0F, 4.0F, 1.5F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(72, 44).addBox(-7.9932F, -1.0F, -1.0F, 0.0F, 10.25F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 46).addBox(-8.0003F, -1.0F, -1.0F, 4.5F, 10.25F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4388F, 0.9085F, -5.7514F, 0.0F, 1.5708F, 0.1745F));
		PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(78, 44).addBox(-0.0012F, -1.0F, -1.0F, 0.0F, 10.25F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4388F, 0.9085F, -2.2501F, 0.0F, 1.5708F, 0.1745F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(38, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(26, 0).addBox(-2.0F, 10.5F, -2.0F, 4.0F, 1.5F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(78, 30).addBox(8.0003F, -1.0F, -1.0F, 0.0F, 10.25F, 2.0F, new CubeDeformation(0.0F)).texOffs(61, 32).addBox(3.5003F, -1.0F, -1.0F, 4.5F, 10.25F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4388F, 0.9085F, -5.7514F, 0.0F, -1.5708F, -0.1745F));
		PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(72, 30).addBox(0.0022F, -1.0F, -1.0F, 0.0F, 10.25F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4388F, 0.9085F, -2.2501F, 0.0F, -1.5708F, -0.1745F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
