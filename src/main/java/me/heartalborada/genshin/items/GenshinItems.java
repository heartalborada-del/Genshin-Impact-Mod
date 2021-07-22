package me.heartalborada.genshin.items;

import me.heartalborada.genshin.blocks.GenshinBlocks;
import me.heartalborada.genshin.handler.GenshinRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.server.command.TextComponentHelper;

import java.awt.*;

import static me.heartalborada.genshin.Genshin.BLOCK_TAB;
import static me.heartalborada.genshin.Genshin.ITEM_TAB;

public class GenshinItems {
    public static RegistryObject<Item> primogem;
    public static RegistryObject<Item> primogemOre;
    public static void register(){
        primogem= GenshinRegistry.ITEMS.register("primogem",()->new Item(new Item.Properties().tab(ITEM_TAB).stacksTo(64)));
        primogemOre = GenshinRegistry.ITEMS.register("primogem_ore", () -> new BlockItem(GenshinBlocks.primogemOre.get(), new Item.Properties().tab(BLOCK_TAB).stacksTo(64)));
    }
}
