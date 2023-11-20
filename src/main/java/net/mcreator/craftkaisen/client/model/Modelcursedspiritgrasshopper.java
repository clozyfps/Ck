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
public class Modelcursedspiritgrasshopper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelcursedspiritgrasshopper"), "main");
	public final ModelPart armr2;
	public final ModelPart arml2;
	public final ModelPart armr;
	public final ModelPart arml;
	public final ModelPart legr;
	public final ModelPart legl;
	public final ModelPart body;
	public final ModelPart head;

	public Modelcursedspiritgrasshopper(ModelPart root) {
		this.armr2 = root.getChild("armr2");
		this.arml2 = root.getChild("arml2");
		this.armr = root.getChild("armr");
		this.arml = root.getChild("arml");
		this.legr = root.getChild("legr");
		this.legl = root.getChild("legl");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition armr2 = partdefinition.addOrReplaceChild("armr2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4274F, 0.4848F, -2.1755F, -0.3013F, 0.058F, 0.0785F));
		PartDefinition cube_r1 = armr2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 6).addBox(-1.0F, -1.2F, -1.6F, 2.0F, 3.0F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0188F, 0.6556F, 0.6787F, 0.4296F, -0.1193F, 0.197F));
		PartDefinition cube_r2 = armr2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(6, 6).addBox(-1.0F, 0.9F, -1.2F, 2.0F, 5.4F, 2.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0188F, 0.6556F, 0.6787F, -0.2349F, -0.0333F, 0.3288F));
		PartDefinition cube_r3 = armr2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(7, 7).addBox(-0.3148F, -0.8469F, -0.0594F, 0.8F, 0.65F, 1.3F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.4148F, -0.3469F, -0.5094F, 0.95F, 2.25F, 2.2F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(-0.3148F, 0.0531F, -0.7094F, 0.65F, 1.65F, 0.3F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(-0.3638F, 1.9135F, -0.4008F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(-0.2498F, 1.8314F, 1.0135F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(-0.3139F, 1.8022F, 0.3099F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7153F, 7.2208F, -4.5627F, -1.2739F, -0.1059F, 0.3461F));
		PartDefinition cube_r4 = armr2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 8).addBox(-0.1026F, 0.9896F, 0.1428F, 0.55F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7153F, 7.2208F, -4.5627F, -2.1751F, -0.0448F, 0.2427F));
		PartDefinition cube_r5 = armr2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 8).addBox(-0.8943F, 1.4956F, 0.1428F, 0.55F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7153F, 7.2208F, -4.5627F, -2.2462F, -0.4327F, 0.5359F));
		PartDefinition cube_r6 = armr2
				.addOrReplaceChild(
						"cube_r6", CubeListBuilder.create().texOffs(8, 8).addBox(-1.5526F, 2.1946F, -0.4008F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).texOffs(8, 8)
								.addBox(-1.4569F, 2.1189F, 0.3099F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(-1.4135F, 2.1744F, 1.0135F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.7153F, 7.2208F, -4.5627F, -1.2198F, -0.562F, 0.1857F));
		PartDefinition cube_r7 = armr2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(8, 8).addBox(-0.2961F, 2.0115F, 0.3603F, 0.65F, 0.75F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7153F, 7.2208F, -4.5627F, -0.7494F, -0.1735F, 0.3689F));
		PartDefinition cube_r8 = armr2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 8).addBox(-1.5378F, 2.3128F, 0.3603F, 0.65F, 0.75F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7153F, 7.2208F, -4.5627F, -0.6206F, -0.4813F, -0.0224F));
		PartDefinition cube_r9 = armr2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(7, 7).addBox(-0.8071F, -1.2955F, -0.1975F, 1.7F, 0.6F, 1.6F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-1.0571F, -4.7955F, -0.3475F, 2.2F, 3.5F, 1.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7153F, 7.2208F, -4.5627F, -1.1672F, -0.1421F, 0.2993F));
		PartDefinition arml2 = partdefinition.addOrReplaceChild("arml2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4274F, 0.4848F, -2.1755F, -0.3013F, -0.058F, -0.0785F));
		PartDefinition cube_r10 = arml2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(6, 6).mirror().addBox(-1.0F, -1.2F, -1.6F, 2.0F, 3.0F, 2.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0188F, 0.6556F, 0.6787F, 0.4296F, 0.1193F, -0.197F));
		PartDefinition cube_r11 = arml2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(6, 6).mirror().addBox(-1.0F, 0.9F, -1.2F, 2.0F, 5.4F, 2.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0188F, 0.6556F, 0.6787F, -0.2349F, 0.0333F, -0.3288F));
		PartDefinition cube_r12 = arml2.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(7, 7).mirror().addBox(-0.4852F, -0.8469F, -0.0594F, 0.8F, 0.65F, 1.3F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 6).mirror()
						.addBox(-0.5352F, -0.3469F, -0.5094F, 0.95F, 2.25F, 2.2F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 8).mirror().addBox(-0.3352F, 0.0531F, -0.7094F, 0.65F, 1.65F, 0.3F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(8, 8).mirror().addBox(-0.2862F, 1.9135F, -0.4008F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 8).mirror().addBox(-0.4002F, 1.8314F, 1.0135F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(8, 8).mirror().addBox(-0.3361F, 1.8022F, 0.3099F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7153F, 7.2208F, -4.5627F, -1.2739F, 0.1059F, -0.3461F));
		PartDefinition cube_r13 = arml2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.4474F, 0.9896F, 0.1428F, 0.55F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7153F, 7.2208F, -4.5627F, -2.1751F, 0.0448F, -0.2427F));
		PartDefinition cube_r14 = arml2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(0.3443F, 1.4956F, 0.1428F, 0.55F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7153F, 7.2208F, -4.5627F, -2.2462F, 0.4327F, -0.5359F));
		PartDefinition cube_r15 = arml2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(8, 8).mirror().addBox(0.9026F, 2.1946F, -0.4008F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 8).mirror()
						.addBox(0.8069F, 2.1189F, 0.3099F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 8).mirror().addBox(0.7635F, 2.1744F, 1.0135F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7153F, 7.2208F, -4.5627F, -1.2198F, 0.562F, -0.1857F));
		PartDefinition cube_r16 = arml2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.3539F, 2.0115F, 0.3603F, 0.65F, 0.75F, 0.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7153F, 7.2208F, -4.5627F, -0.7494F, 0.1735F, -0.3689F));
		PartDefinition cube_r17 = arml2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(0.8878F, 2.3128F, 0.3603F, 0.65F, 0.75F, 0.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7153F, 7.2208F, -4.5627F, -0.6206F, 0.4813F, 0.0224F));
		PartDefinition cube_r18 = arml2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(7, 7).mirror().addBox(-0.8929F, -1.2955F, -0.1975F, 1.7F, 0.6F, 1.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 6).mirror()
				.addBox(-1.1429F, -4.7955F, -0.3475F, 2.2F, 3.5F, 1.9F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7153F, 7.2208F, -4.5627F, -1.1672F, 0.1421F, -0.2993F));
		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6535F, 4.8744F, -0.1503F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r19 = armr.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(8, 8).addBox(-0.4F, 2.725F, -2.1F, 0.65F, 1.65F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0685F, 7.6184F, -1.8862F, -0.7388F, 0.0069F, 0.1356F));
		PartDefinition cube_r20 = armr.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(8, 8).addBox(-0.3932F, -0.0962F, -0.2F, 0.65F, 0.75F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.543F, 11.349F, -4.7164F, -0.1588F, -0.1526F, -0.354F));
		PartDefinition cube_r21 = armr.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(8, 8).addBox(-0.3932F, -0.6538F, -0.2F, 0.65F, 0.75F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.543F, 11.349F, -4.7164F, -0.2108F, -0.0627F, 0.1205F));
		PartDefinition cube_r22 = armr.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(8, 8).addBox(-0.325F, -0.275F, -0.3F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.541F, 11.4911F, -5.5446F, -0.6822F, -0.3098F, -0.231F));
		PartDefinition cube_r23 = armr.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(8, 8).addBox(-0.35F, 5.325F, -1.0F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0213F, 7.4352F, -0.8725F, -0.7388F, 0.0069F, 0.1356F));
		PartDefinition cube_r24 = armr.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(8, 8).addBox(-0.325F, -0.275F, -0.3F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.541F, 10.9911F, -6.0446F, -0.6822F, -0.3098F, -0.231F));
		PartDefinition cube_r25 = armr.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(8, 8).addBox(-0.35F, 5.325F, -1.0F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0213F, 6.9352F, -1.3725F, -0.7388F, 0.0069F, 0.1356F));
		PartDefinition cube_r26 = armr.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(8, 8).addBox(-0.3932F, -0.0962F, -0.4F, 0.55F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.243F, 9.049F, -6.4164F, -1.6565F, -0.3668F, 0.1172F));
		PartDefinition cube_r27 = armr.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(8, 8).addBox(-0.3932F, -0.6538F, -0.4F, 0.55F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.243F, 9.049F, -6.4164F, -1.6513F, 0.1116F, 0.0774F));
		PartDefinition cube_r28 = armr.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(8, 8).addBox(-0.325F, -0.275F, -0.3F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.541F, 10.5911F, -6.6446F, -0.6822F, -0.3098F, -0.231F));
		PartDefinition cube_r29 = armr.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(8, 8).addBox(-0.35F, 5.325F, -1.0F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0213F, 6.5352F, -1.9725F, -0.7388F, 0.0069F, 0.1356F));
		PartDefinition cube_r30 = armr.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(6, 6).addBox(-0.5F, 2.325F, -1.1F, 0.95F, 2.25F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9997F, 7.0841F, -2.4775F, -0.7388F, 0.0069F, 0.1356F));
		PartDefinition cube_r31 = armr.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(7, 7).addBox(-0.4F, 1.775F, -0.65F, 0.8F, 0.65F, 1.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0049F, 7.1207F, -2.5112F, -0.7388F, 0.0069F, 0.1356F));
		PartDefinition cube_r32 = armr.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(6, 6).addBox(-0.7F, 0.775F, -0.95F, 1.4F, 0.95F, 1.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0102F, 7.1573F, -2.5449F, -0.7388F, 0.0069F, 0.1356F));
		PartDefinition cube_r33 = armr.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(6, 6).addBox(-0.8F, -1.225F, -1.05F, 1.6F, 1.85F, 2.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0258F, 7.267F, -2.6459F, -0.7388F, 0.0069F, 0.1356F));
		PartDefinition cube_r34 = armr.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(6, 6).addBox(-1.15F, -0.35F, -0.5F, 2.0F, 5.7F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6465F, 1.7949F, -0.2868F, -0.475F, 0.0469F, 0.2132F));
		PartDefinition cube_r35 = armr.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 5).addBox(-1.7F, -0.85F, -2.0F, 3.9F, 3.7F, 3.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0853F, 0.1737F, 0.4036F, 0.1978F, -0.3851F, 0.2804F));
		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6535F, 4.8744F, -0.1503F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r36 = arml.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.25F, 2.725F, -2.1F, 0.65F, 1.65F, 0.3F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0685F, 7.6184F, -1.8862F, -0.7388F, -0.0069F, -0.1356F));
		PartDefinition cube_r37 = arml.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.2568F, -0.0962F, -0.2F, 0.65F, 0.75F, 0.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.543F, 11.349F, -4.7164F, -0.1588F, 0.1526F, 0.354F));
		PartDefinition cube_r38 = arml.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.2568F, -0.6538F, -0.2F, 0.65F, 0.75F, 0.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.543F, 11.349F, -4.7164F, -0.2108F, 0.0627F, -0.1205F));
		PartDefinition cube_r39 = arml.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.325F, -0.275F, -0.3F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.541F, 11.4911F, -5.5446F, -0.6822F, 0.3098F, 0.231F));
		PartDefinition cube_r40 = arml.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.3F, 5.325F, -1.0F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0213F, 7.4352F, -0.8725F, -0.7388F, -0.0069F, -0.1356F));
		PartDefinition cube_r41 = arml.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.325F, -0.275F, -0.3F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.541F, 10.9911F, -6.0446F, -0.6822F, 0.3098F, 0.231F));
		PartDefinition cube_r42 = arml.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.3F, 5.325F, -1.0F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0213F, 6.9352F, -1.3725F, -0.7388F, -0.0069F, -0.1356F));
		PartDefinition cube_r43 = arml.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.1568F, -0.0962F, -0.4F, 0.55F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.243F, 9.049F, -6.4164F, -1.6565F, 0.3668F, -0.1172F));
		PartDefinition cube_r44 = arml.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.1568F, -0.6538F, -0.4F, 0.55F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.243F, 9.049F, -6.4164F, -1.6513F, -0.1116F, -0.0774F));
		PartDefinition cube_r45 = arml.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.325F, -0.275F, -0.3F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.541F, 10.5911F, -6.6446F, -0.6822F, 0.3098F, 0.231F));
		PartDefinition cube_r46 = arml.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(8, 8).mirror().addBox(-0.3F, 5.325F, -1.0F, 0.65F, 0.75F, 0.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0213F, 6.5352F, -1.9725F, -0.7388F, -0.0069F, -0.1356F));
		PartDefinition cube_r47 = arml.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(6, 6).mirror().addBox(-0.45F, 2.325F, -1.1F, 0.95F, 2.25F, 2.2F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.9997F, 7.0841F, -2.4775F, -0.7388F, -0.0069F, -0.1356F));
		PartDefinition cube_r48 = arml.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(7, 7).mirror().addBox(-0.4F, 1.775F, -0.65F, 0.8F, 0.65F, 1.3F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0049F, 7.1207F, -2.5112F, -0.7388F, -0.0069F, -0.1356F));
		PartDefinition cube_r49 = arml.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(6, 6).mirror().addBox(-0.7F, 0.775F, -0.95F, 1.4F, 0.95F, 1.9F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0102F, 7.1573F, -2.5449F, -0.7388F, -0.0069F, -0.1356F));
		PartDefinition cube_r50 = arml.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(6, 6).mirror().addBox(-0.8F, -1.225F, -1.05F, 1.6F, 1.85F, 2.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0258F, 7.267F, -2.6459F, -0.7388F, -0.0069F, -0.1356F));
		PartDefinition cube_r51 = arml.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(6, 6).mirror().addBox(-0.85F, -0.35F, -0.5F, 2.0F, 5.7F, 2.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6465F, 1.7949F, -0.2868F, -0.475F, -0.0469F, -0.2132F));
		PartDefinition cube_r52 = arml.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(5, 5).mirror().addBox(-2.2F, -0.85F, -2.0F, 3.9F, 3.7F, 3.4F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0853F, 0.1737F, 0.4036F, 0.1978F, 0.3851F, -0.2804F));
		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create().texOffs(3, 3).addBox(-2.9F, 11.1952F, -7.0304F, 2.4F, 1.0F, 5.8F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 11.8048F, 1.7304F));
		PartDefinition cube_r53 = legr.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(13, 12).addBox(-1.8F, -6.6F, -1.65F, 3.6F, 5.3F, 3.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7F, 5.3F, -1.9F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r54 = legr.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(5, 5).addBox(-1.55F, -1.3F, -1.4F, 3.1F, 4.3F, 3.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7F, 4.6612F, -2.026F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r55 = legr.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(5, 5).addBox(-1.3F, -3.95F, -1.5F, 2.6F, 6.0F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7F, 9.9452F, -2.7304F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r56 = legr.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(7, 7).addBox(-1.1F, -0.25F, -0.15F, 2.2F, 0.9F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7F, 10.9452F, -4.4804F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r57 = legr.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(6, 6).addBox(-1.1F, -0.25F, -2.45F, 2.2F, 0.5F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7F, 11.0292F, -4.457F, 0.1745F, 0.0F, 0.0F));
		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(3, 3).mirror().addBox(0.5F, 11.1952F, -7.0304F, 2.4F, 1.0F, 5.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.5F, 11.8048F, 1.7304F));
		PartDefinition cube_r58 = legl.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(9, 9).mirror().addBox(-1.8F, -6.6F, -1.65F, 3.6F, 5.3F, 3.6F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7F, 5.3F, -1.9F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r59 = legl.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(5, 5).mirror().addBox(-1.55F, -1.3F, -1.4F, 3.1F, 4.3F, 3.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7F, 4.6612F, -2.026F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r60 = legl.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(5, 5).mirror().addBox(-1.3F, -3.95F, -1.5F, 2.6F, 6.0F, 2.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7F, 9.9452F, -2.7304F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r61 = legl.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(7, 7).mirror().addBox(-1.1F, -0.25F, -0.15F, 2.2F, 0.9F, 1.1F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7F, 10.9452F, -4.4804F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r62 = legl.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(6, 6).mirror().addBox(-1.1F, -0.25F, -2.45F, 2.2F, 0.5F, 2.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.7F, 11.0292F, -4.457F, 0.1745F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(49, 5).addBox(-1.5F, 5.1863F, -2.1294F, 3.0F, 3.1F, 5.25F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(25, 43).addBox(-2.0F, -2.425F, -0.8F, 4.0F, 1.8F, 0.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.9856F, -1.6554F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(1, 8).addBox(-3.75F, -5.6F, 0.0F, 7.5F, 4.45F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.9317F, 0.2766F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(2, 0).addBox(-3.75F, -1.6F, 0.0F, 7.5F, 3.2F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5851F, -1.1591F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 9).addBox(-3.75F, -11.2F, 0.0F, 7.5F, 11.2F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, 1.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(15, 51).addBox(-2.5F, -2.425F, -4.0F, 5.0F, 3.35F, 3.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0855F, -1.6511F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(9, 7).addBox(-2.75F, -9.1F, -2.45F, 5.5F, 2.45F, 3.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.4728F, 1.9319F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(44, 6).mirror().addBox(1.0F, 0.3F, -3.0F, 3.0F, 2.2F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(59, 18).addBox(-4.0F, 0.3F, -3.0F, 3.0F, 2.2F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0485F, 1.9704F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(13, 45).addBox(-3.75F, -5.6F, 3.0F, 7.5F, 4.45F, 1.5F, new CubeDeformation(0.0F)).texOffs(46, 7).addBox(-4.0F, -5.85F, -3.0F, 8.0F, 4.2F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.9317F, 1.2766F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(14, 37).addBox(-3.75F, -1.6F, 3.0F, 7.5F, 3.2F, 1.5F, new CubeDeformation(0.0F)).texOffs(50, 11).addBox(-4.0F, -1.35F, -3.0F, 8.0F, 2.7F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5851F, -0.1591F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, -0.5726F, 0.3928F, 6.0F, 9.2F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, -11.5191F, 7.4314F, -0.3542F, -0.1245F, -0.5996F));
		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 65).addBox(-1.75F, -3.9607F, 0.3126F, 5.5F, 5.45F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, -11.5191F, 7.4314F, -0.1796F, -0.1245F, -0.5996F));
		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 65).addBox(-1.25F, -6.0227F, 0.9459F, 4.5F, 4.2F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, -11.5191F, 7.4314F, 0.0385F, -0.1245F, -0.5996F));
		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-4.0F, -0.5726F, 0.3928F, 6.0F, 9.2F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.25F, -11.5191F, 7.4314F, -0.3542F, 0.1245F, 0.5996F));
		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-3.75F, -3.9607F, 0.3126F, 5.5F, 5.45F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.25F, -11.5191F, 7.4314F, -0.1796F, 0.1245F, 0.5996F));
		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-3.25F, -6.0227F, 0.9459F, 4.5F, 4.2F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.25F, -11.5191F, 7.4314F, 0.0385F, 0.1245F, 0.5996F));
		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-4.0F, -8.6274F, 0.3928F, 6.0F, 9.2F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.25F, -0.4809F, 7.4314F, 0.3542F, 0.1245F, -0.5996F));
		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-3.75F, -1.4893F, 0.3126F, 5.5F, 5.45F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.25F, -0.4809F, 7.4314F, 0.1796F, 0.1245F, -0.5996F));
		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-3.25F, 1.8227F, 0.9459F, 4.5F, 4.2F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.25F, -0.4809F, 7.4314F, -0.0385F, 0.1245F, -0.5996F));
		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 65).addBox(-1.25F, 1.8227F, 0.9459F, 4.5F, 4.2F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, -0.4809F, 7.4314F, -0.0385F, -0.1245F, 0.5996F));
		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(0, 65).addBox(-1.75F, -1.4893F, 0.3126F, 5.5F, 5.45F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, -0.4809F, 7.4314F, 0.1796F, -0.1245F, 0.5996F));
		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, -8.6274F, 0.3928F, 6.0F, 9.2F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, -0.4809F, 7.4314F, 0.3542F, -0.1245F, 0.5996F));
		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(17, 39).addBox(-1.5F, -12.05F, 5.5F, 3.0F, 2.7F, 0.5F, new CubeDeformation(0.0F)).texOffs(15, 37).addBox(-2.75F, -12.8F, 3.0F, 5.5F, 4.2F, 2.5F, new CubeDeformation(0.0F)).texOffs(12, 46)
						.addBox(-3.75F, -11.2F, 3.0F, 7.5F, 11.2F, 1.5F, new CubeDeformation(0.0F)).texOffs(45, 8).addBox(-4.0F, -10.7F, -3.0F, 8.0F, 10.7F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 2.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(43, 43).addBox(-1.0F, -1.05F, -0.875F, 2.0F, 2.1F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.3839F, -3.5031F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(44, 41).addBox(-1.25F, 0.4F, -7.05F, 2.5F, 2.6F, 1.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0891F, 4.1035F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(50, 12).addBox(-2.25F, 0.8F, 0.75F, 4.5F, 2.2F, 2.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.2122F, 1.8611F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(52, 7).mirror().addBox(0.35F, -9.2F, -8.5F, 2.75F, 2.8F, 0.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 7).addBox(-3.1F, -9.2F, -8.5F, 2.75F, 2.8F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.1318F, 6.924F, 0.1745F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.7F, -4.7F));
		PartDefinition cube_r89 = head.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(31, 45).addBox(-0.3651F, -0.3101F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)).texOffs(31, 45).addBox(-0.5651F, -0.1101F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3833F, -5.0014F, 1.5236F, 0.3923F, -0.0181F));
		PartDefinition cube_r90 = head.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(31, 45).addBox(-0.15F, 0.0599F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3833F, -5.0014F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r91 = head.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(31, 45).mirror().addBox(0.2651F, -0.1101F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)).mirror(false).texOffs(31, 45).mirror()
				.addBox(0.0651F, -0.3101F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.3833F, -5.0014F, 1.5236F, -0.3923F, 0.0181F));
		PartDefinition cube_r92 = head.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(31, 45).mirror().addBox(-0.15F, 0.325F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)).mirror(false).texOffs(31, 45).mirror()
				.addBox(-0.35F, 0.125F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.55F, 1.415F, -5.3424F, 1.7123F, -0.3892F, -0.054F));
		PartDefinition cube_r93 = head.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(31, 45).addBox(-0.1082F, 0.125F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0418F, 1.3918F, -5.1659F, 1.7017F, 0.0F, 0.0F));
		PartDefinition cube_r94 = head.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(31, 45).addBox(0.05F, 0.125F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)).texOffs(31, 45).addBox(-0.15F, 0.325F, -0.35F, 0.3F, 0.15F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.55F, 1.415F, -5.3424F, 1.7123F, 0.3892F, 0.054F));
		PartDefinition cube_r95 = head.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(1, 1).addBox(-1.5F, -0.65F, -0.3F, 3.0F, 3.25F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.9844F, -4.6875F, 1.7017F, 0.0F, 0.0F));
		PartDefinition cube_r96 = head.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(4, 4).addBox(-2.3F, -2.475F, -1.6F, 4.6F, 3.55F, 4.2F, new CubeDeformation(0.0F)).texOffs(5, 5).addBox(-2.5F, -2.175F, -1.5F, 5.0F, 4.05F, 3.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1779F, -0.1596F, 1.7017F, 0.0F, 0.0F));
		PartDefinition cube_r97 = head.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.925F, -1.325F, 1.0F, 5.6F, 1.95F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.3553F, 0.7122F, -2.2348F, 1.5286F, 0.0113F, 0.2616F));
		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.925F, -1.325F, 1.0F, 5.6F, 1.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3553F, 0.7122F, -2.2348F, 1.5286F, -0.0113F, -0.2616F));
		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(6, 6).addBox(-1.3F, -0.05F, -0.6F, 1.9F, 0.2F, 1.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.123F, -5.8833F, 1.5413F, 0.0322F, 0.8286F));
		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(6, 6).addBox(-1.85F, -8.825F, -3.6F, 3.7F, 0.45F, 1.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.379F, 3.1988F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(4, 4).addBox(-2.0F, -8.625F, -3.45F, 4.0F, 0.25F, 4.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.3811F, 3.1488F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(67, 70).mirror().addBox(1.15F, -8.725F, -1.95F, 0.95F, 1.25F, 2.95F, new CubeDeformation(0.0F)).mirror(false).texOffs(67, 70)
						.addBox(-2.1F, -8.725F, -1.95F, 0.95F, 1.25F, 2.95F, new CubeDeformation(0.0F)).texOffs(3, 3).addBox(-2.0F, -8.325F, -3.85F, 4.0F, 5.85F, 4.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.3833F, 3.0989F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(4, 46).mirror().addBox(-0.3F, -0.275F, 1.025F, 0.6F, 0.55F, 0.35F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0025F, -8.326F, -3.7855F, 1.3114F, 0.0339F, 0.1709F));
		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(2, 44).mirror().addBox(-0.3F, -0.275F, -1.075F, 0.6F, 0.55F, 2.15F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0926F, -8.2992F, -3.6487F, 1.4404F, 0.0114F, 0.0865F));
		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(2, 44).mirror().addBox(0.7F, -7.325F, 1.65F, 0.6F, 0.55F, 2.15F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 44).addBox(-1.3F, -7.325F, 1.65F, 0.6F, 0.55F, 2.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.1834F, 3.0945F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r106 = head.addOrReplaceChild("cube_r106",
				CubeListBuilder.create().texOffs(8, 8).mirror().addBox(0.5F, -7.525F, 1.35F, 1.0F, 0.95F, 0.25F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 8).addBox(-1.5F, -7.525F, 1.35F, 1.0F, 0.95F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2334F, 3.0967F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r107 = head.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(4, 46).addBox(-0.3F, -0.275F, 1.025F, 0.6F, 0.55F, 0.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0025F, -8.326F, -3.7855F, 1.3114F, -0.0339F, -0.1709F));
		PartDefinition cube_r108 = head.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(2, 44).addBox(-0.3F, -0.275F, -1.075F, 0.6F, 0.55F, 2.15F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0926F, -8.2992F, -3.6487F, 1.4404F, -0.0114F, -0.0865F));
		PartDefinition cube_r109 = head.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(8, 8).addBox(-1.8F, -8.125F, 0.95F, 3.6F, 5.45F, 0.35F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.3334F, 3.0967F, 1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r110 = head.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(24, 44).addBox(-1.5F, -2.425F, -0.4F, 3.0F, 0.8F, 0.85F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.2356F, 3.0424F, 1.5272F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 75, 75);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armr2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.armr2.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legr.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armr.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legl.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arml.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.arml2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
