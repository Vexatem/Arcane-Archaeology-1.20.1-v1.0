package net.vexate.arcanearchaeology.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BrushableBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.vexate.arcanearchaeology.block.entity.SuspiciousBlockEntity;
import org.jetbrains.annotations.Nullable;

public class SuspiciousBlock extends BrushableBlock {
    public SuspiciousBlock(Block baseBlock, Settings settings, SoundEvent brushingSound, SoundEvent brushingCompleteSound) {
        super(baseBlock, settings, brushingSound, brushingCompleteSound);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SuspiciousBlockEntity(pos, state);
    }
}
