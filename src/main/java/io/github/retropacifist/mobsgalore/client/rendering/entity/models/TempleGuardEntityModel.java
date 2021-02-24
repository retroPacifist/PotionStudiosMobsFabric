package io.github.retropacifist.mobsgalore.client.rendering.entity.models;

import io.github.retropacifist.mobsgalore.common.entities.TempleGuardEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CompositeEntityModel;

import static com.google.common.collect.ImmutableList.of;

public class TempleGuardEntityModel<T extends TempleGuardEntity> extends CompositeEntityModel<T> implements WrappedModel {
    private final ModelPart Main;
    private final ModelPart BackRight;
    private final ModelPart cube_r16;
    private final ModelPart LowerBR;
    private final ModelPart cube_r20;
    private final ModelPart FootBR;
    private final ModelPart cube_r17;
    private final ModelPart cube_r19;
    private final ModelPart cube_r18;
    private final ModelPart BackLeft;
    private final ModelPart cube_r11;
    private final ModelPart LowerBL;
    private final ModelPart cube_r15;
    private final ModelPart FootBL;
    private final ModelPart cube_r14;
    private final ModelPart cube_r13;
    private final ModelPart cube_r12;
    private final ModelPart FrontRight;
    private final ModelPart cube_r6;
    private final ModelPart LowerFR;
    private final ModelPart cube_r10;
    private final ModelPart FootFR;
    private final ModelPart cube_r8;
    private final ModelPart cube_r9;
    private final ModelPart cube_r7;
    private final ModelPart FrontLeft;
    private final ModelPart cube_r1;
    private final ModelPart LowerFL;
    private final ModelPart cube_r5;
    private final ModelPart FootFL;
    private final ModelPart cube_r4;
    private final ModelPart cube_r3;
    private final ModelPart cube_r2;
    private final ModelPart Torso;
    private final ModelPart FLESH;
    private final ModelPart LeftArm;
    private final ModelPart RightArm;
    private final ModelPart ClothF;
    private final ModelPart ClothB;

