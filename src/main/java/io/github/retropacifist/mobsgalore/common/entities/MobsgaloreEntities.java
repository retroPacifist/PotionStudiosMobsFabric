package io.github.retropacifist.mobsgalore.common.entities;

import io.github.retropacifist.mobsgalore.common.entities.passive.JockeyEntity;
import io.github.retropacifist.mobsgalore.common.entities.passive.MountEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;

import static io.github.retropacifist.mobsgalore.common.Mobsgalore.createIdentifier;
import static net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder.create;
import static net.minecraft.entity.EntityDimensions.fixed;
import static net.minecraft.entity.SpawnGroup.MISC;

public class MobsgaloreEntities {
    public static EntityType<JockeyEntity> JOCKEY;
    public static EntityType<MountEntity> BOAR;

    private MobsgaloreEntities() {
    }

    public static void initialize() {
        JOCKEY = register("jockey", create(MISC, JockeyEntity::new).dimensions(fixed(1.0F, 1.0F)).build());
        BOAR = register("boar", create(MISC, MountEntity::new).dimensions(fixed(1.0F, 1.0F)).build());

        FabricDefaultAttributeRegistry.register(JOCKEY, JockeyEntity.createJockeyAttributes());
        FabricDefaultAttributeRegistry.register(BOAR, MountEntity.createBoarAttributes());
    }

    private static <T extends Entity> EntityType<T> register(String name, EntityType<T> type) {
        return Registry.register(Registry.ENTITY_TYPE, createIdentifier(name), type);
    }
}
