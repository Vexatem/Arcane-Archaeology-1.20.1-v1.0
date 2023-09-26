package net.vexate.arcanearchaeology.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vexate.arcanearchaeology.ArcaneArchaeology;
import net.vexate.arcanearchaeology.block.ModBlocks;
import net.vexate.arcanearchaeology.block.entity.SuspiciousBlockEntity;

public class ModBlockEntities {
    public static BlockEntityType<SuspiciousBlockEntity> SUSPICIOUSBLOCK;

    public static void registerBlockEntities() {
        SUSPICIOUSBLOCK = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(ArcaneArchaeology.MOD_ID, "suspicious_block"),
                FabricBlockEntityTypeBuilder.create(SuspiciousBlockEntity::new,
                        ModBlocks.SUSPICIOUS_DIRT, ModBlocks.SUSPICIOUS_RED_SAND).build(null));
    }
}
