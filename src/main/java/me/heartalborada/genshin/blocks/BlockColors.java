package me.heartalborada.genshin.blocks;

import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BlockColors {
    public static IBlockColor leaves_color= (p_getColor_1_, p_getColor_2_, p_getColor_3_, p_getColor_4_) -> {
        return ((p_getColor_1_ != null && p_getColor_3_ != null ? BiomeColors.getAverageFoliageColor(p_getColor_2_, p_getColor_3_) : FoliageColors.getDefaultColor())+80500);
        // XXR-XXG-XXB-XXA
    };

    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event){
        event.getBlockColors().register(leaves_color, GenshinBlocks.AnemoculusLeaves.get());
    }
}
