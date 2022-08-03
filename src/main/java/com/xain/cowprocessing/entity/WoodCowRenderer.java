package com.xain.cowprocessing.entity;

import com.xain.cowprocessing.CowProcessing;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WoodCowRenderer extends MobRenderer<WoodCowEntity, WoodCowModel<WoodCowEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(CowProcessing.MODID, "textures/entities/woodcow.png");

    public WoodCowRenderer(EntityRendererProvider.Context context) {
        super(context, new WoodCowModel<>(context.bakeLayer(WoodCowModel.LAYER_LOCATION)), 0.7F);
    }

    public ResourceLocation getTextureLocation(WoodCowEntity entity) {
        return TEXTURE;
    }
}
