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
public class Modelgetorobes<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelgetorobes"), "main");
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart Body;

	public Modelgetorobes(ModelPart root) {
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(36, 34).mirror().addBox(0.0F, -3.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));
		PartDefinition LeftArm_r1 = RightArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(26, 26).mirror().addBox(23.15F, -9.0F, -3.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 21.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition LeftArm_r2 = RightArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(13, 23).mirror().addBox(8.0F, -24.0F, -4.0F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 21.0F, 6.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition LeftArm_r3 = RightArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(41, 42).mirror().addBox(9.9F, -14.4F, -4.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 21.0F, 6.0F, -1.5708F, 1.4399F, -1.5708F));
		PartDefinition LeftArm_r4 = RightArm.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(19, 8).mirror().addBox(8.0F, -24.0F, -1.0F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 21.0F, -6.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition LeftArm_r5 = RightArm.addOrReplaceChild("LeftArm_r5", CubeListBuilder.create().texOffs(27, 42).mirror().addBox(9.9F, -14.4F, -1.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 21.0F, -6.0F, 1.5708F, -1.4399F, -1.5708F));
		PartDefinition LeftArm_r6 = RightArm.addOrReplaceChild("LeftArm_r6", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(8.0F, -24.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 21.0F, 0.0F, -3.1416F, 0.0F, -3.1416F));
		PartDefinition LeftArm_r7 = RightArm.addOrReplaceChild("LeftArm_r7", CubeListBuilder.create().texOffs(18, 37).mirror().addBox(9.9F, -14.4F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 21.0F, 0.0F, 3.1416F, 0.0F, -3.0107F));
		PartDefinition LeftArm_r8 = RightArm.addOrReplaceChild("LeftArm_r8", CubeListBuilder.create().texOffs(4, 37).mirror().addBox(9.9F, -14.4F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, 21.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(36, 34).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 14.0F, 0.0F));
		PartDefinition LeftArm_r9 = LeftArm.addOrReplaceChild("LeftArm_r9", CubeListBuilder.create().texOffs(26, 26).addBox(-24.15F, -9.0F, -3.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 21.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition LeftArm_r10 = LeftArm.addOrReplaceChild("LeftArm_r10", CubeListBuilder.create().texOffs(13, 23).addBox(-9.0F, -24.0F, -4.0F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 6.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition LeftArm_r11 = LeftArm.addOrReplaceChild("LeftArm_r11", CubeListBuilder.create().texOffs(41, 42).addBox(-10.9F, -14.4F, -4.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 6.0F, -1.5708F, -1.4399F, 1.5708F));
		PartDefinition LeftArm_r12 = LeftArm.addOrReplaceChild("LeftArm_r12", CubeListBuilder.create().texOffs(19, 8).addBox(-9.0F, -24.0F, -1.0F, 1.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, -6.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition LeftArm_r13 = LeftArm.addOrReplaceChild("LeftArm_r13", CubeListBuilder.create().texOffs(27, 42).addBox(-10.9F, -14.4F, -1.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, -6.0F, 1.5708F, 1.4399F, 1.5708F));
		PartDefinition LeftArm_r14 = LeftArm.addOrReplaceChild("LeftArm_r14", CubeListBuilder.create().texOffs(42, 0).addBox(-9.0F, -24.0F, -2.0F, 1.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 21.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition LeftArm_r15 = LeftArm.addOrReplaceChild("LeftArm_r15", CubeListBuilder.create().texOffs(18, 37).addBox(-10.9F, -14.4F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 21.0F, 0.0F, 3.1416F, 0.0F, 3.0107F));
		PartDefinition LeftArm_r16 = LeftArm.addOrReplaceChild("LeftArm_r16", CubeListBuilder.create().texOffs(4, 37).addBox(-10.9F, -14.4F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 21.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 27).addBox(4.0F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, 0.0F, 2.0F, 10.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 26)
						.addBox(-5.0F, 12.0F, 2.0F, 10.0F, 0.6F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 4).addBox(-5.0F, 0.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 46)
						.addBox(-5.0F, 0.0F, -3.0F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46).addBox(1.0F, 0.0F, -3.0F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 50)
						.addBox(-1.0F, 4.0F, -3.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(30, 50).addBox(-6.3F, -23.65F, -3.3F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(0, 13).addBox(-5.6F, -23.4F, -2.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(11, 13).addBox(3.6F, -23.4F, -2.3F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(50, 50).addBox(4.3F, -23.65F, -3.25F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -3.6F, -24.6F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 24.0F, 0.0F, -1.5708F, 0.0F, 0.1309F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6",
				CubeListBuilder.create().texOffs(26, 6).addBox(-17.0F, -4.1F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 28).addBox(-17.0F, -4.1F, 2.75F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-13.0F, -4.1F, 3.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 28).addBox(-18.0F, -4.1F, 3.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 50)
						.addBox(-17.0F, -3.95F, -3.1F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 50).addBox(-13.0F, -4.95F, -3.35F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 50)
						.addBox(-18.0F, -4.95F, -3.35F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, -0.25F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(20, 26).addBox(-15.9F, -5.0F, -3.6F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.05F, 22.9F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(48, 38).addBox(-17.0F, -3.0F, -5.3F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
				.addBox(-13.0F, -3.0F, -5.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 7).addBox(-18.0F, -3.0F, -5.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 1.5708F, 0.0F, 1.5708F));
		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(26, 8).addBox(17.0F, -4.0F, -3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8F, 19.6F, 4.2F, 0.0767F, 0.2232F, -0.6544F));
		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(0, 27).addBox(-15.9F, -11.1F, -3.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8F, 19.6F, 4.2F, 0.1063F, -0.2109F, 1.682F));
		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(32, 20).addBox(-5.0F, -12.0F, 2.0F, 10.0F, 0.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(22, 0).addBox(-5.0F, -11.5F, 3.49F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -3.0107F, 0.0F, -3.1416F));
		PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(22, 4).addBox(-3.0F, -12.0F, 2.0F, 6.0F, 0.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Body_r14 = Body.addOrReplaceChild("Body_r14", CubeListBuilder.create().texOffs(42, 13).addBox(-3.0F, -11.5F, 3.49F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.1309F));
		PartDefinition Body_r15 = Body.addOrReplaceChild("Body_r15", CubeListBuilder.create().texOffs(42, 22).addBox(-3.0F, -11.5F, 3.49F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 24.0F, 0.0F, 0.0F, 1.5708F, -0.1309F));
		PartDefinition Body_r16 = Body.addOrReplaceChild("Body_r16", CubeListBuilder.create().texOffs(42, 17).addBox(-3.0F, -12.0F, 2.0F, 6.0F, 0.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Body_r17 = Body.addOrReplaceChild("Body_r17", CubeListBuilder.create().texOffs(20, 22).addBox(-5.0F, -11.5F, 3.49F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
