// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelemberinsect<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "emberinsect"), "main");
	private final ModelPart bodyt;
	private final ModelPart tail;
	private final ModelPart head;
	private final ModelPart legr1;
	private final ModelPart legr2;
	private final ModelPart legl1;
	private final ModelPart legl2;
	private final ModelPart wingl;
	private final ModelPart wingr;

	public Modelemberinsect(ModelPart root) {
		this.bodyt = root.getChild("bodyt");
		this.tail = root.getChild("tail");
		this.head = root.getChild("head");
		this.legr1 = root.getChild("legr1");
		this.legr2 = root.getChild("legr2");
		this.legl1 = root.getChild("legl1");
		this.legl2 = root.getChild("legl2");
		this.wingl = root.getChild("wingl");
		this.wingr = root.getChild("wingr");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bodyt = partdefinition.addOrReplaceChild("bodyt", CubeListBuilder.create().texOffs(11, 0)
				.addBox(-2.096F, -1.184F, -2.836F, 3.168F, 3.08F, 0.352F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.184F, -1.272F, -2.484F, 3.344F, 3.256F, 1.848F, new CubeDeformation(0.0F)).texOffs(0, 12)
				.addBox(-2.096F, -1.184F, -0.636F, 3.168F, 3.08F, 0.352F, new CubeDeformation(0.0F)).texOffs(0, 6)
				.addBox(-2.184F, -1.272F, -0.284F, 3.344F, 3.256F, 1.848F, new CubeDeformation(0.0F)),
				PartPose.offset(0.528F, 19.072F, -1.056F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(7, 21)
				.addBox(-1.48F, -0.568F, -0.636F, 1.936F, 1.848F, 0.704F, new CubeDeformation(0.0F)),
				PartPose.offset(0.528F, 19.072F, 1.144F));

		PartDefinition bone = tail.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(14, 21).addBox(-1.48F,
				-0.48F, -0.724F, 1.76F, 1.672F, 0.704F, new CubeDeformation(0.0F)),
				PartPose.offset(0.088F, 0.0F, 0.792F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(21, 20).addBox(-1.392F, -0.472F, -0.7554F, 1.584F, 1.496F, 0.704F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.704F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(21, 23)
				.addBox(-1.216F, -0.2904F, -0.0758F, 1.232F, 1.144F, 0.704F, new CubeDeformation(0.0F)).texOffs(0, 23)
				.addBox(-1.304F, -0.3784F, -0.7798F, 1.408F, 1.32F, 0.704F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.088F, 0.704F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(4, 25)
				.addBox(-1.2994F, -0.4599F, -0.7505F, 1.056F, 0.968F, 0.792F, new CubeDeformation(0.0F)).texOffs(9, 25)
				.addBox(-1.2114F, -0.3719F, 0.0415F, 0.88F, 0.792F, 0.88F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.088F, 0.088F, 1.408F, 0.1752F, -0.0859F, -0.0152F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(25, 25)
				.addBox(-0.8641F, -0.0619F, -1.1014F, 0.704F, 0.616F, 0.968F, new CubeDeformation(0.0F)).texOffs(14, 25)
				.addBox(-0.7761F, 0.0261F, -0.1334F, 0.528F, 0.44F, 1.144F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.088F, -0.088F, 1.936F, -0.1309F, 0.1745F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(9, 4)
				.addBox(-1.92F, -0.788F, -2.924F, 2.816F, 1.408F, 1.848F, new CubeDeformation(0.0F)).texOffs(14, 30)
				.addBox(-2.096F, -0.348F, -2.308F, 0.176F, 0.528F, 0.792F, new CubeDeformation(0.0F)).texOffs(11, 30)
				.addBox(0.896F, -0.348F, -2.308F, 0.176F, 0.528F, 0.792F, new CubeDeformation(0.0F)).texOffs(9, 10)
				.addBox(-1.92F, 0.796F, -2.748F, 2.816F, 0.68F, 1.672F, new CubeDeformation(0.0F)).texOffs(9, 10)
				.addBox(-1.82F, 1.396F, -2.548F, 2.616F, 0.28F, 1.472F, new CubeDeformation(0.0F)).texOffs(28, 21)
				.addBox(-0.776F, 0.972F, -3.188F, 0.528F, 0.528F, 0.44F, new CubeDeformation(0.0F)).texOffs(30, 6)
				.addBox(-0.688F, 1.06F, -3.716F, 0.352F, 0.352F, 0.528F, new CubeDeformation(0.0F)).texOffs(30, 14)
				.addBox(-0.6F, 1.148F, -4.332F, 0.176F, 0.176F, 0.616F, new CubeDeformation(0.0F)).texOffs(28, 0)
				.addBox(-1.832F, -0.612F, -3.088F, 1.232F, 1.144F, 0.164F, new CubeDeformation(0.0F)).texOffs(27, 16)
				.addBox(-0.424F, -0.612F, -3.088F, 1.232F, 1.144F, 0.164F, new CubeDeformation(0.0F)),
				PartPose.offset(0.528F, 19.028F, -2.816F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(11, 8).addBox(-1.32F, 0.044F, -0.704F, 2.64F, 0.264F, 1.408F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.512F, -0.92F, -1.78F, 0.2618F, 0.0F, 0.0F));

		PartDefinition legr1 = partdefinition.addOrReplaceChild("legr1", CubeListBuilder.create().texOffs(0, 29)
				.addBox(-0.864F, -0.04F, -1.34F, 0.264F, 0.968F, 0.968F, new CubeDeformation(0.0F)).texOffs(29, 8)
				.addBox(-1.392F, 0.048F, -1.252F, 0.528F, 0.792F, 0.792F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.056F, 19.512F, -2.2F));

		PartDefinition cube_r2 = legr1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 12).addBox(-0.088F, -0.088F, -0.396F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0464F, 1.9835F, -1.3547F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition cube_r3 = legr1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(1, 0).addBox(-0.088F, -0.088F, -0.132F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0497F, 2.0216F, -1.384F, -0.2182F, 0.0F, 0.0873F));

		PartDefinition cube_r4 = legr1.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(7, 13).addBox(-0.088F, -0.088F, -0.396F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3984F, 1.8955F, -1.3547F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition cube_r5 = legr1.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(1, 1).addBox(-0.088F, -0.088F, -0.132F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4017F, 1.9336F, -1.384F, -0.2182F, 0.0F, 0.0873F));

		PartDefinition cube_r6 = legr1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(18, 26)
				.addBox(-0.352F, 0.66F, -0.484F, 0.704F, 0.264F, 0.968F, new CubeDeformation(0.0F)).texOffs(4, 28)
				.addBox(-0.264F, -0.396F, -0.396F, 0.528F, 1.056F, 0.792F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1615F, 1.2115F, -0.856F, 0.0F, 0.0F, 0.0873F));

		PartDefinition legr2 = partdefinition.addOrReplaceChild("legr2", CubeListBuilder.create().texOffs(26, 28)
				.addBox(-0.864F, -0.04F, -1.34F, 0.264F, 0.968F, 0.968F, new CubeDeformation(0.0F)).texOffs(29, 27)
				.addBox(-1.392F, 0.048F, -1.252F, 0.528F, 0.792F, 0.792F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.056F, 19.512F, -0.088F));

		PartDefinition cube_r7 = legr2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(9, 0).addBox(-0.088F, -0.088F, -0.396F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0464F, 1.9835F, -1.3547F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition cube_r8 = legr2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(9, 1).addBox(-0.088F, -0.088F, -0.132F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0497F, 2.0216F, -1.384F, -0.2182F, 0.0F, 0.0873F));

		PartDefinition cube_r9 = legr2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(10, 0).addBox(-0.088F, -0.088F, -0.396F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3984F, 1.8955F, -1.3547F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition cube_r10 = legr2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(10, 1).addBox(-0.088F, -0.088F, -0.132F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4017F, 1.9336F, -1.384F, -0.2182F, 0.0F, 0.0873F));

		PartDefinition cube_r11 = legr2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 23)
				.addBox(-0.352F, 0.66F, -0.484F, 0.704F, 0.264F, 0.968F, new CubeDeformation(0.0F)).texOffs(18, 28)
				.addBox(-0.264F, -0.396F, -0.396F, 0.528F, 1.056F, 0.792F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1615F, 1.2115F, -0.856F, 0.0F, 0.0F, 0.0873F));

		PartDefinition legl1 = partdefinition.addOrReplaceChild("legl1",
				CubeListBuilder.create().texOffs(9, 28)
						.addBox(-0.6F, -0.04F, -1.34F, 0.264F, 0.968F, 0.968F, new CubeDeformation(0.0F)).texOffs(29, 2)
						.addBox(-0.336F, 0.048F, -1.252F, 0.528F, 0.792F, 0.792F, new CubeDeformation(0.0F)),
				PartPose.offset(2.288F, 19.512F, -2.2F));

		PartDefinition cube_r12 = legl1.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(11, 8).addBox(-0.088F, -0.088F, -0.396F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1536F, 1.9835F, -1.3547F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition cube_r13 = legl1.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.088F, -0.088F, -0.132F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1503F, 2.0216F, -1.384F, -0.2182F, 0.0F, -0.0873F));

		PartDefinition cube_r14 = legl1.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(7, 12).addBox(-0.088F, -0.088F, -0.396F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1984F, 1.8955F, -1.3547F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition cube_r15 = legl1.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 1).addBox(-0.088F, -0.088F, -0.132F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2017F, 1.9336F, -1.384F, -0.2182F, 0.0F, -0.0873F));

		PartDefinition cube_r16 = legl1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(25, 14)
				.addBox(-0.352F, 0.66F, -0.484F, 0.704F, 0.264F, 0.968F, new CubeDeformation(0.0F)).texOffs(13, 27)
				.addBox(-0.264F, -0.396F, -0.396F, 0.528F, 1.056F, 0.792F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0385F, 1.2115F, -0.856F, 0.0F, 0.0F, -0.0873F));

		PartDefinition legl2 = partdefinition.addOrReplaceChild("legl2", CubeListBuilder.create().texOffs(23, 27)
				.addBox(-0.6F, -0.04F, -1.34F, 0.264F, 0.968F, 0.968F, new CubeDeformation(0.0F)).texOffs(29, 11)
				.addBox(-0.336F, 0.048F, -1.252F, 0.528F, 0.792F, 0.792F, new CubeDeformation(0.0F)),
				PartPose.offset(2.288F, 19.512F, -0.088F));

		PartDefinition cube_r17 = legl2.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(1, 6).addBox(-0.088F, -0.088F, -0.396F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1536F, 1.9835F, -1.3547F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition cube_r18 = legl2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 7).addBox(-0.088F, -0.088F, -0.132F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1503F, 2.0216F, -1.384F, -0.2182F, 0.0F, -0.0873F));

		PartDefinition cube_r19 = legl2.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(1, 7).addBox(-0.088F, -0.088F, -0.396F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1984F, 1.8955F, -1.3547F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition cube_r20 = legl2.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 6).addBox(-0.088F, -0.088F, -0.132F, 0.176F, 0.176F, 0.264F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2017F, 1.9336F, -1.384F, -0.2182F, 0.0F, -0.0873F));

		PartDefinition cube_r21 = legl2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 27)
				.addBox(-0.352F, 0.66F, -0.484F, 0.704F, 0.264F, 0.968F, new CubeDeformation(0.0F)).texOffs(27, 18)
				.addBox(-0.264F, -0.396F, -0.396F, 0.528F, 1.056F, 0.792F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0385F, 1.2115F, -0.856F, 0.0F, 0.0F, -0.0873F));

		PartDefinition wingl = partdefinition.addOrReplaceChild("wingl", CubeListBuilder.create(),
				PartPose.offset(2.112F, 17.664F, -0.616F));

		PartDefinition cube_r22 = wingl.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(18, 10)
				.addBox(-1.5582F, 0.132F, 0.2006F, 3.696F, 0.0F, 0.616F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-1.5582F, 0.132F, -0.7674F, 3.696F, 0.0F, 0.616F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0462F, 0.62F, -0.9246F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r23 = wingl.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.5582F, -0.132F, -0.1514F, 4.048F, 0.264F, 0.352F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0462F, 0.708F, -0.9246F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r24 = wingl.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 13)
				.addBox(-1.508F, 0.132F, -1.498F, 3.784F, 0.0F, 0.352F, new CubeDeformation(0.0F)).texOffs(20, 5)
				.addBox(-1.508F, 0.132F, -0.794F, 3.784F, 0.0F, 0.528F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0462F, 0.62F, -0.9246F, 0.0F, 0.2618F, 0.1745F));

		PartDefinition cube_r25 = wingl.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 17)
				.addBox(-1.508F, -0.132F, -1.85F, 4.048F, 0.264F, 0.352F, new CubeDeformation(0.0F)).texOffs(9, 17)
				.addBox(-1.508F, -0.132F, -1.146F, 4.048F, 0.264F, 0.352F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0462F, 0.708F, -0.9246F, 0.0F, 0.2618F, 0.1745F));

		PartDefinition cube_r26 = wingl.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(20, 12)
				.addBox(-1.5284F, 0.044F, 1.1514F, 3.784F, 0.0F, 0.352F, new CubeDeformation(0.0F)).texOffs(11, 19)
				.addBox(-1.5284F, 0.044F, 0.2714F, 3.784F, 0.0F, 0.528F, new CubeDeformation(0.0F)).texOffs(16, 15)
				.addBox(-1.5284F, -0.132F, 1.5034F, 4.048F, 0.264F, 0.352F, new CubeDeformation(0.0F)).texOffs(0, 18)
				.addBox(-1.5284F, -0.132F, 0.7994F, 4.048F, 0.264F, 0.352F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0462F, 0.708F, -0.9246F, 0.0F, -0.2618F, 0.1745F));

		PartDefinition wingr = partdefinition.addOrReplaceChild("wingr", CubeListBuilder.create(),
				PartPose.offset(-0.88F, 17.664F, -0.616F));

		PartDefinition cube_r27 = wingr.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(18, 1)
				.addBox(-2.1378F, 0.132F, 0.2006F, 3.696F, 0.0F, 0.616F, new CubeDeformation(0.0F)).texOffs(17, 17)
				.addBox(-2.1378F, 0.132F, -0.7674F, 3.696F, 0.0F, 0.616F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2462F, 0.62F, -0.9246F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r28 = wingr.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(16, 14).addBox(-2.4898F, -0.132F, -0.1514F, 4.048F, 0.264F, 0.352F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2462F, 0.708F, -0.9246F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r29 = wingr.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(20, 9)
				.addBox(-2.276F, 0.132F, -1.498F, 3.784F, 0.0F, 0.352F, new CubeDeformation(0.0F)).texOffs(19, 7)
				.addBox(-2.276F, 0.132F, -0.794F, 3.784F, 0.0F, 0.528F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2462F, 0.62F, -0.9246F, 0.0F, -0.2618F, -0.1745F));

		PartDefinition cube_r30 = wingr.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 63)
				.addBox(-2.54F, -0.132F, -1.85F, 4.048F, 0.264F, 0.352F, new CubeDeformation(0.0F)).texOffs(0, 16)
				.addBox(-2.54F, -0.132F, -1.146F, 4.048F, 0.264F, 0.352F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2462F, 0.708F, -0.9246F, 0.0F, -0.2618F, -0.1745F));

		PartDefinition cube_r31 = wingr.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(18, 16)
				.addBox(-2.2556F, 0.044F, 1.1514F, 3.784F, 0.0F, 0.352F, new CubeDeformation(0.0F)).texOffs(0, 19)
				.addBox(-2.2556F, 0.044F, 0.2714F, 3.784F, 0.0F, 0.528F, new CubeDeformation(0.0F)).texOffs(0, 63)
				.addBox(-2.5196F, -0.132F, 1.5034F, 4.048F, 0.264F, 0.352F, new CubeDeformation(0.0F)).texOffs(9, 16)
				.addBox(-2.5196F, -0.132F, 0.7994F, 4.048F, 0.264F, 0.352F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2462F, 0.708F, -0.9246F, 0.0F, 0.2618F, -0.1745F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bodyt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wingr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}