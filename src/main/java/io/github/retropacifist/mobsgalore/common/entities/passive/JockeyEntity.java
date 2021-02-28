package io.github.retropacifist.mobsgalore.common.entities.passive;

import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer.Builder;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities.BOAR;
import static java.util.Objects.requireNonNull;
import static net.minecraft.entity.attribute.EntityAttributes.*;

public class JockeyEntity extends PathAwareEntity {

    public JockeyEntity(EntityType<? extends JockeyEntity> entityType, World world) {
        super(entityType, world);
    }

    public static Builder createJockeyAttributes() {
        return createMobAttributes()
                .add(GENERIC_MAX_HEALTH, 5.0D)
                .add(GENERIC_MOVEMENT_SPEED, 0.3D);
    }

    @Override
    protected void initGoals() {
        goalSelector.add(1, new SwimGoal(this));
        goalSelector.add(2, new WanderAroundFarGoal(this, 1.0D));
        goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        goalSelector.add(3, new LookAroundGoal(this));
    }

    @Override
    public EntityData initialize(ServerWorldAccess access, LocalDifficulty difficulty, SpawnReason reason, @Nullable EntityData data, @Nullable CompoundTag tag) {
        MountEntity boar = requireNonNull(BOAR.create(world));

        boar.refreshPositionAndAngles(getX(), getY(), getZ(), yaw, 0.0F);
        boar.initialize(access, difficulty, reason, data, tag);

        world.spawnEntity(boar);

        startRiding(boar, true);

        return super.initialize(access, difficulty, reason, data, tag);
    }
}
