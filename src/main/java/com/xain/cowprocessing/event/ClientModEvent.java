package com.xain.cowprocessing.event;

import com.xain.cowprocessing.CowProcessing;
import com.xain.cowprocessing.entity.ModEntities;
import com.xain.cowprocessing.entity.WoodCowModel;
import com.xain.cowprocessing.entity.WoodCowRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CowProcessing.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvent {
    private ClientModEvent() {}

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(WoodCowModel.LAYER_LOCATION, WoodCowModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(ModEntities.WOODCOW.get(), WoodCowRenderer::new);
    }
}
