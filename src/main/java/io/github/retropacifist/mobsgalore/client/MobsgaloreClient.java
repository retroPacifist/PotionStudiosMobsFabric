package io.github.retropacifist.mobsgalore.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// forge equivalent  is @OnlyIn(Dist.CLIENT)
@Environment(EnvType.CLIENT)
public class MobsgaloreClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

    }
}
