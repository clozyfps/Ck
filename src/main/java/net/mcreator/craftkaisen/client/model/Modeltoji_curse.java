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

// Made with Blockbench 4.8.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeltoji_curse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modeltoji_curse"), "main");
	public final ModelPart Body;
	public final ModelPart LArm;
	public final ModelPart RArm;

	public Modeltoji_curse(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LArm = root.getChild("LArm");
		this.RArm = root.getChild("RArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8693F, 8.5057F, -2.0F, -0.0153F, 0.1296F, -0.0886F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -2.5F, -2.875F, 5.0F, 5.0F, 4.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5491F, -1.514F, -2.9386F, 0.5634F, 1.4061F, 0.3377F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 11).addBox(-2.5F, -1.5F, -4.375F, 5.0F, 3.0F, 3.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9993F, -1.0942F, 2.7069F, 0.2213F, 1.1605F, -0.0161F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 16).addBox(-2.5F, -1.5F, -1.375F, 5.0F, 3.0F, 2.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0835F, -0.379F, 3.2754F, 0.1549F, 0.114F, -0.1445F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, -2.5F, -1.875F, 4.0F, 3.0F, 2.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.303F, 1.453F, 3.4716F, 0.1348F, -0.1269F, -0.0042F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 7).addBox(-2.5F, -2.5F, -1.375F, 4.0F, 3.0F, 1.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6296F, 2.5445F, 2.7309F, 0.2166F, -0.9019F, -0.158F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 23).addBox(-1.5F, -2.0F, -0.875F, 3.0F, 3.0F, 2.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2813F, 3.4472F, -0.1956F, 1.2378F, -1.4293F, -1.2218F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -1.5F, -1.375F, 3.0F, 3.0F, 3.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.171F, 4.077F, -0.92F, -3.1398F, -0.2601F, -3.1029F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 29).addBox(-3.0F, -1.5F, -1.5F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.384F, 4.3446F, -3.1166F, 3.1208F, -0.0848F, -3.0163F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 13).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4692F, 5.1476F, -2.4042F, 3.1132F, 0.1791F, -2.9361F));
		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(22, 30).addBox(-0.5F, -3.5F, 0.5F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 7).addBox(-1.5F, -2.5F, -2.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7063F, 6.9084F, 1.1884F, 2.8321F, 1.2805F, 2.7102F));
		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(10, 32).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0206F, 7.1716F, 2.3116F, 0.6498F, 1.4262F, 0.5106F));
		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(32, 33).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9268F, 8.3169F, 2.2828F, 1.1412F, 1.4861F, 1.0927F));
		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(34, 19).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.463F, 9.3625F, 1.661F, 0.0873F, 0.5672F, 0.0873F));
		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(11, 23).addBox(-3.0F, -2.0F, -1.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 28).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 10.0F, -2.0F, 0.0F, 0.0873F, 0.0873F));
		PartDefinition LArm = partdefinition.addOrReplaceChild("LArm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition RArm = partdefinition.addOrReplaceChild("RArm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
