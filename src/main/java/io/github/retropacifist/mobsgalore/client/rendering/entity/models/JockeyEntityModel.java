package io.github.retropacifist.mobsgalore.client.rendering.entity.models;

import io.github.retropacifist.mobsgalore.common.entities.passive.JockeyEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.util.math.MathHelper;

import static com.google.common.collect.ImmutableList.of;

public class JockeyEntityModel<T extends JockeyEntity> extends CompositeEntityModel<T> {
    private final ModelPart head;
    private final ModelPart torso;
    private final ModelPart backpack;
    private final ModelPart rightArm;
    private final ModelPart leftArm;
    private final ModelPart rightLeg;
    private final ModelPart leftLeg;

    public JockeyEntityModel() {
        head = new ModelPart(this);
        head.setPivot(0.0F, 13.0F, 0.0F);
        head.setTextureOffset(0, 0).addCuboid(-3.5F, -4.0F, -1.5F, 7.0F, 4.0F, 3.0F, 0.0F, false);

        torso = new ModelPart(this);
        torso.setPivot(0.0F, 19.0F, 0.0F);
        torso.setTextureOffset(0, 7).addCuboid(-2.0F, -6.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);

        backpack = new ModelPart(this);
        backpack.setPivot(0.0F, -4.0F, 2.0F);
        torso.addChild(backpack);
        backpack.setTextureOffset(28, 12).addCuboid(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, 0.25F, false);
        backpack.setTextureOffset(16, 12).addCuboid(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
        backpack.setTextureOffset(40, 13).addCuboid(-0.5F, -1.0F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        rightArm = new ModelPart(this);
        rightArm.setPivot(-2.0F, 14.0F, 0.0F);
        rightArm.setTextureOffset(0, 15).addCuboid(-1.0F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        leftArm = new ModelPart(this);
        leftArm.setPivot(2.0F, 14.0F, 0.0F);
        leftArm.setTextureOffset(12, 12).addCuboid(0.0F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        rightLeg = new ModelPart(this);
        rightLeg.setPivot(-1.5F, 19.0F, 0.0F);
        rightLeg.setTextureOffset(8, 15).addCuboid(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        leftLeg = new ModelPart(this);
        leftLeg.setPivot(1.5F, 19.0F, 0.0F);
        leftLeg.setTextureOffset(4, 15).addCuboid(-0.5F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
    }

    @Override
    public Iterable<ModelPart> getParts() {
        return of(head, torso, rightArm, leftArm, rightLeg, leftLeg);
    }

    @Override
    public void setAngles(T entity, float angle, float distance, float animationProgress, float yaw, float pitch) {
        head.yaw = yaw * 0.01F;
        head.pitch = pitch * 0.01F;

        rightArm.pitch = MathHelper.cos(angle * 0.6F) * distance;
        leftArm.pitch = MathHelper.cos(angle * 0.6F + 3.14F) * distance;

        if (riding) {
            rightLeg.pitch = -1.5708F;
            leftLeg.pitch = -1.5708F;
        } else {
            rightLeg.pitch = MathHelper.cos(angle * 0.6F + 3.14F) * distance;
            leftLeg.pitch = MathHelper.cos(angle * 0.6F) * distance;
        }
    }
}
