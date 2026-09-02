package com.danako.practical_additions.datagen.misc;

import com.danako.practical_additions.PracticalAdditions;
import com.danako.practical_additions.core.PracticalBlocks;
import com.danako.practical_additions.core.PracticalItems;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PALanguageProvider extends LanguageProvider {

    public PALanguageProvider(PackOutput output) {
        super(output, PracticalAdditions.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + PracticalAdditions.MODID, "Practical Additions");

        addBlock(PracticalBlocks.LEAD_ORE, "Lead Ore");
        addBlock(PracticalBlocks.DEEPSLATE_LEAD_ORE, "Deepslate Lead Ore");
        addBlock(PracticalBlocks.RAW_LEAD_BLOCK, "Block of Raw Lead");
        addBlock(PracticalBlocks.LEAD_BLOCK, "Block of Lead");
        addBlock(PracticalBlocks.DENSE_WEIGHTED_PRESSURE_PLATE, "Dense Weighted Pressure Plate");

        addBlock(PracticalBlocks.COBALT_ORE, "Cobalt Ore");
        addBlock(PracticalBlocks.DEEPSLATE_COBALT_ORE, "Deepslate Cobalt Ore");
        addBlock(PracticalBlocks.RAW_COBALT_BLOCK, "Block of Raw Cobalt");
        addBlock(PracticalBlocks.COBALT_BLOCK, "Block of Cobalt");

        addItem(PracticalItems.LEAD_INGOT, "Lead Ingot");
        addItem(PracticalItems.RAW_LEAD, "Raw Lead");
        addItem(PracticalItems.LEAD_NUGGET, "Lead Nugget");

        addItem(PracticalItems.COBALT_INGOT, "Cobalt Ingot");
        addItem(PracticalItems.RAW_COBALT, "Raw Cobalt");
        addItem(PracticalItems.COBALT_NUGGET, "Cobalt Nugget");

        addItem(PracticalItems.LEAD_SWORD, "Lead Sword");
        addItem(PracticalItems.LEAD_SPEAR, "Lead Spear");
        addItem(PracticalItems.LEAD_PICKAXE, "Lead Pickaxe");
        addItem(PracticalItems.LEAD_AXE, "Lead Axe");
        addItem(PracticalItems.LEAD_SHOVEL, "Lead Shovel");
        addItem(PracticalItems.LEAD_HOE, "Lead Hoe");

        addItem(PracticalItems.COBALT_SWORD, "Cobalt Sword");
        addItem(PracticalItems.COBALT_SPEAR, "Cobalt Spear");
        addItem(PracticalItems.COBALT_BOW, "Cobalt Bow");
        addItem(PracticalItems.COBALT_PICKAXE, "Cobalt Pickaxe");
        addItem(PracticalItems.COBALT_AXE, "Cobalt Axe");
        addItem(PracticalItems.COBALT_SHOVEL, "Cobalt Shovel");
        addItem(PracticalItems.COBALT_HOE, "Cobalt Hoe");

        addItem(PracticalItems.LEAD_HELMET, "Lead Helmet");
        addItem(PracticalItems.LEAD_CHESTPLATE, "Lead Chestplate");
        addItem(PracticalItems.LEAD_LEGGINGS, "Lead Leggings");
        addItem(PracticalItems.LEAD_BOOTS, "Lead Boots");

        addItem(PracticalItems.COBALT_HELMET, "Cobalt Helmet");
        addItem(PracticalItems.COBALT_CHESTPLATE, "Cobalt Chestplate");
        addItem(PracticalItems.COBALT_LEGGINGS, "Cobalt Leggings");
        addItem(PracticalItems.COBALT_BOOTS, "Cobalt Boots");

        addItem(PracticalItems.LEAD_HORSE_ARMOR, "Lead Horse Armor");
        addItem(PracticalItems.LEAD_NAUTILUS_ARMOR, "Lead Nautilus Armor");

        addItem(PracticalItems.COBALT_HORSE_ARMOR, "Cobalt Horse Armor");
        addItem(PracticalItems.COBALT_NAUTILUS_ARMOR, "Cobalt Nautilus Armor");

        addItem(PracticalItems.GOLDEN_HAMMER, "Golden Hammer");
        addItem(PracticalItems.COPPER_HAMMER, "Copper Hammer");
        addItem(PracticalItems.LEAD_HAMMER, "Lead Hammer");
        addItem(PracticalItems.IRON_HAMMER, "Iron Hammer");
        addItem(PracticalItems.COBALT_HAMMER, "Cobalt Hammer");
        addItem(PracticalItems.DIAMOND_HAMMER, "Diamond Hammer");
        addItem(PracticalItems.NETHERITE_HAMMER, "Netherite Hammer");

        addItem(PracticalItems.GOLDEN_EXCAVATOR, "Golden Excavator");
        addItem(PracticalItems.COPPER_EXCAVATOR, "Copper Excavator");
        addItem(PracticalItems.LEAD_EXCAVATOR, "Lead Excavator");
        addItem(PracticalItems.IRON_EXCAVATOR, "Iron Excavator");
        addItem(PracticalItems.COBALT_EXCAVATOR, "Cobalt Excavator");
        addItem(PracticalItems.DIAMOND_EXCAVATOR, "Diamond Excavator");
        addItem(PracticalItems.NETHERITE_EXCAVATOR, "Netherite Excavator");

        addItem(PracticalItems.GOLDEN_SICKLE, "Golden Sickle");
        addItem(PracticalItems.COPPER_SICKLE, "Copper Sickle");
        addItem(PracticalItems.LEAD_SICKLE, "Lead Sickle");
        addItem(PracticalItems.IRON_SICKLE, "Iron Sickle");
        addItem(PracticalItems.COBALT_SICKLE, "Cobalt Sickle");
        addItem(PracticalItems.DIAMOND_SICKLE, "Diamond Sickle");
        addItem(PracticalItems.NETHERITE_SICKLE, "Netherite Sickle");

        addItem(PracticalItems.EMERALD_SWORD, "Emerald Sword");
        addItem(PracticalItems.EMERALD_SPEAR, "Emerald Spear");
        addItem(PracticalItems.EMERALD_PICKAXE, "Emerald Pickaxe");
        addItem(PracticalItems.EMERALD_AXE, "Emerald Axe");
        addItem(PracticalItems.EMERALD_SHOVEL, "Emerald Shovel");
        addItem(PracticalItems.EMERALD_HOE, "Emerald Hoe");
        addItem(PracticalItems.EMERALD_HELMET, "Emerald Helmet");
        addItem(PracticalItems.EMERALD_CHESTPLATE, "Emerald Chestplate");
        addItem(PracticalItems.EMERALD_LEGGINGS, "Emerald Leggings");
        addItem(PracticalItems.EMERALD_BOOTS, "Emerald Boots");
        addItem(PracticalItems.EMERALD_HORSE_ARMOR, "Emerald Horse Armor");
        addItem(PracticalItems.EMERALD_NAUTILUS_ARMOR, "Emerald Nautilus Armor");
        addItem(PracticalItems.EMERALD_HAMMER, "Emerald Hammer");
        addItem(PracticalItems.EMERALD_EXCAVATOR, "Emerald Excavator");
        addItem(PracticalItems.EMERALD_SICKLE, "Emerald Sickle");

        addItem(PracticalItems.LAPIS_SWORD, "Lapis Sword");
        addItem(PracticalItems.LAPIS_SPEAR, "Lapis Spear");
        addItem(PracticalItems.LAPIS_PICKAXE, "Lapis Pickaxe");
        addItem(PracticalItems.LAPIS_AXE, "Lapis Axe");
        addItem(PracticalItems.LAPIS_SHOVEL, "Lapis Shovel");
        addItem(PracticalItems.LAPIS_HOE, "Lapis Hoe");
        addItem(PracticalItems.LAPIS_HELMET, "Lapis Helmet");
        addItem(PracticalItems.LAPIS_CHESTPLATE, "Lapis Chestplate");
        addItem(PracticalItems.LAPIS_LEGGINGS, "Lapis Leggings");
        addItem(PracticalItems.LAPIS_BOOTS, "Lapis Boots");
        addItem(PracticalItems.LAPIS_HAMMER, "Lapis Hammer");
        addItem(PracticalItems.LAPIS_EXCAVATOR, "Lapis Excavator");
        addItem(PracticalItems.LAPIS_SICKLE, "Lapis Sickle");

        addItem(PracticalItems.REDSTONE_SWORD, "Redstone Sword");
        addItem(PracticalItems.REDSTONE_SPEAR, "Redstone Spear");
        addItem(PracticalItems.REDSTONE_PICKAXE, "Redstone Pickaxe");
        addItem(PracticalItems.REDSTONE_AXE, "Redstone Axe");
        addItem(PracticalItems.REDSTONE_SHOVEL, "Redstone Shovel");
        addItem(PracticalItems.REDSTONE_HOE, "Redstone Hoe");
        addItem(PracticalItems.REDSTONE_HELMET, "Redstone Helmet");
        addItem(PracticalItems.REDSTONE_CHESTPLATE, "Redstone Chestplate");
        addItem(PracticalItems.REDSTONE_LEGGINGS, "Redstone Leggings");
        addItem(PracticalItems.REDSTONE_BOOTS, "Redstone Boots");
        addItem(PracticalItems.REDSTONE_HAMMER, "Redstone Hammer");
        addItem(PracticalItems.REDSTONE_EXCAVATOR, "Redstone Excavator");
        addItem(PracticalItems.REDSTONE_SICKLE, "Redstone Sickle");

        addItem(PracticalItems.BASIC_MAGNET, "Basic Magnet");
        addItem(PracticalItems.ADVANCED_MAGNET, "Advanced Magnet");

        addItem(PracticalItems.KEVLAR_FIBER, "Kevlar Fiber");
        addItem(PracticalItems.KEVLAR_SHEET, "Kevlar Sheet");

        addItem(PracticalItems.BALLISTIC_HELMET, "Ballistic Helmet");
        addItem(PracticalItems.KEVLAR_VEST, "Kevlar Vest");
        addItem(PracticalItems.KEVLAR_PANTS, "Kevlar Pants");
        addItem(PracticalItems.KEVLAR_BOOTS, "Kevlar Boots");

        addItem(PracticalItems.BASIC_BACKPACK, "Basic Backpack");
        addItem(PracticalItems.REINFORCED_BACKPACK, "Reinforced Backpack");

        addItem(PracticalItems.BASIC_QUIVER, "Basic Quiver");
        addItem(PracticalItems.REINFORCED_QUIVER, "Reinforced Quiver");

        add("item.practical_additions.quiver.empty", "Empty");
        add("item.practical_additions.quiver.empty.description", "Can Hold Mixed Stacks Of Arrows");
        add("item.practical_additions.quiver.full", "Full");

        addItem(PracticalItems.KEVLAR_SHIELD, "Kevlar Shield");

        add("tooltip."  + PracticalAdditions.MODID + ".kevlar.projectile_protection", "Reduces damage from projectiles");

        add("tooltip."  + PracticalAdditions.MODID +  ".lead.weighted", "Lead Weighted");
        add("tooltip." + PracticalAdditions.MODID + ".cobalt.swim_speed", "Increases Swimming Speed");

        add("creativetab." + PracticalAdditions.MODID + ".practical_additions_tab", "Practical Additions");

        add("config." + PracticalAdditions.MODID + ".enable_debug_tooltips", "Enable Debug Tooltips");
        add("config." + PracticalAdditions.MODID + ".enable_debug_tooltips.tooltip", "When enabled, item tooltips show a hint to press CTRL+SHIFT. Holding CTRL+SHIFT while " + "hovering over an item displays extra debug info, per the settings below.");

        add("config." + PracticalAdditions.MODID + ".show_tags", "Show Tags");
        add("config." + PracticalAdditions.MODID + ".show_tags.tooltip", "Whether the CTRL+SHIFT debug info includes the item's tags.");

        add("config." + PracticalAdditions.MODID + ".show_item_stats", "Show Item Stats");
        add("config." + PracticalAdditions.MODID + ".show_item_stats.tooltip", "Whether the SHIFT+CTRL info includes key item stats (max stack size, enchantability, tool efficiency, etc).");

        add("tooltip.practical_additions.press_ctrl_shift", "Shift + Ctrl To Display Additional Information");
        add("key.category.practical_additions.main", "Practical Additions ");

        add(PracticalAdditions.MODID + ".configuration.itemProperties", "Item Properties");

        add("config." + PracticalAdditions.MODID + ".show_item_properties", "Show Item Properties");
        add("config." + PracticalAdditions.MODID + ".show_item_properties.tooltip", "Whether the CTRL+SHIFT debug info includes curated item/block properties.");

        add("config." + PracticalAdditions.MODID + ".disable_modded_items_in_vanilla_tabs", "Disable Modded Items In Vanilla Tabs");
        add("config." + PracticalAdditions.MODID + ".disable_modded_items_in_vanilla_tabs.tooltip", "When enabled, Practical Additions items will not appear in vanilla creative mode tabs. They will still be available in the Practical Additions tab.");

        add("config." + PracticalAdditions.MODID + ".show_prop_general", "General Properties");
        add("config." + PracticalAdditions.MODID + ".show_prop_general.tooltip", "Max stack size, rarity, durability, and repair cost.");

        add("config." + PracticalAdditions.MODID + ".show_prop_enchantability", "Enchantability");
        add("config." + PracticalAdditions.MODID + ".show_prop_enchantability.tooltip", "The item's enchantability value.");

        add("config." + PracticalAdditions.MODID + ".show_prop_combat", "Combat Stats");
        add("config." + PracticalAdditions.MODID + ".show_prop_combat.tooltip", "Attack damage and attack speed.");

        add("config." + PracticalAdditions.MODID + ".show_prop_tool", "Tool Stats");
        add("config." + PracticalAdditions.MODID + ".show_prop_tool.tooltip", "Mining speed for tools.");

        add("config." + PracticalAdditions.MODID + ".show_prop_food", "Food Properties");
        add("config." + PracticalAdditions.MODID + ".show_prop_food.tooltip", "Nutrition and saturation for edible items.");

        add("config." + PracticalAdditions.MODID + ".show_prop_block", "Block Properties");
        add("config." + PracticalAdditions.MODID + ".show_prop_block.tooltip", "Hardness, light level, note block instrument, and correct-tool requirement.");

        add("tooltip.practical_additions.properties", "Properties");
        add("tooltip.practical_additions.property.max_stack_size", "Max Stack Size");
        add("tooltip.practical_additions.property.durability", "Durability");
        add("tooltip.practical_additions.property.rarity", "Rarity");
        add("tooltip.practical_additions.property.repair_cost", "Repair Cost");
        add("tooltip.practical_additions.property.enchantability", "Enchantability");
        add("tooltip.practical_additions.property.attack_damage", "Attack Damage");
        add("tooltip.practical_additions.property.attack_speed", "Attack Speed");
        add("tooltip.practical_additions.property.mining_speed", "Mining Speed");
        add("tooltip.practical_additions.property.nutrition", "Nutrition");
        add("tooltip.practical_additions.property.saturation", "Saturation");
        add("tooltip.practical_additions.property.hardness", "Hardness");
        add("tooltip.practical_additions.property.light_level", "Light Level");
        add("tooltip.practical_additions.property.instrument", "Note Block Instrument");
        add("tooltip.practical_additions.property.requires_tool", "Requires Correct Tool");

        add("tooltip.practical_additions.magnet.state", "State: ");
        add("tooltip.practical_additions.magnet.on", "ON");
        add("tooltip.practical_additions.magnet.off", "OFF");
        add("tooltip.practical_additions.magnet.toggle_hint", "Shift Right Click While Holding Magnet to Toggle");
        add("message.practical_additions.magnet_toggled", "%s is now %s");
        add("gui.practical_additions.whitelist", "Whitelist");
        add("gui.practical_additions.blacklist", "Blacklist");
        add("gui.practical_additions.xp_on", "Collect XP: ON");
        add("gui.practical_additions.xp_off", "Collect XP: OFF");
        add("gui.practical_additions.clear_entries", "Clear Entries");

        add("key.categories.practical_additions.main", "Practical Additions");
        add("key.practical_additions.open_backpack", "Open Backpack");

        addItem(PracticalItems.LEAD_DIVING_BELT, "Lead Diving Belt");

        add("tooltip.practical_additions.diving_belt.state", "State: ");
        add("tooltip.practical_additions.diving_belt.on", "ON");
        add("tooltip.practical_additions.diving_belt.off", "OFF");
        add("tooltip.practical_additions.diving_belt.toggle_hint", "Shift Right Click While Holding Diving Belt to Toggle");
        add("message.practical_additions.diving_belt_toggled", "%s is now %s");
    }
}