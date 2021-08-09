package me.heartalborada.genshin.items;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ItemColors {
    private static final IItemColor itemColor=new IItemColor() {
        @Override
        public int getColor(ItemStack p_getColor_1_, int p_getColor_2_) {
            return 7923107;
        }
    };

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event){
        event.getItemColors().register(itemColor,GenshinItems.AnemoculusLeaves.get());
    }
}
