package me.heartalborada.genshin.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.*;

public class BlockPrimogemOre extends Block {
    public BlockPrimogemOre(Properties properties) {
        super(properties);
    }

    protected int xpOnDrop(Random rand) {
        return MathHelper.nextInt(rand, 4, 8);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpOnDrop(RANDOM) : 0;
    }
}