package me.heartalborada.genshin.registry;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber
public class ItemRegistry {
    IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    public static void register()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(eventBus);
        ENTITY_TYPES.register(eventBus);
        OFMSItems.register();
    }
}