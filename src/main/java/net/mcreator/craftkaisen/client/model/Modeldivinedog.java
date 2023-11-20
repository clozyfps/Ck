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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldivinedog<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modeldivinedog"), "main");
	public final ModelPart gyokuken_leftleg;
	public final ModelPart gyokuken_rightleg;
	public final ModelPart gyokuken_leftleg2;
	public final ModelPart gyokuken_rightleg2;
	public final ModelPart head_main;
	public final ModelPart gyokuken_tail;
	public final ModelPart gyokuken_body;

	public Modeldivinedog(ModelPart root) {
		this.gyokuken_leftleg = root.getChild("gyokuken_leftleg");
		this.gyokuken_rightleg = root.getChild("gyokuken_rightleg");
		this.gyokuken_leftleg2 = root.getChild("gyokuken_leftleg2");
		this.gyokuken_rightleg2 = root.getChild("gyokuken_rightleg2");
		this.head_main = root.getChild("head_main");
		this.gyokuken_tail = root.getChild("gyokuken_tail");
		this.gyokuken_body = root.getChild("gyokuken_body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition gyokuken_leftleg = partdefinition.addOrReplaceChild("gyokuken_leftleg", CubeListBuilder.create().texOffs(13, 99).addBox(-0.653F, -3.5198F, -2.5387F, 2.262F, 5.8766F, 4.5241F, new CubeDeformation(0.0F)).texOffs(103, 71)
				.addBox(-0.7696F, -4.5692F, -1.8391F, 2.262F, 5.8766F, 4.5241F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6612F, 11.5216F, -5.1885F, 0.0435F, 0.0038F, -0.0872F));
		PartDefinition gyokuken_leftleg_1 = gyokuken_leftleg.addOrReplaceChild("gyokuken_leftleg_1", CubeListBuilder.create(), PartPose.offset(0.653F, 2.3725F, 0.3819F));
		PartDefinition leftfrontlegup = gyokuken_leftleg_1.addOrReplaceChild("leftfrontlegup", CubeListBuilder.create().texOffs(50, 105).addBox(-0.653F, -1.6692F, -0.5538F, 1.4225F, 7.1826F, 1.9589F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition leftfrontlegup_r1 = leftfrontlegup.addOrReplaceChild("leftfrontlegup_r1", CubeListBuilder.create().texOffs(101, 107).addBox(4.2442F, -10.494F, -8.815F, 1.1893F, 6.5762F, 1.9589F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8972F, 6.18F, 9.0695F, 0.3491F, 0.0F, 0.0F));
		PartDefinition gyokuken_leftleg_2 = gyokuken_leftleg_1.addOrReplaceChild("gyokuken_leftleg_2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.4125F, 1.3703F));
		PartDefinition leftfrontlegdown = gyokuken_leftleg_2.addOrReplaceChild("leftfrontlegdown", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leftfrontlegdown_r1 = leftfrontlegdown.addOrReplaceChild("leftfrontlegdown_r1", CubeListBuilder.create().texOffs(34, 59).addBox(-0.9794F, 2.1654F, 0.6762F, 1.3059F, 2.8245F, 1.3759F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3265F, -2.789F, -0.986F, -0.1745F, 0.0F, 0.0F));
		PartDefinition leftfrontlegfoot = gyokuken_leftleg_2.addOrReplaceChild("leftfrontlegfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.702F, 0.9424F, 0.48F, 0.0F, 0.0F));
		PartDefinition leftfrontlegfoot_r1 = leftfrontlegfoot.addOrReplaceChild("leftfrontlegfoot_r1", CubeListBuilder.create().texOffs(52, 4).addBox(-1.4225F, 1.6503F, -3.0643F, 2.1921F, 1.3852F, 1.6557F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3265F, -0.058F, -1.8636F, -0.5236F, 0.0F, 0.0F));
		PartDefinition leftfrontlegfoot_r2 = leftfrontlegfoot.addOrReplaceChild("leftfrontlegfoot_r2", CubeListBuilder.create().texOffs(56, 96).addBox(-1.3059F, 0.3677F, -3.0643F, 1.7257F, 1.0354F, 3.1715F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3265F, -0.058F, -1.8636F, 0.1752F, -0.0859F, -0.0152F));
		PartDefinition leftfrontlegfoot_r3 = leftfrontlegfoot.addOrReplaceChild("leftfrontlegfoot_r3", CubeListBuilder.create().texOffs(108, 45).addBox(-1.3059F, 0.3677F, -3.0643F, 1.7257F, 1.0354F, 2.9383F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3265F, -0.058F, -1.8636F, 0.1745F, 0.0F, 0.0F));
		PartDefinition gyokuken_rightleg = partdefinition.addOrReplaceChild("gyokuken_rightleg", CubeListBuilder.create().texOffs(61, 98).addBox(-1.6091F, -3.5198F, -2.5387F, 2.262F, 5.8766F, 4.5241F, new CubeDeformation(0.0F)).texOffs(99, 96)
				.addBox(-1.4925F, -4.5692F, -1.8391F, 2.262F, 5.8766F, 4.5241F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6612F, 11.5216F, -5.1885F, 0.0435F, -0.0038F, 0.0872F));
		PartDefinition gyokuken_rightleg_1 = gyokuken_rightleg.addOrReplaceChild("gyokuken_rightleg_1", CubeListBuilder.create(), PartPose.offset(-0.653F, 2.3725F, 0.3819F));
		PartDefinition rightfrontlegup = gyokuken_rightleg_1.addOrReplaceChild("rightfrontlegup", CubeListBuilder.create().texOffs(0, 101).addBox(-0.7696F, -1.6692F, -0.5538F, 1.4225F, 7.1826F, 1.9589F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition rightfrontlegup_r1 = rightfrontlegup.addOrReplaceChild("rightfrontlegup_r1", CubeListBuilder.create().texOffs(56, 107).addBox(-5.4336F, -10.494F, -8.815F, 1.1893F, 6.5762F, 1.9589F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8972F, 6.18F, 9.0695F, 0.3491F, 0.0F, 0.0F));
		PartDefinition gyokuken_rightleg_2 = gyokuken_rightleg_1.addOrReplaceChild("gyokuken_rightleg_2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.4125F, 1.3703F));
		PartDefinition rightfrontlegdown = gyokuken_rightleg_2.addOrReplaceChild("rightfrontlegdown", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rightfrontlegdown_r1 = rightfrontlegdown.addOrReplaceChild("rightfrontlegdown_r1", CubeListBuilder.create().texOffs(30, 59).addBox(-0.3265F, 2.1654F, 0.6762F, 1.3059F, 2.8245F, 1.3759F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3265F, -2.789F, -0.986F, -0.1745F, 0.0F, 0.0F));
		PartDefinition rightfrontlegfoot = gyokuken_rightleg_2.addOrReplaceChild("rightfrontlegfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.702F, 0.9424F, 0.48F, 0.0F, 0.0F));
		PartDefinition rightfrontlegfoot_r1 = rightfrontlegfoot.addOrReplaceChild("rightfrontlegfoot_r1", CubeListBuilder.create().texOffs(50, 24).addBox(-0.7696F, 1.6503F, -3.0643F, 2.1921F, 1.3852F, 1.6557F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3265F, -0.058F, -1.8636F, -0.5236F, 0.0F, 0.0F));
		PartDefinition rightfrontlegfoot_r2 = rightfrontlegfoot.addOrReplaceChild("rightfrontlegfoot_r2", CubeListBuilder.create().texOffs(84, 81).addBox(-0.4198F, 0.3677F, -3.0643F, 1.7257F, 1.0354F, 3.1715F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3265F, -0.058F, -1.8636F, 0.1752F, 0.0859F, 0.0152F));
		PartDefinition rightfrontlegfoot_r3 = rightfrontlegfoot.addOrReplaceChild("rightfrontlegfoot_r3", CubeListBuilder.create().texOffs(108, 33).addBox(-0.4198F, 0.3677F, -3.0643F, 1.7257F, 1.0354F, 2.9383F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3265F, -0.058F, -1.8636F, 0.1745F, 0.0F, 0.0F));
		PartDefinition gyokuken_leftleg2 = partdefinition.addOrReplaceChild("gyokuken_leftleg2",
				CubeListBuilder.create().texOffs(31, 93).addBox(-0.653F, -3.1198F, -3.5387F, 2.262F, 6.9766F, 4.9241F, new CubeDeformation(0.0F)).texOffs(71, 91)
						.addBox(-0.7696F, -4.4692F, -2.8391F, 1.862F, 6.7766F, 5.3241F, new CubeDeformation(0.0F)).texOffs(85, 96).addBox(-0.7696F, -3.5692F, -2.4391F, 2.762F, 5.8766F, 4.2241F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6612F, 11.5216F, 9.8115F, -0.3056F, 0.0038F, -0.0872F));
		PartDefinition gyokuken_leftleg2_1 = gyokuken_leftleg2.addOrReplaceChild("gyokuken_leftleg2_1", CubeListBuilder.create(), PartPose.offset(0.653F, 1.9725F, 0.4819F));
		PartDefinition leftfrontlegup2 = gyokuken_leftleg2_1.addOrReplaceChild("leftfrontlegup2", CubeListBuilder.create().texOffs(80, 26).addBox(-0.653F, -1.6692F, -0.5538F, 1.4225F, 7.1826F, 1.9589F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));
		PartDefinition leftfrontlegup2_r1 = leftfrontlegup2.addOrReplaceChild("leftfrontlegup2_r1", CubeListBuilder.create().texOffs(95, 106).addBox(4.2442F, -10.494F, -8.815F, 1.1893F, 6.5762F, 1.9589F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8972F, 6.18F, 9.0695F, 0.3491F, 0.0F, 0.0F));
		PartDefinition gyokuken_leftleg2_2 = gyokuken_leftleg2_1.addOrReplaceChild("gyokuken_leftleg2_2", CubeListBuilder.create(), PartPose.offset(-0.653F, 3.5275F, 4.0181F));
		PartDefinition leftfrontlegdown2 = gyokuken_leftleg2_2.addOrReplaceChild("leftfrontlegdown2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.653F, -0.565F, 0.6522F, 0.6109F, 0.0F, 0.0F));
		PartDefinition leftfrontlegdown2_r1 = leftfrontlegdown2.addOrReplaceChild("leftfrontlegdown2_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-0.9794F, 1.1654F, 0.6762F, 1.3059F, 3.8245F, 1.3759F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3265F, -1.539F, -1.986F, -0.1745F, 0.0F, 0.0F));
		PartDefinition leftfrontlegfoot2 = gyokuken_leftleg2_2.addOrReplaceChild("leftfrontlegfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.653F, 1.0871F, 2.0946F, 0.8727F, 0.0F, 0.0F));
		PartDefinition leftfrontlegfoot2_r1 = leftfrontlegfoot2.addOrReplaceChild("leftfrontlegfoot2_r1", CubeListBuilder.create().texOffs(24, 46).addBox(-1.4225F, 1.6503F, -3.5643F, 2.1921F, 1.3852F, 2.4057F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3265F, -0.058F, -1.8636F, -0.5236F, 0.0F, 0.0F));
		PartDefinition leftfrontlegfoot2_r2 = leftfrontlegfoot2.addOrReplaceChild("leftfrontlegfoot2_r2", CubeListBuilder.create().texOffs(14, 82).addBox(-1.3059F, 0.3677F, -3.0643F, 1.7257F, 1.0354F, 3.1715F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3265F, -0.058F, -1.8636F, 0.1752F, -0.0859F, -0.0152F));
		PartDefinition leftfrontlegfoot2_r3 = leftfrontlegfoot2.addOrReplaceChild("leftfrontlegfoot2_r3", CubeListBuilder.create().texOffs(107, 63).addBox(-1.3059F, 0.3677F, -3.0643F, 1.7257F, 1.0354F, 2.9383F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3265F, -0.058F, -1.8636F, 0.1745F, 0.0F, 0.0F));
		PartDefinition gyokuken_rightleg2 = partdefinition.addOrReplaceChild("gyokuken_rightleg2",
				CubeListBuilder.create().texOffs(92, 64).addBox(-1.6091F, -3.1198F, -3.5387F, 2.262F, 6.9766F, 4.9241F, new CubeDeformation(0.0F)).texOffs(19, 10)
						.addBox(-1.0925F, -4.4692F, -2.8391F, 1.862F, 6.7766F, 5.3241F, new CubeDeformation(0.0F)).texOffs(96, 7).addBox(-1.9925F, -3.5692F, -2.4391F, 2.762F, 5.8766F, 4.2241F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6612F, 11.5216F, 9.8115F, -0.3056F, -0.0038F, 0.0872F));
		PartDefinition gyokuken_rightleg2_1 = gyokuken_rightleg2.addOrReplaceChild("gyokuken_rightleg2_1", CubeListBuilder.create(), PartPose.offset(-0.653F, 1.9725F, 0.4819F));
		PartDefinition rightfrontlegup2 = gyokuken_rightleg2_1.addOrReplaceChild("rightfrontlegup2", CubeListBuilder.create().texOffs(47, 69).addBox(-0.7696F, -1.6692F, -0.5538F, 1.4225F, 7.1826F, 1.9589F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));
		PartDefinition rightfrontlegup2_r1 = rightfrontlegup2.addOrReplaceChild("rightfrontlegup2_r1", CubeListBuilder.create().texOffs(89, 106).addBox(-5.4336F, -10.494F, -8.815F, 1.1893F, 6.5762F, 1.9589F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8972F, 6.18F, 9.0695F, 0.3491F, 0.0F, 0.0F));
		PartDefinition gyokuken_rightleg2_2 = gyokuken_rightleg2_1.addOrReplaceChild("gyokuken_rightleg2_2", CubeListBuilder.create(), PartPose.offset(0.653F, 3.5275F, 4.0181F));
		PartDefinition rightfrontlegdown2 = gyokuken_rightleg2_2.addOrReplaceChild("rightfrontlegdown2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.653F, -0.565F, 0.6522F, 0.6109F, 0.0F, 0.0F));
		PartDefinition rightfrontlegdown2_r1 = rightfrontlegdown2.addOrReplaceChild("rightfrontlegdown2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3265F, 1.1654F, 0.6762F, 1.3059F, 3.8245F, 1.3759F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3265F, -1.539F, -1.986F, -0.1745F, 0.0F, 0.0F));
		PartDefinition rightfrontlegfoot2 = gyokuken_rightleg2_2.addOrReplaceChild("rightfrontlegfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.653F, 1.0871F, 2.0946F, 0.8727F, 0.0F, 0.0F));
		PartDefinition rightfrontlegfoot2_r1 = rightfrontlegfoot2.addOrReplaceChild("rightfrontlegfoot2_r1", CubeListBuilder.create().texOffs(26, 4).addBox(-0.7696F, 1.6503F, -3.5643F, 2.1921F, 1.3852F, 2.4057F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3265F, -0.058F, -1.8636F, -0.5236F, 0.0F, 0.0F));
		PartDefinition rightfrontlegfoot2_r2 = rightfrontlegfoot2.addOrReplaceChild("rightfrontlegfoot2_r2", CubeListBuilder.create().texOffs(64, 0).addBox(-0.4198F, 0.3677F, -3.0643F, 1.7257F, 1.0354F, 3.1715F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3265F, -0.058F, -1.8636F, 0.1752F, 0.0859F, 0.0152F));
		PartDefinition rightfrontlegfoot2_r3 = rightfrontlegfoot2.addOrReplaceChild("rightfrontlegfoot2_r3", CubeListBuilder.create().texOffs(106, 91).addBox(-0.4198F, 0.3677F, -3.0643F, 1.7257F, 1.0354F, 2.9383F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3265F, -0.058F, -1.8636F, 0.1745F, 0.0F, 0.0F));
		PartDefinition head_main = partdefinition
				.addOrReplaceChild("head_main",
						CubeListBuilder.create().texOffs(0, 12).addBox(-2.6889F, -9.5006F, 4.0025F, 6.475F, 1.9F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-1.45F, -10.35F, 3.0F, 4.0F, 6.2F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(104, 25).addBox(-1.7F, -9.9F, 2.75F, 4.5F, 5.65F, 2.25F, new CubeDeformation(0.0F)).texOffs(23, 69).addBox(-2.6F, -9.15F, 2.8F, 6.3F, 3.8F, 2.2F, new CubeDeformation(0.0F)),
						PartPose.offset(-0.55F, 9.7F, -16.5F));
		PartDefinition head_main_r1 = head_main.addOrReplaceChild("head_main_r1",
				CubeListBuilder.create().texOffs(0, 45).addBox(3.1F, -5.6F, 6.3F, 2.5F, 1.4F, 2.85F, new CubeDeformation(0.0F)).texOffs(50, 34).addBox(3.2F, -6.1F, 7.2F, 2.5F, 1.0F, 2.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1891F, -2.8F, -6.5459F, 0.0F, -0.7418F, 0.0F));
		PartDefinition head_main_r2 = head_main.addOrReplaceChild("head_main_r2",
				CubeListBuilder.create().texOffs(40, 95).addBox(-5.7F, -6.1F, 7.2F, 2.5F, 1.0F, 2.15F, new CubeDeformation(0.0F)).texOffs(52, 0).addBox(-5.6F, -5.6F, 6.3F, 2.5F, 1.4F, 2.85F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0891F, -2.8F, -6.5459F, 0.0F, 0.7418F, 0.0F));
		PartDefinition head_main_r3 = head_main.addOrReplaceChild("head_main_r3", CubeListBuilder.create().texOffs(89, 55).addBox(-2.9292F, -1.4103F, -2.46F, 1.25F, 2.15F, 3.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9045F, -6.9596F, 3.4488F, -0.8727F, -0.48F, 0.0F));
		PartDefinition head_main_r4 = head_main.addOrReplaceChild("head_main_r4", CubeListBuilder.create().texOffs(50, 19).addBox(2.15F, -6.15F, 6.3F, 1.25F, 2.15F, 2.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4605F, -3.6006F, -4.929F, 0.0F, -0.48F, 0.0F));
		PartDefinition head_main_r5 = head_main.addOrReplaceChild("head_main_r5", CubeListBuilder.create().texOffs(24, 91).addBox(2.15F, -6.15F, 6.3F, 1.25F, 2.15F, 3.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3F, -2.2186F, -6.3899F, 0.0F, -0.48F, 0.0F));
		PartDefinition head_main_r6 = head_main.addOrReplaceChild("head_main_r6", CubeListBuilder.create().texOffs(101, 63).addBox(1.6792F, -1.4103F, -2.46F, 1.25F, 2.15F, 3.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1955F, -6.9596F, 3.4488F, -0.8727F, 0.48F, 0.0F));
		PartDefinition head_main_r7 = head_main.addOrReplaceChild("head_main_r7", CubeListBuilder.create().texOffs(54, 58).addBox(-3.4F, -6.15F, 6.3F, 1.25F, 2.15F, 2.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5605F, -3.6006F, -4.929F, 0.0F, 0.48F, 0.0F));
		PartDefinition head_main_r8 = head_main.addOrReplaceChild("head_main_r8", CubeListBuilder.create().texOffs(105, 0).addBox(-3.4F, -6.15F, 6.3F, 1.25F, 2.15F, 3.65F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, -2.2186F, -6.3899F, 0.0F, 0.48F, 0.0F));
		PartDefinition head_main_r9 = head_main.addOrReplaceChild("head_main_r9", CubeListBuilder.create().texOffs(39, 16).addBox(-0.95F, -8.0F, 2.0F, 1.9F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.55F, 0.1729F, -0.4235F, 0.2618F, 0.0F, 0.0F));
		PartDefinition head_main_r10 = head_main.addOrReplaceChild("head_main_r10", CubeListBuilder.create().texOffs(0, 69).addBox(-1.05F, -9.0F, 4.7F, 2.1F, 4.0F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.55F, -0.5775F, 6.2875F, 1.2217F, 0.0F, 0.0F));
		PartDefinition head_main_r11 = head_main.addOrReplaceChild("head_main_r11", CubeListBuilder.create().texOffs(30, 84).addBox(-1.25F, -9.0F, 2.0F, 2.5F, 4.0F, 1.125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.55F, -0.8245F, 4.0542F, 0.6109F, 0.0F, 0.0F));
		PartDefinition head_main_r12 = head_main.addOrReplaceChild("head_main_r12", CubeListBuilder.create().texOffs(9, 0).addBox(-1.05F, -9.0F, 2.0F, 2.1F, 4.0F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.55F, -0.5759F, 4.4901F, 0.7854F, 0.0F, 0.0F));
		PartDefinition head_main_r13 = head_main.addOrReplaceChild("head_main_r13", CubeListBuilder.create().texOffs(107, 107).addBox(-1.45F, -9.1F, 3.45F, 2.9F, 4.1F, 1.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.55F, -0.4185F, -0.3612F, 0.1745F, 0.0F, 0.0F));
		PartDefinition eye = head_main.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offset(0.5F, -5.3F, 8.8F));
		PartDefinition right2 = eye.addOrReplaceChild("right2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.375F, -2.7F, -8.75F, 0.0873F, 0.2182F, 0.0F));
		PartDefinition y = right2.addOrReplaceChild("y", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition y_r1 = y.addOrReplaceChild("y_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.6032F, 0.0573F, -0.3381F, 1.5288F, 0.1529F, 0.2293F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6032F, -0.0764F, -0.3527F, 1.5288F, 0.1529F, 0.244F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.6109F, 0.0F));
		PartDefinition y_r2 = y.addOrReplaceChild("y_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.6032F, 0.4013F, -0.2616F, 1.5288F, 0.2293F, 0.2293F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6032F, -0.0764F, -0.4909F, 1.5288F, 0.2293F, 0.2293F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1702F, -0.2228F, 0.2431F, 0.6981F, 0.6109F, 0.0F));
		PartDefinition y_r3 = y.addOrReplaceChild("y_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6032F, 0.0764F, -1.1789F, 1.5288F, 0.1529F, 0.2675F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9424F, -0.2277F, 1.3459F, 0.3927F, 0.6109F, 0.0F));
		PartDefinition y_r4 = y.addOrReplaceChild("y_r4", CubeListBuilder.create().texOffs(15, 13).addBox(-1.6032F, 0.1338F, -0.9789F, 1.5288F, 0.1206F, 0.1937F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3949F, 0.3878F, 0.564F, -0.3054F, 0.6109F, 0.0F));
		PartDefinition y_r5 = y.addOrReplaceChild("y_r5", CubeListBuilder.create().texOffs(75, 19).addBox(-1.6032F, 0.1338F, -0.9789F, 1.5288F, 0.0955F, 0.7937F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4799F, 0.2143F, 0.6854F, -0.0436F, 0.6109F, 0.0F));
		PartDefinition y_r6 = y.addOrReplaceChild("y_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6032F, 0.1147F, -0.8731F, 1.5288F, 0.344F, 0.3822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4884F, -0.1252F, 0.6975F, 0.0F, 0.6109F, 0.0F));
		PartDefinition y_r7 = y.addOrReplaceChild("y_r7", CubeListBuilder.create().texOffs(77, 15).addBox(-1.6032F, 0.1147F, -0.5292F, 1.5288F, 0.3631F, 0.5542F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4955F, -0.1448F, 0.7076F, 0.0F, 0.6109F, 0.0F));
		PartDefinition y_r8 = y.addOrReplaceChild("y_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6032F, -0.0514F, -0.4909F, 1.5288F, 0.2043F, 0.4851F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4949F, -0.1809F, 0.7068F, 0.2094F, 0.6109F, 0.0F));
		PartDefinition y_r9 = y.addOrReplaceChild("y_r9", CubeListBuilder.create().texOffs(79, 37).addBox(-1.6032F, -0.0764F, -0.4909F, 1.5288F, 0.2293F, 0.5101F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4808F, -0.159F, 0.6867F, 0.0873F, 0.6109F, 0.0F));
		PartDefinition y_r10 = y.addOrReplaceChild("y_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6032F, -0.0764F, -0.4909F, 1.5288F, 0.2293F, 0.3058F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3104F, -0.1665F, 0.4433F, 0.2618F, 0.6109F, 0.0F));
		PartDefinition bl = right2.addOrReplaceChild("bl", CubeListBuilder.create(), PartPose.offset(-0.05F, -0.025F, -0.05F));
		PartDefinition bl_r1 = bl.addOrReplaceChild("bl_r1", CubeListBuilder.create().texOffs(15, 13).addBox(-1.8813F, 0.0673F, -0.3967F, 1.794F, 0.1794F, 0.2691F, new CubeDeformation(0.0F)).texOffs(15, 13).addBox(-1.8813F, -0.0897F, -0.5313F,
				1.794F, 0.1794F, 0.4036F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, 0.6109F, 0.0F));
		PartDefinition bl_r2 = bl.addOrReplaceChild("bl_r2", CubeListBuilder.create().texOffs(15, 13).addBox(-1.8813F, 0.4709F, -0.307F, 1.794F, 0.2691F, 0.2691F, new CubeDeformation(0.0F)).texOffs(15, 13).addBox(-1.8813F, -0.0897F, -0.5761F, 1.794F,
				0.2691F, 0.2691F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1997F, -0.2615F, 0.2853F, 0.6981F, 0.6109F, 0.0F));
		PartDefinition bl_r3 = bl.addOrReplaceChild("bl_r3", CubeListBuilder.create().texOffs(15, 13).addBox(-1.8813F, 0.0897F, -1.3834F, 1.794F, 0.1794F, 0.314F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1059F, -0.2672F, 1.5794F, 0.3927F, 0.6109F, 0.0F));
		PartDefinition bl_r4 = bl.addOrReplaceChild("bl_r4", CubeListBuilder.create().texOffs(75, 14).addBox(-1.8813F, 0.157F, -1.3834F, 1.794F, 0.1121F, 1.1661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5631F, 0.2515F, 0.8042F, -0.0436F, 0.6109F, 0.0F));
		PartDefinition bl_r5 = bl.addOrReplaceChild("bl_r5", CubeListBuilder.create().texOffs(15, 13).addBox(-1.8813F, 0.1346F, -1.0246F, 1.794F, 0.4036F, 0.4485F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5731F, -0.147F, 0.8185F, 0.0F, 0.6109F, 0.0F));
		PartDefinition bl_r6 = bl.addOrReplaceChild("bl_r6", CubeListBuilder.create().texOffs(86, 39).addBox(-1.8813F, 0.1345F, -0.621F, 1.794F, 0.4261F, 0.6503F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5814F, -0.1699F, 0.8303F, 0.0F, 0.6109F, 0.0F));
		PartDefinition bl_r7 = bl.addOrReplaceChild("bl_r7", CubeListBuilder.create().texOffs(15, 13).addBox(-2.6563F, 0.0603F, -1.3761F, 1.794F, 0.0691F, 0.3029F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5642F, -0.1866F, 0.8058F, 0.2841F, 0.0283F, -0.1975F));
		PartDefinition bl_r8 = bl.addOrReplaceChild("bl_r8", CubeListBuilder.create().texOffs(15, 13).addBox(-1.8813F, 0.0103F, -0.3511F, 1.794F, 0.1191F, 0.4779F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5642F, -0.1866F, 0.8058F, 1.2654F, 0.6109F, 0.0F));
		PartDefinition bl_r9 = bl.addOrReplaceChild("bl_r9", CubeListBuilder.create().texOffs(15, 13).addBox(-1.8813F, -0.0397F, -0.2761F, 1.794F, 0.0691F, 0.4529F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5642F, -0.1866F, 0.8058F, 0.6109F, 0.6109F, 0.0F));
		PartDefinition bl_r10 = bl.addOrReplaceChild("bl_r10", CubeListBuilder.create().texOffs(70, 89).addBox(-1.8813F, -0.0897F, -0.2761F, 1.794F, 0.0691F, 0.5029F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5642F, -0.1866F, 0.8058F, 0.3491F, 0.6109F, 0.0F));
		PartDefinition bl_r11 = bl.addOrReplaceChild("bl_r11", CubeListBuilder.create().texOffs(88, 28).addBox(-1.8813F, -0.0897F, -0.5761F, 1.794F, 0.2691F, 0.6279F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5642F, -0.1866F, 0.8058F, 0.0873F, 0.6109F, 0.0F));
		PartDefinition bl_r12 = bl.addOrReplaceChild("bl_r12", CubeListBuilder.create().texOffs(15, 13).addBox(-1.8813F, -0.0897F, -0.5761F, 1.794F, 0.2691F, 0.3588F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3643F, -0.1954F, 0.5202F, 0.2618F, 0.6109F, 0.0F));
		PartDefinition gan = right2.addOrReplaceChild("gan", CubeListBuilder.create(), PartPose.offset(0.5483F, -0.1278F, 0.6617F));
		PartDefinition gan_r1 = gan.addOrReplaceChild("gan_r1",
				CubeListBuilder.create().texOffs(22, 20).addBox(-1.6359F, 0.042F, -0.866F, 1.51F, 0.251F, 0.215F, new CubeDeformation(0.0F)).texOffs(21, 20).addBox(-1.6359F, 0.017F, -0.841F, 1.51F, 0.301F, 0.165F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));
		PartDefinition left2 = eye.addOrReplaceChild("left2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.275F, -2.7F, -8.75F, 0.0873F, -0.2182F, 0.0F));
		PartDefinition y2 = left2.addOrReplaceChild("y2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition y2_r1 = y2.addOrReplaceChild("y2_r1",
				CubeListBuilder.create().texOffs(10, 5).addBox(0.0744F, 0.0573F, -0.3381F, 1.5288F, 0.1529F, 0.2293F, new CubeDeformation(0.0F)).texOffs(10, 5).addBox(0.0744F, -0.0764F, -0.3527F, 1.5288F, 0.1529F, 0.244F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, -0.6109F, 0.0F));
		PartDefinition y2_r2 = y2.addOrReplaceChild("y2_r2",
				CubeListBuilder.create().texOffs(10, 5).addBox(0.0744F, 0.4013F, -0.2616F, 1.5288F, 0.2293F, 0.2293F, new CubeDeformation(0.0F)).texOffs(10, 5).addBox(0.0744F, -0.0764F, -0.4909F, 1.5288F, 0.2293F, 0.2293F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1702F, -0.2228F, 0.2431F, 0.6981F, -0.6109F, 0.0F));
		PartDefinition y2_r3 = y2.addOrReplaceChild("y2_r3", CubeListBuilder.create().texOffs(10, 5).addBox(0.0744F, 0.0764F, -1.1789F, 1.5288F, 0.1529F, 0.2675F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9424F, -0.2277F, 1.3459F, 0.3927F, -0.6109F, 0.0F));
		PartDefinition y2_r4 = y2.addOrReplaceChild("y2_r4", CubeListBuilder.create().texOffs(10, 5).addBox(0.0744F, 0.1338F, -0.9789F, 1.5288F, 0.1206F, 0.1937F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3949F, 0.3878F, 0.564F, -0.3054F, -0.6109F, 0.0F));
		PartDefinition y2_r5 = y2.addOrReplaceChild("y2_r5", CubeListBuilder.create().texOffs(83, 50).addBox(0.0744F, 0.1338F, -0.9789F, 1.5288F, 0.0955F, 0.7937F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4799F, 0.2143F, 0.6854F, -0.0436F, -0.6109F, 0.0F));
		PartDefinition y2_r6 = y2.addOrReplaceChild("y2_r6", CubeListBuilder.create().texOffs(10, 5).addBox(0.0744F, 0.1147F, -0.8731F, 1.5288F, 0.344F, 0.3822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4884F, -0.1252F, 0.6975F, 0.0F, -0.6109F, 0.0F));
		PartDefinition y2_r7 = y2.addOrReplaceChild("y2_r7", CubeListBuilder.create().texOffs(87, 19).addBox(0.0744F, 0.1147F, -0.5292F, 1.5288F, 0.3631F, 0.5542F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4955F, -0.1448F, 0.7076F, 0.0F, -0.6109F, 0.0F));
		PartDefinition y2_r8 = y2.addOrReplaceChild("y2_r8", CubeListBuilder.create().texOffs(10, 5).addBox(0.0744F, -0.0514F, -0.4909F, 1.5288F, 0.2043F, 0.4851F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4949F, -0.1809F, 0.7068F, 0.2094F, -0.6109F, 0.0F));
		PartDefinition y2_r9 = y2.addOrReplaceChild("y2_r9", CubeListBuilder.create().texOffs(43, 82).addBox(0.0744F, -0.0764F, -0.4909F, 1.5288F, 0.2293F, 0.5101F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4808F, -0.159F, 0.6867F, 0.0873F, -0.6109F, 0.0F));
		PartDefinition y2_r10 = y2.addOrReplaceChild("y2_r10", CubeListBuilder.create().texOffs(10, 5).addBox(0.0744F, -0.0764F, -0.4909F, 1.5288F, 0.2293F, 0.3058F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3104F, -0.1665F, 0.4433F, 0.2618F, -0.6109F, 0.0F));
		PartDefinition bl2 = left2.addOrReplaceChild("bl2", CubeListBuilder.create(), PartPose.offset(0.05F, -0.025F, -0.05F));
		PartDefinition bl2_r1 = bl2.addOrReplaceChild("bl2_r1",
				CubeListBuilder.create().texOffs(39, 30).addBox(0.0873F, 0.0673F, -0.3967F, 1.794F, 0.1794F, 0.2691F, new CubeDeformation(0.0F)).texOffs(49, 33).addBox(0.0873F, -0.0897F, -0.5313F, 1.794F, 0.1794F, 0.4036F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8727F, -0.6109F, 0.0F));
		PartDefinition bl2_r2 = bl2.addOrReplaceChild("bl2_r2",
				CubeListBuilder.create().texOffs(24, 15).addBox(0.0873F, 0.4709F, -0.307F, 1.794F, 0.2691F, 0.2691F, new CubeDeformation(0.0F)).texOffs(24, 15).addBox(0.0873F, -0.0897F, -0.5761F, 1.794F, 0.2691F, 0.2691F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1997F, -0.2615F, 0.2853F, 0.6981F, -0.6109F, 0.0F));
		PartDefinition bl2_r3 = bl2.addOrReplaceChild("bl2_r3", CubeListBuilder.create().texOffs(24, 15).addBox(0.0873F, 0.0897F, -1.3834F, 1.794F, 0.1794F, 0.314F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1059F, -0.2672F, 1.5794F, 0.3927F, -0.6109F, 0.0F));
		PartDefinition bl2_r4 = bl2.addOrReplaceChild("bl2_r4", CubeListBuilder.create().texOffs(84, 15).addBox(0.0873F, 0.157F, -1.3834F, 1.794F, 0.1121F, 1.1661F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5631F, 0.2515F, 0.8042F, -0.0436F, -0.6109F, 0.0F));
		PartDefinition bl2_r5 = bl2.addOrReplaceChild("bl2_r5", CubeListBuilder.create().texOffs(24, 15).addBox(0.0873F, 0.1346F, -1.0246F, 1.794F, 0.4036F, 0.4485F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5731F, -0.147F, 0.8185F, 0.0F, -0.6109F, 0.0F));
		PartDefinition bl2_r6 = bl2.addOrReplaceChild("bl2_r6", CubeListBuilder.create().texOffs(95, 40).addBox(0.0873F, 0.1345F, -0.621F, 1.794F, 0.4261F, 0.6503F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5814F, -0.1699F, 0.8303F, 0.0F, -0.6109F, 0.0F));
		PartDefinition bl2_r7 = bl2.addOrReplaceChild("bl2_r7", CubeListBuilder.create().texOffs(24, 15).addBox(0.8623F, 0.0603F, -1.3761F, 1.794F, 0.0691F, 0.3029F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5642F, -0.1866F, 0.8058F, 0.2841F, -0.0283F, 0.1975F));
		PartDefinition bl2_r8 = bl2.addOrReplaceChild("bl2_r8", CubeListBuilder.create().texOffs(24, 15).addBox(0.0873F, 0.0103F, -0.3511F, 1.794F, 0.1191F, 0.4779F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5642F, -0.1866F, 0.8058F, 1.2654F, -0.6109F, 0.0F));
		PartDefinition bl2_r9 = bl2.addOrReplaceChild("bl2_r9", CubeListBuilder.create().texOffs(24, 15).addBox(0.0873F, -0.0397F, -0.2761F, 1.794F, 0.0691F, 0.4529F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5642F, -0.1866F, 0.8058F, 0.6109F, -0.6109F, 0.0F));
		PartDefinition bl2_r10 = bl2.addOrReplaceChild("bl2_r10", CubeListBuilder.create().texOffs(99, 41).addBox(0.0873F, -0.0897F, -0.2761F, 1.794F, 0.0691F, 0.5029F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5642F, -0.1866F, 0.8058F, 0.3491F, -0.6109F, 0.0F));
		PartDefinition bl2_r11 = bl2.addOrReplaceChild("bl2_r11", CubeListBuilder.create().texOffs(97, 29).addBox(0.0873F, -0.0897F, -0.5761F, 1.794F, 0.2691F, 0.6279F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5642F, -0.1866F, 0.8058F, 0.0873F, -0.6109F, 0.0F));
		PartDefinition bl2_r12 = bl2.addOrReplaceChild("bl2_r12", CubeListBuilder.create().texOffs(24, 15).addBox(0.0873F, -0.0897F, -0.5761F, 1.794F, 0.2691F, 0.3588F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3643F, -0.1954F, 0.5202F, 0.2618F, -0.6109F, 0.0F));
		PartDefinition gan2 = left2.addOrReplaceChild("gan2", CubeListBuilder.create(), PartPose.offset(-0.5483F, -0.1278F, 0.6617F));
		PartDefinition gan2_r1 = gan2.addOrReplaceChild("gan2_r1",
				CubeListBuilder.create().texOffs(5, 5).addBox(0.1259F, 0.042F, -0.866F, 1.51F, 0.251F, 0.215F, new CubeDeformation(0.0F)).texOffs(14, 27).addBox(0.1259F, 0.017F, -0.841F, 1.51F, 0.301F, 0.165F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));
		PartDefinition gyokuken_head = head_main.addOrReplaceChild("gyokuken_head", CubeListBuilder.create(), PartPose.offset(0.55F, -7.7F, 5.0F));
		PartDefinition uwaago = gyokuken_head.addOrReplaceChild("uwaago",
				CubeListBuilder.create().texOffs(43, 86).addBox(-1.3F, -7.1115F, 4.6943F, 2.6F, 2.2F, 7.0F, new CubeDeformation(0.0F)).texOffs(80, 26).addBox(-1.1F, -7.2115F, 2.3943F, 2.2F, 2.1F, 9.3F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.3405F, -10.9411F));
		PartDefinition uwaago_r1 = uwaago.addOrReplaceChild("uwaago_r1", CubeListBuilder.create().texOffs(72, 81).addBox(-0.8F, -7.25F, -3.5F, 1.6F, 2.25F, 8.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.2115F, 6.6943F, 0.0873F, 0.0F, 0.0F));
		PartDefinition uwaago_r2 = uwaago.addOrReplaceChild("uwaago_r2", CubeListBuilder.create().texOffs(9, 3).addBox(-0.35F, -7.425F, 1.825F, 0.1F, 0.525F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0515F, 0.0022F, -0.0001F, -0.0435F, 0.0038F, 0.0872F));
		PartDefinition uwaago_r3 = uwaago.addOrReplaceChild("uwaago_r3", CubeListBuilder.create().texOffs(6, 3).addBox(0.25F, -7.425F, 1.825F, 0.1F, 0.525F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0515F, 0.0022F, -0.0001F, -0.0435F, -0.0038F, -0.0872F));
		PartDefinition uwaago_r4 = uwaago.addOrReplaceChild("uwaago_r4",
				CubeListBuilder.create().texOffs(3, 0).addBox(-0.25F, -7.425F, 1.825F, 0.5F, 0.625F, 0.375F, new CubeDeformation(0.0F)).texOffs(14, 0).addBox(-0.35F, -7.425F, 1.825F, 0.7F, 0.525F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition uwaago_r5 = uwaago.addOrReplaceChild("uwaago_r5", CubeListBuilder.create().texOffs(106, 6).addBox(-1.25F, -6.825F, 2.5F, 2.5F, 2.125F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition uwaago_r6 = uwaago.addOrReplaceChild("uwaago_r6", CubeListBuilder.create().texOffs(56, 88).addBox(-1.75F, -5.35F, 2.7F, 2.5F, 1.15F, 6.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0666F, -1.0569F, 0.8272F, -0.134F, 0.2163F, -0.0289F));
		PartDefinition uwaago_r7 = uwaago.addOrReplaceChild("uwaago_r7", CubeListBuilder.create().texOffs(11, 91).addBox(-0.75F, -5.35F, 2.7F, 2.5F, 1.15F, 6.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0666F, -1.0569F, 0.8272F, -0.134F, -0.2163F, 0.0289F));
		PartDefinition uwaago_r8 = uwaago.addOrReplaceChild("uwaago_r8", CubeListBuilder.create().texOffs(92, 76).addBox(-0.75F, -5.55F, 2.7F, 2.0F, 1.1F, 6.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0666F, -0.7569F, -0.1728F, 0.0F, -0.2182F, 0.0F));
		PartDefinition uwaago_r9 = uwaago.addOrReplaceChild("uwaago_r9", CubeListBuilder.create().texOffs(75, 103).addBox(4.0F, -6.35F, 4.6F, 2.0F, 1.7F, 5.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -0.6091F, -1.1988F, 0.0F, -0.6981F, 0.0F));
		PartDefinition uwaago_r10 = uwaago.addOrReplaceChild("uwaago_r10", CubeListBuilder.create().texOffs(104, 53).addBox(-6.0F, -6.35F, 4.6F, 2.0F, 1.7F, 5.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, -0.6091F, -1.1988F, 0.0F, 0.6981F, 0.0F));
		PartDefinition uwaago_r11 = uwaago.addOrReplaceChild("uwaago_r11", CubeListBuilder.create().texOffs(93, 26).addBox(-0.75F, -5.35F, 2.7F, 2.0F, 0.9F, 6.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0222F, -2.0134F, -0.6358F, -0.102F, -0.1932F, 0.4899F));
		PartDefinition uwaago_r12 = uwaago.addOrReplaceChild("uwaago_r12", CubeListBuilder.create().texOffs(93, 55).addBox(-1.25F, -5.35F, 2.7F, 2.0F, 0.9F, 6.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0222F, -2.0134F, -0.6358F, -0.102F, 0.1932F, -0.4899F));
		PartDefinition uwaago_r13 = uwaago.addOrReplaceChild("uwaago_r13", CubeListBuilder.create().texOffs(0, 93).addBox(-1.25F, -5.55F, 2.7F, 2.0F, 1.1F, 6.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0666F, -0.7569F, -0.1728F, 0.0F, 0.2182F, 0.0F));
		PartDefinition sitaago = gyokuken_head.addOrReplaceChild("sitaago",
				CubeListBuilder.create().texOffs(30, 84).addBox(-1.05F, -0.1115F, -6.2057F, 2.1F, 1.15F, 8.0F, new CubeDeformation(0.0F)).texOffs(18, 82).addBox(-0.95F, -0.1115F, -6.4057F, 1.9F, 1.05F, 8.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.3405F, -1.9411F, 0.0436F, 0.0F, 0.0F));
		PartDefinition sitaago_r1 = sitaago.addOrReplaceChild("sitaago_r1", CubeListBuilder.create().texOffs(97, 45).addBox(-0.9F, -10.15F, 3.95F, 1.65F, 0.9F, 6.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0666F, 10.0431F, -9.1728F, -0.0436F, 0.0F, 0.0F));
		PartDefinition sitaago_r2 = sitaago.addOrReplaceChild("sitaago_r2", CubeListBuilder.create().texOffs(0, 103).addBox(0.0F, -10.15F, 3.95F, 1.25F, 0.9F, 6.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0666F, 10.0431F, -9.1728F, -0.0447F, -0.218F, 0.0097F));
		PartDefinition sitaago_r3 = sitaago.addOrReplaceChild("sitaago_r3", CubeListBuilder.create().texOffs(20, 103).addBox(-1.25F, -10.15F, 3.95F, 1.25F, 0.9F, 6.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0666F, 10.0431F, -9.1728F, -0.0447F, 0.218F, -0.0097F));
		PartDefinition head_ke = gyokuken_head.addOrReplaceChild("head_ke",
				CubeListBuilder.create().texOffs(24, 39).addBox(-3.55F, -4.0F, -1.9F, 7.1F, 4.2F, 2.9F, new CubeDeformation(0.0F)).texOffs(94, 37).addBox(-3.15F, -4.5F, -1.6F, 6.3F, 4.6F, 2.6F, new CubeDeformation(0.0F)).texOffs(36, 105)
						.addBox(-1.75F, -4.95F, -1.6F, 3.5F, 5.95F, 2.6F, new CubeDeformation(0.0F)).texOffs(0, 37).addBox(-1.55F, -5.15F, -0.7F, 3.1F, 6.15F, 1.6F, new CubeDeformation(0.0F)).texOffs(102, 17)
						.addBox(-2.65F, -4.8F, -1.3F, 5.3F, 5.8F, 2.3F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition head_s_ke_right = head_ke.addOrReplaceChild("head_s_ke_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -0.3F, -0.7F, -0.2618F, 0.0873F, 0.0F));
		PartDefinition bone = head_s_ke_right.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(5.2F, -0.7F, 0.0F));
		PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1",
				CubeListBuilder.create().texOffs(29, 53).addBox(-0.625F, -2.0F, -2.1F, 0.2F, 0.4F, 2.8F, new CubeDeformation(0.0F)).texOffs(55, 57).addBox(-0.7F, -1.4F, -2.2F, 0.2F, 0.5F, 3.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone_r2 = bone.addOrReplaceChild("bone_r2",
				CubeListBuilder.create().texOffs(29, 53).addBox(-0.6F, -2.2F, -2.1F, 0.2F, 0.3F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 53).addBox(-0.6F, -1.2F, -2.1F, 0.2F, 0.3F, 2.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone_r3 = bone.addOrReplaceChild("bone_r3", CubeListBuilder.create().texOffs(29, 53).addBox(-0.5F, -0.5F, -2.6F, 0.2F, 0.3F, 2.8F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone2 = head_s_ke_right.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2F, -2.6F, -0.1F, -0.2999F, 0.1704F, -0.2214F));
		PartDefinition bone2_r1 = bone2.addOrReplaceChild("bone2_r1", CubeListBuilder.create().texOffs(29, 53).addBox(-0.3F, -0.6F, -1.7F, 0.2F, 0.3F, 1.9F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone2_r2 = bone2.addOrReplaceChild("bone2_r2", CubeListBuilder.create().texOffs(29, 53).addBox(-0.5F, -0.9F, -1.7F, 0.2F, 0.3F, 2.1F, new CubeDeformation(0.0F)).texOffs(29, 53)
				.addBox(-0.8F, 0.6F, -1.8F, 0.2F, 0.4F, 2.5F, new CubeDeformation(0.0F)).texOffs(65, 76).addBox(-0.7F, 0.1F, -1.8F, 0.2F, 0.6F, 2.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone2_r3 = bone2.addOrReplaceChild("bone2_r3", CubeListBuilder.create().texOffs(29, 53).addBox(-0.625F, -2.0F, -1.7F, 0.2F, 0.4F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone2_r4 = bone2.addOrReplaceChild("bone2_r4", CubeListBuilder.create().texOffs(101, 72).addBox(-0.7F, -1.6F, -1.8F, 0.2F, 0.7F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone2_r5 = bone2.addOrReplaceChild("bone2_r5", CubeListBuilder.create().texOffs(29, 53).addBox(-0.9F, -2.2F, -1.7F, 0.2F, 0.3F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone2_r6 = bone2.addOrReplaceChild("bone2_r6",
				CubeListBuilder.create().texOffs(29, 53).addBox(-0.6F, -1.2F, -1.7F, 0.2F, 0.3F, 1.5F, new CubeDeformation(0.0F)).texOffs(29, 53).addBox(-0.5F, -0.3F, -1.7F, 0.2F, 0.3F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone3 = head_s_ke_right.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2F, -0.8F, -0.6F, 0.2999F, 0.1704F, 0.2214F));
		PartDefinition bone3_r1 = bone3.addOrReplaceChild("bone3_r1", CubeListBuilder.create().texOffs(35, 74).addBox(-0.3F, 0.3F, -1.7F, 0.2F, 0.3F, 1.9F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone3_r2 = bone3.addOrReplaceChild("bone3_r2", CubeListBuilder.create().texOffs(29, 53).addBox(-0.5F, 0.6F, -1.7F, 0.2F, 0.3F, 2.1F, new CubeDeformation(0.0F)).texOffs(35, 55)
				.addBox(-0.8F, -1.0F, -1.8F, 0.2F, 0.4F, 2.5F, new CubeDeformation(0.0F)).texOffs(65, 75).addBox(-0.7F, -0.7F, -1.8F, 0.2F, 0.6F, 2.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone3_r3 = bone3.addOrReplaceChild("bone3_r3", CubeListBuilder.create().texOffs(101, 71).addBox(-0.7F, 0.9F, -1.8F, 0.2F, 0.7F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone3_r4 = bone3.addOrReplaceChild("bone3_r4",
				CubeListBuilder.create().texOffs(29, 53).addBox(-0.6F, 0.9F, -1.7F, 0.2F, 0.3F, 1.5F, new CubeDeformation(0.0F)).texOffs(29, 53).addBox(-0.5F, 0.0F, -1.7F, 0.2F, 0.3F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition head_s_ke_left = head_ke.addOrReplaceChild("head_s_ke_left", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.3F, -0.7F, -0.2618F, -0.0873F, 0.0F));
		PartDefinition bone4 = head_s_ke_left.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.2F, -0.7F, 0.0F));
		PartDefinition bone4_r1 = bone4.addOrReplaceChild("bone4_r1",
				CubeListBuilder.create().texOffs(16, 42).addBox(0.425F, -2.0F, -2.1F, 0.2F, 0.4F, 2.8F, new CubeDeformation(0.0F)).texOffs(23, 66).addBox(0.5F, -1.4F, -2.2F, 0.2F, 0.5F, 3.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone4_r2 = bone4.addOrReplaceChild("bone4_r2",
				CubeListBuilder.create().texOffs(16, 42).addBox(0.4F, -2.2F, -2.1F, 0.2F, 0.3F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 42).addBox(0.4F, -1.2F, -2.1F, 0.2F, 0.3F, 2.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone4_r3 = bone4.addOrReplaceChild("bone4_r3", CubeListBuilder.create().texOffs(16, 42).addBox(0.3F, -0.5F, -2.6F, 0.2F, 0.3F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone5 = head_s_ke_left.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2F, -2.6F, -0.1F, -0.2999F, -0.1704F, 0.2214F));
		PartDefinition bone5_r1 = bone5.addOrReplaceChild("bone5_r1", CubeListBuilder.create().texOffs(16, 42).addBox(0.1F, -0.6F, -1.7F, 0.2F, 0.3F, 1.9F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone5_r2 = bone5.addOrReplaceChild("bone5_r2", CubeListBuilder.create().texOffs(16, 42).addBox(0.3F, -0.9F, -1.7F, 0.2F, 0.3F, 2.1F, new CubeDeformation(0.0F)).texOffs(16, 42)
				.addBox(0.6F, 0.6F, -1.8F, 0.2F, 0.4F, 2.5F, new CubeDeformation(0.0F)).texOffs(24, 78).addBox(0.5F, 0.1F, -1.8F, 0.2F, 0.6F, 2.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone5_r3 = bone5.addOrReplaceChild("bone5_r3", CubeListBuilder.create().texOffs(16, 42).addBox(0.425F, -2.0F, -1.7F, 0.2F, 0.4F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone5_r4 = bone5.addOrReplaceChild("bone5_r4", CubeListBuilder.create().texOffs(88, 59).addBox(0.5F, -1.6F, -1.8F, 0.2F, 0.7F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone5_r5 = bone5.addOrReplaceChild("bone5_r5", CubeListBuilder.create().texOffs(16, 42).addBox(0.7F, -2.2F, -1.7F, 0.2F, 0.3F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone5_r6 = bone5.addOrReplaceChild("bone5_r6",
				CubeListBuilder.create().texOffs(16, 42).addBox(0.4F, -1.2F, -1.7F, 0.2F, 0.3F, 1.5F, new CubeDeformation(0.0F)).texOffs(16, 42).addBox(0.3F, -0.3F, -1.7F, 0.2F, 0.3F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone6 = head_s_ke_left.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2F, -0.8F, -0.6F, 0.2999F, -0.1704F, -0.2214F));
		PartDefinition bone6_r1 = bone6.addOrReplaceChild("bone6_r1", CubeListBuilder.create().texOffs(16, 42).addBox(0.1F, 0.3F, -1.7F, 0.2F, 0.3F, 1.9F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone6_r2 = bone6.addOrReplaceChild("bone6_r2", CubeListBuilder.create().texOffs(16, 42).addBox(0.3F, 0.6F, -1.7F, 0.2F, 0.3F, 2.1F, new CubeDeformation(0.0F)).texOffs(16, 42)
				.addBox(0.6F, -1.0F, -1.8F, 0.2F, 0.4F, 2.5F, new CubeDeformation(0.0F)).texOffs(24, 77).addBox(0.5F, -0.7F, -1.8F, 0.2F, 0.6F, 2.3F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone6_r3 = bone6.addOrReplaceChild("bone6_r3", CubeListBuilder.create().texOffs(86, 85).addBox(0.5F, 0.9F, -1.8F, 0.2F, 0.7F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone6_r4 = bone6.addOrReplaceChild("bone6_r4",
				CubeListBuilder.create().texOffs(16, 42).addBox(0.4F, 0.9F, -1.7F, 0.2F, 0.3F, 1.5F, new CubeDeformation(0.0F)).texOffs(16, 42).addBox(0.3F, 0.0F, -1.7F, 0.2F, 0.3F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition mimi = gyokuken_head.addOrReplaceChild("mimi", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 3.0F));
		PartDefinition right = mimi.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.15F, -0.85F, -1.6F, -0.0894F, -0.3829F, 0.5846F));
		PartDefinition w = right.addOrReplaceChild("w", CubeListBuilder.create(), PartPose.offset(0.5492F, -1.4163F, 0.144F));
		PartDefinition w_r1 = w.addOrReplaceChild("w_r1", CubeListBuilder.create().texOffs(30, 75).addBox(0.7917F, -1.9119F, -2.3633F, 0.8627F, 1.9119F, 0.7799F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2171F, 1.2389F, -0.3715F, 0.0F, 0.0F, 0.1745F));
		PartDefinition w_r2 = w.addOrReplaceChild("w_r2", CubeListBuilder.create().texOffs(3, 72).addBox(-0.2093F, -1.5042F, -2.3633F, 1.3177F, 1.5042F, 0.7799F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9143F, 1.305F, -0.3715F, 0.0F, 0.0F, -0.3491F));
		PartDefinition w_r3 = w.addOrReplaceChild("w_r3", CubeListBuilder.create().texOffs(56, 79).addBox(0.7917F, -1.3222F, -2.3633F, 0.5897F, 1.3222F, 0.7799F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1237F, -0.655F, -0.3715F, 0.0F, 0.0F, 0.3054F));
		PartDefinition w_r4 = w.addOrReplaceChild("w_r4", CubeListBuilder.create().texOffs(53, 76).addBox(0.2457F, -1.3222F, -2.3633F, 0.8627F, 1.3222F, 0.7799F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5066F, 0.1079F, -0.3715F, 0.0F, 0.0F, -0.5672F));
		PartDefinition w_r5 = w.addOrReplaceChild("w_r5", CubeListBuilder.create().texOffs(0, 16).addBox(0.91F, -1.729F, -2.821F, 0.364F, 1.729F, 1.001F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1575F, -0.7605F, -0.144F, 0.0F, 0.0F, 0.3054F));
		PartDefinition w_r6 = w.addOrReplaceChild("w_r6", CubeListBuilder.create().texOffs(14, 6).addBox(0.91F, -2.093F, -2.821F, 0.364F, 2.093F, 1.001F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5492F, 1.4163F, -0.144F, 0.0F, 0.0F, 0.1745F));
		PartDefinition w_r7 = w.addOrReplaceChild("w_r7", CubeListBuilder.create().texOffs(10, 16).addBox(0.91F, -1.729F, -2.821F, 0.364F, 1.729F, 1.001F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9006F, 1.4923F, -0.144F, 0.0F, 0.0F, -0.3491F));
		PartDefinition w_r8 = w.addOrReplaceChild("w_r8", CubeListBuilder.create().texOffs(0, 24).addBox(0.91F, -1.729F, -2.821F, 0.364F, 1.729F, 1.001F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.432F, 0.1164F, -0.144F, 0.0F, 0.0F, -0.5672F));
		PartDefinition left = mimi.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offsetAndRotation(1.15F, -0.85F, -1.6F, -0.0894F, 0.3829F, -0.5846F));
		PartDefinition w2 = left.addOrReplaceChild("w2", CubeListBuilder.create(), PartPose.offset(-0.5492F, -1.4163F, 0.144F));
		PartDefinition w2_r1 = w2.addOrReplaceChild("w2_r1", CubeListBuilder.create().texOffs(72, 22).addBox(-1.6544F, -1.9119F, -2.3633F, 0.8627F, 1.9119F, 0.7799F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2171F, 1.2389F, -0.3715F, 0.0F, 0.0F, -0.1745F));
		PartDefinition w2_r2 = w2.addOrReplaceChild("w2_r2", CubeListBuilder.create().texOffs(71, 0).addBox(-1.1084F, -1.5042F, -2.3633F, 1.3177F, 1.5042F, 0.7799F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9143F, 1.305F, -0.3715F, 0.0F, 0.0F, 0.3491F));
		PartDefinition w2_r3 = w2.addOrReplaceChild("w2_r3", CubeListBuilder.create().texOffs(56, 77).addBox(-1.3814F, -1.3222F, -2.3633F, 0.5897F, 1.3222F, 0.7799F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1237F, -0.655F, -0.3715F, 0.0F, 0.0F, -0.3054F));
		PartDefinition w2_r4 = w2.addOrReplaceChild("w2_r4", CubeListBuilder.create().texOffs(34, 75).addBox(-1.1084F, -1.3222F, -2.3633F, 0.8627F, 1.3222F, 0.7799F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5066F, 0.1079F, -0.3715F, 0.0F, 0.0F, 0.5672F));
		PartDefinition w2_r5 = w2.addOrReplaceChild("w2_r5", CubeListBuilder.create().texOffs(14, 8).addBox(-1.274F, -1.729F, -2.821F, 0.364F, 1.729F, 1.001F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1575F, -0.7605F, -0.144F, 0.0F, 0.0F, -0.3054F));
		PartDefinition w2_r6 = w2.addOrReplaceChild("w2_r6", CubeListBuilder.create().texOffs(14, 4).addBox(-1.274F, -2.093F, -2.821F, 0.364F, 2.093F, 1.001F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5492F, 1.4163F, -0.144F, 0.0F, 0.0F, -0.1745F));
		PartDefinition w2_r7 = w2.addOrReplaceChild("w2_r7", CubeListBuilder.create().texOffs(14, 10).addBox(-1.274F, -1.729F, -2.821F, 0.364F, 1.729F, 1.001F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9006F, 1.4923F, -0.144F, 0.0F, 0.0F, 0.3491F));
		PartDefinition w2_r8 = w2.addOrReplaceChild("w2_r8", CubeListBuilder.create().texOffs(14, 12).addBox(-1.274F, -1.729F, -2.821F, 0.364F, 1.729F, 1.001F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.432F, 0.1164F, -0.144F, 0.0F, 0.0F, 0.5672F));
		PartDefinition moyou = gyokuken_head.addOrReplaceChild("moyou", CubeListBuilder.create(), PartPose.offset(0.0F, -2.25F, -4.0F));
		PartDefinition moyou_r1 = moyou.addOrReplaceChild("moyou_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2F, 0.2F, -0.2F, 0.4F, 0.1F, 0.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition moyou_r2 = moyou.addOrReplaceChild("moyou_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.65F, 0.2F, -0.4F, 0.1F, 0.1F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9F, -0.025F, 0.05F, 0.6682F, 0.3879F, 0.2902F));
		PartDefinition moyou_r3 = moyou.addOrReplaceChild("moyou_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.65F, 0.2F, -0.4F, 0.1F, 0.1F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1872F, 0.3117F, -0.3878F, 0.7854F, 0.3879F, 0.2902F));
		PartDefinition moyou_r4 = moyou.addOrReplaceChild("moyou_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.75F, 0.2F, -0.4F, 0.1F, 0.1F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9F, -0.025F, 0.05F, 0.6682F, -0.3879F, -0.2902F));
		PartDefinition moyou_r5 = moyou.addOrReplaceChild("moyou_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.75F, 0.2F, -0.4F, 0.1F, 0.1F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1872F, 0.3117F, -0.3878F, 0.7854F, -0.3879F, -0.2902F));
		PartDefinition moyou_r6 = moyou.addOrReplaceChild("moyou_r6", CubeListBuilder.create().texOffs(0, 0).addBox(0.55F, 0.075F, -1.45F, 0.4F, 0.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.55F, 0.075F, -1.325F, 1.2F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.95F, 0.075F, -1.45F, 0.4F, 0.1F, 0.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition gyokuken_tail = partdefinition.addOrReplaceChild("gyokuken_tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.4572F, 12.8296F, 0.7854F, 0.0F, 0.0F));
		PartDefinition shippo3 = gyokuken_tail.addOrReplaceChild(
				"shippo3", CubeListBuilder.create().texOffs(80, 39).addBox(-1.9589F, -2.3569F, -1.3F, 3.9178F, 3.9178F, 6.2237F, new CubeDeformation(0.0F)).texOffs(89, 0)
						.addBox(-2.2089F, -1.8569F, -1.05F, 4.4178F, 2.9178F, 4.2237F, new CubeDeformation(0.0F)).texOffs(45, 95).addBox(-1.4589F, -2.8569F, -1.6F, 2.7178F, 4.9178F, 5.0237F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.7071F, 2.1213F, 0.0436F, 0.0F, 0.0F));
		PartDefinition shippo3_r1 = shippo3.addOrReplaceChild("shippo3_r1", CubeListBuilder.create().texOffs(23, 53).addBox(-2.4589F, -2.2089F, 2.75F, 4.9178F, 4.4178F, 2.4737F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.8781F, -5.6929F, -0.3054F, 0.0F, 0.0F));
		PartDefinition shippo2 = gyokuken_tail.addOrReplaceChild("shippo2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7071F, 7.345F, 1.309F, 0.0F, 0.0F));
		PartDefinition shippo2_r1 = shippo2.addOrReplaceChild("shippo2_r1", CubeListBuilder.create().texOffs(100, 84).addBox(-1.6324F, -2.2119F, -0.0553F, 3.2648F, 3.2648F, 3.8178F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2762F, -0.807F, -0.7854F, 0.0F, 0.0F));
		PartDefinition shippo4 = gyokuken_tail.addOrReplaceChild("shippo4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5988F, 9.9568F, 1.6581F, 0.0F, 0.0F));
		PartDefinition shippo4_r1 = shippo4.addOrReplaceChild("shippo4_r1", CubeListBuilder.create().texOffs(26, 0).addBox(-0.7059F, -0.7036F, 2.9258F, 1.4118F, 1.4118F, 2.9383F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6907F, 0.0259F, -0.6109F, 0.0F, 0.0F));
		PartDefinition shippo4_r2 = shippo4.addOrReplaceChild("shippo4_r2", CubeListBuilder.create().texOffs(0, 25).addBox(-1.1059F, -1.7036F, 1.4258F, 2.2118F, 2.0118F, 2.9383F, new CubeDeformation(0.0F)).texOffs(27, 24).addBox(-1.3059F, -2.0036F,
				-0.2742F, 2.6118F, 2.6118F, 2.9383F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6907F, 0.0259F, -0.7854F, 0.0F, 0.0F));
		PartDefinition gyokuken_body = partdefinition.addOrReplaceChild("gyokuken_body",
				CubeListBuilder.create().texOffs(30, 55).addBox(-3.8478F, -2.7269F, 11.908F, 7.6956F, 6.2381F, 7.5207F, new CubeDeformation(0.0F)).texOffs(59, 46)
						.addBox(-2.9733F, -3.2099F, 9.576F, 5.9466F, 5.8466F, 8.8112F, new CubeDeformation(0.0F)).texOffs(30, 69).addBox(-2.0158F, -3.4929F, 7.5355F, 4.0316F, 6.1296F, 9.3942F, new CubeDeformation(0.0F)).texOffs(76, 14)
						.addBox(-3.3231F, -2.1193F, 14.2798F, 6.5879F, 6.2381F, 5.9387F, new CubeDeformation(0.0F)).texOffs(75, 69).addBox(-2.3231F, -1.6193F, 14.0298F, 4.5879F, 5.2381F, 6.6887F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.8748F, -6.2612F));
		PartDefinition gyokuken_body_r1 = gyokuken_body.addOrReplaceChild(
				"gyokuken_body_r1", CubeListBuilder.create().texOffs(74, 61).addBox(-3.8478F, -2.8334F, 5.795F, 7.6956F, 4.7806F, 3.4397F, new CubeDeformation(0.0F)).texOffs(60, 34)
						.addBox(-3.5563F, -3.1249F, 5.795F, 7.1126F, 5.3636F, 6.3547F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-3.2648F, -3.7079F, 5.795F, 6.5296F, 6.5296F, 13.0592F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.934F, -3.798F, -0.1745F, 0.0F, 0.0F));
		PartDefinition gyokuken_body_r2 = gyokuken_body.addOrReplaceChild("gyokuken_body_r2",
				CubeListBuilder.create().texOffs(25, 22).addBox(-2.3903F, -5.1654F, 2.88F, 4.7806F, 1.8656F, 14.8082F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.6818F, -4.8739F, 2.88F, 5.3636F, 1.2826F, 15.9742F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.934F, -3.798F, -0.2618F, 0.0F, 0.0F));
		PartDefinition neck = gyokuken_body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.4951F, -0.4643F));
		PartDefinition bone25 = neck.addOrReplaceChild("bone25",
				CubeListBuilder.create().texOffs(36, 39).addBox(-4.2442F, -3.319F, -0.214F, 8.4885F, 7.8355F, 7.8355F, new CubeDeformation(0.0F)).texOffs(26, 0).addBox(-4.5357F, -2.4445F, 0.952F, 9.0715F, 7.8355F, 7.8355F, new CubeDeformation(0.0F))
						.texOffs(0, 52).addBox(-3.9527F, -3.319F, 0.369F, 7.614F, 9.0015F, 7.2525F, new CubeDeformation(0.0F)).texOffs(54, 61).addBox(-2.7867F, -3.319F, -0.797F, 5.5735F, 7.2525F, 8.4185F, new CubeDeformation(0.0F)).texOffs(86, 85)
						.addBox(-1.9122F, -0.6955F, -1.0885F, 3.8245F, 4.629F, 5.5035F, new CubeDeformation(0.0F)).texOffs(80, 49).addBox(-3.2298F, 4.8136F, 1.8291F, 6.1681F, 1.3712F, 4.5707F, new CubeDeformation(0.0F)).texOffs(48, 4)
						.addBox(-2.4033F, 2.4559F, 5.9193F, 4.5152F, 2.8637F, 11.7533F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0135F, -4.2856F));
		PartDefinition bone25_r1 = bone25.addOrReplaceChild("bone25_r1", CubeListBuilder.create().texOffs(20, 17).addBox(-2.9383F, -1.3059F, 0.0F, 5.8766F, 0.0F, 7.1826F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.9095F, 1.6536F, 0.5672F, 0.0F, 0.0F));
		PartDefinition bone25_r2 = bone25.addOrReplaceChild("bone25_r2", CubeListBuilder.create().texOffs(0, 37).addBox(-2.9033F, 0.0746F, 1.9589F, 5.5152F, 2.8637F, 11.7533F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.6313F, 3.9604F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bone25_r3 = bone25.addOrReplaceChild("bone25_r3", CubeListBuilder.create().texOffs(50, 19).addBox(-3.6612F, -6.1098F, -3.2648F, 7.3225F, 6.961F, 8.127F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));
		PartDefinition bone25_r4 = bone25.addOrReplaceChild("bone25_r4", CubeListBuilder.create().texOffs(70, 0).addBox(-3.0782F, -7.2758F, -3.7312F, 6.1565F, 7.2525F, 6.9027F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-3.9527F, -6.9843F,
				-3.498F, 7.9055F, 6.961F, 6.6695F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0036F, 0.0F, 0.0F));
		PartDefinition bone25_r5 = bone25.addOrReplaceChild("bone25_r5", CubeListBuilder.create().texOffs(0, 82).addBox(-2.6197F, -6.6928F, -3.498F, 5.2395F, 6.5025F, 4.3375F, new CubeDeformation(0.0F)).texOffs(56, 76).addBox(-3.6612F, -7.2758F,
				-3.498F, 7.3225F, 6.1695F, 4.5707F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4156F, 0.952F, -0.3054F, 0.0F, 0.0F));
		PartDefinition neck_ke_left = neck.addOrReplaceChild("neck_ke_left", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9328F, -4.3597F, -0.9517F, -0.2618F, -0.0873F, 0.0F));
		PartDefinition bone14 = neck_ke_left.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0632F, -2.7401F, -1.8656F, -0.2964F, 0.08F, 0.1446F));
		PartDefinition bone14_r1 = bone14.addOrReplaceChild("bone14_r1", CubeListBuilder.create().texOffs(53, 21).addBox(0.1166F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone14_r2 = bone14.addOrReplaceChild(
				"bone14_r2", CubeListBuilder.create().texOffs(53, 21).addBox(0.3498F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(53, 21)
						.addBox(0.6996F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(105, 25).addBox(0.583F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone14_r3 = bone14.addOrReplaceChild("bone14_r3", CubeListBuilder.create().texOffs(53, 21).addBox(0.4955F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone14_r4 = bone14.addOrReplaceChild("bone14_r4", CubeListBuilder.create().texOffs(123, 25).addBox(0.583F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2332F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone14_r5 = bone14.addOrReplaceChild("bone14_r5", CubeListBuilder.create().texOffs(53, 21).addBox(0.8162F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone14_r6 = bone14.addOrReplaceChild("bone14_r6", CubeListBuilder.create().texOffs(53, 21).addBox(0.4664F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(53, 21).addBox(0.3498F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone15 = neck_ke_left.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0632F, -1.8656F, -0.4081F, -0.2964F, 0.08F, 0.1446F));
		PartDefinition bone15_r1 = bone15.addOrReplaceChild("bone15_r1", CubeListBuilder.create().texOffs(53, 21).addBox(0.1166F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone15_r2 = bone15.addOrReplaceChild(
				"bone15_r2", CubeListBuilder.create().texOffs(53, 21).addBox(0.3498F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(53, 21)
						.addBox(0.6996F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(111, 53).addBox(0.583F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone15_r3 = bone15.addOrReplaceChild("bone15_r3", CubeListBuilder.create().texOffs(53, 21).addBox(0.4955F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone15_r4 = bone15.addOrReplaceChild("bone15_r4", CubeListBuilder.create().texOffs(123, 24).addBox(0.583F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2332F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone15_r5 = bone15.addOrReplaceChild("bone15_r5", CubeListBuilder.create().texOffs(53, 21).addBox(0.8162F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone15_r6 = bone15.addOrReplaceChild("bone15_r6", CubeListBuilder.create().texOffs(53, 21).addBox(0.4664F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(53, 21).addBox(0.3498F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone16 = neck_ke_left.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0632F, -0.1166F, -2.4486F, -0.2964F, 0.08F, 0.1446F));
		PartDefinition bone16_r1 = bone16.addOrReplaceChild("bone16_r1", CubeListBuilder.create().texOffs(53, 21).addBox(0.1166F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone16_r2 = bone16.addOrReplaceChild(
				"bone16_r2", CubeListBuilder.create().texOffs(53, 21).addBox(0.3498F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(53, 21)
						.addBox(0.6996F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(76, 86).addBox(0.583F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone16_r3 = bone16.addOrReplaceChild("bone16_r3", CubeListBuilder.create().texOffs(53, 21).addBox(0.4955F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone16_r4 = bone16.addOrReplaceChild("bone16_r4", CubeListBuilder.create().texOffs(123, 23).addBox(0.583F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2332F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone16_r5 = bone16.addOrReplaceChild("bone16_r5", CubeListBuilder.create().texOffs(53, 21).addBox(0.8162F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone16_r6 = bone16.addOrReplaceChild("bone16_r6", CubeListBuilder.create().texOffs(53, 21).addBox(0.4664F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(53, 21).addBox(0.3498F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone17 = neck_ke_left.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8132F, 1.4239F, -2.7401F, -0.3045F, -0.0376F, -0.2303F));
		PartDefinition bone17_r1 = bone17.addOrReplaceChild("bone17_r1", CubeListBuilder.create().texOffs(53, 21).addBox(0.1166F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone17_r2 = bone17.addOrReplaceChild(
				"bone17_r2", CubeListBuilder.create().texOffs(53, 21).addBox(0.3498F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(53, 21)
						.addBox(0.6996F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(82, 70).addBox(0.583F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone17_r3 = bone17.addOrReplaceChild("bone17_r3", CubeListBuilder.create().texOffs(53, 21).addBox(0.4955F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone17_r4 = bone17.addOrReplaceChild("bone17_r4", CubeListBuilder.create().texOffs(119, 64).addBox(0.583F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2332F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone17_r5 = bone17.addOrReplaceChild("bone17_r5", CubeListBuilder.create().texOffs(53, 21).addBox(0.8162F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone17_r6 = bone17.addOrReplaceChild("bone17_r6", CubeListBuilder.create().texOffs(53, 21).addBox(0.4664F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(53, 21).addBox(0.3498F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone18 = neck_ke_left.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5652F, 3.9644F, -4.7806F, -0.3151F, -0.5997F, -1.3713F));
		PartDefinition bone18_r1 = bone18.addOrReplaceChild("bone18_r1", CubeListBuilder.create().texOffs(53, 21).addBox(0.1166F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone18_r2 = bone18.addOrReplaceChild(
				"bone18_r2", CubeListBuilder.create().texOffs(53, 21).addBox(0.3498F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(53, 21)
						.addBox(0.6996F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(53, 86).addBox(0.583F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone18_r3 = bone18.addOrReplaceChild("bone18_r3", CubeListBuilder.create().texOffs(53, 21).addBox(0.4955F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone18_r4 = bone18.addOrReplaceChild("bone18_r4", CubeListBuilder.create().texOffs(114, 21).addBox(0.583F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2332F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone18_r5 = bone18.addOrReplaceChild("bone18_r5", CubeListBuilder.create().texOffs(53, 21).addBox(0.8162F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone18_r6 = bone18.addOrReplaceChild("bone18_r6", CubeListBuilder.create().texOffs(53, 21).addBox(0.4664F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(53, 21).addBox(0.3498F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone19 = neck_ke_left.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5652F, 4.8389F, -3.3231F, -0.3151F, -0.5997F, -1.3713F));
		PartDefinition bone19_r1 = bone19.addOrReplaceChild("bone19_r1", CubeListBuilder.create().texOffs(53, 21).addBox(0.1166F, -0.6996F, -3.1482F, 0.2332F, 0.3498F, 3.3814F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone19_r2 = bone19.addOrReplaceChild(
				"bone19_r2", CubeListBuilder.create().texOffs(53, 21).addBox(0.3498F, -1.0494F, -3.1482F, 0.2332F, 0.3498F, 3.6146F, new CubeDeformation(0.0F)).texOffs(53, 21)
						.addBox(0.6996F, 0.6996F, -3.2648F, 0.2332F, 0.4664F, 4.081F, new CubeDeformation(0.0F)).texOffs(61, 32).addBox(0.583F, 0.1166F, -3.2648F, 0.2332F, 0.6996F, 3.8478F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone19_r3 = bone19.addOrReplaceChild("bone19_r3", CubeListBuilder.create().texOffs(53, 21).addBox(0.4955F, -2.332F, -3.1482F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone19_r4 = bone19.addOrReplaceChild("bone19_r4", CubeListBuilder.create().texOffs(60, 44).addBox(0.583F, -1.8656F, -3.2648F, 0.2332F, 0.8162F, 3.1482F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2332F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone19_r5 = bone19.addOrReplaceChild("bone19_r5", CubeListBuilder.create().texOffs(53, 21).addBox(0.8162F, -2.5652F, -3.1482F, 0.2332F, 0.3498F, 2.7984F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone19_r6 = bone19.addOrReplaceChild("bone19_r6", CubeListBuilder.create().texOffs(53, 21).addBox(0.4664F, -1.3992F, -3.1482F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)).texOffs(53, 21).addBox(0.3498F, -0.3498F,
				-3.1482F, 0.2332F, 0.3498F, 4.081F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone20 = neck_ke_left.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5652F, 8.3369F, -1.5741F, -0.3151F, -0.5997F, -1.3713F));
		PartDefinition bone20_r1 = bone20.addOrReplaceChild("bone20_r1", CubeListBuilder.create().texOffs(53, 21).addBox(0.1166F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone20_r2 = bone20.addOrReplaceChild(
				"bone20_r2", CubeListBuilder.create().texOffs(53, 21).addBox(0.3498F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(53, 21)
						.addBox(0.6996F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(76, 70).addBox(0.583F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone20_r3 = bone20.addOrReplaceChild("bone20_r3", CubeListBuilder.create().texOffs(53, 21).addBox(0.4955F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone20_r4 = bone20.addOrReplaceChild("bone20_r4", CubeListBuilder.create().texOffs(85, 67).addBox(0.583F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2332F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone20_r5 = bone20.addOrReplaceChild("bone20_r5", CubeListBuilder.create().texOffs(53, 21).addBox(0.8162F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone20_r6 = bone20.addOrReplaceChild("bone20_r6", CubeListBuilder.create().texOffs(53, 21).addBox(0.4664F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(53, 21).addBox(0.3498F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition neck_ke_right = neck.addOrReplaceChild("neck_ke_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9328F, -4.3597F, -0.9517F, -0.2618F, 0.0873F, 0.0F));
		PartDefinition bone7 = neck_ke_right.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0632F, -2.7401F, -1.8656F, -0.2964F, -0.08F, -0.1446F));
		PartDefinition bone7_r1 = bone7.addOrReplaceChild("bone7_r1", CubeListBuilder.create().texOffs(56, 19).addBox(-0.3498F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone7_r2 = bone7.addOrReplaceChild("bone7_r2",
				CubeListBuilder.create().texOffs(56, 19).addBox(-0.583F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(56, 19)
						.addBox(-0.9328F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(86, 63).addBox(-0.8162F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone7_r3 = bone7.addOrReplaceChild("bone7_r3", CubeListBuilder.create().texOffs(56, 19).addBox(-0.7287F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone7_r4 = bone7.addOrReplaceChild("bone7_r4", CubeListBuilder.create().texOffs(110, 74).addBox(-0.8162F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2332F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone7_r5 = bone7.addOrReplaceChild("bone7_r5", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0494F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone7_r6 = bone7.addOrReplaceChild("bone7_r6", CubeListBuilder.create().texOffs(56, 19).addBox(-0.6996F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(56, 19).addBox(-0.583F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone8 = neck_ke_right.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0632F, -1.8656F, -0.4081F, -0.2964F, -0.08F, -0.1446F));
		PartDefinition bone8_r1 = bone8.addOrReplaceChild("bone8_r1", CubeListBuilder.create().texOffs(56, 19).addBox(-0.3498F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone8_r2 = bone8.addOrReplaceChild("bone8_r2",
				CubeListBuilder.create().texOffs(56, 19).addBox(-0.583F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(56, 19)
						.addBox(-0.9328F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(114, 50).addBox(-0.8162F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone8_r3 = bone8.addOrReplaceChild("bone8_r3", CubeListBuilder.create().texOffs(56, 19).addBox(-0.7287F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone8_r4 = bone8.addOrReplaceChild("bone8_r4", CubeListBuilder.create().texOffs(110, 73).addBox(-0.8162F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2332F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone8_r5 = bone8.addOrReplaceChild("bone8_r5", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0494F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone8_r6 = bone8.addOrReplaceChild("bone8_r6", CubeListBuilder.create().texOffs(56, 19).addBox(-0.6996F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(56, 19).addBox(-0.583F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone9 = neck_ke_right.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0632F, -0.1166F, -2.4486F, -0.2964F, -0.08F, -0.1446F));
		PartDefinition bone9_r1 = bone9.addOrReplaceChild("bone9_r1", CubeListBuilder.create().texOffs(56, 19).addBox(-0.3498F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone9_r2 = bone9.addOrReplaceChild("bone9_r2",
				CubeListBuilder.create().texOffs(56, 19).addBox(-0.583F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(56, 19)
						.addBox(-0.9328F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(116, 62).addBox(-0.8162F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone9_r3 = bone9.addOrReplaceChild("bone9_r3", CubeListBuilder.create().texOffs(56, 19).addBox(-0.7287F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone9_r4 = bone9.addOrReplaceChild("bone9_r4", CubeListBuilder.create().texOffs(110, 72).addBox(-0.8162F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2332F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone9_r5 = bone9.addOrReplaceChild("bone9_r5", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0494F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone9_r6 = bone9.addOrReplaceChild("bone9_r6", CubeListBuilder.create().texOffs(56, 19).addBox(-0.6996F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(56, 19).addBox(-0.583F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone10 = neck_ke_right.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8132F, 1.4239F, -2.7401F, -0.3045F, 0.0376F, 0.2303F));
		PartDefinition bone10_r1 = bone10.addOrReplaceChild("bone10_r1", CubeListBuilder.create().texOffs(56, 19).addBox(-0.3498F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone10_r2 = bone10.addOrReplaceChild("bone10_r2",
				CubeListBuilder.create().texOffs(56, 19).addBox(-0.583F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(56, 19)
						.addBox(-0.9328F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(92, 62).addBox(-0.8162F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone10_r3 = bone10.addOrReplaceChild("bone10_r3", CubeListBuilder.create().texOffs(56, 19).addBox(-0.7287F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone10_r4 = bone10.addOrReplaceChild("bone10_r4", CubeListBuilder.create().texOffs(59, 69).addBox(-0.8162F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2332F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone10_r5 = bone10.addOrReplaceChild("bone10_r5", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0494F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone10_r6 = bone10.addOrReplaceChild("bone10_r6", CubeListBuilder.create().texOffs(56, 19).addBox(-0.6996F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(56, 19).addBox(-0.583F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone11 = neck_ke_right.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5652F, 3.9644F, -4.7806F, -0.3151F, 0.5997F, 1.3713F));
		PartDefinition bone11_r1 = bone11.addOrReplaceChild("bone11_r1", CubeListBuilder.create().texOffs(56, 19).addBox(-0.3498F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone11_r2 = bone11.addOrReplaceChild("bone11_r2",
				CubeListBuilder.create().texOffs(56, 19).addBox(-0.583F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(56, 19)
						.addBox(-0.9328F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(116, 61).addBox(-0.8162F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone11_r3 = bone11.addOrReplaceChild("bone11_r3", CubeListBuilder.create().texOffs(56, 19).addBox(-0.7287F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone11_r4 = bone11.addOrReplaceChild("bone11_r4", CubeListBuilder.create().texOffs(105, 38).addBox(-0.8162F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2332F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone11_r5 = bone11.addOrReplaceChild("bone11_r5", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0494F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone11_r6 = bone11.addOrReplaceChild("bone11_r6", CubeListBuilder.create().texOffs(56, 19).addBox(-0.6996F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(56, 19).addBox(-0.583F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone12 = neck_ke_right.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5652F, 4.8389F, -3.3231F, -0.3151F, 0.5997F, 1.3713F));
		PartDefinition bone12_r1 = bone12.addOrReplaceChild("bone12_r1", CubeListBuilder.create().texOffs(56, 19).addBox(-0.3498F, -0.6996F, -3.1482F, 0.2332F, 0.3498F, 3.3814F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone12_r2 = bone12.addOrReplaceChild("bone12_r2",
				CubeListBuilder.create().texOffs(56, 19).addBox(-0.583F, -1.0494F, -3.1482F, 0.2332F, 0.3498F, 3.6146F, new CubeDeformation(0.0F)).texOffs(56, 19)
						.addBox(-0.9328F, 0.6996F, -3.2648F, 0.2332F, 0.4664F, 4.081F, new CubeDeformation(0.0F)).texOffs(56, 30).addBox(-0.8162F, 0.1166F, -3.2648F, 0.2332F, 0.6996F, 3.8478F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone12_r3 = bone12.addOrReplaceChild("bone12_r3", CubeListBuilder.create().texOffs(56, 19).addBox(-0.7287F, -2.332F, -3.1482F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone12_r4 = bone12.addOrReplaceChild("bone12_r4", CubeListBuilder.create().texOffs(63, 41).addBox(-0.8162F, -1.8656F, -3.2648F, 0.2332F, 0.8162F, 3.1482F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2332F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone12_r5 = bone12.addOrReplaceChild("bone12_r5", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0494F, -2.5652F, -3.1482F, 0.2332F, 0.3498F, 2.7984F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone12_r6 = bone12.addOrReplaceChild("bone12_r6", CubeListBuilder.create().texOffs(56, 19).addBox(-0.6996F, -1.3992F, -3.1482F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)).texOffs(56, 19).addBox(-0.583F, -0.3498F,
				-3.1482F, 0.2332F, 0.3498F, 4.081F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone13 = neck_ke_right.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5652F, 8.3369F, -1.5741F, -0.3151F, 0.5997F, 1.3713F));
		PartDefinition bone13_r1 = bone13.addOrReplaceChild("bone13_r1", CubeListBuilder.create().texOffs(56, 19).addBox(-0.3498F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone13_r2 = bone13.addOrReplaceChild("bone13_r2",
				CubeListBuilder.create().texOffs(56, 19).addBox(-0.583F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(56, 19)
						.addBox(-0.9328F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(86, 62).addBox(-0.8162F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone13_r3 = bone13.addOrReplaceChild("bone13_r3", CubeListBuilder.create().texOffs(56, 19).addBox(-0.7287F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone13_r4 = bone13.addOrReplaceChild("bone13_r4", CubeListBuilder.create().texOffs(92, 43).addBox(-0.8162F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2332F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone13_r5 = bone13.addOrReplaceChild("bone13_r5", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0494F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone13_r6 = bone13.addOrReplaceChild("bone13_r6", CubeListBuilder.create().texOffs(56, 19).addBox(-0.6996F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(56, 19).addBox(-0.583F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition neck_up_right = neck.addOrReplaceChild("neck_up_right", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.994F, -4.232F, 0.4412F, 0.6532F, 1.5733F));
		PartDefinition bone21 = neck_up_right.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7501F, 5.163F, 0.3714F, -0.2964F, 0.08F, 0.1446F));
		PartDefinition bone21_r1 = bone21.addOrReplaceChild("bone21_r1", CubeListBuilder.create().texOffs(8, 27).addBox(0.1166F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.024F, -5.7789F, 0.1736F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone21_r2 = bone21.addOrReplaceChild(
				"bone21_r2", CubeListBuilder.create().texOffs(8, 27).addBox(0.3498F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(8, 27)
						.addBox(0.6996F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(68, 63).addBox(0.583F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.024F, -5.7789F, 0.1736F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone21_r3 = bone21.addOrReplaceChild("bone21_r3", CubeListBuilder.create().texOffs(8, 27).addBox(0.4955F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5576F, -5.7789F, 0.1736F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone21_r4 = bone21.addOrReplaceChild("bone21_r4", CubeListBuilder.create().texOffs(57, 45).addBox(0.583F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7908F, -5.7789F, 0.1736F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone21_r5 = bone21.addOrReplaceChild("bone21_r5", CubeListBuilder.create().texOffs(8, 27).addBox(0.8162F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5576F, -5.7789F, 0.1736F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone21_r6 = bone21.addOrReplaceChild("bone21_r6",
				CubeListBuilder.create().texOffs(8, 27).addBox(0.4664F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(8, 27).addBox(0.3498F, -0.3498F, -1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.024F, -5.7789F, 0.1736F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone22 = neck_up_right.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0001F, 0.499F, 6.1185F, -0.33F, 0.4541F, 0.0199F));
		PartDefinition bone22_r1 = bone22.addOrReplaceChild("bone22_r1", CubeListBuilder.create().texOffs(8, 27).addBox(0.1166F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone22_r2 = bone22.addOrReplaceChild(
				"bone22_r2", CubeListBuilder.create().texOffs(8, 27).addBox(0.3498F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(8, 27)
						.addBox(0.6996F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(8, 82).addBox(0.583F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone22_r3 = bone22.addOrReplaceChild("bone22_r3", CubeListBuilder.create().texOffs(8, 27).addBox(0.4956F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone22_r4 = bone22.addOrReplaceChild("bone22_r4", CubeListBuilder.create().texOffs(78, 40).addBox(0.583F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2332F, 0.398F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone22_r5 = bone22.addOrReplaceChild("bone22_r5", CubeListBuilder.create().texOffs(8, 27).addBox(0.8162F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4664F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition bone22_r6 = bone22.addOrReplaceChild("bone22_r6",
				CubeListBuilder.create().texOffs(8, 27).addBox(0.4664F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(8, 27).addBox(0.3498F, -0.3498F, -1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, -0.3927F, 0.0F));
		PartDefinition neck_up_left = neck.addOrReplaceChild("neck_up_left", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.994F, -4.232F, 0.4412F, -0.6532F, -1.5733F));
		PartDefinition bone23 = neck_up_left.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7501F, 5.163F, 0.3714F, -0.2964F, -0.08F, -0.1446F));
		PartDefinition bone23_r1 = bone23.addOrReplaceChild("bone23_r1", CubeListBuilder.create().texOffs(15, 44).addBox(-0.3498F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.024F, -5.7789F, 0.1736F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone23_r2 = bone23.addOrReplaceChild("bone23_r2",
				CubeListBuilder.create().texOffs(15, 44).addBox(-0.583F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(15, 44)
						.addBox(-0.9328F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(75, 77).addBox(-0.8162F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.024F, -5.7789F, 0.1736F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone23_r3 = bone23.addOrReplaceChild("bone23_r3", CubeListBuilder.create().texOffs(15, 44).addBox(-0.7287F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5576F, -5.7789F, 0.1736F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone23_r4 = bone23.addOrReplaceChild("bone23_r4", CubeListBuilder.create().texOffs(64, 61).addBox(-0.8162F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7908F, -5.7789F, 0.1736F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone23_r5 = bone23.addOrReplaceChild("bone23_r5", CubeListBuilder.create().texOffs(15, 44).addBox(-1.0494F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5576F, -5.7789F, 0.1736F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone23_r6 = bone23.addOrReplaceChild("bone23_r6", CubeListBuilder.create().texOffs(15, 44).addBox(-0.6996F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(15, 44).addBox(-0.583F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.024F, -5.7789F, 0.1736F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone24 = neck_up_left.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0001F, 0.499F, 6.1185F, -0.33F, -0.4541F, -0.0199F));
		PartDefinition bone24_r1 = bone24.addOrReplaceChild("bone24_r1", CubeListBuilder.create().texOffs(15, 44).addBox(-0.3498F, -0.6996F, -1.9822F, 0.2332F, 0.3498F, 2.2154F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.48F, 0.0F));
		PartDefinition bone24_r2 = bone24.addOrReplaceChild("bone24_r2",
				CubeListBuilder.create().texOffs(15, 44).addBox(-0.583F, -1.0494F, -1.9822F, 0.2332F, 0.3498F, 2.4486F, new CubeDeformation(0.0F)).texOffs(15, 44)
						.addBox(-0.9328F, 0.6996F, -2.0988F, 0.2332F, 0.4664F, 2.915F, new CubeDeformation(0.0F)).texOffs(15, 98).addBox(-0.8162F, 0.1166F, -2.0988F, 0.2332F, 0.6996F, 2.6818F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone24_r3 = bone24.addOrReplaceChild("bone24_r3", CubeListBuilder.create().texOffs(15, 44).addBox(-0.7287F, -2.332F, -1.9822F, 0.2332F, 0.4664F, 1.749F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone24_r4 = bone24.addOrReplaceChild("bone24_r4", CubeListBuilder.create().texOffs(85, 56).addBox(-0.8162F, -1.8656F, -2.0988F, 0.2332F, 0.8162F, 1.9822F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2332F, 0.398F, -0.3F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone24_r5 = bone24.addOrReplaceChild("bone24_r5", CubeListBuilder.create().texOffs(15, 44).addBox(-1.0494F, -2.5652F, -1.9822F, 0.2332F, 0.3498F, 1.6324F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4664F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone24_r6 = bone24.addOrReplaceChild("bone24_r6", CubeListBuilder.create().texOffs(15, 44).addBox(-0.6996F, -1.3992F, -1.9822F, 0.2332F, 0.3498F, 1.749F, new CubeDeformation(0.0F)).texOffs(15, 44).addBox(-0.583F, -0.3498F,
				-1.9822F, 0.2332F, 0.3498F, 2.915F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.398F, -0.3F, 0.0F, 0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		gyokuken_leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gyokuken_rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gyokuken_leftleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gyokuken_rightleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gyokuken_tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gyokuken_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.gyokuken_leftleg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.gyokuken_rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.gyokuken_leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.gyokuken_rightleg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
