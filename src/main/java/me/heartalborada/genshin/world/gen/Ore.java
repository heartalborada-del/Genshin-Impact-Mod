package me.heartalborada.genshin.world.gen;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;

public class Ore {
    public Ore(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int topOffset, int maxHeight, int countPerNum)
    {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(fillerType,state,veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight,topOffset,maxHeight)))
                        .squared()
                        .count(countPerNum)
        );
    }
}
