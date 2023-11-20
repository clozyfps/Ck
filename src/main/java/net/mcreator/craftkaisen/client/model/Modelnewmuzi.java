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
public class Modelnewmuzi<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelnewmuzi"), "main");
	public final ModelPart root;

	public Modelnewmuzi(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Fukuma_mizushi = root.addOrReplaceChild("Fukuma_mizushi", CubeListBuilder.create(), PartPose.offset(0.0F, -16.0F, 170.0F));
		PartDefinition bone84 = Fukuma_mizushi.addOrReplaceChild("bone84", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hashira = bone84.addOrReplaceChild("hashira", CubeListBuilder.create().texOffs(166, 102).addBox(-99.8263F, -130.0698F, -107.6372F, 200.1395F, 6.1395F, 202.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-83.8263F,
				-124.0698F, -91.6372F, 168.1395F, 4.1395F, 170.0186F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition bone12 = hashira.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone10 = bone12.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone2 = bone10.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-56.0F, -8.0F, -64.0F));
		PartDefinition kyoku2 = bone2
				.addOrReplaceChild("kyoku2",
						CubeListBuilder.create().texOffs(166, 102).addBox(8.0F, -116.0F, -3.2F, 10.0F, 2.0F, 6.4F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -114.0F, -2.4F, 9.2F, 4.0F, 4.8F, new CubeDeformation(0.0F))
								.texOffs(166, 102).addBox(8.0F, -107.2F, -3.2F, 6.0F, 1.2F, 6.4F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -110.0F, -2.4F, 5.2F, 4.0F, 4.8F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition kyoku = bone2.addOrReplaceChild("kyoku",
				CubeListBuilder.create().texOffs(166, 102).addBox(8.0F, -116.0F, -3.2F, 10.0F, 2.0F, 6.4F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -114.0F, -2.4F, 9.2F, 4.0F, 4.8F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(8.0F, -107.2F, -3.2F, 6.0F, 1.2F, 6.4F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -110.0F, -2.4F, 5.2F, 4.0F, 4.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition kaku = bone2.addOrReplaceChild("kaku", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition bone8 = kaku
				.addOrReplaceChild("bone8",
						CubeListBuilder.create().texOffs(166, 102).addBox(-16.0F, -116.0F, -6.4F, 12.0F, 2.0F, 8.8F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-15.2F, -112.0F, -5.6F, 11.2F, 2.0F, 7.2F, new CubeDeformation(0.0F))
								.texOffs(166, 102).addBox(-12.0F, -107.2F, -6.4F, 8.0F, 1.2F, 8.8F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-11.2F, -114.0F, -4.8F, 7.2F, 8.0F, 5.6F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition bone5 = kaku.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(166, 102).addBox(6.0F, -116.0F, -4.4F, 12.0F, 2.0F, 8.8F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(6.0F, -112.0F, -3.6F, 11.2F, 2.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(6.0F, -107.2F, -4.4F, 8.0F, 1.2F, 8.8F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(6.0F, -114.0F, -2.8F, 7.2F, 8.0F, 5.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition hashira10 = bone2.addOrReplaceChild("hashira10", CubeListBuilder.create(), PartPose.offset(58.0F, 0.0F, 64.0F));
		PartDefinition bone4 = hashira10.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(56.0F, 0.0F, -64.0F));
		PartDefinition kyoku3 = bone4
				.addOrReplaceChild("kyoku3",
						CubeListBuilder.create().texOffs(166, 102).addBox(-18.0F, -116.0F, -3.2F, 10.0F, 2.0F, 6.4F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-17.2F, -114.0F, -2.4F, 9.2F, 4.0F, 4.8F, new CubeDeformation(0.0F))
								.texOffs(166, 102).addBox(-14.0F, -107.2F, -3.2F, 6.0F, 1.2F, 6.4F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-13.2F, -110.0F, -2.4F, 5.2F, 4.0F, 4.8F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition kyoku4 = bone4.addOrReplaceChild("kyoku4",
				CubeListBuilder.create().texOffs(166, 102).addBox(-18.0F, -116.0F, -3.2F, 10.0F, 2.0F, 6.4F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-17.2F, -114.0F, -2.4F, 9.2F, 4.0F, 4.8F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-14.0F, -107.2F, -3.2F, 6.0F, 1.2F, 6.4F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-13.2F, -110.0F, -2.4F, 5.2F, 4.0F, 4.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition kaku2 = bone4.addOrReplaceChild("kaku2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition bone9 = kaku2
				.addOrReplaceChild("bone9",
						CubeListBuilder.create().texOffs(166, 102).addBox(4.0F, -116.0F, -6.4F, 12.0F, 2.0F, 8.8F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(4.0F, -112.0F, -5.6F, 11.2F, 2.0F, 7.2F, new CubeDeformation(0.0F))
								.texOffs(166, 102).addBox(4.0F, -107.2F, -6.4F, 8.0F, 1.2F, 8.8F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(4.0F, -114.0F, -4.8F, 7.2F, 8.0F, 5.6F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition bone11 = kaku2.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(166, 102).addBox(-18.0F, -116.0F, -4.4F, 12.0F, 2.0F, 8.8F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-17.2F, -112.0F, -3.6F, 11.2F, 2.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-14.0F, -107.2F, -4.4F, 8.0F, 1.2F, 8.8F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-13.2F, -114.0F, -2.8F, 7.2F, 8.0F, 5.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hashira3 = bone4.addOrReplaceChild("hashira3",
				CubeListBuilder.create().texOffs(166, 102).addBox(-8.0F, -116.0F, -4.0F, 16.0F, 124.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-58.0F, -118.0F, -4.0F, 50.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-38.0F, -100.0F, -4.0F, 30.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-26.0F, -94.0F, -4.0F, 18.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-6.0F, -116.0F, -6.0F, 12.0F, 124.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-4.0F, -116.0F, -8.0F, 8.0F, 124.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hashira3_r1 = hashira3.addOrReplaceChild("hashira3_r1", CubeListBuilder.create().texOffs(166, 102).addBox(-3.2F, -36.0F, 110.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-91.2274F, -27.5145F, -2.4F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition hashira3_r2 = hashira3.addOrReplaceChild("hashira3_r2", CubeListBuilder.create().texOffs(166, 102).addBox(-3.2F, -36.0F, 110.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-95.2274F, -21.5145F, -2.4F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition hashira3_r3 = hashira3.addOrReplaceChild("hashira3_r3", CubeListBuilder.create().texOffs(166, 102).addBox(-3.2F, -36.0F, 110.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-85.2274F, -33.5145F, -2.4F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition hashira3_r4 = hashira3.addOrReplaceChild("hashira3_r4", CubeListBuilder.create().texOffs(166, 102).addBox(-3.2F, -104.0F, 38.0F, 4.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-3.2F, -96.0F, 40.0F, 4.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-3.2F, -90.0F, 38.0F, 4.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.6666F, 0.0F, -2.4F, 0.0F, 1.5708F, 0.0F));
		PartDefinition hashira3_r5 = hashira3.addOrReplaceChild("hashira3_r5", CubeListBuilder.create().texOffs(166, 102).addBox(38.0F, -104.0F, -0.8F, 20.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(40.0F, -96.0F, -0.8F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(38.0F, -90.0F, -0.8F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 33.6666F, 0.0F, 1.5708F, 0.0F));
		PartDefinition hashira3_r6 = hashira3.addOrReplaceChild("hashira3_r6", CubeListBuilder.create().texOffs(166, 102).addBox(38.0F, -66.0F, -0.8F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.6211F, 6.502F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition hashira3_r7 = hashira3.addOrReplaceChild("hashira3_r7", CubeListBuilder.create().texOffs(166, 102).addBox(38.0F, -66.0F, -0.8F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.6211F, 12.502F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition hashira3_r8 = hashira3.addOrReplaceChild("hashira3_r8", CubeListBuilder.create().texOffs(166, 102).addBox(38.0F, -66.0F, -0.8F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.6211F, 16.502F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition hashira3_r9 = hashira3
				.addOrReplaceChild(
						"hashira3_r9", CubeListBuilder.create().texOffs(166, 102).addBox(-58.0F, -116.0F, -4.0F, 50.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
								.addBox(-38.0F, -98.0F, -4.0F, 30.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-26.0F, -92.0F, -4.0F, 18.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition hashira3_r10 = hashira3.addOrReplaceChild("hashira3_r10", CubeListBuilder.create().texOffs(166, 102).addBox(-4.0F, -30.0F, -38.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -60.6857F, 46.541F, -0.5672F, 0.0F, 0.0F));
		PartDefinition hashira3_r11 = hashira3.addOrReplaceChild("hashira3_r11", CubeListBuilder.create().texOffs(166, 102).addBox(-4.0F, -30.0F, -38.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -66.6857F, 58.541F, -0.5672F, 0.0F, 0.0F));
		PartDefinition hashira3_r12 = hashira3.addOrReplaceChild("hashira3_r12", CubeListBuilder.create().texOffs(166, 102).addBox(-38.0F, -110.0F, -4.0F, 6.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.4804F, -30.8254F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition hashira3_r13 = hashira3.addOrReplaceChild("hashira3_r13", CubeListBuilder.create().texOffs(166, 102).addBox(-38.0F, -110.0F, -4.0F, 6.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.4804F, -36.8254F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition hashira2 = bone4.addOrReplaceChild("hashira2",
				CubeListBuilder.create().texOffs(166, 102).addBox(-8.0F, -116.0F, -4.0F, 16.0F, 124.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -118.0F, -4.0F, 50.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(8.0F, -100.0F, -4.0F, 30.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -94.0F, -4.0F, 18.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-6.0F, -116.0F, -6.0F, 12.0F, 124.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-4.0F, -116.0F, -8.0F, 8.0F, 124.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-116.0F, 0.0F, 0.0F));
		PartDefinition hashira2_r1 = hashira2.addOrReplaceChild("hashira2_r1", CubeListBuilder.create().texOffs(166, 102).addBox(-0.8F, -36.0F, 110.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(91.2274F, -27.5145F, -2.4F, 0.0F, -1.5708F, 0.2618F));
		PartDefinition hashira2_r2 = hashira2.addOrReplaceChild("hashira2_r2", CubeListBuilder.create().texOffs(166, 102).addBox(-0.8F, -36.0F, 110.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(95.2274F, -21.5145F, -2.4F, 0.0F, -1.5708F, 0.2618F));
		PartDefinition hashira2_r3 = hashira2.addOrReplaceChild("hashira2_r3", CubeListBuilder.create().texOffs(166, 102).addBox(-0.8F, -36.0F, 110.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(85.2274F, -33.5145F, -2.4F, 0.0F, -1.5708F, 0.2618F));
		PartDefinition hashira2_r4 = hashira2.addOrReplaceChild("hashira2_r4", CubeListBuilder.create().texOffs(166, 102).addBox(-0.8F, -104.0F, 38.0F, 4.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-0.8F, -96.0F, 40.0F, 4.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-0.8F, -90.0F, 38.0F, 4.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.6666F, 0.0F, -2.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hashira2_r5 = hashira2
				.addOrReplaceChild(
						"hashira2_r5", CubeListBuilder.create().texOffs(166, 102).addBox(-58.0F, -104.0F, -0.8F, 20.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
								.addBox(-52.0F, -96.0F, -0.8F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-48.0F, -90.0F, -0.8F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 33.6666F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hashira2_r6 = hashira2.addOrReplaceChild("hashira2_r6", CubeListBuilder.create().texOffs(166, 102).addBox(-48.0F, -66.0F, -0.8F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.6211F, 6.502F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition hashira2_r7 = hashira2.addOrReplaceChild("hashira2_r7", CubeListBuilder.create().texOffs(166, 102).addBox(-48.0F, -66.0F, -0.8F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.6211F, 12.502F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition hashira2_r8 = hashira2.addOrReplaceChild("hashira2_r8", CubeListBuilder.create().texOffs(166, 102).addBox(-48.0F, -66.0F, -0.8F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.6211F, 16.502F, -1.5708F, -1.309F, 1.5708F));
		PartDefinition hashira2_r9 = hashira2.addOrReplaceChild("hashira2_r9", CubeListBuilder.create().texOffs(166, 102).addBox(8.0F, -116.0F, -4.0F, 50.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(8.0F, -98.0F, -4.0F, 30.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -92.0F, -4.0F, 18.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hashira2_r10 = hashira2.addOrReplaceChild("hashira2_r10", CubeListBuilder.create().texOffs(166, 102).addBox(-4.0F, -30.0F, -38.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -60.6857F, 46.541F, -0.5672F, 0.0F, 0.0F));
		PartDefinition hashira2_r11 = hashira2.addOrReplaceChild("hashira2_r11", CubeListBuilder.create().texOffs(166, 102).addBox(-4.0F, -30.0F, -38.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -66.6857F, 58.541F, -0.5672F, 0.0F, 0.0F));
		PartDefinition hashira2_r12 = hashira2.addOrReplaceChild("hashira2_r12", CubeListBuilder.create().texOffs(166, 102).addBox(32.0F, -110.0F, -4.0F, 6.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-55.4804F, -30.8254F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition hashira2_r13 = hashira2.addOrReplaceChild("hashira2_r13", CubeListBuilder.create().texOffs(166, 102).addBox(32.0F, -110.0F, -4.0F, 6.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.4804F, -36.8254F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition hashira4 = bone4.addOrReplaceChild("hashira4",
				CubeListBuilder.create().texOffs(166, 102).addBox(-8.0F, -116.0F, -4.0F, 16.0F, 124.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -118.0F, -4.0F, 50.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(8.0F, -100.0F, -4.0F, 30.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -94.0F, -4.0F, 18.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-6.0F, -116.0F, -6.0F, 12.0F, 124.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-4.0F, -116.0F, -8.0F, 8.0F, 124.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-116.0F, 0.0F, 116.0F));
		PartDefinition hashira4_r1 = hashira4.addOrReplaceChild("hashira4_r1", CubeListBuilder.create().texOffs(166, 102).addBox(-0.8F, -36.0F, -122.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(91.2274F, -27.5145F, 2.4F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition hashira4_r2 = hashira4.addOrReplaceChild("hashira4_r2", CubeListBuilder.create().texOffs(166, 102).addBox(-0.8F, -36.0F, -122.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(95.2274F, -21.5145F, 2.4F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition hashira4_r3 = hashira4.addOrReplaceChild("hashira4_r3", CubeListBuilder.create().texOffs(166, 102).addBox(-0.8F, -36.0F, -122.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(85.2274F, -33.5145F, 2.4F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition hashira4_r4 = hashira4
				.addOrReplaceChild(
						"hashira4_r4", CubeListBuilder.create().texOffs(166, 102).addBox(-0.8F, -104.0F, -58.0F, 4.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
								.addBox(-0.8F, -96.0F, -52.0F, 4.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-0.8F, -90.0F, -48.0F, 4.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(33.6666F, 0.0F, 2.4F, 0.0F, 1.5708F, 0.0F));
		PartDefinition hashira4_r5 = hashira4
				.addOrReplaceChild(
						"hashira4_r5", CubeListBuilder.create().texOffs(166, 102).addBox(-58.0F, -104.0F, -3.2F, 20.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
								.addBox(-52.0F, -96.0F, -3.2F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-48.0F, -90.0F, -3.2F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -33.6666F, 0.0F, 1.5708F, 0.0F));
		PartDefinition hashira4_r6 = hashira4.addOrReplaceChild("hashira4_r6", CubeListBuilder.create().texOffs(166, 102).addBox(-48.0F, -66.0F, -3.2F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.6211F, -6.502F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition hashira4_r7 = hashira4.addOrReplaceChild("hashira4_r7", CubeListBuilder.create().texOffs(166, 102).addBox(-48.0F, -66.0F, -3.2F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.6211F, -12.502F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition hashira4_r8 = hashira4.addOrReplaceChild("hashira4_r8", CubeListBuilder.create().texOffs(166, 102).addBox(-48.0F, -66.0F, -3.2F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.6211F, -16.502F, 1.5708F, 1.309F, 1.5708F));
		PartDefinition hashira4_r9 = hashira4.addOrReplaceChild("hashira4_r9", CubeListBuilder.create().texOffs(166, 102).addBox(8.0F, -116.0F, -4.0F, 50.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(8.0F, -98.0F, -4.0F, 30.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(8.0F, -92.0F, -4.0F, 18.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition hashira4_r10 = hashira4.addOrReplaceChild("hashira4_r10", CubeListBuilder.create().texOffs(166, 102).addBox(-4.0F, -30.0F, 32.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -60.6857F, -46.541F, 0.5672F, 0.0F, 0.0F));
		PartDefinition hashira4_r11 = hashira4.addOrReplaceChild("hashira4_r11", CubeListBuilder.create().texOffs(166, 102).addBox(-4.0F, -30.0F, 32.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -66.6857F, -58.541F, 0.5672F, 0.0F, 0.0F));
		PartDefinition hashira4_r12 = hashira4.addOrReplaceChild("hashira4_r12", CubeListBuilder.create().texOffs(166, 102).addBox(32.0F, -110.0F, -4.0F, 6.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-55.4804F, -30.8254F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition hashira4_r13 = hashira4.addOrReplaceChild("hashira4_r13", CubeListBuilder.create().texOffs(166, 102).addBox(32.0F, -110.0F, -4.0F, 6.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-43.4804F, -36.8254F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition hashira5 = bone4.addOrReplaceChild("hashira5",
				CubeListBuilder.create().texOffs(166, 102).addBox(-8.0F, -116.0F, -4.0F, 16.0F, 124.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-58.0F, -118.0F, -4.0F, 50.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-38.0F, -100.0F, -4.0F, 30.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-26.0F, -94.0F, -4.0F, 18.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-6.0F, -116.0F, -6.0F, 12.0F, 124.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-4.0F, -116.0F, -8.0F, 8.0F, 124.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 116.0F));
		PartDefinition hashira5_r1 = hashira5.addOrReplaceChild("hashira5_r1", CubeListBuilder.create().texOffs(166, 102).addBox(-3.2F, -36.0F, -122.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-91.2274F, -27.5145F, 2.4F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition hashira5_r2 = hashira5.addOrReplaceChild("hashira5_r2", CubeListBuilder.create().texOffs(166, 102).addBox(-3.2F, -36.0F, -122.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-95.2274F, -21.5145F, 2.4F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition hashira5_r3 = hashira5.addOrReplaceChild("hashira5_r3", CubeListBuilder.create().texOffs(166, 102).addBox(-3.2F, -36.0F, -122.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-85.2274F, -33.5145F, 2.4F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition hashira5_r4 = hashira5
				.addOrReplaceChild(
						"hashira5_r4", CubeListBuilder.create().texOffs(166, 102).addBox(-3.2F, -104.0F, -58.0F, 4.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
								.addBox(-3.2F, -96.0F, -52.0F, 4.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-3.2F, -90.0F, -48.0F, 4.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-33.6666F, 0.0F, 2.4F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hashira5_r5 = hashira5.addOrReplaceChild("hashira5_r5", CubeListBuilder.create().texOffs(166, 102).addBox(38.0F, -104.0F, -3.2F, 20.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(40.0F, -96.0F, -3.2F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(38.0F, -90.0F, -3.2F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -33.6666F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hashira5_r6 = hashira5.addOrReplaceChild("hashira5_r6", CubeListBuilder.create().texOffs(166, 102).addBox(38.0F, -66.0F, -3.2F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.6211F, -6.502F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition hashira5_r7 = hashira5.addOrReplaceChild("hashira5_r7", CubeListBuilder.create().texOffs(166, 102).addBox(38.0F, -66.0F, -3.2F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.6211F, -12.502F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition hashira5_r8 = hashira5.addOrReplaceChild("hashira5_r8", CubeListBuilder.create().texOffs(166, 102).addBox(38.0F, -66.0F, -3.2F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.6211F, -16.502F, 1.5708F, -1.309F, -1.5708F));
		PartDefinition hashira5_r9 = hashira5
				.addOrReplaceChild(
						"hashira5_r9", CubeListBuilder.create().texOffs(166, 102).addBox(-58.0F, -116.0F, -4.0F, 50.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
								.addBox(-38.0F, -98.0F, -4.0F, 30.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-26.0F, -92.0F, -4.0F, 18.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hashira5_r10 = hashira5.addOrReplaceChild("hashira5_r10", CubeListBuilder.create().texOffs(166, 102).addBox(-4.0F, -30.0F, 32.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -60.6857F, -46.541F, 0.5672F, 0.0F, 0.0F));
		PartDefinition hashira5_r11 = hashira5.addOrReplaceChild("hashira5_r11", CubeListBuilder.create().texOffs(166, 102).addBox(-4.0F, -30.0F, 32.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -66.6857F, -58.541F, 0.5672F, 0.0F, 0.0F));
		PartDefinition hashira5_r12 = hashira5.addOrReplaceChild("hashira5_r12", CubeListBuilder.create().texOffs(166, 102).addBox(-38.0F, -110.0F, -4.0F, 6.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.4804F, -30.8254F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition hashira5_r13 = hashira5.addOrReplaceChild("hashira5_r13", CubeListBuilder.create().texOffs(166, 102).addBox(-38.0F, -110.0F, -4.0F, 6.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.4804F, -36.8254F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition ue = bone10.addOrReplaceChild("ue", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = ue.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(166, 102).addBox(-8.0F, -8.0F, 0.0F, 112.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-8.0F, 2.0F, 0.0F, 112.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-8.0F, -6.0F, 2.0F, 112.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(-48.0F, -120.0F, -80.0F));
		PartDefinition bone7 = bone.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(166, 102).addBox(-44.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-36.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-28.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-20.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-12.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-4.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(42.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(34.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(26.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(10.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(2.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(18.0F, -4.0F, 0.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(48.0F, -2.0F, 0.0F));
		PartDefinition bone3 = ue.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(166, 102).addBox(-8.0F, -8.0F, -20.0F, 112.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-8.0F, 2.0F, -20.0F, 112.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-8.0F, -6.0F, -20.0F, 112.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(-48.0F, -120.0F, 68.0F));
		PartDefinition bone6 = bone3.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(166, 102).addBox(-44.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-36.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-28.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-20.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-12.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-4.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(42.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(34.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(26.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(10.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(2.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(18.0F, -4.0F, -18.0F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(48.0F, -2.0F, 0.0F));
		PartDefinition bone13 = ue.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(166, 102).addBox(-4.0F, -8.0F, -19.6F, 112.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-4.0F, 2.0F, -19.6F, 112.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-4.0F, -6.0F, -19.6F, 112.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-71.6F, -120.0F, -58.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone14 = bone13.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(166, 102).addBox(-40.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-32.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-24.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-16.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-8.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(0.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(46.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(38.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(30.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(14.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(6.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(22.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(48.0F, -2.0F, 0.0F));
		PartDefinition bone15 = ue
				.addOrReplaceChild(
						"bone15", CubeListBuilder.create().texOffs(166, 102).addBox(-108.0F, -8.0F, -19.6F, 112.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
								.addBox(-108.0F, 2.0F, -19.6F, 112.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-108.0F, -6.0F, -19.6F, 112.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(71.6F, -120.0F, -58.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone16 = bone15.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(166, 102).addBox(38.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(30.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(22.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(14.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(6.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-2.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-48.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-40.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-32.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-16.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-8.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-24.0F, -4.0F, -17.6F, 2.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-48.0F, -2.0F, 0.0F));
		PartDefinition bone134 = hashira.addOrReplaceChild("bone134", CubeListBuilder.create(), PartPose.offset(43.3737F, -1.9302F, 44.5023F));
		PartDefinition bone135 = bone134.addOrReplaceChild("bone135", CubeListBuilder.create().texOffs(166, 102).addBox(-77.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-61.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-53.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-45.6F, -122.1395F, -148.1395F, 4.5395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-69.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-125.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-117.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-109.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-101.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-93.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-13.6869F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-29.6869F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-37.6869F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-21.6869F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(34.3131F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(26.3131F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(18.3131F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(10.3131F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(2.3131F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102)
				.addBox(-5.6869F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-85.2F, -122.1395F, -148.1395F, 4.1395F, 2.9395F, 194.0186F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone135_r1 = bone135.addOrReplaceChild("bone135_r1", CubeListBuilder.create().texOffs(166, 102).addBox(-68.8F, -122.1395F, -138.5395F, 4.1395F, 2.9395F, 266.0186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone135_r2 = bone135.addOrReplaceChild("bone135_r2", CubeListBuilder.create().texOffs(166, 102).addBox(3.2F, -122.1395F, -204.1395F, 4.1395F, 2.9395F, 274.0186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone136 = bone134.addOrReplaceChild("bone136",
				CubeListBuilder.create().texOffs(166, 102).addBox(-45.879F, -122.1395F, -77.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, -61.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, -53.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, -45.6F, 194.0186F, 2.9395F, 4.5395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, -69.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, -125.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, -117.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, -109.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, -101.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, -93.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, -13.687F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, -29.687F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, -37.687F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, -21.687F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, 34.313F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, 26.313F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, 18.313F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, 10.313F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, 2.313F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102)
						.addBox(-45.879F, -122.1395F, -5.687F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)).texOffs(166, 102).addBox(-45.879F, -122.1395F, -85.2F, 194.0186F, 2.9395F, 4.1395F, new CubeDeformation(0.0F)),
				PartPose.offset(-94.0F, 0.0F, -6.0F));
		PartDefinition yane = bone84.addOrReplaceChild("yane", CubeListBuilder.create(), PartPose.offset(0.0F, -144.0F, -96.0F));
		PartDefinition bone34 = yane.addOrReplaceChild("bone34", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leftuei = bone34.addOrReplaceChild("leftuei", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition uei = leftuei.addOrReplaceChild("uei", CubeListBuilder.create(), PartPose.offset(100.0F, 18.0F, -8.0F));
		PartDefinition bone19 = uei.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0018F, -0.8014F, 5.6569F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bone19_r1 = bone19.addOrReplaceChild("bone19_r1", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -8.0F, -3.6F, 5.2F, 8.0F, 107.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.309F, 0.3102F, -0.1917F, -1.5708F, -1.3526F, 1.5708F));
		PartDefinition bone19_r2 = bone19.addOrReplaceChild("bone19_r2", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -8.8F, 0.0F, 4.0F, 9.6F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6266F, 0.8014F, -2.8285F, -0.2281F, -0.7147F, 0.3685F));
		PartDefinition bone18 = bone19.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offset(-0.7499F, 1.0054F, -19.8154F));
		PartDefinition bone18_r1 = bone18.addOrReplaceChild("bone18_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(55.0F, -10.0F, 67.2F, 1.0F, 8.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(55.0F, -10.0F, 68.0F, 5.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(55.0F, -10.0F, 70.4F, 8.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(50.4F, -10.0F, 63.2F, 4.6F, 8.0F, 10.8F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(44.8F, -10.0F, 58.0F, 5.6F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(39.2F, -10.0F, 52.8F, 5.6F, 8.0F, 21.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(39.2F, -10.0F, 73.6F, 27.2F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(39.2F, -10.0F, 78.4F, 32.0F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, 29.2F, 5.6F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(11.6F, -10.0F, 33.2F, 10.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, 37.2F, 14.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(11.6F, -10.0F, 41.2F, 19.2F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, 44.4F, 22.4F, 8.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(6.0F, -10.0F, 23.6F, 7.2F, 8.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(0.0F, -10.0F, 22.4F, 7.2F, 8.0F, 29.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, 48.0F, 39.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(66.0F, -10.0F, 76.8F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(70.0F, -10.0F, 80.8F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(0.0F, -10.0F, 83.2F, 75.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, 86.4F, 77.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.4409F, -0.2371F, 13.5448F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone17 = bone19.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(-93.0018F, -15.9986F, -0.0569F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bone22 = uei.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4018F, -0.8014F, -2.3431F, 0.0F, -1.5708F, 0.3491F));
		PartDefinition bone22_r1 = bone22.addOrReplaceChild("bone22_r1", CubeListBuilder.create().texOffs(0, 256).addBox(2.8F, -8.0F, -3.6F, 5.2F, 8.0F, 107.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.309F, 0.3102F, -0.1917F, -1.5708F, 1.3526F, -1.5708F));
		PartDefinition bone22_r2 = bone22.addOrReplaceChild("bone22_r2", CubeListBuilder.create().texOffs(0, 256).addBox(4.0F, -8.8F, 0.0F, 4.0F, 9.6F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6266F, 0.8014F, -2.8285F, -0.2281F, 0.7147F, -0.3685F));
		PartDefinition bone23 = bone22.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offset(0.7499F, 1.0054F, -19.8154F));
		PartDefinition bone23_r1 = bone23.addOrReplaceChild("bone23_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(-56.0F, -10.0F, 67.2F, 1.0F, 8.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-60.6F, -10.0F, 68.0F, 5.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-63.2F, -10.0F, 70.4F, 8.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-55.0F, -10.0F, 63.2F, 4.6F, 8.0F, 10.8F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-50.4F, -10.0F, 58.0F, 5.6F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-44.8F, -10.0F, 52.8F, 5.6F, 8.0F, 21.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-66.4F, -10.0F, 73.6F, 27.2F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-71.2F, -10.0F, 78.4F, 32.0F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-17.2F, -10.0F, 29.2F, 5.6F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-22.0F, -10.0F, 33.2F, 10.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-26.0F, -10.0F, 37.2F, 14.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-30.8F, -10.0F, 41.2F, 19.2F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-34.0F, -10.0F, 44.4F, 22.4F, 8.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-13.2F, -10.0F, 23.6F, 7.2F, 8.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-7.2F, -10.0F, 22.4F, 7.2F, 8.0F, 29.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-39.2F, -10.0F, 48.0F, 39.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-69.6F, -10.0F, 76.8F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-75.2F, -10.0F, 83.2F, 75.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-73.6F, -10.0F, 80.8F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-77.2F, -10.0F, 86.4F, 77.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.4409F, -0.2371F, 13.5448F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone24 = bone22.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offsetAndRotation(93.0018F, -15.9986F, -0.0569F, -0.3491F, 0.0F, 0.0F));
		PartDefinition leftuei2 = bone34.addOrReplaceChild("leftuei2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 192.0F));
		PartDefinition uei2 = leftuei2.addOrReplaceChild("uei2", CubeListBuilder.create(), PartPose.offset(100.0F, 18.0F, 8.0F));
		PartDefinition bone20 = uei2.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0018F, -0.8014F, -5.6569F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bone20_r1 = bone20.addOrReplaceChild("bone20_r1", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -8.0F, -104.0F, 5.2F, 8.0F, 107.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.309F, 0.3102F, 0.1917F, 1.5708F, 1.3526F, 1.5708F));
		PartDefinition bone20_r2 = bone20.addOrReplaceChild("bone20_r2", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -8.8F, -104.0F, 4.0F, 9.6F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6266F, 0.8014F, 2.8285F, 0.2281F, 0.7147F, 0.3685F));
		PartDefinition bone21 = bone20.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offset(-0.7499F, 1.0054F, 19.8154F));
		PartDefinition bone21_r1 = bone21.addOrReplaceChild("bone21_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(55.0F, -10.0F, -68.8F, 1.0F, 8.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(55.0F, -10.0F, -71.6F, 5.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(55.0F, -10.0F, -74.0F, 8.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(50.4F, -10.0F, -74.0F, 4.6F, 8.0F, 10.8F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(44.8F, -10.0F, -74.0F, 5.6F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(39.2F, -10.0F, -74.0F, 5.6F, 8.0F, 21.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(39.2F, -10.0F, -78.8F, 27.2F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(39.2F, -10.0F, -83.6F, 32.0F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, -33.2F, 5.6F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(11.6F, -10.0F, -37.2F, 10.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, -41.2F, 14.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(11.6F, -10.0F, -45.2F, 19.2F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, -51.6F, 22.4F, 8.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(6.0F, -10.0F, -51.6F, 7.2F, 8.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(0.0F, -10.0F, -51.6F, 7.2F, 8.0F, 29.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, -83.6F, 39.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(66.0F, -10.0F, -80.4F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(70.0F, -10.0F, -84.4F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(0.0F, -10.0F, -86.8F, 75.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, -122.0F, 77.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.4409F, -0.2371F, -13.5448F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone25 = bone20.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offsetAndRotation(-93.0018F, -15.9986F, 0.0569F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bone29 = uei2.addOrReplaceChild("bone29", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4018F, -0.8014F, 2.3431F, 0.0F, 1.5708F, 0.3491F));
		PartDefinition bone29_r1 = bone29.addOrReplaceChild("bone29_r1", CubeListBuilder.create().texOffs(0, 256).addBox(2.8F, -8.0F, -104.0F, 5.2F, 8.0F, 107.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.309F, 0.3102F, 0.1917F, 1.5708F, -1.3526F, -1.5708F));
		PartDefinition bone29_r2 = bone29.addOrReplaceChild("bone29_r2", CubeListBuilder.create().texOffs(0, 256).addBox(4.0F, -8.8F, -104.0F, 4.0F, 9.6F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6266F, 0.8014F, 2.8285F, 0.2281F, -0.7147F, -0.3685F));
		PartDefinition bone32 = bone29.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offset(0.7499F, 1.0054F, 19.8154F));
		PartDefinition bone32_r1 = bone32.addOrReplaceChild("bone32_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(-56.0F, -10.0F, -68.8F, 1.0F, 8.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-60.6F, -10.0F, -71.6F, 5.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-63.2F, -10.0F, -74.0F, 8.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-55.0F, -10.0F, -74.0F, 4.6F, 8.0F, 10.8F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-50.4F, -10.0F, -74.0F, 5.6F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-44.8F, -10.0F, -74.0F, 5.6F, 8.0F, 21.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-66.4F, -10.0F, -78.8F, 27.2F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-71.2F, -10.0F, -83.6F, 32.0F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-17.2F, -10.0F, -33.2F, 5.6F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-22.0F, -10.0F, -37.2F, 10.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-26.0F, -10.0F, -41.2F, 14.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-30.8F, -10.0F, -45.2F, 19.2F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-34.0F, -10.0F, -51.6F, 22.4F, 8.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-13.2F, -10.0F, -51.6F, 7.2F, 8.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-7.2F, -10.0F, -51.6F, 7.2F, 8.0F, 29.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-39.2F, -10.0F, -83.6F, 39.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-69.6F, -10.0F, -80.4F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-75.2F, -10.0F, -86.8F, 75.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-73.6F, -10.0F, -84.4F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-77.2F, -10.0F, -122.0F, 77.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.4409F, -0.2371F, -13.5448F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone33 = bone29.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offsetAndRotation(93.0018F, -15.9986F, 0.0569F, 0.3491F, 0.0F, 0.0F));
		PartDefinition upper = bone34.addOrReplaceChild("upper", CubeListBuilder.create(), PartPose.offsetAndRotation(72.0F, 2.8F, 80.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition upper_r1 = upper.addOrReplaceChild("upper_r1", CubeListBuilder.create().texOffs(0, 256).addBox(-24.0F, 4.0F, -52.0F, 8.0F, 10.0F, 136.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-83.1867F, 9.1086F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition upper_r2 = upper.addOrReplaceChild("upper_r2", CubeListBuilder.create().texOffs(0, 256).addBox(-28.8F, 10.0F, -46.0F, 40.8F, 3.2F, 124.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-39.1716F, 5.7043F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition upper_r3 = upper.addOrReplaceChild("upper_r3", CubeListBuilder.create().texOffs(0, 256).addBox(-28.8F, 10.0F, -46.0F, 16.8F, 3.2F, 124.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1074F, 0.7794F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition upper_r4 = upper.addOrReplaceChild("upper_r4", CubeListBuilder.create().texOffs(0, 256).addBox(-28.8F, 10.0F, -46.0F, 36.8F, 3.2F, 124.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
				.addBox(-30.0F, 0.0F, -48.0F, 38.0F, 11.2F, 128.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-30.0F, 0.0F, -52.0F, 38.0F, 5.2F, 136.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-74.5987F, 1.9554F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition upper_r5 = upper.addOrReplaceChild("upper_r5",
				CubeListBuilder.create().texOffs(0, 256).addBox(-32.0F, 0.0F, -48.0F, 40.0F, 11.2F, 128.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-32.0F, 0.0F, -52.0F, 40.0F, 5.2F, 136.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-35.8108F, 6.0059F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition upper_r6 = upper.addOrReplaceChild("upper_r6",
				CubeListBuilder.create().texOffs(0, 256).addBox(-32.0F, 6.0F, -48.0F, 28.0F, 5.2F, 128.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-32.0F, 0.0F, -52.0F, 44.0F, 5.2F, 136.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone26 = upper.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone26_r1 = bone26.addOrReplaceChild("bone26_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(-32.0F, -2.0F, 14.0F, 48.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-32.0F, -2.0F, -5.2F, 48.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone27 = bone34.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offset(100.0F, 10.0F, 0.0F));
		PartDefinition bone27_r1 = bone27.addOrReplaceChild("bone27_r1", CubeListBuilder.create().texOffs(0, 256).addBox(-10.4F, -1.2F, -56.0F, 11.2F, 19.2F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(30.263F, -26.8039F, 221.1317F, 0.1745F, 0.7854F, 0.0F));
		PartDefinition bone27_r2 = bone27.addOrReplaceChild("bone27_r2", CubeListBuilder.create().texOffs(0, 256).addBox(-8.8F, -10.8F, -56.0F, 9.6F, 14.8F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.5325F, -10.4147F, 209.5325F, 0.0873F, 0.7854F, 0.0F));
		PartDefinition bone27_r3 = bone27.addOrReplaceChild("bone27_r3", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -10.0F, -56.0F, 8.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 192.0F, -0.1745F, 0.7854F, 0.0F));
		PartDefinition bone27_r4 = bone27.addOrReplaceChild("bone27_r4", CubeListBuilder.create().texOffs(0, 256).addBox(-10.4F, -1.2F, 46.0F, 11.2F, 19.2F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(30.263F, -26.8039F, -29.1317F, -0.1745F, -0.7854F, 0.0F));
		PartDefinition bone27_r5 = bone27.addOrReplaceChild("bone27_r5", CubeListBuilder.create().texOffs(0, 256).addBox(-8.8F, -10.8F, 36.0F, 9.6F, 14.8F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.5325F, -10.4147F, -17.5325F, -0.0873F, -0.7854F, 0.0F));
		PartDefinition bone27_r6 = bone27.addOrReplaceChild("bone27_r6", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -10.0F, 32.0F, 8.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, -0.7854F, 0.0F));
		PartDefinition bone28 = yane.addOrReplaceChild("bone28", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rightuei3 = bone28.addOrReplaceChild("rightuei3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition uei3 = rightuei3.addOrReplaceChild("uei3", CubeListBuilder.create(), PartPose.offset(-100.0F, 18.0F, -8.0F));
		PartDefinition bone30 = uei3.addOrReplaceChild("bone30", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0018F, -0.8014F, 5.6569F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bone30_r1 = bone30.addOrReplaceChild("bone30_r1", CubeListBuilder.create().texOffs(0, 256).addBox(2.8F, -8.0F, -3.6F, 5.2F, 8.0F, 107.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.309F, 0.3102F, -0.1917F, -1.5708F, 1.3526F, -1.5708F));
		PartDefinition bone30_r2 = bone30.addOrReplaceChild("bone30_r2", CubeListBuilder.create().texOffs(0, 256).addBox(4.0F, -8.8F, 0.0F, 4.0F, 9.6F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6266F, 0.8014F, -2.8285F, -0.2281F, 0.7147F, -0.3685F));
		PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create(), PartPose.offset(0.7499F, 1.0054F, -19.8154F));
		PartDefinition bone31_r1 = bone31.addOrReplaceChild("bone31_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(-56.0F, -10.0F, 67.2F, 1.0F, 8.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-60.6F, -10.0F, 68.0F, 5.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-63.2F, -10.0F, 70.4F, 8.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-55.0F, -10.0F, 63.2F, 4.6F, 8.0F, 10.8F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-50.4F, -10.0F, 58.0F, 5.6F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-44.8F, -10.0F, 52.8F, 5.6F, 8.0F, 21.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-66.4F, -10.0F, 73.6F, 27.2F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-71.2F, -10.0F, 78.4F, 32.0F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-17.2F, -10.0F, 29.2F, 5.6F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-22.0F, -10.0F, 33.2F, 10.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-26.0F, -10.0F, 37.2F, 14.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-30.8F, -10.0F, 41.2F, 19.2F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-34.0F, -10.0F, 44.4F, 22.4F, 8.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-13.2F, -10.0F, 23.6F, 7.2F, 8.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-7.2F, -10.0F, 22.4F, 7.2F, 8.0F, 29.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-39.2F, -10.0F, 48.0F, 39.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-69.6F, -10.0F, 76.8F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-73.6F, -10.0F, 80.8F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-75.2F, -10.0F, 83.2F, 75.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-77.2F, -10.0F, 86.4F, 77.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.4409F, -0.2371F, 13.5448F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone35 = bone30.addOrReplaceChild("bone35", CubeListBuilder.create(), PartPose.offsetAndRotation(93.0018F, -15.9986F, -0.0569F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bone36 = uei3.addOrReplaceChild("bone36", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4018F, -0.8014F, -2.3431F, 0.0F, 1.5708F, -0.3491F));
		PartDefinition bone36_r1 = bone36.addOrReplaceChild("bone36_r1", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -8.0F, -3.6F, 5.2F, 8.0F, 107.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.309F, 0.3102F, -0.1917F, -1.5708F, -1.3526F, 1.5708F));
		PartDefinition bone36_r2 = bone36.addOrReplaceChild("bone36_r2", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -8.8F, 0.0F, 4.0F, 9.6F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6266F, 0.8014F, -2.8285F, -0.2281F, -0.7147F, 0.3685F));
		PartDefinition bone37 = bone36.addOrReplaceChild("bone37", CubeListBuilder.create(), PartPose.offset(-0.7499F, 1.0054F, -19.8154F));
		PartDefinition bone37_r1 = bone37.addOrReplaceChild("bone37_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(55.0F, -10.0F, 67.2F, 1.0F, 8.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(55.0F, -10.0F, 68.0F, 5.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(55.0F, -10.0F, 70.4F, 8.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(50.4F, -10.0F, 63.2F, 4.6F, 8.0F, 10.8F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(44.8F, -10.0F, 58.0F, 5.6F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(39.2F, -10.0F, 52.8F, 5.6F, 8.0F, 21.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(39.2F, -10.0F, 73.6F, 27.2F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(39.2F, -10.0F, 78.4F, 32.0F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, 29.2F, 5.6F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(11.6F, -10.0F, 33.2F, 10.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, 37.2F, 14.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(11.6F, -10.0F, 41.2F, 19.2F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, 44.4F, 22.4F, 8.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(6.0F, -10.0F, 23.6F, 7.2F, 8.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(0.0F, -10.0F, 22.4F, 7.2F, 8.0F, 29.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, 48.0F, 39.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(66.0F, -10.0F, 76.8F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, 83.2F, 75.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(70.0F, -10.0F, 80.8F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, 86.4F, 77.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.4409F, -0.2371F, 13.5448F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone38 = bone36.addOrReplaceChild("bone38", CubeListBuilder.create(), PartPose.offsetAndRotation(-93.0018F, -15.9986F, -0.0569F, -0.3491F, 0.0F, 0.0F));
		PartDefinition rightuei4 = bone28.addOrReplaceChild("rightuei4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 192.0F));
		PartDefinition uei4 = rightuei4.addOrReplaceChild("uei4", CubeListBuilder.create(), PartPose.offset(-100.0F, 18.0F, 8.0F));
		PartDefinition bone39 = uei4.addOrReplaceChild("bone39", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0018F, -0.8014F, -5.6569F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bone39_r1 = bone39.addOrReplaceChild("bone39_r1", CubeListBuilder.create().texOffs(0, 256).addBox(2.8F, -8.0F, -104.0F, 5.2F, 8.0F, 107.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.309F, 0.3102F, 0.1917F, 1.5708F, -1.3526F, -1.5708F));
		PartDefinition bone39_r2 = bone39.addOrReplaceChild("bone39_r2", CubeListBuilder.create().texOffs(0, 256).addBox(4.0F, -8.8F, -104.0F, 4.0F, 9.6F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6266F, 0.8014F, 2.8285F, 0.2281F, -0.7147F, -0.3685F));
		PartDefinition bone40 = bone39.addOrReplaceChild("bone40", CubeListBuilder.create(), PartPose.offset(0.7499F, 1.0054F, 19.8154F));
		PartDefinition bone40_r1 = bone40.addOrReplaceChild("bone40_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(-56.0F, -10.0F, -68.8F, 1.0F, 8.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-60.6F, -10.0F, -71.6F, 5.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-63.2F, -10.0F, -74.0F, 8.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-55.0F, -10.0F, -74.0F, 4.6F, 8.0F, 10.8F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-50.4F, -10.0F, -74.0F, 5.6F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-44.8F, -10.0F, -74.0F, 5.6F, 8.0F, 21.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-66.4F, -10.0F, -78.8F, 27.2F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-71.2F, -10.0F, -83.6F, 32.0F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-17.2F, -10.0F, -33.2F, 5.6F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-22.0F, -10.0F, -37.2F, 10.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-26.0F, -10.0F, -41.2F, 14.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-30.8F, -10.0F, -45.2F, 19.2F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-34.0F, -10.0F, -51.6F, 22.4F, 8.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-13.2F, -10.0F, -51.6F, 7.2F, 8.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-7.2F, -10.0F, -51.6F, 7.2F, 8.0F, 29.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-39.2F, -10.0F, -83.6F, 39.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-69.6F, -10.0F, -80.4F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-73.6F, -10.0F, -84.4F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(-75.2F, -10.0F, -86.8F, 75.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-77.2F, -10.0F, -122.0F, 77.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.4409F, -0.2371F, -13.5448F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone41 = bone39.addOrReplaceChild("bone41", CubeListBuilder.create(), PartPose.offsetAndRotation(93.0018F, -15.9986F, 0.0569F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bone42 = uei4.addOrReplaceChild("bone42", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4018F, -0.8014F, 2.3431F, 0.0F, -1.5708F, -0.3491F));
		PartDefinition bone42_r1 = bone42.addOrReplaceChild("bone42_r1", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -8.0F, -104.0F, 5.2F, 8.0F, 107.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.309F, 0.3102F, 0.1917F, 1.5708F, 1.3526F, 1.5708F));
		PartDefinition bone42_r2 = bone42.addOrReplaceChild("bone42_r2", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, -8.8F, -104.0F, 4.0F, 9.6F, 104.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6266F, 0.8014F, 2.8285F, 0.2281F, 0.7147F, 0.3685F));
		PartDefinition bone43 = bone42.addOrReplaceChild("bone43", CubeListBuilder.create(), PartPose.offset(-0.7499F, 1.0054F, 19.8154F));
		PartDefinition bone43_r1 = bone43.addOrReplaceChild("bone43_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(55.0F, -10.0F, -68.8F, 1.0F, 8.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(55.0F, -10.0F, -71.6F, 5.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(55.0F, -10.0F, -74.0F, 8.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(50.4F, -10.0F, -74.0F, 4.6F, 8.0F, 10.8F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(44.8F, -10.0F, -74.0F, 5.6F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(39.2F, -10.0F, -74.0F, 5.6F, 8.0F, 21.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(39.2F, -10.0F, -78.8F, 27.2F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(39.2F, -10.0F, -83.6F, 32.0F, 8.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, -33.2F, 5.6F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(11.6F, -10.0F, -37.2F, 10.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, -41.2F, 14.4F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(11.6F, -10.0F, -45.2F, 19.2F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(11.6F, -10.0F, -51.6F, 22.4F, 8.0F, 7.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(6.0F, -10.0F, -51.6F, 7.2F, 8.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(0.0F, -10.0F, -51.6F, 7.2F, 8.0F, 29.2F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, -83.6F, 39.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(66.0F, -10.0F, -80.4F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, -86.8F, 75.2F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256)
						.addBox(70.0F, -10.0F, -84.4F, 3.6F, 8.0F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(0.0F, -10.0F, -122.0F, 77.2F, 8.0F, 35.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.4409F, -0.2371F, -13.5448F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone44 = bone42.addOrReplaceChild("bone44", CubeListBuilder.create(), PartPose.offsetAndRotation(-93.0018F, -15.9986F, 0.0569F, 0.3491F, 0.0F, 0.0F));
		PartDefinition upper2 = bone28.addOrReplaceChild("upper2", CubeListBuilder.create(), PartPose.offsetAndRotation(-72.0F, 2.8F, 80.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition upper2_r1 = upper2.addOrReplaceChild("upper2_r1", CubeListBuilder.create().texOffs(0, 256).addBox(24.0F, 4.0F, -44.0F, 6.0F, 14.2F, 120.0F, new CubeDeformation(0.0F)).texOffs(0, 256)
				.addBox(24.0F, 8.0F, -32.0F, 14.0F, 6.2F, 96.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(16.0F, 4.0F, -52.0F, 8.0F, 10.0F, 136.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(83.1867F, 9.1086F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition upper2_r2 = upper2.addOrReplaceChild("upper2_r2", CubeListBuilder.create().texOffs(0, 256).addBox(136.0F, 8.0F, 58.4F, 14.0F, 6.2F, 13.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.8305F, 42.1324F, -69.875F, 0.0F, -0.6109F, -0.6981F));
		PartDefinition upper2_r3 = upper2.addOrReplaceChild("upper2_r3", CubeListBuilder.create().texOffs(0, 256).addBox(24.0F, 8.0F, 58.4F, 14.0F, 6.2F, 13.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(56.8154F, 31.2367F, -69.183F, 0.0F, 0.6109F, -0.6981F));
		PartDefinition upper2_r4 = upper2.addOrReplaceChild("upper2_r4", CubeListBuilder.create().texOffs(0, 256).addBox(-12.0F, 10.0F, -46.0F, 40.8F, 3.2F, 124.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.1716F, 5.7043F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition upper2_r5 = upper2.addOrReplaceChild("upper2_r5", CubeListBuilder.create().texOffs(0, 256).addBox(12.0F, 10.0F, -46.0F, 16.8F, 3.2F, 124.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1074F, 0.7794F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition upper2_r6 = upper2.addOrReplaceChild("upper2_r6",
				CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, 10.0F, -46.0F, 36.8F, 3.2F, 124.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-8.0F, 0.0F, -52.0F, 38.0F, 5.2F, 136.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(74.5987F, 1.9554F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition upper2_r7 = upper2.addOrReplaceChild("upper2_r7",
				CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, 0.0F, 38.0F, 44.0F, 11.2F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-10.0F, 0.0F, -80.0F, 46.0F, 11.2F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(74.5987F, -2.0446F, 34.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition upper2_r8 = upper2.addOrReplaceChild("upper2_r8",
				CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, 0.0F, 38.0F, 40.0F, 11.2F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-8.0F, 0.0F, -80.0F, 40.0F, 11.2F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.8108F, 2.0059F, 34.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition upper2_r9 = upper2.addOrReplaceChild("upper2_r9",
				CubeListBuilder.create().texOffs(0, 256).addBox(-4.0F, 0.0F, 38.0F, 36.0F, 7.2F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-4.0F, 0.0F, -80.0F, 36.0F, 7.2F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 34.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition upper2_r10 = upper2.addOrReplaceChild("upper2_r10", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, 0.0F, -48.0F, 40.0F, 7.2F, 128.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.8108F, 10.0059F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition upper2_r11 = upper2.addOrReplaceChild("upper2_r11", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, 0.0F, -48.0F, 38.0F, 7.2F, 128.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(74.5987F, 5.9554F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition upper2_r12 = upper2.addOrReplaceChild("upper2_r12", CubeListBuilder.create().texOffs(0, 256).addBox(-8.0F, 0.0F, -52.0F, 40.0F, 5.2F, 136.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.8108F, 6.0059F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition upper2_r13 = upper2.addOrReplaceChild("upper2_r13",
				CubeListBuilder.create().texOffs(0, 256).addBox(4.0F, 6.0F, -48.0F, 28.0F, 5.2F, 128.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-12.0F, 0.0F, -52.0F, 44.0F, 5.2F, 136.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition bone47 = upper2.addOrReplaceChild("bone47", CubeListBuilder.create(), PartPose.offsetAndRotation(108.6013F, 37.1554F, -2.0F, 0.0F, 0.0F, 1.7453F));
		PartDefinition bone47_r1 = bone47.addOrReplaceChild("bone47_r1",
				CubeListBuilder.create().texOffs(0, 256).addBox(-36.0F, 0.0F, 38.0F, 44.0F, 11.2F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-36.0F, 0.0F, -80.0F, 44.0F, 11.2F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 36.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone47_r2 = bone47.addOrReplaceChild("bone47_r2",
				CubeListBuilder.create().texOffs(0, 256).addBox(-32.0F, 0.0F, 38.0F, 40.0F, 11.2F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-32.0F, 0.0F, -80.0F, 40.0F, 11.2F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(38.7879F, 4.0506F, 36.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bone47_r3 = bone47.addOrReplaceChild("bone47_r3",
				CubeListBuilder.create().texOffs(0, 256).addBox(-32.0F, 0.0F, 38.0F, 36.0F, 7.2F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 256).addBox(-32.0F, 0.0F, -80.0F, 36.0F, 7.2F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(74.5987F, -1.9554F, 36.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone45 = upper2.addOrReplaceChild("bone45", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone45_r1 = bone45.addOrReplaceChild("bone45_r1", CubeListBuilder.create().texOffs(0, 256).addBox(-16.0F, -2.0F, -5.2F, 48.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition bone46 = bone28.addOrReplaceChild("bone46", CubeListBuilder.create(), PartPose.offset(-100.0F, 10.0F, 0.0F));
		PartDefinition bone46_r1 = bone46.addOrReplaceChild("bone46_r1", CubeListBuilder.create().texOffs(0, 256).addBox(-0.8F, -1.2F, -56.0F, 11.2F, 19.2F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-30.263F, -26.8039F, 221.1317F, 0.1745F, -0.7854F, 0.0F));
		PartDefinition bone46_r2 = bone46.addOrReplaceChild("bone46_r2", CubeListBuilder.create().texOffs(0, 256).addBox(-0.8F, -10.8F, -56.0F, 9.6F, 14.8F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.5325F, -10.4147F, 209.5325F, 0.0873F, -0.7854F, 0.0F));
		PartDefinition bone46_r3 = bone46.addOrReplaceChild("bone46_r3", CubeListBuilder.create().texOffs(0, 256).addBox(0.0F, -10.0F, -56.0F, 8.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 192.0F, -0.1745F, -0.7854F, 0.0F));
		PartDefinition bone46_r4 = bone46.addOrReplaceChild("bone46_r4", CubeListBuilder.create().texOffs(0, 256).addBox(-0.8F, -1.2F, 46.0F, 11.2F, 19.2F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-30.263F, -26.8039F, -29.1317F, -0.1745F, 0.7854F, 0.0F));
		PartDefinition bone46_r5 = bone46.addOrReplaceChild("bone46_r5", CubeListBuilder.create().texOffs(0, 256).addBox(-0.8F, -10.8F, 36.0F, 9.6F, 14.8F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.5325F, -10.4147F, -17.5325F, -0.0873F, 0.7854F, 0.0F));
		PartDefinition bone46_r6 = bone46.addOrReplaceChild("bone46_r6", CubeListBuilder.create().texOffs(0, 256).addBox(0.0F, -10.0F, 32.0F, 8.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.7854F, 0.0F));
		PartDefinition kuti = bone84.addOrReplaceChild("kuti", CubeListBuilder.create().texOffs(162, 256).addBox(-3.8263F, -154.0698F, 26.3628F, 72.1395F, 150.1395F, 74.0186F, new CubeDeformation(0.0F)), PartPose.offset(-32.0F, 0.0F, -64.0F));
		PartDefinition bone96 = kuti.addOrReplaceChild("bone96",
				CubeListBuilder.create().texOffs(162, 164).addBox(-11.6607F, -30.4278F, 3.3805F, 19.3182F, 28.8696F, 2.5829F, new CubeDeformation(0.0F)).texOffs(162, 164)
						.addBox(-51.6607F, -30.4278F, 3.3805F, 21.3182F, 28.8696F, 2.5829F, new CubeDeformation(0.0F)).texOffs(162, 164).addBox(-35.6607F, -56.4278F, 3.3805F, 29.3182F, 54.8696F, 2.5829F, new CubeDeformation(0.0F)).texOffs(162, 164)
						.addBox(7.5393F, -20.4278F, 3.3805F, 8.1182F, 18.8696F, 2.5829F, new CubeDeformation(0.0F)).texOffs(162, 164).addBox(-56.0607F, -22.4278F, 3.3805F, 6.1182F, 20.8696F, 2.5829F, new CubeDeformation(0.0F)).texOffs(162, 164)
						.addBox(-51.6607F, -30.4278F, 103.1414F, 21.3182F, 28.8696F, 2.5829F, new CubeDeformation(0.0F)).texOffs(162, 164).addBox(-35.6607F, -56.4278F, 103.1414F, 29.3182F, 54.8696F, 2.5829F, new CubeDeformation(0.0F))
						.texOffs(162, 164).addBox(7.5393F, -20.4278F, 103.1414F, 8.1182F, 18.8696F, 2.5829F, new CubeDeformation(0.0F)).texOffs(162, 164).addBox(-56.0607F, -22.4278F, 103.1414F, 6.1182F, 20.8696F, 2.5829F, new CubeDeformation(0.0F))
						.texOffs(162, 164).addBox(-11.6607F, -30.4278F, 103.1414F, 19.3182F, 28.8696F, 2.5829F, new CubeDeformation(0.0F)),
				PartPose.offset(53.304F, -153.8654F, 9.4476F));
		PartDefinition frontkuti = kuti.addOrReplaceChild("frontkuti", CubeListBuilder.create(), PartPose.offset(-8.0F, 0.0F, 32.0F));
		PartDefinition bone48 = frontkuti.addOrReplaceChild("bone48", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6756F, -1.9302F, -2.5023F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone50 = bone48.addOrReplaceChild("bone50",
				CubeListBuilder.create().texOffs(165, 171).mirror().addBox(-2.081F, -5.2248F, 3.8769F, 88.1395F, 4.1395F, 16.4186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror()
						.addBox(-1.281F, -5.2248F, -8.1231F, 87.3395F, 4.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror().addBox(6.719F, -5.2248F, -20.9231F, 70.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(165, 171).mirror().addBox(12.719F, -5.2248F, -26.5231F, 58.9395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror()
						.addBox(27.919F, -5.2248F, -34.5231F, 28.5395F, 4.1395F, 9.2186F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror().addBox(55.919F, -5.2248F, -31.3231F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(140, 134).mirror().addBox(19.919F, -5.2248F, -31.3231F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror()
						.addBox(2.719F, -5.2248F, -14.9231F, 78.5395F, 4.1395F, 7.2186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.9303F, 0.0F, -11.2061F));
		PartDefinition bone50_r1 = bone50.addOrReplaceChild("bone50_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-3.8937F, -21.2248F, -7.3616F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone50_r2 = bone50.addOrReplaceChild("bone50_r2",
				CubeListBuilder.create().texOffs(216, 256).addBox(-4.1395F, -84.1395F, -8.279F, 4.1395F, 82.1395F, 16.4186F, new CubeDeformation(0.0F)).texOffs(165, 171).mirror()
						.addBox(-1.1507F, -84.1395F, 6.121F, 88.1395F, 80.9395F, 2.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(216, 256).mirror().addBox(86.0493F, -84.1395F, -8.279F, 4.1395F, 84.1395F, 16.4186F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.9303F, 0.0F, 11.2061F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone50_r3 = bone50.addOrReplaceChild("bone50_r3", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-0.9174F, -21.2248F, -8.0332F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(55.2292F, 0.0F, -31.8866F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone50_r4 = bone50.addOrReplaceChild("bone50_r4", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-0.8226F, -21.2248F, -7.8042F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(65.3991F, 0.0F, -27.0892F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone50_r5 = bone50.addOrReplaceChild("bone50_r5", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-0.6716F, -21.2248F, -7.6074F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(73.9809F, 0.0F, -19.8231F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone50_r6 = bone50.addOrReplaceChild("bone50_r6", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-0.475F, -21.2248F, -7.4565F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(80.3897F, 0.0F, -10.5835F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone50_r7 = bone50.addOrReplaceChild("bone50_r7", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-0.2458F, -21.2248F, -7.3616F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(84.1886F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone50_r8 = bone50.addOrReplaceChild("bone50_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-3.1898F, -21.2248F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, 0.0F, -33.8883F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone50_r9 = bone50.addOrReplaceChild("bone50_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-3.2221F, -21.2248F, -8.0332F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, 0.0F, -31.8866F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone50_r10 = bone50.addOrReplaceChild("bone50_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-3.317F, -21.2248F, -7.8042F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, 0.0F, -27.0892F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone50_r11 = bone50.addOrReplaceChild("bone50_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-3.4679F, -21.2248F, -7.6074F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, 0.0F, -19.8231F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone50_r12 = bone50.addOrReplaceChild("bone50_r12", CubeListBuilder.create().texOffs(140, 134).addBox(-3.6646F, -21.2248F, -7.4565F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, 0.0F, -10.5835F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone49 = bone48.addOrReplaceChild("bone49", CubeListBuilder.create(), PartPose.offset(0.9303F, -20.0F, -11.2061F));
		PartDefinition bone49_r1 = bone49.addOrReplaceChild("bone49_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0937F, -13.2248F, -6.5616F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone49_r2 = bone49.addOrReplaceChild("bone49_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9174F, -13.2248F, -7.2332F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(55.2292F, 0.0F, -31.8866F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone49_r3 = bone49.addOrReplaceChild("bone49_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.8226F, -13.2248F, -7.0042F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(65.3991F, 0.0F, -27.0892F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone49_r4 = bone49.addOrReplaceChild("bone49_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.6716F, -13.2248F, -6.8074F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(73.9809F, 0.0F, -19.8231F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone49_r5 = bone49.addOrReplaceChild("bone49_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.475F, -13.2248F, -6.6565F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(80.3897F, 0.0F, -10.5835F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone49_r6 = bone49.addOrReplaceChild("bone49_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.2458F, -13.2248F, -6.5616F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(84.1886F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone49_r7 = bone49.addOrReplaceChild("bone49_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.3898F, -13.2248F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, 0.0F, -33.8883F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone49_r8 = bone49.addOrReplaceChild("bone49_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-2.4221F, -13.2248F, -7.2332F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, 0.0F, -31.8866F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone49_r9 = bone49.addOrReplaceChild("bone49_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-2.517F, -13.2248F, -7.0042F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, 0.0F, -27.0892F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone49_r10 = bone49.addOrReplaceChild("bone49_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6679F, -13.2248F, -6.8074F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, 0.0F, -19.8231F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone49_r11 = bone49.addOrReplaceChild("bone49_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-2.8646F, -13.2248F, -6.6565F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, 0.0F, -10.5835F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone51 = frontkuti.addOrReplaceChild("bone51", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6756F, 9.9302F, -2.5023F, -0.6109F, 0.0F, 0.0F));
		PartDefinition bone52 = bone51.addOrReplaceChild("bone52",
				CubeListBuilder.create().texOffs(140, 134).mirror().addBox(85.119F, -76.754F, -41.0197F, 4.1395F, 20.1395F, 8.4186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror()
						.addBox(-2.081F, -76.754F, -41.0197F, 88.1395F, 4.1395F, 8.4186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror().addBox(-1.281F, -76.754F, -53.0197F, 87.3395F, 4.1395F, 12.4186F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(165, 171).mirror().addBox(6.719F, -76.754F, -65.8197F, 70.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror()
						.addBox(12.719F, -76.754F, -71.4197F, 58.9395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror().addBox(27.919F, -76.754F, -79.4197F, 28.5395F, 4.1395F, 9.2186F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(140, 134).mirror().addBox(55.919F, -76.754F, -76.2197F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror()
						.addBox(19.919F, -76.754F, -76.2197F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror().addBox(2.719F, -76.754F, -59.8197F, 78.5395F, 4.1395F, 7.2186F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(140, 134).addBox(-5.0698F, -76.754F, -41.0197F, 4.1395F, 20.1395F, 8.4186F, new CubeDeformation(0.0F)),
				PartPose.offset(0.9303F, 0.0F, -11.2061F));
		PartDefinition bone52_r1 = bone52.addOrReplaceChild("bone52_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -76.754F, -43.9468F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone52_r2 = bone52.addOrReplaceChild("bone52_r2", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(0.0F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(55.2292F, -76.754F, -75.8334F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone52_r3 = bone52.addOrReplaceChild("bone52_r3", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(0.0F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(65.3991F, -76.754F, -71.0359F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone52_r4 = bone52.addOrReplaceChild("bone52_r4", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(0.0F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(73.9809F, -76.754F, -63.7698F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone52_r5 = bone52.addOrReplaceChild("bone52_r5", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(0.0F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(80.3897F, -76.754F, -54.5302F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone52_r6 = bone52.addOrReplaceChild("bone52_r6", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(0.0F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(84.1886F, -76.754F, -43.9468F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone52_r7 = bone52.addOrReplaceChild("bone52_r7", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, -76.754F, -77.835F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone52_r8 = bone52.addOrReplaceChild("bone52_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, -76.754F, -75.8334F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone52_r9 = bone52.addOrReplaceChild("bone52_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, -76.754F, -71.0359F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone52_r10 = bone52.addOrReplaceChild("bone52_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, -76.754F, -63.7698F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone52_r11 = bone52.addOrReplaceChild("bone52_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -8.279F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, -76.754F, -54.5302F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone53 = bone51.addOrReplaceChild("bone53", CubeListBuilder.create(), PartPose.offset(0.9303F, 20.0F, -11.2061F));
		PartDefinition bone53_r1 = bone53.addOrReplaceChild("bone53_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -76.754F, -43.9468F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone53_r2 = bone53.addOrReplaceChild("bone53_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(55.2292F, -76.754F, -75.8334F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone53_r3 = bone53.addOrReplaceChild("bone53_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(65.3991F, -76.754F, -71.0359F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone53_r4 = bone53.addOrReplaceChild("bone53_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(73.9809F, -76.754F, -63.7698F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone53_r5 = bone53.addOrReplaceChild("bone53_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(80.3897F, -76.754F, -54.5302F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone53_r6 = bone53.addOrReplaceChild("bone53_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(84.1886F, -76.754F, -43.9468F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone53_r7 = bone53.addOrReplaceChild("bone53_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, -76.754F, -77.835F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone53_r8 = bone53.addOrReplaceChild("bone53_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, -76.754F, -75.8334F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone53_r9 = bone53.addOrReplaceChild("bone53_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, -76.754F, -71.0359F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone53_r10 = bone53.addOrReplaceChild("bone53_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, -76.754F, -63.7698F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone53_r11 = bone53.addOrReplaceChild("bone53_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -7.479F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, -76.754F, -54.5302F, 0.0F, -0.5236F, 0.0F));
		PartDefinition backkuti = kuti.addOrReplaceChild("backkuti", CubeListBuilder.create(), PartPose.offset(-8.0F, 0.0F, 96.0F));
		PartDefinition bone54 = backkuti.addOrReplaceChild("bone54", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6756F, -1.9302F, 2.5023F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone55 = bone54.addOrReplaceChild("bone55",
				CubeListBuilder.create().texOffs(165, 171).addBox(-2.081F, -5.2248F, -20.2954F, 88.1395F, 4.1395F, 16.4186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(-1.281F, -5.2248F, -4.2954F, 87.3395F, 4.1395F, 12.4186F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(6.719F, -5.2248F, 14.9046F, 70.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(12.719F, -5.2248F, 20.5046F, 58.9395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(27.919F, -5.2248F, 25.3046F, 28.5395F, 4.1395F, 9.2186F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(55.919F, -5.2248F, 25.3046F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(19.919F, -5.2248F, 25.3046F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(2.719F, -5.2248F, 7.7046F, 78.5395F, 4.1395F, 7.2186F, new CubeDeformation(0.0F)),
				PartPose.offset(0.9303F, 0.0F, 11.2061F));
		PartDefinition bone55_r1 = bone55.addOrReplaceChild("bone55_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-3.8937F, -21.2248F, -5.057F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone55_r2 = bone55.addOrReplaceChild("bone55_r2",
				CubeListBuilder.create().texOffs(216, 256).addBox(-4.1395F, -84.1395F, -8.1395F, 4.1395F, 82.1395F, 16.4186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(-1.1507F, -84.1395F, -8.1395F, 88.1395F, 80.9395F, 2.0186F, new CubeDeformation(0.0F)).texOffs(216, 256).addBox(86.0493F, -84.1395F, -8.1395F, 4.1395F, 84.1395F, 16.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9303F, 0.0F, -11.2061F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone55_r3 = bone55.addOrReplaceChild("bone55_r3", CubeListBuilder.create().texOffs(140, 134).addBox(-0.9174F, -21.2248F, -4.3854F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.2292F, 0.0F, 31.8866F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone55_r4 = bone55.addOrReplaceChild("bone55_r4", CubeListBuilder.create().texOffs(140, 134).addBox(-0.8226F, -21.2248F, -4.6144F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(65.3991F, 0.0F, 27.0892F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone55_r5 = bone55.addOrReplaceChild("bone55_r5", CubeListBuilder.create().texOffs(140, 134).addBox(-0.6716F, -21.2248F, -4.8111F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(73.9809F, 0.0F, 19.8231F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone55_r6 = bone55.addOrReplaceChild("bone55_r6", CubeListBuilder.create().texOffs(140, 134).addBox(-0.475F, -21.2248F, -4.9621F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.3897F, 0.0F, 10.5835F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone55_r7 = bone55.addOrReplaceChild("bone55_r7", CubeListBuilder.create().texOffs(140, 134).addBox(-0.2458F, -21.2248F, -5.057F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.1886F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone55_r8 = bone55.addOrReplaceChild("bone55_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-3.1898F, -21.2248F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, 0.0F, 33.8883F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone55_r9 = bone55.addOrReplaceChild("bone55_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-3.2221F, -21.2248F, -4.3854F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, 0.0F, 31.8866F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone55_r10 = bone55.addOrReplaceChild("bone55_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-3.317F, -21.2248F, -4.6144F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, 0.0F, 27.0892F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone55_r11 = bone55.addOrReplaceChild("bone55_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-3.4679F, -21.2248F, -4.8111F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, 0.0F, 19.8231F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone55_r12 = bone55.addOrReplaceChild("bone55_r12", CubeListBuilder.create().texOffs(140, 134).addBox(-3.6646F, -21.2248F, -4.9621F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, 0.0F, 10.5835F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone56 = bone54.addOrReplaceChild("bone56", CubeListBuilder.create(), PartPose.offset(0.9303F, -20.0F, 11.2061F));
		PartDefinition bone56_r1 = bone56.addOrReplaceChild("bone56_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0937F, -13.2248F, -4.257F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone56_r2 = bone56.addOrReplaceChild("bone56_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9174F, -13.2248F, -3.5854F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.2292F, 0.0F, 31.8866F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone56_r3 = bone56.addOrReplaceChild("bone56_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8226F, -13.2248F, -3.8144F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(65.3991F, 0.0F, 27.0892F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone56_r4 = bone56.addOrReplaceChild("bone56_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6716F, -13.2248F, -4.0111F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(73.9809F, 0.0F, 19.8231F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone56_r5 = bone56.addOrReplaceChild("bone56_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.475F, -13.2248F, -4.1621F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.3897F, 0.0F, 10.5835F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone56_r6 = bone56.addOrReplaceChild("bone56_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2458F, -13.2248F, -4.257F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.1886F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone56_r7 = bone56.addOrReplaceChild("bone56_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.3898F, -13.2248F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, 0.0F, 33.8883F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone56_r8 = bone56.addOrReplaceChild("bone56_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-2.4221F, -13.2248F, -3.5854F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, 0.0F, 31.8866F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone56_r9 = bone56.addOrReplaceChild("bone56_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-2.517F, -13.2248F, -3.8144F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, 0.0F, 27.0892F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone56_r10 = bone56.addOrReplaceChild("bone56_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6679F, -13.2248F, -4.0111F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, 0.0F, 19.8231F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone56_r11 = bone56.addOrReplaceChild("bone56_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-2.8646F, -13.2248F, -4.1621F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, 0.0F, 10.5835F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone57 = backkuti.addOrReplaceChild("bone57", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6756F, 9.9302F, 2.5023F, 0.6109F, 0.0F, 0.0F));
		PartDefinition bone58 = bone57.addOrReplaceChild("bone58",
				CubeListBuilder.create().texOffs(140, 134).addBox(85.119F, -76.754F, 32.6011F, 4.1395F, 20.1395F, 8.4186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(-2.081F, -76.754F, 32.6011F, 88.1395F, 4.1395F, 8.4186F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(-1.281F, -76.754F, 40.6011F, 87.3395F, 4.1395F, 12.4186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(6.719F, -76.754F, 59.8011F, 70.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(12.719F, -76.754F, 65.4011F, 58.9395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(27.919F, -76.754F, 70.2011F, 28.5395F, 4.1395F, 9.2186F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(55.919F, -76.754F, 70.2011F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(19.919F, -76.754F, 70.2011F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(2.719F, -76.754F, 52.6011F, 78.5395F, 4.1395F, 7.2186F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(-5.0698F, -76.754F, 32.6011F, 4.1395F, 20.1395F, 8.4186F, new CubeDeformation(0.0F)),
				PartPose.offset(0.9303F, 0.0F, 11.2061F));
		PartDefinition bone58_r1 = bone58.addOrReplaceChild("bone58_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -76.754F, 43.9468F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone58_r2 = bone58.addOrReplaceChild("bone58_r2", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.2292F, -76.754F, 75.8334F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone58_r3 = bone58.addOrReplaceChild("bone58_r3", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(65.3991F, -76.754F, 71.0359F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone58_r4 = bone58.addOrReplaceChild("bone58_r4", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(73.9809F, -76.754F, 63.7698F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone58_r5 = bone58.addOrReplaceChild("bone58_r5", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.3897F, -76.754F, 54.5302F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone58_r6 = bone58.addOrReplaceChild("bone58_r6", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.1886F, -76.754F, 43.9468F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone58_r7 = bone58.addOrReplaceChild("bone58_r7", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, -76.754F, 77.835F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone58_r8 = bone58.addOrReplaceChild("bone58_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, -76.754F, 75.8334F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone58_r9 = bone58.addOrReplaceChild("bone58_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, -76.754F, 71.0359F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone58_r10 = bone58.addOrReplaceChild("bone58_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, -76.754F, 63.7698F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone58_r11 = bone58.addOrReplaceChild("bone58_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, -76.754F, 54.5302F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone59 = bone57.addOrReplaceChild("bone59", CubeListBuilder.create(), PartPose.offset(0.9303F, 20.0F, 11.2061F));
		PartDefinition bone59_r1 = bone59.addOrReplaceChild("bone59_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -76.754F, 43.9468F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone59_r2 = bone59.addOrReplaceChild("bone59_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.2292F, -76.754F, 75.8334F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone59_r3 = bone59.addOrReplaceChild("bone59_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(65.3991F, -76.754F, 71.0359F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone59_r4 = bone59.addOrReplaceChild("bone59_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(73.9809F, -76.754F, 63.7698F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone59_r5 = bone59.addOrReplaceChild("bone59_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.3897F, -76.754F, 54.5302F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone59_r6 = bone59.addOrReplaceChild("bone59_r6", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.1886F, -76.754F, 43.9468F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone59_r7 = bone59.addOrReplaceChild("bone59_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, -76.754F, 77.835F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone59_r8 = bone59.addOrReplaceChild("bone59_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, -76.754F, 75.8334F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone59_r9 = bone59.addOrReplaceChild("bone59_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, -76.754F, 71.0359F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone59_r10 = bone59.addOrReplaceChild("bone59_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, -76.754F, 63.7698F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone59_r11 = bone59.addOrReplaceChild("bone59_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, -76.754F, 54.5302F, 0.0F, 0.5236F, 0.0F));
		PartDefinition leftkuti = kuti.addOrReplaceChild("leftkuti", CubeListBuilder.create(), PartPose.offsetAndRotation(66.0F, 0.0F, 104.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone60 = leftkuti.addOrReplaceChild("bone60", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6756F, -1.9302F, 2.5023F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone61 = bone60.addOrReplaceChild("bone61",
				CubeListBuilder.create().texOffs(165, 171).addBox(-2.081F, -5.2248F, -20.2954F, 88.1395F, 4.1395F, 16.4186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(-1.281F, -5.2248F, -4.2954F, 87.3395F, 4.1395F, 12.4186F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(6.719F, -5.2248F, 14.9046F, 70.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(12.719F, -5.2248F, 20.5046F, 58.9395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(27.919F, -5.2248F, 25.3046F, 28.5395F, 4.1395F, 9.2186F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(55.919F, -5.2248F, 25.3046F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(19.919F, -5.2248F, 25.3046F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(2.719F, -5.2248F, 7.7046F, 78.5395F, 4.1395F, 7.2186F, new CubeDeformation(0.0F)),
				PartPose.offset(0.9303F, 0.0F, 11.2061F));
		PartDefinition bone61_r1 = bone61.addOrReplaceChild("bone61_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-3.8937F, -21.2248F, -5.057F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone61_r2 = bone61.addOrReplaceChild("bone61_r2",
				CubeListBuilder.create().texOffs(216, 256).addBox(-4.1395F, -84.1395F, -8.1395F, 4.1395F, 82.1395F, 16.4186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(-1.1507F, -84.1395F, -8.1395F, 88.1395F, 80.9395F, 2.0186F, new CubeDeformation(0.0F)).texOffs(216, 256).addBox(86.0493F, -84.1395F, -8.1395F, 4.1395F, 84.1395F, 16.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9303F, 0.0F, -11.2061F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone61_r3 = bone61.addOrReplaceChild("bone61_r3", CubeListBuilder.create().texOffs(140, 134).addBox(-0.9174F, -21.2248F, -4.3854F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.2292F, 0.0F, 31.8866F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone61_r4 = bone61.addOrReplaceChild("bone61_r4", CubeListBuilder.create().texOffs(140, 134).addBox(-0.8226F, -21.2248F, -4.6144F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(65.3991F, 0.0F, 27.0892F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone61_r5 = bone61.addOrReplaceChild("bone61_r5", CubeListBuilder.create().texOffs(140, 134).addBox(-0.6716F, -21.2248F, -4.8111F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(73.9809F, 0.0F, 19.8231F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone61_r6 = bone61.addOrReplaceChild("bone61_r6", CubeListBuilder.create().texOffs(140, 134).addBox(-0.475F, -21.2248F, -4.9621F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.3897F, 0.0F, 10.5835F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone61_r7 = bone61.addOrReplaceChild("bone61_r7", CubeListBuilder.create().texOffs(140, 134).addBox(-0.2458F, -21.2248F, -5.057F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.1886F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone61_r8 = bone61.addOrReplaceChild("bone61_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-3.1898F, -21.2248F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, 0.0F, 33.8883F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone61_r9 = bone61.addOrReplaceChild("bone61_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-3.2221F, -21.2248F, -4.3854F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, 0.0F, 31.8866F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone61_r10 = bone61.addOrReplaceChild("bone61_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-3.317F, -21.2248F, -4.6144F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, 0.0F, 27.0892F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone61_r11 = bone61.addOrReplaceChild("bone61_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-3.4679F, -21.2248F, -4.8111F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, 0.0F, 19.8231F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone61_r12 = bone61.addOrReplaceChild("bone61_r12", CubeListBuilder.create().texOffs(140, 134).addBox(-3.6646F, -21.2248F, -4.9621F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, 0.0F, 10.5835F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone62 = bone60.addOrReplaceChild("bone62", CubeListBuilder.create(), PartPose.offset(0.9303F, -20.0F, 11.2061F));
		PartDefinition bone62_r1 = bone62.addOrReplaceChild("bone62_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0937F, -13.2248F, -4.257F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone62_r2 = bone62.addOrReplaceChild("bone62_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9174F, -13.2248F, -3.5854F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.2292F, 0.0F, 31.8866F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone62_r3 = bone62.addOrReplaceChild("bone62_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8226F, -13.2248F, -3.8144F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(65.3991F, 0.0F, 27.0892F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone62_r4 = bone62.addOrReplaceChild("bone62_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6716F, -13.2248F, -4.0111F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(73.9809F, 0.0F, 19.8231F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone62_r5 = bone62.addOrReplaceChild("bone62_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.475F, -13.2248F, -4.1621F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.3897F, 0.0F, 10.5835F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone62_r6 = bone62.addOrReplaceChild("bone62_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2458F, -13.2248F, -4.257F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.1886F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone62_r7 = bone62.addOrReplaceChild("bone62_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.3898F, -13.2248F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, 0.0F, 33.8883F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone62_r8 = bone62.addOrReplaceChild("bone62_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-2.4221F, -13.2248F, -3.5854F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, 0.0F, 31.8866F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone62_r9 = bone62.addOrReplaceChild("bone62_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-2.517F, -13.2248F, -3.8144F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, 0.0F, 27.0892F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone62_r10 = bone62.addOrReplaceChild("bone62_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6679F, -13.2248F, -4.0111F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, 0.0F, 19.8231F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone62_r11 = bone62.addOrReplaceChild("bone62_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-2.8646F, -13.2248F, -4.1621F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, 0.0F, 10.5835F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone63 = leftkuti.addOrReplaceChild("bone63", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6756F, 9.9302F, 2.5023F, 0.6109F, 0.0F, 0.0F));
		PartDefinition bone64 = bone63.addOrReplaceChild("bone64",
				CubeListBuilder.create().texOffs(140, 134).addBox(85.119F, -76.754F, 32.6011F, 4.1395F, 20.1395F, 8.4186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(-2.081F, -76.754F, 32.6011F, 88.1395F, 4.1395F, 8.4186F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(-1.281F, -76.754F, 40.6011F, 87.3395F, 4.1395F, 12.4186F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(6.719F, -76.754F, 59.8011F, 70.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(12.719F, -76.754F, 65.4011F, 58.9395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(27.919F, -76.754F, 70.2011F, 28.5395F, 4.1395F, 9.2186F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(55.919F, -76.754F, 70.2011F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(19.919F, -76.754F, 70.2011F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(2.719F, -76.754F, 52.6011F, 78.5395F, 4.1395F, 7.2186F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(-5.0698F, -76.754F, 32.6011F, 4.1395F, 20.1395F, 8.4186F, new CubeDeformation(0.0F)),
				PartPose.offset(0.9303F, 0.0F, 11.2061F));
		PartDefinition bone64_r1 = bone64.addOrReplaceChild("bone64_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -76.754F, 43.9468F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone64_r2 = bone64.addOrReplaceChild("bone64_r2", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.2292F, -76.754F, 75.8334F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone64_r3 = bone64.addOrReplaceChild("bone64_r3", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(65.3991F, -76.754F, 71.0359F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone64_r4 = bone64.addOrReplaceChild("bone64_r4", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(73.9809F, -76.754F, 63.7698F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone64_r5 = bone64.addOrReplaceChild("bone64_r5", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.3897F, -76.754F, 54.5302F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone64_r6 = bone64.addOrReplaceChild("bone64_r6", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.1886F, -76.754F, 43.9468F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone64_r7 = bone64.addOrReplaceChild("bone64_r7", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, -76.754F, 77.835F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone64_r8 = bone64.addOrReplaceChild("bone64_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, -76.754F, 75.8334F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone64_r9 = bone64.addOrReplaceChild("bone64_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, -76.754F, 71.0359F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone64_r10 = bone64.addOrReplaceChild("bone64_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, -76.754F, 63.7698F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone64_r11 = bone64.addOrReplaceChild("bone64_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, -76.754F, 54.5302F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone65 = bone63.addOrReplaceChild("bone65", CubeListBuilder.create(), PartPose.offset(0.9303F, 20.0F, 11.2061F));
		PartDefinition bone65_r1 = bone65.addOrReplaceChild("bone65_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -76.754F, 43.9468F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone65_r2 = bone65.addOrReplaceChild("bone65_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.2292F, -76.754F, 75.8334F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone65_r3 = bone65.addOrReplaceChild("bone65_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(65.3991F, -76.754F, 71.0359F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone65_r4 = bone65.addOrReplaceChild("bone65_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(73.9809F, -76.754F, 63.7698F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone65_r5 = bone65.addOrReplaceChild("bone65_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.3897F, -76.754F, 54.5302F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone65_r6 = bone65.addOrReplaceChild("bone65_r6", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(84.1886F, -76.754F, 43.9468F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone65_r7 = bone65.addOrReplaceChild("bone65_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.0246F, -76.754F, 77.835F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone65_r8 = bone65.addOrReplaceChild("bone65_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.9595F, -76.754F, 75.8334F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone65_r9 = bone65.addOrReplaceChild("bone65_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7895F, -76.754F, 71.0359F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone65_r10 = bone65.addOrReplaceChild("bone65_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2078F, -76.754F, 63.7698F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone65_r11 = bone65.addOrReplaceChild("bone65_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.799F, -76.754F, 54.5302F, 0.0F, 0.5236F, 0.0F));
		PartDefinition rightkuti = kuti.addOrReplaceChild("rightkuti", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0F, 104.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone66 = rightkuti.addOrReplaceChild("bone66", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6756F, -1.9302F, 2.5023F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone67 = bone66.addOrReplaceChild("bone67", CubeListBuilder.create().texOffs(165, 171).mirror().addBox(-86.0585F, -5.2248F, -20.2954F, 88.1395F, 4.1395F, 16.4186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171)
				.mirror().addBox(-86.0585F, -5.2248F, -4.2954F, 87.3395F, 4.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror()
				.addBox(-77.2585F, -5.2248F, 14.9046F, 70.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror().addBox(-71.6585F, -5.2248F, 20.5046F, 58.9395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(140, 134).mirror().addBox(-56.4585F, -5.2248F, 25.3046F, 28.5395F, 4.1395F, 9.2186F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror()
				.addBox(-64.4585F, -5.2248F, 25.3046F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror().addBox(-28.4585F, -5.2248F, 25.3046F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(165, 171).mirror().addBox(-81.2585F, -5.2248F, 7.7046F, 78.5395F, 4.1395F, 7.2186F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.9303F, 0.0F, 11.2061F));
		PartDefinition bone67_r1 = bone67.addOrReplaceChild("bone67_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-0.2458F, -21.2248F, -5.057F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone67_r2 = bone67.addOrReplaceChild("bone67_r2",
				CubeListBuilder.create().texOffs(216, 256).addBox(0.0F, -84.1395F, -8.1395F, 4.1395F, 82.1395F, 16.4186F, new CubeDeformation(0.0F)).texOffs(165, 171).mirror()
						.addBox(-86.9888F, -84.1395F, -8.1395F, 88.1395F, 80.9395F, 2.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(216, 256).mirror()
						.addBox(-90.1888F, -84.1395F, -8.1395F, 4.1395F, 84.1395F, 16.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9303F, 0.0F, -11.2061F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone67_r3 = bone67.addOrReplaceChild("bone67_r3", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-3.2221F, -21.2248F, -4.3854F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-55.2292F, 0.0F, 31.8866F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone67_r4 = bone67.addOrReplaceChild("bone67_r4", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-3.317F, -21.2248F, -4.6144F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-65.3991F, 0.0F, 27.0892F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone67_r5 = bone67.addOrReplaceChild("bone67_r5", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-3.4679F, -21.2248F, -4.8111F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-73.9809F, 0.0F, 19.8231F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone67_r6 = bone67.addOrReplaceChild("bone67_r6", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-3.6646F, -21.2248F, -4.9621F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-80.3897F, 0.0F, 10.5835F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone67_r7 = bone67.addOrReplaceChild("bone67_r7", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-3.8937F, -21.2248F, -5.057F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-84.1886F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone67_r8 = bone67.addOrReplaceChild("bone67_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-0.9498F, -21.2248F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-40.0246F, 0.0F, 33.8883F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone67_r9 = bone67.addOrReplaceChild("bone67_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-0.9174F, -21.2248F, -4.3854F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-28.9595F, 0.0F, 31.8866F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone67_r10 = bone67.addOrReplaceChild("bone67_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-0.8226F, -21.2248F, -4.6144F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.7895F, 0.0F, 27.0892F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone67_r11 = bone67.addOrReplaceChild("bone67_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-0.6716F, -21.2248F, -4.8111F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.2078F, 0.0F, 19.8231F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone67_r12 = bone67.addOrReplaceChild("bone67_r12", CubeListBuilder.create().texOffs(140, 134).addBox(-0.4749F, -21.2248F, -4.9621F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.799F, 0.0F, 10.5835F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone68 = bone66.addOrReplaceChild("bone68", CubeListBuilder.create(), PartPose.offset(-0.9303F, -20.0F, 11.2061F));
		PartDefinition bone68_r1 = bone68.addOrReplaceChild("bone68_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2458F, -13.2248F, -4.257F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone68_r2 = bone68.addOrReplaceChild("bone68_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.4221F, -13.2248F, -3.5854F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-55.2292F, 0.0F, 31.8866F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone68_r3 = bone68.addOrReplaceChild("bone68_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.517F, -13.2248F, -3.8144F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-65.3991F, 0.0F, 27.0892F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone68_r4 = bone68.addOrReplaceChild("bone68_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.6679F, -13.2248F, -4.0111F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-73.9809F, 0.0F, 19.8231F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone68_r5 = bone68.addOrReplaceChild("bone68_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.8646F, -13.2248F, -4.1621F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-80.3897F, 0.0F, 10.5835F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone68_r6 = bone68.addOrReplaceChild("bone68_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.0937F, -13.2248F, -4.257F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-84.1886F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone68_r7 = bone68.addOrReplaceChild("bone68_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9498F, -13.2248F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-40.0246F, 0.0F, 33.8883F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone68_r8 = bone68.addOrReplaceChild("bone68_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9174F, -13.2248F, -3.5854F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-28.9595F, 0.0F, 31.8866F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone68_r9 = bone68.addOrReplaceChild("bone68_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8226F, -13.2248F, -3.8144F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.7895F, 0.0F, 27.0892F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone68_r10 = bone68.addOrReplaceChild("bone68_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6716F, -13.2248F, -4.0111F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.2078F, 0.0F, 19.8231F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone68_r11 = bone68.addOrReplaceChild("bone68_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4749F, -13.2248F, -4.1621F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.799F, 0.0F, 10.5835F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone69 = rightkuti.addOrReplaceChild("bone69", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6756F, 9.9302F, 2.5023F, 0.6109F, 0.0F, 0.0F));
		PartDefinition bone70 = bone69.addOrReplaceChild("bone70", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-89.2585F, -76.754F, 32.6011F, 4.1395F, 20.1395F, 8.4186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171)
				.mirror().addBox(-86.0585F, -76.754F, 32.6011F, 88.1395F, 4.1395F, 8.4186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror()
				.addBox(-86.0585F, -76.754F, 40.6011F, 87.3395F, 4.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror().addBox(-77.2585F, -76.754F, 59.8011F, 70.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(165, 171).mirror().addBox(-71.6585F, -76.754F, 65.4011F, 58.9395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror()
				.addBox(-56.4585F, -76.754F, 70.2011F, 28.5395F, 4.1395F, 9.2186F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror().addBox(-64.4585F, -76.754F, 70.2011F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(140, 134).mirror().addBox(-28.4585F, -76.754F, 70.2011F, 8.5395F, 4.1395F, 6.0186F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror()
				.addBox(-81.2585F, -76.754F, 52.6011F, 78.5395F, 4.1395F, 7.2186F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).addBox(0.9303F, -76.754F, 32.6011F, 4.1395F, 20.1395F, 8.4186F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.9303F, 0.0F, 11.2061F));
		PartDefinition bone70_r1 = bone70.addOrReplaceChild("bone70_r1", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -76.754F, 43.9468F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone70_r2 = bone70.addOrReplaceChild("bone70_r2", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-55.2292F, -76.754F, 75.8334F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone70_r3 = bone70.addOrReplaceChild("bone70_r3", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-65.3991F, -76.754F, 71.0359F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone70_r4 = bone70.addOrReplaceChild("bone70_r4", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-73.9809F, -76.754F, 63.7698F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone70_r5 = bone70.addOrReplaceChild("bone70_r5", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-80.3897F, -76.754F, 54.5302F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone70_r6 = bone70.addOrReplaceChild("bone70_r6", CubeListBuilder.create().texOffs(140, 134).mirror().addBox(-4.1395F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-84.1886F, -76.754F, 43.9468F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone70_r7 = bone70.addOrReplaceChild("bone70_r7", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-40.0246F, -76.754F, 77.835F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone70_r8 = bone70.addOrReplaceChild("bone70_r8", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-28.9595F, -76.754F, 75.8334F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone70_r9 = bone70.addOrReplaceChild("bone70_r9", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.7895F, -76.754F, 71.0359F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone70_r10 = bone70.addOrReplaceChild("bone70_r10", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.2078F, -76.754F, 63.7698F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone70_r11 = bone70.addOrReplaceChild("bone70_r11", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 0.0F, -4.1395F, 4.1395F, 20.1395F, 12.4186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.799F, -76.754F, 54.5302F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone71 = bone69.addOrReplaceChild("bone71", CubeListBuilder.create(), PartPose.offset(-0.9303F, 20.0F, 11.2061F));
		PartDefinition bone71_r1 = bone71.addOrReplaceChild("bone71_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -76.754F, 43.9468F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone71_r2 = bone71.addOrReplaceChild("bone71_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-55.2292F, -76.754F, 75.8334F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone71_r3 = bone71.addOrReplaceChild("bone71_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-65.3991F, -76.754F, 71.0359F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone71_r4 = bone71.addOrReplaceChild("bone71_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-73.9809F, -76.754F, 63.7698F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone71_r5 = bone71.addOrReplaceChild("bone71_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-80.3897F, -76.754F, 54.5302F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone71_r6 = bone71.addOrReplaceChild("bone71_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.3395F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-84.1886F, -76.754F, 43.9468F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone71_r7 = bone71.addOrReplaceChild("bone71_r7", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-40.0246F, -76.754F, 77.835F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone71_r8 = bone71.addOrReplaceChild("bone71_r8", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-28.9595F, -76.754F, 75.8334F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone71_r9 = bone71.addOrReplaceChild("bone71_r9", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.7895F, -76.754F, 71.0359F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone71_r10 = bone71.addOrReplaceChild("bone71_r10", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.2078F, -76.754F, 63.7698F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone71_r11 = bone71.addOrReplaceChild("bone71_r11", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -3.3395F, 3.3395F, 12.1395F, 10.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.799F, -76.754F, 54.5302F, 0.0F, -0.5236F, 0.0F));
		PartDefinition frontkutiup = kuti.addOrReplaceChild("frontkutiup", CubeListBuilder.create(), PartPose.offset(-8.0F, -136.0F, 48.0F));
		PartDefinition bone72 = frontkutiup.addOrReplaceChild("bone72", CubeListBuilder.create(), PartPose.offsetAndRotation(14.3946F, -17.1582F, 60.0986F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone73 = bone72.addOrReplaceChild("bone73", CubeListBuilder.create().texOffs(165, 171).mirror().addBox(-1.1054F, -15.4349F, -72.0158F, 52.8837F, 7.2837F, 9.8511F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171)
				.mirror().addBox(-0.6254F, -15.4349F, -79.2158F, 52.4037F, 7.2837F, 7.4511F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror()
				.addBox(4.1746F, -15.4349F, -86.8958F, 42.3237F, 7.2837F, 3.6111F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror().addBox(7.7746F, -15.4349F, -90.2558F, 35.3637F, 7.2837F, 3.6111F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(140, 134).mirror().addBox(16.8946F, -15.4349F, -95.0558F, 17.1237F, 7.2837F, 5.5311F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134)
				.addBox(33.6946F, -15.4349F, -93.1358F, 5.1237F, 7.2837F, 3.6111F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(12.0946F, -15.4349F, -93.1358F, 5.1237F, 7.2837F, 3.6111F, new CubeDeformation(0.0F)).texOffs(165, 171).mirror()
				.addBox(1.7746F, -15.4349F, -83.2958F, 47.1237F, 7.2837F, 4.3311F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5582F, 0.0F, -6.7237F));
		PartDefinition bone73_r1 = bone73.addOrReplaceChild("bone73_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-2.3362F, -12.7348F, -4.417F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1433F, -12.3001F, -74.3419F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone73_r2 = bone73.addOrReplaceChild("bone73_r2", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4838F, -30.4837F, -4.9674F, 2.4837F, 34.0837F, 9.8511F, new CubeDeformation(0.0F)).texOffs(140, 134).mirror()
				.addBox(51.6295F, -30.4837F, -4.9674F, 2.4837F, 35.2837F, 9.8511F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4149F, -12.3001F, -67.6182F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone73_r3 = bone73.addOrReplaceChild("bone73_r3", CubeListBuilder.create().texOffs(140, 134).addBox(-0.5505F, -12.7348F, -4.8199F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.2808F, -12.3001F, -93.4738F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone73_r4 = bone73.addOrReplaceChild("bone73_r4", CubeListBuilder.create().texOffs(140, 134).addBox(-0.4936F, -12.7348F, -4.6825F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.3828F, -12.3001F, -90.5954F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone73_r5 = bone73.addOrReplaceChild("bone73_r5", CubeListBuilder.create().texOffs(140, 134).addBox(-0.403F, -12.7348F, -4.5645F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.5318F, -12.3001F, -86.2358F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone73_r6 = bone73.addOrReplaceChild("bone73_r6", CubeListBuilder.create().texOffs(140, 134).addBox(-0.285F, -12.7348F, -4.4739F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.3771F, -12.3001F, -80.692F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone73_r7 = bone73.addOrReplaceChild("bone73_r7", CubeListBuilder.create().texOffs(140, 134).addBox(-0.1475F, -12.7348F, -4.417F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.6565F, -12.3001F, -74.3419F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone73_r8 = bone73.addOrReplaceChild("bone73_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-1.9138F, -12.7348F, -4.9674F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.158F, -12.3001F, -94.6749F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone73_r9 = bone73.addOrReplaceChild("bone73_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-1.9332F, -12.7348F, -4.8199F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.519F, -12.3001F, -93.4738F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone73_r10 = bone73.addOrReplaceChild("bone73_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-1.9902F, -12.7348F, -4.6825F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.417F, -12.3001F, -90.5954F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone73_r11 = bone73.addOrReplaceChild("bone73_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-2.0807F, -12.7348F, -4.5645F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2679F, -12.3001F, -86.2358F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone73_r12 = bone73.addOrReplaceChild("bone73_r12", CubeListBuilder.create().texOffs(140, 134).addBox(-2.1988F, -12.7348F, -4.4739F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4227F, -12.3001F, -80.692F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone74 = bone72.addOrReplaceChild("bone74", CubeListBuilder.create(), PartPose.offset(0.5582F, -12.0F, -6.7237F));
		PartDefinition bone74_r1 = bone74.addOrReplaceChild("bone74_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.8562F, -7.9348F, -3.937F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1433F, -12.3001F, -74.3419F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone74_r2 = bone74.addOrReplaceChild("bone74_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5505F, -7.9348F, -4.3399F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.2808F, -12.3001F, -93.4738F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone74_r3 = bone74.addOrReplaceChild("bone74_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4936F, -7.9348F, -4.2025F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.3828F, -12.3001F, -90.5954F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone74_r4 = bone74.addOrReplaceChild("bone74_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.403F, -7.9348F, -4.0845F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.5318F, -12.3001F, -86.2358F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone74_r5 = bone74.addOrReplaceChild("bone74_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.285F, -7.9348F, -3.9939F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.3771F, -12.3001F, -80.692F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone74_r6 = bone74.addOrReplaceChild("bone74_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1475F, -7.9348F, -3.937F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.6565F, -12.3001F, -74.3419F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone74_r7 = bone74.addOrReplaceChild("bone74_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4338F, -7.9348F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.158F, -12.3001F, -94.6749F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone74_r8 = bone74.addOrReplaceChild("bone74_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4532F, -7.9348F, -4.3399F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.519F, -12.3001F, -93.4738F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone74_r9 = bone74.addOrReplaceChild("bone74_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5102F, -7.9348F, -4.2025F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.417F, -12.3001F, -90.5954F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone74_r10 = bone74.addOrReplaceChild("bone74_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6007F, -7.9348F, -4.0845F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2679F, -12.3001F, -86.2358F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone74_r11 = bone74.addOrReplaceChild("bone74_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7188F, -7.9348F, -3.9939F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4227F, -12.3001F, -80.692F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone75 = frontkutiup.addOrReplaceChild("bone75", CubeListBuilder.create(), PartPose.offsetAndRotation(14.3946F, 13.1582F, 77.6986F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bone76 = bone75.addOrReplaceChild("bone76",
				CubeListBuilder.create().texOffs(140, 134).mirror().addBox(51.2146F, -55.1525F, -98.9537F, 2.4837F, 8.8837F, 9.8511F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror()
						.addBox(-1.1054F, -55.8688F, -98.9537F, 52.8837F, 0.0F, 10.8111F, new CubeDeformation(0.0F)).mirror(false).texOffs(165, 171).mirror().addBox(-0.6254F, -55.8688F, -106.1537F, 52.4037F, 0.0F, 7.4511F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(140, 134).mirror().addBox(4.1746F, -55.8688F, -113.8337F, 42.3237F, 0.0F, 3.6111F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror()
						.addBox(7.7746F, -55.8688F, -117.1937F, 35.3637F, 0.0F, 3.6111F, new CubeDeformation(0.0F)).mirror(false).texOffs(140, 134).mirror().addBox(16.8946F, -55.8688F, -121.9937F, 17.1237F, 0.0F, 5.5311F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(140, 134).addBox(33.6946F, -55.8688F, -120.0737F, 5.1237F, 0.0F, 3.6111F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(12.0946F, -55.8688F, -120.0737F, 5.1237F, 0.0F, 3.6111F, new CubeDeformation(0.0F)).texOffs(165, 171).mirror().addBox(1.7746F, -55.8688F, -110.2337F, 47.1237F, 0.0F, 4.3311F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(140, 134).addBox(-2.8986F, -55.1525F, -98.9537F, 2.4837F, 8.8837F, 9.8511F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5582F, 0.0F, -6.7237F));
		PartDefinition bone76_r1 = bone76.addOrReplaceChild("bone76_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4837F, 3.2F, -4.9674F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1433F, -58.3525F, -100.7099F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone76_r2 = bone76.addOrReplaceChild("bone76_r2", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, -16.8F, -4.9674F, 2.4837F, 28.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.2808F, -58.3525F, -119.8418F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone76_r3 = bone76.addOrReplaceChild("bone76_r3", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 1.2F, -4.9674F, 2.4837F, 10.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.3828F, -58.3525F, -116.9634F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone76_r4 = bone76.addOrReplaceChild("bone76_r4", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 3.2F, -4.9674F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.5318F, -58.3525F, -112.6038F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone76_r5 = bone76.addOrReplaceChild("bone76_r5", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 3.2F, -4.9674F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.3771F, -58.3525F, -107.06F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone76_r6 = bone76.addOrReplaceChild("bone76_r6", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 3.2F, -4.9674F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.6565F, -58.3525F, -100.7099F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone76_r7 = bone76.addOrReplaceChild("bone76_r7", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4837F, -16.8F, -4.9674F, 2.4837F, 28.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.158F, -58.3525F, -121.0429F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone76_r8 = bone76.addOrReplaceChild("bone76_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4837F, -16.8F, -4.9674F, 2.4837F, 28.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.519F, -58.3525F, -119.8418F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone76_r9 = bone76.addOrReplaceChild("bone76_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4838F, 1.2F, -4.9674F, 2.4837F, 10.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.417F, -58.3525F, -116.9634F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone76_r10 = bone76.addOrReplaceChild("bone76_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4837F, 3.2F, -4.9674F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2679F, -58.3525F, -112.6038F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone76_r11 = bone76.addOrReplaceChild("bone76_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4838F, 3.2F, -4.9674F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4227F, -58.3525F, -107.06F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone77 = bone75.addOrReplaceChild("bone77", CubeListBuilder.create(), PartPose.offset(0.5582F, 12.0F, -6.7237F));
		PartDefinition bone77_r1 = bone77.addOrReplaceChild("bone77_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0037F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1433F, -58.3525F, -100.7099F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone77_r2 = bone77.addOrReplaceChild("bone77_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.2808F, -58.3525F, -119.8418F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone77_r3 = bone77.addOrReplaceChild("bone77_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.3828F, -58.3525F, -116.9634F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone77_r4 = bone77.addOrReplaceChild("bone77_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.5318F, -58.3525F, -112.6038F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone77_r5 = bone77.addOrReplaceChild("bone77_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.3771F, -58.3525F, -107.06F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone77_r6 = bone77.addOrReplaceChild("bone77_r6", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.6565F, -58.3525F, -100.7099F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone77_r7 = bone77.addOrReplaceChild("bone77_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0037F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.158F, -58.3525F, -121.0429F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone77_r8 = bone77.addOrReplaceChild("bone77_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0037F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.519F, -58.3525F, -119.8418F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone77_r9 = bone77.addOrReplaceChild("bone77_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0038F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.417F, -58.3525F, -116.9634F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone77_r10 = bone77.addOrReplaceChild("bone77_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0037F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2679F, -58.3525F, -112.6038F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone77_r11 = bone77.addOrReplaceChild("bone77_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0038F, 0.0F, -4.4874F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4227F, -58.3525F, -107.06F, 0.0F, -0.5236F, 0.0F));
		PartDefinition backkutiup = kuti.addOrReplaceChild("backkutiup", CubeListBuilder.create(), PartPose.offset(-8.0F, -136.0F, 80.0F));
		PartDefinition bone78 = backkutiup.addOrReplaceChild("bone78", CubeListBuilder.create(), PartPose.offsetAndRotation(14.3946F, -17.1582F, -60.0986F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone79 = bone78.addOrReplaceChild("bone79",
				CubeListBuilder.create().texOffs(165, 171).addBox(-1.1054F, -15.4349F, 62.1646F, 52.8837F, 7.2837F, 9.8511F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(-0.6254F, -15.4349F, 71.7646F, 52.4037F, 7.2837F, 7.4511F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(4.1746F, -15.4349F, 83.2846F, 42.3237F, 7.2837F, 3.6111F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(7.7746F, -15.4349F, 86.6446F, 35.3637F, 7.2837F, 3.6111F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(16.8946F, -15.4349F, 89.5246F, 17.1237F, 7.2837F, 5.5311F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(33.6946F, -15.4349F, 89.5246F, 5.1237F, 7.2837F, 3.6111F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(12.0946F, -15.4349F, 89.5246F, 5.1237F, 7.2837F, 3.6111F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(1.7746F, -15.4349F, 78.9646F, 47.1237F, 7.2837F, 4.3311F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5582F, 0.0F, 6.7237F));
		PartDefinition bone79_r1 = bone79.addOrReplaceChild("bone79_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-2.3362F, -12.7348F, -3.0342F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1433F, -12.3001F, 74.3419F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone79_r2 = bone79.addOrReplaceChild("bone79_r2", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4838F, -30.4837F, -4.8838F, 2.4837F, 34.0837F, 9.8511F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(51.6295F,
				-30.4837F, -4.8838F, 2.4837F, 35.2837F, 9.8511F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4149F, -12.3001F, 67.6182F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone79_r3 = bone79.addOrReplaceChild("bone79_r3", CubeListBuilder.create().texOffs(140, 134).addBox(-0.5505F, -12.7348F, -2.6312F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.2808F, -12.3001F, 93.4738F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone79_r4 = bone79.addOrReplaceChild("bone79_r4", CubeListBuilder.create().texOffs(140, 134).addBox(-0.4936F, -12.7348F, -2.7686F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.3828F, -12.3001F, 90.5954F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone79_r5 = bone79.addOrReplaceChild("bone79_r5", CubeListBuilder.create().texOffs(140, 134).addBox(-0.403F, -12.7348F, -2.8866F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.5318F, -12.3001F, 86.2358F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone79_r6 = bone79.addOrReplaceChild("bone79_r6", CubeListBuilder.create().texOffs(140, 134).addBox(-0.285F, -12.7348F, -2.9773F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.3771F, -12.3001F, 80.692F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone79_r7 = bone79.addOrReplaceChild("bone79_r7", CubeListBuilder.create().texOffs(140, 134).addBox(-0.1475F, -12.7348F, -3.0342F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.6565F, -12.3001F, 74.3419F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone79_r8 = bone79.addOrReplaceChild("bone79_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-1.9138F, -12.7348F, -2.4838F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.158F, -12.3001F, 94.6749F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone79_r9 = bone79.addOrReplaceChild("bone79_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-1.9332F, -12.7348F, -2.6312F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.519F, -12.3001F, 93.4738F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone79_r10 = bone79.addOrReplaceChild("bone79_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-1.9902F, -12.7348F, -2.7686F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.417F, -12.3001F, 90.5954F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone79_r11 = bone79.addOrReplaceChild("bone79_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-2.0807F, -12.7348F, -2.8866F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2679F, -12.3001F, 86.2358F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone79_r12 = bone79.addOrReplaceChild("bone79_r12", CubeListBuilder.create().texOffs(140, 134).addBox(-2.1988F, -12.7348F, -2.9773F, 2.4837F, 16.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4227F, -12.3001F, 80.692F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone80 = bone78.addOrReplaceChild("bone80", CubeListBuilder.create(), PartPose.offset(0.5582F, -12.0F, 6.7237F));
		PartDefinition bone80_r1 = bone80.addOrReplaceChild("bone80_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.8562F, -7.9348F, -2.5542F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1433F, -12.3001F, 74.3419F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone80_r2 = bone80.addOrReplaceChild("bone80_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5505F, -7.9348F, -2.1512F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.2808F, -12.3001F, 93.4738F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone80_r3 = bone80.addOrReplaceChild("bone80_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4936F, -7.9348F, -2.2886F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.3828F, -12.3001F, 90.5954F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone80_r4 = bone80.addOrReplaceChild("bone80_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.403F, -7.9348F, -2.4066F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.5318F, -12.3001F, 86.2358F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone80_r5 = bone80.addOrReplaceChild("bone80_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.285F, -7.9348F, -2.4973F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.3771F, -12.3001F, 80.692F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone80_r6 = bone80.addOrReplaceChild("bone80_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.1475F, -7.9348F, -2.5542F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.6565F, -12.3001F, 74.3419F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone80_r7 = bone80.addOrReplaceChild("bone80_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4338F, -7.9348F, -2.0038F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.158F, -12.3001F, 94.6749F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone80_r8 = bone80.addOrReplaceChild("bone80_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.4532F, -7.9348F, -2.1512F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.519F, -12.3001F, 93.4738F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone80_r9 = bone80.addOrReplaceChild("bone80_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5102F, -7.9348F, -2.2886F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.417F, -12.3001F, 90.5954F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone80_r10 = bone80.addOrReplaceChild("bone80_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6007F, -7.9348F, -2.4066F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2679F, -12.3001F, 86.2358F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone80_r11 = bone80.addOrReplaceChild("bone80_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7188F, -7.9348F, -2.4973F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4227F, -12.3001F, 80.692F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone81 = backkutiup.addOrReplaceChild("bone81", CubeListBuilder.create(), PartPose.offsetAndRotation(14.3946F, 13.1582F, -77.6986F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone82 = bone81.addOrReplaceChild("bone82",
				CubeListBuilder.create().texOffs(140, 134).addBox(51.2146F, -55.1525F, 89.1026F, 2.4837F, 8.8837F, 9.8511F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(-1.1054F, -55.8688F, 88.1426F, 52.8837F, 0.0F, 10.8111F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(-0.6254F, -55.8688F, 98.7026F, 52.4037F, 0.0F, 7.4511F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(4.1746F, -55.8688F, 110.2226F, 42.3237F, 0.0F, 3.6111F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(7.7746F, -55.8688F, 113.5826F, 35.3637F, 0.0F, 3.6111F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(16.8946F, -55.8688F, 116.4626F, 17.1237F, 0.0F, 5.5311F, new CubeDeformation(0.0F)).texOffs(140, 134).addBox(33.6946F, -55.8688F, 116.4626F, 5.1237F, 0.0F, 3.6111F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(12.0946F, -55.8688F, 116.4626F, 5.1237F, 0.0F, 3.6111F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(1.7746F, -55.8688F, 105.9026F, 47.1237F, 0.0F, 4.3311F, new CubeDeformation(0.0F)).texOffs(140, 134)
						.addBox(-2.8986F, -55.1525F, 89.1026F, 2.4837F, 8.8837F, 9.8511F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5582F, 0.0F, 6.7237F));
		PartDefinition bone82_r1 = bone82.addOrReplaceChild("bone82_r1", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4837F, 3.2F, -2.4837F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1433F, -58.3525F, 100.7099F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone82_r2 = bone82.addOrReplaceChild("bone82_r2", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, -16.8F, -2.4837F, 2.4837F, 28.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.2808F, -58.3525F, 119.8418F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone82_r3 = bone82.addOrReplaceChild("bone82_r3", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 1.2F, -2.4837F, 2.4837F, 10.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.3828F, -58.3525F, 116.9634F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone82_r4 = bone82.addOrReplaceChild("bone82_r4", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 3.2F, -2.4838F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.5318F, -58.3525F, 112.6038F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone82_r5 = bone82.addOrReplaceChild("bone82_r5", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 3.2F, -2.4837F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.3771F, -58.3525F, 107.06F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone82_r6 = bone82.addOrReplaceChild("bone82_r6", CubeListBuilder.create().texOffs(140, 134).addBox(0.0F, 3.2F, -2.4837F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.6565F, -58.3525F, 100.7099F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone82_r7 = bone82.addOrReplaceChild("bone82_r7", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4837F, -16.8F, -2.4837F, 2.4837F, 28.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.158F, -58.3525F, 121.0429F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone82_r8 = bone82.addOrReplaceChild("bone82_r8", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4837F, -16.8F, -2.4837F, 2.4837F, 28.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.519F, -58.3525F, 119.8418F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone82_r9 = bone82.addOrReplaceChild("bone82_r9", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4838F, 1.2F, -2.4837F, 2.4837F, 10.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.417F, -58.3525F, 116.9634F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone82_r10 = bone82.addOrReplaceChild("bone82_r10", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4837F, 3.2F, -2.4838F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2679F, -58.3525F, 112.6038F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone82_r11 = bone82.addOrReplaceChild("bone82_r11", CubeListBuilder.create().texOffs(140, 134).addBox(-2.4838F, 3.2F, -2.4837F, 2.4837F, 8.8837F, 7.4511F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4227F, -58.3525F, 107.06F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone83 = bone81.addOrReplaceChild("bone83", CubeListBuilder.create(), PartPose.offset(0.5582F, 12.0F, 6.7237F));
		PartDefinition bone83_r1 = bone83.addOrReplaceChild("bone83_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0037F, 0.0F, -2.0037F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1433F, -58.3525F, 100.7099F, 0.0F, 0.2618F, 0.0F));
		PartDefinition bone83_r2 = bone83.addOrReplaceChild("bone83_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -2.0037F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.2808F, -58.3525F, 119.8418F, 0.0F, -1.309F, 0.0F));
		PartDefinition bone83_r3 = bone83.addOrReplaceChild("bone83_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -2.0037F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(39.3828F, -58.3525F, 116.9634F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone83_r4 = bone83.addOrReplaceChild("bone83_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -2.0038F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.5318F, -58.3525F, 112.6038F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone83_r5 = bone83.addOrReplaceChild("bone83_r5", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -2.0037F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.3771F, -58.3525F, 107.06F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bone83_r6 = bone83.addOrReplaceChild("bone83_r6", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -2.0037F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.6565F, -58.3525F, 100.7099F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone83_r7 = bone83.addOrReplaceChild("bone83_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0037F, 0.0F, -2.0037F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.158F, -58.3525F, 121.0429F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone83_r8 = bone83.addOrReplaceChild("bone83_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0037F, 0.0F, -2.0037F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.519F, -58.3525F, 119.8418F, 0.0F, 1.309F, 0.0F));
		PartDefinition bone83_r9 = bone83.addOrReplaceChild("bone83_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0038F, 0.0F, -2.0037F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.417F, -58.3525F, 116.9634F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bone83_r10 = bone83.addOrReplaceChild("bone83_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0037F, 0.0F, -2.0038F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2679F, -58.3525F, 112.6038F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone83_r11 = bone83.addOrReplaceChild("bone83_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0038F, 0.0F, -2.0037F, 2.0037F, 7.2837F, 6.4911F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4227F, -58.3525F, 107.06F, 0.0F, 0.5236F, 0.0F));
		PartDefinition tuno = bone84.addOrReplaceChild("tuno", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lefttuno = tuno.addOrReplaceChild("lefttuno", CubeListBuilder.create(), PartPose.offsetAndRotation(48.0F, -160.0F, -24.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone86 = lefttuno.addOrReplaceChild("bone86", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition bone85 = bone86.addOrReplaceChild("bone85", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone85_r1 = bone85.addOrReplaceChild(
				"bone85_r1", CubeListBuilder.create().texOffs(138, 256).addBox(-10.8F, -15.12F, -2.16F, 30.24F, 17.28F, 21.6F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.48F, -15.12F, -6.48F, 21.6F, 17.28F, 30.24F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-8.64F, -15.12F, -4.32F, 25.92F, 17.28F, 25.92F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5602F, 0.1377F, -0.64F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone87 = bone86.addOrReplaceChild("bone87", CubeListBuilder.create(), PartPose.offset(0.0F, -16.0F, 0.0F));
		PartDefinition bone87_r1 = bone87.addOrReplaceChild("bone87_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-11.348F, -34.0472F, -1.7496F, 24.4944F, 21.1968F, 17.496F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-7.8488F, -34.0472F, -5.2488F, 17.496F, 21.1968F, 24.4944F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-9.5984F, -34.0472F, -3.4992F, 20.9952F, 21.1968F, 20.9952F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5781F, -1.1514F, 1.0016F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone87_r2 = bone87.addOrReplaceChild("bone87_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-11.72F, -19.608F, -1.944F, 27.216F, 23.552F, 19.44F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-7.832F, -19.608F, -5.832F, 19.44F, 23.552F, 27.216F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-9.776F, -19.608F, -3.888F, 23.328F, 23.552F, 23.328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3341F, 0.3768F, 0.224F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone88 = bone86.addOrReplaceChild("bone88", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, -42.0F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition bone88_r1 = bone88.addOrReplaceChild("bone88_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-9.1918F, -27.5782F, -1.4171F, 19.8405F, 17.1694F, 14.1718F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.3575F, -27.5782F, -4.2515F, 14.1718F, 17.1694F, 19.8405F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.7746F, -27.5782F, -2.8343F, 17.0061F, 17.1694F, 17.0061F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.3735F, 0.4691F, 2.3313F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone88_r2 = bone88.addOrReplaceChild("bone88_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-9.4932F, -15.8825F, -1.5746F, 22.045F, 19.0771F, 15.7464F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.3439F, -15.8825F, -4.7239F, 15.7464F, 19.0771F, 22.045F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.9186F, -15.8825F, -3.1493F, 18.8957F, 19.0771F, 18.8957F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5559F, 1.707F, 1.7014F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone89 = bone86.addOrReplaceChild("bone89", CubeListBuilder.create(), PartPose.offsetAndRotation(-39.2F, -42.0F, 0.0F, 0.0F, 0.0F, -1.1345F));
		PartDefinition bone89_r1 = bone89.addOrReplaceChild("bone89_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-7.4454F, -22.3383F, -1.1479F, 16.0708F, 13.9072F, 11.4791F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.1496F, -22.3383F, -3.4437F, 11.4791F, 13.9072F, 16.0708F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-6.2975F, -22.3383F, -2.2958F, 13.775F, 13.9072F, 13.775F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.8752F, 3.1813F, 3.4083F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone89_r2 = bone89.addOrReplaceChild("bone89_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-7.6895F, -12.8649F, -1.2754F, 17.8564F, 15.4525F, 12.7546F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.1386F, -12.8649F, -3.8264F, 12.7546F, 15.4525F, 17.8564F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-6.414F, -12.8649F, -2.5509F, 15.3055F, 15.4525F, 15.3055F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.403F, 4.184F, 2.8982F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone90 = bone86.addOrReplaceChild("bone90", CubeListBuilder.create(), PartPose.offsetAndRotation(-40.4F, -27.2F, 0.0F, 0.0F, 0.0F, -1.7453F));
		PartDefinition bone90_r1 = bone90.addOrReplaceChild("bone90_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-5.9563F, -17.8707F, -0.9183F, 12.8566F, 11.1258F, 9.1833F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.1197F, -17.8707F, -2.755F, 9.1833F, 11.1258F, 12.8566F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.038F, -17.8707F, -1.8366F, 11.02F, 11.1258F, 11.02F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(40.1656F, 1.7266F, 4.3266F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone90_r2 = bone90.addOrReplaceChild("bone90_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-6.1516F, -10.2918F, -1.0204F, 14.2851F, 12.362F, 10.2037F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.1108F, -10.2918F, -3.0611F, 10.2037F, 12.362F, 14.2851F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.1312F, -10.2918F, -2.0408F, 12.2444F, 12.362F, 12.2444F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(38.9878F, 2.5287F, 3.9186F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone91 = bone86.addOrReplaceChild("bone91", CubeListBuilder.create(), PartPose.offsetAndRotation(-24.4F, -23.2F, 0.0F, 0.0F, 0.0F, -2.2253F));
		PartDefinition bone91_r1 = bone91.addOrReplaceChild("bone91_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-4.7651F, -14.2966F, -0.7347F, 10.2853F, 8.9006F, 7.3466F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.2958F, -14.2966F, -2.204F, 7.3466F, 8.9006F, 10.2853F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.0304F, -14.2966F, -1.4694F, 8.816F, 8.9006F, 8.816F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.8407F, -5.7546F, 5.0614F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone91_r2 = bone91.addOrReplaceChild("bone91_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-4.9213F, -8.2335F, -0.8162F, 11.4281F, 9.8896F, 8.163F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.2887F, -8.2335F, -2.4489F, 8.163F, 9.8896F, 11.4281F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.105F, -8.2335F, -1.6326F, 9.7955F, 9.8896F, 9.7955F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(49.8985F, -5.113F, 4.7348F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone92 = bone86.addOrReplaceChild("bone92", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.8F, -31.2F, 0.0F, 0.0F, 0.0F, -2.4871F));
		PartDefinition bone92_r1 = bone92.addOrReplaceChild("bone92_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-3.1449F, -9.4358F, -0.4849F, 6.7883F, 5.8744F, 4.8488F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.1751F, -9.4358F, -1.4546F, 4.8488F, 5.8744F, 6.7883F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-2.66F, -9.4358F, -0.9698F, 5.8186F, 5.8744F, 5.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(56.4306F, -20.4018F, 6.0605F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone92_r2 = bone92.addOrReplaceChild("bone92_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-3.2481F, -5.4341F, -0.5387F, 7.5426F, 6.5271F, 5.3875F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.1706F, -5.4341F, -1.6162F, 5.3875F, 6.5271F, 7.5426F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-2.7093F, -5.4341F, -1.0775F, 6.465F, 6.5271F, 6.465F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(55.8088F, -19.9783F, 5.845F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone102 = lefttuno.addOrReplaceChild("bone102", CubeListBuilder.create(), PartPose.offsetAndRotation(-80.0F, 0.0F, 40.0F, 0.0F, 0.0F, 0.7418F));
		PartDefinition bone103 = bone102.addOrReplaceChild("bone103", CubeListBuilder.create(), PartPose.offset(-9.6F, 32.0F, 4.8F));
		PartDefinition bone103_r1 = bone103.addOrReplaceChild("bone103_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-8.64F, -12.096F, -1.728F, 24.192F, 13.824F, 17.28F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.184F, -12.096F, -5.184F, 17.28F, 13.824F, 24.192F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-6.912F, -12.096F, -3.456F, 20.736F, 13.824F, 20.736F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.5553F, -40.7475F, -3.712F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone104 = bone102.addOrReplaceChild("bone104", CubeListBuilder.create(), PartPose.offset(-9.6F, 19.2F, 4.8F));
		PartDefinition bone104_r1 = bone104.addOrReplaceChild("bone104_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-9.0784F, -27.2378F, -1.3997F, 19.5955F, 16.9574F, 13.9968F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.279F, -27.2378F, -4.199F, 13.9968F, 16.9574F, 19.5955F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.6787F, -27.2378F, -2.7994F, 16.7962F, 16.9574F, 16.7962F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.8658F, -41.7788F, -2.3987F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone104_r2 = bone104.addOrReplaceChild("bone104_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-9.376F, -15.6864F, -1.5552F, 21.7728F, 18.8416F, 15.552F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.2656F, -15.6864F, -4.6656F, 15.552F, 18.8416F, 21.7728F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.8208F, -15.6864F, -3.1104F, 18.6624F, 18.8416F, 18.6624F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0707F, -40.5562F, -3.0208F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone105 = bone102.addOrReplaceChild("bone105", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, 0.4F, 4.8F, 0.0F, 0.0F, -0.5672F));
		PartDefinition bone105_r1 = bone105.addOrReplaceChild("bone105_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-7.3535F, -22.0626F, -1.1338F, 15.8724F, 13.7355F, 11.3374F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.086F, -22.0626F, -3.4012F, 11.3374F, 13.7355F, 15.8724F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-6.2198F, -22.0626F, -2.2675F, 13.6049F, 13.7355F, 13.6049F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.1022F, -40.4824F, -1.335F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone105_r2 = bone105.addOrReplaceChild("bone105_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-7.5946F, -12.706F, -1.2597F, 17.636F, 15.2617F, 12.5971F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.0751F, -12.706F, -3.7791F, 12.5971F, 15.2617F, 17.636F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-6.3348F, -12.706F, -2.5194F, 15.1166F, 15.2617F, 15.1166F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.6482F, -39.4921F, -1.8389F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone106 = bone102.addOrReplaceChild("bone106", CubeListBuilder.create(), PartPose.offsetAndRotation(7.04F, -9.6F, 4.8F, 0.0F, 0.0F, -1.1345F));
		PartDefinition bone106_r1 = bone106.addOrReplaceChild("bone106_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-5.9563F, -17.8706F, -0.9183F, 12.8566F, 11.1258F, 9.1833F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.1197F, -17.8706F, -2.755F, 9.1833F, 11.1258F, 12.8566F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.038F, -17.8706F, -1.8366F, 11.02F, 11.1258F, 11.02F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(38.7036F, -38.3126F, -0.4734F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone106_r2 = bone106.addOrReplaceChild("bone106_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-6.1516F, -10.2918F, -1.0204F, 14.2851F, 12.362F, 10.2037F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.1108F, -10.2918F, -3.0611F, 10.2037F, 12.362F, 14.2851F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.1312F, -10.2918F, -2.0408F, 12.2444F, 12.362F, 12.2444F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(37.5258F, -37.5106F, -0.8814F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone107 = bone102.addOrReplaceChild("bone107", CubeListBuilder.create(), PartPose.offsetAndRotation(20.08F, -20.56F, 4.8F, 0.0F, 0.0F, -1.7453F));
		PartDefinition bone107_r1 = bone107.addOrReplaceChild("bone107_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-4.7651F, -14.2966F, -0.7347F, 10.2853F, 8.9006F, 7.3466F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.2958F, -14.2966F, -2.204F, 7.3466F, 8.9006F, 10.2853F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.0304F, -14.2966F, -1.4694F, 8.816F, 8.9006F, 8.816F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.1359F, -39.4764F, 0.2614F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone107_r2 = bone107.addOrReplaceChild("bone107_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-4.9213F, -8.2334F, -0.8162F, 11.4281F, 9.8896F, 8.163F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.2887F, -8.2334F, -2.4489F, 8.163F, 9.8896F, 11.4281F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.105F, -8.2334F, -1.6326F, 9.7955F, 9.8896F, 9.7955F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(49.1937F, -38.8347F, -0.0652F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone108 = bone102.addOrReplaceChild("bone108", CubeListBuilder.create(), PartPose.offsetAndRotation(32.88F, -38.56F, 4.8F, 0.0F, 0.0F, -2.2253F));
		PartDefinition bone108_r1 = bone108.addOrReplaceChild("bone108_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-3.8121F, -11.4372F, -0.5877F, 8.2282F, 7.1205F, 5.8773F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.6366F, -11.4372F, -1.7631F, 5.8773F, 7.1205F, 8.2282F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-3.2244F, -11.4372F, -1.1754F, 7.0528F, 7.1205F, 7.0528F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(58.676F, -45.4614F, 0.849F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone108_r2 = bone108.addOrReplaceChild("bone108_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-3.937F, -6.5868F, -0.653F, 9.1425F, 7.9117F, 6.5303F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.631F, -6.5868F, -1.9591F, 6.5303F, 7.9117F, 9.1425F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-3.284F, -6.5868F, -1.3061F, 7.8364F, 7.9117F, 7.8364F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(57.9222F, -44.9481F, 0.5878F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone109 = bone102.addOrReplaceChild("bone109", CubeListBuilder.create(), PartPose.offsetAndRotation(39.76F, -54.96F, 4.8F, 0.0F, 0.0F, -2.4871F));
		PartDefinition bone109_r1 = bone109.addOrReplaceChild("bone109_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-2.5159F, -7.5486F, -0.3879F, 5.4306F, 4.6995F, 3.879F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-1.7401F, -7.5486F, -1.1637F, 3.879F, 4.6995F, 5.4306F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-2.128F, -7.5486F, -0.7758F, 4.6548F, 4.6995F, 4.6548F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(63.1479F, -57.1792F, 1.6484F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone109_r2 = bone109.addOrReplaceChild("bone109_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-2.5985F, -4.3472F, -0.431F, 6.0341F, 5.2217F, 4.31F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-1.7365F, -4.3472F, -1.293F, 4.31F, 5.2217F, 6.0341F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-2.1674F, -4.3472F, -0.862F, 5.172F, 5.2217F, 5.172F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(62.6505F, -56.8404F, 1.476F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone93 = lefttuno.addOrReplaceChild("bone93", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 24.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone94 = bone93.addOrReplaceChild("bone94", CubeListBuilder.create(), PartPose.offset(-4.8F, 16.0F, 0.0F));
		PartDefinition bone94_r1 = bone94.addOrReplaceChild("bone94_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-9.72F, -13.608F, -1.944F, 27.216F, 15.552F, 19.44F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.832F, -13.608F, -5.832F, 19.44F, 15.552F, 27.216F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.776F, -13.608F, -3.888F, 23.328F, 15.552F, 23.328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.4975F, -20.3049F, 0.224F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone95 = bone93.addOrReplaceChild("bone95", CubeListBuilder.create(), PartPose.offset(-4.8F, 1.6F, 0.0F));
		PartDefinition bone95_r1 = bone95.addOrReplaceChild("bone95_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-10.2132F, -30.6425F, -1.5746F, 22.045F, 19.0771F, 15.7464F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-7.0639F, -30.6425F, -4.7239F, 15.7464F, 19.0771F, 22.045F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-8.6386F, -30.6425F, -3.1493F, 18.8957F, 19.0771F, 18.8957F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.222F, -21.4651F, 1.7014F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone95_r2 = bone95.addOrReplaceChild("bone95_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-10.548F, -17.6472F, -1.7496F, 24.4944F, 21.1968F, 17.496F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-7.0488F, -17.6472F, -5.2488F, 17.496F, 21.1968F, 24.4944F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-8.7984F, -17.6472F, -3.4992F, 20.9952F, 21.1968F, 20.9952F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2024F, -20.0898F, 1.0016F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone97 = bone93.addOrReplaceChild("bone97", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.2F, -20.6F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition bone97_r1 = bone97.addOrReplaceChild("bone97_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-8.2727F, -24.8204F, -1.2754F, 17.8564F, 15.4525F, 12.7546F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.7218F, -24.8204F, -3.8264F, 12.7546F, 15.4525F, 17.8564F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-6.9973F, -24.8204F, -2.5509F, 15.3055F, 15.4525F, 15.3055F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.2379F, -20.0066F, 2.8982F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone97_r2 = bone97.addOrReplaceChild("bone97_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-8.5439F, -14.2942F, -1.4171F, 19.8405F, 17.1694F, 14.1718F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.7095F, -14.2942F, -4.2515F, 14.1718F, 17.1694F, 19.8405F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.1267F, -14.2942F, -2.8343F, 17.0061F, 17.1694F, 17.0061F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.6021F, -18.8926F, 2.3313F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone98 = bone93.addOrReplaceChild("bone98", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.88F, -25.8F, 0.0F, 0.0F, 0.0F, -1.1345F));
		PartDefinition bone98_r1 = bone98.addOrReplaceChild("bone98_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-6.7009F, -20.1045F, -1.0331F, 14.4637F, 12.5165F, 10.3312F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.6346F, -20.1045F, -3.0994F, 10.3312F, 12.5165F, 14.4637F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.6678F, -20.1045F, -2.0662F, 12.3974F, 12.5165F, 12.3974F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.2894F, -17.5657F, 3.8675F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone98_r2 = bone98.addOrReplaceChild("bone98_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-6.9206F, -11.5783F, -1.1479F, 16.0708F, 13.9072F, 11.4791F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.6247F, -11.5783F, -3.4437F, 11.4791F, 13.9072F, 16.0708F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.7726F, -11.5783F, -2.2958F, 13.775F, 13.9072F, 13.775F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(30.9644F, -16.6633F, 3.4083F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone99 = bone93.addOrReplaceChild("bone99", CubeListBuilder.create(), PartPose.offsetAndRotation(-27.16F, -17.28F, 0.0F, 0.0F, 0.0F, -1.3963F));
		PartDefinition bone99_r1 = bone99.addOrReplaceChild("bone99_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-5.3607F, -16.0836F, -0.8265F, 11.571F, 10.0132F, 8.265F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.7077F, -16.0836F, -2.4794F, 8.265F, 10.0132F, 11.571F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.5342F, -16.0836F, -1.653F, 9.918F, 10.0132F, 9.918F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(45.1507F, -18.8749F, 4.694F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone99_r2 = bone99.addOrReplaceChild("bone99_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-5.5364F, -9.2626F, -0.9183F, 12.8566F, 11.1258F, 9.1833F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.6998F, -9.2626F, -2.755F, 9.1833F, 11.1258F, 12.8566F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.6181F, -9.2626F, -1.8366F, 11.02F, 11.1258F, 11.02F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.0907F, -18.153F, 4.3266F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone100 = bone93.addOrReplaceChild("bone100", CubeListBuilder.create(), PartPose.offsetAndRotation(-22.76F, -10.48F, 0.0F, 0.0F, 0.0F, -1.6581F));
		PartDefinition bone100_r1 = bone100.addOrReplaceChild("bone100_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-4.2886F, -12.8669F, -0.6612F, 9.2568F, 8.0106F, 6.612F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.9662F, -12.8669F, -1.9836F, 6.612F, 8.0106F, 9.2568F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-3.6274F, -12.8669F, -1.3224F, 7.9344F, 8.0106F, 7.9344F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(54.7583F, -25.6081F, 5.3552F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone100_r2 = bone100.addOrReplaceChild("bone100_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-4.4292F, -7.4102F, -0.7347F, 10.2853F, 8.9006F, 7.3466F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.9598F, -7.4102F, -2.204F, 7.3466F, 8.9006F, 10.2853F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-3.6945F, -7.4102F, -1.4694F, 8.816F, 8.9006F, 8.816F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(53.9103F, -25.0306F, 5.0614F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone101 = bone93.addOrReplaceChild("bone101", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.92F, -17.68F, 0.0F, 0.0F, 0.0F, -1.9635F));
		PartDefinition bone101_r1 = bone101.addOrReplaceChild("bone101_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-2.8304F, -8.4922F, -0.4363F, 6.1094F, 5.287F, 4.3639F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-1.9576F, -8.4922F, -1.3091F, 4.3639F, 5.287F, 6.1094F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-2.394F, -8.4922F, -0.8727F, 5.2367F, 5.287F, 5.2367F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(59.7893F, -38.7905F, 6.2544F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone101_r2 = bone101.addOrReplaceChild("bone101_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-2.9232F, -4.8906F, -0.4849F, 6.7883F, 5.8744F, 4.8488F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-1.9534F, -4.8906F, -1.4546F, 4.8488F, 5.8744F, 6.7883F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-2.4383F, -4.8906F, -0.9698F, 5.8186F, 5.8744F, 5.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(59.2296F, -38.4094F, 6.0605F, 0.0F, 0.0F, -0.2618F));
		PartDefinition righttuno = tuno.addOrReplaceChild("righttuno", CubeListBuilder.create(), PartPose.offsetAndRotation(-48.0F, -160.0F, -24.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition bone110 = righttuno.addOrReplaceChild("bone110", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition bone111 = bone110.addOrReplaceChild("bone111", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone111_r1 = bone111.addOrReplaceChild(
				"bone111_r1", CubeListBuilder.create().texOffs(138, 256).addBox(-19.44F, -15.12F, -2.16F, 30.24F, 17.28F, 21.6F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-15.12F, -15.12F, -6.48F, 21.6F, 17.28F, 30.24F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-17.28F, -15.12F, -4.32F, 25.92F, 17.28F, 25.92F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5602F, 0.1377F, -0.64F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone112 = bone110.addOrReplaceChild("bone112", CubeListBuilder.create(), PartPose.offset(0.0F, -16.0F, 0.0F));
		PartDefinition bone112_r1 = bone112.addOrReplaceChild("bone112_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-13.1464F, -34.0472F, -1.7496F, 24.4944F, 21.1968F, 17.496F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-9.6472F, -34.0472F, -5.2488F, 17.496F, 21.1968F, 24.4944F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-11.3968F, -34.0472F, -3.4992F, 20.9952F, 21.1968F, 20.9952F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5781F, -1.1514F, 1.0016F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone112_r2 = bone112.addOrReplaceChild("bone112_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-15.496F, -19.608F, -1.944F, 27.216F, 23.552F, 19.44F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-11.608F, -19.608F, -5.832F, 19.44F, 23.552F, 27.216F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-13.552F, -19.608F, -3.888F, 23.328F, 23.552F, 23.328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3341F, 0.3768F, 0.224F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone113 = bone110.addOrReplaceChild("bone113", CubeListBuilder.create(), PartPose.offsetAndRotation(16.0F, -42.0F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition bone113_r1 = bone113.addOrReplaceChild("bone113_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-10.6486F, -27.5782F, -1.4171F, 19.8405F, 17.1694F, 14.1718F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-7.8142F, -27.5782F, -4.2515F, 14.1718F, 17.1694F, 19.8405F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-9.2314F, -27.5782F, -2.8343F, 17.0061F, 17.1694F, 17.0061F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.3735F, 0.4691F, 2.3313F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone113_r2 = bone113.addOrReplaceChild("bone113_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-12.5518F, -15.8825F, -1.5746F, 22.045F, 19.0771F, 15.7464F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-9.4025F, -15.8825F, -4.7239F, 15.7464F, 19.0771F, 22.045F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-10.9771F, -15.8825F, -3.1493F, 18.8957F, 19.0771F, 18.8957F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5559F, 1.707F, 1.7014F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone114 = bone110.addOrReplaceChild("bone114", CubeListBuilder.create(), PartPose.offsetAndRotation(39.2F, -42.0F, 0.0F, 0.0F, 0.0F, 1.1345F));
		PartDefinition bone114_r1 = bone114.addOrReplaceChild("bone114_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-8.6254F, -22.3383F, -1.1479F, 16.0708F, 13.9072F, 11.4791F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.3295F, -22.3383F, -3.4437F, 11.4791F, 13.9072F, 16.0708F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.4774F, -22.3383F, -2.2958F, 13.775F, 13.9072F, 13.775F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.8752F, 3.1813F, 3.4083F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone114_r2 = bone114.addOrReplaceChild("bone114_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-10.167F, -12.8649F, -1.2754F, 17.8564F, 15.4525F, 12.7546F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-7.616F, -12.8649F, -3.8264F, 12.7546F, 15.4525F, 17.8564F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-8.8914F, -12.8649F, -2.5509F, 15.3055F, 15.4525F, 15.3055F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.403F, 4.184F, 2.8982F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone115 = bone110.addOrReplaceChild("bone115", CubeListBuilder.create(), PartPose.offsetAndRotation(40.4F, -27.2F, 0.0F, 0.0F, 0.0F, 1.7453F));
		PartDefinition bone115_r1 = bone115.addOrReplaceChild("bone115_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-6.9002F, -17.8707F, -0.9183F, 12.8566F, 11.1258F, 9.1833F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.0636F, -17.8707F, -2.755F, 9.1833F, 11.1258F, 12.8566F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.9819F, -17.8707F, -1.8366F, 11.02F, 11.1258F, 11.02F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-40.1656F, 1.7266F, 4.3266F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone115_r2 = bone115.addOrReplaceChild("bone115_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-8.1336F, -10.2918F, -1.0204F, 14.2851F, 12.362F, 10.2037F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.0928F, -10.2918F, -3.0611F, 10.2037F, 12.362F, 14.2851F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.1132F, -10.2918F, -2.0408F, 12.2444F, 12.362F, 12.2444F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-38.9878F, 2.5287F, 3.9186F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone116 = bone110.addOrReplaceChild("bone116", CubeListBuilder.create(), PartPose.offsetAndRotation(24.4F, -23.2F, 0.0F, 0.0F, 0.0F, 2.2253F));
		PartDefinition bone116_r1 = bone116.addOrReplaceChild("bone116_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-5.5202F, -14.2966F, -0.7347F, 10.2853F, 8.9006F, 7.3466F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.0509F, -14.2966F, -2.204F, 7.3466F, 8.9006F, 10.2853F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.7855F, -14.2966F, -1.4694F, 8.816F, 8.9006F, 8.816F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-50.8407F, -5.7546F, 5.0614F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone116_r2 = bone116.addOrReplaceChild("bone116_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-6.5068F, -8.2335F, -0.8162F, 11.4281F, 9.8896F, 8.163F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.8742F, -8.2335F, -2.4489F, 8.163F, 9.8896F, 11.4281F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.6905F, -8.2335F, -1.6326F, 9.7955F, 9.8896F, 9.7955F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-49.8985F, -5.113F, 4.7348F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone117 = bone110.addOrReplaceChild("bone117", CubeListBuilder.create(), PartPose.offsetAndRotation(10.8F, -31.2F, 0.0F, 0.0F, 0.0F, 2.4871F));
		PartDefinition bone117_r1 = bone117.addOrReplaceChild("bone117_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-3.6434F, -9.4358F, -0.4849F, 6.7883F, 5.8744F, 4.8488F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.6736F, -9.4358F, -1.4546F, 4.8488F, 5.8744F, 6.7883F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-3.1585F, -9.4358F, -0.9698F, 5.8186F, 5.8744F, 5.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-56.4306F, -20.4018F, 6.0605F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone117_r2 = bone117.addOrReplaceChild("bone117_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-4.2945F, -5.4341F, -0.5387F, 7.5426F, 6.5271F, 5.3875F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.217F, -5.4341F, -1.6162F, 5.3875F, 6.5271F, 7.5426F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-3.7558F, -5.4341F, -1.0775F, 6.465F, 6.5271F, 6.465F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-55.8088F, -19.9783F, 5.845F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone118 = righttuno.addOrReplaceChild("bone118", CubeListBuilder.create(), PartPose.offsetAndRotation(80.0F, 0.0F, 40.0F, 0.0F, 0.0F, -0.7418F));
		PartDefinition bone119 = bone118.addOrReplaceChild("bone119", CubeListBuilder.create(), PartPose.offset(9.6F, 32.0F, 4.8F));
		PartDefinition bone119_r1 = bone119.addOrReplaceChild("bone119_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-15.552F, -12.096F, -1.728F, 24.192F, 13.824F, 17.28F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-12.096F, -12.096F, -5.184F, 17.28F, 13.824F, 24.192F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-13.824F, -12.096F, -3.456F, 20.736F, 13.824F, 20.736F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.5553F, -40.7475F, -3.712F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone120 = bone118.addOrReplaceChild("bone120", CubeListBuilder.create(), PartPose.offset(9.6F, 19.2F, 4.8F));
		PartDefinition bone120_r1 = bone120.addOrReplaceChild("bone120_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-10.5171F, -27.2378F, -1.3997F, 19.5955F, 16.9574F, 13.9968F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-7.7178F, -27.2378F, -4.199F, 13.9968F, 16.9574F, 19.5955F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-9.1174F, -27.2378F, -2.7994F, 16.7962F, 16.9574F, 16.7962F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.8658F, -41.7788F, -2.3987F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone120_r2 = bone120.addOrReplaceChild("bone120_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-12.3968F, -15.6864F, -1.5552F, 21.7728F, 18.8416F, 15.552F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-9.2864F, -15.6864F, -4.6656F, 15.552F, 18.8416F, 21.7728F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-10.8416F, -15.6864F, -3.1104F, 18.6624F, 18.8416F, 18.6624F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0707F, -40.5562F, -3.0208F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone121 = bone118.addOrReplaceChild("bone121", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.6F, 0.4F, 4.8F, 0.0F, 0.0F, 0.5672F));
		PartDefinition bone121_r1 = bone121.addOrReplaceChild("bone121_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-8.5189F, -22.0626F, -1.1338F, 15.8724F, 13.7355F, 11.3374F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.2514F, -22.0626F, -3.4012F, 11.3374F, 13.7355F, 15.8724F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.3851F, -22.0626F, -2.2675F, 13.6049F, 13.7355F, 13.6049F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.1022F, -40.4824F, -1.335F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone121_r2 = bone121.addOrReplaceChild("bone121_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-10.0414F, -12.706F, -1.2597F, 17.636F, 15.2617F, 12.5971F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-7.522F, -12.706F, -3.7791F, 12.5971F, 15.2617F, 17.636F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-8.7817F, -12.706F, -2.5194F, 15.1166F, 15.2617F, 15.1166F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.6482F, -39.4921F, -1.8389F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone122 = bone118.addOrReplaceChild("bone122", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.04F, -9.6F, 4.8F, 0.0F, 0.0F, 1.1345F));
		PartDefinition bone122_r1 = bone122.addOrReplaceChild("bone122_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-6.9002F, -17.8706F, -0.9183F, 12.8566F, 11.1258F, 9.1833F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.0636F, -17.8706F, -2.755F, 9.1833F, 11.1258F, 12.8566F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.9819F, -17.8706F, -1.8366F, 11.02F, 11.1258F, 11.02F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-38.7036F, -38.3126F, -0.4734F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone122_r2 = bone122.addOrReplaceChild("bone122_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-8.1336F, -10.2918F, -1.0204F, 14.2851F, 12.362F, 10.2037F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.0928F, -10.2918F, -3.0611F, 10.2037F, 12.362F, 14.2851F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-7.1132F, -10.2918F, -2.0408F, 12.2444F, 12.362F, 12.2444F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-37.5258F, -37.5106F, -0.8814F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone123 = bone118.addOrReplaceChild("bone123", CubeListBuilder.create(), PartPose.offsetAndRotation(-20.08F, -20.56F, 4.8F, 0.0F, 0.0F, 1.7453F));
		PartDefinition bone123_r1 = bone123.addOrReplaceChild("bone123_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-5.5202F, -14.2966F, -0.7347F, 10.2853F, 8.9006F, 7.3466F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.0509F, -14.2966F, -2.204F, 7.3466F, 8.9006F, 10.2853F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.7855F, -14.2966F, -1.4694F, 8.816F, 8.9006F, 8.816F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-50.1359F, -39.4764F, 0.2614F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone123_r2 = bone123.addOrReplaceChild("bone123_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-6.5068F, -8.2334F, -0.8162F, 11.4281F, 9.8896F, 8.163F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.8742F, -8.2334F, -2.4489F, 8.163F, 9.8896F, 11.4281F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.6905F, -8.2334F, -1.6326F, 9.7955F, 9.8896F, 9.7955F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-49.1937F, -38.8347F, -0.0652F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone124 = bone118.addOrReplaceChild("bone124", CubeListBuilder.create(), PartPose.offsetAndRotation(-32.88F, -38.56F, 4.8F, 0.0F, 0.0F, 2.2253F));
		PartDefinition bone124_r1 = bone124.addOrReplaceChild("bone124_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-4.4162F, -11.4372F, -0.5877F, 8.2282F, 7.1205F, 5.8773F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.2407F, -11.4372F, -1.7631F, 5.8773F, 7.1205F, 8.2282F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-3.8284F, -11.4372F, -1.1754F, 7.0528F, 7.1205F, 7.0528F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-58.676F, -45.4614F, 0.849F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone124_r2 = bone124.addOrReplaceChild("bone124_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-5.2054F, -6.5868F, -0.653F, 9.1425F, 7.9117F, 6.5303F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.8994F, -6.5868F, -1.9591F, 6.5303F, 7.9117F, 9.1425F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.5525F, -6.5868F, -1.3061F, 7.8364F, 7.9117F, 7.8364F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-57.9222F, -44.9481F, 0.5878F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone125 = bone118.addOrReplaceChild("bone125", CubeListBuilder.create(), PartPose.offsetAndRotation(-39.76F, -54.96F, 4.8F, 0.0F, 0.0F, 2.4871F));
		PartDefinition bone125_r1 = bone125.addOrReplaceChild("bone125_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-2.9147F, -7.5486F, -0.3879F, 5.4306F, 4.6995F, 3.879F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.1389F, -7.5486F, -1.1637F, 3.879F, 4.6995F, 5.4306F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-2.5268F, -7.5486F, -0.7758F, 4.6548F, 4.6995F, 4.6548F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-63.1479F, -57.1792F, 1.6484F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone125_r2 = bone125.addOrReplaceChild("bone125_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-3.4356F, -4.3472F, -0.431F, 6.0341F, 5.2217F, 4.31F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.5736F, -4.3472F, -1.293F, 4.31F, 5.2217F, 6.0341F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-3.0046F, -4.3472F, -0.862F, 5.172F, 5.2217F, 5.172F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-62.6505F, -56.8404F, 1.476F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone126 = righttuno.addOrReplaceChild("bone126", CubeListBuilder.create(), PartPose.offsetAndRotation(16.0F, 0.0F, 24.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition bone127 = bone126.addOrReplaceChild("bone127", CubeListBuilder.create(), PartPose.offset(4.8F, 16.0F, 0.0F));
		PartDefinition bone127_r1 = bone127.addOrReplaceChild("bone127_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-17.496F, -13.608F, -1.944F, 27.216F, 15.552F, 19.44F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-13.608F, -13.608F, -5.832F, 19.44F, 15.552F, 27.216F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-15.552F, -13.608F, -3.888F, 23.328F, 15.552F, 23.328F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.4975F, -20.3049F, 0.224F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone128 = bone126.addOrReplaceChild("bone128", CubeListBuilder.create(), PartPose.offset(4.8F, 1.6F, 0.0F));
		PartDefinition bone128_r1 = bone128.addOrReplaceChild("bone128_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-11.8318F, -30.6425F, -1.5746F, 22.045F, 19.0771F, 15.7464F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-8.6825F, -30.6425F, -4.7239F, 15.7464F, 19.0771F, 22.045F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-10.2571F, -30.6425F, -3.1493F, 18.8957F, 19.0771F, 18.8957F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.222F, -21.4651F, 1.7014F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone128_r2 = bone128.addOrReplaceChild("bone128_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-13.9464F, -17.6472F, -1.7496F, 24.4944F, 21.1968F, 17.496F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-10.4472F, -17.6472F, -5.2488F, 17.496F, 21.1968F, 24.4944F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-12.1968F, -17.6472F, -3.4992F, 20.9952F, 21.1968F, 20.9952F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.2024F, -20.0898F, 1.0016F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone129 = bone126.addOrReplaceChild("bone129", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2F, -20.6F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition bone129_r1 = bone129.addOrReplaceChild("bone129_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-9.5837F, -24.8204F, -1.2754F, 17.8564F, 15.4525F, 12.7546F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-7.0328F, -24.8204F, -3.8264F, 12.7546F, 15.4525F, 17.8564F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-8.3082F, -24.8204F, -2.5509F, 15.3055F, 15.4525F, 15.3055F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.2379F, -20.0066F, 2.8982F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone129_r2 = bone129.addOrReplaceChild("bone129_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-11.2966F, -14.2942F, -1.4171F, 19.8405F, 17.1694F, 14.1718F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-8.4622F, -14.2942F, -4.2515F, 14.1718F, 17.1694F, 19.8405F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-9.8794F, -14.2942F, -2.8343F, 17.0061F, 17.1694F, 17.0061F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.6021F, -18.8926F, 2.3313F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone130 = bone126.addOrReplaceChild("bone130", CubeListBuilder.create(), PartPose.offsetAndRotation(16.88F, -25.8F, 0.0F, 0.0F, 0.0F, 1.1345F));
		PartDefinition bone130_r1 = bone130.addOrReplaceChild("bone130_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-7.7628F, -20.1045F, -1.0331F, 14.4637F, 12.5165F, 10.3312F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.6966F, -20.1045F, -3.0994F, 10.3312F, 12.5165F, 14.4637F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-6.7297F, -20.1045F, -2.0662F, 12.3974F, 12.5165F, 12.3974F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.2894F, -17.5657F, 3.8675F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone130_r2 = bone130.addOrReplaceChild("bone130_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-9.1502F, -11.5783F, -1.1479F, 16.0708F, 13.9072F, 11.4791F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-6.8544F, -11.5783F, -3.4437F, 11.4791F, 13.9072F, 16.0708F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-8.0023F, -11.5783F, -2.2958F, 13.775F, 13.9072F, 13.775F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-30.9644F, -16.6633F, 3.4083F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone131 = bone126.addOrReplaceChild("bone131", CubeListBuilder.create(), PartPose.offsetAndRotation(27.16F, -17.28F, 0.0F, 0.0F, 0.0F, 1.3963F));
		PartDefinition bone131_r1 = bone131.addOrReplaceChild("bone131_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-6.2102F, -16.0836F, -0.8265F, 11.571F, 10.0132F, 8.265F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.5573F, -16.0836F, -2.4794F, 8.265F, 10.0132F, 11.571F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.3838F, -16.0836F, -1.653F, 9.918F, 10.0132F, 9.918F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-45.1507F, -18.8749F, 4.694F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone131_r2 = bone131.addOrReplaceChild("bone131_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-7.3202F, -9.2626F, -0.9183F, 12.8566F, 11.1258F, 9.1833F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-5.4835F, -9.2626F, -2.755F, 9.1833F, 11.1258F, 12.8566F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-6.4018F, -9.2626F, -1.8366F, 11.02F, 11.1258F, 11.02F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-44.0907F, -18.153F, 4.3266F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone132 = bone126.addOrReplaceChild("bone132", CubeListBuilder.create(), PartPose.offsetAndRotation(22.76F, -10.48F, 0.0F, 0.0F, 0.0F, 1.6581F));
		PartDefinition bone132_r1 = bone132.addOrReplaceChild("bone132_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-4.9682F, -12.8669F, -0.6612F, 9.2568F, 8.0106F, 6.612F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-3.6458F, -12.8669F, -1.9836F, 6.612F, 8.0106F, 9.2568F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-4.307F, -12.8669F, -1.3224F, 7.9344F, 8.0106F, 7.9344F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-54.7583F, -25.6081F, 5.3552F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone132_r2 = bone132.addOrReplaceChild("bone132_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-5.8562F, -7.4102F, -0.7347F, 10.2853F, 8.9006F, 7.3466F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-4.3868F, -7.4102F, -2.204F, 7.3466F, 8.9006F, 10.2853F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-5.1214F, -7.4102F, -1.4694F, 8.816F, 8.9006F, 8.816F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-53.9103F, -25.0306F, 5.0614F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone133 = bone126.addOrReplaceChild("bone133", CubeListBuilder.create(), PartPose.offsetAndRotation(4.92F, -17.68F, 0.0F, 0.0F, 0.0F, 1.9635F));
		PartDefinition bone133_r1 = bone133.addOrReplaceChild("bone133_r1",
				CubeListBuilder.create().texOffs(138, 256).addBox(-3.279F, -8.4922F, -0.4363F, 6.1094F, 5.287F, 4.3639F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.4062F, -8.4922F, -1.3091F, 4.3639F, 5.287F, 6.1094F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-2.8426F, -8.4922F, -0.8727F, 5.2367F, 5.287F, 5.2367F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-59.7893F, -38.7905F, 6.2544F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone133_r2 = bone133.addOrReplaceChild("bone133_r2",
				CubeListBuilder.create().texOffs(138, 256).addBox(-3.865F, -4.8906F, -0.4849F, 6.7883F, 5.8744F, 4.8488F, new CubeDeformation(0.0F)).texOffs(138, 256)
						.addBox(-2.8954F, -4.8906F, -1.4546F, 4.8488F, 5.8744F, 6.7883F, new CubeDeformation(0.0F)).texOffs(138, 256).addBox(-3.3802F, -4.8906F, -0.9698F, 5.8186F, 5.8744F, 5.8186F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-59.2296F, -38.4094F, 6.0605F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone144 = Fukuma_mizushi.addOrReplaceChild("bone144", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone166 = bone144.addOrReplaceChild("bone166", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
