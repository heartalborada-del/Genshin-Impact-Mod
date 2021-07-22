package me.heartalborada.genshin.blocks;

import me.heartalborada.genshin.items.GenshinItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;

import java.util.*;

public class BlockPrimogemOre extends Block {
    public BlockPrimogemOre(Properties properties) {
        super(properties);
    }

    @Override
    public List<ItemStack> getDrops(BlockState p_220076_1_, LootContext.Builder p_220076_2_) {
        List<ItemStack> drops = NonNullList.create();
        drops.add(new ItemStack(GenshinItems.primogem.get()));
        return drops;
    }

    public void spawnAfterBreak(BlockState p_220062_1_, ServerWorld p_220062_2_, BlockPos p_220062_3_, ItemStack p_220062_4_) {
        super.spawnAfterBreak(p_220062_1_, p_220062_2_, p_220062_3_, p_220062_4_);
    }

    protected int xpOnDrop(Random rand) {
        return MathHelper.nextInt(rand, 4, 8);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpOnDrop(RANDOM) : 0;
    }
}