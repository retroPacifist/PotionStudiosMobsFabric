package io.github.retropacifist.mobsgalore.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.registry.Registry;

import static io.github.retropacifist.mobsgalore.common.Mobsgalore.GENERAL;
import static io.github.retropacifist.mobsgalore.common.Mobsgalore.createIdentifier;
import static io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities.BOAR;
import static io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities.JOCKEY;

public class MobsgaloreItems {
    public static Item JOCKEY_SPAWN_EGG;
    public static Item BOAR_SPAWN_EGG;

    private MobsgaloreItems() {
    }

    public static void initialize() {
        JOCKEY_SPAWN_EGG = register("jockey_spawn_egg", new SpawnEggItem(JOCKEY, 0xDBA5FF, 0x9C87C1, createSettings()));
        BOAR_SPAWN_EGG = register("boar_spawn_egg", new SpawnEggItem(BOAR, 0x705F44, 0x3F3A3F, createSettings()));
    }

    private static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, createIdentifier(name), item);
    }

    private static Item.Settings createSettings() {
        return new Item.Settings().group(GENERAL);
    }
}
