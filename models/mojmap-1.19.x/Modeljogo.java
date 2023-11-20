// Made with Blockbench 4.8.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljogo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jogo"), "main");
	private final ModelPart legleft;
	private final ModelPart legright;
	private final ModelPart head;
	private final ModelPart armr;
	private final ModelPart arml;
	private final ModelPart body;

	public Modeljogo(ModelPart root) {
		this.legleft = root.getChild("legleft");
		this.legright = root.getChild("legright");
		this.head = root.getChild("head");
		this.armr = root.getChild("armr");
		this.arml = root.getChild("arml");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition legleft = partdefinition.addOrReplaceChild("legleft",
				CubeListBuilder.create().texOffs(30, 85)
						.addBox(0.0F, 10.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 17)
						.addBox(0.0F, 6.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(67, 30)
						.addBox(-1.0F, 3.0F, -3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 13.0F, 1.0F));

		PartDefinition cube_r1 = legleft.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(110, 107).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0103F, 2.537F, -0.6743F, -0.4735F, -0.0669F, -0.2512F));

		PartDefinition cube_r2 = legleft.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(65, 67).addBox(-2.0F, -3.5F, 1.0F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1113F, 4.2367F, -4.4675F, -0.3487F, -0.0076F, -0.0869F));

		PartDefinition cube_r3 = legleft.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(77, 10).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 10.2418F, -3.3355F, 0.4363F, 0.0F, 0.0F));

		PartDefinition legright = partdefinition.addOrReplaceChild("legright",
				CubeListBuilder.create().texOffs(40, 92)
						.addBox(-2.0F, 10.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 77)
						.addBox(-2.0F, 6.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 6)
						.addBox(-3.0F, 3.0F, -3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 13.0F, 1.0F));

		PartDefinition cube_r4 = legright.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(12, 34).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0103F, 2.537F, -0.6743F, -0.4735F, 0.0669F, 0.2512F));

		PartDefinition cube_r5 = legright.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(9, 61).addBox(-2.0F, -3.5F, 1.0F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1113F, 4.2367F, -4.4675F, -0.3487F, 0.0076F, 0.0869F));

		PartDefinition cube_r6 = legright.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(76, 6).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 10.2418F, -3.3355F, 0.4363F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(59, 89)
						.addBox(-1.7F, 0.6F, -3.0F, 3.4F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 89)
						.addBox(-1.7F, 1.2F, -3.0F, 3.4F, 0.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(22, 46)
						.addBox(-0.45F, -0.6F, -0.1F, 0.6F, 1.3F, 0.6F, new CubeDeformation(0.0F)).texOffs(42, 46)
						.addBox(-4.45F, -0.5F, -0.1F, 0.6F, 1.2F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.15F, 0.9052F, -3.07F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(85, 66)
						.addBox(-1.7F, -1.5F, -1.7F, 3.4F, 0.4F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 13)
						.addBox(-1.8F, 0.1F, -2.2F, 3.6F, 1.0F, 3.4F, new CubeDeformation(0.0F)).texOffs(64, 37)
						.addBox(2.8F, -0.6F, -1.8F, 0.8F, 1.0F, 6.5F, new CubeDeformation(0.0F)).texOffs(65, 19)
						.addBox(-3.6F, -0.6F, -1.8F, 0.8F, 1.0F, 6.5F, new CubeDeformation(0.0F)).texOffs(91, 80)
						.addBox(-2.8F, -0.2F, -1.8F, 5.6F, 1.0F, 4.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.2457F, -1.267F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(28, 43).addBox(-0.5F, -1.0F, -3.2896F, 1.0F, 2.0F, 6.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6224F, -3.5366F, -0.0794F, 0.1666F, 0.0522F, -0.3011F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -1.0F, -3.2896F, 1.0F, 2.0F, 6.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6224F, -3.5366F, -0.0794F, 0.1666F, -0.0522F, 0.3011F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(32, 20)
						.addBox(1.0F, -0.5F, -1.2F, 1.6F, 1.0F, 2.4F, new CubeDeformation(0.0F)).texOffs(39, 52)
						.addBox(-2.6F, -0.5F, -1.2F, 1.6F, 1.0F, 2.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.2074F, -0.374F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(30, 67)
						.addBox(1.2F, -15.5F, -5.1F, 1.2F, 1.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(27, 56)
						.addBox(1.6F, -15.0F, 0.0F, 0.6F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(64, 42)
						.addBox(1.7F, -15.5F, 0.1F, 0.6F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(7, 70)
						.addBox(-0.2F, -15.5F, 0.1F, 0.6F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(62, 51)
						.addBox(-0.1F, -15.0F, 0.0F, 0.6F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(23, 56)
						.addBox(-2.0F, -15.0F, 0.0F, 0.6F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(68, 48)
						.addBox(-1.8F, -15.5F, 0.1F, 0.6F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(52, 64)
						.addBox(1.7F, -15.5F, -5.6F, 0.6F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(44, 58)
						.addBox(1.6F, -15.0F, -5.7F, 0.6F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(64, 30)
						.addBox(-0.1F, -15.0F, -5.7F, 0.6F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(6, 42)
						.addBox(-2.3F, -15.8F, -0.5F, 0.6F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(18, 101)
						.addBox(-1.7F, -15.9F, -1.4F, 0.6F, 0.4F, 1.4F, new CubeDeformation(0.0F)).texOffs(16, 101)
						.addBox(-1.1F, -15.9F, -1.4F, 0.6F, 0.4F, 1.4F, new CubeDeformation(0.0F)).texOffs(49, 101)
						.addBox(-0.5F, -15.7F, -1.4F, 0.6F, 0.2F, 1.4F, new CubeDeformation(0.0F)).texOffs(31, 5)
						.addBox(0.1F, -15.8F, -1.4F, 0.6F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(31, 21)
						.addBox(0.7F, -15.7F, -1.4F, 0.6F, 0.2F, 1.4F, new CubeDeformation(0.0F)).texOffs(41, 10)
						.addBox(1.3F, -15.9F, -0.5F, 0.6F, 0.4F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.9F, -15.8F, -0.5F, 0.4F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.9F, -15.8F, -5.0F, 0.4F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(1.3F, -15.9F, -5.0F, 0.6F, 0.4F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(0.7F, -15.7F, -5.0F, 0.6F, 0.2F, 1.4F, new CubeDeformation(0.0F)).texOffs(31, 20)
						.addBox(0.1F, -15.8F, -5.0F, 0.6F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(6, 34)
						.addBox(-0.5F, -15.7F, -5.0F, 0.6F, 0.2F, 1.4F, new CubeDeformation(0.0F)).texOffs(18, 118)
						.addBox(-1.1F, -15.9F, -5.0F, 0.6F, 0.4F, 1.4F, new CubeDeformation(0.0F)).texOffs(16, 118)
						.addBox(-1.7F, -15.9F, -5.0F, 0.6F, 0.4F, 1.4F, new CubeDeformation(0.0F)).texOffs(14, 42)
						.addBox(-2.3F, -15.8F, -5.0F, 0.6F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(11, 70)
						.addBox(-0.2F, -15.5F, -5.6F, 0.6F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(58, 51)
						.addBox(-2.0F, -15.0F, -5.7F, 0.6F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(46, 69)
						.addBox(-1.8F, -15.5F, -5.6F, 0.6F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(67, 46)
						.addBox(-2.4F, -15.5F, -5.1F, 1.2F, 1.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(32, 110)
						.addBox(-1.2F, -14.7F, -3.5F, 2.4F, 1.2F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-2.8F, -14.5F, -5.8F, 5.6F, 2.0F, 6.6F, new CubeDeformation(0.0F)).texOffs(12, 34)
						.addBox(3.7F, -11.6F, -3.6F, 0.3F, 1.6F, 1.6F, new CubeDeformation(0.0F)).texOffs(33, 43)
						.addBox(3.4F, -11.8F, -3.8F, 0.3F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(4.0F, -11.3F, -3.3F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 34)
						.addBox(-4.5F, -11.3F, -3.3F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 34)
						.addBox(-4.0F, -11.6F, -3.6F, 0.3F, 1.6F, 1.6F, new CubeDeformation(0.0F)).texOffs(32, 43)
						.addBox(-3.7F, -11.8F, -3.8F, 0.3F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 98)
						.addBox(-3.4F, -12.5F, -5.8F, 6.8F, 4.0F, 5.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.1306F, 4.6927F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(26, 47)
						.addBox(2.05F, -0.5F, 0.075F, 0.6F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(46, 42)
						.addBox(0.45F, -0.5F, 0.075F, 0.6F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(46, 10)
						.addBox(-1.25F, -0.5F, 0.075F, 0.6F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(21, 42)
						.addBox(-1.15F, 0.0F, -0.025F, 0.6F, 0.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(19, 42)
						.addBox(0.35F, 0.0F, -0.025F, 0.6F, 0.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(43, 30)
						.addBox(2.15F, 0.0F, -0.025F, 0.6F, 0.5F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.65F, -5.3681F, 0.5369F, 1.5708F, 1.3963F, 1.5708F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(46, 47)
						.addBox(-2.65F, -0.5F, 0.075F, 0.6F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(44, 10)
						.addBox(-2.75F, 0.0F, -0.025F, 0.6F, 0.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(42, 42)
						.addBox(-0.95F, 0.0F, -0.025F, 0.6F, 0.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(45, 46)
						.addBox(-1.05F, -0.5F, 0.075F, 0.6F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(20, 43)
						.addBox(0.55F, 0.0F, -0.025F, 0.6F, 0.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(25, 46)
						.addBox(0.65F, -0.5F, 0.075F, 0.6F, 0.5F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.65F, -5.3681F, 0.5369F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.15F, -0.15F, 1.85F, 0.4F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-4.25F, -0.15F, -2.25F, 0.5F, 0.3F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-3.75F, -0.25F, -2.25F, 0.6F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 5)
						.addBox(-3.15F, -0.25F, -2.25F, 0.6F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 22)
						.addBox(-2.55F, -0.05F, -2.25F, 0.6F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 1)
						.addBox(-1.95F, -0.15F, -2.25F, 0.6F, 0.3F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 40)
						.addBox(-1.35F, -0.05F, -2.25F, 0.6F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.75F, -0.25F, -2.25F, 0.5F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.75F, -0.25F, 1.35F, 0.5F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-1.35F, -0.05F, 1.35F, 0.6F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(87, 17)
						.addBox(-1.95F, -0.15F, 1.35F, 0.6F, 0.3F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-2.55F, -0.05F, 1.35F, 0.6F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 36)
						.addBox(-3.15F, -0.25F, 1.35F, 0.6F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-3.75F, -0.25F, 1.35F, 0.6F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 41)
						.addBox(-4.25F, -0.15F, 1.35F, 0.5F, 0.3F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.05F, -6.2383F, 1.7289F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(31, 46).addBox(-0.1F, -0.15F, -0.25F, 0.4F, 0.3F, 0.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9166F, -1.6431F, -3.112F, 0.1129F, 0.1334F, -0.8651F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(31, 46).addBox(-0.3F, -0.15F, -0.25F, 0.5F, 0.3F, 0.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.098F, -1.5644F, -3.0981F, 0.1687F, 0.045F, -0.258F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(31, 46).addBox(-0.2F, -0.15F, -0.25F, 0.5F, 0.3F, 0.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8684F, -1.5644F, -3.0981F, 0.1687F, -0.045F, 0.258F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(31, 46).addBox(-0.3F, -0.15F, -0.25F, 0.4F, 0.3F, 0.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.687F, -1.6431F, -3.112F, 0.1129F, -0.1334F, 0.8651F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(31, 46).addBox(-0.5F, -0.15F, -0.25F, 1.0F, 0.3F, 0.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0897F, -2.0163F, -3.1778F, 0.1615F, -0.0665F, 0.3873F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(31, 46).addBox(-0.5F, -0.15F, -0.25F, 1.0F, 0.3F, 0.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3193F, -2.0163F, -3.1778F, 0.1615F, 0.0665F, -0.3873F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(31, 46).addBox(-0.35F, -0.15F, -0.25F, 1.2F, 0.3F, 0.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.239F, -1.1435F, -3.0239F, 0.1585F, 0.0735F, -0.4305F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(31, 46).addBox(-0.85F, -0.15F, -0.25F, 1.2F, 0.3F, 0.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4686F, -1.1435F, -3.0239F, 0.1585F, -0.0735F, 0.4305F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(31, 46)
						.addBox(-1.1F, -11.3F, -6.1F, 2.2F, 0.3F, 0.3F, new CubeDeformation(0.0F)).texOffs(108, 55)
						.addBox(1.4F, -12.0F, -5.9867F, 0.4F, 0.6F, 0.15F, new CubeDeformation(0.0F)).texOffs(108, 55)
						.addBox(-1.8F, -12.0F, -5.9867F, 0.4F, 0.6F, 0.15F, new CubeDeformation(0.0F)).texOffs(44, 31)
						.addBox(0.8F, -12.2F, -5.9867F, 0.6F, 0.9F, 0.15F, new CubeDeformation(0.0F)).texOffs(44, 42)
						.addBox(-1.4F, -12.2F, -5.9867F, 0.6F, 0.9F, 0.15F, new CubeDeformation(0.0F)).texOffs(38, 10)
						.addBox(-0.8F, -12.2F, -5.9867F, 1.6F, 0.9F, 0.15F, new CubeDeformation(0.0F)).texOffs(31, 46)
						.addBox(-0.8F, -12.5F, -6.1F, 1.6F, 0.3F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1148F, 8.953F, 4.6967F, 0.1745F, 0.0F, 0.0F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create(),
				PartPose.offset(-9.0F, 3.0F, -1.0F));

		PartDefinition armr_r1 = armr.addOrReplaceChild("armr_r1",
				CubeListBuilder.create().texOffs(33, 43).addBox(-0.5233F, -0.0393F, -0.6334F, 1.0F, 1.4F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.365F, 11.2632F, -0.2431F, 0.3144F, -0.0046F, -0.5571F));

		PartDefinition armr_r2 = armr.addOrReplaceChild("armr_r2",
				CubeListBuilder.create().texOffs(33, 43).addBox(-0.524F, -1.0815F, -0.5482F, 1.0F, 1.4F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.365F, 11.2632F, -0.2431F, -0.1687F, -0.045F, -0.4325F));

		PartDefinition armr_r3 = armr.addOrReplaceChild("armr_r3",
				CubeListBuilder.create().texOffs(9, 61).addBox(-0.6475F, -1.1311F, -0.5013F, 1.0F, 1.6F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5565F, 10.3131F, 4.0687F, 0.6293F, 0.4449F, 0.6738F));

		PartDefinition armr_r4 = armr.addOrReplaceChild("armr_r4",
				CubeListBuilder.create().texOffs(34, 43).addBox(-0.7256F, -0.3663F, -0.4987F, 1.0F, 1.5F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5362F, 10.5537F, 4.1273F, 0.0975F, 0.7477F, -0.2203F));

		PartDefinition armr_r5 = armr.addOrReplaceChild("armr_r5",
				CubeListBuilder.create().texOffs(0, 65).addBox(-0.775F, -0.4563F, 0.1986F, 1.0F, 1.6F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3099F, 11.1566F, 2.2745F, 0.1507F, 0.0986F, -0.4862F));

		PartDefinition armr_r6 = armr.addOrReplaceChild("armr_r6", CubeListBuilder.create().texOffs(52, 46)
				.addBox(-0.7625F, -1.5233F, 0.1986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 44)
				.addBox(-0.8247F, -1.5362F, -1.1152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3099F, 11.1566F, 2.2745F, 0.1575F, -0.0871F, 0.5903F));

		PartDefinition armr_r7 = armr.addOrReplaceChild("armr_r7",
				CubeListBuilder.create().texOffs(68, 0).addBox(-0.9318F, -0.0067F, -1.1143F, 1.0F, 1.6F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3099F, 11.1566F, 2.2745F, 0.1798F, 0.0028F, 0.0739F));

		PartDefinition armr_r8 = armr.addOrReplaceChild("armr_r8",
				CubeListBuilder.create().texOffs(30, 67).addBox(-1.516F, -0.1791F, -2.3529F, 1.0F, 1.6F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4188F, 11.1191F, 2.2448F, 0.26F, -0.2923F, 0.0622F));

		PartDefinition armr_r9 = armr.addOrReplaceChild("armr_r9",
				CubeListBuilder.create().texOffs(22, 52).addBox(-1.5163F, -1.3645F, -2.3417F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3099F, 11.1566F, 2.2745F, 0.0745F, -0.3818F, 0.6099F));

		PartDefinition armr_r10 = armr.addOrReplaceChild("armr_r10",
				CubeListBuilder.create().texOffs(29, 42)
						.addBox(-7.5F, 9.0F, -4.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 0)
						.addBox(-7.5F, 8.0F, -3.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 53)
						.addBox(-8.5F, -1.0F, -4.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 0.0F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create(),
				PartPose.offset(9.0F, 3.0F, -1.0F));

		PartDefinition armr_r11 = arml.addOrReplaceChild("armr_r11",
				CubeListBuilder.create().texOffs(33, 43).addBox(-0.4767F, -0.0393F, -0.6334F, 1.0F, 1.4F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.365F, 11.2632F, -0.2431F, 0.3144F, 0.0046F, 0.5571F));

		PartDefinition armr_r12 = arml.addOrReplaceChild("armr_r12",
				CubeListBuilder.create().texOffs(32, 43).addBox(-0.476F, -1.0815F, -0.5482F, 1.0F, 1.4F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.365F, 11.2632F, -0.2431F, -0.1687F, 0.045F, 0.4325F));

		PartDefinition armr_r13 = arml.addOrReplaceChild("armr_r13",
				CubeListBuilder.create().texOffs(0, 61).addBox(-0.3525F, -1.1311F, -0.5013F, 1.0F, 1.6F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5565F, 10.3131F, 4.0687F, 0.6293F, -0.4449F, -0.6738F));

		PartDefinition armr_r14 = arml.addOrReplaceChild("armr_r14",
				CubeListBuilder.create().texOffs(68, 45).addBox(-0.2744F, -0.3663F, -0.4987F, 1.0F, 1.5F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5362F, 10.5537F, 4.1273F, 0.0975F, -0.7477F, 0.2203F));

		PartDefinition armr_r15 = arml.addOrReplaceChild("armr_r15",
				CubeListBuilder.create().texOffs(21, 61).addBox(-0.225F, -0.4563F, 0.1986F, 1.0F, 1.6F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3099F, 11.1566F, 2.2745F, 0.1507F, -0.0986F, 0.4862F));

		PartDefinition armr_r16 = arml.addOrReplaceChild("armr_r16", CubeListBuilder.create().texOffs(0, 52)
				.addBox(-0.2375F, -1.5233F, 0.1986F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 43)
				.addBox(-0.1753F, -1.5362F, -1.1152F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3099F, 11.1566F, 2.2745F, 0.1575F, 0.0871F, -0.5903F));

		PartDefinition armr_r17 = arml.addOrReplaceChild("armr_r17",
				CubeListBuilder.create().texOffs(65, 67).addBox(-0.0682F, -0.0067F, -1.1143F, 1.0F, 1.6F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3099F, 11.1566F, 2.2745F, 0.1798F, -0.0028F, -0.0739F));

		PartDefinition armr_r18 = arml.addOrReplaceChild("armr_r18",
				CubeListBuilder.create().texOffs(3, 63).addBox(0.516F, -0.1791F, -2.3529F, 1.0F, 1.6F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4188F, 11.1191F, 2.2448F, 0.26F, 0.2923F, -0.0622F));

		PartDefinition armr_r19 = arml.addOrReplaceChild("armr_r19",
				CubeListBuilder.create().texOffs(55, 34).addBox(0.5163F, -1.3645F, -2.3417F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3099F, 11.1566F, 2.2745F, 0.0745F, 0.3818F, -0.6099F));

		PartDefinition armr_r20 = arml.addOrReplaceChild("armr_r20",
				CubeListBuilder.create().texOffs(68, 0)
						.addBox(5.5F, 9.0F, -4.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(5.5F, 8.0F, -3.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 53)
						.addBox(4.5F, -1.0F, -4.5F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, 0.0F, 2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 7.0F, 1.0F));

		PartDefinition bodyinside = body.addOrReplaceChild("bodyinside", CubeListBuilder.create().texOffs(90, 119)
				.addBox(-6.4F, -14.0F, -0.6F, 12.8F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, -1.0F));

		PartDefinition cube_r25 = bodyinside.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.4F, -9.2F, -2.5F, 12.8F, 10.7F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-6.4F, -9.2F, -2.6F, 12.8F, 10.7F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.8694F, 1.6927F, 0.1745F, 0.0F, 0.0F));

		PartDefinition clothes = body.addOrReplaceChild("clothes", CubeListBuilder.create(),
				PartPose.offset(0.0F, 17.0F, -1.0F));

		PartDefinition cube_r26 = clothes.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(74, 57).addBox(0.3F, 0.0F, -0.9835F, 1.8F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5422F, -20.7969F, -2.9065F, 0.1705F, -0.0376F, 0.215F));

		PartDefinition cube_r27 = clothes.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(40, 75).addBox(-2.1F, 0.0F, -0.9735F, 1.8F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5422F, -20.7969F, -2.9065F, 0.1705F, 0.0376F, -0.215F));

		PartDefinition cube_r28 = clothes.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(64, 27)
						.addBox(-2.4F, -6.6F, -4.4827F, 4.8F, 0.7F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 67)
						.addBox(1.6F, -6.5F, -4.5F, 4.8F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 67)
						.addBox(-6.4F, -6.5F, -4.5F, 4.8F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 27)
						.addBox(-6.4F, -9.5F, 1.5F, 12.8F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-6.4F, -6.5F, 3.5F, 12.8F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 34)
						.addBox(5.4F, -9.5F, -4.5F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(97, 2)
						.addBox(6.4F, -6.5F, -4.5F, 1.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(86, 45)
						.addBox(-7.4F, -9.5F, -4.5F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-7.4F, -6.5F, -4.5F, 1.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.8694F, 1.6927F, 0.1745F, 0.0F, 0.0F));

		PartDefinition scarf = body.addOrReplaceChild("scarf", CubeListBuilder.create(),
				PartPose.offset(0.0F, 17.0F, -1.0F));

		PartDefinition cube_r29 = scarf.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(47, 26)
						.addBox(-6.1F, -0.1F, -1.7F, 2.0F, 3.3F, 3.8F, new CubeDeformation(0.0F)).texOffs(0, 70)
						.addBox(-6.3F, 0.5F, -3.5F, 2.2F, 2.7F, 2.8F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(-6.3F, 0.0F, -4.3F, 3.2F, 3.2F, 1.5F, new CubeDeformation(0.0F)).texOffs(74, 45)
						.addBox(0.9F, -0.6F, -6.6F, 2.0F, 3.8F, 2.3F, new CubeDeformation(0.0F)).texOffs(105, 41)
						.addBox(-1.5F, -0.6F, -5.8F, 2.4F, 3.8F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-3.9F, -0.6F, -6.2F, 2.4F, 3.8F, 1.9F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-6.3F, -0.6F, -5.8F, 2.4F, 3.8F, 1.5F, new CubeDeformation(0.0F)).texOffs(53, 116)
						.addBox(2.9F, -0.6F, -5.8F, 2.4F, 3.8F, 1.5F, new CubeDeformation(0.0F)).texOffs(22, 42)
						.addBox(2.1F, 0.0F, -4.3F, 3.2F, 3.2F, 1.5F, new CubeDeformation(0.0F)).texOffs(30, 73)
						.addBox(3.1F, 0.5F, -3.5F, 2.2F, 2.7F, 2.8F, new CubeDeformation(0.0F)).texOffs(48, 26)
						.addBox(3.1F, -0.1F, -1.7F, 2.0F, 3.3F, 3.8F, new CubeDeformation(0.0F)).texOffs(74, 75)
						.addBox(2.0F, 1.2F, 0.9F, 2.0F, 2.0F, 2.8F, new CubeDeformation(0.0F)).texOffs(73, 37)
						.addBox(0.0F, 1.4F, 0.9F, 2.0F, 1.8F, 3.2F, new CubeDeformation(0.0F)).texOffs(79, 114)
						.addBox(-2.8F, 1.1F, 0.9F, 2.8F, 2.1F, 2.9F, new CubeDeformation(0.0F)).texOffs(65, 73)
						.addBox(-5.6F, 1.5F, 0.9F, 2.8F, 1.7F, 2.6F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(-4.9F, 1.8F, -2.1F, 8.8F, 1.7F, 5.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -24.3702F, -2.0134F, 1.0472F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		legleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legright.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armr.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legleft.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arml.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}