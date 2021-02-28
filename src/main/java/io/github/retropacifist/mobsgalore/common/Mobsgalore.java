package io.github.retropacifist.mobsgalore.common;

import io.github.retropacifist.mobsgalore.common.entities.MobsgaloreEntities;
import io.github.retropacifist.mobsgalore.common.items.MobsgaloreItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder.build;
import static net.minecraft.block.Blocks.COBBLESTONE;

public class Mobsgalore implements ModInitializer {
    public static final String MOD_ID = "mobsgalore";

    public static final ItemGroup GENERAL = build(createIdentifier("general"), () -> new ItemStack(COBBLESTONE));

    @Override
    public void onInitialize() {
        MobsgaloreEntities.initialize();
        MobsgaloreItems.initialize();
    }

    // mcp mapping for Identifier is ResourceLocation
    public static Identifier createIdentifier(String path) {
        return new Identifier(MOD_ID, path);
    }
}
