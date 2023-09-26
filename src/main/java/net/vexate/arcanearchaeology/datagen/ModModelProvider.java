package net.vexate.arcanearchaeology.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.vexate.arcanearchaeology.block.ModBlocks;
import net.vexate.arcanearchaeology.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerBrushableBlock(ModBlocks.SUSPICIOUS_CLAY);
        blockStateModelGenerator.registerBrushableBlock(ModBlocks.SUSPICIOUS_DIRT);
        blockStateModelGenerator.registerBrushableBlock(ModBlocks.SUSPICIOUS_RED_SAND);
        blockStateModelGenerator.registerBrushableBlock(ModBlocks.SUSPICIOUS_MUD);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BURIED_SCROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RESONANT_ENIGMA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOME_OF_INFERNAL_TRUTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNIDENTIFIED_ARTIFACT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AZURE_UPGRADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AZURE_CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.AZURE_PRISM, Models.GENERATED);

        itemModelGenerator.register(ModItems.AZURE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_BRUSH, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ECHO_BRUSH, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AZURE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AZURE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AZURE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AZURE_BOOTS));

    }
}