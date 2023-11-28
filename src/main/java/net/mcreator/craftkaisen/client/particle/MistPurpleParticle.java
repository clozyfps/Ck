
package net.mcreator.craftkaisen.client.particle;

@OnlyIn(Dist.CLIENT)
public class MistPurpleParticle extends TextureSheetParticle {

	public static MistPurpleParticleProvider provider(SpriteSet spriteSet) {
		return new MistPurpleParticleProvider(spriteSet);
	}

	public static class MistPurpleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public MistPurpleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new MistPurpleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected MistPurpleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);
		this.quadSize *= 50f;

		this.lifetime = 25;

		this.gravity = 0f;
		this.hasPhysics = false;

		this.xd = vx * 0;
		this.yd = vy * 0;
		this.zd = vz * 0;

		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();

	}

}
