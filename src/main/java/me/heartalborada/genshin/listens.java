package me.heartalborada.genshin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber()
public class listens {
    @SubscribeEvent
    public static void playerWillDestroy(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        System.out.println("Drawing!");
    }
}