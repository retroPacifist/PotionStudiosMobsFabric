package io.github.retropacifist.mobsgalore.client.rendering.entity.renderers;

import io.github.retropacifist.mobsgalore.client.rendering.entity.models.ScuttlerEntityModel;
import io.github.retropacifist.mobsgalore.common.entities.ScuttlerEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static io.github.retropacifist.mobsgalore.common.Mobsgalore.createIdentifier;

@Environment(EnvType.CLIENT)
public class ScuttlerEntityRenderer<T extends ScuttlerEntity> extends MobEntityRenderer<T, ScuttlerEntityModel<T>> {
    private static final Identifier TEXTURE = createIdentifier("textures/entities/scuttler.png");

    public ScuttlerEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new ScuttlerEntityModel<>(), 0.5F);
    }

    @Override
    public Identifier getTexture(T entity) {
        return TEXTURE;
    }
}
