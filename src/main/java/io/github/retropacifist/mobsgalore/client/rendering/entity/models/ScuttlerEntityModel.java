package io.github.retropacifist.mobsgalore.client.rendering.entity.models;

import io.github.retropacifist.mobsgalore.common.entities.ScuttlerEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CompositeEntityModel;

import static com.google.common.collect.ImmutableList.of;

@Environment(EnvType.CLIENT)
public class ScuttlerEntityModel<T extends ScuttlerEntity> extends CompositeEntityModel<T> implements WrappedModel {
    private final ModelPart shell;
    private final ModelPart shellTop;
    private final ModelPart body;
    private final ModelPart stalks;
    private final ModelPart rightArm;
    private final ModelPart rightClaw;
    private final ModelPart leftArm;
    private final ModelPart leftClaw;
    private final ModelPart rightFrontLeg;
    private final ModelPart rightFrontLowerLeg;
    private final ModelPart rightMiddleLeg;
    private final ModelPart rightMiddleLowerLeg;
    private final ModelPart rightBackLeg;
    private final ModelPart rightBackLowerLeg;
    private final ModelPart leftFrontLeg;
    private final ModelPart leftFrontLowerLeg;
    private final ModelPart leftMiddleLeg;
    private final ModelPart leftMiddleLowerLeg;
    private final ModelPart leftBackLeg;
    private final ModelPart leftBackLowerLeg;

    public ScuttlerEntityModel() {
        shell = createPart(this, 0, 0, 0.0F, 20.0F, 1.0F);
        rotate(shell, -0.6981F, 0.0F, 0.0F);
        shell.addCuboid(-5.0F, -6.0F, -5.0F, 10.0F, 6.0F, 10.0F, 0.0F, false);

        shellTop = createPart(this, 0, 16, 0.0F, -6.0F, 0.0F);
        shell.addChild(shellTop);
        shellTop.addCuboid(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);

        body = createPart(this, 30, 1, 0.0F, 20.0F, 0.0F);
        body.addCuboid(-4.0F, -1.0F, -3.0F, 8.0F, 3.0F, 6.0F, 0.0F, false);

        stalks = createPart(this, 40, 10, 0.0F, -1.0F, -3.0F);
        body.addChild(stalks);
        rotate(stalks, 0.3927F, 0.0F, 0.0F);
        stalks.addCuboid(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 0.0F, 0.0F, false);

        rightArm = createPart(this, 40, 14, -4.0F, 21.0F, -3.0F);
        rotate(rightArm, -1.5708F, 0.4363F, -0.2182F);
        rightArm.addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightClaw = createPart(this, 48, 14, 0.0F, 3.0F, 0.0F);
        rightArm.addChild(rightClaw);
        rotate(rightClaw, 0.0F, 0.0F, -0.7854F);
        rightClaw.addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 3.0F, 0.0F, false);

        leftArm = createPart(this, 40, 14, 4.0F, 21.0F, -3.0F);
        rotate(leftArm, -1.5708F, -0.4363F, 0.2182F);
        leftArm.addCuboid(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);

        leftClaw = createPart(this, 48, 14, 0.0F, 3.0F, 0.0F);
        leftArm.addChild(leftClaw);
        rotate(leftClaw, 0.0F, 0.0F, 0.7854F);
        leftClaw.addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 3.0F, 0.0F, true);

        rightFrontLeg = createPart(this, 24, 16, -4.5F, 21.0F, 0.0F);
        rotate(rightFrontLeg, -0.6981F, 0.0F, 1.3963F);
        rightFrontLeg.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, false);

        rightFrontLowerLeg = createPart(this, 29, 16, 0.0F, 3.5F, 0.0F);
        rightFrontLeg.addChild(rightFrontLowerLeg);
        rotate(rightFrontLowerLeg, 0.0F, 0.0F, -0.7854F);
        rightFrontLowerLeg.addCuboid(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightMiddleLeg = createPart(this, 24, 16, -4.5F, 21.0F, 1.0F);
        rotate(rightMiddleLeg, 0.1309F, 0.0F, 1.3963F);
        rightMiddleLeg.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, false);

        rightMiddleLowerLeg = createPart(this, 29, 16, 0.0F, 3.5F, 0.0F);
        rightMiddleLeg.addChild(rightMiddleLowerLeg);
        rotate(rightMiddleLowerLeg, 0.0F, 0.0F, -0.7854F);
        rightMiddleLowerLeg.addCuboid(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightBackLeg = createPart(this, 24, 16, -4.5F, 21.0F, 2.0F);
        rotate(rightBackLeg, 0.7854F, 0.0F, 1.3963F);
        rightBackLeg.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, false);

        rightBackLowerLeg = createPart(this, 29, 16, 0.0F, 3.5F, 0.0F);
        rightBackLeg.addChild(rightBackLowerLeg);
        rotate(rightBackLowerLeg, 0.0F, 0.0F, -0.7854F);
        rightBackLowerLeg.addCuboid(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftFrontLeg = createPart(this, 24, 16, 4.5F, 21.0F, 0.0F);
        rotate(leftFrontLeg, -0.6981F, 0.0F, -1.3963F);
        leftFrontLeg.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, true);

        leftFrontLowerLeg = createPart(this, 29, 16, 0.0F, 3.5F, 0.0F);
        leftFrontLeg.addChild(leftFrontLowerLeg);
        rotate(leftFrontLowerLeg, 0.0F, 0.0F, 0.7854F);
        leftFrontLowerLeg.addCuboid(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

        leftMiddleLeg = createPart(this, 24, 16, 4.5F, 21.0F, 1.0F);
        rotate(leftMiddleLeg, 0.1309F, 0.0F, -1.3963F);
        leftMiddleLeg.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, true);

        leftMiddleLowerLeg = createPart(this, 29, 16, 0.0F, 3.5F, 0.0F);
        leftMiddleLeg.addChild(leftMiddleLowerLeg);
        rotate(leftMiddleLowerLeg, 0.0F, 0.0F, 0.7854F);
        leftMiddleLowerLeg.addCuboid(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

        leftBackLeg = createPart(this, 24, 16, 4.5F, 21.0F, 2.0F);
        rotate(leftBackLeg, 0.7854F, 0.0F, -1.3963F);
        leftBackLeg.addCuboid(-0.5F, -0.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.25F, true);

        leftBackLowerLeg = createPart(this, 29, 16, 0.0F, 3.5F, 0.0F);
        leftBackLeg.addChild(leftBackLowerLeg);
        rotate(leftBackLowerLeg, 0.0F, 0.0F, 0.7854F);
        leftBackLowerLeg.addCuboid(0.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
    }

    @Override
    public Iterable<ModelPart> getParts() {
        return of(shell, body, rightArm, leftArm, rightFrontLeg, rightMiddleLeg, rightBackLeg, leftFrontLeg, leftMiddleLeg, leftBackLeg);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }
}
