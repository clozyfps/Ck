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
public class Modelcurse_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelcurse_1"), "main");
	public final ModelPart arms;
	public final ModelPart head;
	public final ModelPart body;

	public Modelcurse_1(ModelPart root) {
		this.arms = root.getChild("arms");
		this.head = root.getChild("head");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(-3.8432F, 23.7017F, -2.1857F));
		PartDefinition rightarm = arms.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(8.0F, -5.0F, -1.0F));
		PartDefinition cube_r1 = rightarm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 25).addBox(-1.1991F, -0.168F, -0.6865F, 1.5F, 3.0F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0784F, -0.3509F, 0.5928F, 0.1725F, 0.0189F, -0.2174F));
		PartDefinition rightjoint = rightarm.addOrReplaceChild("rightjoint", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 1.0F));
		PartDefinition cube_r2 = rightjoint.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 11).addBox(-0.0966F, 0.1511F, -0.25F, 0.5F, 2.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0784F, -2.8509F, 0.0928F, 0.3491F, 0.0F, 0.0F));
		PartDefinition leftarm = arms.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, -1.0F));
		PartDefinition cube_r3 = leftarm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 25).addBox(-0.6507F, -2.657F, -0.75F, 1.5F, 3.0F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9216F, 2.1491F, 1.0928F, 2.965F, -0.0189F, -2.9242F));
		PartDefinition leftjoint = leftarm.addOrReplaceChild("leftjoint", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 1.0F));
		PartDefinition cube_r4 = leftjoint.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0966F, 0.1511F, -0.25F, 0.5F, 2.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9216F, -2.8509F, 0.0928F, 2.7925F, 0.0F, 3.1416F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, -5.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition cube_r5 = jaw.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(19, 4).addBox(-1.575F, 0.4572F, -3.3367F, 3.15F, 1.0F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 1.5F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r6 = jaw.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(5, 29).addBox(-0.625F, 0.25F, 0.8135F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(0.125F, 0.25F, 0.8135F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(29, 27)
						.addBox(0.925F, 0.25F, 0.8135F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(10, 30).addBox(0.925F, 0.25F, 1.5F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(0.925F, 0.25F, 2.2285F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(12, 11).addBox(-1.4F, 0.25F, 0.8135F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-1.4F, 0.25F, 1.5F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(19, 4).addBox(-1.4F, 0.25F, 2.2285F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-1.4F, 0.25F, 3.0F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(30, 4).addBox(0.925F, 0.25F, 3.0F, 0.5F, 1.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5693F, -2.3135F, 0.48F, 0.0F, 0.0F));
		PartDefinition tophead = head.addOrReplaceChild("tophead", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r7 = tophead.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 23).addBox(-0.7947F, -0.5F, -1.0F, 1.25F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9053F, -0.713F, 0.4757F, 1.7028F, -0.1298F, -0.0172F));
		PartDefinition cube_r8 = tophead.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(28, 10).addBox(-1.925F, -0.5F, -1.0F, 1.25F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.375F, -0.6835F, 0.2519F, 1.7037F, 0.173F, 0.023F));
		PartDefinition cube_r9 = tophead.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 17).addBox(-1.5F, -2.7878F, -3.1402F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 1.5F, 0.0873F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -2.5F, 4.0F, 4.5F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition lowerbody = body.addOrReplaceChild("lowerbody", CubeListBuilder.create(), PartPose.offset(0.5F, 0.2765F, 1.407F));
		PartDefinition cube_r11 = lowerbody.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -2.25F, -2.75F, 3.0F, 4.0F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.5F, 1.5F, -0.0873F, 0.0F, 0.0F));
		PartDefinition stinger = lowerbody.addOrReplaceChild("stinger", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.1402F, 4.5059F));
		PartDefinition cube_r12 = stinger.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 15).addBox(-1.0F, -0.75F, -3.75F, 1.0F, 1.5F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.3598F, 2.9941F, -0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r13 = stinger.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5F, -1.25F, -3.25F, 2.0F, 2.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -2.6402F, 0.4941F, -0.5672F, 0.0F, 0.0F));
		PartDefinition wingright = body.addOrReplaceChild("wingright", CubeListBuilder.create(), PartPose.offset(2.1273F, -7.3004F, 0.0152F));
		PartDefinition cube_r14 = wingright.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 5).addBox(-1.25F, -0.5F, -0.75F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3773F, 2.3374F, -1.6128F, 0.059F, 0.0643F, -0.8271F));
		PartDefinition wingleft = body.addOrReplaceChild("wingleft", CubeListBuilder.create(), PartPose.offset(3.5F, -7.926F, -1.1953F));
		PartDefinition cube_r15 = wingleft.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 5).addBox(-3.0F, 0.0F, -1.5F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9364F, 1.2758F, 0.2029F, 0.0562F, -0.0668F, 0.8708F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.body.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
