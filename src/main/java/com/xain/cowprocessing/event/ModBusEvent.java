package com.xain.cowprocessing.event;

import com.xain.cowprocessing.CowProcessing;
import com.xain.cowprocessing.entity.ModEntities;
import com.xain.cowprocessing.entity.WoodCowEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CowProcessing.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBusEvent {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.WOODCOW.get(), WoodCowEntity.createAttributes().build());
    }
}
