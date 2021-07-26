package me.heartalborada.genshin.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BColor extends BlockColors {
    public static BlockColors createDefault() {
        BlockColors blockcolors = new BlockColors();
        blockcolors.register((p_228061_0_, p_228061_1_, p_228061_2_, p_228061_3_) -> {
            return p_228061_1_ != null && p_228061_2_ != null ? BiomeColors.getAverageFoliageColor(p_228061_1_, p_228061_2_) : FoliageColors.getDefaultColor();
        }, GenshinBlocks.AnemoculusLeaves.get());
        net.minecraftforge.client.ForgeHooksClient.onBlockColorsInit(blockcolors);
        return blockcolors;
    }

}
