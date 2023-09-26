package net.vexate.arcanearchaeology.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.vexate.arcanearchaeology.item.ModItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModLootTableModifiers {
    private static final Identifier SHIPWRECK_TREASURE_ID = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier BURIED_TREASURE_ID = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID_ID = new Identifier("minecraft", "chests/desert_pyramid");

    private static final Identifier DESERT_WELL_SUS_SAND_ID = new Identifier("minecraft", "archaeology/desert_well");
    private static final Identifier TRAIL_RUINS_SUS_GRAVEL_RARE_ID = new Identifier("minecraft", "archaeology/trail_ruins_rare");

    public static void  modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 15% of the time
                        .with(ItemEntry.builder(ModItems.BURIED_SCROLL))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); // Drops 1-1 of the item
                tableBuilder.pool(poolBuilder.build());
            }
            if(SHIPWRECK_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(ModItems.AZURE_CRYSTAL_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build()); // Drops 1-2 of the item
                tableBuilder.pool(poolBuilder.build());
            }
            if(DESERT_PYRAMID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.AZURE_UPGRADE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); // Drops 1-1 of the item
                tableBuilder.pool(poolBuilder.build());
            }
        });
        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
            if(DESERT_WELL_SUS_SAND_ID.equals(id)) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModItems.AZURE_CRYSTAL_SHARD).build());

                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();
            }
            if(TRAIL_RUINS_SUS_GRAVEL_RARE_ID.equals(id)) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModItems.AZURE_PRISM).build());

                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();
            }
            return null;
        });
    }
}
