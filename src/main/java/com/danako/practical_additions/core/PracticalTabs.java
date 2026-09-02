package com.danako.practical_additions.core;

import com.danako.practical_additions.PracticalAdditions;
import com.danako.practical_additions.config.PracticalConfig;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

import static com.danako.practical_additions.PracticalAdditions.CREATIVE_MODE_TABS;

public class PracticalTabs {

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PRACTICAL_ADDITIONS_TAB = CREATIVE_MODE_TABS.register("practical_additions_tab", () -> CreativeModeTab.builder().title(Component.translatable("creativetab." + PracticalAdditions.MODID + ".practical_additions_tab")).icon(() -> PracticalItems.ADVANCED_MAGNET.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(PracticalItems.LEAD_ORE.get());
        output.accept(PracticalItems.DEEPSLATE_LEAD_ORE.get());
        output.accept(PracticalItems.RAW_LEAD.get());
        output.accept(PracticalItems.LEAD_INGOT.get());
        output.accept(PracticalItems.LEAD_NUGGET.get());
        output.accept(PracticalItems.RAW_LEAD_BLOCK.get());
        output.accept(PracticalItems.LEAD_BLOCK.get());
        output.accept(PracticalItems.DENSE_WEIGHTED_PRESSURE_PLATE.get());
        output.accept(PracticalItems.LEAD_SWORD.get());
        output.accept(PracticalItems.LEAD_SPEAR.get());
        output.accept(PracticalItems.LEAD_PICKAXE.get());
        output.accept(PracticalItems.LEAD_AXE.get());
        output.accept(PracticalItems.LEAD_SHOVEL.get());
        output.accept(PracticalItems.LEAD_HOE.get());
        output.accept(PracticalItems.LEAD_HAMMER.get());
        output.accept(PracticalItems.LEAD_EXCAVATOR.get());
        output.accept(PracticalItems.LEAD_SICKLE.get());
        output.accept(PracticalItems.LEAD_HELMET.get());
        output.accept(PracticalItems.LEAD_CHESTPLATE.get());
        output.accept(PracticalItems.LEAD_LEGGINGS.get());
        output.accept(PracticalItems.LEAD_BOOTS.get());
        output.accept(PracticalItems.LEAD_HORSE_ARMOR.get());
        output.accept(PracticalItems.LEAD_NAUTILUS_ARMOR.get());
        output.accept(PracticalItems.LEAD_DIVING_BELT.get());
        output.accept(PracticalItems.COBALT_ORE.get());
        output.accept(PracticalItems.DEEPSLATE_COBALT_ORE.get());
        output.accept(PracticalItems.RAW_COBALT.get());
        output.accept(PracticalItems.COBALT_INGOT.get());
        output.accept(PracticalItems.COBALT_NUGGET.get());
        output.accept(PracticalItems.RAW_COBALT_BLOCK.get());
        output.accept(PracticalItems.COBALT_BLOCK.get());
        output.accept(PracticalItems.COBALT_SWORD.get());
        output.accept(PracticalItems.COBALT_SPEAR.get());
        output.accept(PracticalItems.COBALT_BOW.get());
        output.accept(PracticalItems.COBALT_PICKAXE.get());
        output.accept(PracticalItems.COBALT_AXE.get());
        output.accept(PracticalItems.COBALT_SHOVEL.get());
        output.accept(PracticalItems.COBALT_HOE.get());
        output.accept(PracticalItems.COBALT_HAMMER.get());
        output.accept(PracticalItems.COBALT_EXCAVATOR.get());
        output.accept(PracticalItems.COBALT_SICKLE.get());
        output.accept(PracticalItems.COBALT_HELMET.get());
        output.accept(PracticalItems.COBALT_CHESTPLATE.get());
        output.accept(PracticalItems.COBALT_LEGGINGS.get());
        output.accept(PracticalItems.COBALT_BOOTS.get());
        output.accept(PracticalItems.COBALT_HORSE_ARMOR.get());
        output.accept(PracticalItems.COBALT_NAUTILUS_ARMOR.get());
        output.accept(PracticalItems.ADVANCED_MAGNET.get());
        output.accept(PracticalItems.EMERALD_SWORD.get());
        output.accept(PracticalItems.EMERALD_SPEAR.get());
        output.accept(PracticalItems.EMERALD_PICKAXE.get());
        output.accept(PracticalItems.EMERALD_AXE.get());
        output.accept(PracticalItems.EMERALD_SHOVEL.get());
        output.accept(PracticalItems.EMERALD_HOE.get());
        output.accept(PracticalItems.EMERALD_HAMMER.get());
        output.accept(PracticalItems.EMERALD_EXCAVATOR.get());
        output.accept(PracticalItems.EMERALD_SICKLE.get());
        output.accept(PracticalItems.EMERALD_HELMET.get());
        output.accept(PracticalItems.EMERALD_CHESTPLATE.get());
        output.accept(PracticalItems.EMERALD_LEGGINGS.get());
        output.accept(PracticalItems.EMERALD_BOOTS.get());
        output.accept(PracticalItems.EMERALD_HORSE_ARMOR.get());
        output.accept(PracticalItems.EMERALD_NAUTILUS_ARMOR.get());
        output.accept(PracticalItems.LAPIS_SWORD.get());
        output.accept(PracticalItems.LAPIS_SPEAR.get());
        output.accept(PracticalItems.LAPIS_PICKAXE.get());
        output.accept(PracticalItems.LAPIS_AXE.get());
        output.accept(PracticalItems.LAPIS_SHOVEL.get());
        output.accept(PracticalItems.LAPIS_HOE.get());
        output.accept(PracticalItems.LAPIS_HAMMER.get());
        output.accept(PracticalItems.LAPIS_EXCAVATOR.get());
        output.accept(PracticalItems.LAPIS_SICKLE.get());
        output.accept(PracticalItems.LAPIS_HELMET.get());
        output.accept(PracticalItems.LAPIS_CHESTPLATE.get());
        output.accept(PracticalItems.LAPIS_LEGGINGS.get());
        output.accept(PracticalItems.LAPIS_BOOTS.get());
        output.accept(PracticalItems.REDSTONE_SWORD.get());
        output.accept(PracticalItems.REDSTONE_SPEAR.get());
        output.accept(PracticalItems.REDSTONE_PICKAXE.get());
        output.accept(PracticalItems.REDSTONE_AXE.get());
        output.accept(PracticalItems.REDSTONE_SHOVEL.get());
        output.accept(PracticalItems.REDSTONE_HOE.get());
        output.accept(PracticalItems.REDSTONE_HAMMER.get());
        output.accept(PracticalItems.REDSTONE_EXCAVATOR.get());
        output.accept(PracticalItems.REDSTONE_SICKLE.get());
        output.accept(PracticalItems.REDSTONE_HELMET.get());
        output.accept(PracticalItems.REDSTONE_CHESTPLATE.get());
        output.accept(PracticalItems.REDSTONE_LEGGINGS.get());
        output.accept(PracticalItems.REDSTONE_BOOTS.get());
        output.accept(PracticalItems.GOLDEN_HAMMER.get());
        output.accept(PracticalItems.GOLDEN_EXCAVATOR.get());
        output.accept(PracticalItems.GOLDEN_SICKLE.get());
        output.accept(PracticalItems.COPPER_HAMMER.get());
        output.accept(PracticalItems.COPPER_EXCAVATOR.get());
        output.accept(PracticalItems.COPPER_SICKLE.get());
        output.accept(PracticalItems.IRON_HAMMER.get());
        output.accept(PracticalItems.IRON_EXCAVATOR.get());
        output.accept(PracticalItems.IRON_SICKLE.get());
        output.accept(PracticalItems.BASIC_MAGNET.get());
        output.accept(PracticalItems.DIAMOND_HAMMER.get());
        output.accept(PracticalItems.DIAMOND_EXCAVATOR.get());
        output.accept(PracticalItems.DIAMOND_SICKLE.get());
        output.accept(PracticalItems.NETHERITE_HAMMER.get());
        output.accept(PracticalItems.NETHERITE_EXCAVATOR.get());
        output.accept(PracticalItems.NETHERITE_SICKLE.get());
        output.accept(PracticalItems.BASIC_BACKPACK.get());
        output.accept(PracticalItems.BASIC_QUIVER.get());
        output.accept(PracticalItems.KEVLAR_FIBER.get());
        output.accept(PracticalItems.KEVLAR_SHEET.get());
        output.accept(PracticalItems.BALLISTIC_HELMET.get());
        output.accept(PracticalItems.KEVLAR_VEST.get());
        output.accept(PracticalItems.KEVLAR_PANTS.get());
        output.accept(PracticalItems.KEVLAR_BOOTS.get());
        output.accept(PracticalItems.KEVLAR_SHIELD.get());
        output.accept(PracticalItems.REINFORCED_QUIVER.get());
        output.accept(PracticalItems.REINFORCED_BACKPACK.get());

    }).build());

    public static void register(IEventBus modEventBus) {
        modEventBus.addListener(PracticalTabs::onBuildTabContents);
    }

    private static ItemStack stack(Item item) {
        return new ItemStack(item);
    }

    private static void onBuildTabContents(BuildCreativeModeTabContentsEvent event) {
        if (PracticalConfig.DISABLE_MODDED_ITEMS_IN_VANILLA_TABS.get()) {
            return;
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            addToolsAndUtilities(event);
        } else if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            addCombat(event);
        } else if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            addNaturalBlocks(event);
        } else if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            addBuildingBlocks(event);
        } else if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            addIngredients(event);
        }
    }

    private static void addToolsAndUtilities(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.COPPER_HOE), stack(PracticalItems.COPPER_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.COPPER_HAMMER.get()), stack(PracticalItems.COPPER_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.COPPER_EXCAVATOR.get()), stack(PracticalItems.COPPER_SICKLE.get()), vis);
        event.insertAfter(stack(PracticalItems.COPPER_SICKLE.get()), stack(PracticalItems.LEAD_SHOVEL.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_SHOVEL.get()), stack(PracticalItems.LEAD_PICKAXE.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_PICKAXE.get()), stack(PracticalItems.LEAD_AXE.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_AXE.get()), stack(PracticalItems.LEAD_HOE.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_HOE.get()), stack(PracticalItems.LEAD_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_HAMMER.get()), stack(PracticalItems.LEAD_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_EXCAVATOR.get()), stack(PracticalItems.LEAD_SICKLE.get()), vis);
        event.insertAfter(stack(Items.IRON_HOE), stack(PracticalItems.IRON_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.IRON_HAMMER.get()), stack(PracticalItems.IRON_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.IRON_EXCAVATOR.get()), stack(PracticalItems.IRON_SICKLE.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_HOE), stack(PracticalItems.GOLDEN_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.GOLDEN_HAMMER.get()), stack(PracticalItems.GOLDEN_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.GOLDEN_EXCAVATOR.get()), stack(PracticalItems.GOLDEN_SICKLE.get()), vis);
        event.insertAfter(stack(PracticalItems.GOLDEN_SICKLE.get()), stack(PracticalItems.LAPIS_SHOVEL.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_SHOVEL.get()), stack(PracticalItems.LAPIS_PICKAXE.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_PICKAXE.get()), stack(PracticalItems.LAPIS_AXE.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_AXE.get()), stack(PracticalItems.LAPIS_HOE.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_HOE.get()), stack(PracticalItems.LAPIS_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_HAMMER.get()), stack(PracticalItems.LAPIS_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_EXCAVATOR.get()), stack(PracticalItems.LAPIS_SICKLE.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_SICKLE.get()), stack(PracticalItems.REDSTONE_SHOVEL.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_SHOVEL.get()), stack(PracticalItems.REDSTONE_PICKAXE.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_PICKAXE.get()), stack(PracticalItems.REDSTONE_AXE.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_AXE.get()), stack(PracticalItems.REDSTONE_HOE.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_HOE.get()), stack(PracticalItems.REDSTONE_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_HAMMER.get()), stack(PracticalItems.REDSTONE_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_EXCAVATOR.get()), stack(PracticalItems.REDSTONE_SICKLE.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_SICKLE.get()), stack(PracticalItems.COBALT_SHOVEL.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_SHOVEL.get()), stack(PracticalItems.COBALT_PICKAXE.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_PICKAXE.get()), stack(PracticalItems.COBALT_AXE.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_AXE.get()), stack(PracticalItems.COBALT_HOE.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_HOE.get()), stack(PracticalItems.COBALT_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_HAMMER.get()), stack(PracticalItems.COBALT_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_EXCAVATOR.get()), stack(PracticalItems.COBALT_SICKLE.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_SICKLE.get()), stack(PracticalItems.EMERALD_SHOVEL.get()), vis);
        event.insertAfter(stack(PracticalItems.EMERALD_SHOVEL.get()), stack(PracticalItems.EMERALD_PICKAXE.get()), vis);
        event.insertAfter(stack(PracticalItems.EMERALD_PICKAXE.get()), stack(PracticalItems.EMERALD_AXE.get()), vis);
        event.insertAfter(stack(PracticalItems.EMERALD_AXE.get()), stack(PracticalItems.EMERALD_HOE.get()), vis);
        event.insertAfter(stack(PracticalItems.EMERALD_HOE.get()), stack(PracticalItems.EMERALD_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.EMERALD_HAMMER.get()), stack(PracticalItems.EMERALD_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.EMERALD_EXCAVATOR.get()), stack(PracticalItems.EMERALD_SICKLE.get()), vis);
        event.insertAfter(stack(Items.DIAMOND_HOE), stack(PracticalItems.DIAMOND_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.DIAMOND_HAMMER.get()), stack(PracticalItems.DIAMOND_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.DIAMOND_EXCAVATOR.get()), stack(PracticalItems.DIAMOND_SICKLE.get()), vis);
        event.insertAfter(stack(Items.NETHERITE_HOE), stack(PracticalItems.NETHERITE_HAMMER.get()), vis);
        event.insertAfter(stack(PracticalItems.NETHERITE_HAMMER.get()), stack(PracticalItems.NETHERITE_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PracticalItems.NETHERITE_EXCAVATOR.get()), stack(PracticalItems.NETHERITE_SICKLE.get()), vis);
        event.insertAfter(stack(Items.SPYGLASS), stack(PracticalItems.BASIC_MAGNET.get()), vis);
        event.insertAfter(stack(PracticalItems.BASIC_MAGNET.get()), stack(PracticalItems.ADVANCED_MAGNET.get()), vis);
        event.insertAfter(stack(Items.PINK_BUNDLE), stack(PracticalItems.BASIC_BACKPACK.get()), vis);
        event.insertAfter(stack(PracticalItems.BASIC_BACKPACK.get()), stack(PracticalItems.REINFORCED_BACKPACK.get()), vis);
        event.insertAfter(stack(PracticalItems.REINFORCED_BACKPACK.get()), stack(PracticalItems.BASIC_QUIVER.get()), vis);
        event.insertAfter(stack(PracticalItems.BASIC_QUIVER.get()), stack(PracticalItems.REINFORCED_QUIVER.get()), vis);
    }

    private static void addCombat(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.COPPER_SWORD), stack(PracticalItems.LEAD_SWORD.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_SWORD), stack(PracticalItems.LAPIS_SWORD.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_SWORD.get()), stack(PracticalItems.REDSTONE_SWORD.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_SWORD.get()), stack(PracticalItems.COBALT_SWORD.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_SWORD.get()), stack(PracticalItems.EMERALD_SWORD.get()), vis);
        event.insertAfter(stack(Items.COPPER_SPEAR), stack(PracticalItems.LEAD_SPEAR.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_SPEAR), stack(PracticalItems.LAPIS_SPEAR.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_SPEAR.get()), stack(PracticalItems.REDSTONE_SPEAR.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_SPEAR.get()), stack(PracticalItems.COBALT_SPEAR.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_SPEAR.get()), stack(PracticalItems.EMERALD_SPEAR.get()), vis);
        event.insertAfter(stack(Items.COPPER_AXE), stack(PracticalItems.LEAD_AXE.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_AXE), stack(PracticalItems.LAPIS_AXE.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_AXE.get()), stack(PracticalItems.REDSTONE_AXE.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_AXE.get()), stack(PracticalItems.COBALT_AXE.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_AXE.get()), stack(PracticalItems.EMERALD_AXE.get()), vis);
        event.insertAfter(stack(Items.SHIELD), stack(PracticalItems.KEVLAR_SHIELD.get()), vis);
        event.insertAfter(stack(Items.CROSSBOW), stack(PracticalItems.COBALT_BOW.get()), vis);
        event.insertAfter(stack(Items.COPPER_BOOTS), stack(PracticalItems.LEAD_HELMET.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_HELMET.get()), stack(PracticalItems.LEAD_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_CHESTPLATE.get()), stack(PracticalItems.LEAD_LEGGINGS.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_LEGGINGS.get()), stack(PracticalItems.LEAD_BOOTS.get()), vis);
        event.insertAfter(stack(Items.CHAINMAIL_BOOTS), stack(PracticalItems.BALLISTIC_HELMET.get()), vis);
        event.insertAfter(stack(PracticalItems.BALLISTIC_HELMET.get()), stack(PracticalItems.KEVLAR_VEST.get()), vis);
        event.insertAfter(stack(PracticalItems.KEVLAR_VEST.get()), stack(PracticalItems.KEVLAR_PANTS.get()), vis);
        event.insertAfter(stack(PracticalItems.KEVLAR_PANTS.get()), stack(PracticalItems.KEVLAR_BOOTS.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_BOOTS), stack(PracticalItems.LAPIS_HELMET.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_HELMET.get()), stack(PracticalItems.LAPIS_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_CHESTPLATE.get()), stack(PracticalItems.LAPIS_LEGGINGS.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_LEGGINGS.get()), stack(PracticalItems.LAPIS_BOOTS.get()), vis);
        event.insertAfter(stack(PracticalItems.LAPIS_BOOTS.get()), stack(PracticalItems.REDSTONE_HELMET.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_HELMET.get()), stack(PracticalItems.REDSTONE_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_CHESTPLATE.get()), stack(PracticalItems.REDSTONE_LEGGINGS.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_LEGGINGS.get()), stack(PracticalItems.REDSTONE_BOOTS.get()), vis);
        event.insertAfter(stack(PracticalItems.REDSTONE_BOOTS.get()), stack(PracticalItems.COBALT_HELMET.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_HELMET.get()), stack(PracticalItems.COBALT_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_CHESTPLATE.get()), stack(PracticalItems.COBALT_LEGGINGS.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_LEGGINGS.get()), stack(PracticalItems.COBALT_BOOTS.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_BOOTS.get()), stack(PracticalItems.EMERALD_HELMET.get()), vis);
        event.insertAfter(stack(PracticalItems.EMERALD_HELMET.get()), stack(PracticalItems.EMERALD_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PracticalItems.EMERALD_CHESTPLATE.get()), stack(PracticalItems.EMERALD_LEGGINGS.get()), vis);
        event.insertAfter(stack(PracticalItems.EMERALD_LEGGINGS.get()), stack(PracticalItems.EMERALD_BOOTS.get()), vis);
        event.insertAfter(stack(Items.COPPER_HORSE_ARMOR), stack(PracticalItems.LEAD_HORSE_ARMOR.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_HORSE_ARMOR), stack(PracticalItems.COBALT_HORSE_ARMOR.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_HORSE_ARMOR.get()), stack(PracticalItems.EMERALD_HORSE_ARMOR.get()), vis);
        event.insertAfter(stack(Items.COPPER_NAUTILUS_ARMOR), stack(PracticalItems.LEAD_NAUTILUS_ARMOR.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_NAUTILUS_ARMOR), stack(PracticalItems.COBALT_NAUTILUS_ARMOR.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_NAUTILUS_ARMOR.get()), stack(PracticalItems.EMERALD_NAUTILUS_ARMOR.get()), vis);
    }

    private static void addNaturalBlocks(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.DEEPSLATE_COPPER_ORE), stack(PracticalItems.LEAD_ORE.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_ORE.get()), stack(PracticalItems.DEEPSLATE_LEAD_ORE.get()), vis);
        event.insertAfter(stack(Items.DEEPSLATE_GOLD_ORE), stack(PracticalItems.COBALT_ORE.get()), vis);
        event.insertAfter(stack(PracticalItems.COBALT_ORE.get()), stack(PracticalItems.DEEPSLATE_COBALT_ORE.get()), vis);
        event.insertAfter(stack(Items.RAW_COPPER_BLOCK), stack(PracticalItems.RAW_LEAD_BLOCK.get()), vis);
        event.insertAfter(stack(Items.RAW_GOLD_BLOCK), stack(PracticalItems.RAW_COBALT_BLOCK.get()), vis);
    }

    private static void addBuildingBlocks(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.LIGHT_WEIGHTED_PRESSURE_PLATE), stack(PracticalItems.LEAD_BLOCK.get()), vis);
        event.insertAfter(stack(PracticalItems.LEAD_BLOCK.get()), stack(PracticalItems.DENSE_WEIGHTED_PRESSURE_PLATE.get()), vis);
        event.insertAfter(stack(Items.GOLD_BLOCK), stack(PracticalItems.COBALT_BLOCK.get()), vis);
    }

    private static void addIngredients(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.RAW_COPPER), stack(PracticalItems.RAW_LEAD.get()), vis);
        event.insertAfter(stack(Items.RAW_GOLD), stack(PracticalItems.RAW_COBALT.get()), vis);
        event.insertAfter(stack(Items.COPPER_NUGGET), stack(PracticalItems.LEAD_NUGGET.get()), vis);
        event.insertAfter(stack(Items.GOLD_NUGGET), stack(PracticalItems.COBALT_NUGGET.get()), vis);
        event.insertAfter(stack(Items.COPPER_INGOT), stack(PracticalItems.LEAD_INGOT.get()), vis);
        event.insertAfter(stack(Items.GOLD_INGOT), stack(PracticalItems.COBALT_INGOT.get()), vis);
        event.insertAfter(stack(Items.STRING), stack(PracticalItems.KEVLAR_FIBER.get()), vis);
        event.insertAfter(stack(Items.LEATHER), stack(PracticalItems.KEVLAR_SHEET.get()), vis);
    }
}