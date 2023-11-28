// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldivinemahoraga<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "divinemahoraga"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart root;
	private final ModelPart wheel;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public Modeldivinemahoraga(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.root = root.getChild("root");
		this.wheel = root.getChild("wheel");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(655, 198)
						.addBox(-3.4769F, -9.0379F, -7.9057F, 6.6227F, 6.6227F, 9.9342F, new CubeDeformation(0.0F))
						.texOffs(696, 23)
						.addBox(-4.3048F, -8.2873F, 14.6227F, 8.2784F, 8.2784F, 6.6227F, new CubeDeformation(0.0F))
						.texOffs(693, 176)
						.addBox(-4.3048F, -10.5526F, -1.3114F, 8.2784F, 8.2785F, 6.6227F, new CubeDeformation(0.0F))
						.texOffs(122, 847)
						.addBox(-3.0493F, -1.6531F, -7.7803F, 1.4199F, 0.75F, 1.2418F, new CubeDeformation(0.0F))
						.texOffs(83, 878)
						.addBox(-3.0493F, -2.4445F, -7.7803F, 1.4199F, 0.75F, 1.2418F, new CubeDeformation(0.0F))
						.texOffs(132, 843)
						.addBox(-1.5493F, -2.4445F, -7.7803F, 1.3574F, 0.75F, 1.2418F, new CubeDeformation(0.0F))
						.texOffs(132, 841)
						.addBox(-1.5493F, -1.6531F, -7.7803F, 1.3574F, 0.75F, 1.2418F, new CubeDeformation(0.0F))
						.texOffs(118, 847)
						.addBox(1.3257F, -1.6531F, -7.7803F, 1.4199F, 0.75F, 1.2418F, new CubeDeformation(0.0F))
						.texOffs(100, 870)
						.addBox(1.3257F, -2.4445F, -7.7803F, 1.4199F, 0.75F, 1.2418F, new CubeDeformation(0.0F))
						.texOffs(126, 868)
						.addBox(-0.1118F, -1.6531F, -7.7803F, 1.3574F, 0.75F, 1.2418F, new CubeDeformation(0.0F))
						.texOffs(126, 866)
						.addBox(-0.1118F, -2.4445F, -7.7803F, 1.3574F, 0.75F, 1.2418F, new CubeDeformation(0.0F))
						.texOffs(452, 340).addBox(-3.4769F, -11.4843F, -4.0656F, 6.6227F, 8.2785F, 4.5531F,
								new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -57.875F, -5.625F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(504, 42).addBox(-3.3114F, -69.539F, -1.6557F, 6.6227F, 2.8975F,
						4.5532F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 48.7211F, 35.4071F, 0.5672F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(729, 194).addBox(-3.3114F, -69.539F, -1.6557F, 6.6227F, 8.2785F,
						4.5531F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 48.7211F, 30.854F, 0.5672F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(561, 219).addBox(-3.27F, -69.539F, 3.3114F, 6.2088F, 13.2455F, 3.3114F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4369F, 58.8454F, -5.5725F, 0.0F, -0.2182F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(726, 106)
				.addBox(-3.3114F, -69.539F, 3.3114F, 6.2088F, 13.2455F, 3.3114F, new CubeDeformation(0.0F))
				.texOffs(203, 868)
				.addBox(1.6557F, -60.4985F, 0.2193F, 1.0762F, 0.75F, 1.665F, new CubeDeformation(0.0F))
				.texOffs(158, 963)
				.addBox(1.6557F, -61.2899F, 0.2193F, 1.0762F, 0.75F, 1.665F, new CubeDeformation(0.0F))
				.texOffs(213, 939).addBox(1.6557F, -61.2899F, 2.0943F, 1.0762F, 0.75F, 2.79F, new CubeDeformation(0.0F))
				.texOffs(213, 943)
				.addBox(1.6557F, -60.4985F, 2.0943F, 1.0762F, 0.75F, 2.79F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4369F, 58.8454F, -5.5725F, 0.0F, 0.2182F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(670, 305).addBox(-3.3114F, -67.8833F, -1.6557F, 6.6227F, 6.6227F,
						8.2784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2713F, 58.8454F, -5.5725F, 0.0F, 0.2182F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(403, 307).addBox(-3.3114F, -67.8833F, -1.6557F, 6.6227F, 6.6227F,
						8.2784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6024F, 58.8454F, -5.5725F, 0.0F, -0.2182F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(141, 901)
						.addBox(-2.7319F, -59.5221F, 0.3443F, 1.0762F, 0.75F, 1.665F, new CubeDeformation(0.0F))
						.texOffs(122, 917)
						.addBox(-2.7319F, -60.3135F, 0.3443F, 1.0762F, 0.75F, 1.665F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3076F, 57.8276F, -7.5251F, 0.0F, -0.2182F, 0.0F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8",
				CubeListBuilder.create().texOffs(153, 963)
						.addBox(-2.7319F, -60.3135F, 2.0943F, 1.0762F, 0.75F, 2.79F, new CubeDeformation(0.0F))
						.texOffs(161, 963)
						.addBox(-2.7319F, -59.5221F, 2.0943F, 1.0762F, 0.75F, 2.79F, new CubeDeformation(0.0F))
						.texOffs(153, 849)
						.addBox(-2.7319F, -59.5221F, 0.2193F, 1.0762F, 0.75F, 1.665F, new CubeDeformation(0.0F))
						.texOffs(137, 917)
						.addBox(-2.7319F, -60.3135F, 0.2193F, 1.0762F, 0.75F, 1.665F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7405F, 57.8276F, -5.5725F, 0.0F, -0.2182F, 0.0F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9",
				CubeListBuilder.create().texOffs(187, 935)
						.addBox(1.6557F, -59.5221F, 0.3443F, 1.0762F, 0.75F, 1.665F, new CubeDeformation(0.0F))
						.texOffs(194, 900)
						.addBox(1.6557F, -60.3135F, 0.3443F, 1.0762F, 0.75F, 1.665F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.004F, 57.869F, -7.5251F, 0.0F, 0.2182F, 0.0F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10",
				CubeListBuilder.create().texOffs(586, 239).addBox(0.8278F, -57.9491F, -1.6557F, 2.4835F, 3.3114F,
						9.5202F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2713F, 56.5801F, -0.6055F, 0.0894F, 0.2173F, 0.0193F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11",
				CubeListBuilder.create().texOffs(708, 334).addBox(-3.3114F, -57.9491F, -1.6557F, 2.4835F, 3.3114F,
						9.5202F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6024F, 56.5801F, -0.6055F, 0.0894F, -0.2173F, -0.0193F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12",
				CubeListBuilder.create().texOffs(682, 46).addBox(-3.3114F, -57.9492F, -1.6557F, 6.6227F, 3.3114F,
						9.9342F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 56.3897F, -15.5515F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head_r13 = head.addOrReplaceChild("head_r13",
				CubeListBuilder.create().texOffs(686, 100).addBox(-3.3114F, -57.9491F, -1.6557F, 6.6227F, 3.3114F,
						9.9342F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 56.5801F, -1.2829F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head_r14 = head.addOrReplaceChild("head_r14",
				CubeListBuilder.create().texOffs(507, 574).addBox(-2.8975F, -68.2972F, 6.6227F, 5.7949F, 5.7949F,
						8.2784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 72.6604F, -11.7996F, -0.6545F, 0.0F, 0.0F));

		PartDefinition head_r15 = head.addOrReplaceChild("head_r15",
				CubeListBuilder.create().texOffs(437, 235).addBox(-2.8975F, -68.2972F, 6.6228F, 5.7949F, 5.7949F,
						8.2784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 48.1206F, -29.2167F, -1.0036F, 0.0F, 0.0F));

		PartDefinition head_r16 = head.addOrReplaceChild("head_r16",
				CubeListBuilder.create().texOffs(527, 510).addBox(-3.3114F, -68.7112F, 6.6228F, 6.6227F, 6.6227F,
						8.2784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 27.5791F, -36.734F, -1.2217F, 0.0F, 0.0F));

		PartDefinition head_r17 = head.addOrReplaceChild("head_r17",
				CubeListBuilder.create().texOffs(438, 50).addBox(-3.7253F, -69.1251F, 6.6227F, 7.4506F, 7.4506F,
						8.2784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, -2.1927F, -38.1883F, -1.5708F, 0.0F, 0.0F));

		PartDefinition head_r18 = head.addOrReplaceChild("head_r18",
				CubeListBuilder.create().texOffs(428, 561).addBox(-3.7253F, -69.1251F, 6.6228F, 7.4506F, 7.4506F,
						8.2784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 20.1385F, -38.0094F, -1.1345F, 0.0F, 0.0F));

		PartDefinition head_r19 = head.addOrReplaceChild("head_r19",
				CubeListBuilder.create().texOffs(477, 610).addBox(-4.1392F, -69.539F, 6.6227F, 8.2784F, 8.2784F,
						8.2784F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 42.85F, -26.3413F, -0.6545F, 0.0F, 0.0F));

		PartDefinition head_r20 = head.addOrReplaceChild("head_r20",
				CubeListBuilder.create().texOffs(614, 50).addBox(-4.1392F, -69.539F, 1.8728F, 8.2784F, 8.2785F,
						11.3727F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1656F, 56.9327F, -11.568F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone14 = head.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offset(0.4369F, 58.369F, -5.5725F));

		PartDefinition bone14_r1 = bone14.addOrReplaceChild("bone14_r1",
				CubeListBuilder.create().texOffs(824, 926)
						.addBox(1.6557F, -41.922F, 44.0943F, 1.1387F, 0.6085F, 2.79F, new CubeDeformation(0.0F))
						.texOffs(852, 931)
						.addBox(1.6557F, -43.172F, 42.8443F, 1.1387F, 0.6085F, 2.79F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.2182F, 0.0F));

		PartDefinition bone14_r2 = bone14.addOrReplaceChild("bone14_r2",
				CubeListBuilder.create().texOffs(876, 840)
						.addBox(-3.1069F, -41.922F, 44.0943F, 1.1387F, 0.6085F, 2.79F, new CubeDeformation(0.0F))
						.texOffs(876, 844)
						.addBox(-3.1069F, -43.172F, 42.8443F, 1.1387F, 0.6085F, 2.79F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8737F, 0.0F, 0.0F, 0.7854F, -0.2182F, 0.0F));

		PartDefinition bone14_r3 = bone14.addOrReplaceChild("bone14_r3",
				CubeListBuilder.create().texOffs(744, 853)
						.addBox(-42.6864F, -44.4596F, -1.7182F, 0.7949F, 0.9397F, 1.3043F, new CubeDeformation(0.0F))
						.texOffs(743, 857)
						.addBox(-43.6864F, -43.4596F, -1.7182F, 0.7949F, 0.9397F, 1.3043F, new CubeDeformation(0.0F))
						.texOffs(748, 853)
						.addBox(-44.6864F, -42.4596F, -1.7182F, 0.7949F, 0.9397F, 1.3043F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2998F, 0.0F, -0.552F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone20 = head.addOrReplaceChild("bone20", CubeListBuilder.create(),
				PartPose.offset(-0.4369F, 56.994F, -5.5725F));

		PartDefinition bone20_r1 = bone20.addOrReplaceChild("bone20_r1",
				CubeListBuilder.create().texOffs(792, 812)
						.addBox(-3.1069F, -41.297F, 39.0943F, 1.1387F, 0.6085F, 2.415F, new CubeDeformation(0.0F))
						.texOffs(863, 897)
						.addBox(-3.1069F, -40.047F, 40.0943F, 1.1387F, 0.6085F, 2.79F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, -0.2182F, 0.0F));

		PartDefinition bone20_r2 = bone20.addOrReplaceChild("bone20_r2",
				CubeListBuilder.create().texOffs(795, 851)
						.addBox(-42.4364F, -40.0846F, -1.7182F, 0.7949F, 0.9397F, 1.3043F, new CubeDeformation(0.0F))
						.texOffs(740, 853)
						.addBox(-41.4364F, -41.0846F, -1.7182F, 0.7949F, 0.9397F, 1.3043F, new CubeDeformation(0.0F))
						.texOffs(798, 791)
						.addBox(-40.4364F, -42.0846F, -1.7182F, 0.7949F, 0.9397F, 1.3043F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5739F, 0.0F, -0.552F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone20_r3 = bone20.addOrReplaceChild("bone20_r3",
				CubeListBuilder.create().texOffs(785, 851)
						.addBox(1.6557F, -41.297F, 39.0943F, 1.1387F, 0.6085F, 2.415F, new CubeDeformation(0.0F))
						.texOffs(864, 884)
						.addBox(1.6557F, -40.047F, 40.0943F, 1.1387F, 0.6085F, 2.79F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8737F, 0.0F, 0.0F, 0.7854F, 0.2182F, 0.0F));

		PartDefinition bone15 = head.addOrReplaceChild("bone15",
				CubeListBuilder.create().texOffs(467, 344).addBox(-0.0315F, -1.9115F, -13.5915F, 2.0862F, 2.0862F,
						8.5473F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7385F, -6.2485F, -4.3374F, 0.0F, -0.3927F, -0.3927F));

		PartDefinition bone15_r1 = bone15.addOrReplaceChild("bone15_r1",
				CubeListBuilder.create().texOffs(403, 270)
						.addBox(5.285F, -2.4338F, 5.3503F, 2.0862F, 1.3908F, 14.392F, new CubeDeformation(0.0F))
						.texOffs(544, 480)
						.addBox(-2.7086F, -2.4338F, -11.8895F, 2.0862F, 1.3908F, 19.7397F, new CubeDeformation(0.0F))
						.texOffs(448, 559)
						.addBox(-0.2086F, -2.4338F, -7.5145F, 2.0862F, 1.3908F, 18.4897F, new CubeDeformation(0.0F))
						.texOffs(488, 528)
						.addBox(0.8345F, -2.4338F, -1.3255F, 2.0862F, 1.3908F, 16.0558F, new CubeDeformation(0.0F))
						.texOffs(566, 540)
						.addBox(3.0597F, -2.4338F, 2.1515F, 2.0862F, 1.3908F, 16.267F, new CubeDeformation(0.0F))
						.texOffs(664, 89)
						.addBox(7.5102F, -2.4338F, 6.602F, 2.0862F, 1.3908F, 14.392F, new CubeDeformation(0.0F))
						.texOffs(609, 15)
						.addBox(12.0998F, -2.4338F, 8.3447F, 2.0862F, 1.3908F, 8.2404F, new CubeDeformation(0.0F))
						.texOffs(530, 555)
						.addBox(9.7355F, -2.4338F, 7.9927F, 2.0862F, 1.3908F, 12.517F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.0678F, 0.8701F, -2.2794F, 0.0F, -2.4871F, 0.0F));

		PartDefinition bone15_r2 = bone15.addOrReplaceChild("bone15_r2",
				CubeListBuilder.create().texOffs(526, 671).addBox(-1.3908F, -2.7815F, -6.9539F, 2.0862F, 2.0862F,
						8.3447F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.0678F, 0.8701F, -6.6544F, 0.0F, -2.4871F, 0.0F));

		PartDefinition bone15_r3 = bone15.addOrReplaceChild("bone15_r3",
				CubeListBuilder.create().texOffs(507, 277).addBox(-1.3908F, -2.7815F, -12.517F, 2.0862F, 2.0862F,
						13.9078F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7891F, 0.8701F, -13.6585F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bone15_r4 = bone15.addOrReplaceChild("bone15_r4",
				CubeListBuilder.create().texOffs(696, 113).addBox(-1.3908F, -2.7815F, -6.9539F, 2.0862F, 2.0862F,
						8.3447F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3261F, 0.8701F, -14.1676F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone15_r5 = bone15.addOrReplaceChild("bone15_r5",
				CubeListBuilder.create().texOffs(424, 74).addBox(-1.3908F, -2.7815F, -1.3908F, 2.0862F, 2.0862F,
						2.7815F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9353F, 0.8701F, -13.5915F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone15_r6 = bone15.addOrReplaceChild("bone15_r6",
				CubeListBuilder.create().texOffs(446, 40).addBox(-1.3908F, -2.7815F, -2.7816F, 2.0862F, 2.0862F,
						4.1723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3477F, 0.8701F, -2.7404F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone16 = head.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(655, 89).addBox(-2.0546F, -1.9115F, -13.5915F, 2.0862F, 2.0862F,
						8.5473F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7385F, -6.2485F, -4.3374F, 0.0F, 0.3927F, 0.3927F));

		PartDefinition bone16_r1 = bone16.addOrReplaceChild("bone16_r1",
				CubeListBuilder.create().texOffs(523, 219)
						.addBox(-7.3712F, -2.4338F, 5.3503F, 2.0862F, 1.3908F, 14.392F, new CubeDeformation(0.0F))
						.texOffs(581, 40)
						.addBox(0.6225F, -2.4338F, -11.8895F, 2.0862F, 1.3908F, 19.7397F, new CubeDeformation(0.0F))
						.texOffs(539, 219)
						.addBox(-1.8775F, -2.4338F, -7.5145F, 2.0862F, 1.3908F, 18.4897F, new CubeDeformation(0.0F))
						.texOffs(629, 228)
						.addBox(-2.9207F, -2.4338F, -1.3255F, 2.0862F, 1.3908F, 16.0558F, new CubeDeformation(0.0F))
						.texOffs(625, 147)
						.addBox(-5.1459F, -2.4338F, 2.1515F, 2.0862F, 1.3908F, 16.267F, new CubeDeformation(0.0F))
						.texOffs(489, 276)
						.addBox(-9.5964F, -2.4338F, 6.602F, 2.0862F, 1.3908F, 14.392F, new CubeDeformation(0.0F))
						.texOffs(485, 218)
						.addBox(-14.186F, -2.4338F, 8.3447F, 2.0862F, 1.3908F, 8.2404F, new CubeDeformation(0.0F))
						.texOffs(438, 65)
						.addBox(-11.8217F, -2.4338F, 7.9927F, 2.0862F, 1.3908F, 12.517F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.0678F, 0.8701F, -2.2794F, 0.0F, 2.4871F, 0.0F));

		PartDefinition bone16_r2 = bone16.addOrReplaceChild("bone16_r2",
				CubeListBuilder.create().texOffs(509, 293).addBox(-0.6954F, -2.7815F, -6.9539F, 2.0862F, 2.0862F,
						8.3447F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.0678F, 0.8701F, -6.6544F, 0.0F, 2.4871F, 0.0F));

		PartDefinition bone16_r3 = bone16.addOrReplaceChild("bone16_r3",
				CubeListBuilder.create().texOffs(623, 279).addBox(-0.6954F, -2.7815F, -12.517F, 2.0862F, 2.0862F,
						13.9078F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7891F, 0.8701F, -13.6585F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone16_r4 = bone16.addOrReplaceChild("bone16_r4",
				CubeListBuilder.create().texOffs(593, 296).addBox(-0.6954F, -2.7815F, -6.9539F, 2.0862F, 2.0862F,
						8.3447F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3261F, 0.8701F, -14.1676F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone16_r5 = bone16.addOrReplaceChild("bone16_r5",
				CubeListBuilder.create().texOffs(424, 41).addBox(-0.6954F, -2.7815F, -1.3908F, 2.0862F, 2.0862F,
						2.7815F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9353F, 0.8701F, -13.5915F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone16_r6 = bone16.addOrReplaceChild("bone16_r6",
				CubeListBuilder.create().texOffs(421, 48).addBox(-0.6954F, -2.7815F, -2.7816F, 2.0862F, 2.0862F,
						4.1723F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3477F, 0.8701F, -2.7404F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone17 = head.addOrReplaceChild("bone17",
				CubeListBuilder.create().texOffs(403, 126).addBox(-1.8492F, -1.8072F, -8.5689F, 1.8776F, 1.8775F,
						3.7551F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0089F, -3.7649F, -4.3374F, -0.247F, 0.3085F, -0.3004F));

		PartDefinition bone17_r1 = bone17.addOrReplaceChild("bone17_r1",
				CubeListBuilder.create().texOffs(519, 198)
						.addBox(-6.634F, -2.1905F, 2.0027F, 1.8775F, 1.2517F, 11.2653F, new CubeDeformation(0.0F))
						.texOffs(713, 301)
						.addBox(-1.6898F, -2.1905F, -9.5755F, 1.8775F, 1.2517F, 11.5783F, new CubeDeformation(0.0F))
						.texOffs(531, 257)
						.addBox(-2.6286F, -2.1905F, -4.0054F, 1.8775F, 1.2517F, 9.3878F, new CubeDeformation(0.0F))
						.texOffs(563, 199)
						.addBox(-4.6313F, -2.1905F, -0.8762F, 1.8775F, 1.2517F, 11.2653F, new CubeDeformation(0.0F))
						.texOffs(692, 330)
						.addBox(-8.6367F, -2.1905F, 3.1292F, 1.8775F, 1.2517F, 11.2653F, new CubeDeformation(0.0F))
						.texOffs(441, 203)
						.addBox(-12.7674F, -2.1905F, 7.5102F, 1.8775F, 1.2517F, 7.4163F, new CubeDeformation(0.0F))
						.texOffs(719, 15)
						.addBox(-10.6395F, -2.1905F, 4.3809F, 1.8775F, 1.2517F, 11.2653F, new CubeDeformation(0.0F))
						.texOffs(682, 356)
						.addBox(-0.6258F, -2.5034F, -6.2585F, 1.8775F, 1.8775F, 7.5102F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.861F, 0.6962F, -2.3255F, 0.0F, 2.4871F, 0.0F));

		PartDefinition bone17_r2 = bone17.addOrReplaceChild("bone17_r2",
				CubeListBuilder.create().texOffs(701, 261).addBox(-0.6258F, -2.5034F, -11.2653F, 1.8775F, 1.8775F,
						12.517F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.7101F, 0.6962F, -8.6292F, 0.0F, 2.0944F, 0.0F));

		PartDefinition bone17_r3 = bone17.addOrReplaceChild("bone17_r3",
				CubeListBuilder.create().texOffs(462, 357).addBox(-0.6258F, -2.5034F, -6.2585F, 1.8776F, 1.8775F,
						7.5102F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9935F, 0.6962F, -9.0874F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone17_r4 = bone17.addOrReplaceChild("bone17_r4",
				CubeListBuilder.create().texOffs(442, 146).addBox(-0.6258F, -2.5034F, -1.2517F, 1.8776F, 1.8775F,
						2.5034F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7418F, 0.6962F, -8.5689F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone17_r5 = bone17.addOrReplaceChild("bone17_r5",
				CubeListBuilder.create().texOffs(403, 132).addBox(-0.6259F, -2.5034F, -2.5034F, 1.8776F, 1.8775F,
						3.7551F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3129F, 0.6962F, -2.7404F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone18 = head.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(494, 83).addBox(-0.0284F, -1.8072F, -8.5689F, 1.8776F, 1.8775F,
						3.7551F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0089F, -3.7649F, -4.3374F, -0.247F, -0.3085F, 0.3004F));

		PartDefinition bone18_r1 = bone18.addOrReplaceChild("bone18_r1",
				CubeListBuilder.create().texOffs(442, 83)
						.addBox(4.7565F, -2.1905F, 2.0027F, 1.8775F, 1.2517F, 11.2653F, new CubeDeformation(0.0F))
						.texOffs(713, 196)
						.addBox(-0.1877F, -2.1905F, -9.5755F, 1.8775F, 1.2517F, 11.5783F, new CubeDeformation(0.0F))
						.texOffs(533, 116)
						.addBox(0.751F, -2.1905F, -4.0054F, 1.8775F, 1.2517F, 9.3878F, new CubeDeformation(0.0F))
						.texOffs(442, 141)
						.addBox(2.7538F, -2.1905F, -0.8762F, 1.8775F, 1.2517F, 11.2653F, new CubeDeformation(0.0F))
						.texOffs(507, 150)
						.addBox(6.7592F, -2.1905F, 3.1292F, 1.8775F, 1.2517F, 11.2653F, new CubeDeformation(0.0F))
						.texOffs(499, 66)
						.addBox(10.8898F, -2.1905F, 7.5102F, 1.8775F, 1.2517F, 7.4163F, new CubeDeformation(0.0F))
						.texOffs(546, 64)
						.addBox(8.7619F, -2.1905F, 4.3809F, 1.8775F, 1.2517F, 11.2653F, new CubeDeformation(0.0F))
						.texOffs(744, 104)
						.addBox(-1.2517F, -2.5034F, -6.2585F, 1.8775F, 1.8775F, 7.5102F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.861F, 0.6962F, -2.3255F, 0.0F, -2.4871F, 0.0F));

		PartDefinition bone18_r2 = bone18.addOrReplaceChild("bone18_r2",
				CubeListBuilder.create().texOffs(698, 277).addBox(-1.2517F, -2.5034F, -11.2653F, 1.8775F, 1.8775F,
						12.517F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.7101F, 0.6962F, -8.6292F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bone18_r3 = bone18.addOrReplaceChild("bone18_r3",
				CubeListBuilder.create().texOffs(510, 356).addBox(-1.2517F, -2.5034F, -6.2585F, 1.8776F, 1.8775F,
						7.5102F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9935F, 0.6962F, -9.0874F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone18_r4 = bone18.addOrReplaceChild("bone18_r4",
				CubeListBuilder.create().texOffs(457, 141).addBox(-1.2517F, -2.5034F, -1.2517F, 1.8776F, 1.8775F,
						2.5034F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7418F, 0.6962F, -8.5689F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone18_r5 = bone18.addOrReplaceChild("bone18_r5",
				CubeListBuilder.create().texOffs(494, 89).addBox(-1.2517F, -2.5034F, -2.5034F, 1.8776F, 1.8775F,
						3.7551F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3129F, 0.6962F, -2.7404F, 0.0F, -0.3927F, 0.0F));

		PartDefinition body = partdefinition
				.addOrReplaceChild(
						"body", CubeListBuilder.create().texOffs(70, 0)
								.addBox(-10.08F, -26.3093F, 3.6093F, 20.13F, 16.375F, 11.125F,
										new CubeDeformation(0.0F))
								.texOffs(233, 230)
								.addBox(-10.38F, -24.5093F, 3.0093F, 9.33F, 9.6F, 8.35F, new CubeDeformation(0.0F))
								.texOffs(982, 911)
								.addBox(-8.505F, -23.2593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(1004, 807)
								.addBox(-6.255F, -23.2593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(996, 652)
								.addBox(-8.255F, -23.7593F, 2.7593F, 2.33F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(995, 869)
								.addBox(-8.255F, -21.2593F, 2.7593F, 2.33F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(970, 921)
								.addBox(-5.255F, -19.7593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(995, 859)
								.addBox(-5.005F, -17.7593F, 2.7593F, 2.33F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(945, 921)
								.addBox(-3.005F, -19.7593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(992, 912)
								.addBox(-5.005F, -20.2593F, 2.7593F, 2.33F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(1002, 911)
								.addBox(-2.425F, -15.1593F, 2.7593F, 1.08F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(931, 736)
								.addBox(-1.425F, -14.6593F, 2.7593F, 2.58F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(1004, 672)
								.addBox(-2.675F, -17.1593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(1004, 662)
								.addBox(1.095F, -15.1593F, 2.7593F, 1.33F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(1003, 899)
								.addBox(2.095F, -17.1593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(1005, 920)
								.addBox(2.425F, -19.7593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(995, 642)
								.addBox(2.675F, -17.7593F, 2.7593F, 2.33F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(1001, 913)
								.addBox(4.675F, -19.7593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(1002, 901)
								.addBox(2.675F, -20.2593F, 2.7593F, 2.33F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(976, 930)
								.addBox(7.925F, -23.2593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(979, 911)
								.addBox(5.925F, -21.2593F, 2.7593F, 2.33F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(971, 905)
								.addBox(5.675F, -23.2593F, 2.7593F, 0.58F, 2.1F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(991, 669)
								.addBox(5.925F, -23.7593F, 2.7593F, 2.33F, 0.6F, 8.6F, new CubeDeformation(0.0F))
								.texOffs(502, 162)
								.addBox(1.05F, -24.5093F, 3.0093F, 9.33F, 9.6F, 8.35F, new CubeDeformation(0.0F))
								.texOffs(31, 236)
								.addBox(-5.58F, -15.5093F, 3.2468F, 5.43F, 3.9F, 6.4125F, new CubeDeformation(0.0F))
								.texOffs(29, 25)
								.addBox(-5.8799F, -11.7155F, 3.3093F, 3.78F, 0.45F, 6.35F, new CubeDeformation(0.0F))
								.texOffs(152, 224)
								.addBox(0.15F, -15.5093F, 3.2468F, 5.43F, 3.9F, 6.4125F, new CubeDeformation(0.0F))
								.texOffs(29, 0)
								.addBox(2.0999F, -11.7155F, 3.3093F, 3.78F, 0.45F, 6.35F, new CubeDeformation(0.0F))
								.texOffs(313, 155)
								.addBox(3.735F, -15.5243F, 4.3843F, 4.887F, 3.51F, 8.845F, new CubeDeformation(0.0F))
								.texOffs(15, 9)
								.addBox(5.4899F, -12.0649F, 4.3843F, 3.402F, 0.36F, 8.845F, new CubeDeformation(0.0F))
								.texOffs(15, 0)
								.addBox(-8.8919F, -12.0649F, 4.3843F, 3.402F, 0.36F, 8.845F, new CubeDeformation(0.0F))
								.texOffs(313, 123)
								.addBox(-8.622F, -15.5243F, 4.3843F, 4.887F, 3.51F, 8.845F, new CubeDeformation(0.0F))
								.texOffs(35, 0)
								.addBox(-1.65F, -31.6343F, 4.9843F, 3.45F, 17.325F, 7.9F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -30.5F, 5.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(180, 324).addBox(-1.647F, -8.1F, -4.71F, 0.912F, 3.51F, 8.845F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4729F, -7.4706F, 9.0943F, 0.0F, 0.0F, -0.1745F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(329, 222).addBox(0.735F, -8.1F, -4.71F, 0.912F, 3.51F, 8.845F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4729F, -7.4706F, 9.0943F, 0.0F, 0.0F, 0.1745F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(12, 0).addBox(-0.15F, -5.55F, -4.4F, 1.98F, 0.45F, 6.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5879F, -6.5607F, 7.7093F, 0.0F, 0.0F, 0.1745F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(51, 19).addBox(0.9F, -9.0F, -4.4F, 0.93F, 3.9F, 6.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1921F, -6.5607F, 7.7093F, 0.0F, 0.0F, 0.1745F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(18, 18).addBox(-1.83F, -5.55F, -4.4F, 1.98F, 0.45F, 6.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5879F, -6.5607F, 7.7093F, 0.0F, 0.0F, -0.1745F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6",
				CubeListBuilder.create().texOffs(52, 50).addBox(-1.83F, -9.0F, -4.4F, 0.93F, 3.9F, 6.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1921F, -6.5607F, 7.7093F, 0.0F, 0.0F, -0.1745F));

		PartDefinition body_r7 = body.addOrReplaceChild("body_r7",
				CubeListBuilder.create().texOffs(575, 167).addBox(0.75F, -15.15F, -4.7F, 0.87F, 9.45F, 8.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3125F, -9.4823F, 8.9593F, 0.0F, 0.0F, 0.0873F));

		PartDefinition body_r8 = body.addOrReplaceChild("body_r8",
				CubeListBuilder.create().texOffs(432, 171).addBox(-1.62F, -15.15F, -4.7F, 0.87F, 9.45F, 8.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.3125F, -9.4823F, 8.9593F, 0.0F, 0.0F, -0.0873F));

		PartDefinition body_r9 = body.addOrReplaceChild("body_r9",
				CubeListBuilder.create().texOffs(70, 51).addBox(0.75F, -15.15F, -4.7F, 9.33F, 6.75F, 8.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2057F, -9.5044F, 7.7093F, 0.0F, 0.0F, 0.0873F));

		PartDefinition body_r10 = body.addOrReplaceChild("body_r10",
				CubeListBuilder.create().texOffs(57, 111).addBox(0.75F, -11.4F, -4.7F, 9.33F, 3.0F, 8.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4996F, -6.6014F, 7.7093F, 0.0F, 0.0F, -0.2618F));

		PartDefinition body_r11 = body.addOrReplaceChild("body_r11",
				CubeListBuilder.create().texOffs(181, 149).addBox(-10.08F, -15.15F, -4.7F, 9.33F, 6.75F, 8.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2057F, -9.5044F, 7.7093F, 0.0F, 0.0F, -0.0873F));

		PartDefinition body_r12 = body.addOrReplaceChild("body_r12",
				CubeListBuilder.create().texOffs(121, 0).addBox(-10.08F, -11.4F, -4.7F, 9.33F, 3.0F, 8.35F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4996F, -6.6014F, 7.7093F, 0.0F, 0.0F, 0.2618F));

		PartDefinition body_r13 = body.addOrReplaceChild("body_r13",
				CubeListBuilder.create().texOffs(1000, 896).addBox(5.925F, -71.75F, -23.7F, 2.33F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.0689F, -11.7271F, 25.6989F, 0.1797F, -0.6784F, -1.8525F));

		PartDefinition body_r14 = body.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(969, 865)
				.addBox(5.175F, -71.125F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)).texOffs(1001, 885)
				.addBox(5.925F, -71.625F, -23.7F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)).texOffs(984, 889)
				.addBox(3.9875F, -71.5625F, -23.6375F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F))
				.texOffs(1012, 864).addBox(5.175F, -72.0F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(79.38F, 0.2985F, 15.6083F, 0.0F, -0.6981F, -1.5708F));

		PartDefinition body_r15 = body.addOrReplaceChild("body_r15",
				CubeListBuilder.create().texOffs(1013, 896).addBox(-20.95F, -71.625F, -23.7F, 2.33F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(80.1326F, -15.4927F, 28.8587F, -0.073F, -0.6949F, -1.4571F));

		PartDefinition body_r16 = body.addOrReplaceChild("body_r16",
				CubeListBuilder.create().texOffs(996, 740).addBox(5.675F, -72.8125F, -6.2F, 0.58F, 3.85F, 8.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-47.9193F, 26.3156F, 8.9593F, 0.0F, 0.0F, 0.7854F));

		PartDefinition body_r17 = body.addOrReplaceChild("body_r17",
				CubeListBuilder.create().texOffs(1005, 765).addBox(5.925F, -72.9375F, -6.2F, 0.58F, 3.975F, 8.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-50.045F, 24.435F, 8.9593F, 0.0F, 0.0F, 0.7854F));

		PartDefinition body_r18 = body.addOrReplaceChild("body_r18", CubeListBuilder.create().texOffs(1012, 865)
				.addBox(5.175F, -72.0F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)).texOffs(1009, 890)
				.addBox(3.9875F, -71.5625F, -23.6375F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F))
				.texOffs(1016, 859).addBox(5.175F, -71.125F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F))
				.texOffs(957, 839).addBox(5.925F, -71.625F, -23.7F, 3.08F, 0.6F, 0.475F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(75.255F, 4.4235F, 15.1083F, 0.0F, -0.6981F, -1.5708F));

		PartDefinition body_r19 = body.addOrReplaceChild("body_r19",
				CubeListBuilder.create().texOffs(981, 860).addBox(5.925F, -71.75F, -23.7F, 2.83F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(75.9439F, -7.602F, 25.1989F, 0.1797F, -0.6784F, -1.8525F));

		PartDefinition body_r20 = body.addOrReplaceChild("body_r20",
				CubeListBuilder.create().texOffs(957, 864).addBox(-20.95F, -71.625F, -23.7F, 2.83F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(76.0076F, -11.3677F, 28.3587F, -0.073F, -0.6949F, -1.4571F));

		PartDefinition body_r21 = body.addOrReplaceChild("body_r21",
				CubeListBuilder.create().texOffs(995, 701).addBox(-5.005F, -70.125F, -6.2F, 2.33F, 0.6F, 8.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.2389F, 52.1786F, 8.9593F, 0.0F, 0.0F, 0.1745F));

		PartDefinition body_r22 = body.addOrReplaceChild("body_r22",
				CubeListBuilder.create().texOffs(992, 848).addBox(2.675F, -70.125F, -6.2F, 2.33F, 0.6F, 8.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.2389F, 52.1786F, 8.9593F, 0.0F, 0.0F, -0.1745F));

		PartDefinition body_r23 = body.addOrReplaceChild("body_r23",
				CubeListBuilder.create().texOffs(963, 864).addBox(-8.755F, -71.75F, -23.7F, 2.83F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-72.1939F, -4.477F, 25.1989F, 0.1797F, 0.6784F, 1.8525F));

		PartDefinition body_r24 = body.addOrReplaceChild("body_r24", CubeListBuilder.create().texOffs(59, 29)
				.addBox(-7.505F, -71.125F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)).texOffs(59, 30)
				.addBox(-7.505F, -72.0F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)).texOffs(60, 55)
				.addBox(-6.3175F, -71.5625F, -23.6375F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F))
				.texOffs(957, 840).addBox(-9.005F, -71.625F, -23.7F, 3.08F, 0.6F, 0.475F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-71.505F, 7.5485F, 15.1083F, 0.0F, 0.6981F, 1.5708F));

		PartDefinition body_r25 = body.addOrReplaceChild("body_r25",
				CubeListBuilder.create().texOffs(969, 864).addBox(18.12F, -71.625F, -23.7F, 2.83F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-72.2576F, -8.2427F, 28.3587F, -0.073F, 0.6949F, 1.4571F));

		PartDefinition body_r26 = body.addOrReplaceChild("body_r26", CubeListBuilder.create().texOffs(1013, 895)
				.addBox(-7.505F, -72.0F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)).texOffs(981, 859)
				.addBox(-9.005F, -71.625F, -23.7F, 3.08F, 0.6F, 0.475F, new CubeDeformation(0.0F)).texOffs(1018, 835)
				.addBox(-7.505F, -71.125F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)).texOffs(1018, 836)
				.addBox(-6.3175F, -71.5625F, -23.6375F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-75.255F, 4.4235F, 15.1083F, 0.0F, 0.6981F, 1.5708F));

		PartDefinition body_r27 = body.addOrReplaceChild("body_r27",
				CubeListBuilder.create().texOffs(957, 865).addBox(18.12F, -71.625F, -23.7F, 2.83F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-76.0076F, -11.3677F, 28.3587F, -0.073F, 0.6949F, 1.4571F));

		PartDefinition body_r28 = body.addOrReplaceChild("body_r28",
				CubeListBuilder.create().texOffs(963, 865).addBox(-8.755F, -71.75F, -23.7F, 2.83F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-75.9439F, -7.602F, 25.1989F, 0.1797F, 0.6784F, 1.8525F));

		PartDefinition body_r29 = body.addOrReplaceChild("body_r29",
				CubeListBuilder.create().texOffs(957, 897).addBox(18.62F, -71.625F, -23.7F, 2.33F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-80.1326F, -15.4927F, 28.8587F, -0.073F, 0.6949F, 1.4571F));

		PartDefinition body_r30 = body.addOrReplaceChild("body_r30",
				CubeListBuilder.create().texOffs(961, 897).addBox(-8.255F, -71.75F, -23.7F, 2.33F, 0.6F, 0.475F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-80.0689F, -11.7271F, 25.6989F, 0.1797F, 0.6784F, 1.8525F));

		PartDefinition body_r31 = body.addOrReplaceChild("body_r31", CubeListBuilder.create().texOffs(1018, 837)
				.addBox(-7.505F, -71.125F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)).texOffs(1018, 838)
				.addBox(-6.3175F, -71.5625F, -23.6375F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F))
				.texOffs(992, 896).addBox(-7.505F, -72.0F, -23.45F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F))
				.texOffs(996, 896).addBox(-8.255F, -71.625F, -23.7F, 2.33F, 0.6F, 0.475F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-79.38F, 0.2985F, 15.6083F, 0.0F, 0.6981F, 1.5708F));

		PartDefinition body_r32 = body.addOrReplaceChild("body_r32",
				CubeListBuilder.create().texOffs(1005, 849).addBox(-6.255F, -72.8125F, -6.2F, 0.58F, 3.85F, 8.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(47.9193F, 26.3156F, 8.9593F, 0.0F, 0.0F, -0.7854F));

		PartDefinition body_r33 = body.addOrReplaceChild("body_r33",
				CubeListBuilder.create().texOffs(996, 711).addBox(-6.505F, -72.9375F, -6.2F, 0.58F, 3.975F, 8.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(50.045F, 24.435F, 8.9593F, 0.0F, 0.0F, -0.7854F));

		PartDefinition body_r34 = body.addOrReplaceChild("body_r34",
				CubeListBuilder.create().texOffs(227, 248).addBox(-3.6F, -21.6F, -2.625F, 10.5F, 9.0F, 6.7F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7205F, -7.2432F, 8.2093F, 0.0F, 0.0F, -0.3491F));

		PartDefinition body_r35 = body.addOrReplaceChild("body_r35",
				CubeListBuilder.create().texOffs(250, 42).addBox(-6.9F, -21.6F, -2.625F, 10.5F, 9.0F, 6.7F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7205F, -7.2432F, 8.2093F, 0.0F, 0.0F, 0.3491F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(165, 0)
				.addBox(-6.6748F, -5.4131F, -4.765F, 15.33F, 13.55F, 11.03F, new CubeDeformation(0.0F))
				.texOffs(391, 1008)
				.addBox(-9.2998F, 10.2119F, -5.64F, 20.83F, 2.925F, 12.78F, new CubeDeformation(0.0F)).texOffs(42, 236)
				.addBox(-1.6748F, 10.2119F, -6.64F, 5.33F, 4.175F, 12.28F, new CubeDeformation(0.0F)).texOffs(408, 1005)
				.addBox(-2.2998F, 9.5869F, -7.265F, 2.83F, 5.425F, 12.905F, new CubeDeformation(0.0F))
				.texOffs(489, 1005).addBox(1.4502F, 9.5869F, -7.265F, 2.83F, 5.425F, 12.905F, new CubeDeformation(0.0F))
				.texOffs(389, 1009)
				.addBox(-9.7998F, 12.4619F, -5.89F, 22.33F, 1.675F, 13.28F, new CubeDeformation(0.0F)).texOffs(55, 268)
				.addBox(2.3252F, -2.6631F, -5.39F, 5.33F, 4.175F, 11.03F, new CubeDeformation(0.0F)).texOffs(258, 153)
				.addBox(1.1405F, -3.2728F, -5.39F, 6.58F, 2.925F, 11.03F, new CubeDeformation(0.0F)).texOffs(256, 237)
				.addBox(-5.71F, -3.2728F, -5.39F, 6.58F, 2.925F, 11.03F, new CubeDeformation(0.0F)).texOffs(268, 0)
				.addBox(-5.6448F, -2.6631F, -5.39F, 5.33F, 4.175F, 11.03F, new CubeDeformation(0.0F)).texOffs(272, 259)
				.addBox(-4.9713F, -3.0169F, -5.0496F, 5.8562F, 6.3533F, 9.8167F, new CubeDeformation(0.0F))
				.texOffs(94, 305)
				.addBox(-4.9133F, 1.2757F, -5.0496F, 4.7437F, 3.7157F, 9.8167F, new CubeDeformation(0.0F))
				.texOffs(150, 272)
				.addBox(1.1256F, -3.0169F, -5.0496F, 5.8562F, 6.3533F, 9.8167F, new CubeDeformation(0.0F))
				.texOffs(167, 304)
				.addBox(2.18F, 1.2757F, -5.0496F, 4.7437F, 3.7157F, 9.8167F, new CubeDeformation(0.0F)).texOffs(271, 99)
				.addBox(-4.9713F, 1.0456F, -4.9246F, 5.8562F, 6.3533F, 9.8167F, new CubeDeformation(0.0F))
				.texOffs(271, 15)
				.addBox(1.1256F, 1.0456F, -4.9246F, 5.8562F, 6.3533F, 9.8167F, new CubeDeformation(0.0F))
				.texOffs(245, 303)
				.addBox(2.18F, 5.3382F, -4.9246F, 4.7437F, 3.7157F, 9.8167F, new CubeDeformation(0.0F)).texOffs(303, 98)
				.addBox(-4.9133F, 5.3382F, -4.9246F, 4.7437F, 3.7157F, 9.8167F, new CubeDeformation(0.0F))
				.texOffs(169, 110).addBox(-7.2748F, 7.3869F, -4.725F, 16.53F, 3.75F, 10.92F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0052F, -9.8462F, 6.4593F, -0.6981F, 0.0F, 0.0F));

		PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(314, 274)
				.addBox(-7.71F, -3.45F, -4.87F, 2.615F, 0.9F, 11.15F, new CubeDeformation(0.0F)).texOffs(545, 325)
				.addBox(-7.71F, -4.65F, -4.87F, 2.615F, 0.9F, 11.15F, new CubeDeformation(0.0F)).texOffs(614, 135)
				.addBox(-7.65F, -6.15F, -4.75F, 9.08F, 13.35F, 10.97F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone_r2 = bone.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(747, 73)
				.addBox(5.095F, -3.45F, -4.87F, 2.615F, 0.9F, 11.15F, new CubeDeformation(0.0F)).texOffs(747, 251)
				.addBox(5.095F, -4.65F, -4.87F, 2.615F, 0.9F, 11.15F, new CubeDeformation(0.0F)).texOffs(488, 182)
				.addBox(-2.055F, -6.15F, -4.75F, 9.705F, 13.35F, 10.97F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0105F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bone_r3 = bone.addOrReplaceChild("bone_r3",
				CubeListBuilder.create().texOffs(726, 54).addBox(3.3F, 8.67F, -4.725F, 4.38F, 1.53F, 10.92F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4502F, 0.4288F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone_r4 = bone.addOrReplaceChild("bone_r4",
				CubeListBuilder.create().texOffs(294, 129).addBox(-7.68F, 8.67F, -4.725F, 4.38F, 1.53F, 10.92F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4307F, 0.4288F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition bone_r5 = bone.addOrReplaceChild("bone_r5",
				CubeListBuilder.create().texOffs(225, 149).addBox(-0.3F, 6.45F, -4.725F, 8.58F, 3.75F, 10.92F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4746F, 1.6831F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone_r6 = bone.addOrReplaceChild("bone_r6",
				CubeListBuilder.create().texOffs(645, 210).addBox(-8.28F, 6.45F, -4.725F, 8.73F, 3.75F, 10.92F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5359F, 1.6831F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone_r7 = bone.addOrReplaceChild("bone_r7",
				CubeListBuilder.create().texOffs(317, 48).addBox(-6.2523F, -56.8487F, -4.7971F, 1.9624F, 3.7157F,
						9.8167F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.0017F, 32.3292F, -0.1275F, 0.0F, 0.0F, -1.0036F));

		PartDefinition bone_r8 = bone.addOrReplaceChild("bone_r8",
				CubeListBuilder.create().texOffs(235, 317).addBox(4.2898F, -56.8487F, -4.7971F, 1.9624F, 3.7157F,
						9.8167F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-45.9912F, 32.3292F, -0.1275F, 0.0F, 0.0F, 1.0036F));

		PartDefinition bone_r9 = bone.addOrReplaceChild("bone_r9",
				CubeListBuilder.create().texOffs(165, 318).addBox(4.2898F, -56.8487F, -4.7971F, 1.9624F, 3.7157F,
						9.8167F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-45.9912F, 28.2667F, -0.2525F, 0.0F, 0.0F, 1.0036F));

		PartDefinition bone_r10 = bone.addOrReplaceChild("bone_r10",
				CubeListBuilder.create().texOffs(586, 211).addBox(-6.2523F, -56.8487F, -4.7971F, 1.9624F, 3.7157F,
						9.8167F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.0017F, 28.2667F, -0.2525F, 0.0F, 0.0F, -1.0036F));

		PartDefinition bone_r11 = bone.addOrReplaceChild("bone_r11",
				CubeListBuilder.create().texOffs(180, 205).addBox(-7.025F, -63.875F, -5.39F, 2.205F, 4.175F, 11.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(53.8102F, 27.6639F, 0.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition bone_r12 = bone.addOrReplaceChild("bone_r12",
				CubeListBuilder.create().texOffs(305, 304).addBox(4.82F, -63.875F, -5.39F, 2.205F, 4.175F, 11.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-51.7998F, 27.6639F, 0.0F, 0.0F, 0.0F, 1.0036F));

		PartDefinition bone_r13 = bone.addOrReplaceChild("bone_r13",
				CubeListBuilder.create().texOffs(269, 167).addBox(-7.025F, -63.875F, -5.39F, 5.33F, 4.175F, 11.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.5923F, 57.3595F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bone_r14 = bone.addOrReplaceChild("bone_r14",
				CubeListBuilder.create().texOffs(519, 248).addBox(1.695F, -63.875F, -5.39F, 5.33F, 4.175F, 11.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.5819F, 57.3595F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone_r15 = bone.addOrReplaceChild("bone_r15",
				CubeListBuilder.create().texOffs(387, 1007).addBox(-2.18F, -48.875F, -6.14F, 21.455F, 2.3F, 13.78F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0052F, 59.7119F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bone13 = bone.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(421, 992).addBox(-1.8675F, 10.2549F, -2.7116F, 5.1425F, 3.425F, 1.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5141F, 13.372F, -6.6492F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone13_r1 = bone13.addOrReplaceChild("bone13_r1",
				CubeListBuilder.create().texOffs(421, 998).addBox(-8.93F, -45.75F, -15.14F, 2.83F, 6.675F, 1.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.593F, 52.43F, 5.2254F, -0.1739F, 0.0151F, 0.0859F));

		PartDefinition bone13_r2 = bone13.addOrReplaceChild("bone13_r2",
				CubeListBuilder.create().texOffs(421, 947).addBox(-8.93F, -45.75F, -15.14F, 2.83F, 7.175F, 1.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.1511F, 48.0236F, 6.0023F, -0.1687F, -0.045F, -0.258F));

		PartDefinition bone13_r3 = bone13.addOrReplaceChild("bone13_r3",
				CubeListBuilder.create().texOffs(449, 1015).addBox(-8.93F, -45.75F, -15.14F, 2.83F, 7.3F, 1.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5193F, 45.4698F, 6.4527F, -0.1731F, 0.0227F, 0.1289F));

		PartDefinition bone12 = bone.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.5919F, 11.8775F, -6.5217F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone12_r1 = bone12.addOrReplaceChild("bone12_r1",
				CubeListBuilder.create().texOffs(386, 997).addBox(-1.555F, -47.3125F, -15.14F, 4.205F, 9.8625F, 1.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.75F, 49.059F, 6.1119F, -0.1515F, -0.0869F, -0.517F));

		PartDefinition bone12_r2 = bone12.addOrReplaceChild("bone12_r2",
				CubeListBuilder.create().texOffs(351, 1013).addBox(-1.555F, -47.3125F, -15.14F, 4.205F, 8.8625F, 1.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.4758F, 54.7098F, 4.6191F, -0.181F, -0.045F, -0.2146F));

		PartDefinition bone12_r3 = bone12.addOrReplaceChild("bone12_r3",
				CubeListBuilder.create().texOffs(408, 982).addBox(-0.18F, -45.75F, -15.14F, 2.83F, 7.3F, 1.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0867F, 47.5184F, 6.3835F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone12_r4 = bone12.addOrReplaceChild("bone12_r4",
				CubeListBuilder.create().texOffs(390, 1015).addBox(-0.18F, -45.75F, -15.14F, 2.83F, 7.3F, 1.03F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.8446F, 46.6586F, 6.5351F, -0.1687F, -0.045F, -0.258F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(677, 0)
						.addBox(-2.2408F, -1.3076F, -4.4146F, 8.4777F, 8.4777F, 10.5402F, new CubeDeformation(0.0F))
						.texOffs(578, 161)
						.addBox(-2.4593F, -3.2216F, -4.4146F, 6.4152F, 8.4777F, 10.5402F, new CubeDeformation(0.0F))
						.texOffs(641, 264)
						.addBox(-2.2408F, 6.5079F, -3.0396F, 7.7902F, 9.2664F, 7.7902F, new CubeDeformation(0.0F))
						.texOffs(551, 288)
						.addBox(-2.7324F, 6.2112F, -3.0396F, 7.7902F, 5.8289F, 7.7902F, new CubeDeformation(0.0F))
						.texOffs(644, 314)
						.addBox(0.5598F, 6.5079F, -1.9957F, 4.3021F, 12.8304F, 6.3899F, new CubeDeformation(0.0F))
						.texOffs(478, 317)
						.addBox(-2.419F, 6.5079F, -1.6393F, 6.9498F, 9.2664F, 4.9896F, new CubeDeformation(0.0F))
						.texOffs(776, 12)
						.addBox(-2.9283F, 0.7549F, -1.6393F, 7.0774F, 6.4658F, 4.9896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.5F, -53.5F, -2.5F, 0.1719F, 0.0302F, -0.4337F));

		PartDefinition leftarm_r1 = leftarm.addOrReplaceChild("leftarm_r1",
				CubeListBuilder.create().texOffs(582, 339).addBox(18.8714F, 9.0704F, -0.3564F, 3.6888F, 5.1022F,
						5.7024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.6892F, 14.5951F, -1.6393F, 0.0F, 0.0F, -0.4363F));

		PartDefinition leftarm_r2 = leftarm.addOrReplaceChild("leftarm_r2",
				CubeListBuilder.create().texOffs(756, 23).addBox(10.812F, -70.9755F, -3.4484F, 7.7902F, 3.7664F,
						7.7902F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1877F, 83.8197F, 0.4088F, 0.0F, 0.0F, -0.1309F));

		PartDefinition leftarm_r3 = leftarm.addOrReplaceChild("leftarm_r3",
				CubeListBuilder.create().texOffs(712, 221).addBox(12.187F, -78.791F, -4.8234F, 7.1027F, 2.9777F,
						10.5402F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(51.9141F, 62.201F, 0.4088F, 0.0F, 0.0F, -0.8727F));

		PartDefinition bone4 = leftarm.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(646, 292)
				.addBox(-1.0816F, -0.8317F, -4.2589F, 3.7835F, 14.1135F, 7.6476F, new CubeDeformation(0.0F))
				.texOffs(722, 311)
				.addBox(-1.4116F, -0.8317F, -3.4749F, 4.3096F, 14.1135F, 6.0795F, new CubeDeformation(0.0F))
				.texOffs(710, 284)
				.addBox(-2.8632F, 3.9751F, -3.3754F, 2.8006F, 2.5425F, 5.8806F, new CubeDeformation(0.0F))
				.texOffs(38, 161).addBox(-3.09F, 9.8701F, -5.4484F, 7.5F, 1.375F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9718F, 19.003F, 0.9822F, -0.2618F, 0.0F, 0.2618F));

		PartDefinition bone4_r1 = bone4.addOrReplaceChild("bone4_r1",
				CubeListBuilder.create().texOffs(794, 35).addBox(26.6135F, -53.6161F, -2.802F, 2.8006F, 5.2926F,
						5.8806F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-42.776F, 42.0592F, -0.5734F, 0.0F, 0.0F, 0.3054F));

		PartDefinition bone4_r2 = bone4.addOrReplaceChild("bone4_r2",
				CubeListBuilder.create().texOffs(756, 332).addBox(26.6135F, -35.7411F, -2.802F, 2.8006F, 6.6675F,
						5.8806F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.3193F, 47.9289F, -0.5734F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bone4_r3 = bone4.addOrReplaceChild("bone4_r3",
				CubeListBuilder.create().texOffs(656, 173).addBox(13.613F, -55.3246F, -2.9015F, 4.3096F, 4.6259F,
						6.0795F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.132F, 56.0575F, -0.5734F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone4_r4 = bone4.addOrReplaceChild("bone4_r4",
				CubeListBuilder.create().texOffs(773, 299).addBox(13.613F, -59.9996F, -2.9015F, 4.3096F, 9.301F,
						6.0795F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.2189F, 63.1504F, -0.5734F, 0.0F, 0.0F, 0.0436F));

		PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offset(0.9603F, 13.6581F, -0.0378F));

		PartDefinition bone9_r1 = bone9.addOrReplaceChild("bone9_r1",
				CubeListBuilder.create().texOffs(475, 188).addBox(24.0516F, 31.3632F, -0.3921F, 2.3522F, 4.6849F,
						6.2726F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-33.8278F, -24.7858F, -3.1416F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bone9_r2 = bone9.addOrReplaceChild("bone9_r2",
				CubeListBuilder.create().texOffs(479, 33).addBox(23.7283F, 30.3831F, -1.2071F, 1.3623F, 3.2927F,
						1.4342F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.5452F, -11.6777F, -3.5255F, 0.1343F, -0.1119F, 1.7378F));

		PartDefinition bone9_r3 = bone9.addOrReplaceChild("bone9_r3",
				CubeListBuilder.create().texOffs(551, 27).addBox(22.7383F, 30.3831F, -1.3721F, 2.3522F, 3.2927F,
						1.7642F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.961F, -30.8548F, -2.531F, 0.1745F, 0.0F, 1.0472F));

		PartDefinition bone9_r4 = bone9.addOrReplaceChild("bone9_r4",
				CubeListBuilder.create().texOffs(512, 16).addBox(23.7283F, 30.3831F, -1.2071F, 1.3623F, 3.9528F,
						1.4342F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.584F, -24.7353F, -1.9576F, 0.0737F, -0.0468F, 1.2636F));

		PartDefinition bone9_r5 = bone9.addOrReplaceChild("bone9_r5",
				CubeListBuilder.create().texOffs(453, 126).addBox(22.7383F, 30.3831F, -1.3721F, 2.3522F, 3.9528F,
						1.7642F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0138F, -34.1143F, -1.5418F, 0.0873F, 0.0F, 0.6981F));

		PartDefinition bone9_r6 = bone9.addOrReplaceChild("bone9_r6",
				CubeListBuilder.create().texOffs(477, 49).addBox(23.5633F, 30.3831F, -0.227F, 1.5273F, 3.9528F, 1.4342F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1738F, -29.867F, 1.352F, -0.0791F, 0.0368F, 0.8712F));

		PartDefinition bone9_r7 = bone9.addOrReplaceChild("bone9_r7",
				CubeListBuilder.create().texOffs(510, 111).addBox(22.7383F, 30.3831F, -0.3921F, 2.3523F, 3.9528F,
						1.7642F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.1958F, -32.8523F, 1.0205F, -0.0873F, 0.0F, 0.4363F));

		PartDefinition bone9_r8 = bone9.addOrReplaceChild("bone9_r8",
				CubeListBuilder.create().texOffs(505, 50).addBox(23.5633F, 30.3831F, -0.2271F, 1.5273F, 3.9528F,
						1.4342F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3392F, -30.0703F, 2.6918F, -0.1515F, 0.0869F, 0.6915F));

		PartDefinition bone9_r9 = bone9.addOrReplaceChild("bone9_r9",
				CubeListBuilder.create().texOffs(536, 111).addBox(22.7383F, 30.3831F, -0.3921F, 2.3523F, 3.9528F,
						1.7642F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.7053F, -28.9064F, 1.9065F, -0.1745F, 0.0F, 0.1745F));

		PartDefinition bone9_r10 = bone9.addOrReplaceChild("bone9_r10",
				CubeListBuilder.create().texOffs(549, 51).addBox(23.0683F, 31.3632F, -0.7841F, 1.6923F, 3.6326F,
						1.1972F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0425F, -36.726F, -3.1172F, 0.1745F, 0.3491F, 0.6109F));

		PartDefinition bone9_r11 = bone9.addOrReplaceChild("bone9_r11",
				CubeListBuilder.create().texOffs(510, 8).addBox(22.7383F, 31.3632F, -0.7841F, 2.3522F, 6.2726F, 2.3523F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.126F, -30.9214F, 22.1637F, -0.6109F, 0.3491F, 0.6109F));

		PartDefinition bone9_r12 = bone9.addOrReplaceChild("bone9_r12",
				CubeListBuilder.create().texOffs(657, 330).addBox(22.7383F, 31.3632F, -0.7841F, 2.3523F, 6.2726F,
						7.0567F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.5216F, -35.62F, -3.1416F, 0.0F, 0.0F, 0.1745F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(547, 223)
						.addBox(-6.2369F, -1.3076F, -4.4146F, 8.4777F, 8.4777F, 10.5402F, new CubeDeformation(0.0F))
						.texOffs(235, 164)
						.addBox(-3.9559F, -3.2216F, -4.4146F, 6.4152F, 8.4777F, 10.5402F, new CubeDeformation(0.0F))
						.texOffs(684, 125)
						.addBox(-5.5494F, 6.5079F, -3.0396F, 7.7902F, 9.2664F, 7.7902F, new CubeDeformation(0.0F))
						.texOffs(708, 115)
						.addBox(-5.0578F, 6.2112F, -3.0396F, 7.7902F, 5.8289F, 7.7902F, new CubeDeformation(0.0F))
						.texOffs(77, 313)
						.addBox(-4.8619F, 6.5079F, -1.9957F, 4.3021F, 12.8304F, 6.3899F, new CubeDeformation(0.0F))
						.texOffs(211, 316)
						.addBox(-4.5308F, 6.5079F, -1.6393F, 6.9498F, 9.2664F, 4.9896F, new CubeDeformation(0.0F))
						.texOffs(64, 236)
						.addBox(-4.1491F, 0.7549F, -1.6393F, 7.0774F, 6.4658F, 4.9896F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.5F, -53.5F, -2.5F, 0.1719F, -0.0302F, 0.4337F));

		PartDefinition rightarm_r1 = rightarm.addOrReplaceChild("rightarm_r1",
				CubeListBuilder.create().texOffs(337, 336).addBox(-22.5601F, 9.0704F, -0.3564F, 3.6888F, 5.1022F,
						5.7024F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.6892F, 14.5951F, -1.6393F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightarm_r2 = rightarm.addOrReplaceChild("rightarm_r2",
				CubeListBuilder.create().texOffs(724, 200).addBox(-18.6022F, -70.9755F, -3.4484F, 7.7902F, 3.7664F,
						7.7902F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1877F, 83.8197F, 0.4088F, 0.0F, 0.0F, 0.1309F));

		PartDefinition rightarm_r3 = rightarm.addOrReplaceChild("rightarm_r3",
				CubeListBuilder.create().texOffs(160, 258).addBox(-19.2897F, -78.791F, -4.8234F, 7.1027F, 2.9777F,
						10.5402F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-51.9141F, 62.201F, 0.4088F, 0.0F, 0.0F, 0.8727F));

		PartDefinition bone2 = rightarm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 270)
				.addBox(-2.702F, -0.8317F, -4.2589F, 3.7835F, 14.1135F, 7.6476F, new CubeDeformation(0.0F))
				.texOffs(0, 308)
				.addBox(-3.3895F, 10.1683F, -4.8089F, 5.846F, 3.1135F, 8.7477F, new CubeDeformation(0.0F))
				.texOffs(409, 1013)
				.addBox(-3.3895F, 8.1058F, -4.8089F, 5.846F, 1.7385F, 8.7477F, new CubeDeformation(0.0F))
				.texOffs(178, 25)
				.addBox(-2.898F, -0.8317F, -3.4749F, 4.3096F, 14.1135F, 6.0795F, new CubeDeformation(0.0F))
				.texOffs(58, 283)
				.addBox(0.0626F, 3.9751F, -3.3754F, 2.8006F, 2.5425F, 5.8806F, new CubeDeformation(0.0F))
				.texOffs(381, 1012).addBox(-4.41F, 9.8701F, -5.4484F, 7.5F, 1.375F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9718F, 19.003F, 0.9822F, -0.2618F, 0.0F, -0.2618F));

		PartDefinition bone2_r1 = bone2.addOrReplaceChild("bone2_r1",
				CubeListBuilder.create().texOffs(603, 164).addBox(-29.414F, -53.6161F, -2.802F, 2.8006F, 5.2926F,
						5.8806F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(42.776F, 42.0592F, -0.5734F, 0.0F, 0.0F, -0.3054F));

		PartDefinition bone2_r2 = bone2.addOrReplaceChild("bone2_r2",
				CubeListBuilder.create().texOffs(332, 235).addBox(-29.414F, -35.7411F, -2.802F, 2.8006F, 6.6675F,
						5.8806F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.3193F, 47.9289F, -0.5734F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone2_r3 = bone2.addOrReplaceChild("bone2_r3",
				CubeListBuilder.create().texOffs(331, 0).addBox(-17.9226F, -55.3246F, -2.9015F, 4.3096F, 4.6259F,
						6.0795F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.132F, 56.0575F, -0.5734F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone2_r4 = bone2.addOrReplaceChild("bone2_r4",
				CubeListBuilder.create().texOffs(0, 320).addBox(-17.9226F, -59.9996F, -2.9015F, 4.3096F, 9.301F,
						6.0795F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.2189F, 63.1504F, -0.5734F, 0.0F, 0.0F, -0.0436F));

		PartDefinition bone2_r5 = bone2.addOrReplaceChild("bone2_r5",
				CubeListBuilder.create().texOffs(370, 1010).addBox(-18.9641F, -51.8871F, -16.8855F, 6.396F, 1.7385F,
						9.5726F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0245F, 63.9804F, -0.5734F, -0.2548F, -0.0606F, 0.0036F));

		PartDefinition bone2_r6 = bone2.addOrReplaceChild("bone2_r6",
				CubeListBuilder.create().texOffs(392, 1001).addBox(-18.4141F, -52.4371F, -4.5105F, 6.1211F, 1.7385F,
						9.2977F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.4845F, 61.1431F, -0.5734F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone2_r7 = bone2.addOrReplaceChild("bone2_r7",
				CubeListBuilder.create().texOffs(393, 1013).addBox(-18.414F, -55.8746F, -4.2355F, 6.4648F, 1.7385F,
						8.7477F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0245F, 60.0376F, -17.1664F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone2_r8 = bone2.addOrReplaceChild("bone2_r8",
				CubeListBuilder.create().texOffs(395, 1013).addBox(-18.414F, -55.8746F, -4.2355F, 6.4648F, 1.7385F,
						8.7477F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0245F, 60.2535F, 6.3386F, 0.1309F, 0.0F, 0.0F));

		PartDefinition taima_sword = bone2.addOrReplaceChild("taima_sword",
				CubeListBuilder.create().texOffs(0, 999)
						.addBox(-0.3613F, -0.5786F, -3.7642F, 1.0335F, 16.8634F, 7.3727F, new CubeDeformation(0.0F))
						.texOffs(0, 990)
						.addBox(-0.3613F, -0.5786F, -3.0767F, 1.0335F, 27.8634F, 5.9977F, new CubeDeformation(0.0F))
						.texOffs(0, 980)
						.addBox(-0.3613F, -0.5787F, -2.3892F, 1.0335F, 38.8635F, 4.6227F, new CubeDeformation(0.0F))
						.texOffs(0, 973).addBox(-0.3613F, -0.5787F, -1.7017F, 1.0335F, 47.1135F, 3.2477F,
								new CubeDeformation(0.0F)),
				PartPose.offset(-3.0282F, 13.497F, -0.3572F));

		PartDefinition taima_sword2 = taima_sword.addOrReplaceChild("taima_sword2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(-0.9603F, 13.6581F, -0.0378F));

		PartDefinition bone3_r1 = bone3.addOrReplaceChild("bone3_r1",
				CubeListBuilder.create().texOffs(0, 188).addBox(-26.4039F, 31.3632F, -0.3921F, 2.3522F, 4.6849F,
						6.2726F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(33.8278F, -24.7858F, -3.1416F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone3_r2 = bone3.addOrReplaceChild("bone3_r2",
				CubeListBuilder.create().texOffs(18, 33).addBox(-25.0906F, 30.3831F, -1.2071F, 1.3623F, 3.2927F,
						1.4342F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-31.5453F, -11.6777F, -3.5255F, 0.1343F, 0.1119F, -1.7378F));

		PartDefinition bone3_r3 = bone3.addOrReplaceChild("bone3_r3",
				CubeListBuilder.create().texOffs(422, 76).addBox(-25.0906F, 30.3831F, -1.3721F, 2.3522F, 3.2927F,
						1.7642F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.961F, -30.8548F, -2.531F, 0.1745F, 0.0F, -1.0472F));

		PartDefinition bone3_r4 = bone3.addOrReplaceChild("bone3_r4",
				CubeListBuilder.create().texOffs(24, 54).addBox(-25.0906F, 30.3831F, -1.2071F, 1.3623F, 3.9528F,
						1.4342F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.584F, -24.7353F, -1.9576F, 0.0737F, 0.0468F, -1.2636F));

		PartDefinition bone3_r5 = bone3.addOrReplaceChild("bone3_r5",
				CubeListBuilder.create().texOffs(121, 0).addBox(-25.0906F, 30.3831F, -1.3721F, 2.3522F, 3.9528F,
						1.7642F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0138F, -34.1143F, -1.5418F, 0.0873F, 0.0F, -0.6981F));

		PartDefinition bone3_r6 = bone3.addOrReplaceChild("bone3_r6",
				CubeListBuilder.create().texOffs(24, 39).addBox(-25.0906F, 30.3831F, -0.227F, 1.5273F, 3.9528F, 1.4342F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1738F, -29.867F, 1.352F, -0.0791F, -0.0368F, -0.8712F));

		PartDefinition bone3_r7 = bone3.addOrReplaceChild("bone3_r7",
				CubeListBuilder.create().texOffs(104, 88).addBox(-25.0906F, 30.3831F, -0.3921F, 2.3523F, 3.9528F,
						1.7642F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.1958F, -32.8523F, 1.0205F, -0.0873F, 0.0F, -0.4363F));

		PartDefinition bone3_r8 = bone3.addOrReplaceChild("bone3_r8",
				CubeListBuilder.create().texOffs(24, 44).addBox(-25.0906F, 30.3831F, -0.2271F, 1.5273F, 3.9528F,
						1.4342F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3392F, -30.0703F, 2.6918F, -0.1515F, -0.0869F, -0.6915F));

		PartDefinition bone3_r9 = bone3.addOrReplaceChild("bone3_r9",
				CubeListBuilder.create().texOffs(107, 51).addBox(-25.0906F, 30.3831F, -0.3921F, 2.3523F, 3.9528F,
						1.7642F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7053F, -28.9064F, 1.9065F, -0.1745F, 0.0F, -0.1745F));

		PartDefinition bone3_r10 = bone3.addOrReplaceChild("bone3_r10",
				CubeListBuilder.create().texOffs(435, 80).addBox(-24.7605F, 31.3632F, -0.7841F, 1.6923F, 3.6326F,
						1.1972F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0425F, -36.726F, -3.1172F, 0.1745F, -0.3491F, -0.6109F));

		PartDefinition bone3_r11 = bone3.addOrReplaceChild("bone3_r11",
				CubeListBuilder.create().texOffs(35, 35).addBox(-25.0905F, 31.3632F, -0.7841F, 2.3522F, 6.2726F,
						2.3523F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1261F, -30.9214F, 22.1637F, -0.6109F, -0.3491F, -0.6109F));

		PartDefinition bone3_r12 = bone3.addOrReplaceChild("bone3_r12",
				CubeListBuilder.create().texOffs(13, 328).addBox(-25.0906F, 31.3632F, -0.7841F, 2.3523F, 6.2726F,
						7.0567F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.5215F, -35.62F, -3.1416F, 0.0F, 0.0F, -0.1745F));

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition waist = root.addOrReplaceChild("waist", CubeListBuilder.create(),
				PartPose.offset(0.0F, -52.5F, 5.0F));

		PartDefinition wheel = partdefinition.addOrReplaceChild("wheel",
				CubeListBuilder.create().texOffs(1001, 1012).addBox(-3.2062F, -4.0564F, -2.6538F, 5.6109F, 5.6109F,
						5.6109F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -77.75F, 1.125F, -0.2618F, 0.0F, 0.0F));

		PartDefinition wheel2 = wheel.addOrReplaceChild("wheel2",
				CubeListBuilder.create().texOffs(983, 983)
						.addBox(-2.243F, -28.2916F, -10.3293F, 4.8094F, 3.2062F, 2.4047F, new CubeDeformation(0.0F))
						.texOffs(945, 972)
						.addBox(-2.243F, -28.2916F, 11.4443F, 4.8094F, 3.2062F, 2.4047F, new CubeDeformation(0.0F))
						.texOffs(956, 990)
						.addBox(-1.0406F, -27.8908F, -14.2057F, 2.4047F, 2.4047F, 31.2609F, new CubeDeformation(0.0F))
						.texOffs(967, 1015)
						.addBox(-1.8422F, -28.6923F, 16.2537F, 4.0078F, 4.0078F, 4.0078F, new CubeDeformation(0.0F))
						.texOffs(956, 980)
						.addBox(-1.8422F, -28.6923F, -17.0112F, 4.0078F, 4.0078F, 4.0078F, new CubeDeformation(0.0F))
						.texOffs(973, 1004)
						.addBox(-18.675F, -28.6923F, -0.1784F, 4.0078F, 4.0078F, 4.0078F, new CubeDeformation(0.0F))
						.texOffs(1007, 1015).addBox(14.9906F, -28.6923F, -0.1784F, 4.0078F, 4.0078F, 4.0078F,
								new CubeDeformation(0.0F)),
				PartPose.offset(-0.5625F, 25.4375F, -1.5938F));

		PartDefinition makora_haguruma_r1 = wheel2.addOrReplaceChild("makora_haguruma_r1",
				CubeListBuilder.create().texOffs(1005, 982).addBox(-30.4594F, -60.9188F, 18.4359F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.7319F, 32.6272F, -17.0615F, 0.0F, 0.3927F, 0.0F));

		PartDefinition makora_haguruma_r2 = wheel2.addOrReplaceChild("makora_haguruma_r2",
				CubeListBuilder.create().texOffs(991, 982).addBox(-30.4594F, -60.9188F, 18.4359F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.8112F, 32.6272F, -24.266F, 0.0F, 0.7854F, 0.0F));

		PartDefinition makora_haguruma_r3 = wheel2.addOrReplaceChild("makora_haguruma_r3",
				CubeListBuilder.create().texOffs(971, 1015).addBox(-30.4594F, -60.9188F, 18.4359F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8125F, 32.6272F, -27.5084F, 0.0F, 1.1781F, 0.0F));

		PartDefinition makora_haguruma_r4 = wheel2.addOrReplaceChild("makora_haguruma_r4",
				CubeListBuilder.create().texOffs(956, 988)
						.addBox(-29.257F, -60.518F, -24.0469F, 2.4047F, 2.4047F, 31.2609F, new CubeDeformation(0.0F))
						.texOffs(991, 995)
						.addBox(-30.4594F, -60.9188F, -20.8406F, 4.8094F, 3.2062F, 2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5897F, 32.6272F, 29.8145F, 0.0F, -1.5708F, 0.0F));

		PartDefinition makora_haguruma_r5 = wheel2.addOrReplaceChild("makora_haguruma_r5",
				CubeListBuilder.create().texOffs(947, 968).addBox(-30.4594F, -60.9188F, -20.8406F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8125F, 32.6272F, 31.028F, 0.0F, -1.1781F, 0.0F));

		PartDefinition makora_haguruma_r6 = wheel2.addOrReplaceChild("makora_haguruma_r6",
				CubeListBuilder.create().texOffs(991, 990).addBox(-30.4594F, -60.9188F, -20.8406F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.8112F, 32.6272F, 27.7857F, 0.0F, -0.7854F, 0.0F));

		PartDefinition makora_haguruma_r7 = wheel2.addOrReplaceChild("makora_haguruma_r7",
				CubeListBuilder.create().texOffs(961, 968).addBox(-30.4594F, -60.9188F, -20.8406F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.7319F, 32.6272F, 20.5812F, 0.0F, -0.3927F, 0.0F));

		PartDefinition makora_haguruma_r8 = wheel2.addOrReplaceChild("makora_haguruma_r8",
				CubeListBuilder.create().texOffs(980, 1003).addBox(25.65F, -60.9188F, -20.8406F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.9132F, 32.6272F, 29.8145F, 0.0F, 1.5708F, 0.0F));

		PartDefinition makora_haguruma_r9 = wheel2.addOrReplaceChild("makora_haguruma_r9",
				CubeListBuilder.create().texOffs(1001, 1000).addBox(25.65F, -60.9188F, 18.4359F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4891F, 32.6272F, -27.5084F, 0.0F, -1.1781F, 0.0F));

		PartDefinition makora_haguruma_r10 = wheel2.addOrReplaceChild("makora_haguruma_r10",
				CubeListBuilder.create().texOffs(970, 988)
						.addBox(42.8836F, -61.3195F, 6.8133F, 4.0078F, 4.0078F, 4.0078F, new CubeDeformation(0.0F))
						.texOffs(1003, 999)
						.addBox(9.218F, -61.3195F, 6.8133F, 4.0078F, 4.0078F, 4.0078F, new CubeDeformation(0.0F))
						.texOffs(1007, 974)
						.addBox(26.0508F, -61.3195F, -10.0195F, 4.0078F, 4.0078F, 4.0078F, new CubeDeformation(0.0F))
						.texOffs(1002, 999)
						.addBox(26.0508F, -61.3195F, 23.6461F, 4.0078F, 4.0078F, 4.0078F, new CubeDeformation(0.0F))
						.texOffs(956, 988)
						.addBox(26.8524F, -60.518F, -6.8133F, 2.4047F, 2.4047F, 31.2609F, new CubeDeformation(0.0F))
						.texOffs(931, 995)
						.addBox(25.65F, -60.9188F, 18.4359F, 4.8094F, 3.2062F, 2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4877F, 32.6272F, -24.266F, 0.0F, -0.7854F, 0.0F));

		PartDefinition makora_haguruma_r11 = wheel2.addOrReplaceChild("makora_haguruma_r11",
				CubeListBuilder.create().texOffs(945, 1000).addBox(25.65F, -60.9188F, 18.4359F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.4084F, 32.6272F, -17.0615F, 0.0F, -0.3927F, 0.0F));

		PartDefinition makora_haguruma_r12 = wheel2.addOrReplaceChild("makora_haguruma_r12",
				CubeListBuilder.create().texOffs(1009, 1013).addBox(25.65F, -60.9188F, -20.8406F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4891F, 32.6272F, 31.028F, 0.0F, 1.1781F, 0.0F));

		PartDefinition makora_haguruma_r13 = wheel2.addOrReplaceChild("makora_haguruma_r13",
				CubeListBuilder.create().texOffs(956, 990)
						.addBox(26.8524F, -60.518F, -24.4477F, 2.4047F, 2.4047F, 31.2609F, new CubeDeformation(0.0F))
						.texOffs(999, 1018)
						.addBox(25.65F, -60.9188F, -20.8406F, 4.8094F, 3.2062F, 2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4877F, 32.6272F, 27.7857F, 0.0F, 0.7854F, 0.0F));

		PartDefinition makora_haguruma_r14 = wheel2.addOrReplaceChild("makora_haguruma_r14",
				CubeListBuilder.create().texOffs(1009, 1018).addBox(25.65F, -60.9188F, -20.8406F, 4.8094F, 3.2062F,
						2.4047F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.4084F, 32.6272F, 20.5812F, 0.0F, 0.3927F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.75F, -28.5F, 5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone6 = right_leg.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(52, 68).addBox(-6.7015F, -0.5209F, -5.7472F, 12.5F, 30.0F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7015F, 0.5209F, -1.1278F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone6_r1 = bone6.addOrReplaceChild("bone6_r1", CubeListBuilder.create().texOffs(995, 0)
				.addBox(-0.375F, -8.125F, -20.6875F, 4.125F, 8.75F, 10.0F, new CubeDeformation(0.0F)).texOffs(239, 284)
				.addBox(-10.0F, -9.375F, -27.8125F, 4.125F, 8.75F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 32.5F, 7.5F, -1.0036F, -0.3491F, 0.0F));

		PartDefinition bone6_r2 = bone6.addOrReplaceChild("bone6_r2",
				CubeListBuilder.create().texOffs(0, 161).addBox(3.75F, -28.125F, 4.375F, 10.0F, 8.75F, 17.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.9099F, 36.6974F, -3.8722F, 0.0F, 0.6981F, -1.0036F));

		PartDefinition bone6_r3 = bone6.addOrReplaceChild("bone6_r3",
				CubeListBuilder.create().texOffs(245, 92).addBox(-19.375F, -17.5F, 14.375F, 10.0F, 8.75F, 7.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3129F, 36.6974F, -3.8722F, 0.0F, -0.6981F, 1.0036F));

		PartDefinition bone6_r4 = bone6.addOrReplaceChild("bone6_r4",
				CubeListBuilder.create().texOffs(312, 261).addBox(-22.5F, -13.125F, 5.875F, 10.0F, 8.75F, 4.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2043F, 38.4375F, -3.0737F, 0.0F, -0.3491F, 1.0036F));

		PartDefinition bone6_r5 = bone6.addOrReplaceChild("bone6_r5",
				CubeListBuilder.create().texOffs(246, 204).addBox(-22.5F, -13.125F, 2.5F, 10.0F, 8.75F, 7.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3129F, 36.6974F, -3.8722F, 0.0F, 0.0F, 1.0036F));

		PartDefinition bone6_r6 = bone6.addOrReplaceChild("bone6_r6",
				CubeListBuilder.create().texOffs(995, 0).addBox(12.5F, -13.125F, -10.0F, 10.0F, 8.75F, 4.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0513F, 32.5F, 3.4543F, 0.0F, -0.3491F, -1.0036F));

		PartDefinition bone6_r7 = bone6.addOrReplaceChild("bone6_r7",
				CubeListBuilder.create().texOffs(989, 0).addBox(12.5F, -13.125F, -10.0F, 10.0F, 8.75F, 7.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1599F, 30.7598F, 4.2528F, 0.0F, 0.0F, -1.0036F));

		PartDefinition bone6_r8 = bone6.addOrReplaceChild("bone6_r8", CubeListBuilder.create().texOffs(222, 132)
				.addBox(4.6875F, -15.0F, 1.25F, 5.3125F, 7.5F, 3.125F, new CubeDeformation(0.0F)).texOffs(336, 253)
				.addBox(4.6875F, -15.0F, 1.25F, 4.625F, 7.5F, 4.375F, new CubeDeformation(0.0F)).texOffs(325, 314)
				.addBox(4.6875F, -15.0F, 1.25F, 4.3125F, 7.5F, 6.0625F, new CubeDeformation(0.0F)).texOffs(279, 66)
				.addBox(4.6875F, -15.0F, 1.25F, 3.875F, 7.5F, 10.625F, new CubeDeformation(0.0F)).texOffs(201, 189)
				.addBox(4.6875F, -15.0F, 1.25F, 2.8125F, 7.5F, 16.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0747F, 21.0138F, 8.5797F, 1.6892F, -0.816F, 0.079F));

		PartDefinition bone6_r9 = bone6.addOrReplaceChild("bone6_r9",
				CubeListBuilder.create().texOffs(59, 295).addBox(4.6875F, -15.0F, 1.25F, 5.3125F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.701F, 33.5404F, 3.5484F, 0.9475F, -0.816F, 0.079F));

		PartDefinition bone6_r10 = bone6.addOrReplaceChild("bone6_r10",
				CubeListBuilder.create().texOffs(298, 57).addBox(-10.0F, -15.0F, 1.25F, 5.3125F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.7981F, 33.5404F, 3.5484F, 0.9475F, 0.816F, -0.079F));

		PartDefinition bone6_r11 = bone6.addOrReplaceChild("bone6_r11", CubeListBuilder.create().texOffs(337, 132)
				.addBox(-9.3125F, -15.0F, 1.25F, 4.625F, 7.5F, 4.375F, new CubeDeformation(0.0F)).texOffs(100, 227)
				.addBox(-10.0F, -15.0F, 1.25F, 5.3125F, 7.5F, 3.125F, new CubeDeformation(0.0F)).texOffs(326, 194)
				.addBox(-9.0F, -15.0F, 1.25F, 4.3125F, 7.5F, 6.0625F, new CubeDeformation(0.0F)).texOffs(209, 280)
				.addBox(-8.5625F, -15.0F, 1.25F, 3.875F, 7.5F, 10.625F, new CubeDeformation(0.0F)).texOffs(985, 0)
				.addBox(-7.5F, -15.0F, 1.25F, 2.8125F, 7.5F, 16.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.1717F, 21.0138F, 8.5797F, 1.6892F, 0.816F, -0.079F));

		PartDefinition bone6_r12 = bone6.addOrReplaceChild("bone6_r12", CubeListBuilder.create().texOffs(344, 46)
				.addBox(4.6875F, -15.0F, -4.375F, 5.3125F, 7.5F, 3.125F, new CubeDeformation(0.0F)).texOffs(269, 337)
				.addBox(4.6875F, -15.0F, -5.625F, 4.625F, 7.5F, 4.375F, new CubeDeformation(0.0F)).texOffs(328, 208)
				.addBox(4.6875F, -15.0F, -7.3125F, 4.3125F, 7.5F, 6.0625F, new CubeDeformation(0.0F)).texOffs(171, 281)
				.addBox(4.6875F, -15.0F, -11.875F, 3.875F, 7.5F, 10.625F, new CubeDeformation(0.0F)).texOffs(98, 203)
				.addBox(4.6875F, -15.0F, -17.5F, 2.8125F, 7.5F, 16.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.0747F, 21.0138F, -7.5741F, -1.6892F, 0.816F, 0.079F));

		PartDefinition bone6_r13 = bone6.addOrReplaceChild("bone6_r13",
				CubeListBuilder.create().texOffs(217, 299).addBox(4.6875F, -15.0F, -10.0F, 5.3125F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.701F, 33.5404F, -2.5429F, -0.9475F, 0.816F, 0.079F));

		PartDefinition bone6_r14 = bone6.addOrReplaceChild("bone6_r14", CubeListBuilder.create().texOffs(344, 99)
				.addBox(-10.0F, -15.0F, -4.375F, 5.3125F, 7.5F, 3.125F, new CubeDeformation(0.0F)).texOffs(323, 328)
				.addBox(-9.0F, -15.0F, -7.3125F, 4.3125F, 7.5F, 6.0625F, new CubeDeformation(0.0F)).texOffs(49, 338)
				.addBox(-9.3125F, -15.0F, -5.625F, 4.625F, 7.5F, 4.375F, new CubeDeformation(0.0F)).texOffs(281, 240)
				.addBox(-8.5625F, -15.0F, -11.875F, 3.875F, 7.5F, 10.625F, new CubeDeformation(0.0F)).texOffs(985, 0)
				.addBox(-7.5F, -15.0F, -17.5F, 2.8125F, 7.5F, 16.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.1717F, 21.0138F, -7.5741F, -1.6892F, -0.816F, -0.079F));

		PartDefinition bone6_r15 = bone6.addOrReplaceChild("bone6_r15",
				CubeListBuilder.create().texOffs(21, 300).addBox(-10.0F, -15.0F, -10.0F, 5.3125F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.7981F, 33.5404F, -2.5429F, -0.9475F, -0.816F, -0.079F));

		PartDefinition bone6_r16 = bone6.addOrReplaceChild("bone6_r16",
				CubeListBuilder.create().texOffs(104, 51).addBox(-10.0F, -31.25F, -2.5F, 12.5F, 23.75F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2985F, 30.7598F, 2.1141F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone6_r17 = bone6.addOrReplaceChild("bone6_r17",
				CubeListBuilder.create().texOffs(216, 116).addBox(-10.0F, -15.0F, 1.25F, 12.5F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2985F, 33.87F, 13.231F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone6_r18 = bone6.addOrReplaceChild("bone6_r18",
				CubeListBuilder.create().texOffs(130, 122).addBox(-10.0F, -30.0F, -10.0F, 12.5F, 22.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2985F, 30.7598F, -1.1086F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone6_r19 = bone6.addOrReplaceChild("bone6_r19",
				CubeListBuilder.create().texOffs(217, 76).addBox(-10.0F, -15.0F, -10.0F, 12.5F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2985F, 33.87F, -12.2254F, -1.1345F, 0.0F, 0.0F));

		PartDefinition bone6_r20 = bone6.addOrReplaceChild("bone6_r20",
				CubeListBuilder.create().texOffs(129, 184).addBox(1.25F, -15.0F, -10.0F, 8.75F, 7.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.2767F, 33.87F, 4.2528F, 0.0F, 0.0F, -1.1345F));

		PartDefinition bone6_r21 = bone6.addOrReplaceChild("bone6_r21",
				CubeListBuilder.create().texOffs(974, 0).addBox(-2.5F, -30.0F, -10.0F, 12.5F, 22.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1599F, 30.7598F, 4.2528F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bone6_r22 = bone6.addOrReplaceChild("bone6_r22",
				CubeListBuilder.create().texOffs(173, 185).addBox(-10.0F, -15.0F, -10.0F, 8.75F, 7.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.1797F, 33.87F, 4.2528F, 0.0F, 0.0F, 1.1345F));

		PartDefinition bone6_r23 = bone6.addOrReplaceChild("bone6_r23",
				CubeListBuilder.create().texOffs(91, 148).addBox(-10.0F, -30.0F, -10.0F, 12.5F, 22.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0629F, 30.7598F, 4.2528F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone7 = right_leg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(546, 262)
				.addBox(-3.5595F, -0.6728F, -3.75F, 7.5F, 12.5F, 7.5F, new CubeDeformation(0.0F)).texOffs(418, 42)
				.addBox(-2.9345F, -0.6728F, -3.75F, 6.25F, 23.125F, 6.25F, new CubeDeformation(0.0F)).texOffs(156, 65)
				.addBox(-4.1845F, 16.4522F, -5.0F, 8.75F, 1.375F, 8.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, 29.375F, -1.25F, 0.2618F, 0.0F, 0.1745F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(466, 229)
				.addBox(-3.1099F, 2.509F, -11.25F, 6.25F, 1.875F, 14.375F, new CubeDeformation(0.0F)).texOffs(587, 134)
				.addBox(-3.1099F, 1.134F, -3.125F, 6.25F, 3.25F, 6.25F, new CubeDeformation(0.0F)).texOffs(457, 135)
				.addBox(1.2651F, 2.759F, -13.75F, 1.875F, 1.625F, 2.625F, new CubeDeformation(0.0F)).texOffs(522, 149)
				.addBox(-0.7349F, 2.759F, -13.75F, 1.75F, 1.625F, 2.625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1905F, 19.3272F, -0.625F, -0.0876F, 0.0869F, -0.1822F));

		PartDefinition bone8_r1 = bone8.addOrReplaceChild("bone8_r1", CubeListBuilder.create().texOffs(620, 42)
				.addBox(-9.375F, -8.75F, -11.5F, 3.1875F, 3.1875F, 7.4375F, new CubeDeformation(0.0F)).texOffs(484, 261)
				.addBox(-9.375F, -8.75F, -17.75F, 3.1875F, 1.875F, 13.8125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.1733F, 7.2097F, 6.1952F, 0.2182F, 0.2182F, 0.0F));

		PartDefinition bone8_r2 = bone8.addOrReplaceChild("bone8_r2",
				CubeListBuilder.create().texOffs(663, 67).addBox(-9.375F, -8.75F, -17.75F, 3.1875F, 1.875F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8545F, 11.259F, 4.757F, 0.0F, 0.2182F, 0.0F));

		PartDefinition bone8_r3 = bone8.addOrReplaceChild("bone8_r3", CubeListBuilder.create().texOffs(418, 42)
				.addBox(-9.1875F, -8.5F, -21.6875F, 1.3125F, 1.625F, 2.375F, new CubeDeformation(0.0F))
				.texOffs(522, 144).addBox(-7.6875F, -8.5F, -21.9375F, 1.75F, 1.625F, 2.625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2651F, 11.259F, 6.875F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone8_r4 = bone8.addOrReplaceChild("bone8_r4",
				CubeListBuilder.create().texOffs(537, 144).addBox(-7.3125F, -8.5F, -21.3125F, 1.75F, 1.625F, 2.625F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2651F, 11.259F, 6.875F, 0.0F, 0.0873F, 0.0F));

		PartDefinition bone8_r5 = bone8.addOrReplaceChild("bone8_r5",
				CubeListBuilder.create().texOffs(426, 229).addBox(-9.375F, -8.75F, -18.125F, 6.25F, 1.875F, 14.375F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2651F, 7.1286F, 8.3392F, 0.2182F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.75F, -28.5F, 5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition bone5 = left_leg.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(0, 68).addBox(-5.7985F, -0.5209F, -5.7472F, 12.5F, 30.0F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7015F, 0.5209F, -1.1278F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bone5_r1 = bone5.addOrReplaceChild("bone5_r1", CubeListBuilder.create().texOffs(995, 0)
				.addBox(-3.75F, -8.125F, -20.6875F, 4.125F, 8.75F, 10.0F, new CubeDeformation(0.0F)).texOffs(283, 142)
				.addBox(5.875F, -9.375F, -27.8125F, 4.125F, 8.75F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 32.5F, 7.5F, -1.0036F, 0.3491F, 0.0F));

		PartDefinition bone5_r2 = bone5.addOrReplaceChild("bone5_r2",
				CubeListBuilder.create().texOffs(143, 157).addBox(-13.75F, -28.125F, 4.375F, 10.0F, 8.75F, 17.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.9099F, 36.6974F, -3.8722F, 0.0F, -0.6981F, 1.0036F));

		PartDefinition bone5_r3 = bone5.addOrReplaceChild("bone5_r3",
				CubeListBuilder.create().texOffs(238, 25).addBox(9.375F, -17.5F, 14.375F, 10.0F, 8.75F, 7.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3128F, 36.6974F, -3.8722F, 0.0F, 0.6981F, -1.0036F));

		PartDefinition bone5_r4 = bone5.addOrReplaceChild("bone5_r4",
				CubeListBuilder.create().texOffs(311, 142).addBox(12.5F, -13.125F, 5.875F, 10.0F, 8.75F, 4.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2042F, 38.4375F, -3.0737F, 0.0F, 0.3491F, -1.0036F));

		PartDefinition bone5_r5 = bone5.addOrReplaceChild("bone5_r5",
				CubeListBuilder.create().texOffs(155, 241).addBox(12.5F, -13.125F, 2.5F, 10.0F, 8.75F, 7.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3128F, 36.6974F, -3.8722F, 0.0F, 0.0F, -1.0036F));

		PartDefinition bone5_r6 = bone5.addOrReplaceChild("bone5_r6",
				CubeListBuilder.create().texOffs(995, 0).addBox(-22.5F, -13.125F, -10.0F, 10.0F, 8.75F, 4.125F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0513F, 32.5F, 3.4543F, 0.0F, 0.3491F, 1.0036F));

		PartDefinition bone5_r7 = bone5.addOrReplaceChild("bone5_r7",
				CubeListBuilder.create().texOffs(989, 0).addBox(-22.5F, -13.125F, -10.0F, 10.0F, 8.75F, 7.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1599F, 30.7598F, 4.2528F, 0.0F, 0.0F, 1.0036F));

		PartDefinition bone5_r8 = bone5.addOrReplaceChild("bone5_r8", CubeListBuilder.create().texOffs(195, 85)
				.addBox(-10.0F, -15.0F, 1.25F, 5.3125F, 7.5F, 3.125F, new CubeDeformation(0.0F)).texOffs(97, 333)
				.addBox(-9.3125F, -15.0F, 1.25F, 4.625F, 7.5F, 4.375F, new CubeDeformation(0.0F)).texOffs(135, 325)
				.addBox(-9.0F, -15.0F, 1.25F, 4.3125F, 7.5F, 6.0625F, new CubeDeformation(0.0F)).texOffs(275, 47)
				.addBox(-8.5625F, -15.0F, 1.25F, 3.875F, 7.5F, 10.625F, new CubeDeformation(0.0F)).texOffs(0, 188)
				.addBox(-7.5F, -15.0F, 1.25F, 2.8125F, 7.5F, 16.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0747F, 21.0138F, 8.5797F, 1.6892F, 0.816F, -0.079F));

		PartDefinition bone5_r9 = bone5.addOrReplaceChild("bone5_r9",
				CubeListBuilder.create().texOffs(294, 176).addBox(-10.0F, -15.0F, 1.25F, 5.3125F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7011F, 33.5404F, 3.5484F, 0.9475F, 0.816F, -0.079F));

		PartDefinition bone5_r10 = bone5.addOrReplaceChild("bone5_r10",
				CubeListBuilder.create().texOffs(294, 281).addBox(4.6875F, -15.0F, 1.25F, 5.3125F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.7981F, 33.5404F, 3.5484F, 0.9475F, -0.816F, 0.079F));

		PartDefinition bone5_r11 = bone5.addOrReplaceChild("bone5_r11", CubeListBuilder.create().texOffs(335, 23)
				.addBox(4.6875F, -15.0F, 1.25F, 4.625F, 7.5F, 4.375F, new CubeDeformation(0.0F)).texOffs(138, 204)
				.addBox(4.6875F, -15.0F, 1.25F, 5.3125F, 7.5F, 3.125F, new CubeDeformation(0.0F)).texOffs(253, 325)
				.addBox(4.6875F, -15.0F, 1.25F, 4.3125F, 7.5F, 6.0625F, new CubeDeformation(0.0F)).texOffs(275, 189)
				.addBox(4.6875F, -15.0F, 1.25F, 3.875F, 7.5F, 10.625F, new CubeDeformation(0.0F)).texOffs(985, 0)
				.addBox(4.6875F, -15.0F, 1.25F, 2.8125F, 7.5F, 16.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.1717F, 21.0138F, 8.5797F, 1.6892F, -0.816F, 0.079F));

		PartDefinition bone5_r12 = bone5.addOrReplaceChild("bone5_r12", CubeListBuilder.create().texOffs(18, 255)
				.addBox(-10.0F, -15.0F, -4.375F, 5.3125F, 7.5F, 3.125F, new CubeDeformation(0.0F)).texOffs(337, 164)
				.addBox(-9.3125F, -15.0F, -5.625F, 4.625F, 7.5F, 4.375F, new CubeDeformation(0.0F)).texOffs(115, 327)
				.addBox(-9.0F, -15.0F, -7.3125F, 4.3125F, 7.5F, 6.0625F, new CubeDeformation(0.0F)).texOffs(76, 276)
				.addBox(-8.5625F, -15.0F, -11.875F, 3.875F, 7.5F, 10.625F, new CubeDeformation(0.0F)).texOffs(22, 196)
				.addBox(-7.5F, -15.0F, -17.5F, 2.8125F, 7.5F, 16.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0747F, 21.0138F, -7.5741F, -1.6892F, -0.816F, -0.079F));

		PartDefinition bone5_r13 = bone5.addOrReplaceChild("bone5_r13",
				CubeListBuilder.create().texOffs(121, 298).addBox(-10.0F, -15.0F, -10.0F, 5.3125F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7011F, 33.5404F, -2.5429F, -0.9475F, -0.816F, -0.079F));

		PartDefinition bone5_r14 = bone5.addOrReplaceChild("bone5_r14", CubeListBuilder.create().texOffs(343, 144)
				.addBox(4.6875F, -15.0F, -4.375F, 5.3125F, 7.5F, 3.125F, new CubeDeformation(0.0F)).texOffs(283, 327)
				.addBox(4.6875F, -15.0F, -7.3125F, 4.3125F, 7.5F, 6.0625F, new CubeDeformation(0.0F)).texOffs(179, 337)
				.addBox(4.6875F, -15.0F, -5.625F, 4.625F, 7.5F, 4.375F, new CubeDeformation(0.0F)).texOffs(125, 277)
				.addBox(4.6875F, -15.0F, -11.875F, 3.875F, 7.5F, 10.625F, new CubeDeformation(0.0F)).texOffs(985, 0)
				.addBox(4.6875F, -15.0F, -17.5F, 2.8125F, 7.5F, 16.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.1717F, 21.0138F, -7.5741F, -1.6892F, 0.816F, 0.079F));

		PartDefinition bone5_r15 = bone5.addOrReplaceChild("bone5_r15",
				CubeListBuilder.create().texOffs(288, 298).addBox(4.6875F, -15.0F, -10.0F, 5.3125F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.7981F, 33.5404F, -2.5429F, -0.9475F, 0.816F, 0.079F));

		PartDefinition bone5_r16 = bone5.addOrReplaceChild("bone5_r16",
				CubeListBuilder.create().texOffs(91, 98).addBox(-2.5F, -31.25F, -2.5F, 12.5F, 23.75F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2985F, 30.7598F, 2.1141F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone5_r17 = bone5.addOrReplaceChild("bone5_r17",
				CubeListBuilder.create().texOffs(198, 213).addBox(-2.5F, -15.0F, 1.25F, 12.5F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2985F, 33.87F, 13.231F, 1.1345F, 0.0F, 0.0F));

		PartDefinition bone5_r18 = bone5.addOrReplaceChild("bone5_r18",
				CubeListBuilder.create().texOffs(0, 126).addBox(-2.5F, -30.0F, -10.0F, 12.5F, 22.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2985F, 30.7598F, -1.1086F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone5_r19 = bone5.addOrReplaceChild("bone5_r19",
				CubeListBuilder.create().texOffs(215, 56).addBox(-2.5F, -15.0F, -10.0F, 12.5F, 7.5F, 8.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2985F, 33.87F, -12.2254F, -1.1345F, 0.0F, 0.0F));

		PartDefinition bone5_r20 = bone5.addOrReplaceChild("bone5_r20",
				CubeListBuilder.create().texOffs(182, 65).addBox(-10.0F, -15.0F, -10.0F, 8.75F, 7.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.2767F, 33.87F, 4.2528F, 0.0F, 0.0F, 1.1345F));

		PartDefinition bone5_r21 = bone5.addOrReplaceChild("bone5_r21",
				CubeListBuilder.create().texOffs(974, 0).addBox(-10.0F, -30.0F, -10.0F, 12.5F, 22.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1599F, 30.7598F, 4.2528F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone5_r22 = bone5.addOrReplaceChild("bone5_r22",
				CubeListBuilder.create().texOffs(85, 183).addBox(1.25F, -15.0F, -10.0F, 8.75F, 7.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.1797F, 33.87F, 4.2528F, 0.0F, 0.0F, -1.1345F));

		PartDefinition bone5_r23 = bone5.addOrReplaceChild("bone5_r23",
				CubeListBuilder.create().texOffs(52, 126).addBox(-2.5F, -30.0F, -10.0F, 12.5F, 22.5F, 12.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0628F, 30.7598F, 4.2528F, 0.0F, 0.0F, -0.1745F));

		PartDefinition bone10 = left_leg.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(485, 285)
				.addBox(-3.9405F, -0.6728F, -3.75F, 7.5F, 12.5F, 7.5F, new CubeDeformation(0.0F)).texOffs(451, 33)
				.addBox(-3.3155F, -0.6728F, -3.75F, 6.25F, 23.125F, 6.25F, new CubeDeformation(0.0F)).texOffs(104, 88)
				.addBox(-4.5655F, 16.4522F, -5.0F, 8.75F, 1.375F, 8.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.25F, 29.375F, -1.25F, 0.2618F, 0.0F, -0.1745F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(670, 128)
				.addBox(-3.1401F, 2.509F, -11.25F, 6.25F, 1.875F, 14.375F, new CubeDeformation(0.0F)).texOffs(515, 194)
				.addBox(-3.1401F, 1.134F, -3.125F, 6.25F, 3.25F, 6.25F, new CubeDeformation(0.0F)).texOffs(555, 92)
				.addBox(-3.1401F, 2.759F, -13.75F, 1.875F, 1.625F, 2.625F, new CubeDeformation(0.0F)).texOffs(451, 165)
				.addBox(-1.0151F, 2.759F, -13.75F, 1.75F, 1.625F, 2.625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1905F, 19.3272F, -0.625F, -0.088F, -0.1304F, 0.186F));

		PartDefinition bone11_r1 = bone11.addOrReplaceChild("bone11_r1", CubeListBuilder.create().texOffs(606, 33)
				.addBox(6.1875F, -8.75F, -11.5F, 3.1875F, 3.1875F, 7.4375F, new CubeDeformation(0.0F)).texOffs(702, 142)
				.addBox(6.1875F, -8.75F, -17.75F, 3.1875F, 1.875F, 13.8125F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1733F, 7.2097F, 6.1952F, 0.2182F, -0.2182F, 0.0F));

		PartDefinition bone11_r2 = bone11.addOrReplaceChild("bone11_r2",
				CubeListBuilder.create().texOffs(693, 165).addBox(6.1875F, -8.75F, -17.75F, 3.1875F, 1.875F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.8545F, 11.259F, 4.757F, 0.0F, -0.2182F, 0.0F));

		PartDefinition bone11_r3 = bone11.addOrReplaceChild("bone11_r3", CubeListBuilder.create().texOffs(451, 33)
				.addBox(7.875F, -8.5F, -21.6875F, 1.3125F, 1.625F, 2.375F, new CubeDeformation(0.0F)).texOffs(505, 164)
				.addBox(5.9375F, -8.5F, -21.9375F, 1.75F, 1.625F, 2.625F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2651F, 11.259F, 6.875F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bone11_r4 = bone11.addOrReplaceChild("bone11_r4",
				CubeListBuilder.create().texOffs(582, 121).addBox(5.5625F, -8.5F, -21.3125F, 1.75F, 1.625F, 2.625F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2651F, 11.259F, 6.875F, 0.0F, -0.0873F, 0.0F));

		PartDefinition bone11_r5 = bone11.addOrReplaceChild("bone11_r5",
				CubeListBuilder.create().texOffs(660, 206).addBox(3.125F, -8.75F, -18.125F, 6.25F, 1.875F, 14.375F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2651F, 7.1286F, 8.3392F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wheel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}