package me.heartalborada.genshin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;

import static net.minecraftforge.common.ToolType.PICKAXE;

public class blocks {
    public static RegistryObject<Block> Primogem_ore;
    public static void register(){
        Primogem_ore = Registry.BLOCKS.register("primogem_ore",()-> new Block(
                new AbstractBlock.Properties()
                        .strength(9.00)
                        .harvestLevel(3)
                        .harvestTool(PICKAXE)
        ));
    }
}
