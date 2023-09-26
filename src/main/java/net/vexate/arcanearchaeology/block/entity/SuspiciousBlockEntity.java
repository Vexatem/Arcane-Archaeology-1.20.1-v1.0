package net.vexate.arcanearchaeology.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.BrushableBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.vexate.arcanearchaeology.block.custom.ModBlockEntities;

public class SuspiciousBlockEntity extends BrushableBlockEntity {
    public SuspiciousBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }
    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.SUSPICIOUSBLOCK;
    }
}
