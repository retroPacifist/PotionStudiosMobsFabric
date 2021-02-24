package io.github.retropacifist.mobsgalore.common;

import io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities;
import io.github.retropacifist.mobsgalore.common.items.MobsgaloreItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.LogManager.getLogger;

public class Mobsgalore implements ModInitializer {
    public static final String MOD_ID = "mobsgalore";

    public static final Logger LOGGER = getLogger("Mobsgalore");

    @Override
    public void onInitialize() {
        MobsgaloreEntities.initialize();
        MobsgaloreItems.initialize();

        FabricDefaultAttributeRegistry.register(MobsgaloreEntities.SCUTTLER, MobEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(MobsgaloreEntities.TEMPLE_GUARD, MobEntity.createMobAttributes());
    }

    // forge mapping for identifier is ResourceLocation
    public static Identifier createIdentifier(String path) {
        return new Identifier(MOD_ID, path);
    }
}
