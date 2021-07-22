package me.heartalborada.genshin.items;

import me.heartalborada.genshin.blocks.GenshinBlocks;
import me.heartalborada.genshin.handler.GenshinRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import static me.heartalborada.genshin.Genshin.BLOCK_TAB;
import static me.heartalborada.genshin.Genshin.ITEM_TAB;

public class GenshinItems {
    public static RegistryObject<Item> primoGem;
    public static RegistryObject<Item> primoGemOre;
    public static void register(){
        primoGem= GenshinRegistry.ITEMS.register("primogem",()->new Item(new Item.Properties().tab(ITEM_TAB).stacksTo(64)));
        primoGemOre = GenshinRegistry.ITEMS.register("primogem_ore", () -> new BlockItem(GenshinBlocks.primoGemOre.get(), new Item.Properties().tab(BLOCK_TAB)));
    }
}
