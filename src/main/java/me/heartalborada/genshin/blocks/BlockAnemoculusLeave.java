package me.heartalborada.genshin.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;


public class BlockAnemoculusLeave{
    public static boolean ocelotOrParrot(BlockState state, IBlockReader iBlockReader, BlockPos blockPos, EntityType<?> entityType) {
        return entityType == EntityType.OCELOT || entityType == EntityType.PARROT;
    }

    public static boolean never(BlockState state, IBlockReader iBlockReader, BlockPos blockPos) {
        return false;
    }
}
