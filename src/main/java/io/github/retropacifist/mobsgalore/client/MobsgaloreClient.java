package io.github.retropacifist.mobsgalore.client;

import io.github.retropacifist.mobsgalore.client.rendering.entity.renderers.BoarEntityRenderer;
import io.github.retropacifist.mobsgalore.client.rendering.entity.renderers.JockeyEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

import static io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities.BOAR;
import static io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities.JOCKEY;

// forge equivalent  is @OnlyIn(Dist.CLIENT)
@Environment(EnvType.CLIENT)
public class MobsgaloreClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry renderers = EntityRendererRegistry.INSTANCE;

        renderers.register(JOCKEY, (dispatcher, context) -> new JockeyEntityRenderer<>(dispatcher));
        renderers.register(BOAR, (dispatcher, context) -> new BoarEntityRenderer<>(dispatcher));
    }
}
