// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcursedspiritrugbyfield<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cursedspiritrugbyfield"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart legr1;
	private final ModelPart legr2;
	private final ModelPart legl1;
	private final ModelPart legl2;
	private final ModelPart leggyr;
	private final ModelPart leggyl;

	public Modelcursedspiritrugbyfield(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.legr1 = root.getChild("legr1");
		this.legr2 = root.getChild("legr2");
		this.legl1 = root.getChild("legl1");
		this.legl2 = root.getChild("legl2");
		this.leggyr = root.getChild("leggyr");
		this.leggyl = root.getChild("leggyl");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(10, 10)
				.addBox(-5.0F, 2.0F, -8.0F, 10.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(4, 4)
				.addBox(-5.2F, 2.0F, -8.0F, 0.2F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(3, 3)
				.addBox(-5.0F, -3.0F, -11.2F, 10.0F, 5.0F, 13.2F, new CubeDeformation(0.0F)).texOffs(15, 15)
				.addBox(-5.0F, -2.0F, -11.9F, 10.0F, 4.0F, 0.7F, new CubeDeformation(0.0F)).texOffs(16, 16)
				.addBox(-4.6F, -1.6F, -12.2F, 9.2F, 3.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(2, 45)
				.addBox(-4.4F, 2.3F, -10.9F, 1.6F, 1.2F, 0.6F, new CubeDeformation(0.0F)).texOffs(7, 50)
				.addBox(-4.4F, 3.6F, -10.9F, 1.6F, 1.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(5, 46)
				.addBox(-4.5F, 2.3F, -10.2F, 0.5F, 1.2F, 1.3F, new CubeDeformation(0.0F)).texOffs(6, 49)
				.addBox(-4.5F, 3.6F, -10.2F, 0.5F, 1.1F, 1.3F, new CubeDeformation(0.0F)).texOffs(8, 48)
				.addBox(-4.5F, 2.3F, -8.8F, 0.5F, 1.2F, 1.3F, new CubeDeformation(0.0F)).texOffs(6, 49)
				.addBox(-4.5F, 3.6F, -8.8F, 0.5F, 1.1F, 1.3F, new CubeDeformation(0.0F)).texOffs(6, 49)
				.addBox(3.6F, 2.3F, -8.8F, 0.5F, 1.2F, 1.3F, new CubeDeformation(0.0F)).texOffs(6, 49)
				.addBox(3.6F, 3.6F, -8.8F, 0.5F, 1.1F, 1.3F, new CubeDeformation(0.0F)).texOffs(6, 49)
				.addBox(3.6F, 2.3F, -10.2F, 0.5F, 1.2F, 1.3F, new CubeDeformation(0.0F)).texOffs(6, 49)
				.addBox(3.6F, 3.6F, -10.2F, 0.5F, 1.1F, 1.3F, new CubeDeformation(0.0F)).texOffs(7, 50)
				.addBox(-2.7F, 2.3F, -10.9F, 1.6F, 1.2F, 0.6F, new CubeDeformation(0.0F)).texOffs(7, 50)
				.addBox(-2.7F, 3.6F, -10.9F, 1.6F, 1.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(7, 50)
				.addBox(-1.0F, 2.3F, -10.9F, 1.6F, 1.2F, 0.6F, new CubeDeformation(0.0F)).texOffs(7, 50)
				.addBox(-1.0F, 3.6F, -10.9F, 1.6F, 1.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(7, 50)
				.addBox(0.7F, 2.3F, -10.9F, 1.6F, 1.2F, 0.6F, new CubeDeformation(0.0F)).texOffs(7, 50)
				.addBox(0.7F, 3.6F, -10.9F, 1.6F, 1.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(7, 50)
				.addBox(2.4F, 2.3F, -10.9F, 1.6F, 1.2F, 0.6F, new CubeDeformation(0.0F)).texOffs(7, 50)
				.addBox(2.4F, 3.6F, -10.9F, 1.6F, 1.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(20, 45)
				.addBox(-4.6F, 4.7F, -8.9F, 0.7F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(20, 45)
				.addBox(-4.6F, 4.7F, -10.3F, 0.7F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(21, 46)
				.addBox(-4.6F, 4.7F, -11.0F, 1.9F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(21, 46)
				.addBox(-2.8F, 4.7F, -11.0F, 1.8F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(21, 46)
				.addBox(-1.1F, 4.7F, -11.0F, 1.8F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(21, 46)
				.addBox(0.6F, 4.7F, -11.0F, 1.8F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(21, 46)
				.addBox(2.3F, 4.7F, -11.0F, 1.9F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(20, 45)
				.addBox(3.5F, 4.7F, -10.3F, 0.7F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(20, 45)
				.addBox(3.5F, 4.7F, -8.9F, 0.7F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(22, 46)
				.addBox(-4.6F, 2.0F, -10.3F, 0.7F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(22, 46)
				.addBox(-4.6F, 2.0F, -8.9F, 0.7F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(23, 47)
				.addBox(-4.6F, 2.0F, -11.0F, 1.9F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(23, 47)
				.addBox(-1.1F, 2.0F, -11.0F, 1.8F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(23, 47)
				.addBox(0.6F, 2.0F, -11.0F, 1.8F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(23, 47)
				.addBox(-2.8F, 2.0F, -11.0F, 1.8F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(23, 47)
				.addBox(2.3F, 2.0F, -11.0F, 1.9F, 0.3F, 0.7F, new CubeDeformation(0.0F)).texOffs(22, 46)
				.addBox(3.5F, 2.0F, -8.9F, 0.7F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(22, 46)
				.addBox(3.5F, 2.0F, -10.3F, 0.7F, 0.3F, 1.4F, new CubeDeformation(0.0F)).texOffs(45, 46)
				.addBox(5.0F, -1.3F, -8.5F, 0.5F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
				.addBox(5.0F, -0.3F, -4.5F, 0.3F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 46).mirror()
				.addBox(-5.5F, -1.3F, -8.1F, 0.5F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 48)
				.mirror().addBox(-5.3F, -0.3F, -4.1F, 0.3F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 6).addBox(-4.0F, -5.0F, -8.0F, 8.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
				.addBox(-5.0F, 5.0F, -12.0F, 10.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(4, 4).mirror()
				.addBox(5.0F, 2.0F, -8.0F, 0.2F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.addBox(-4.0F, 7.0F, -11.5F, 8.0F, 2.0F, 16.5F, new CubeDeformation(0.0F)).texOffs(12, 12)
				.addBox(-3.0F, 7.0F, -11.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 12)
				.addBox(-3.0F, 7.0F, -7.0F, 6.0F, 2.6F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 15)
				.addBox(-4.0F, 7.0F, -12.2F, 8.0F, 1.5F, 1.2F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 10.0F, -23.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 12).addBox(-3.0F, -0.2F, -1.5F, 6.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5F, -9.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(13, 13).addBox(-4.0F, 0.0F, -1.9F, 8.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.5F, -3.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 16).mirror()
				.addBox(-1.6F, 2.5F, 0.4F, 0.4F, 2.9F, 0.2F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 16)
				.mirror().addBox(-1.7F, 1.6F, 0.3F, 0.6F, 3.0F, 0.4F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(15, 15).mirror().addBox(-1.8F, 0.8F, 0.2F, 0.8F, 2.9F, 0.6F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(15, 15).mirror()
				.addBox(-1.9F, 0.2F, 0.1F, 1.0F, 2.7F, 0.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 15)
				.mirror().addBox(-2.0F, -3.1F, 0.0F, 1.2F, 3.3F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.6F, 3.5F, -8.1F, 0.0003F, 0.0076F, -0.1742F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(1.2F, 2.5F, 0.4F, 0.4F, 2.9F, 0.2F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(1.1F, 1.6F, 0.3F, 0.6F, 3.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(15, 15)
						.addBox(1.0F, 0.8F, 0.2F, 0.8F, 2.9F, 0.6F, new CubeDeformation(0.0F)).texOffs(15, 15)
						.addBox(0.9F, 0.2F, 0.1F, 1.0F, 2.7F, 0.8F, new CubeDeformation(0.0F)).texOffs(15, 15)
						.addBox(0.8F, -3.1F, 0.0F, 1.2F, 3.3F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.6F, 3.5F, -8.1F, 0.0003F, -0.0076F, 0.1742F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-11.0F, -7.2F, -6.0F, 22.0F, 18.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(7, 43)
				.addBox(0.0F, -10.6F, -6.0F, 0.0F, 3.6F, 15.0F, new CubeDeformation(0.0F)).texOffs(14, 50)
				.addBox(0.0F, -10.4F, -14.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F)).texOffs(14, 50)
				.addBox(0.0F, -8.9F, -22.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F)).texOffs(21, 57)
				.addBox(0.0F, -8.6F, -23.0F, 0.0F, 3.6F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 57)
				.addBox(0.0F, -7.7F, -25.0F, 0.0F, 2.8F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 51)
				.addBox(0.0F, -10.0F, 9.0F, 0.0F, 3.6F, 7.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
				.addBox(0.0F, -8.6F, 16.0F, 0.0F, 3.6F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
				.addBox(11.0F, -6.2F, -6.0F, 0.6F, 15.7F, 15.0F, new CubeDeformation(0.0F)).texOffs(4, 0).mirror()
				.addBox(-11.6F, -6.2F, -6.0F, 0.6F, 15.7F, 15.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 0)
				.addBox(-11.0F, -6.8F, -14.0F, 22.0F, 17.2F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
				.addBox(-10.0F, -5.3F, -22.0F, 20.0F, 14.6F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
				.addBox(-6.0F, 9.0F, -22.0F, 12.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
				.addBox(-11.0F, -6.4F, 8.0F, 22.0F, 16.9F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
				.addBox(-9.0F, -5.0F, 16.0F, 18.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
				.addBox(-7.1F, -4.0F, 20.0F, 14.2F, 12.8F, 0.8F, new CubeDeformation(0.0F)).texOffs(4, 0)
				.addBox(9.0F, -4.3F, 13.6F, 0.7F, 13.5F, 5.3F, new CubeDeformation(0.0F)).texOffs(4, 0).mirror()
				.addBox(-9.7F, -4.3F, 13.6F, 0.7F, 13.5F, 5.3F, new CubeDeformation(0.0F)).mirror(false).texOffs(5, 0)
				.addBox(-9.0F, -5.0F, -23.0F, 18.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
				.addBox(-10.7F, 2.4F, -20.4F, 0.8F, 5.2F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 0).mirror()
				.addBox(9.9F, 2.4F, -20.4F, 0.8F, 5.2F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 0)
				.addBox(-11.8F, 2.4F, -8.3F, 0.8F, 5.2F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 0).mirror()
				.addBox(11.0F, 2.4F, -8.3F, 0.8F, 5.2F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 0)
				.addBox(-7.0F, -4.9F, -25.0F, 14.0F, 13.9F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(4, 0).addBox(-8.8F, 1.0F, -5.0F, 19.6F, 3.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.6922F, -17.4168F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(21, 57)
						.addBox(1.7F, -2.05F, -20.0F, 0.0F, 3.6F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
						.addBox(1.7F, -2.05F, 19.0F, 0.0F, 3.6F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 51)
						.addBox(1.7F, -3.45F, 12.0F, 0.0F, 3.6F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 43)
						.addBox(1.7F, -4.05F, -3.0F, 0.0F, 3.6F, 15.0F, new CubeDeformation(0.0F)).texOffs(14, 50)
						.addBox(1.7F, -3.85F, -11.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F)).texOffs(14, 50)
						.addBox(1.7F, -2.35F, -19.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 57)
						.addBox(1.7F, -1.15F, -22.0F, 0.0F, 2.8F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.55F, -3.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(21, 57).mirror()
				.addBox(-1.7F, -2.05F, -20.0F, 0.0F, 3.6F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(18, 54).mirror().addBox(-1.7F, -2.05F, 19.0F, 0.0F, 3.6F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(15, 51).mirror()
				.addBox(-1.7F, -3.45F, 12.0F, 0.0F, 3.6F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 43)
				.mirror().addBox(-1.7F, -4.05F, -3.0F, 0.0F, 3.6F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(14, 50).mirror().addBox(-1.7F, -3.85F, -11.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(14, 50).mirror()
				.addBox(-1.7F, -2.35F, -19.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(20, 57).mirror().addBox(-1.7F, -1.15F, -22.0F, 0.0F, 2.8F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(0.0F, -7.55F, -3.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 57).mirror()
				.addBox(-1.0F, -2.05F, -20.0F, 0.0F, 3.6F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(17, 54).mirror().addBox(-1.0F, -2.05F, 19.0F, 0.0F, 3.6F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(14, 51).mirror()
				.addBox(-1.0F, -3.45F, 12.0F, 0.0F, 3.6F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 43)
				.mirror().addBox(-1.0F, -4.05F, -3.0F, 0.0F, 3.6F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 50).mirror().addBox(-1.0F, -3.85F, -11.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(13, 50).mirror()
				.addBox(-1.0F, -2.35F, -19.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 57).mirror().addBox(-1.0F, -1.15F, -22.0F, 0.0F, 2.8F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(0.0F, -7.55F, -3.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(21, 57)
						.addBox(1.0F, -2.05F, -20.0F, 0.0F, 3.6F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
						.addBox(1.0F, -2.05F, 19.0F, 0.0F, 3.6F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 51)
						.addBox(1.0F, -3.45F, 12.0F, 0.0F, 3.6F, 7.0F, new CubeDeformation(0.0F)).texOffs(7, 43)
						.addBox(1.0F, -4.05F, -3.0F, 0.0F, 3.6F, 15.0F, new CubeDeformation(0.0F)).texOffs(14, 50)
						.addBox(1.0F, -3.85F, -11.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F)).texOffs(14, 50)
						.addBox(1.0F, -2.35F, -19.0F, 0.0F, 3.6F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 57)
						.addBox(1.0F, -1.15F, -22.0F, 0.0F, 2.8F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.55F, -3.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(5, 0)
						.addBox(-0.4F, -0.55F, 8.55F, 0.8F, 1.1F, 0.8F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(-0.7F, -0.85F, 6.95F, 1.4F, 1.7F, 1.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.3782F, 29.0941F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(4, 0).addBox(-1.2F, -1.35F, 4.35F, 2.4F, 2.7F, 2.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.9486F, 28.7108F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(4, 0).addBox(-1.8F, -1.95F, 0.95F, 3.6F, 3.9F, 3.4F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.9277F, 28.8981F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(4, 0).addBox(-2.1F, -2.25F, -3.25F, 4.2F, 4.5F, 4.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.7408F, 29.1828F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(4, 0).addBox(-3.6F, -3.15F, -3.6F, 7.2F, 5.9F, 4.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.1963F, 26.3782F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(4, 0).addBox(-7.0F, -9.3F, 9.7F, 8.0F, 7.7F, 5.4F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 2.0662F, 8.3245F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(4, 0).addBox(-8.0F, -12.5F, -9.0F, 10.0F, 9.0F, 6.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 9.9292F, 16.2095F, -0.8727F, 0.0F, 0.0F));

		PartDefinition legr1 = partdefinition.addOrReplaceChild("legr1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.9F, 0.0F, -1.8F, 3.2F, 3.2F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.1F, -0.1F, -1.6F, 3.4F, 0.2F, 3.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.9F, 3.2F, -1.8F, 3.2F, 3.2F, 3.6F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.7F, 6.4F, 0.0F, 2.8F, 3.3F, 1.8F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 9.7F, -1.5F, 3.4F, 1.4F, 3.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.2F, 0.1F, -1.6F, 0.3F, 2.3F, 3.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 3.7F, -1.6F, 0.1F, 0.9F, 3.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.1F, 2.4F, -1.6F, 0.2F, 1.3F, 3.2F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-2.0F, 0.6F, -2.2F, 3.2F, 2.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-2.0F, 0.6F, 1.8F, 3.2F, 2.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-2.5F, 0.6F, 1.8F, 0.5F, 2.0F, 0.3F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-2.5F, 0.6F, -2.1F, 0.5F, 2.0F, 0.3F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-3.0F, 0.6F, 1.8F, 0.5F, 2.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-3.0F, 0.6F, -2.0F, 0.5F, 2.0F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, 13.0F, -18.4F));

		PartDefinition cube_r17 = legr1.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(1, 1).addBox(-1.1F, -1.6F, -0.8F, 2.6F, 3.7F, 1.7F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 7.7673F, -0.575F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r18 = legr1.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.65F, -1.5F, -0.75F, 1.3F, 1.4F, 1.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.45F, 11.0F, -2.05F, -0.2094F, -0.2618F, 0.0F));

		PartDefinition cube_r19 = legr1.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.55F, -1.4F, -2.55F, 1.1F, 1.2F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.45F, 10.6795F, -1.5422F, 0.2182F, -0.2618F, 0.0F));

		PartDefinition cube_r20 = legr1.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.45F, -1.4F, -2.55F, 1.1F, 1.2F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.15F, 10.6795F, -1.5422F, 0.2182F, 0.2618F, 0.0F));

		PartDefinition cube_r21 = legr1.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.35F, -1.5F, -0.75F, 1.3F, 1.4F, 1.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.15F, 11.0F, -2.05F, -0.2094F, 0.2618F, 0.0F));

		PartDefinition cube_r22 = legr1.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.7F, -0.1F, -1.5F, 3.7F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4F, -0.2F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition legr2 = partdefinition.addOrReplaceChild("legr2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-3.9F, 0.0F, -1.8F, 3.2F, 3.2F, 3.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.1F, -0.1F, -1.6F, 3.4F, 0.2F, 3.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.9F, 3.2F, -1.8F, 3.2F, 3.2F, 3.6F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.7F, 6.4F, 0.0F, 2.8F, 3.3F, 1.8F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 9.7F, -1.5F, 3.4F, 1.4F, 3.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.2F, 0.1F, -1.6F, 0.3F, 2.3F, 3.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 3.7F, -1.6F, 0.1F, 0.9F, 3.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.1F, 2.4F, -1.6F, 0.2F, 1.3F, 3.2F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-2.0F, 0.6F, -2.2F, 3.2F, 2.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-2.0F, 0.6F, 1.8F, 3.2F, 2.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-2.5F, 0.6F, 1.8F, 0.5F, 2.0F, 0.3F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-2.5F, 0.6F, -2.1F, 0.5F, 2.0F, 0.3F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-3.0F, 0.6F, 1.8F, 0.5F, 2.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-3.0F, 0.6F, -2.0F, 0.5F, 2.0F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 13.0F, -6.3F));

		PartDefinition cube_r23 = legr2.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(1, 1).addBox(-1.1F, -1.6F, -0.8F, 2.6F, 3.7F, 1.7F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 7.7673F, -0.575F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r24 = legr2.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.65F, -1.5F, -0.75F, 1.3F, 1.4F, 1.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.45F, 11.0F, -2.05F, -0.2094F, -0.2618F, 0.0F));

		PartDefinition cube_r25 = legr2.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.55F, -1.4F, -2.55F, 1.1F, 1.2F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.45F, 10.6795F, -1.5422F, 0.2182F, -0.2618F, 0.0F));

		PartDefinition cube_r26 = legr2.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.45F, -1.4F, -2.55F, 1.1F, 1.2F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.15F, 10.6795F, -1.5422F, 0.2182F, 0.2618F, 0.0F));

		PartDefinition cube_r27 = legr2.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.35F, -1.5F, -0.75F, 1.3F, 1.4F, 1.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.15F, 11.0F, -2.05F, -0.2094F, 0.2618F, 0.0F));

		PartDefinition cube_r28 = legr2.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.7F, -0.1F, -1.5F, 3.7F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4F, -0.2F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition legl1 = partdefinition.addOrReplaceChild("legl1", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.7F, 0.0F, -1.8F, 3.2F, 3.2F, 3.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.7F, -0.1F, -1.6F, 3.4F, 0.2F, 3.2F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(0.7F, 3.2F, -1.8F, 3.2F, 3.2F, 3.6F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(1, 1).mirror()
				.addBox(0.9F, 6.4F, 0.0F, 2.8F, 3.3F, 1.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.6F, 9.7F, -1.5F, 3.4F, 1.4F, 3.5F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(3.9F, 0.1F, -1.6F, 0.3F, 2.3F, 3.2F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 0).mirror()
				.addBox(3.9F, 3.7F, -1.6F, 0.1F, 0.9F, 3.2F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(3.9F, 2.4F, -1.6F, 0.2F, 1.3F, 3.2F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 3).mirror().addBox(-1.2F, 0.6F, -2.2F, 3.2F, 2.0F, 0.4F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(3, 3).mirror()
				.addBox(-1.2F, 0.6F, 1.8F, 3.2F, 2.0F, 0.4F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 3)
				.mirror().addBox(2.0F, 0.6F, 1.8F, 0.5F, 2.0F, 0.3F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 3).mirror().addBox(2.0F, 0.6F, -2.1F, 0.5F, 2.0F, 0.3F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(3, 3).mirror()
				.addBox(2.5F, 0.6F, 1.8F, 0.5F, 2.0F, 0.2F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 3)
				.mirror().addBox(2.5F, 0.6F, -2.0F, 0.5F, 2.0F, 0.2F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(10.0F, 13.0F, -18.4F));

		PartDefinition cube_r29 = legl1.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.5F, -1.6F, -0.8F, 2.6F, 3.7F, 1.7F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 7.7673F, -0.575F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r30 = legl1.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.35F, -1.5F, -0.75F, 1.3F, 1.4F, 1.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.45F, 11.0F, -2.05F, -0.2094F, 0.2618F, 0.0F));

		PartDefinition cube_r31 = legl1.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.45F, -1.4F, -2.55F, 1.1F, 1.2F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.45F, 10.6795F, -1.5422F, 0.2182F, 0.2618F, 0.0F));

		PartDefinition cube_r32 = legl1.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.55F, -1.4F, -2.55F, 1.1F, 1.2F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.15F, 10.6795F, -1.5422F, 0.2182F, -0.2618F, 0.0F));

		PartDefinition cube_r33 = legl1.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.65F, -1.5F, -0.75F, 1.3F, 1.4F, 1.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.15F, 11.0F, -2.05F, -0.2094F, -0.2618F, 0.0F));

		PartDefinition cube_r34 = legl1.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.0F, -0.1F, -1.5F, 3.7F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.4F, -0.2F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition legl2 = partdefinition.addOrReplaceChild("legl2", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.7F, 0.0F, -1.8F, 3.2F, 3.2F, 3.6F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.7F, -0.1F, -1.6F, 3.4F, 0.2F, 3.2F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(0.7F, 3.2F, -1.8F, 3.2F, 3.2F, 3.6F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(1, 1).mirror()
				.addBox(0.9F, 6.4F, 0.0F, 2.8F, 3.3F, 1.8F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.6F, 9.7F, -1.5F, 3.4F, 1.4F, 3.5F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(3.9F, 0.1F, -1.6F, 0.3F, 2.3F, 3.2F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 0).mirror()
				.addBox(3.9F, 3.7F, -1.6F, 0.1F, 0.9F, 3.2F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(3.9F, 2.4F, -1.6F, 0.2F, 1.3F, 3.2F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 3).mirror().addBox(-1.2F, 0.6F, -2.2F, 3.2F, 2.0F, 0.4F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(3, 3).mirror()
				.addBox(-1.2F, 0.6F, 1.8F, 3.2F, 2.0F, 0.4F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 3)
				.mirror().addBox(2.0F, 0.6F, 1.8F, 0.5F, 2.0F, 0.3F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 3).mirror().addBox(2.0F, 0.6F, -2.1F, 0.5F, 2.0F, 0.3F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(3, 3).mirror()
				.addBox(2.5F, 0.6F, 1.8F, 0.5F, 2.0F, 0.2F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 3)
				.mirror().addBox(2.5F, 0.6F, -2.0F, 0.5F, 2.0F, 0.2F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(11.0F, 13.0F, -6.3F));

		PartDefinition cube_r35 = legl2.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.5F, -1.6F, -0.8F, 2.6F, 3.7F, 1.7F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5F, 7.7673F, -0.575F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r36 = legl2.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.35F, -1.5F, -0.75F, 1.3F, 1.4F, 1.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.45F, 11.0F, -2.05F, -0.2094F, 0.2618F, 0.0F));

		PartDefinition cube_r37 = legl2.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.45F, -1.4F, -2.55F, 1.1F, 1.2F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.45F, 10.6795F, -1.5422F, 0.2182F, 0.2618F, 0.0F));

		PartDefinition cube_r38 = legl2.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.55F, -1.4F, -2.55F, 1.1F, 1.2F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.15F, 10.6795F, -1.5422F, 0.2182F, -0.2618F, 0.0F));

		PartDefinition cube_r39 = legl2.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(1, 1).mirror()
						.addBox(-1.65F, -1.5F, -0.75F, 1.3F, 1.4F, 1.8F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.15F, 11.0F, -2.05F, -0.2094F, -0.2618F, 0.0F));

		PartDefinition cube_r40 = legl2.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.0F, -0.1F, -1.5F, 3.7F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.4F, -0.2F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition leggyr = partdefinition.addOrReplaceChild("leggyr", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.16F, -2.06F, -2.388F, 4.864F, 4.608F, 4.608F, new CubeDeformation(0.0F)).texOffs(1, 1)
				.addBox(-4.136F, 7.028F, 0.172F, 2.432F, 3.456F, 2.56F, new CubeDeformation(0.0F)).texOffs(3, 3)
				.addBox(-4.904F, -1.932F, 2.22F, 4.48F, 4.352F, 0.384F, new CubeDeformation(0.0F)).texOffs(3, 3)
				.addBox(-4.904F, -1.932F, -2.644F, 4.48F, 4.352F, 0.384F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-5.544F, -1.932F, -2.26F, 0.384F, 4.352F, 4.352F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.904F, 10.356F, -1.492F, 3.84F, 1.792F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.6F, 12.0F, 6.7F));

		PartDefinition cube_r41 = leggyr.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.576F, -1.792F, -3.264F, 1.408F, 1.536F, 2.56F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2F, 11.6098F, -2.186F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r42 = leggyr.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.448F, -1.92F, -0.96F, 1.664F, 1.792F, 2.304F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2F, 12.02F, -2.836F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r43 = leggyr.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.576F, -1.792F, -3.264F, 1.408F, 1.536F, 2.56F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.608F, 11.6098F, -1.546F, 0.2182F, 0.2618F, 0.0F));

		PartDefinition cube_r44 = leggyr.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.448F, -1.92F, -0.96F, 1.664F, 1.792F, 2.304F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.608F, 12.02F, -2.196F, -0.2094F, 0.2618F, 0.0F));

		PartDefinition cube_r45 = leggyr.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(1, 1).mirror()
				.addBox(-2.112F, -1.92F, -0.96F, 1.664F, 1.792F, 2.304F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.36F, 12.02F, -2.196F, -0.2094F, -0.2618F, 0.0F));

		PartDefinition cube_r46 = leggyr.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(1, 1).mirror()
				.addBox(-1.984F, -1.792F, -3.264F, 1.408F, 1.536F, 2.56F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.36F, 11.6098F, -1.546F, 0.2182F, -0.2618F, 0.0F));

		PartDefinition cube_r47 = leggyr.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.048F, -0.192F, -2.304F, 4.352F, 1.024F, 4.608F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.344F, -2.252F, -0.084F, 0.0F, 0.0F, -0.3316F));

		PartDefinition cube_r48 = leggyr.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(2, 2).addBox(-1.088F, -1.088F, -0.768F, 2.176F, 3.2F, 1.536F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.92F, 8.2061F, -0.276F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r49 = leggyr.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.344F, 1.984F, -2.048F, 2.688F, 2.176F, 4.352F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.472F, -1.344F, -2.176F, 2.944F, 3.328F, 4.608F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.92F, 3.252F, -0.084F, 0.1484F, 0.0F, 0.0F));

		PartDefinition leggyl = partdefinition.addOrReplaceChild("leggyl", CubeListBuilder.create().texOffs(0, 0)
				.mirror().addBox(0.296F, -2.06F, -2.388F, 4.864F, 4.608F, 4.608F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(1, 1).mirror()
				.addBox(1.704F, 7.028F, 0.172F, 2.432F, 3.456F, 2.56F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(3, 3).mirror().addBox(0.424F, -1.932F, 2.22F, 4.48F, 4.352F, 0.384F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(3, 3).mirror()
				.addBox(0.424F, -1.932F, -2.644F, 4.48F, 4.352F, 0.384F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror()
				.addBox(5.16F, -1.932F, -2.26F, 0.384F, 4.352F, 4.352F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror()
				.addBox(1.064F, 10.356F, -1.492F, 3.84F, 1.792F, 4.48F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(10.6F, 12.0F, 6.7F));

		PartDefinition cube_r50 = leggyl.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(1, 1).mirror()
				.addBox(-1.984F, -1.792F, -3.264F, 1.408F, 1.536F, 2.56F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.2F, 11.6098F, -2.186F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r51 = leggyl.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(1, 1).mirror()
				.addBox(-2.112F, -1.92F, -0.96F, 1.664F, 1.792F, 2.304F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.2F, 12.02F, -2.836F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r52 = leggyl.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(1, 1).mirror()
				.addBox(-1.984F, -1.792F, -3.264F, 1.408F, 1.536F, 2.56F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.608F, 11.6098F, -1.546F, 0.2182F, -0.2618F, 0.0F));

		PartDefinition cube_r53 = leggyl.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(1, 1).mirror()
				.addBox(-2.112F, -1.92F, -0.96F, 1.664F, 1.792F, 2.304F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.608F, 12.02F, -2.196F, -0.2094F, -0.2618F, 0.0F));

		PartDefinition cube_r54 = leggyl.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.448F, -1.92F, -0.96F, 1.664F, 1.792F, 2.304F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.36F, 12.02F, -2.196F, -0.2094F, 0.2618F, 0.0F));

		PartDefinition cube_r55 = leggyl.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(1, 1).addBox(0.576F, -1.792F, -3.264F, 1.408F, 1.536F, 2.56F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.36F, 11.6098F, -1.546F, 0.2182F, 0.2618F, 0.0F));

		PartDefinition cube_r56 = leggyl.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-2.304F, -0.192F, -2.304F, 4.352F, 1.024F, 4.608F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.344F, -2.252F, -0.084F, 0.0F, 0.0F, 0.3316F));

		PartDefinition cube_r57 = leggyl.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(2, 2).mirror()
				.addBox(-1.088F, -1.088F, -0.768F, 2.176F, 3.2F, 1.536F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.92F, 8.2061F, -0.276F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r58 = leggyl.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-1.344F, 1.984F, -2.048F, 2.688F, 2.176F, 4.352F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror()
				.addBox(-1.472F, -1.344F, -2.176F, 2.944F, 3.328F, 4.608F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.92F, 3.252F, -0.084F, 0.1484F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leggyr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leggyl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.legl1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legl2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legr1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.legr2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}