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
public class Modelinventorycurseground<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelinventorycurseground"), "main");
	public final ModelPart Head;
	public final ModelPart Body;

	public Modelinventorycurseground(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 29).addBox(-1.0F, -3.1F, -7.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(1.9F)).texOffs(14, 7).addBox(-2.6F, -3.6F, -10.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 30)
						.addBox(0.5F, -3.6F, -10.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.8F, -5.9F, -7.3F, 0.4F, 1.0F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.2F, -5.9F, -7.3F, 0.4F, 1.0F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.3F, -6.4F, -7.3F, 0.4F, 1.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.6F, -0.7F, -9.6F, 1.2F, 0.7F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(14, 25).addBox(-1.7F, -3.8F, -4.4F, 3.5F, 3.8F, 3.3F, new CubeDeformation(0.0F)).texOffs(22, 7).addBox(-1.7F, -3.8F, 2.2F, 3.5F, 3.8F, 3.3F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-11.9F, -3.8F, -1.9F, 3.5F, 3.8F, 3.3F, new CubeDeformation(0.0F)).texOffs(28, 21).addBox(-11.3F, -3.8F, 3.8F, 3.5F, 3.8F, 3.3F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-1.9F, -4.1F, 5.5F, 3.9F, 4.1F, 3.3F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.9F, -4.1F, -1.1F, 3.9F, 4.1F, 3.3F, new CubeDeformation(0.0F)).texOffs(11, 0)
						.addBox(-11.9F, -1.0F, -3.5F, 1.3F, 1.0F, 1.7F, new CubeDeformation(0.0F)).texOffs(25, 0).addBox(-9.8F, -1.0F, -3.5F, 1.3F, 1.0F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 7).addBox(-11.7F, -4.1F, 2.1F, 3.9F, 4.1F, 3.3F, new CubeDeformation(0.0F)).texOffs(11, 11).addBox(-11.7F, -4.1F, 7.6F, 3.9F, 4.1F, 3.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0262F, 0.0F, -2.6424F, 0.0F, 0.1745F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(14, 0).addBox(0.8F, -4.1F, 14.1F, 3.9F, 4.1F, 3.3F, new CubeDeformation(0.0F)).texOffs(14, 18).addBox(4.1F, -4.1F, 10.9F, 3.9F, 4.1F, 3.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0262F, 0.0F, -2.6424F, 0.0F, -0.5236F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(25, 14).addBox(-13.4F, 0.4F, 8.2F, 3.5F, 3.8F, 3.3F, new CubeDeformation(0.0F)).texOffs(28, 28).addBox(-16.1F, 0.4F, 4.6F, 3.5F, 3.8F, 3.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1148F, -4.2F, -2.4712F, 0.0F, 0.5672F, 0.0F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 0).addBox(-0.6F, 0.4F, 9.8F, 3.5F, 3.8F, 3.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1148F, -4.2F, -2.4712F, 0.0F, -0.1745F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
