package me.heartalborada.genshin.blocks;

import me.heartalborada.genshin.handler.GenshinRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraftforge.fml.RegistryObject;

import static net.minecraft.state.properties.BlockStateProperties.AXIS;
import static net.minecraftforge.common.ToolType.*;

public class GenshinBlocks {
    public static RegistryObject<Block> primogemOre;
    public static RegistryObject<Block> AnemoculusLog;
    public static void register(){
        primogemOre = GenshinRegistry.BLOCKS.register("primogem_ore",()-> new BlockPrimogemOre(AbstractBlock.Properties.of(Material.STONE)
                .requiresCorrectToolForDrops()
                .strength(10)
                .harvestLevel(3)
                .harvestTool(PICKAXE))
        );
        AnemoculusLog = GenshinRegistry.BLOCKS.register("anemoculus_log",()-> new BlockAnemoculusLog(AbstractBlock.Properties.of(Material.WOOD)
                .requiresCorrectToolForDrops()
                .strength(2)
                .harvestLevel(0)
                .harvestTool(AXE)
                .sound(SoundType.WOOD))
        );
    }
}
