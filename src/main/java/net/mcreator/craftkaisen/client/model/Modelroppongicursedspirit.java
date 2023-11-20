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
public class Modelroppongicursedspirit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelroppongicursedspirit"), "main");
	public final ModelPart legl;
	public final ModelPart legr;
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart arml;
	public final ModelPart armr;

	public Modelroppongicursedspirit(ModelPart root) {
		this.legl = root.getChild("legl");
		this.legr = root.getChild("legr");
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.arml = root.getChild("arml");
		this.armr = root.getChild("armr");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition legl = partdefinition.addOrReplaceChild("legl",
				CubeListBuilder.create().texOffs(81, 22).addBox(-3.2745F, 10.912F, -5.2047F, 4.7629F, 0.976F, 5.8048F, new CubeDeformation(0.0F)).texOffs(88, 14).addBox(-2.828F, 9.57F, -2.2279F, 3.8698F, 1.586F, 2.6791F, new CubeDeformation(0.0F)),
				PartPose.offset(10.2F, 12.2F, 3.075F));
		PartDefinition cube_r1 = legl.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(80, 43).addBox(-0.5954F, -1.2793F, -4.6142F, 1.1907F, 0.976F, 1.7861F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4465F, 11.2803F, -3.004F, 0.3054F, -0.1745F, 0.0F));
		PartDefinition cube_r2 = legl.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(83, 31).addBox(-0.5954F, -0.0643F, -3.2293F, 1.1907F, 0.976F, 1.1907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4465F, 11.2803F, -3.004F, -0.1745F, -0.1745F, 0.0F));
		PartDefinition cube_r3 = legl.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(91, 51).addBox(-0.5954F, -1.2793F, -4.6142F, 1.1907F, 0.976F, 1.7861F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2326F, 11.2803F, -3.004F, 0.3054F, 0.1745F, 0.0F));
		PartDefinition cube_r4 = legl.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(105, 28).addBox(-0.5954F, -0.0643F, -3.2293F, 1.1907F, 0.976F, 1.1907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2326F, 11.2803F, -3.004F, -0.1745F, 0.1745F, 0.0F));
		PartDefinition cube_r5 = legl.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(86, 38).addBox(-0.5954F, -0.488F, -2.6791F, 1.1907F, 0.976F, 1.7861F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.893F, 11.0026F, -5.1398F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r6 = legl.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(95, 34).addBox(-0.5954F, -0.488F, -0.2977F, 1.1907F, 0.976F, 1.1907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.893F, 11.2803F, -5.9808F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r7 = legl.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(40, 21).addBox(-2.0838F, 0.0F, -1.4884F, 4.1675F, 4.026F, 3.4233F, new CubeDeformation(0.0F)).texOffs(22, 28).addBox(-2.3814F, 0.366F, -1.7861F, 4.7629F, 3.416F, 4.0187F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0012F, -1.9233F, -0.1165F, -0.1744F, 0.0057F, 0.1742F));
		PartDefinition cube_r8 = legl.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(104, 37).addBox(-1.3396F, -8.174F, 2.7535F, 1.6372F, 3.05F, 0.1488F, new CubeDeformation(0.0F)).texOffs(81, 31).addBox(-0.2977F, -3.294F, -0.0744F, 1.6372F, 3.05F, 0.1488F, new CubeDeformation(0.0F))
						.texOffs(91, 29).addBox(-1.3396F, -8.174F, -0.0744F, 1.6372F, 3.05F, 0.1488F, new CubeDeformation(0.0F)).texOffs(76, 34).addBox(1.7861F, -8.174F, 0.3721F, 0.1488F, 2.074F, 2.0838F, new CubeDeformation(0.0F)).texOffs(91, 36)
						.addBox(-1.7861F, -10.126F, 0.0744F, 3.5722F, 8.296F, 2.6791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.201F, 11.5914F, -2.3023F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r9 = legl.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(77, 19).addBox(-1.9349F, -1.464F, -2.6047F, 3.8698F, 1.342F, 1.1907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.893F, 10.2422F, -1.7914F, 0.8901F, 0.0F, 0.0F));
		PartDefinition cube_r10 = legl.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(92, 30).addBox(-1.9349F, -1.464F, -1.414F, 3.8698F, 1.342F, 3.8698F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.893F, 11.4F, -2.3023F, 0.2182F, 0.0F, 0.0F));
		PartDefinition legr = partdefinition.addOrReplaceChild("legr",
				CubeListBuilder.create().texOffs(89, 53).addBox(-1.7884F, 11.012F, -5.3047F, 4.7629F, 0.976F, 5.8048F, new CubeDeformation(0.0F)).texOffs(97, 15).addBox(-1.3419F, 9.67F, -2.3279F, 3.8698F, 1.586F, 2.6791F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.9F, 12.1F, 3.175F));
		PartDefinition cube_r11 = legr.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(101, 48).addBox(-0.5954F, -1.2793F, -4.6142F, 1.1907F, 0.976F, 1.7861F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7465F, 11.3803F, -3.104F, 0.3054F, 0.1745F, 0.0F));
		PartDefinition cube_r12 = legr.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(104, 31).addBox(-0.5954F, -0.0643F, -3.2293F, 1.1907F, 0.976F, 1.1907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7465F, 11.3803F, -3.104F, -0.1745F, 0.1745F, 0.0F));
		PartDefinition cube_r13 = legr.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(99, 24).addBox(-0.5954F, -1.2793F, -4.6142F, 1.1907F, 0.976F, 1.7861F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9326F, 11.3803F, -3.104F, 0.3054F, -0.1745F, 0.0F));
		PartDefinition cube_r14 = legr.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(111, 20).addBox(-0.5954F, -0.0643F, -3.2293F, 1.1907F, 0.976F, 1.1907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9326F, 11.3803F, -3.104F, -0.1745F, -0.1745F, 0.0F));
		PartDefinition cube_r15 = legr.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(85, 33).addBox(-0.5954F, -0.488F, -2.6791F, 1.1907F, 0.976F, 1.7861F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.593F, 11.1026F, -5.2398F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r16 = legr.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(83, 28).addBox(-0.5954F, -0.488F, -0.2977F, 1.1907F, 0.976F, 1.1907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.593F, 11.3803F, -6.0808F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r17 = legr.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(11, 27).addBox(-2.0838F, 0.0F, -1.4884F, 4.1675F, 4.026F, 3.4233F, new CubeDeformation(0.0F)).texOffs(4, 34).addBox(-2.3814F, 0.366F, -1.7861F, 4.7629F, 3.416F, 4.0187F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3012F, -1.8233F, -0.2165F, -0.1744F, -0.0057F, -0.1742F));
		PartDefinition cube_r18 = legr.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(114, 59).addBox(-0.2977F, -8.174F, 2.7535F, 1.6372F, 3.05F, 0.1488F, new CubeDeformation(0.0F)).texOffs(91, 44).addBox(-1.3396F, -3.294F, -0.0744F, 1.6372F, 3.05F, 0.1488F, new CubeDeformation(0.0F))
						.texOffs(102, 27).addBox(-0.2977F, -8.174F, -0.0744F, 1.6372F, 3.05F, 0.1488F, new CubeDeformation(0.0F)).texOffs(84, 37).addBox(-1.9349F, -8.174F, 0.3721F, 0.1488F, 2.074F, 2.0838F, new CubeDeformation(0.0F)).texOffs(97, 30)
						.addBox(-1.7861F, -10.126F, 0.0744F, 3.5722F, 8.296F, 2.6791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.901F, 11.6914F, -2.4023F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r19 = legr.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(89, 27).addBox(-1.9349F, -1.464F, -2.6047F, 3.8698F, 1.342F, 1.1907F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.593F, 10.3422F, -1.8914F, 0.8901F, 0.0F, 0.0F));
		PartDefinition cube_r20 = legr.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(106, 37).addBox(-1.9349F, -1.464F, -1.414F, 3.8698F, 1.342F, 3.8698F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.593F, 11.5F, -2.4023F, 0.2182F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(8, 23).addBox(-7.2F, -6.3F, -5.4F, 14.4F, 6.9F, 11.4F, new CubeDeformation(0.0F)).texOffs(4, 30).addBox(-7.2F, -8.6F, -5.4F, 3.4F, 2.3F, 11.4F, new CubeDeformation(0.0F)).texOffs(4, 30).mirror()
						.addBox(3.8F, -8.6F, -5.4F, 3.4F, 2.3F, 11.4F, new CubeDeformation(0.0F)).mirror(false).texOffs(87, 113).mirror().addBox(-4.2F, -8.6F, -5.6F, 8.4F, 2.3F, 11.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 37)
						.addBox(-2.2F, -6.7F, -6.1F, 4.4F, 1.2F, 0.7F, new CubeDeformation(0.0F)).texOffs(97, 29).addBox(-1.2F, -12.4F, -6.1F, 2.4F, 1.5F, 0.7F, new CubeDeformation(0.0F)).texOffs(102, 26)
						.addBox(-2.9F, -12.1F, -5.4F, 5.8F, 1.5F, 1.1F, new CubeDeformation(0.0F)).texOffs(2, 23).addBox(-5.9F, -10.6F, -5.4F, 11.8F, 2.0F, 11.4F, new CubeDeformation(0.0F)).texOffs(108, 60)
						.addBox(2.9F, -13.6F, -6.0F, 4.3F, 3.8F, 3.9F, new CubeDeformation(0.0F)).texOffs(91, 60).addBox(-8.2F, -13.6F, -6.0F, 4.3F, 3.8F, 3.9F, new CubeDeformation(0.0F)).texOffs(17, 27)
						.addBox(-3.9F, -11.9F, -5.0F, 7.8F, 1.3F, 2.5F, new CubeDeformation(0.0F)).texOffs(87, 52).addBox(-3.1F, -10.9F, -6.1F, 6.2F, 1.6F, 0.7F, new CubeDeformation(0.0F)).texOffs(92, 23)
						.addBox(-3.2F, -9.3F, -5.9F, 6.5F, 0.7F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-7.0F, -8.6F, 6.0F, 14.0F, 9.1F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.2F, 2.5F));
		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(25, 34).addBox(-3.9F, -0.65F, -1.25F, 7.8F, 1.3F, 2.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.7121F, -1.7425F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(16, 24).addBox(-0.9F, -1.5F, -0.15F, 1.8F, 5.0F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -9.4F, -6.05F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(10, 122).addBox(-5.9F, 0.3F, -6.1F, 11.8F, 0.0F, 2.4F, new CubeDeformation(0.0F)).texOffs(7, 122)
				.addBox(-5.9F, 1.3F, -4.2F, 11.8F, 0.0F, 2.4F, new CubeDeformation(0.0F)).texOffs(8, 121).addBox(-5.9F, 2.5F, -2.2F, 11.8F, 0.0F, 2.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.6F, 4.8F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(100, 24).addBox(-1.4F, -0.75F, -0.2F, 1.3F, 1.5F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.906F, -11.5436F, -5.9F, 0.0F, 0.0F, -0.6807F));
		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(100, 31).addBox(0.1F, -0.75F, -0.2F, 1.3F, 1.5F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.906F, -11.5436F, -5.9F, 0.0F, 0.0F, 0.6807F));
		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(100, 41).addBox(-1.2F, -0.75F, -0.2F, 1.3F, 1.5F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.165F, -11.365F, -5.9F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(110, 40).addBox(-0.1F, -0.75F, -0.2F, 1.3F, 1.5F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.165F, -11.365F, -5.9F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(107, 41).addBox(-0.55F, -0.6F, -0.2F, 1.1F, 1.2F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5116F, -6.2519F, -5.9F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(81, 10).addBox(-0.95F, -0.5F, -0.2F, 0.4F, 1.0F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4688F, -6.1545F, -5.9F, 0.0F, 0.0F, 0.48F));
		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(104, 23).addBox(-1.45F, -0.4F, -0.2F, 0.5F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4842F, -5.968F, -5.9F, 0.0F, 0.0F, 0.6545F));
		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(98, 41).addBox(-2.95F, -0.3F, -0.2F, 1.5F, 0.6F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5699F, -5.7909F, -5.9F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(107, 44).addBox(1.45F, -0.3F, -0.2F, 1.5F, 0.6F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5699F, -5.7909F, -5.9F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(83, 53).addBox(0.95F, -0.4F, -0.2F, 0.5F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4842F, -5.968F, -5.9F, 0.0F, 0.0F, -0.6545F));
		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(83, 50).addBox(0.55F, -0.5F, -0.2F, 0.4F, 1.0F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4688F, -6.1545F, -5.9F, 0.0F, 0.0F, -0.48F));
		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(78, 35).addBox(-0.55F, -0.6F, -0.2F, 1.1F, 1.2F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5116F, -6.2519F, -5.9F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 40).addBox(-0.9F, -1.5F, -0.15F, 1.8F, 5.0F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -9.4F, -6.05F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(11, 24).addBox(-3.2F, -1.35F, -5.7F, 5.0F, 2.7F, 11.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.98F, -8.5663F, 0.3F, 0.0F, 0.0F, -0.48F));
		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(16, 4).addBox(-1.8F, -1.35F, -5.7F, 5.0F, 2.7F, 11.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.98F, -8.5663F, 0.3F, 0.0F, 0.0F, 0.48F));
		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 119).addBox(-7.2F, -3.25F, 6.3F, 14.4F, 8.9F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.85F, 0.4F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 119).addBox(-7.2F, -4.45F, -0.5F, 14.4F, 8.9F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.85F, -5.4F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(14, 116).addBox(-0.2F, -4.45F, -0.6F, 0.0F, 8.9F, 2.4F, new CubeDeformation(0.0F)).texOffs(14, 116)
				.addBox(1.1F, -4.45F, 3.0F, 0.0F, 8.9F, 2.4F, new CubeDeformation(0.0F)).texOffs(14, 116).addBox(2.4F, -4.45F, 6.2F, 0.0F, 8.9F, 2.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2F, -3.85F, -4.2F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(14, 116).addBox(-2.4F, -4.45F, 6.2F, 0.0F, 8.9F, 2.4F, new CubeDeformation(0.0F)).texOffs(14, 116)
				.addBox(-1.1F, -4.45F, 3.0F, 0.0F, 8.9F, 2.4F, new CubeDeformation(0.0F)).texOffs(14, 116).addBox(0.2F, -4.45F, -0.6F, 0.0F, 8.9F, 2.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2F, -3.85F, -4.2F, 0.0F, 0.3491F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(11, 21).addBox(-6.2F, -4.2F, -4.6F, 12.4F, 8.9F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 19).addBox(-6.0F, -4.0F, 4.4F, 12.0F, 8.5F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, 2.9F));
		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(22, 31).addBox(4.3698F, -7.972F, -4.6744F, 3.5722F, 8.498F, 2.6791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3186F, 6.6014F, 6.2316F, 0.1919F, 0.1983F, -0.9135F));
		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(27, 26).addBox(-7.942F, -7.972F, -4.6744F, 3.5722F, 8.498F, 2.6791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3186F, 6.6014F, 6.2316F, 0.1919F, -0.1983F, 0.9135F));
		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(2, 119).addBox(-6.2F, -3.85F, 6.2F, 12.4F, 8.9F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, -1.2F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(2, 119).addBox(-6.2F, -4.45F, -0.5F, 12.4F, 8.9F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, -4.6F, -0.1309F, 0.0F, 0.0F));
		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create(), PartPose.offsetAndRotation(6.149F, 5.8145F, 1.6671F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r47 = arml.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(91, 36).addBox(-1.672F, 0.051F, 1.2138F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.5343F, 0.3922F, 0.9504F));
		PartDefinition cube_r48 = arml.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(107, 4).addBox(-2.9004F, -0.3835F, 1.2138F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.5368F, 0.1306F, 0.9408F));
		PartDefinition cube_r49 = arml.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(97, 18).addBox(-3.0973F, -0.2917F, 0.6531F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.2928F, -0.14F, 1.4762F));
		PartDefinition cube_r50 = arml.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(97, 36).addBox(-1.8384F, 0.1907F, 0.6531F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.2938F, 0.1119F, 1.5477F));
		PartDefinition cube_r51 = arml.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(102, 25).addBox(-3.1939F, 0.0275F, -0.5051F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.2638F, -0.2035F, 1.5716F));
		PartDefinition cube_r52 = arml.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(91, 19).addBox(-1.8491F, 0.524F, -0.5051F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.27F, 0.0464F, 1.65F));
		PartDefinition cube_r53 = arml.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(95, 11).addBox(-1.8552F, 0.3999F, -2.2573F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.2866F, -0.3979F, 2.3165F));
		PartDefinition cube_r54 = arml.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(82, 35).addBox(-3.1677F, -0.0939F, -2.2573F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.2407F, -0.6476F, 2.2254F));
		PartDefinition cube_r55 = arml.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(105, 33).addBox(-3.0708F, 0.0644F, -1.5475F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.2222F, -0.347F, 1.7758F));
		PartDefinition cube_r56 = arml.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(96, 19).addBox(-1.7206F, 0.5277F, -1.5475F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.2421F, -0.0999F, 1.8648F));
		PartDefinition cube_r57 = arml.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(101, 15).addBox(-0.536F, 0.116F, -1.6115F, 4.0722F, 1.696F, 3.8791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.2584F, 0.2079F, 1.6374F));
		PartDefinition cube_r58 = arml.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(105, 25).addBox(-2.0728F, -3.5075F, 0.1474F, 3.6722F, 3.796F, 3.1791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.424F, -4.2305F, -8.3418F, -1.8326F, 0.3054F, 0.0F));
		PartDefinition cube_r59 = arml.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(23, 25).addBox(-1.7861F, -4.2154F, -0.338F, 3.8722F, 7.796F, 3.6791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.65F, -2.0226F, -2.1891F, -1.8326F, 0.0F, 0.0F));
		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.149F, 5.8145F, 1.6671F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r60 = armr.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(95, 29).addBox(0.2999F, 0.051F, 1.2138F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.5343F, -0.3922F, -0.9504F));
		PartDefinition cube_r61 = armr.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(105, 8).addBox(1.6282F, -0.3835F, 1.2138F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.5368F, -0.1306F, -0.9408F));
		PartDefinition cube_r62 = armr.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(84, 28).addBox(1.8251F, -0.2917F, 0.6531F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.2928F, 0.14F, -1.4762F));
		PartDefinition cube_r63 = armr.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(94, 10).addBox(0.4663F, 0.1907F, 0.6531F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.2938F, -0.1119F, -1.5477F));
		PartDefinition cube_r64 = armr.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(106, 31).addBox(1.9218F, 0.0275F, -0.5051F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.2638F, 0.2035F, -1.5716F));
		PartDefinition cube_r65 = armr.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(94, 42).addBox(0.477F, 0.524F, -0.5051F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.27F, -0.0464F, -1.65F));
		PartDefinition cube_r66 = armr.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(88, 37).addBox(0.4831F, 0.3999F, -2.2573F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.2866F, 0.3979F, -2.3165F));
		PartDefinition cube_r67 = armr.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(94, 45).addBox(1.8955F, -0.0939F, -2.2573F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.2407F, 0.6476F, -2.2254F));
		PartDefinition cube_r68 = armr.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(98, 43).addBox(1.7986F, 0.0644F, -1.5475F, 1.2722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.2222F, 0.347F, -1.7758F));
		PartDefinition cube_r69 = armr.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(97, 21).addBox(0.3485F, 0.5277F, -1.5475F, 1.3722F, 0.896F, 1.0791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.2421F, 0.0999F, -1.8648F));
		PartDefinition cube_r70 = armr.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(96, 26).addBox(-3.5361F, 0.116F, -1.6115F, 4.0722F, 1.696F, 3.8791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.2584F, -0.2079F, -1.6374F));
		PartDefinition cube_r71 = armr.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(101, 17).addBox(-1.5994F, -3.5075F, 0.1474F, 3.6722F, 3.796F, 3.1791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.424F, -4.2305F, -8.3418F, -1.8326F, -0.3054F, 0.0F));
		PartDefinition cube_r72 = armr.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(31, 18).addBox(-2.0861F, -4.2154F, -0.338F, 3.8722F, 7.796F, 3.6791F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.65F, -2.0226F, -2.1891F, -1.8326F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legr.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armr.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legl.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arml.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
