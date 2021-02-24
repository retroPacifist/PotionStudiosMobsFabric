package io.github.retropacifist.mobsgalore.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class TempleGuardEntity extends HostileEntity {

    public TempleGuardEntity(EntityType<? extends TempleGuardEntity> type, World world) {
        super(type, world);
    }
}
