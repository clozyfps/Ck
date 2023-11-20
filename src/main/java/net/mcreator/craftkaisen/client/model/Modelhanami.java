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
public class Modelhanami<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelhanami"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Body;
	public final ModelPart Head;

	public Modelhanami(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(105, 19).addBox(-3.1757F, 9.8223F, -2.55F, 5.05F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(80, 20)
				.addBox(-2.4257F, 19.8223F, -1.55F, 3.55F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(102, 93).addBox(-2.4257F, 22.5723F, -6.4F, 3.55F, 1.5F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.9F, -0.05F, 0.0F));
		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(15, 50).addBox(-1.525F, -1.25F, -1.85F, 3.05F, 2.5F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6507F, 21.8223F, 0.45F, -0.0873F, 0.0F, 0.0F));
		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2", CubeListBuilder.create().texOffs(103, 59).addBox(-2.9F, -5.25F, -3.25F, 5.55F, 11.0F, 6.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2F, 4.5F, 0.45F, 0.0F, 0.0F, 0.1309F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(105, 0).addBox(-1.8743F, 9.8223F, -2.55F, 5.05F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(80, 63)
				.addBox(-1.1243F, 19.8223F, -1.55F, 3.55F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(102, 93).addBox(-1.1243F, 22.5723F, -6.4F, 3.55F, 1.5F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(2.9F, -0.05F, 0.0F));
		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(76, 80).addBox(-1.525F, -1.25F, -1.85F, 3.05F, 2.5F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6507F, 21.8223F, 0.45F, -0.0873F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r2 = LeftLeg.addOrReplaceChild("LeftLeg_r2", CubeListBuilder.create().texOffs(103, 38).addBox(-2.65F, -5.25F, -3.25F, 5.55F, 11.0F, 6.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, 4.5F, 0.45F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(49, 89).addBox(-0.5241F, 3.3455F, -2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -15.3F, -0.25F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(34, 92).addBox(-0.725F, -2.0F, -2.225F, 1.45F, 4.0F, 4.45F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7263F, 17.0109F, 0.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2", CubeListBuilder.create().texOffs(7, 122).addBox(-0.75F, -2.25F, -0.5F, 1.5F, 4.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4184F, 21.6996F, -0.125F, 3.1416F, 0.0F, 0.5236F));
		PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3", CubeListBuilder.create().texOffs(15, 123).addBox(-0.75F, -2.0F, -0.5F, 1.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5434F, 21.4831F, 1.125F, 3.1416F, 0.0F, 0.5236F));
		PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4", CubeListBuilder.create().texOffs(24, 124).addBox(-0.75F, -1.5F, -0.5F, 1.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7934F, 21.0501F, 2.225F, 3.1416F, 0.0F, 0.5236F));
		PartDefinition LeftArm_r5 = LeftArm.addOrReplaceChild("LeftArm_r5", CubeListBuilder.create().texOffs(34, 123).addBox(-0.75F, -2.0F, -0.5F, 1.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1489F, 17.3985F, -2.2877F, 0.1309F, 0.0F, -2.618F));
		PartDefinition LeftArm_r6 = LeftArm.addOrReplaceChild("LeftArm_r6", CubeListBuilder.create().texOffs(0, 123).addBox(-0.75F, -2.0F, -0.5F, 1.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5434F, 21.4831F, -1.225F, 0.0F, 0.0F, -2.618F));
		PartDefinition LeftArm_r7 = LeftArm.addOrReplaceChild("LeftArm_r7",
				CubeListBuilder.create().texOffs(20, 92).addBox(0.6F, 15.5F, -2.25F, 1.5F, 4.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(0, 89).addBox(-2.4F, 8.5F, -2.25F, 4.5F, 7.0F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8134F, 0.6638F, 0.5F, 0.0F, 0.0F, 0.0873F));
		PartDefinition LeftArm_r8 = LeftArm.addOrReplaceChild("LeftArm_r8", CubeListBuilder.create().texOffs(74, 116).addBox(-2.75F, -2.0F, -2.75F, 5.5F, 6.0F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0312F, -7.8353F, 0.1464F, 0.0F, 1.1781F, 0.1745F));
		PartDefinition LeftArm_r9 = LeftArm.addOrReplaceChild("LeftArm_r9", CubeListBuilder.create().texOffs(74, 116).addBox(-2.75F, -0.25F, -2.75F, 5.5F, 4.25F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0312F, -7.8353F, 0.1464F, -3.1416F, 1.1781F, -2.9671F));
		PartDefinition LeftArm_r10 = LeftArm.addOrReplaceChild("LeftArm_r10", CubeListBuilder.create().texOffs(104, 113).addBox(-3.25F, -0.525F, -3.75F, 7.5F, 1.05F, 7.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9059F, -3.4897F, 0.5F, 0.0F, 0.7854F, 0.1745F));
		PartDefinition LeftArm_r11 = LeftArm.addOrReplaceChild("LeftArm_r11",
				CubeListBuilder.create().texOffs(104, 113).addBox(-3.25F, -1.0F, -4.25F, 7.5F, 1.0F, 7.5F, new CubeDeformation(0.0F)).texOffs(104, 113).addBox(-3.25F, -1.0F, -4.25F, 7.5F, 1.0F, 7.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9059F, -3.4897F, 0.5F, 0.0F, 0.0F, 0.1745F));
		PartDefinition LeftArm_r12 = LeftArm.addOrReplaceChild("LeftArm_r12", CubeListBuilder.create().texOffs(48, 104).addBox(-2.75F, -4.5F, -2.75F, 5.5F, 7.0F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 1.5F, 0.5F, 0.0F, 0.0F, -0.2182F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(66, 0).mirror().addBox(-4.4759F, 3.3455F, -2.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-8.0F, -15.3F, -0.25F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(62, 44).mirror().addBox(-0.725F, -2.0F, -2.225F, 1.45F, 4.0F, 4.45F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7263F, 17.0109F, 0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2",
				CubeListBuilder.create().texOffs(7, 122).mirror().addBox(0.25F, -2.25F, 0.625F, 1.5F, 4.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 123).mirror()
						.addBox(0.25F, -2.25F, 1.875F, 1.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 124).mirror().addBox(0.25F, -2.25F, 2.975F, 1.5F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 123)
						.mirror().addBox(0.25F, -2.25F, -0.475F, 1.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2844F, 22.1996F, -1.25F, 0.0F, 0.0F, -0.5236F));
		PartDefinition RightArm_r3 = RightArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(34, 123).mirror().addBox(-0.5F, -2.25F, -1.25F, 1.5F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1925F, 17.823F, -1.5767F, -0.1309F, 0.0F, -0.5236F));
		PartDefinition RightArm_r4 = RightArm.addOrReplaceChild("RightArm_r4", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-2.1F, 15.5F, -2.25F, 1.5F, 4.0F, 4.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(22, 70).mirror()
				.addBox(-2.1F, 8.5F, -2.25F, 4.5F, 7.0F, 4.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8134F, 0.6638F, 0.5F, 0.0F, 0.0F, -0.0873F));
		PartDefinition RightArm_r5 = RightArm.addOrReplaceChild("RightArm_r5", CubeListBuilder.create().texOffs(38, 62).mirror().addBox(-2.75F, -4.5F, -2.75F, 5.5F, 7.0F, 5.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5F, 1.5F, 0.5F, 0.0F, 0.0F, 0.2182F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -15.0F, -3.25F, 14.0F, 7.0F, 7.5F, new CubeDeformation(0.0F)).texOffs(75, 11).addBox(-3.0F, -19.0F, -2.25F, 6.0F, 4.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-5.0F, -8.0F, -3.0F, 10.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(92, 80).addBox(-5.25F, 1.0F, -3.25F, 10.5F, 2.0F, 7.5F, new CubeDeformation(0.0F)).texOffs(56, 76)
						.addBox(-6.25F, -14.0F, -3.625F, 6.0F, 5.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(87, 28).addBox(-4.05F, -7.75F, -3.375F, 4.0F, 1.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-3.55F, -5.75F, -3.375F, 3.5F, 1.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 16).addBox(0.05F, -7.75F, -3.375F, 4.0F, 1.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 63)
						.addBox(0.05F, -5.75F, -3.375F, 3.5F, 1.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 55).addBox(0.05F, -1.75F, -3.375F, 2.75F, 1.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 55).mirror()
						.addBox(-2.8F, -1.75F, -3.375F, 2.75F, 1.75F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(45, 34).addBox(0.25F, -14.0F, -3.625F, 6.0F, 5.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.05F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-1.625F, -0.875F, -0.5F, 3.25F, 1.75F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.675F, -2.875F, -2.875F, 0.0F, 0.0F, 3.1416F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.625F, -0.875F, -0.5F, 3.25F, 1.75F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.675F, -2.875F, -2.875F, 0.0F, 0.0F, -3.1416F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(0, 50).addBox(-2.0F, -3.75F, -2.975F, 4.0F, 7.25F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.974F, -4.8984F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(22, 52).addBox(-2.0F, -3.75F, -2.975F, 4.0F, 7.25F, 6.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.974F, -4.8984F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(107, 86).addBox(-1.25F, -0.25F, -0.25F, 2.75F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2417F, 4.848F, -3.5125F, 3.1253F, 0.0125F, 1.4319F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(111, 84).addBox(-1.5F, -0.25F, -0.25F, 2.75F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2417F, 4.848F, -3.5125F, 3.1253F, -0.0125F, -1.4319F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(104, 83).addBox(-1.0F, -0.25F, -0.25F, 2.0F, 1.25F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7678F, 3.0607F, -3.5F, 0.0F, 0.0F, -0.9163F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(110, 82).addBox(-1.0F, -0.25F, -0.25F, 2.0F, 1.25F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7678F, 3.0607F, -3.5F, 0.0F, 0.0F, 0.9163F));
		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(40, 26).addBox(-1.0F, -1.0F, -0.35F, 2.0F, 2.0F, 1.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(34, 15).addBox(-1.5F, -2.0F, -2.2F, 3.0F, 4.0F, 4.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3664F, -13.9064F, 0.0F, 0.0F, 0.0F, 1.2217F));
		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(42, 75).addBox(-1.5F, -2.0F, -2.2F, 3.0F, 4.0F, 4.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3664F, -13.9064F, 0.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 64).addBox(-3.5F, -9.0F, -4.25F, 7.0F, 8.075F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 34).addBox(-1.5F, -3.75F, -4.275F, 3.0F, 2.825F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 7)
						.addBox(-1.55F, -3.5F, -4.3F, 0.75F, 1.15F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-1.55F, -2.3F, -4.3F, 0.75F, 1.15F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 2)
						.addBox(0.775F, -3.5F, -4.3F, 0.75F, 1.15F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 32).addBox(1.575F, -3.25F, -4.3F, 0.75F, 0.9F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 32)
						.addBox(-2.325F, -3.25F, -4.3F, 0.75F, 0.9F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(0.775F, -2.3F, -4.3F, 0.75F, 1.15F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 32)
						.addBox(1.575F, -2.3F, -4.3F, 0.75F, 0.875F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 20).addBox(-2.325F, -2.3F, -4.3F, 0.75F, 0.875F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 20)
						.addBox(0.0F, -3.5F, -4.3F, 0.75F, 1.15F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 15).addBox(0.0F, -2.3F, -4.3F, 0.75F, 1.15F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 7)
						.addBox(-0.775F, -3.5F, -4.3F, 0.75F, 1.15F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 7).addBox(-0.775F, -2.3F, -4.3F, 0.75F, 1.15F, 0.0F, new CubeDeformation(0.0F)).texOffs(91, 1)
						.addBox(-2.5F, -3.5F, -4.275F, 1.0F, 2.325F, 0.0F, new CubeDeformation(0.0F)).texOffs(88, 1).addBox(1.5F, -3.5F, -4.275F, 1.0F, 2.325F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 16)
						.addBox(-3.25F, -8.75F, -1.25F, 6.5F, 7.775F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -20.05F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(36, 0).addBox(-2.8F, -3.75F, -1.0F, 5.6F, 4.0F, 1.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.2304F, -4.0915F, -0.3927F, 0.0F, 0.0F));
		PartDefinition horns2 = Head.addOrReplaceChild("horns2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Head_r2 = horns2.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(82, 99).addBox(-1.0F, -2.0F, -2.025F, 2.5F, 0.0F, 4.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9853F, -11.4008F, -8.1419F, -1.6986F, 0.5194F, 0.4664F));
		PartDefinition Head_r3 = horns2.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(82, 99).addBox(1.95F, 0.0F, -0.975F, 2.5F, 0.0F, 4.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9853F, -11.4008F, -8.1419F, -1.4591F, -0.1344F, 0.8739F));
		PartDefinition Head_r4 = horns2.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(82, 99).mirror().addBox(1.75F, 0.0F, -2.275F, 2.5F, 0.0F, 4.55F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9853F, -11.4008F, -8.1419F, -1.4021F, 0.045F, -0.258F));
		PartDefinition Head_r5 = horns2.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(94, 92).mirror().addBox(-0.625F, -0.6625F, -2.9F, 1.25F, 1.325F, 5.3F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.375F, -7.6411F, -6.857F, -1.3264F, 0.7703F, 0.1719F));
		PartDefinition Head_r6 = horns2.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(87, 91).mirror().addBox(-0.65F, -0.6625F, -1.375F, 1.3F, 1.325F, 2.75F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.375F, -5.5875F, -5.625F, 0.0F, 0.0F, -0.7854F));
		PartDefinition horns3 = Head.addOrReplaceChild("horns3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition Head_r7 = horns3.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(82, 99).mirror().addBox(-1.5F, -2.0F, -2.025F, 2.5F, 0.0F, 4.55F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9853F, -11.4008F, -8.1419F, -1.6986F, -0.5194F, -0.4664F));
		PartDefinition Head_r8 = horns3.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(82, 99).mirror().addBox(-4.45F, 0.0F, -0.975F, 2.5F, 0.0F, 4.55F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.9853F, -11.4008F, -8.1419F, -1.4591F, 0.1344F, -0.8739F));
		PartDefinition Head_r9 = horns3.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(82, 99).addBox(-4.25F, 0.0F, -2.275F, 2.5F, 0.0F, 4.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9853F, -11.4008F, -8.1419F, -1.4021F, -0.045F, 0.258F));
		PartDefinition Head_r10 = horns3.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(94, 92).addBox(-0.625F, -0.6625F, -2.9F, 1.25F, 1.325F, 5.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.375F, -7.6411F, -6.857F, -1.3264F, -0.7703F, -0.1719F));
		PartDefinition Head_r11 = horns3.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(87, 91).addBox(-0.65F, -0.6625F, -1.375F, 1.3F, 1.325F, 2.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.375F, -5.5875F, -5.625F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
