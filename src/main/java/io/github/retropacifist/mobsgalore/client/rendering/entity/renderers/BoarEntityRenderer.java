package io.github.retropacifist.mobsgalore.client.rendering.entity.renderers;

import io.github.retropacifist.mobsgalore.client.rendering.entity.models.BoarEntityModel;
import io.github.retropacifist.mobsgalore.common.entities.passive.MountEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static io.github.retropacifist.mobsgalore.common.Mobsgalore.createIdentifier;

@Environment(EnvType.CLIENT)
public class BoarEntityRenderer<T extends MountEntity> extends MobEntityRenderer<T, BoarEntityModel<T>> {
    private static final Identifier ANGRY_TEXTURE = createIdentifier("textures/entities/boar/boar_angry.png"), TEXTURE = createIdentifier("textures/entities/boar/boar.png");

    public BoarEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new BoarEntityModel<>(), 0.6F);
    }

    @Override
    public Identifier getTexture(T entity) {
        return entity.isAngry() ? ANGRY_TEXTURE : TEXTURE;
    }
}
