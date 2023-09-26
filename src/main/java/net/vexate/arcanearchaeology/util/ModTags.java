package net.vexate.arcanearchaeology.util;

import net.vexate.arcanearchaeology.ArcaneArchaeology;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(ArcaneArchaeology.MOD_ID, name));
        }
    }
}
