package me.heartalborada.genshin.handler;

import me.heartalborada.genshin.blocks.BlockColors;
import me.heartalborada.genshin.blocks.GenshinBlocks;
import me.heartalborada.genshin.items.GenshinItems;
import me.heartalborada.genshin.items.ItemColors;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GenshinRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "genshin");
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "genshin");
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);

        eventBus.addListener(BlockColors::registerBlockColors);
        eventBus.addListener(ItemColors::registerItemColors);

        GenshinItems.register();
        GenshinBlocks.register();
    }
}