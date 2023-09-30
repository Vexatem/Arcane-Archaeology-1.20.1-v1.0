package net.vexate.arcanearchaeology.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.vexate.arcanearchaeology.ArcaneArchaeology;
import net.vexate.arcanearchaeology.item.custom.BetterBrushItem;
import net.vexate.arcanearchaeology.item.custom.ModSmithingTemplateItem;
import net.vexate.arcanearchaeology.material.ModArmorMaterial;
import net.vexate.arcanearchaeology.material.ModToolMaterial;

import static net.vexate.arcanearchaeology.item.custom.ModSmithingTemplateItem.*;

public class ModItems {

    // ITEM ENTRIES
    public static final Item AMETHYST_BRUSH = registerItem("amethyst_brush", (Item) (new BetterBrushItem((new Item.Settings()).maxDamage(96), 8)), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item ECHO_BRUSH = registerItem("echo_brush", (Item) (new BetterBrushItem((new Item.Settings()).maxDamage(128), 6)), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_BRUSH = registerItem("azure_brush", (Item) (new BetterBrushItem((new Item.Settings()).maxDamage(256), 3)), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);

    public static final Item AZURE_SWORD = registerItem("azure_sword", new SwordItem(ModToolMaterial.AZURE, 5, 1.8f, new FabricItemSettings()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_PICKAXE = registerItem("azure_pickaxe", new PickaxeItem(ModToolMaterial.AZURE, 3, 1.4f, new FabricItemSettings()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_AXE = registerItem("azure_axe", new AxeItem(ModToolMaterial.AZURE, 7, 1.1f, new FabricItemSettings()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_SHOVEL = registerItem("azure_shovel", new ShovelItem(ModToolMaterial.AZURE, 3, 1.4f, new FabricItemSettings()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_HOE = registerItem("azure_hoe", new HoeItem(ModToolMaterial.AZURE, 1, 1.2f, new FabricItemSettings()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);

    public static final Item AZURE_HELMET = registerItem("azure_helmet", new ArmorItem(ModArmorMaterial.AZURE, ArmorItem.Type.HELMET, new FabricItemSettings()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_CHESTPLATE = registerItem("azure_chestplate", new ArmorItem(ModArmorMaterial.AZURE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_LEGGINGS = registerItem("azure_leggings", new ArmorItem(ModArmorMaterial.AZURE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_BOOTS = registerItem("azure_boots", new ArmorItem(ModArmorMaterial.AZURE, ArmorItem.Type.BOOTS, new FabricItemSettings()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);

    public static final Item UNIDENTIFIED_ARTIFACT = registerItem("unidentified_artifact", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_CRYSTAL_SHARD = registerItem("azure_crystal_shard", new Item(new FabricItemSettings().rarity(Rarity.COMMON)), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item AZURE_PRISM = registerItem("azure_prism", new Item(new FabricItemSettings().rarity(Rarity.RARE)), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item BURIED_SCROLL = registerItem("buried_scroll", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item RESONANT_ENIGMA = registerItem("resonant_enigma", new Item(new FabricItemSettings().rarity(Rarity.EPIC)), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);
    public static final Item TOME_OF_INFERNAL_TRUTH = registerItem("tome_of_infernal_truth", new Item(new FabricItemSettings().rarity(Rarity.EPIC)), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);

    public static final Item AZURE_UPGRADE = registerItem("azure_upgrade_smithing_template", new ModSmithingTemplateItem(
            AZURE_UPGRADE_APPLIES_TO_TEXT, AZURE_UPGRADE_INGREDIENTS_TEXT, AZURE_UPGRADE_TEXT, AZURE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, AZURE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
            ModSmithingTemplateItem.getAzureUpgradeEmptyBaseSlotTextures(), ModSmithingTemplateItem.getAzureUpgradeEmptyAdditionsSlotTextures()), ModItemGroup.ARCANE_ARCHAEOLOGY_ITEM_GROUP);

    // REGISTERING ITEMS
    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup> group) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(ArcaneArchaeology.MOD_ID, name), item);

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(registeredItem));
        return registeredItem;
    }

    // LOGGER
    public static void registerModItems() {
        ArcaneArchaeology.LOGGER.info("Registering Items from " + ArcaneArchaeology.MOD_ID);
    }
}