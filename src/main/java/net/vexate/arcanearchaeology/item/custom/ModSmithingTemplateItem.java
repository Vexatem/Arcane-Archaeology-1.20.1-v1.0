package net.vexate.arcanearchaeology.item.custom;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class ModSmithingTemplateItem extends SmithingTemplateItem {

    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;

    private static final String TRANSLATION_KEY = Util.createTranslationKey("item", new Identifier("smithing_template"));

    private static final Identifier EMPTY_SLOT_PRISM_TEXTURE;
    private static final Identifier EMPTY_SLOT_HELMET_TEXTURE;
    private static final Identifier EMPTY_SLOT_CHESTPLATE_TEXTURE;
    private static final Identifier EMPTY_SLOT_LEGGINGS_TEXTURE;
    private static final Identifier EMPTY_SLOT_BOOTS_TEXTURE;
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE;
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE;
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE;
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE;
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE;
    private static final Identifier EMPTY_SLOT_BRUSH_TEXTURE;

    public static final Text AZURE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.azure_upgrade_smithing_template.title"))).formatted(TITLE_FORMATTING);
    public static final Text AZURE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.azure_upgrade_smithing_template.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    public static final Text AZURE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.azure_upgrade_smithing_template.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    public static final Text AZURE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.azure_upgrade_smithing_template.base_slot_description")));
    public static final Text AZURE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.azure_upgrade_smithing_template.additions_slot_description")));

    public ModSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText, emptyBaseSlotTextures, emptyAdditionsSlotTextures);
    }

    public static List<Identifier> getAzureUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_BRUSH_TEXTURE, EMPTY_SLOT_HELMET_TEXTURE, EMPTY_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE, EMPTY_SLOT_HOE_TEXTURE);
    }

    public static List<Identifier> getAzureUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_PRISM_TEXTURE);
    }

    static {
        EMPTY_SLOT_PRISM_TEXTURE = new Identifier("textures/item/empty_slot_prism");
        EMPTY_SLOT_HELMET_TEXTURE = new Identifier("textures/item/empty_slot_helmet");
        EMPTY_SLOT_CHESTPLATE_TEXTURE = new Identifier("textures/item/empty_slot_chestplate");
        EMPTY_SLOT_LEGGINGS_TEXTURE = new Identifier("textures/item/empty_slot_leggings");
        EMPTY_SLOT_BOOTS_TEXTURE = new Identifier("textures/item/empty_slot_boots");
        EMPTY_SLOT_SWORD_TEXTURE = new Identifier("textures/item/empty_slot_sword");
        EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("textures/item/empty_slot_pickaxe");
        EMPTY_SLOT_AXE_TEXTURE = new Identifier("textures/item/empty_slot_axe");
        EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("textures/item/empty_slot_shovel");
        EMPTY_SLOT_HOE_TEXTURE = new Identifier("textures/item/empty_slot_hoe");
        EMPTY_SLOT_BRUSH_TEXTURE = new Identifier("textures/item/empty_slot_brush");

    }


    @Override
    public String getTranslationKey() {
        return TRANSLATION_KEY;
    }
}
