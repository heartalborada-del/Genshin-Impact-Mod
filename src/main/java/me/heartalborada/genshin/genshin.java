package me.heartalborada.genshin;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static me.heartalborada.genshin.items.Primogem;

@Mod("genshin")
public class genshin {
    public static final ItemGroup ITEM_TAB = new ItemGroup("genshin_item") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Primogem.get());
        }
    };
    private static final Logger LOGGER = LogManager.getLogger();
    public genshin(){
        Registry.register();
    }
}
