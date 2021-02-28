package io.github.retropacifist.mobsgalore.common.entities.passive;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class JockeyEntity extends PathAwareEntity {

    public JockeyEntity(EntityType<? extends JockeyEntity> entityType, World world) {
        super(entityType, world);
    }
}
