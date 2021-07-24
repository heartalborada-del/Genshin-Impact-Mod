package me.heartalborada.genshin.blocks;

import me.heartalborada.genshin.handler.GenshinRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;

import static net.minecraftforge.common.ToolType.*;

public class GenshinBlocks {
    public static RegistryObject<Block> primogemOre;
    public static RegistryObject<Block> AnemoculusLog;
    public static RegistryObject<Block> AnemoculusWood;
    public static RegistryObject<Block> StrippedAnemoculusLog;
    public static RegistryObject<Block> StrippedAnemoculusWood;
    public static RegistryObject<Block> AnemoculusPlanks;
    public static RegistryObject<Block> AnemoculusLeaves;
    public static void register(){
        primogemOre = GenshinRegistry.BLOCKS.register("primogem_ore",()-> new BlockPrimogemOre(AbstractBlock.Properties
                .of(Material.STONE)
                .requiresCorrectToolForDrops()
                .strength(10)
                .harvestLevel(3)
                .harvestTool(PICKAXE))
        );
        AnemoculusLog = GenshinRegistry.BLOCKS.register("anemoculus_log",()-> new BlockAnemoculusLogs(AbstractBlock.Properties
                .of(Material.WOOD)
                .requiresCorrectToolForDrops()
                .strength(2)
                .harvestLevel(0)
                .harvestTool(AXE)
                .sound(SoundType.WOOD))
        );
        AnemoculusWood = GenshinRegistry.BLOCKS.register("anemoculus_wood",()-> new BlockAnemoculusLogs(AbstractBlock.Properties
                .of(Material.WOOD)
                .requiresCorrectToolForDrops()
                .strength(2)
                .harvestLevel(0)
                .harvestTool(AXE)
                .sound(SoundType.WOOD))
        );
        StrippedAnemoculusLog = GenshinRegistry.BLOCKS.register("stripped_anemoculus_log",()-> new BlockAnemoculusLogs(AbstractBlock.Properties
                .of(Material.WOOD)
                .requiresCorrectToolForDrops()
                .strength(2)
                .harvestLevel(0)
                .harvestTool(AXE)
                .sound(SoundType.WOOD))
        );
        StrippedAnemoculusWood = GenshinRegistry.BLOCKS.register("stripped_anemoculus_wood",()-> new BlockAnemoculusLogs(AbstractBlock.Properties
                .of(Material.WOOD)
                .requiresCorrectToolForDrops()
                .strength(2)
                .harvestLevel(0)
                .harvestTool(AXE)
                .sound(SoundType.WOOD))
        );
        AnemoculusPlanks = GenshinRegistry.BLOCKS.register("anemoculus_planks",()-> new BlockAnemoculusPlanks(AbstractBlock.Properties
                .of(Material.WOOD)
                .requiresCorrectToolForDrops()
                .strength(2.0F)
                .harvestLevel(0)
                .harvestTool(AXE)
                .sound(SoundType.WOOD))
        );
        AnemoculusLeaves = GenshinRegistry.BLOCKS.register("anemoculus_leaves",()-> new BlockAnemoculusPlanks(AbstractBlock.Properties
                .of(Material.LEAVES)
                .requiresCorrectToolForDrops()
                .strength(0.2F)
                .harvestLevel(0)
                .harvestTool(AXE)
                .sound(SoundType.GRASS)
                .isValidSpawn(BlockAnemoculusLeave::ocelotOrParrot)
                .isSuffocating(BlockAnemoculusLeave::never)
                .isViewBlocking(BlockAnemoculusLeave::never))
        );
    }
}
