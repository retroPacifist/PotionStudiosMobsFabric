package io.github.retropacifist.mobsgalore.common.entities.passive;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer.Builder;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.World;

import static net.minecraft.entity.attribute.EntityAttributes.*;
import static net.minecraft.entity.data.DataTracker.registerData;
import static net.minecraft.entity.data.TrackedDataHandlerRegistry.BOOLEAN;
import static net.minecraft.predicate.entity.EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR;
import static net.minecraft.world.Difficulty.PEACEFUL;

public class MountEntity extends PathAwareEntity {
    private static final TrackedData<Boolean> ANGRY = registerData(MountEntity.class, BOOLEAN);

    public MountEntity(EntityType<? extends MountEntity> entityType, World world) {
        super(entityType, world);
    }

    public static Builder createBoarAttributes() {
        return createMobAttributes()
                .add(GENERIC_MAX_HEALTH, 12.0D)
                .add(GENERIC_MOVEMENT_SPEED, 0.25D)
                .add(GENERIC_ATTACK_DAMAGE, 2.0D);
    }

    @Override
    protected void initGoals() {
        goalSelector.add(1, new SwimGoal(this));
        goalSelector.add(2, new MeleeAttackGoal(this, 1.0D, true));
        goalSelector.add(3, new WanderAroundFarGoal(this, 1.0D));
        goalSelector.add(4, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        goalSelector.add(4, new LookAroundGoal(this));
        targetSelector.add(1, new FollowTargetGoal<>(this, PlayerEntity.class, 10, true, false, (target) -> EXCEPT_CREATIVE_OR_SPECTATOR.test(target) && isAngry()));
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        dataTracker.startTracking(ANGRY, false);
    }

    @Override
    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);
        tag.putBoolean("Angry", isAngry());
    }

    @Override
    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);
        setAngry(tag.getBoolean("Angry"));
    }

    public boolean isAngry() {
        return dataTracker.get(ANGRY) && world.getDifficulty() != PEACEFUL;
    }

    public void setAngry(boolean angry) {
        dataTracker.set(ANGRY, angry);
    }
}
