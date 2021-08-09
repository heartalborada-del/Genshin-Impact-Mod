package me.heartalborada.genshin.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.registries.IRegistryDelegate;

public class BlockAnemoculusLeave extends LeavesBlock{
    public BlockAnemoculusLeave(Properties properties) {
        super(properties);
        IRegistryDelegate iRegistryDelegate = new IRegistryDelegate() {
            @Override
            public Object get() {
                return null;
            }

            @Override
            public ResourceLocation name() {
                return null;
            }

            @Override
            public Class type() {
                return null;
            }
        };
    }

    public static boolean ocelotOrParrot(BlockState state, IBlockReader iBlockReader, BlockPos blockPos, EntityType<?> entityType) {
        return entityType == EntityType.OCELOT || entityType == EntityType.PARROT;
    }

    public static boolean never(BlockState state, IBlockReader iBlockReader, BlockPos blockPos) {
        return false;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
        return 20;
    }
}
