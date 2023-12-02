
package net.mcreator.craftkaisen.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.procedures.QuestBoardOnBlockRightClickedProcedure;

import java.util.List;
import java.util.Collections;

public class QuestBoardBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public QuestBoardBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1f, 5f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(22.5, 0, 6.5, 25.5, 1, 9.5), box(23, 1, 7, 25, 13, 9), box(-9, 1, 7, -7, 13, 9), box(-9.5, 0, 6.5, -6.5, 1, 9.5), box(-9.5, 13.5, 7, 25.5, 31.5, 9), box(-5.5, 15.5, 9, -0.5, 23.5, 9.15),
					box(5.5, 20.5, 9, 10.5, 28.5, 9.15), box(14.5, 15.5, 9, 19.5, 23.5, 9.15), box(-9.5, 13, 7, 25.5, 13.5, 9.5), box(-9.5, 31.5, 7, 25.5, 32, 9.5), box(25.5, 13, 7, 26, 32, 9.5), box(-10, 13, 7, -9.5, 32, 9.5));
			case NORTH -> Shapes.or(box(-9.5, 0, 6.5, -6.5, 1, 9.5), box(-9, 1, 7, -7, 13, 9), box(23, 1, 7, 25, 13, 9), box(22.5, 0, 6.5, 25.5, 1, 9.5), box(-9.5, 13.5, 7, 25.5, 31.5, 9), box(16.5, 15.5, 6.85, 21.5, 23.5, 7),
					box(5.5, 20.5, 6.85, 10.5, 28.5, 7), box(-3.5, 15.5, 6.85, 1.5, 23.5, 7), box(-9.5, 13, 6.5, 25.5, 13.5, 9), box(-9.5, 31.5, 6.5, 25.5, 32, 9), box(-10, 13, 6.5, -9.5, 32, 9), box(25.5, 13, 6.5, 26, 32, 9));
			case EAST -> Shapes.or(box(6.5, 0, -9.5, 9.5, 1, -6.5), box(7, 1, -9, 9, 13, -7), box(7, 1, 23, 9, 13, 25), box(6.5, 0, 22.5, 9.5, 1, 25.5), box(7, 13.5, -9.5, 9, 31.5, 25.5), box(9, 15.5, 16.5, 9.15, 23.5, 21.5),
					box(9, 20.5, 5.5, 9.15, 28.5, 10.5), box(9, 15.5, -3.5, 9.15, 23.5, 1.5), box(7, 13, -9.5, 9.5, 13.5, 25.5), box(7, 31.5, -9.5, 9.5, 32, 25.5), box(7, 13, -10, 9.5, 32, -9.5), box(7, 13, 25.5, 9.5, 32, 26));
			case WEST -> Shapes.or(box(6.5, 0, 22.5, 9.5, 1, 25.5), box(7, 1, 23, 9, 13, 25), box(7, 1, -9, 9, 13, -7), box(6.5, 0, -9.5, 9.5, 1, -6.5), box(7, 13.5, -9.5, 9, 31.5, 25.5), box(6.85, 15.5, -5.5, 7, 23.5, -0.5),
					box(6.85, 20.5, 5.5, 7, 28.5, 10.5), box(6.85, 15.5, 14.5, 7, 23.5, 19.5), box(6.5, 13, -9.5, 9, 13.5, 25.5), box(6.5, 31.5, -9.5, 9, 32, 25.5), box(6.5, 13, 25.5, 9, 32, 26), box(6.5, 13, -10, 9, 32, -9.5));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		QuestBoardOnBlockRightClickedProcedure.execute(entity);
		return InteractionResult.SUCCESS;
	}
}
