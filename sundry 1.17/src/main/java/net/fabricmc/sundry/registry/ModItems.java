package net.fabricmc.sundry.registry;

import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.sundry.main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item SALT = new Item(new Item.Settings().group(ItemGroup.FOOD));

    public static void registerItems() {


    }
}
