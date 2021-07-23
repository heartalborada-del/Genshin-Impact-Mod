package me.heartalborada.genshin;

import me.heartalborada.genshin.world.gen.PrimogemOre;
import me.heartalborada.genshin.handler.GenshinRegistry;
import me.heartalborada.genshin.items.GenshinItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("genshin")
public class Genshin {
    public static final String MOD_ID = "genshin";
    public static final String MOD_NAME = "Genshin";

    public static final ItemGroup ITEM_TAB = new ItemGroup("genshin_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GenshinItems.primogem.get());
        }
    };

    public static final ItemGroup BLOCK_TAB = new ItemGroup("genshin_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GenshinItems.primogemOre.get());
        }
    };

    private static final Logger LOGGER = LogManager.getLogger();
    public Genshin(){
        GenshinRegistry.register();
        final IEventBus eventBus= FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, PrimogemOre::generatePrimogemOre);
    }
}