    public TempleGuardEntityModel() {
        textureWidth = 120;
        textureHeight = 120;

        Main = new ModelPart(this);
        Main.setPivot(0.0F, 24.0F, 0.0F);

        BackRight = new ModelPart(this);
        BackRight.setPivot(-5.0F, -14.0F, 2.0F);
        Main.addChild(BackRight);

        cube_r16 = new ModelPart(this);
        cube_r16.setPivot(0.0F, 0.0F, 0.0F);
        BackRight.addChild(cube_r16);
        rotate(cube_r16, -0.3927F, 0.7854F, -0.5236F);
        cube_r16.setTextureOffset(0, 55).addCuboid(-5.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, true);
        cube_r16.setTextureOffset(18, 55).addCuboid(-10.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, true);

        LowerBR = new ModelPart(this);
        LowerBR.setPivot(-6.5F, 3.5F, 8.0F);
        BackRight.addChild(LowerBR);


        cube_r20 = new ModelPart(this);
        cube_r20.setPivot(0.0F, 0.0F, 0.0F);
        LowerBR.addChild(cube_r20);
        rotate(cube_r20, 0.3054F, -0.6981F, 0.0F);
        cube_r20.setTextureOffset(38, 54).addCuboid(-2.8F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, true);

        FootBR = new ModelPart(this);
        FootBR.setPivot(-2.0F, 9.0F, 2.0F);
        LowerBR.addChild(FootBR);


        cube_r17 = new ModelPart(this);
        cube_r17.setPivot(-4.8F, -1.5F, 5.0F);
        FootBR.addChild(cube_r17);
        rotate(cube_r17, 0.0F, -0.6981F, 0.0F);
        cube_r17.setTextureOffset(53, 56).addCuboid(-0.1F, -1.0F, -1.25F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r19 = new ModelPart(this);
        cube_r19.setPivot(2.0F, 1.5F, -2.0F);
        FootBR.addChild(cube_r19);
        rotate(cube_r19, 0.0F, -0.6981F, 0.0F);
        cube_r19.setTextureOffset(58, 54).addCuboid(-2.3F, -2.0F, 2.5F, 4.0F, 2.0F, 5.0F, 0.0F, true);

        cube_r18 = new ModelPart(this);
        cube_r18.setPivot(2.0F, 1.5F, 5.0F);
        FootBR.addChild(cube_r18);
        rotate(cube_r18, 0.5236F, -0.6981F, 0.0F);
        cube_r18.setTextureOffset(58, 61).addCuboid(-5.8F, -1.0F, 1.5F, 2.0F, 2.0F, 3.0F, 0.0F, true);

        BackLeft = new ModelPart(this);
        BackLeft.setPivot(5.0F, -14.0F, 2.0F);
        Main.addChild(BackLeft);


        cube_r11 = new ModelPart(this);
        cube_r11.setPivot(0.0F, 0.0F, 0.0F);
        BackLeft.addChild(cube_r11);
        rotate(cube_r11, -0.3927F, -0.7854F, 0.5236F);
        cube_r11.setTextureOffset(0, 55).addCuboid(0.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r11.setTextureOffset(18, 55).addCuboid(5.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

        LowerBL = new ModelPart(this);
        LowerBL.setPivot(6.5F, 3.5F, 8.0F);
        BackLeft.addChild(LowerBL);


        cube_r15 = new ModelPart(this);
        cube_r15.setPivot(0.0F, 0.0F, 0.0F);
        LowerBL.addChild(cube_r15);
        rotate(cube_r15, 0.3054F, 0.6981F, 0.0F);
        cube_r15.setTextureOffset(38, 54).addCuboid(-2.2F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);

        FootBL = new ModelPart(this);
        FootBL.setPivot(2.0F, 9.0F, 2.0F);
        LowerBL.addChild(FootBL);


        cube_r14 = new ModelPart(this);
        cube_r14.setPivot(-2.0F, 1.5F, -2.0F);
        FootBL.addChild(cube_r14);
        rotate(cube_r14, 0.0F, 0.6981F, 0.0F);
        cube_r14.setTextureOffset(58, 54).addCuboid(-1.7F, -2.0F, 2.5F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r13 = new ModelPart(this);
        cube_r13.setPivot(-2.0F, 1.5F, 5.0F);
        FootBL.addChild(cube_r13);
        rotate(cube_r13, 0.5236F, 0.6981F, 0.0F);
        cube_r13.setTextureOffset(58, 61).addCuboid(3.8F, -1.0F, 1.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r12 = new ModelPart(this);
        cube_r12.setPivot(4.8F, -1.5F, 5.0F);
        FootBL.addChild(cube_r12);
        rotate(cube_r12, 0.0F, 0.6981F, 0.0F);
        cube_r12.setTextureOffset(53, 56).addCuboid(-0.9F, -1.0F, -1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        FrontRight = new ModelPart(this);
        FrontRight.setPivot(-5.0F, -14.0F, -2.0F);
        Main.addChild(FrontRight);


        cube_r6 = new ModelPart(this);
        cube_r6.setPivot(0.0F, 0.0F, 0.0F);
        FrontRight.addChild(cube_r6);
        rotate(cube_r6, 0.3927F, -0.7854F, -0.5236F);
        cube_r6.setTextureOffset(0, 40).addCuboid(-5.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, true);
        cube_r6.setTextureOffset(18, 40).addCuboid(-10.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, true);

        LowerFR = new ModelPart(this);
        LowerFR.setPivot(-6.5F, 3.5F, -8.0F);
        FrontRight.addChild(LowerFR);


        cube_r10 = new ModelPart(this);
        cube_r10.setPivot(0.0F, 0.0F, 0.0F);
        LowerFR.addChild(cube_r10);
        rotate(cube_r10, -0.3054F, 0.6981F, 0.0F);
        cube_r10.setTextureOffset(38, 39).addCuboid(-2.8F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, true);

        FootFR = new ModelPart(this);
        FootFR.setPivot(-2.0F, 9.0F, -2.0F);
        LowerFR.addChild(FootFR);


        cube_r8 = new ModelPart(this);
        cube_r8.setPivot(2.0F, 1.5F, -5.0F);
        FootFR.addChild(cube_r8);
        rotate(cube_r8, -0.5236F, 0.6981F, 0.0F);
        cube_r8.setTextureOffset(58, 46).addCuboid(-5.8F, -1.0F, -4.5F, 2.0F, 2.0F, 3.0F, 0.0F, true);

        cube_r9 = new ModelPart(this);
        cube_r9.setPivot(2.0F, 1.5F, 2.0F);
        FootFR.addChild(cube_r9);
        rotate(cube_r9, 0.0F, 0.6981F, 0.0F);
        cube_r9.setTextureOffset(58, 39).addCuboid(-2.3F, -2.0F, -7.5F, 4.0F, 2.0F, 5.0F, 0.0F, true);

        cube_r7 = new ModelPart(this);
        cube_r7.setPivot(-4.8F, -1.5F, -5.0F);
        FootFR.addChild(cube_r7);
        rotate(cube_r7, 0.0F, 0.6981F, 0.0F);
        cube_r7.setTextureOffset(53, 41).addCuboid(-0.1F, -1.0F, 0.25F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        FrontLeft = new ModelPart(this);
        FrontLeft.setPivot(5.0F, -14.0F, -2.0F);
        Main.addChild(FrontLeft);


        cube_r1 = new ModelPart(this);
        cube_r1.setPivot(0.0F, 0.0F, 0.0F);
        FrontLeft.addChild(cube_r1);
        rotate(cube_r1, 0.3927F, 0.7854F, 0.5236F);
        cube_r1.setTextureOffset(0, 40).addCuboid(0.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r1.setTextureOffset(18, 40).addCuboid(5.0F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

        LowerFL = new ModelPart(this);
        LowerFL.setPivot(6.5F, 3.5F, -8.0F);
        FrontLeft.addChild(LowerFL);


        cube_r5 = new ModelPart(this);
        cube_r5.setPivot(0.0F, 0.0F, 0.0F);
        LowerFL.addChild(cube_r5);
        rotate(cube_r5, -0.3054F, -0.6981F, 0.0F);
        cube_r5.setTextureOffset(38, 39).addCuboid(-2.2F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);

        FootFL = new ModelPart(this);
        FootFL.setPivot(2.0F, 9.0F, -2.0F);
        LowerFL.addChild(FootFL);


        cube_r4 = new ModelPart(this);
        cube_r4.setPivot(-2.0F, 1.5F, 2.0F);
        FootFL.addChild(cube_r4);
        rotate(cube_r4, 0.0F, -0.6981F, 0.0F);
        cube_r4.setTextureOffset(58, 39).addCuboid(-1.7F, -2.0F, -7.5F, 4.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r3 = new ModelPart(this);
        cube_r3.setPivot(-2.0F, 1.5F, -5.0F);
        FootFL.addChild(cube_r3);
        rotate(cube_r3, -0.5236F, -0.6981F, 0.0F);
        cube_r3.setTextureOffset(58, 46).addCuboid(3.8F, -1.0F, -4.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r2 = new ModelPart(this);
        cube_r2.setPivot(4.8F, -1.5F, -5.0F);
        FootFL.addChild(cube_r2);
        rotate(cube_r2, 0.0F, -0.6981F, 0.0F);
        cube_r2.setTextureOffset(53, 41).addCuboid(-0.9F, -1.0F, 0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        Torso = new ModelPart(this);
        Torso.setPivot(-1.0F, -11.0F, -5.0F);
        Main.addChild(Torso);
        Torso.setTextureOffset(56, 0).addCuboid(-6.5F, -6.0F, 0.0F, 15.0F, 2.0F, 10.0F, 0.0F, false);
        Torso.setTextureOffset(20, 0).addCuboid(-6.5F, -5.9F, 0.0F, 15.0F, 0.0F, 10.0F, 0.0F, false);

        FLESH = new ModelPart(this);
        FLESH.setPivot(1.0F, -2.0F, 5.0F);
        Torso.addChild(FLESH);
        FLESH.setTextureOffset(0, 22).addCuboid(-6.5F, -10.0F, -4.0F, 13.0F, 10.0F, 8.0F, 0.0F, false);
        FLESH.setTextureOffset(0, 0).addCuboid(-9.0F, -22.0F, -5.0F, 18.0F, 12.0F, 10.0F, 0.0F, false);

        LeftArm = new ModelPart(this);
        LeftArm.setPivot(9.0F, -20.0F, 1.0F);
        FLESH.addChild(LeftArm);
        LeftArm.setTextureOffset(34, 26).addCuboid(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        LeftArm.setTextureOffset(34, 22).addCuboid(7.0F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        LeftArm.setTextureOffset(34, 24).addCuboid(5.5F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        LeftArm.setTextureOffset(38, 22).addCuboid(8.0F, -3.5F, -6.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        LeftArm.setTextureOffset(37, 23).addCuboid(8.0F, -2.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        LeftArm.setTextureOffset(42, 24).addCuboid(2.0F, -2.0F, -6.0F, 5.0F, 5.0F, 10.0F, 0.0F, false);
        LeftArm.setTextureOffset(62, 28).addCuboid(5.0F, -5.0F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        LeftArm.setTextureOffset(65, 17).addCuboid(8.0F, -1.5F, -6.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);

        RightArm = new ModelPart(this);
        RightArm.setPivot(-9.0F, -20.0F, 1.0F);
        FLESH.addChild(RightArm);
        RightArm.setTextureOffset(34, 26).addCuboid(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
        RightArm.setTextureOffset(34, 22).addCuboid(-8.0F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        RightArm.setTextureOffset(34, 24).addCuboid(-6.5F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        RightArm.setTextureOffset(38, 22).addCuboid(-9.0F, -3.5F, -6.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
        RightArm.setTextureOffset(37, 23).addCuboid(-9.0F, -2.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        RightArm.setTextureOffset(42, 24).addCuboid(-7.0F, -2.0F, -6.0F, 5.0F, 5.0F, 10.0F, 0.0F, true);
        RightArm.setTextureOffset(62, 28).addCuboid(-7.0F, -5.0F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, true);
        RightArm.setTextureOffset(65, 17).addCuboid(-11.0F, -1.5F, -6.0F, 3.0F, 3.0F, 7.0F, 0.0F, true);

        ClothF = new ModelPart(this);
        ClothF.setPivot(1.0F, -5.0F, 0.5F);
        Torso.addChild(ClothF);
        ClothF.setTextureOffset(56, 12).addCuboid(-4.0F, 0.0F, 0.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);

        ClothB = new ModelPart(this);
        ClothB.setPivot(1.0F, -5.0F, 9.5F);
        Torso.addChild(ClothB);
        ClothB.setTextureOffset(56, 12).addCuboid(-4.0F, 0.0F, 0.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);
    }

    @Override
    public Iterable<ModelPart> getParts() {
        return of(Main);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }
}
