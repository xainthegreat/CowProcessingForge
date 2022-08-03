package com.xain.cowprocessing.item;

import com.xain.cowprocessing.CowProcessing;
import com.xain.cowprocessing.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CowProcessing.MODID);

    public static final RegistryObject<Item> TestItem = ITEMS.register("testitem",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.COWPROCESSING_TAB)));
    public static final RegistryObject<Item> TestItem2 = ITEMS.register("testitem2",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.COWPROCESSING_TAB)));


    public static final RegistryObject<Item> WOODCOW_EGG = ITEMS.register("woodcow_egg",
            () -> new ForgeSpawnEggItem(ModEntities.WOODCOW, 0x7F6000, 0x38761d,
                    new Item.Properties().tab(ModCreativeModeTab.COWPROCESSING_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
