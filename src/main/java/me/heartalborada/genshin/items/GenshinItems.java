package me.heartalborada.genshin.items;

import me.heartalborada.genshin.blocks.GenshinBlocks;
import me.heartalborada.genshin.handler.GenshinRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import static me.heartalborada.genshin.Genshin.BLOCK_TAB;
import static me.heartalborada.genshin.Genshin.ITEM_TAB;

public class GenshinItems {
    public static RegistryObject<Item> primogem;
    public static RegistryObject<Item> primogemOre;
    public static RegistryObject<Item> AnemoculusLog;
    public static RegistryObject<Item> AnemoculusWood;
    public static RegistryObject<Item> StrippedAnemoculusLog;
    public static RegistryObject<Item> StrippedAnemoculusWood;
    public static RegistryObject<Item> AnemoculusPlanks;
    public static RegistryObject<Item> AnemoculusLeaves;
    public static void register(){
        primogem= GenshinRegistry.ITEMS.register("primogem",()->new Item(new Item.Properties().tab(ITEM_TAB).stacksTo(64)));
        primogemOre = GenshinRegistry.ITEMS.register("primogem_ore", () -> new BlockItem(GenshinBlocks.primogemOre.get(), new Item.Properties().tab(BLOCK_TAB).stacksTo(64)));
        AnemoculusLog = GenshinRegistry.ITEMS.register("anemoculus_log", () -> new BlockItem(GenshinBlocks.AnemoculusLog.get(), new Item.Properties().tab(BLOCK_TAB).stacksTo(64)));
        AnemoculusWood = GenshinRegistry.ITEMS.register("anemoculus_wood", () -> new BlockItem(GenshinBlocks.AnemoculusWood.get(), new Item.Properties().tab(BLOCK_TAB).stacksTo(64)));
        StrippedAnemoculusLog = GenshinRegistry.ITEMS.register("stripped_anemoculus_log", () -> new BlockItem(GenshinBlocks.StrippedAnemoculusLog.get(), new Item.Properties().tab(BLOCK_TAB).stacksTo(64)));
        StrippedAnemoculusWood = GenshinRegistry.ITEMS.register("stripped_anemoculus_wood", () -> new BlockItem(GenshinBlocks.StrippedAnemoculusWood.get(), new Item.Properties().tab(BLOCK_TAB).stacksTo(64)));
        AnemoculusPlanks = GenshinRegistry.ITEMS.register("anemoculus_planks", () -> new BlockItem(GenshinBlocks.AnemoculusPlanks.get(), new Item.Properties().tab(BLOCK_TAB).stacksTo(64)));
        AnemoculusLeaves = GenshinRegistry.ITEMS.register("anemoculus_leaves", () -> new BlockItem(GenshinBlocks.AnemoculusLeaves.get(), new Item.Properties().tab(BLOCK_TAB).stacksTo(64)));
    }
}
