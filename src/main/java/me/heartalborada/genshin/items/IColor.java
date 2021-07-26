package me.heartalborada.genshin.items;

import me.heartalborada.genshin.blocks.GenshinBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GrassColors;
import net.minecraft.world.IBlockDisplayReader;

public class IColor extends ItemColors {
    public static ItemColors createDefault(BlockColors p_186729_0_) {
        ItemColors itemcolors = new ItemColors();
        itemcolors.register((p_210235_1_, p_210235_2_) -> {
            BlockState blockstate = ((BlockItem)p_210235_1_.getItem()).getBlock().defaultBlockState();
            return p_186729_0_.getColor(blockstate, (IBlockDisplayReader)null, (BlockPos)null, p_210235_2_);
        }, GenshinBlocks.AnemoculusLeaves.get());
        net.minecraftforge.client.ForgeHooksClient.onItemColorsInit(itemcolors, p_186729_0_);
        return itemcolors;
    }
}
