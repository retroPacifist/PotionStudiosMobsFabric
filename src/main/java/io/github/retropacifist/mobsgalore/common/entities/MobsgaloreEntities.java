package io.github.retropacifist.mobsgalore.common.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;

import static io.github.retropacifist.mobsgalore.common.Mobsgalore.createIdentifier;
import static net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder.create;
import static net.minecraft.entity.EntityDimensions.fixed;
import static net.minecraft.entity.SpawnGroup.MONSTER;

public class MobsgaloreEntities {
    public static EntityType<ScuttlerEntity> SCUTTLER;
    public static EntityType<TempleGuardEntity> TEMPLE_GUARD;

    private MobsgaloreEntities() {
    }

    public static void initialize() {
        SCUTTLER = register("scuttler", create(MONSTER, ScuttlerEntity::new).dimensions(fixed(1.0F, 1.0F)).build());
        TEMPLE_GUARD = register("temple_guard", create(MONSTER, TempleGuardEntity::new).dimensions(fixed(1.0F, 1.0F)).build());
    }

    private static <T extends Entity> EntityType<T> register(String name, EntityType<T> type) {
        return Registry.register(Registry.ENTITY_TYPE, createIdentifier(name), type);
    }
}
