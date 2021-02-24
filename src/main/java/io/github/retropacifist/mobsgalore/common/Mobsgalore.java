package io.github.retropacifist.mobsgalore.common;

import io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities;
import io.github.retropacifist.mobsgalore.common.items.MobsgaloreItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mobsgalore implements ModInitializer {
    public static final String MOD_ID = "mobsgalore";

    @Override
    public void onInitialize() {
        // registering on worker threads
        ExecutorService service = Executors.newCachedThreadPool();

        try {
            service.submit(new MobsgaloreEntities());
            service.submit(new MobsgaloreItems());
        } finally {
            service.shutdown();
        }
    }

    // forge mapping for identifier is ResourceLocation
    public static Identifier createIdentifier(String path) {
        return new Identifier(MOD_ID, path);
    }
}
