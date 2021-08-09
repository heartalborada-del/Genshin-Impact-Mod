package me.heartalborada.genshin.items;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ItemColors {
    private static final IItemColor itemColor= (p_getColor_1_, p_getColor_2_) -> 7923107;

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event){
        event.getItemColors().register(itemColor,GenshinItems.AnemoculusLeaves.get());
    }
}

