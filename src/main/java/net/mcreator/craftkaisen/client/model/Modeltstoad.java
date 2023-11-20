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
public class Modeltstoad<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modeltstoad"), "main");
	public final ModelPart Toad;

	public Modeltstoad(ModelPart root) {
		this.Toad = root.getChild("Toad");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Toad = partdefinition.addOrReplaceChild("Toad", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body2 = Toad.addOrReplaceChild("body2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -7.0F, -1.0F, 16.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-8.0F, 0.0F, -9.0F, 16.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(45, 8)
						.addBox(-8.0F, -2.0F, -8.975F, 16.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 57).addBox(-8.0F, -2.0F, -9.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(56, 31)
						.addBox(8.0F, -2.0F, -9.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition FrontLeftleg = body2.addOrReplaceChild("FrontLeftleg",
				CubeListBuilder.create().texOffs(15, 65).addBox(0.0F, -2.0F, -3.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 31).addBox(-1.0F, 4.0F, -6.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 1.0F, 2.0F));
		PartDefinition BackleftLeg = body2.addOrReplaceChild("BackleftLeg",
				CubeListBuilder.create().texOffs(60, 44).addBox(0.0F, -2.0F, -3.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(30, 34).addBox(-1.0F, 4.0F, -6.0F, 9.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 1.0F, 12.0F));
		PartDefinition BackrightLeg = body2.addOrReplaceChild("BackrightLeg",
				CubeListBuilder.create().texOffs(58, 13).addBox(-5.0F, -2.0F, -3.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 23).addBox(-8.0F, 4.0F, -6.0F, 9.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 1.0F, 12.0F));
		PartDefinition FrontRightleg = body2.addOrReplaceChild("FrontRightleg",
				CubeListBuilder.create().texOffs(55, 60).addBox(-5.0F, -2.0F, -3.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 0).addBox(-6.0F, 4.0F, -6.0F, 7.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 1.0F, 2.0F));
		PartDefinition RightWing = body2.addOrReplaceChild("RightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -8.0F, 2.0F, -0.4363F, 0.0F, -0.6981F));
		PartDefinition LeftWing = body2.addOrReplaceChild("LeftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -8.0F, 2.0F, -0.4363F, 0.0F, 0.6981F));
		PartDefinition tounge = body2.addOrReplaceChild("tounge", CubeListBuilder.create().texOffs(23, 47).addBox(-3.0F, -2.0F, -8.0F, 6.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition head2 = Toad.addOrReplaceChild("head2",
				CubeListBuilder.create().texOffs(0, 34).addBox(-7.95F, -3.0F, -8.0F, 15.9F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(59, 0).addBox(-6.45F, -5.5F, -5.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 24)
						.addBox(2.45F, -5.5F, -5.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 10).addBox(-7.95F, 0.0F, -8.0F, 15.9F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(7.95F, 0.0F, -8.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(46, 32).addBox(-7.95F, 0.0F, -7.975F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, -1.0F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Toad.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
