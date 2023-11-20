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
public class Modelmouthcursedspirit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelmouthcursedspirit"), "main");
	public final ModelPart legr;
	public final ModelPart legl;
	public final ModelPart armr;
	public final ModelPart arml;
	public final ModelPart body;
	public final ModelPart eye;

	public Modelmouthcursedspirit(ModelPart root) {
		this.legr = root.getChild("legr");
		this.legl = root.getChild("legl");
		this.armr = root.getChild("armr");
		this.arml = root.getChild("arml");
		this.body = root.getChild("body");
		this.eye = root.getChild("eye");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1273F, 12.8651F, -0.8197F, 0.0151F, 0.043F, 0.0866F));
		PartDefinition cube_r1 = legr.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-1.8F, -0.75F, -1.8F, 3.6F, 2.5F, 3.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.2182F, 0.0F, 0.2618F));
		PartDefinition cube_r2 = legr.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(3, 3).addBox(-0.7568F, -0.6791F, -0.2414F, 1.5F, 1.2F, 2.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6096F, 10.2241F, -5.1914F, -0.0873F, 0.4363F, 0.0F));
		PartDefinition cube_r3 = legr.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 3).addBox(-0.7619F, -0.7185F, -1.7043F, 1.5F, 1.2F, 1.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6096F, 10.2241F, -5.1914F, 0.1307F, 0.4158F, 0.002F));
		PartDefinition cube_r4 = legr.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(4, 3).addBox(-0.7619F, -0.7185F, -1.7043F, 1.5F, 1.2F, 1.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9904F, 10.2241F, -5.5914F, 0.1296F, -0.195F, 0.0018F));
		PartDefinition cube_r5 = legr.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 3).addBox(-0.7568F, -0.6791F, -0.2414F, 1.5F, 1.2F, 2.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9904F, 10.2241F, -5.5914F, -0.0873F, -0.1745F, 0.0F));
		PartDefinition cube_r6 = legr.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(4, 3).addBox(-0.75F, -0.6F, -3.35F, 1.5F, 1.2F, 1.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.813F, 9.8933F, -4.0777F, 0.1301F, 0.0668F, 0.0018F));
		PartDefinition cube_r7 = legr.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(3, 3).addBox(-0.75F, -0.6F, -1.05F, 1.5F, 1.2F, 2.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8455F, 10.2157F, -4.8815F, -0.0873F, 0.0873F, 0.0F));
		PartDefinition cube_r8 = legr.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-2.3F, 4.05F, -3.5F, 4.5F, 1.7F, 5.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3962F, 5.3657F, -0.3842F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r9 = legr.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(2, 1).addBox(-1.8F, -1.25F, -1.8F, 3.6F, 5.1F, 3.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1537F, 7.1738F, 0.3978F, -0.4327F, 0.0836F, 0.1643F));
		PartDefinition cube_r10 = legr.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(2, 1).addBox(-1.8F, -0.25F, -1.8F, 3.6F, 4.5F, 3.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1964F, 3.2103F, 0.1552F, 0.1249F, 0.0393F, -0.0412F));
		PartDefinition cube_r11 = legr.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(2, 1).addBox(-1.8F, -1.25F, -1.8F, 3.6F, 2.5F, 3.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2131F, 2.0627F, -0.1392F, 0.2574F, 0.0338F, 0.0021F));
		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1273F, 12.8651F, -0.8197F, 0.0151F, -0.043F, -0.0866F));
		PartDefinition cube_r12 = legl.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-1.8F, -0.75F, -1.8F, 3.6F, 2.5F, 3.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.2182F, 0.0F, -0.2618F));
		PartDefinition cube_r13 = legl.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(-0.7432F, -0.6791F, -0.2414F, 1.5F, 1.2F, 2.3F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6096F, 10.2241F, -5.1914F, -0.0873F, -0.4363F, 0.0F));
		PartDefinition cube_r14 = legl.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(-0.7381F, -0.7185F, -1.7043F, 1.5F, 1.2F, 1.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6096F, 10.2241F, -5.1914F, 0.1307F, -0.4158F, -0.002F));
		PartDefinition cube_r15 = legl.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(-0.7381F, -0.7185F, -1.7043F, 1.5F, 1.2F, 1.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.9904F, 10.2241F, -5.5914F, 0.1296F, 0.195F, -0.0018F));
		PartDefinition cube_r16 = legl.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(-0.7432F, -0.6791F, -0.2414F, 1.5F, 1.2F, 2.3F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.9904F, 10.2241F, -5.5914F, -0.0873F, 0.1745F, 0.0F));
		PartDefinition cube_r17 = legl.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(-0.75F, -0.6F, -3.35F, 1.5F, 1.2F, 1.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.813F, 9.8933F, -4.0777F, 0.1301F, -0.0668F, -0.0018F));
		PartDefinition cube_r18 = legl.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(-0.75F, -0.6F, -1.05F, 1.5F, 1.2F, 2.3F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8455F, 10.2157F, -4.8815F, -0.0873F, -0.0873F, 0.0F));
		PartDefinition cube_r19 = legl.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.2F, 4.05F, -3.5F, 4.5F, 1.7F, 5.3F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3962F, 5.3657F, -0.3842F, 0.0F, -0.0873F, 0.0F));
		PartDefinition cube_r20 = legl.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-1.8F, -1.25F, -1.8F, 3.6F, 5.1F, 3.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1537F, 7.1738F, 0.3978F, -0.4327F, -0.0836F, -0.1643F));
		PartDefinition cube_r21 = legl.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-1.8F, -0.25F, -1.8F, 3.6F, 4.5F, 3.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1964F, 3.2103F, 0.1552F, 0.1249F, -0.0393F, 0.0412F));
		PartDefinition cube_r22 = legl.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-1.8F, -1.25F, -1.8F, 3.6F, 2.5F, 3.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2131F, 2.0627F, -0.1392F, 0.2574F, -0.0338F, -0.0021F));
		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create(), PartPose.offset(-4.4F, -0.3F, -0.7F));
		PartDefinition cube_r23 = armr.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(3, 3).addBox(-3.8291F, 15.0896F, -1.0629F, 0.9F, 1.2F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2007F, -0.3212F, 0.0648F, -0.1022F, -0.0564F, 0.0668F));
		PartDefinition cube_r24 = armr.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(3, 3).addBox(-3.8291F, 13.3431F, 4.1622F, 0.9F, 1.2F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2007F, -0.3212F, 0.0648F, -0.4512F, -0.0564F, 0.0668F));
		PartDefinition cube_r25 = armr.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(2, 2).addBox(-5.9967F, 13.1285F, -5.075F, 0.9F, 1.0F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2007F, -0.3212F, 0.0648F, 0.4194F, -0.026F, -0.0825F));
		PartDefinition cube_r26 = armr.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(2, 2).addBox(-9.449F, 12.095F, -5.075F, 0.9F, 0.9F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2007F, -0.3212F, 0.0648F, 0.4129F, 0.0803F, -0.3219F));
		PartDefinition cube_r27 = armr
				.addOrReplaceChild(
						"cube_r27", CubeListBuilder.create().texOffs(2, 2).addBox(-5.7859F, 14.8917F, 0.5895F, 0.9F, 1.2F, 0.8F, new CubeDeformation(0.0F)).texOffs(2, 2)
								.addBox(-5.8495F, 14.8998F, -0.5086F, 0.9F, 1.2F, 0.8F, new CubeDeformation(0.0F)).texOffs(2, 2).addBox(-5.9131F, 14.9079F, -1.6067F, 0.9F, 1.2F, 0.8F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-0.2007F, -0.3212F, 0.0648F, -0.0074F, -0.0578F, -0.0643F));
		PartDefinition cube_r28 = armr
				.addOrReplaceChild(
						"cube_r28", CubeListBuilder.create().texOffs(2, 2).addBox(-9.7536F, 14.0458F, 0.5895F, 0.9F, 0.9F, 0.8F, new CubeDeformation(0.0F)).texOffs(2, 2)
								.addBox(-9.8171F, 14.0372F, -0.5086F, 0.9F, 0.9F, 0.8F, new CubeDeformation(0.0F)).texOffs(2, 2).addBox(-9.8807F, 14.0286F, -1.6067F, 0.9F, 0.9F, 0.8F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-0.2007F, -0.3212F, 0.0648F, 0.0078F, -0.0578F, -0.3266F));
		PartDefinition cube_r29 = armr.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.1291F, 13.5875F, -1.7067F, 1.5F, 2.0F, 3.3F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.3291F, 4.5875F, -1.9067F, 2.8F, 9.0F, 3.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2007F, -0.3212F, 0.0648F, -0.0149F, -0.0564F, 0.0668F));
		PartDefinition cube_r30 = armr.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-3.2035F, 1.5513F, -2.3134F, 3.2F, 4.0F, 3.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2007F, -0.3212F, 0.0648F, 0.0585F, -0.0707F, 0.2849F));
		PartDefinition cube_r31 = armr.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-1.2933F, -0.4034F, -1.9659F, 3.5F, 4.0F, 3.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2007F, -0.3212F, 0.0648F, -0.1572F, 0.0762F, 1.1459F));
		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create(), PartPose.offset(4.4F, -0.3F, -0.7F));
		PartDefinition cube_r32 = arml.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(2.9291F, 15.0896F, -1.0629F, 0.9F, 1.2F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2007F, -0.3212F, 0.0648F, -0.1022F, 0.0564F, -0.0668F));
		PartDefinition cube_r33 = arml.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(2.9291F, 13.3431F, 4.1622F, 0.9F, 1.2F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2007F, -0.3212F, 0.0648F, -0.4512F, 0.0564F, -0.0668F));
		PartDefinition cube_r34 = arml.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(2, 2).mirror().addBox(5.0967F, 13.1285F, -5.075F, 0.9F, 1.0F, 0.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2007F, -0.3212F, 0.0648F, 0.4194F, 0.026F, 0.0825F));
		PartDefinition cube_r35 = arml.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(2, 2).mirror().addBox(8.549F, 12.095F, -5.075F, 0.9F, 0.9F, 0.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2007F, -0.3212F, 0.0648F, 0.4129F, -0.0803F, 0.3219F));
		PartDefinition cube_r36 = arml.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(2, 2).mirror().addBox(4.8859F, 14.8917F, 0.5895F, 0.9F, 1.2F, 0.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 2).mirror()
						.addBox(4.9495F, 14.8998F, -0.5086F, 0.9F, 1.2F, 0.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 2).mirror().addBox(5.0131F, 14.9079F, -1.6067F, 0.9F, 1.2F, 0.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2007F, -0.3212F, 0.0648F, -0.0074F, 0.0578F, 0.0643F));
		PartDefinition cube_r37 = arml.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(2, 2).mirror().addBox(8.8536F, 14.0458F, 0.5895F, 0.9F, 0.9F, 0.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 2).mirror()
						.addBox(8.9171F, 14.0372F, -0.5086F, 0.9F, 0.9F, 0.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 2).mirror().addBox(8.9807F, 14.0286F, -1.6067F, 0.9F, 0.9F, 0.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2007F, -0.3212F, 0.0648F, 0.0078F, 0.0578F, 0.3266F));
		PartDefinition cube_r38 = arml.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(2.6291F, 13.5875F, -1.7067F, 1.5F, 2.0F, 3.3F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(1.5291F, 4.5875F, -1.9067F, 2.8F, 9.0F, 3.7F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2007F, -0.3212F, 0.0648F, -0.0149F, 0.0564F, -0.0668F));
		PartDefinition cube_r39 = arml.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.0035F, 1.5513F, -2.3134F, 3.2F, 4.0F, 3.7F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2007F, -0.3212F, 0.0648F, 0.0585F, 0.0707F, -0.2849F));
		PartDefinition cube_r40 = arml.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.2067F, -0.4034F, -1.9659F, 3.5F, 4.0F, 3.7F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.2007F, -0.3212F, 0.0648F, -0.1572F, -0.0762F, -1.1459F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(7, 7).addBox(-3.4F, 2.289F, 3.6838F, 3.6F, 0.5F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.9F, -8.711F, 1.0838F, 3.1F, 8.1F, 10.8F, new CubeDeformation(0.0F)).texOffs(10, 10)
						.addBox(-2.2F, -8.711F, 10.2838F, 5.4F, 8.0F, 0.8F, new CubeDeformation(0.0F)).texOffs(10, 10).addBox(-2.2F, -12.711F, 9.7838F, 5.4F, 4.0F, 0.8F, new CubeDeformation(0.0F)).texOffs(7, 7)
						.addBox(-2.2F, -19.911F, 5.4838F, 5.4F, 3.2F, 3.3F, new CubeDeformation(0.0F)).texOffs(9, 9).addBox(-1.3F, -20.911F, 5.3838F, 3.6F, 1.6F, 1.5F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-4.8F, -0.711F, 1.3838F, 10.6F, 3.0F, 9.1F, new CubeDeformation(0.0F)).texOffs(7, 7).addBox(-2.8F, -0.711F, 10.4838F, 6.6F, 2.3F, 2.2F, new CubeDeformation(0.0F)).texOffs(10, 10)
						.addBox(-2.8F, -11.011F, 11.0838F, 6.6F, 2.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(10, 10).addBox(-1.8F, -15.011F, 9.5838F, 4.6F, 2.3F, 0.8F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-4.3F, -12.711F, 1.3838F, 3.5F, 4.0F, 9.7F, new CubeDeformation(0.0F)).texOffs(3, 3).addBox(-3.3F, -18.711F, 1.7838F, 7.5F, 6.0F, 7.8F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-2.8F, -19.711F, 1.8838F, 6.6F, 1.0F, 7.4F, new CubeDeformation(0.0F)).texOffs(12, 3).addBox(-2.3F, -15.711F, 1.5838F, 5.5F, 3.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(5, 5)
						.addBox(-2.1F, -20.811F, 1.9838F, 5.1F, 2.1F, 5.6F, new CubeDeformation(0.0F)).texOffs(1, 1).mirror().addBox(1.8F, -12.711F, 1.3838F, 3.5F, 4.0F, 9.7F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 4).mirror()
						.addBox(-0.8F, -12.711F, 4.7838F, 2.6F, 4.0F, 6.3F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(2.8F, -8.711F, 1.0838F, 3.1F, 8.1F, 10.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 10)
						.mirror().addBox(1.7F, -8.411F, 2.3838F, 1.1F, 2.1F, 0.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 10).mirror().addBox(1.7F, -5.811F, 2.3838F, 1.1F, 2.1F, 0.8F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(10, 10).addBox(-1.8F, -5.811F, 2.3838F, 1.1F, 2.1F, 0.8F, new CubeDeformation(0.0F)).texOffs(10, 10).addBox(-1.8F, -8.411F, 2.3838F, 1.1F, 2.1F, 0.8F, new CubeDeformation(0.0F)).texOffs(10, 10)
						.addBox(-0.8F, -11.611F, 2.3838F, 0.8F, 2.1F, 0.8F, new CubeDeformation(0.0F)).texOffs(10, 10).mirror().addBox(1.0F, -11.611F, 2.3838F, 0.8F, 2.1F, 0.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 3).mirror()
						.addBox(-1.8F, -8.711F, 4.7838F, 4.6F, 8.1F, 7.1F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 8).mirror().addBox(-3.8F, -5.711F, 11.7838F, 8.6F, 5.1F, 2.1F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 44)
						.mirror().addBox(-0.8F, -12.711F, 3.7838F, 2.6F, 4.0F, 3.3F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 43).mirror().addBox(-1.8F, -8.711F, 3.7838F, 4.6F, 8.1F, 4.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-0.5F, 10.711F, -6.1838F));
		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(22, 44).addBox(-0.8F, 2.875F, -0.8182F, 2.6F, 3.4F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 44).addBox(-1.5F, 1.875F, -0.8182F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 44)
						.addBox(-2.0F, -0.125F, -0.8182F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 44).addBox(-2.4F, -1.125F, -0.8182F, 5.8F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 44)
						.addBox(-2.7F, -2.125F, -0.8182F, 6.4F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(22, 44).addBox(-3.0F, -5.0681F, -0.7136F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(6, 6).mirror().addBox(-1.8F, -1.7F, -3.3F, 2.6F, 2.7F, 4.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.2412F, -18.7449F, 5.6838F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(6, 6).addBox(-0.8F, -1.7F, -3.3F, 2.6F, 2.7F, 4.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2412F, -18.7449F, 5.6838F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(-0.85F, -0.9F, -3.9F, 0.7F, 4.0F, 7.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.55F, -14.711F, 5.6838F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(3, 3).addBox(0.05F, -0.9F, -3.9F, 0.7F, 4.0F, 7.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.55F, -14.711F, 5.6838F, 0.0F, 0.0F, 0.2618F));
		PartDefinition eye = partdefinition.addOrReplaceChild("eye",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -7.2F, -0.8967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)).texOffs(2, 42).addBox(-0.25F, -4.7967F, -3.3F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.1F, -7.5F, -2.4F));
		PartDefinition hexadecagon_r1 = eye.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.3562F, -0.1745F, -3.1416F));
		PartDefinition hexadecagon_r2 = eye.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(1, 43).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.7489F, -0.1745F, -3.1416F));
		PartDefinition hexadecagon_r3 = eye.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(2, 42).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -3.1416F, -0.1745F, 3.1416F));
		PartDefinition hexadecagon_r4 = eye.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(26, 16).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.7489F, -0.1745F, 3.1416F));
		PartDefinition hexadecagon_r5 = eye.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.3562F, -0.1745F, 3.1416F));
		PartDefinition hexadecagon_r6 = eye.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.3562F, -0.3491F, 3.1416F));
		PartDefinition hexadecagon_r7 = eye.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(26, 15).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.7489F, -0.3491F, 3.1416F));
		PartDefinition hexadecagon_r8 = eye.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(27, 16).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -3.1416F, -0.3491F, 3.1416F));
		PartDefinition hexadecagon_r9 = eye.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(26, 15).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.7489F, -0.3491F, 3.1416F));
		PartDefinition hexadecagon_r10 = eye.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.3562F, -0.3491F, -3.1416F));
		PartDefinition hexadecagon_r11 = eye.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.3562F, -0.5236F, -3.1416F));
		PartDefinition hexadecagon_r12 = eye.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.7489F, -0.5236F, 3.1416F));
		PartDefinition hexadecagon_r13 = eye.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -3.1416F, -0.5236F, 3.1416F));
		PartDefinition hexadecagon_r14 = eye.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.7489F, -0.5236F, -3.1416F));
		PartDefinition hexadecagon_r15 = eye.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.3562F, -0.5236F, 3.1416F));
		PartDefinition hexadecagon_r16 = eye.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.3562F, -0.6981F, -3.1416F));
		PartDefinition hexadecagon_r17 = eye.addOrReplaceChild("hexadecagon_r17",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.7489F, -0.6981F, -3.1416F));
		PartDefinition hexadecagon_r18 = eye.addOrReplaceChild("hexadecagon_r18",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -3.1416F, -0.6981F, 3.1416F));
		PartDefinition hexadecagon_r19 = eye.addOrReplaceChild("hexadecagon_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.7489F, -0.6981F, 3.1416F));
		PartDefinition hexadecagon_r20 = eye.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.3562F, -0.6981F, 3.1416F));
		PartDefinition hexadecagon_r21 = eye.addOrReplaceChild("hexadecagon_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.3562F, -0.8727F, 3.1416F));
		PartDefinition hexadecagon_r22 = eye.addOrReplaceChild("hexadecagon_r22",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.7489F, -0.8727F, -3.1416F));
		PartDefinition hexadecagon_r23 = eye.addOrReplaceChild("hexadecagon_r23",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -3.1416F, -0.8727F, 3.1416F));
		PartDefinition hexadecagon_r24 = eye.addOrReplaceChild("hexadecagon_r24",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.7489F, -0.8727F, 3.1416F));
		PartDefinition hexadecagon_r25 = eye.addOrReplaceChild("hexadecagon_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.3562F, -0.8727F, -3.1416F));
		PartDefinition hexadecagon_r26 = eye.addOrReplaceChild("hexadecagon_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.3562F, -1.0472F, 3.1416F));
		PartDefinition hexadecagon_r27 = eye.addOrReplaceChild("hexadecagon_r27",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.7489F, -1.0472F, 3.1416F));
		PartDefinition hexadecagon_r28 = eye.addOrReplaceChild("hexadecagon_r28",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -3.1416F, -1.0472F, 3.1416F));
		PartDefinition hexadecagon_r29 = eye.addOrReplaceChild("hexadecagon_r29",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.7489F, -1.0472F, 3.1416F));
		PartDefinition hexadecagon_r30 = eye.addOrReplaceChild("hexadecagon_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.3562F, -1.0472F, 3.1416F));
		PartDefinition hexadecagon_r31 = eye.addOrReplaceChild("hexadecagon_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.3562F, -1.2217F, 3.1416F));
		PartDefinition hexadecagon_r32 = eye.addOrReplaceChild("hexadecagon_r32",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.7489F, -1.2217F, 3.1416F));
		PartDefinition hexadecagon_r33 = eye.addOrReplaceChild("hexadecagon_r33",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -3.1416F, -1.2217F, 3.1416F));
		PartDefinition hexadecagon_r34 = eye.addOrReplaceChild("hexadecagon_r34",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.7489F, -1.2217F, -3.1416F));
		PartDefinition hexadecagon_r35 = eye.addOrReplaceChild("hexadecagon_r35", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.3562F, -1.2217F, 3.1416F));
		PartDefinition hexadecagon_r36 = eye.addOrReplaceChild("hexadecagon_r36", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.3562F, -1.3963F, 3.1416F));
		PartDefinition hexadecagon_r37 = eye.addOrReplaceChild("hexadecagon_r37",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -2.7489F, -1.3963F, -3.1416F));
		PartDefinition hexadecagon_r38 = eye.addOrReplaceChild("hexadecagon_r38",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -3.1416F, -1.3963F, 3.1416F));
		PartDefinition hexadecagon_r39 = eye.addOrReplaceChild("hexadecagon_r39",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.7489F, -1.3963F, 3.1416F));
		PartDefinition hexadecagon_r40 = eye.addOrReplaceChild("hexadecagon_r40", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 2.3562F, -1.3963F, 3.1416F));
		PartDefinition hexadecagon_r41 = eye.addOrReplaceChild("hexadecagon_r41", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -1.5708F, 0.7854F));
		PartDefinition hexadecagon_r42 = eye.addOrReplaceChild("hexadecagon_r42",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition hexadecagon_r43 = eye.addOrReplaceChild("hexadecagon_r43",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -1.5708F, 0.0F));
		PartDefinition hexadecagon_r44 = eye.addOrReplaceChild("hexadecagon_r44",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition hexadecagon_r45 = eye.addOrReplaceChild("hexadecagon_r45", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition hexadecagon_r46 = eye.addOrReplaceChild("hexadecagon_r46", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.7854F, -1.3963F, 0.0F));
		PartDefinition hexadecagon_r47 = eye.addOrReplaceChild("hexadecagon_r47",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.3927F, -1.3963F, 0.0F));
		PartDefinition hexadecagon_r48 = eye.addOrReplaceChild("hexadecagon_r48",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -1.3963F, 0.0F));
		PartDefinition hexadecagon_r49 = eye.addOrReplaceChild("hexadecagon_r49",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.3927F, -1.3963F, 0.0F));
		PartDefinition hexadecagon_r50 = eye.addOrReplaceChild("hexadecagon_r50", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.7854F, -1.3963F, 0.0F));
		PartDefinition hexadecagon_r51 = eye.addOrReplaceChild("hexadecagon_r51", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.7854F, -1.2217F, 0.0F));
		PartDefinition hexadecagon_r52 = eye.addOrReplaceChild("hexadecagon_r52",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.3927F, -1.2217F, 0.0F));
		PartDefinition hexadecagon_r53 = eye.addOrReplaceChild("hexadecagon_r53",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -1.2217F, 0.0F));
		PartDefinition hexadecagon_r54 = eye.addOrReplaceChild("hexadecagon_r54",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.3927F, -1.2217F, 0.0F));
		PartDefinition hexadecagon_r55 = eye.addOrReplaceChild("hexadecagon_r55", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.7854F, -1.2217F, 0.0F));
		PartDefinition hexadecagon_r56 = eye.addOrReplaceChild("hexadecagon_r56", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.7854F, -1.0472F, 0.0F));
		PartDefinition hexadecagon_r57 = eye.addOrReplaceChild("hexadecagon_r57",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.3927F, -1.0472F, 0.0F));
		PartDefinition hexadecagon_r58 = eye.addOrReplaceChild("hexadecagon_r58",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -1.0472F, 0.0F));
		PartDefinition hexadecagon_r59 = eye.addOrReplaceChild("hexadecagon_r59",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.3927F, -1.0472F, 0.0F));
		PartDefinition hexadecagon_r60 = eye.addOrReplaceChild("hexadecagon_r60", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.7854F, -1.0472F, 0.0F));
		PartDefinition hexadecagon_r61 = eye.addOrReplaceChild("hexadecagon_r61", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.7854F, -0.8727F, 0.0F));
		PartDefinition hexadecagon_r62 = eye.addOrReplaceChild("hexadecagon_r62",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.3927F, -0.8727F, 0.0F));
		PartDefinition hexadecagon_r63 = eye.addOrReplaceChild("hexadecagon_r63",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -0.8727F, 0.0F));
		PartDefinition hexadecagon_r64 = eye.addOrReplaceChild("hexadecagon_r64",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.3927F, -0.8727F, 0.0F));
		PartDefinition hexadecagon_r65 = eye.addOrReplaceChild("hexadecagon_r65", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.7854F, -0.8727F, 0.0F));
		PartDefinition hexadecagon_r66 = eye.addOrReplaceChild("hexadecagon_r66", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.7854F, -0.6981F, 0.0F));
		PartDefinition hexadecagon_r67 = eye.addOrReplaceChild("hexadecagon_r67",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.3927F, -0.6981F, 0.0F));
		PartDefinition hexadecagon_r68 = eye.addOrReplaceChild("hexadecagon_r68",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -0.6981F, 0.0F));
		PartDefinition hexadecagon_r69 = eye.addOrReplaceChild("hexadecagon_r69",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.3927F, -0.6981F, 0.0F));
		PartDefinition hexadecagon_r70 = eye.addOrReplaceChild("hexadecagon_r70", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.7854F, -0.6981F, 0.0F));
		PartDefinition hexadecagon_r71 = eye.addOrReplaceChild("hexadecagon_r71", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.7854F, -0.5236F, 0.0F));
		PartDefinition hexadecagon_r72 = eye.addOrReplaceChild("hexadecagon_r72",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.3927F, -0.5236F, 0.0F));
		PartDefinition hexadecagon_r73 = eye.addOrReplaceChild("hexadecagon_r73",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -0.5236F, 0.0F));
		PartDefinition hexadecagon_r74 = eye.addOrReplaceChild("hexadecagon_r74",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.3927F, -0.5236F, 0.0F));
		PartDefinition hexadecagon_r75 = eye.addOrReplaceChild("hexadecagon_r75", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.7854F, -0.5236F, 0.0F));
		PartDefinition hexadecagon_r76 = eye.addOrReplaceChild("hexadecagon_r76", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.7854F, -0.3491F, 0.0F));
		PartDefinition hexadecagon_r77 = eye.addOrReplaceChild("hexadecagon_r77",
				CubeListBuilder.create().texOffs(26, 15).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.3927F, -0.3491F, 0.0F));
		PartDefinition hexadecagon_r78 = eye.addOrReplaceChild("hexadecagon_r78",
				CubeListBuilder.create().texOffs(27, 16).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -0.3491F, 0.0F));
		PartDefinition hexadecagon_r79 = eye.addOrReplaceChild("hexadecagon_r79",
				CubeListBuilder.create().texOffs(26, 15).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.3927F, -0.3491F, 0.0F));
		PartDefinition hexadecagon_r80 = eye.addOrReplaceChild("hexadecagon_r80", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.7854F, -0.3491F, 0.0F));
		PartDefinition hexadecagon_r81 = eye.addOrReplaceChild("hexadecagon_r81", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.7854F, -0.1745F, 0.0F));
		PartDefinition hexadecagon_r82 = eye.addOrReplaceChild("hexadecagon_r82",
				CubeListBuilder.create().texOffs(26, 16).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.3927F, -0.1745F, 0.0F));
		PartDefinition hexadecagon_r83 = eye.addOrReplaceChild("hexadecagon_r83",
				CubeListBuilder.create().texOffs(2, 42).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.0F, -0.1745F, 0.0F));
		PartDefinition hexadecagon_r84 = eye.addOrReplaceChild("hexadecagon_r84",
				CubeListBuilder.create().texOffs(1, 43).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.3927F, -0.1745F, 0.0F));
		PartDefinition hexadecagon_r85 = eye.addOrReplaceChild("hexadecagon_r85", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.7854F, -0.1745F, 0.0F));
		PartDefinition hexadecagon_r86 = eye.addOrReplaceChild("hexadecagon_r86", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r87 = eye.addOrReplaceChild("hexadecagon_r87",
				CubeListBuilder.create().texOffs(27, 16).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r88 = eye.addOrReplaceChild("hexadecagon_r88",
				CubeListBuilder.create().texOffs(2, 43).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.25F, -3.0F, -0.5967F, 0.5F, 6.0F, 1.1935F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r89 = eye.addOrReplaceChild("hexadecagon_r89", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -0.5967F, -3.0F, 0.5F, 1.1935F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.2F, -0.3F, -0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 65, 65);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.legr.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armr.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legl.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arml.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
