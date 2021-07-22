package me.heartalborada.genshin.blocks;

import me.heartalborada.genshin.handler.GenshinRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;

import static net.minecraftforge.common.ToolType.PICKAXE;

public class GenshinBlocks {
    public static RegistryObject<Block> primogemOre;
    
    public static void register(){
        primogemOre = GenshinRegistry.BLOCKS.register("primogem_ore",()-> new BlockPrimogemOre(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(10).harvestLevel(3).harvestTool(PICKAXE)));
    }
}
