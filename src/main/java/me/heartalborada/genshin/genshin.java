package me.heartalborada.genshin;

import me.heartalborada.genshin.registry.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("genshin")
public class genshin {
    public static final ItemGroup ITEM_TAB = new ItemGroup("Genshin") {
        @Override
        public ItemStack makeIcon() {
            return null;
        }
    };
    private static final Logger LOGGER = LogManager.getLogger();
    public genshin(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }
    private void setup(final FMLCommonSetupEvent event){
        LOGGER.info("az");
    }
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

    }
}
