package com.xain.cowprocessing.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COWPROCESSING_TAB = new CreativeModeTab("cowprocessingtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TestItem2.get());
        }
    };
}
