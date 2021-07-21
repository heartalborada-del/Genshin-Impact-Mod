package me.heartalborada.genshin.item;

import me.heartalborada.genshin.registry.ItemRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import static me.heartalborada.genshin.genshin.ITEM_TAB;

public class genshin_items {
    public static RegistryObject<Item> az;
    public static void register(){
        az=ItemRegistry.ITEMS.register("az",()->new Item(new Item.Properties().tab(ITEM_TAB).stacksTo(64)));
    }
}
