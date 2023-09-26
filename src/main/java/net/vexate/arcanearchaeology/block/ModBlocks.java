package net.vexate.arcanearchaeology.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.WoodType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.vexate.arcanearchaeology.ArcaneArchaeology;
import net.vexate.arcanearchaeology.block.custom.SuspiciousBlock;
import net.vexate.arcanearchaeology.item.ModItemGroup;

public class ModBlocks {
    // ITEM ENTRIES
    public static final Block SUSPICIOUS_RED_SAND = registerBlock("suspicious_red_sand", new SuspiciousBlock(Blocks.RED_SAND, FabricBlockSettings.copy(Blocks.SUSPICIOUS_SAND),
            SoundEvents.ITEM_BRUSH_BRUSHING_SAND, SoundEvents.ITEM_BRUSH_BRUSHING_SAND_COMPLETE), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);

    public static final Block SUSPICIOUS_DIRT = registerBlock("suspicious_dirt", new SuspiciousBlock(Blocks.DIRT, FabricBlockSettings.copy(Blocks.SUSPICIOUS_GRAVEL),
            SoundEvents.ITEM_BRUSH_BRUSHING_GRAVEL, SoundEvents.ITEM_BRUSH_BRUSHING_GRAVEL_COMPLETE), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);

    public static final Block SUSPICIOUS_CLAY = registerBlock("suspicious_clay", new SuspiciousBlock(Blocks.CLAY, FabricBlockSettings.copy(Blocks.SUSPICIOUS_GRAVEL),
            SoundEvents.ITEM_BRUSH_BRUSHING_SAND, SoundEvents.ITEM_BRUSH_BRUSHING_SAND_COMPLETE), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);

    public static final Block SUSPICIOUS_MUD = registerBlock("suspicious_mud", new SuspiciousBlock(Blocks.MUD, FabricBlockSettings.copy(Blocks.SUSPICIOUS_GRAVEL),
            SoundEvents.ITEM_BRUSH_BRUSHING_GRAVEL, SoundEvents.ITEM_BRUSH_BRUSHING_GRAVEL_COMPLETE), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);

    // REGISTERING BLOCKS
    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItemToGroup(name, block, group, Rarity.COMMON);
        return Registry.register(Registries.BLOCK, new Identifier(ArcaneArchaeology.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutTab(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItemToGroup(name, block, group, Rarity.COMMON);
        return Registry.register(Registries.BLOCK, new Identifier(ArcaneArchaeology.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutRarity(String name, Block block, RegistryKey<ItemGroup> group, Rarity rarity) {
        registerBlockItemToGroup(name, block, group, rarity);
        return Registry.register(Registries.BLOCK, new Identifier(ArcaneArchaeology.MOD_ID, name), block);
    }

    // REGISTERING ITEMS
    private  static Item registerBlockItemToGroup(String name, Block block, RegistryKey<ItemGroup> group, Rarity rarity) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ArcaneArchaeology.MOD_ID, name), new BlockItem(block, new FabricItemSettings().rarity(rarity)));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    private  static Item registerBlockItem(String name, Block block, Rarity rarity) {
        return Registry.register(Registries.ITEM, new Identifier(ArcaneArchaeology.MOD_ID, name), new BlockItem(block, new FabricItemSettings().rarity(rarity)));
    }
    private  static WoodType registerWoodType(String id) {
        return WoodTypeRegistry.register(new Identifier(ArcaneArchaeology.MOD_ID, id), new BlockSetType(id));
    }
    private  static BlockSetType registerBlockSetType(String id) {
        return BlockSetTypeRegistry.registerWood(new Identifier(ArcaneArchaeology.MOD_ID, id));
    }

    // LOGGER
    public static void registerModBlocks() {
        ArcaneArchaeology.LOGGER.info("Registering Blocks from " + ArcaneArchaeology.MOD_ID);
    }
}