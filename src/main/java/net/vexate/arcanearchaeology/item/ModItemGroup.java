package net.vexate.arcanearchaeology.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vexate.arcanearchaeology.ArcaneArchaeology;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> ARCANE_ARCHAEOLOGY_ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(ArcaneArchaeology.MOD_ID, "arcanearchaeology"));
    public static void registerTab() {
        Registry.register(Registries.ITEM_GROUP, ARCANE_ARCHAEOLOGY_ITEM_GROUP, FabricItemGroup.builder().displayName(Text.translatable("itemGroup." + ArcaneArchaeology.MOD_ID)).icon(() ->
                new ItemStack(ModItems.TOME_OF_INFERNAL_TRUTH)).entries((context, entries) -> {}).build());
    }
}
