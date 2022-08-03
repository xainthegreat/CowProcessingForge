package com.xain.cowprocessing.entity;

import com.xain.cowprocessing.CowProcessing;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CowProcessing.MODID);

    public static final RegistryObject<EntityType<WoodCowEntity>> WOODCOW = ENTITIES.register("woodcow",
            () -> EntityType.Builder.of(WoodCowEntity::new, MobCategory.CREATURE)
            .sized(0.9F, 1.4F)
            .clientTrackingRange(10)
            .build(new ResourceLocation(CowProcessing.MODID, "woodcow").toString())
    );

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
