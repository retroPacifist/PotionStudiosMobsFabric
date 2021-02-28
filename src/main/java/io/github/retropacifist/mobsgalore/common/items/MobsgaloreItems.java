package io.github.retropacifist.mobsgalore.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.registry.Registry;

import static io.github.retropacifist.mobsgalore.common.Mobsgalore.GENERAL;
import static io.github.retropacifist.mobsgalore.common.Mobsgalore.createIdentifier;
import static io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities.BOAR;

public class MobsgaloreItems {
    public static Item BOAR_SPAWN_EGG;

    private MobsgaloreItems() {
    }

    public static void initialize() {
        BOAR_SPAWN_EGG = register("boar_spawn_egg", new SpawnEggItem(BOAR, 0x705F44, 0x3F3A3F, createSettings()));
    }

    private static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, createIdentifier(name), item);
    }

    private static Item.Settings createSettings() {
        return new Item.Settings().group(GENERAL);
    }
}
