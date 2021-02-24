package io.github.retropacifist.mobsgalore.client.rendering.entity.renderers;

import io.github.retropacifist.mobsgalore.client.rendering.entity.models.TempleGuardEntityModel;
import io.github.retropacifist.mobsgalore.common.entities.TempleGuardEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static io.github.retropacifist.mobsgalore.common.Mobsgalore.createIdentifier;

public class TempleGuardEntityRenderer<T extends TempleGuardEntity> extends MobEntityRenderer<T, TempleGuardEntityModel<T>> {
    private static final Identifier TEXTURE = createIdentifier("textures/entities/temple_guard.png");

    public TempleGuardEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new TempleGuardEntityModel<>(), 0.5F);
    }

    @Override
    public Identifier getTexture(T entity) {
        return TEXTURE;
    }
}
