package io.github.retropacifist.mobsgalore.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.registry.Registry;

import static io.github.retropacifist.mobsgalore.common.Mobsgalore.createIdentifier;
import static io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities.SCUTTLER;
import static io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities.TEMPLE_GUARD;
import static net.minecraft.item.ItemGroup.BUILDING_BLOCKS;

public class MobsgaloreItems {
    public static Item SCUTTLER_SPAWN_EGG;
    public static Item TEMPLE_GUARD_SPAWN_EGG;

    private MobsgaloreItems() {
    }

    public static void initialize() {
        SCUTTLER_SPAWN_EGG = register("scuttler_spawn_egg", new SpawnEggItem(SCUTTLER, 0, 0, createSettings()));
        TEMPLE_GUARD_SPAWN_EGG = register("temple_guard_spawn_egg", new SpawnEggItem(TEMPLE_GUARD, 0, 0, createSettings()));
    }

    private static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, createIdentifier(name), item);
    }

    private static Item.Settings createSettings() {
        return new Item.Settings().group(BUILDING_BLOCKS);
    }
}
