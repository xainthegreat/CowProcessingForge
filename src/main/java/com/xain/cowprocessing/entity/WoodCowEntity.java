package com.xain.cowprocessing.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;

public class WoodCowEntity extends Cow {
    public WoodCowEntity(EntityType<? extends Cow> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public Cow getBreedOffspring(ServerLevel level, AgeableMob parent) {
        return ModEntities.WOODCOW.get().create(level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        return super.mobInteract(player, hand);
    }

    @Override
    public void addAdditionalSaveData(@Nonnull CompoundTag compound) {
        super.addAdditionalSaveData(compound);
//        compound.putInt(TAG_DELAY, this.getDelay());
//        if (this.getFluid().getRegistryName() == null) {
//            compound.putString(TAG_FLUID, Objects.requireNonNull(Fluids.EMPTY.getRegistryName()).toString());
//        } else {
//            compound.putString(TAG_FLUID, Objects.requireNonNull(this.getFluid().getRegistryName()).toString());
//        }
    }

    @Override
    public void readAdditionalSaveData(@Nonnull CompoundTag compound) {
        super.readAdditionalSaveData(compound);
//        this.setFluid(compound.getString(TAG_FLUID));
//        this.setDelay(compound.getInt(TAG_DELAY));
    }
}
