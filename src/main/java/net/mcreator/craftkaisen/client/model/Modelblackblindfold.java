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
public class Modelblackblindfold<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelblackblindfold"), "main");
	public final ModelPart Head2;

	public Modelblackblindfold(ModelPart root) {
		this.Head2 = root.getChild("Head2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head2 = partdefinition.addOrReplaceChild("Head2",
				CubeListBuilder.create().texOffs(12, 16).addBox(-4.0F, -5.0F, -4.01F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)).texOffs(9, 16).addBox(-4.0F, -5.0F, 4.01F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Head_r1 = Head2.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(10, 19).addBox(-4.0F, -29.0F, 4.01F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)).texOffs(10, 21).addBox(-4.0F, -29.0F, -4.01F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Head_r2 = Head2.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(16, 16).addBox(-9.3F, -26.4F, -4.02F, 2.2F, 1.0F, 0.0F, new CubeDeformation(0.1F)).texOffs(16, 19).addBox(-13.0F, -25.0F, -4.02F, 2.1F, 1.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition Head_r3 = Head2.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(16, 18).addBox(10.9F, -25.0F, -4.02F, 2.1F, 1.0F, 0.0F, new CubeDeformation(0.1F)).texOffs(16, 17).addBox(7.1F, -26.4F, -4.02F, 2.2F, 1.0F, 0.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		return LayerDefinition.create(meshdefinition, 35, 35);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
