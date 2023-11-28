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
public class Modelmaximummeteornewwww<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelmaximummeteornewwww"), "main");
	public final ModelPart fg;

	public Modelmaximummeteornewwww(ModelPart root) {
		this.fg = root.getChild("fg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition fg = partdefinition.addOrReplaceChild("fg", CubeListBuilder.create().texOffs(120, 78).addBox(-12.5797F, -18.2788F, -58.2552F, 22.3466F, 37.448F, 112.344F, new CubeDeformation(0.0F)).texOffs(120, 139).addBox(-57.5784F,
				-18.2788F, -13.2565F, 112.344F, 37.448F, 22.3466F, new CubeDeformation(0.0F)), PartPose.offset(1.4064F, -27.0F, 2.0832F));
		PartDefinition wegxbthnyrwe_r1 = fg.addOrReplaceChild("wegxbthnyrwe_r1", CubeListBuilder.create().texOffs(120, 78).addBox(-56.172F, -7.4896F, -11.1733F, 112.344F, 37.448F, 22.3466F, new CubeDeformation(0.0F)).texOffs(120, 78)
				.addBox(-11.1733F, -7.4896F, -56.172F, 22.3466F, 37.448F, 112.344F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4064F, -10.7892F, -2.0832F, 0.0F, -0.3927F, 0.0F));
		PartDefinition egwghsvx_r1 = fg.addOrReplaceChild("egwghsvx_r1", CubeListBuilder.create().texOffs(120, 78).addBox(-56.172F, -7.4896F, -11.1733F, 112.344F, 37.448F, 22.3466F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-11.1733F,
				-7.4896F, -56.172F, 22.3466F, 37.448F, 112.344F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4064F, -10.7892F, -2.0832F, 0.0F, 0.3927F, 0.0F));
		PartDefinition weghwesd_r1 = fg.addOrReplaceChild("weghwesd_r1", CubeListBuilder.create().texOffs(120, 78).addBox(-11.1733F, -7.4896F, -56.172F, 22.3466F, 37.448F, 112.344F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4064F, -10.7892F, -2.0832F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bwebwbe_r1 = fg.addOrReplaceChild("bwebwbe_r1", CubeListBuilder.create().texOffs(138, 167).addBox(-11.1733F, -7.4896F, -56.172F, 22.3466F, 37.448F, 112.344F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4064F, -10.7892F, -2.0832F, 0.0F, 0.7854F, 0.0F));
		PartDefinition black = fg.addOrReplaceChild("black", CubeListBuilder.create().texOffs(120, 99).addBox(-77.8348F, -69.2788F, 7.4896F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)).texOffs(0, 121).addBox(-119.8336F, -69.2788F,
				49.4884F, 104.8544F, 14.9792F, 20.8568F, new CubeDeformation(0.0F)), PartPose.offset(66.0F, 43.5104F, -62.0F));
		PartDefinition hexadecagon_r1 = black.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(0, 121).addBox(-52.4272F, -7.4896F, -10.4284F, 104.8544F, 14.9792F, 20.8568F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-10.4284F, -7.4896F, -52.4272F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r2 = black.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(0, 121).addBox(-52.4272F, -7.4896F, -10.4284F, 104.8544F, 14.9792F, 20.8568F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-10.4284F, -7.4896F, -52.4272F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r3 = black.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(120, 99).addBox(-10.4284F, -7.4896F, -52.4272F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r4 = black.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(120, 99).addBox(-10.4284F, -7.4896F, -52.4272F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.7854F, 0.0F));
		PartDefinition purp = fg.addOrReplaceChild("purp", CubeListBuilder.create().texOffs(120, 99).addBox(-77.8348F, -69.2788F, 7.4896F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)).texOffs(0, 89).addBox(-119.8336F, -69.2788F,
				49.4884F, 104.8544F, 14.9792F, 20.8568F, new CubeDeformation(0.0F)), PartPose.offset(66.0F, 80.9584F, -62.0F));
		PartDefinition hexadecagon_r5 = purp.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(0, 89).addBox(-52.4272F, -7.4896F, -10.4284F, 104.8544F, 14.9792F, 20.8568F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-10.4284F, -7.4896F, -52.4272F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r6 = purp.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(0, 89).addBox(-52.4272F, -7.4896F, -10.4284F, 104.8544F, 14.9792F, 20.8568F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-10.4284F, -7.4896F, -52.4272F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r7 = purp.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(120, 99).addBox(-10.4284F, -7.4896F, -52.4272F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r8 = purp.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(120, 99).addBox(-10.4284F, -7.4896F, -52.4272F, 20.8568F, 14.9792F, 104.8544F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.7854F, 0.0F));
		PartDefinition men = fg.addOrReplaceChild("men", CubeListBuilder.create().texOffs(120, 99).addBox(-77.0899F, -69.2788F, 11.2344F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)).texOffs(0, 121).addBox(-116.0888F, -69.2788F, 50.2333F,
				97.3648F, 14.9792F, 19.3671F, new CubeDeformation(0.0F)), PartPose.offset(66.0F, 36.0208F, -62.0F));
		PartDefinition hexadecagon_r9 = men.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(0, 121).addBox(-48.6824F, -7.4896F, -9.6835F, 97.3648F, 14.9792F, 19.3671F, new CubeDeformation(0.0F)).texOffs(120, 99).addBox(-9.6835F,
				-7.4896F, -48.6824F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r10 = men.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(0, 121).addBox(-48.6824F, -7.4896F, -9.6835F, 97.3648F, 14.9792F, 19.3671F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-9.6835F, -7.4896F, -48.6824F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r11 = men.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(120, 99).addBox(-9.6835F, -7.4896F, -48.6824F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r12 = men.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(120, 99).addBox(-9.6835F, -7.4896F, -48.6824F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.7854F, 0.0F));
		PartDefinition katsuisgay = fg.addOrReplaceChild("katsuisgay", CubeListBuilder.create().texOffs(89, 114).addBox(-77.0899F, -69.2788F, 11.2344F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)).texOffs(0, 89).addBox(-116.0888F,
				-69.2788F, 50.2333F, 97.3648F, 14.9792F, 19.3671F, new CubeDeformation(0.0F)), PartPose.offset(66.0F, 88.448F, -62.0F));
		PartDefinition hexadecagon_r13 = katsuisgay.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(0, 89).addBox(-48.6824F, -7.4896F, -9.6835F, 97.3648F, 14.9792F, 19.3671F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-9.6835F, -7.4896F, -48.6824F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r14 = katsuisgay.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(0, 89).addBox(-48.6824F, -7.4896F, -9.6835F, 97.3648F, 14.9792F, 19.3671F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-9.6835F, -7.4896F, -48.6824F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r15 = katsuisgay.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(120, 99).addBox(-9.6835F, -7.4896F, -48.6824F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r16 = katsuisgay.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(120, 99).addBox(-9.6835F, -7.4896F, -48.6824F, 19.3671F, 14.9792F, 97.3648F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.7854F, 0.0F));
		PartDefinition boredisalsogay = fg.addOrReplaceChild("boredisalsogay", CubeListBuilder.create().texOffs(120, 99).addBox(-74.8553F, -69.2788F, 22.4688F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-104.8544F,
				-69.2788F, 52.4679F, 74.896F, 14.9792F, 14.8977F, new CubeDeformation(0.0F)), PartPose.offset(66.0F, 28.5312F, -62.0F));
		PartDefinition hexadecagon_r17 = boredisalsogay.addOrReplaceChild("hexadecagon_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-37.448F, -7.4896F, -7.4489F, 74.896F, 14.9792F, 14.8977F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-7.4489F, -7.4896F, -37.448F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r18 = boredisalsogay.addOrReplaceChild("hexadecagon_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-37.448F, -7.4896F, -7.4489F, 74.896F, 14.9792F, 14.8977F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-7.4489F, -7.4896F, -37.448F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r19 = boredisalsogay.addOrReplaceChild("hexadecagon_r19", CubeListBuilder.create().texOffs(120, 99).addBox(-7.4489F, -7.4896F, -37.448F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r20 = boredisalsogay.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create().texOffs(120, 99).addBox(-7.4489F, -7.4896F, -37.448F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.7854F, 0.0F));
		PartDefinition katsumexicanfortniteplayer = fg.addOrReplaceChild("katsumexicanfortniteplayer", CubeListBuilder.create().texOffs(120, 99).addBox(-74.8553F, -69.2788F, 22.4688F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-104.8544F, -69.2788F, 52.4679F, 74.896F, 14.9792F, 14.8977F, new CubeDeformation(0.0F)), PartPose.offset(66.0F, 95.9376F, -62.0F));
		PartDefinition hexadecagon_r21 = katsumexicanfortniteplayer.addOrReplaceChild("hexadecagon_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-37.448F, -7.4896F, -7.4489F, 74.896F, 14.9792F, 14.8977F, new CubeDeformation(0.0F))
				.texOffs(120, 99).addBox(-7.4489F, -7.4896F, -37.448F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r22 = katsumexicanfortniteplayer.addOrReplaceChild("hexadecagon_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-37.448F, -7.4896F, -7.4489F, 74.896F, 14.9792F, 14.8977F, new CubeDeformation(0.0F))
				.texOffs(120, 99).addBox(-7.4489F, -7.4896F, -37.448F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r23 = katsumexicanfortniteplayer.addOrReplaceChild("hexadecagon_r23", CubeListBuilder.create().texOffs(120, 99).addBox(-7.4489F, -7.4896F, -37.448F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r24 = katsumexicanfortniteplayer.addOrReplaceChild("hexadecagon_r24", CubeListBuilder.create().texOffs(120, 99).addBox(-7.4489F, -7.4896F, -37.448F, 14.8977F, 14.9792F, 74.896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.7854F, 0.0F));
		PartDefinition katsuisgayaswll = fg.addOrReplaceChild("katsuisgayaswll", CubeListBuilder.create().texOffs(120, 99).addBox(-72.6206F, -69.2788F, 33.7032F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-93.62F,
				-69.2788F, 54.7026F, 52.4272F, 14.9792F, 10.4284F, new CubeDeformation(0.0F)), PartPose.offset(66.0F, 21.0416F, -62.0F));
		PartDefinition hexadecagon_r25 = katsuisgayaswll.addOrReplaceChild("hexadecagon_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-26.2136F, -7.4896F, -5.2142F, 52.4272F, 14.9792F, 10.4284F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-5.2142F, -7.4896F, -26.2136F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r26 = katsuisgayaswll.addOrReplaceChild("hexadecagon_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-26.2136F, -7.4896F, -5.2142F, 52.4272F, 14.9792F, 10.4284F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-5.2142F, -7.4896F, -26.2136F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r27 = katsuisgayaswll.addOrReplaceChild("hexadecagon_r27", CubeListBuilder.create().texOffs(120, 99).addBox(-5.2142F, -7.4896F, -26.2136F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r28 = katsuisgayaswll.addOrReplaceChild("hexadecagon_r28", CubeListBuilder.create().texOffs(120, 99).addBox(-5.2142F, -7.4896F, -26.2136F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.7854F, 0.0F));
		PartDefinition boredsucksatmcreator = fg.addOrReplaceChild("boredsucksatmcreator", CubeListBuilder.create().texOffs(120, 99).addBox(-72.6206F, -69.2788F, 33.7032F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-93.62F, -69.2788F, 54.7026F, 52.4272F, 14.9792F, 10.4284F, new CubeDeformation(0.0F)), PartPose.offset(66.0F, 103.4272F, -62.0F));
		PartDefinition hexadecagon_r29 = boredsucksatmcreator.addOrReplaceChild("hexadecagon_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-26.2136F, -7.4896F, -5.2142F, 52.4272F, 14.9792F, 10.4284F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-5.2142F, -7.4896F, -26.2136F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r30 = boredsucksatmcreator.addOrReplaceChild("hexadecagon_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-26.2136F, -7.4896F, -5.2142F, 52.4272F, 14.9792F, 10.4284F, new CubeDeformation(0.0F)).texOffs(120, 99)
				.addBox(-5.2142F, -7.4896F, -26.2136F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r31 = boredsucksatmcreator.addOrReplaceChild("hexadecagon_r31", CubeListBuilder.create().texOffs(120, 99).addBox(-5.2142F, -7.4896F, -26.2136F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r32 = boredsucksatmcreator.addOrReplaceChild("hexadecagon_r32", CubeListBuilder.create().texOffs(120, 99).addBox(-5.2142F, -7.4896F, -26.2136F, 10.4284F, 14.9792F, 52.4272F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-67.4064F, -61.7892F, 59.9168F, 0.0F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 500, 500);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
