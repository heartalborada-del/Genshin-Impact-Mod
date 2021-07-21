package me.heartalborada.genshin.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item{
    public ItemBase(String name, ItemGroup group){
        super(new Properties().tab(group).stacksTo(64));
        this.setRegistryName("genshin",name);
    }
}
