package io.github.retropacifist.mobsgalore.client.rendering.entity.models;

import io.github.retropacifist.mobsgalore.common.entities.passive.MountEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.MathHelper;

import static com.google.common.collect.ImmutableList.of;

@Environment(EnvType.CLIENT)
public class BoarEntityModel<T extends MountEntity> extends CompositeEntityModel<T> {
    private final ModelPart head;
    private final ModelPart rightEar;
    private final ModelPart leftEar;
    private final ModelPart nose;
    private final ModelPart ring;
    private final ModelPart rightTusk;
    private final ModelPart leftTusk;
    private final ModelPart torso;
    private final ModelPart tail;
    private final ModelPart saddle;
    private final ModelPart rightBottle;
    private final ModelPart leftBottle;
    private final ModelPart rightFrontLeg;
    private final ModelPart leftFrontLeg;
    private final ModelPart rightBackLeg;
    private final ModelPart leftBackLeg;

    public BoarEntityModel() {
        textureWidth = 64;
        textureHeight = 64;

        head = new ModelPart(this);
        head.setPivot(0.0F, 14.0F, -4.0F);
        head.setTextureOffset(0, 24).addCuboid(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        rightEar = new ModelPart(this);
        rightEar.setPivot(-4.0F, -2.0F, -4.0F);
        head.addChild(rightEar);
        setRotationAngle(rightEar, 0.0F, 1.5708F, 0.2182F);
        rightEar.setTextureOffset(14, 42).addCuboid(-3.0F, -0.2164F, -0.5237F, 5.0F, 4.0F, 1.0F, 0.0F, true);

        leftEar = new ModelPart(this);
        leftEar.setPivot(4.0F, -2.0F, -4.0F);
        head.addChild(leftEar);
        setRotationAngle(leftEar, 0.0F, -1.5708F, -0.2182F);
        leftEar.setTextureOffset(14, 42).addCuboid(-2.0F, -0.2164F, -0.5237F, 5.0F, 4.0F, 1.0F, 0.0F, false);

        nose = new ModelPart(this);
        nose.setPivot(0.0F, 2.0F, -8.0F);
        head.addChild(nose);
        nose.setTextureOffset(24, 24).addCuboid(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 3.0F, 0.0F, false);

        ring = new ModelPart(this);
        ring.setPivot(0.0F, 0.4F, -2.5F);
        nose.addChild(ring);
        setRotationAngle(ring, -1.1345F, 0.0F, 0.0F);
        ring.setTextureOffset(0, 0).addCuboid(-1.5F, 0.1F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        ring.setTextureOffset(0, 24).addCuboid(-0.5F, 0.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        rightTusk = new ModelPart(this);
        rightTusk.setPivot(-2.5F, 1.5F, -0.5F);
        nose.addChild(rightTusk);
        setRotationAngle(rightTusk, 0.2618F, 0.0F, -0.2618F);
        rightTusk.setTextureOffset(0, 4).addCuboid(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftTusk = new ModelPart(this);
        leftTusk.setPivot(2.5F, 1.5F, -0.5F);
        nose.addChild(leftTusk);
        setRotationAngle(leftTusk, 0.2618F, 0.0F, 0.2618F);
        leftTusk.setTextureOffset(0, 4).addCuboid(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);

        torso = new ModelPart(this);
        torso.setPivot(0.0F, 15.0F, 4.0F);
        setRotationAngle(torso, -1.5708F, 0.0F, 0.0F);
        torso.setTextureOffset(0, 0).addCuboid(-5.0F, -8.0F, -5.0F, 10.0F, 16.0F, 8.0F, 0.0F, false);

        tail = new ModelPart(this);
        tail.setPivot(0.0F, -8.0F, -3.5F);
        torso.addChild(tail);
        setRotationAngle(tail, 1.0472F, 0.0F, 0.0F);
        tail.setTextureOffset(0, 40).addCuboid(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 5.0F, 0.0F, false);

        saddle = new ModelPart(this);
        saddle.setPivot(0.0F, 0.0F, -1.0F);
        torso.addChild(saddle);
        saddle.setTextureOffset(28, 40).addCuboid(-5.0F, -7.0F, -4.0F, 10.0F, 16.0F, 8.0F, 0.5F, false);

        rightBottle = new ModelPart(this);
        rightBottle.setPivot(-5.5F, -5.0F, -3.0F);
        torso.addChild(rightBottle);
        setRotationAngle(rightBottle, 1.5708F, -0.1745F, 0.0F);
        rightBottle.setTextureOffset(36, 10).addCuboid(-3.0F, 3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
        rightBottle.setTextureOffset(36, 18).addCuboid(-2.0F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
        rightBottle.setTextureOffset(44, 18).addCuboid(-2.5F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);

        leftBottle = new ModelPart(this);
        leftBottle.setPivot(5.5F, -5.0F, -3.0F);
        torso.addChild(leftBottle);
        setRotationAngle(leftBottle, 1.5708F, 0.1745F, 0.0F);
        leftBottle.setTextureOffset(36, 10).addCuboid(-1.0F, 3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        leftBottle.setTextureOffset(36, 18).addCuboid(0.0F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        leftBottle.setTextureOffset(44, 18).addCuboid(-0.5F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

        rightFrontLeg = new ModelPart(this);
        rightFrontLeg.setPivot(-3.0F, 18.0F, -2.0F);
        rightFrontLeg.setTextureOffset(36, 0).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);

        leftFrontLeg = new ModelPart(this);
        leftFrontLeg.setPivot(3.0F, 18.0F, -2.0F);
        leftFrontLeg.setTextureOffset(36, 0).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        rightBackLeg = new ModelPart(this);
        rightBackLeg.setPivot(-3.0F, 18.0F, 9.0F);
        rightBackLeg.setTextureOffset(36, 0).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);

        leftBackLeg = new ModelPart(this);
        leftBackLeg.setPivot(3.0F, 18.0F, 9.0F);
        leftBackLeg.setTextureOffset(36, 0).addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
    }

    @Override
    public Iterable<ModelPart> getParts() {
        return of(head, torso, rightFrontLeg, leftFrontLeg, rightBackLeg, leftBackLeg);
    }

    @Override
    public void setAngles(T entity, float angle, float distance, float animationProgress, float yaw, float pitch) {
        head.yaw = yaw * 0.01F;
        head.pitch = pitch * 0.01F;

        rightEar.pitch = MathHelper.cos(angle * 0.06F + 3.14F) * distance;
        leftEar.pitch = MathHelper.cos(angle * 0.06F + 3.14F) * distance;

        rightFrontLeg.pitch = MathHelper.cos(angle * 0.6F) * distance;
        leftFrontLeg.pitch = MathHelper.cos(angle * 0.6F + 3.14F) * distance;
        rightBackLeg.pitch = MathHelper.cos(angle * 0.6F + 3.14F) * distance;
        leftBackLeg.pitch = MathHelper.cos(angle * 0.6F) * distance;
    }

    public void setRotationAngle(ModelPart part, float x, float y, float z) {
        part.pitch = x;
        part.yaw = y;
        part.roll = z;
    }
}
