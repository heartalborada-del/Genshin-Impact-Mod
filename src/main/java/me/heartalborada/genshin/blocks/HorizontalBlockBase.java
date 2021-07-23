package me.heartalborada.genshin.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IWorld;

import java.util.HashMap;
import java.util.Map;

import static net.minecraft.state.properties.BlockStateProperties.FACING;
import static net.minecraft.state.properties.BlockStateProperties.HORIZONTAL_FACING;

public class HorizontalBlockBase extends Block {
    public HorizontalBlockBase(Properties properties) {
        super(properties);
        this.registerDefaultState(
                this.stateDefinition.any()
                        .setValue(FACING, Direction.NORTH));
    }
}
