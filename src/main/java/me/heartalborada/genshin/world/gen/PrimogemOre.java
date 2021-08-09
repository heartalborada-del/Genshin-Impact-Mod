package me.heartalborada.genshin.world.gen;

import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import static me.heartalborada.genshin.blocks.GenshinBlocks.primogemOre;

public class PrimogemOre {
    public static void generatePrimogemOre(final BiomeLoadingEvent e){
        new Ore(e.getGeneration(),
                OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                primogemOre.get().defaultBlockState(),
                8,
                5,
                0,
                25,
                10
        );
    }
}
