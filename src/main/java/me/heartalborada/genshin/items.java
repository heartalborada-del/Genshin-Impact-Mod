package me.heartalborada.genshin;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import static me.heartalborada.genshin.genshin.ITEM_TAB;

public class items {
    public static RegistryObject<Item> Primogem;
    public static void register(){
        Primogem= Registry.ITEMS.register("primogem",()->new Item(new Item.Properties().tab(ITEM_TAB).stacksTo(64)));
    }
}
