package io.github.retropacifist.mobsgalore.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class ScuttlerEntity extends HostileEntity {

    public ScuttlerEntity(EntityType<? extends ScuttlerEntity> type, World world) {
        super(type, world);
    }
}
