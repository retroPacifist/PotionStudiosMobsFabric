package io.github.retropacifist.mobsgalore.client.rendering.entity.renderers;

import io.github.retropacifist.mobsgalore.client.rendering.entity.models.JockeyEntityModel;
import io.github.retropacifist.mobsgalore.common.entities.passive.JockeyEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static io.github.retropacifist.mobsgalore.common.Mobsgalore.createIdentifier;

public class JockeyEntityRenderer<T extends JockeyEntity> extends MobEntityRenderer<T, JockeyEntityModel<T>> {
    private static final Identifier TEXTURE = createIdentifier("textures/entities/jockey.png");

    public JockeyEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new JockeyEntityModel<>(), 0.2F);
    }

    @Override
    public Identifier getTexture(T entity) {
        return TEXTURE;
    }
}
