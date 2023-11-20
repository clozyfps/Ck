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
public class ModelRika<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_rika"), "main");
	public final ModelPart Body;
	public final ModelPart Left_Arm;
	public final ModelPart Right_Arm;
	public final ModelPart Head;

	public ModelRika(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Left_Arm = root.getChild("Left_Arm");
		this.Right_Arm = root.getChild("Right_Arm");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -20.0F, 7.5F, 0.7418F, 0.0F, 0.0F));
		PartDefinition torso_r1 = Body.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -8.5F, -7.0F, 26.0F, 17.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition torso_r2 = Body.addOrReplaceChild("torso_r2", CubeListBuilder.create().texOffs(48, 48).addBox(-10.0F, -2.0F, -4.0F, 20.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition torso_r3 = Body.addOrReplaceChild("torso_r3", CubeListBuilder.create().texOffs(120, 95).addBox(-1.5F, 0.0F, -4.0F, 5.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.7356F, 32.3628F, -28.3451F, -2.1572F, -0.6248F, 2.4197F));
		PartDefinition torso_r4 = Body.addOrReplaceChild("torso_r4", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0173F, 25.3293F, -28.5203F, -0.4555F, -0.6248F, 2.4197F));
		PartDefinition torso_r5 = Body.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.944F, 27.6786F, -29.8944F, -0.9355F, -0.6248F, 2.4197F));
		PartDefinition torso_r6 = Body.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(54, 28).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2301F, 29.3499F, -30.2734F, -1.5027F, -0.6248F, 2.4197F));
		PartDefinition torso_r7 = Body.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(0, 103).addBox(-2.0F, -0.5F, -4.0F, 7.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.7353F, 35.766F, -23.891F, -2.3879F, -0.1603F, 2.9929F));
		PartDefinition torso_r8 = Body.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(92, 90).addBox(-2.0F, -1.5F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.4504F, 39.3135F, -20.0196F, -2.2671F, 0.4937F, -2.6259F));
		PartDefinition torso_r9 = Body.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(0, 56).addBox(-2.0F, -1.5F, -5.5F, 12.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8293F, 40.3271F, -17.4334F, -1.6184F, 0.828F, -1.6353F));
		PartDefinition torso_r10 = Body.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(56, 28).addBox(-3.0F, -2.5F, -5.5F, 11.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4568F, 37.6073F, -20.4015F, -0.8017F, 0.3474F, -0.3382F));
		PartDefinition torso_r11 = Body.addOrReplaceChild("torso_r11", CubeListBuilder.create().texOffs(35, 66).addBox(-6.5302F, -3.5F, -5.8881F, 10.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4033F, 34.7049F, -23.5688F, -0.8268F, -0.4073F, 0.4064F));
		PartDefinition torso_r12 = Body.addOrReplaceChild("torso_r12", CubeListBuilder.create().texOffs(104, 47).addBox(-4.0F, 3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.4316F, -16.6667F, -0.7418F, 0.0F, 0.0F));
		PartDefinition torso_r13 = Body.addOrReplaceChild("torso_r13", CubeListBuilder.create().texOffs(34, 95).addBox(-4.5F, -3.0F, -3.0F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 26.5349F, -16.7633F, -1.0036F, 0.0F, 0.0F));
		PartDefinition torso_r14 = Body.addOrReplaceChild("torso_r14", CubeListBuilder.create().texOffs(92, 78).addBox(-5.0F, -3.0F, -3.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.5209F, -12.9787F, -1.6144F, 0.0F, 0.0F));
		PartDefinition torso_r15 = Body.addOrReplaceChild("torso_r15", CubeListBuilder.create().texOffs(0, 91).addBox(-5.5F, -3.0F, -3.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 26.6414F, -8.3996F, -2.0071F, 0.0F, 0.0F));
		PartDefinition torso_r16 = Body.addOrReplaceChild("torso_r16", CubeListBuilder.create().texOffs(77, 66).addBox(-5.5F, 1.0F, -3.0F, 12.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 26.4582F, -0.5759F, -1.3963F, 0.0F, 0.0F));
		PartDefinition torso_r17 = Body.addOrReplaceChild("torso_r17", CubeListBuilder.create().texOffs(74, 16).addBox(-6.0F, -5.0F, -3.0F, 13.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 26.7578F, -2.4539F, -0.7854F, 0.0F, 0.0F));
		PartDefinition torso_r18 = Body.addOrReplaceChild("torso_r18", CubeListBuilder.create().texOffs(74, 0).addBox(-7.0F, -4.5F, -1.5F, 14.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 19.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Left_Arm = partdefinition.addOrReplaceChild("Left_Arm", CubeListBuilder.create(), PartPose.offset(14.3605F, -24.3853F, 3.1705F));
		PartDefinition torso_r19 = Left_Arm.addOrReplaceChild("torso_r19", CubeListBuilder.create().texOffs(91, 35).mirror().addBox(-5.5F, -1.5F, -6.0F, 8.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.187F, 18.8101F, -20.6685F, -1.6734F, -0.0858F, -0.0392F));
		PartDefinition torso_r20 = Left_Arm.addOrReplaceChild("torso_r20", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(-2.6309F, -7.9572F, 1.8463F, 5.0F, 22.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.2705F, 16.986F, -5.1258F, -1.9788F, -0.0858F, -0.0392F));
		PartDefinition torso_r21 = Left_Arm.addOrReplaceChild("torso_r21", CubeListBuilder.create().texOffs(87, 101).mirror().addBox(-2.5F, -10.5435F, 1.8458F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.2705F, 16.986F, -5.1258F, -0.059F, -0.0858F, -0.0392F));
		PartDefinition torso_r22 = Left_Arm.addOrReplaceChild("torso_r22", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-4.25F, -8.0F, -3.5F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.3895F, 3.244F, -0.4583F, -0.0552F, -0.0883F, -0.0393F));
		PartDefinition finger2 = Left_Arm.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.187F, 21.8101F, -21.6685F, 0.2182F, 0.0F, 0.0F));
		PartDefinition torso_r23 = finger2.addOrReplaceChild("torso_r23", CubeListBuilder.create().texOffs(149, 89).mirror().addBox(-1.0552F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0091F, 4.3643F, -0.7867F, -1.2807F, -0.0858F, -0.0392F));
		PartDefinition torso_r24 = finger2.addOrReplaceChild("torso_r24", CubeListBuilder.create().texOffs(150, 32).mirror().addBox(-5.5005F, -0.5F, 3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, -3.2745F, 1.0219F, -1.6734F, -0.0858F, -0.0392F));
		PartDefinition finger3 = Left_Arm.addOrReplaceChild("finger3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.187F, 21.8101F, -21.6685F, -0.1309F, 0.0F, 0.0F));
		PartDefinition torso_r25 = finger3.addOrReplaceChild("torso_r25", CubeListBuilder.create().texOffs(144, 132).mirror().addBox(-1.0552F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0057F, 4.226F, -1.0047F, -0.6699F, -0.0858F, -0.0392F));
		PartDefinition torso_r26 = finger3.addOrReplaceChild("torso_r26", CubeListBuilder.create().texOffs(148, 14).mirror().addBox(-5.5006F, -0.5F, 3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.9911F, -2.9674F, 1.1501F, -1.6734F, -0.0858F, -0.0392F));
		PartDefinition finger4 = Left_Arm.addOrReplaceChild("finger4", CubeListBuilder.create(), PartPose.offsetAndRotation(6.187F, 21.8101F, -21.6685F, 0.3054F, 0.0F, 0.0F));
		PartDefinition torso_r27 = finger4.addOrReplaceChild("torso_r27", CubeListBuilder.create().texOffs(26, 125).mirror().addBox(-1.0552F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0199F, 3.8264F, -0.6454F, -0.8008F, -0.0858F, -0.0392F));
		PartDefinition torso_r28 = finger4.addOrReplaceChild("torso_r28", CubeListBuilder.create().texOffs(139, 94).mirror().addBox(-5.5007F, -0.5F, 3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.9822F, -3.4432F, 1.4133F, -1.6734F, -0.0858F, -0.0392F));
		PartDefinition finger5 = Left_Arm.addOrReplaceChild("finger5", CubeListBuilder.create(), PartPose.offsetAndRotation(8.187F, 21.8101F, -21.6685F, 0.6542F, -0.0212F, 0.0277F));
		PartDefinition torso_r29 = finger5.addOrReplaceChild("torso_r29", CubeListBuilder.create().texOffs(105, 28).mirror().addBox(-1.0552F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0555F, 3.9006F, -0.0987F, -1.0625F, -0.0858F, -0.0392F));
		PartDefinition torso_r30 = finger5.addOrReplaceChild("torso_r30", CubeListBuilder.create().texOffs(36, 107).mirror().addBox(-5.5005F, -0.5F, 3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.9529F, -3.5556F, 1.8015F, -1.6734F, -0.0858F, -0.0392F));
		PartDefinition finger11 = Left_Arm.addOrReplaceChild("finger11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.687F, 13.3101F, -21.6685F, 0.0F, 0.0F, 0.2182F));
		PartDefinition torso_r31 = finger11.addOrReplaceChild("torso_r31", CubeListBuilder.create().texOffs(104, 59).mirror().addBox(-1.0552F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0038F, 4.3257F, 0.0234F, -1.6429F, -0.1127F, -0.345F));
		PartDefinition torso_r32 = finger11.addOrReplaceChild("torso_r32", CubeListBuilder.create().texOffs(89, 28).mirror().addBox(-5.5F, -0.5F, 3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0789F, -3.3645F, 1.7471F, -1.6734F, -0.0858F, -0.0392F));
		PartDefinition Right_Arm = partdefinition.addOrReplaceChild("Right_Arm", CubeListBuilder.create(), PartPose.offset(-14.3605F, -24.3853F, 3.1705F));
		PartDefinition torso_r33 = Right_Arm.addOrReplaceChild("torso_r33", CubeListBuilder.create().texOffs(91, 35).addBox(-2.5F, -1.5F, -6.0F, 8.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.187F, 18.8101F, -20.6685F, -1.6734F, 0.0858F, 0.0392F));
		PartDefinition torso_r34 = Right_Arm.addOrReplaceChild("torso_r34", CubeListBuilder.create().texOffs(72, 78).addBox(-2.3691F, -7.9572F, 1.8463F, 5.0F, 22.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2705F, 16.986F, -5.1258F, -1.9788F, 0.0858F, 0.0392F));
		PartDefinition torso_r35 = Right_Arm.addOrReplaceChild("torso_r35", CubeListBuilder.create().texOffs(87, 101).addBox(-2.5F, -10.5435F, 1.8458F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2705F, 16.986F, -5.1258F, -0.059F, 0.0858F, 0.0392F));
		PartDefinition torso_r36 = Right_Arm.addOrReplaceChild("torso_r36", CubeListBuilder.create().texOffs(0, 71).addBox(-3.75F, -8.0F, -3.5F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3895F, 3.244F, -0.4583F, -0.0552F, 0.0883F, 0.0393F));
		PartDefinition finger6 = Right_Arm.addOrReplaceChild("finger6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.187F, 21.8101F, -21.6685F, 0.2182F, 0.0F, 0.0F));
		PartDefinition torso_r37 = finger6.addOrReplaceChild("torso_r37", CubeListBuilder.create().texOffs(149, 89).addBox(-0.9448F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0091F, 4.3643F, -0.7867F, -1.2807F, 0.0858F, 0.0392F));
		PartDefinition torso_r38 = finger6.addOrReplaceChild("torso_r38", CubeListBuilder.create().texOffs(150, 32).addBox(3.5005F, -0.5F, 3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.2745F, 1.0219F, -1.6734F, 0.0858F, 0.0392F));
		PartDefinition finger7 = Right_Arm.addOrReplaceChild("finger7", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.187F, 21.8101F, -21.6685F, -0.1309F, 0.0F, 0.0F));
		PartDefinition torso_r39 = finger7.addOrReplaceChild("torso_r39", CubeListBuilder.create().texOffs(144, 132).addBox(-0.9448F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0057F, 4.226F, -1.0047F, -0.6699F, 0.0858F, 0.0392F));
		PartDefinition torso_r40 = finger7.addOrReplaceChild("torso_r40", CubeListBuilder.create().texOffs(148, 14).addBox(3.5006F, -0.5F, 3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9911F, -2.9674F, 1.1501F, -1.6734F, 0.0858F, 0.0392F));
		PartDefinition finger8 = Right_Arm.addOrReplaceChild("finger8", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.187F, 21.8101F, -21.6685F, 0.3054F, 0.0F, 0.0F));
		PartDefinition torso_r41 = finger8.addOrReplaceChild("torso_r41", CubeListBuilder.create().texOffs(26, 125).addBox(-0.9448F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0199F, 3.8264F, -0.6454F, -0.8008F, 0.0858F, 0.0392F));
		PartDefinition torso_r42 = finger8.addOrReplaceChild("torso_r42", CubeListBuilder.create().texOffs(139, 94).addBox(3.5007F, -0.5F, 3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9822F, -3.4432F, 1.4133F, -1.6734F, 0.0858F, 0.0392F));
		PartDefinition finger9 = Right_Arm.addOrReplaceChild("finger9", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.187F, 21.8101F, -21.6685F, 0.6542F, 0.0212F, -0.0277F));
		PartDefinition torso_r43 = finger9.addOrReplaceChild("torso_r43", CubeListBuilder.create().texOffs(105, 28).addBox(-0.9448F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0555F, 3.9006F, -0.0987F, -1.0625F, 0.0858F, 0.0392F));
		PartDefinition torso_r44 = finger9.addOrReplaceChild("torso_r44", CubeListBuilder.create().texOffs(36, 107).addBox(3.5005F, -0.5F, 3.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9529F, -3.5556F, 1.8015F, -1.6734F, 0.0858F, 0.0392F));
		PartDefinition finger10 = Right_Arm.addOrReplaceChild("finger10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.687F, 13.3101F, -21.6685F, 0.0F, 0.0F, -0.2182F));
		PartDefinition torso_r45 = finger10.addOrReplaceChild("torso_r45", CubeListBuilder.create().texOffs(104, 59).addBox(-0.9448F, -1.064F, 0.0635F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0038F, 4.3257F, 0.0234F, -1.6429F, 0.1127F, 0.345F));
		PartDefinition torso_r46 = finger10.addOrReplaceChild("torso_r46", CubeListBuilder.create().texOffs(89, 28).addBox(2.5F, -0.5F, 3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0789F, -3.3645F, 1.7471F, -1.6734F, 0.0858F, 0.0392F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 28).addBox(-7.0F, -13.766F, -11.6369F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(32, 83).addBox(-5.0F, 0.234F, -11.6369F, 10.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.1141F, -0.1548F, 0.2618F, 0.0F, 0.0F));
		PartDefinition torso_r47 = Head.addOrReplaceChild("torso_r47",
				CubeListBuilder.create().texOffs(114, 0).mirror().addBox(-4.99F, -9.0F, -2.5F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(114, 0).addBox(-0.01F, -9.0F, -2.5F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.5821F, -6.5699F, -0.5236F, 0.0F, 0.0F));
		PartDefinition torso_r48 = Head.addOrReplaceChild("torso_r48",
				CubeListBuilder.create().texOffs(70, 114).addBox(-1.0F, -8.0193F, -16.1554F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(100, 119).addBox(4.0F, -8.0193F, -16.1554F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -3.766F, -10.9369F, -1.9635F, 0.0F, 0.0F));
		PartDefinition torso_r49 = Head.addOrReplaceChild("torso_r49", CubeListBuilder.create().texOffs(56, 125).addBox(-1.0F, -8.0193F, -16.1554F, 2.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.766F, -10.9369F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r50 = Head.addOrReplaceChild("torso_r50",
				CubeListBuilder.create().texOffs(0, 113).addBox(3.99F, -7.0F, -7.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 113).mirror().addBox(-6.99F, -7.0F, -7.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -8.766F, -5.9369F, 0.3054F, 0.0F, 0.0F));
		PartDefinition torso_r51 = Head.addOrReplaceChild("torso_r51",
				CubeListBuilder.create().texOffs(120, 112).addBox(3.98F, -7.0F, -7.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(120, 112).mirror().addBox(-6.98F, -7.0F, -7.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.5825F, -7.5832F, -1.0036F, 0.0F, 0.0F));
		PartDefinition torso_r52 = Head.addOrReplaceChild("torso_r52",
				CubeListBuilder.create().texOffs(23, 107).mirror().addBox(3.99F, -7.0F, -7.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(23, 107).addBox(-6.99F, -7.0F, -7.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.1852F, -5.4765F, -2.0944F, 0.0F, 0.0F));
		PartDefinition torso_r53 = Head.addOrReplaceChild("torso_r53", CubeListBuilder.create().texOffs(33, 129).addBox(-1.0F, -12.9537F, -10.1037F, 2.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.766F, -10.9369F, -0.7854F, 0.0F, 0.0F));
		PartDefinition torso_r54 = Head.addOrReplaceChild("torso_r54", CubeListBuilder.create().texOffs(112, 9).mirror().addBox(-0.99F, -10.2651F, -0.7279F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(112, 9).addBox(3.99F,
				-10.2651F, -0.7279F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -3.766F, -10.9369F, 0.4363F, 0.0F, 0.0F));
		PartDefinition torso_r55 = Head.addOrReplaceChild("torso_r55", CubeListBuilder.create().texOffs(13, 125).mirror().addBox(-1.0F, -12.9537F, -10.1037F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(13, 125).addBox(4.0F,
				-12.9537F, -10.1037F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -3.766F, -10.9369F, -0.8727F, 0.0F, 0.0F));
		PartDefinition torso_r56 = Head.addOrReplaceChild("torso_r56", CubeListBuilder.create().texOffs(125, 20).addBox(-1.0F, -10.2651F, -0.7279F, 2.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.766F, -10.9369F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone10 = Head.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, -14.3436F, -1.5133F));
		PartDefinition bone = bone10.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6949F, 1.7773F, 4.6135F, 0.0F, -0.0175F, 0.0F));
		PartDefinition torso_r57 = bone.addOrReplaceChild("torso_r57", CubeListBuilder.create().texOffs(99, 137).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r58 = bone.addOrReplaceChild("torso_r58", CubeListBuilder.create().texOffs(138, 38).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r59 = bone.addOrReplaceChild("torso_r59", CubeListBuilder.create().texOffs(111, 141).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r60 = bone.addOrReplaceChild("torso_r60", CubeListBuilder.create().texOffs(141, 118).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r61 = bone.addOrReplaceChild("torso_r61", CubeListBuilder.create().texOffs(21, 143).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r62 = bone.addOrReplaceChild("torso_r62", CubeListBuilder.create().texOffs(144, 52).addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone2 = bone10.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.6949F, 1.7773F, 4.6135F, -0.1309F, -0.1309F, 0.0F));
		PartDefinition torso_r63 = bone2.addOrReplaceChild("torso_r63", CubeListBuilder.create().texOffs(132, 130).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r64 = bone2.addOrReplaceChild("torso_r64", CubeListBuilder.create().texOffs(133, 104).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r65 = bone2.addOrReplaceChild("torso_r65", CubeListBuilder.create().texOffs(136, 9).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r66 = bone2.addOrReplaceChild("torso_r66", CubeListBuilder.create().texOffs(137, 66).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r67 = bone2.addOrReplaceChild("torso_r67", CubeListBuilder.create().texOffs(9, 143).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r68 = bone2.addOrReplaceChild("torso_r68", CubeListBuilder.create().texOffs(83, 143).addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone3 = bone10.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.6949F, 1.0008F, 1.7158F, -0.3511F, -0.3062F, 0.0141F));
		PartDefinition torso_r69 = bone3.addOrReplaceChild("torso_r69", CubeListBuilder.create().texOffs(126, 38).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r70 = bone3.addOrReplaceChild("torso_r70", CubeListBuilder.create().texOffs(0, 131).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r71 = bone3.addOrReplaceChild("torso_r71", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r72 = bone3.addOrReplaceChild("torso_r72", CubeListBuilder.create().texOffs(87, 129).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r73 = bone3.addOrReplaceChild("torso_r73", CubeListBuilder.create().texOffs(141, 141).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r74 = bone3.addOrReplaceChild("torso_r74", CubeListBuilder.create().texOffs(63, 143).addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone4 = bone10.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.6949F, 1.4538F, 3.4061F));
		PartDefinition torso_r75 = bone4.addOrReplaceChild("torso_r75", CubeListBuilder.create().texOffs(143, 23).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.8484F, 31.1477F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r76 = bone4.addOrReplaceChild("torso_r76", CubeListBuilder.create().texOffs(132, 52).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 11.1577F, 34.1817F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r77 = bone4.addOrReplaceChild("torso_r77", CubeListBuilder.create().texOffs(74, 132).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 2.1644F, 31.7719F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r78 = bone4.addOrReplaceChild("torso_r78", CubeListBuilder.create().texOffs(42, 28).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -3.4246F, 24.1495F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r79 = bone4.addOrReplaceChild("torso_r79", CubeListBuilder.create().texOffs(120, 130).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -2.8252F, 15.0043F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r80 = bone4.addOrReplaceChild("torso_r80", CubeListBuilder.create().texOffs(51, 143).addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 1.0518F, 7.1233F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone7 = bone10.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6949F, 1.7773F, 4.6135F, 0.0F, 0.0175F, 0.0F));
		PartDefinition torso_r81 = bone7.addOrReplaceChild("torso_r81", CubeListBuilder.create().texOffs(99, 137).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, -0.0058F, -0.0423F));
		PartDefinition torso_r82 = bone7.addOrReplaceChild("torso_r82", CubeListBuilder.create().texOffs(138, 38).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r83 = bone7.addOrReplaceChild("torso_r83", CubeListBuilder.create().texOffs(111, 141).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r84 = bone7.addOrReplaceChild("torso_r84", CubeListBuilder.create().texOffs(141, 118).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r85 = bone7.addOrReplaceChild("torso_r85", CubeListBuilder.create().texOffs(21, 143).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r86 = bone7.addOrReplaceChild("torso_r86", CubeListBuilder.create().texOffs(144, 52).mirror().addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone8 = bone10.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(6.6949F, 1.7773F, 4.6135F, -0.1309F, 0.1309F, 0.0F));
		PartDefinition torso_r87 = bone8.addOrReplaceChild("torso_r87", CubeListBuilder.create().texOffs(132, 130).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, -0.0058F, -0.0423F));
		PartDefinition torso_r88 = bone8.addOrReplaceChild("torso_r88", CubeListBuilder.create().texOffs(133, 104).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r89 = bone8.addOrReplaceChild("torso_r89", CubeListBuilder.create().texOffs(136, 9).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r90 = bone8.addOrReplaceChild("torso_r90", CubeListBuilder.create().texOffs(137, 66).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r91 = bone8.addOrReplaceChild("torso_r91", CubeListBuilder.create().texOffs(9, 143).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r92 = bone8.addOrReplaceChild("torso_r92", CubeListBuilder.create().texOffs(83, 143).mirror().addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone9 = bone10.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(6.6949F, 1.0008F, 1.7158F, -0.3511F, 0.3062F, -0.0141F));
		PartDefinition torso_r93 = bone9.addOrReplaceChild("torso_r93", CubeListBuilder.create().texOffs(126, 38).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, -0.0058F, -0.0423F));
		PartDefinition torso_r94 = bone9.addOrReplaceChild("torso_r94", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r95 = bone9.addOrReplaceChild("torso_r95", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r96 = bone9.addOrReplaceChild("torso_r96", CubeListBuilder.create().texOffs(87, 129).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r97 = bone9.addOrReplaceChild("torso_r97", CubeListBuilder.create().texOffs(141, 141).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r98 = bone9.addOrReplaceChild("torso_r98", CubeListBuilder.create().texOffs(63, 143).mirror().addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone6 = bone10.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(2.6949F, 1.4538F, 3.4061F));
		PartDefinition torso_r99 = bone6.addOrReplaceChild("torso_r99", CubeListBuilder.create().texOffs(143, 23).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.8484F, 31.1477F, 2.6202F, -0.0058F, -0.0423F));
		PartDefinition torso_r100 = bone6.addOrReplaceChild("torso_r100", CubeListBuilder.create().texOffs(132, 52).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 11.1577F, 34.1817F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r101 = bone6.addOrReplaceChild("torso_r101", CubeListBuilder.create().texOffs(74, 132).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 2.1644F, 31.7719F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r102 = bone6.addOrReplaceChild("torso_r102", CubeListBuilder.create().texOffs(42, 28).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -3.4246F, 24.1495F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r103 = bone6.addOrReplaceChild("torso_r103", CubeListBuilder.create().texOffs(120, 130).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -2.8252F, 15.0043F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r104 = bone6.addOrReplaceChild("torso_r104", CubeListBuilder.create().texOffs(51, 143).mirror().addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 1.0518F, 7.1233F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone5 = bone10.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6949F, 1.2596F, 2.6817F, 0.0436F, 0.0F, 0.0F));
		PartDefinition torso_r105 = bone5.addOrReplaceChild("torso_r105", CubeListBuilder.create().texOffs(148, 0).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0541F, 31.0365F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r106 = bone5.addOrReplaceChild("torso_r106", CubeListBuilder.create().texOffs(145, 101).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 10.3635F, 34.0704F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r107 = bone5.addOrReplaceChild("torso_r107", CubeListBuilder.create().texOffs(33, 147).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 1.3701F, 31.6606F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r108 = bone5.addOrReplaceChild("torso_r108", CubeListBuilder.create().texOffs(144, 80).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -4.2189F, 24.0382F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r109 = bone5.addOrReplaceChild("torso_r109", CubeListBuilder.create().texOffs(123, 144).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -3.6195F, 14.8931F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r110 = bone5.addOrReplaceChild("torso_r110", CubeListBuilder.create().texOffs(149, 66).addBox(-0.5F, -3.5F, -3.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 0.2575F, 7.012F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone11 = Head.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.4811F, -6.1535F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bone12 = bone11.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.6949F, 1.7773F, 4.6135F, 0.0F, -0.0175F, 0.0F));
		PartDefinition torso_r111 = bone12.addOrReplaceChild("torso_r111", CubeListBuilder.create().texOffs(99, 137).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r112 = bone12.addOrReplaceChild("torso_r112", CubeListBuilder.create().texOffs(138, 38).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r113 = bone12.addOrReplaceChild("torso_r113", CubeListBuilder.create().texOffs(111, 141).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r114 = bone12.addOrReplaceChild("torso_r114", CubeListBuilder.create().texOffs(141, 118).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r115 = bone12.addOrReplaceChild("torso_r115", CubeListBuilder.create().texOffs(21, 143).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r116 = bone12.addOrReplaceChild("torso_r116", CubeListBuilder.create().texOffs(144, 52).addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone13 = bone11.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6949F, 1.7773F, 4.6135F, 0.0F, 0.0175F, 0.0F));
		PartDefinition torso_r117 = bone13.addOrReplaceChild("torso_r117", CubeListBuilder.create().texOffs(99, 137).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, -0.0058F, -0.0423F));
		PartDefinition torso_r118 = bone13.addOrReplaceChild("torso_r118", CubeListBuilder.create().texOffs(138, 38).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r119 = bone13.addOrReplaceChild("torso_r119", CubeListBuilder.create().texOffs(111, 141).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r120 = bone13.addOrReplaceChild("torso_r120", CubeListBuilder.create().texOffs(141, 118).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r121 = bone13.addOrReplaceChild("torso_r121", CubeListBuilder.create().texOffs(21, 143).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r122 = bone13.addOrReplaceChild("torso_r122", CubeListBuilder.create().texOffs(144, 52).mirror().addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone14 = bone11.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.6949F, 1.7773F, 4.6135F, -0.1309F, -0.1309F, 0.0F));
		PartDefinition torso_r123 = bone14.addOrReplaceChild("torso_r123", CubeListBuilder.create().texOffs(132, 130).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r124 = bone14.addOrReplaceChild("torso_r124", CubeListBuilder.create().texOffs(133, 104).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r125 = bone14.addOrReplaceChild("torso_r125", CubeListBuilder.create().texOffs(136, 9).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r126 = bone14.addOrReplaceChild("torso_r126", CubeListBuilder.create().texOffs(137, 66).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r127 = bone14.addOrReplaceChild("torso_r127", CubeListBuilder.create().texOffs(9, 143).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r128 = bone14.addOrReplaceChild("torso_r128", CubeListBuilder.create().texOffs(83, 143).addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone15 = bone11.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(6.6949F, 1.7773F, 4.6135F, -0.1309F, 0.1309F, 0.0F));
		PartDefinition torso_r129 = bone15.addOrReplaceChild("torso_r129", CubeListBuilder.create().texOffs(132, 130).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, -0.0058F, -0.0423F));
		PartDefinition torso_r130 = bone15.addOrReplaceChild("torso_r130", CubeListBuilder.create().texOffs(133, 104).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r131 = bone15.addOrReplaceChild("torso_r131", CubeListBuilder.create().texOffs(136, 9).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r132 = bone15.addOrReplaceChild("torso_r132", CubeListBuilder.create().texOffs(137, 66).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r133 = bone15.addOrReplaceChild("torso_r133", CubeListBuilder.create().texOffs(9, 143).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r134 = bone15.addOrReplaceChild("torso_r134", CubeListBuilder.create().texOffs(83, 143).mirror().addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone16 = bone11.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.6949F, 1.0008F, 1.7158F, -0.3511F, -0.3062F, 0.0141F));
		PartDefinition torso_r135 = bone16.addOrReplaceChild("torso_r135", CubeListBuilder.create().texOffs(126, 38).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r136 = bone16.addOrReplaceChild("torso_r136", CubeListBuilder.create().texOffs(0, 131).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r137 = bone16.addOrReplaceChild("torso_r137", CubeListBuilder.create().texOffs(0, 28).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r138 = bone16.addOrReplaceChild("torso_r138", CubeListBuilder.create().texOffs(87, 129).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r139 = bone16.addOrReplaceChild("torso_r139", CubeListBuilder.create().texOffs(141, 141).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r140 = bone16.addOrReplaceChild("torso_r140", CubeListBuilder.create().texOffs(63, 143).addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone17 = bone11.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(6.6949F, 1.0008F, 1.7158F, -0.3511F, 0.3062F, -0.0141F));
		PartDefinition torso_r141 = bone17.addOrReplaceChild("torso_r141", CubeListBuilder.create().texOffs(126, 38).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 22.5816F, 30.1839F, 2.6202F, -0.0058F, -0.0423F));
		PartDefinition torso_r142 = bone17.addOrReplaceChild("torso_r142", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 12.8909F, 33.2178F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r143 = bone17.addOrReplaceChild("torso_r143", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 3.8976F, 30.8081F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r144 = bone17.addOrReplaceChild("torso_r144", CubeListBuilder.create().texOffs(87, 129).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.6914F, 23.1856F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r145 = bone17.addOrReplaceChild("torso_r145", CubeListBuilder.create().texOffs(141, 141).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -1.092F, 14.0405F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r146 = bone17.addOrReplaceChild("torso_r146", CubeListBuilder.create().texOffs(63, 143).mirror().addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 2.7849F, 6.1595F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone18 = bone11.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offset(-2.6949F, 1.4538F, 3.4061F));
		PartDefinition torso_r147 = bone18.addOrReplaceChild("torso_r147", CubeListBuilder.create().texOffs(143, 23).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.8484F, 31.1477F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r148 = bone18.addOrReplaceChild("torso_r148", CubeListBuilder.create().texOffs(132, 52).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 11.1577F, 34.1817F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r149 = bone18.addOrReplaceChild("torso_r149", CubeListBuilder.create().texOffs(74, 132).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 2.1644F, 31.7719F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r150 = bone18.addOrReplaceChild("torso_r150", CubeListBuilder.create().texOffs(42, 28).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -3.4246F, 24.1495F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r151 = bone18.addOrReplaceChild("torso_r151", CubeListBuilder.create().texOffs(120, 130).addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -2.8252F, 15.0043F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r152 = bone18.addOrReplaceChild("torso_r152", CubeListBuilder.create().texOffs(51, 143).addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 1.0518F, 7.1233F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone19 = bone11.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offset(2.6949F, 1.4538F, 3.4061F));
		PartDefinition torso_r153 = bone19.addOrReplaceChild("torso_r153", CubeListBuilder.create().texOffs(143, 23).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 20.8484F, 31.1477F, 2.6202F, -0.0058F, -0.0423F));
		PartDefinition torso_r154 = bone19.addOrReplaceChild("torso_r154", CubeListBuilder.create().texOffs(132, 52).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 11.1577F, 34.1817F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r155 = bone19.addOrReplaceChild("torso_r155", CubeListBuilder.create().texOffs(74, 132).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 2.1644F, 31.7719F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r156 = bone19.addOrReplaceChild("torso_r156", CubeListBuilder.create().texOffs(42, 28).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -3.4246F, 24.1495F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r157 = bone19.addOrReplaceChild("torso_r157", CubeListBuilder.create().texOffs(120, 130).mirror().addBox(-1.5F, -5.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, -2.8252F, 15.0043F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r158 = bone19.addOrReplaceChild("torso_r158", CubeListBuilder.create().texOffs(51, 143).mirror().addBox(-1.5F, -3.5F, -3.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1949F, 1.0518F, 7.1233F, -1.6581F, 0.0F, 0.0F));
		PartDefinition bone20 = bone11.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6949F, 1.2596F, 2.6817F, 0.0436F, 0.0F, 0.0F));
		PartDefinition torso_r159 = bone20.addOrReplaceChild("torso_r159", CubeListBuilder.create().texOffs(148, 0).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0541F, 31.0365F, 2.6202F, 0.0058F, 0.0423F));
		PartDefinition torso_r160 = bone20.addOrReplaceChild("torso_r160", CubeListBuilder.create().texOffs(145, 101).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 10.3635F, 34.0704F, 3.0543F, 0.0F, 0.0F));
		PartDefinition torso_r161 = bone20.addOrReplaceChild("torso_r161", CubeListBuilder.create().texOffs(33, 147).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 1.3701F, 31.6606F, -2.5307F, 0.0F, 0.0F));
		PartDefinition torso_r162 = bone20.addOrReplaceChild("torso_r162", CubeListBuilder.create().texOffs(144, 80).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -4.2189F, 24.0382F, -1.8762F, 0.0F, 0.0F));
		PartDefinition torso_r163 = bone20.addOrReplaceChild("torso_r163", CubeListBuilder.create().texOffs(123, 144).addBox(-0.5F, -5.5F, -1.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, -3.6195F, 14.8931F, -1.1345F, 0.0F, 0.0F));
		PartDefinition torso_r164 = bone20.addOrReplaceChild("torso_r164", CubeListBuilder.create().texOffs(149, 66).addBox(-0.5F, -3.5F, -3.5F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1949F, 0.2575F, 7.012F, -1.6581F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
