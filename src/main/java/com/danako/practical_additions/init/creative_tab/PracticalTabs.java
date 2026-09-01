package com.danako.practical_additions.init.creative_tab;

import com.danako.practical_additions.PracticalAdditions;
import com.danako.practical_additions.config.PAConfig;
import com.danako.practical_additions.init.PAItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

import static com.danako.practical_additions.PracticalAdditions.CREATIVE_MODE_TABS;

public class PracticalTabs {

    public static void register(IEventBus modEventBus) {
        modEventBus.addListener(PracticalTabs::onBuildTabContents);
    }

    private static ItemStack stack(Item item) {
        return new ItemStack(item);
    }

    private static void onBuildTabContents(BuildCreativeModeTabContentsEvent event) {
        if (PAConfig.DISABLE_MODDED_ITEMS_IN_VANILLA_TABS.get()) {
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

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PRACTICAL_ADDITIONS_TAB = CREATIVE_MODE_TABS.register("practical_additions_tab", () -> CreativeModeTab.builder().title(Component.translatable("creativetab." + PracticalAdditions.MODID + ".practical_additions_tab")).icon(() -> PAItems.ADVANCED_MAGNET.get().getDefaultInstance()).displayItems((parameters, output) -> {
        output.accept(PAItems.LEAD_ORE.get());
        output.accept(PAItems.DEEPSLATE_LEAD_ORE.get());
        output.accept(PAItems.RAW_LEAD.get());
        output.accept(PAItems.LEAD_INGOT.get());
        output.accept(PAItems.LEAD_NUGGET.get());
        output.accept(PAItems.RAW_LEAD_BLOCK.get());
        output.accept(PAItems.LEAD_BLOCK.get());
        output.accept(PAItems.DENSE_WEIGHTED_PRESSURE_PLATE.get());
        output.accept(PAItems.LEAD_SWORD.get());
        output.accept(PAItems.LEAD_SPEAR.get());
        output.accept(PAItems.LEAD_PICKAXE.get());
        output.accept(PAItems.LEAD_AXE.get());
        output.accept(PAItems.LEAD_SHOVEL.get());
        output.accept(PAItems.LEAD_HOE.get());
        output.accept(PAItems.LEAD_HAMMER.get());
        output.accept(PAItems.LEAD_EXCAVATOR.get());
        output.accept(PAItems.LEAD_SICKLE.get());
        output.accept(PAItems.LEAD_HELMET.get());
        output.accept(PAItems.LEAD_CHESTPLATE.get());
        output.accept(PAItems.LEAD_LEGGINGS.get());
        output.accept(PAItems.LEAD_BOOTS.get());
        output.accept(PAItems.LEAD_HORSE_ARMOR.get());
        output.accept(PAItems.LEAD_NAUTILUS_ARMOR.get());
        output.accept(PAItems.LEAD_DIVING_BELT.get());
        output.accept(PAItems.COBALT_ORE.get());
        output.accept(PAItems.DEEPSLATE_COBALT_ORE.get());
        output.accept(PAItems.RAW_COBALT.get());
        output.accept(PAItems.COBALT_INGOT.get());
        output.accept(PAItems.COBALT_NUGGET.get());
        output.accept(PAItems.RAW_COBALT_BLOCK.get());
        output.accept(PAItems.COBALT_BLOCK.get());
        output.accept(PAItems.COBALT_SWORD.get());
        output.accept(PAItems.COBALT_SPEAR.get());
        output.accept(PAItems.COBALT_BOW.get());
        output.accept(PAItems.COBALT_PICKAXE.get());
        output.accept(PAItems.COBALT_AXE.get());
        output.accept(PAItems.COBALT_SHOVEL.get());
        output.accept(PAItems.COBALT_HOE.get());
        output.accept(PAItems.COBALT_HAMMER.get());
        output.accept(PAItems.COBALT_EXCAVATOR.get());
        output.accept(PAItems.COBALT_SICKLE.get());
        output.accept(PAItems.COBALT_HELMET.get());
        output.accept(PAItems.COBALT_CHESTPLATE.get());
        output.accept(PAItems.COBALT_LEGGINGS.get());
        output.accept(PAItems.COBALT_BOOTS.get());
        output.accept(PAItems.COBALT_HORSE_ARMOR.get());
        output.accept(PAItems.COBALT_NAUTILUS_ARMOR.get());
        output.accept(PAItems.ADVANCED_MAGNET.get());
        output.accept(PAItems.EMERALD_SWORD.get());
        output.accept(PAItems.EMERALD_SPEAR.get());
        output.accept(PAItems.EMERALD_PICKAXE.get());
        output.accept(PAItems.EMERALD_AXE.get());
        output.accept(PAItems.EMERALD_SHOVEL.get());
        output.accept(PAItems.EMERALD_HOE.get());
        output.accept(PAItems.EMERALD_HAMMER.get());
        output.accept(PAItems.EMERALD_EXCAVATOR.get());
        output.accept(PAItems.EMERALD_SICKLE.get());
        output.accept(PAItems.EMERALD_HELMET.get());
        output.accept(PAItems.EMERALD_CHESTPLATE.get());
        output.accept(PAItems.EMERALD_LEGGINGS.get());
        output.accept(PAItems.EMERALD_BOOTS.get());
        output.accept(PAItems.EMERALD_HORSE_ARMOR.get());
        output.accept(PAItems.EMERALD_NAUTILUS_ARMOR.get());
        output.accept(PAItems.LAPIS_SWORD.get());
        output.accept(PAItems.LAPIS_SPEAR.get());
        output.accept(PAItems.LAPIS_PICKAXE.get());
        output.accept(PAItems.LAPIS_AXE.get());
        output.accept(PAItems.LAPIS_SHOVEL.get());
        output.accept(PAItems.LAPIS_HOE.get());
        output.accept(PAItems.LAPIS_HAMMER.get());
        output.accept(PAItems.LAPIS_EXCAVATOR.get());
        output.accept(PAItems.LAPIS_SICKLE.get());
        output.accept(PAItems.LAPIS_HELMET.get());
        output.accept(PAItems.LAPIS_CHESTPLATE.get());
        output.accept(PAItems.LAPIS_LEGGINGS.get());
        output.accept(PAItems.LAPIS_BOOTS.get());
        output.accept(PAItems.REDSTONE_SWORD.get());
        output.accept(PAItems.REDSTONE_SPEAR.get());
        output.accept(PAItems.REDSTONE_PICKAXE.get());
        output.accept(PAItems.REDSTONE_AXE.get());
        output.accept(PAItems.REDSTONE_SHOVEL.get());
        output.accept(PAItems.REDSTONE_HOE.get());
        output.accept(PAItems.REDSTONE_HAMMER.get());
        output.accept(PAItems.REDSTONE_EXCAVATOR.get());
        output.accept(PAItems.REDSTONE_SICKLE.get());
        output.accept(PAItems.REDSTONE_HELMET.get());
        output.accept(PAItems.REDSTONE_CHESTPLATE.get());
        output.accept(PAItems.REDSTONE_LEGGINGS.get());
        output.accept(PAItems.REDSTONE_BOOTS.get());
        output.accept(PAItems.GOLDEN_HAMMER.get());
        output.accept(PAItems.GOLDEN_EXCAVATOR.get());
        output.accept(PAItems.GOLDEN_SICKLE.get());
        output.accept(PAItems.COPPER_HAMMER.get());
        output.accept(PAItems.COPPER_EXCAVATOR.get());
        output.accept(PAItems.COPPER_SICKLE.get());
        output.accept(PAItems.IRON_HAMMER.get());
        output.accept(PAItems.IRON_EXCAVATOR.get());
        output.accept(PAItems.IRON_SICKLE.get());
        output.accept(PAItems.BASIC_MAGNET.get());
        output.accept(PAItems.DIAMOND_HAMMER.get());
        output.accept(PAItems.DIAMOND_EXCAVATOR.get());
        output.accept(PAItems.DIAMOND_SICKLE.get());
        output.accept(PAItems.NETHERITE_HAMMER.get());
        output.accept(PAItems.NETHERITE_EXCAVATOR.get());
        output.accept(PAItems.NETHERITE_SICKLE.get());
        output.accept(PAItems.BASIC_BACKPACK.get());
        output.accept(PAItems.BASIC_QUIVER.get());
        output.accept(PAItems.KEVLAR_FIBER.get());
        output.accept(PAItems.KEVLAR_SHEET.get());
        output.accept(PAItems.BALLISTIC_HELMET.get());
        output.accept(PAItems.KEVLAR_VEST.get());
        output.accept(PAItems.KEVLAR_PANTS.get());
        output.accept(PAItems.KEVLAR_BOOTS.get());
        output.accept(PAItems.KEVLAR_SHIELD.get());
        output.accept(PAItems.REINFORCED_QUIVER.get());
        output.accept(PAItems.REINFORCED_BACKPACK.get());

    }).build());

    private static void addToolsAndUtilities(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.COPPER_HOE), stack(PAItems.COPPER_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.COPPER_HAMMER.get()), stack(PAItems.COPPER_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.COPPER_EXCAVATOR.get()), stack(PAItems.COPPER_SICKLE.get()), vis);
        event.insertAfter(stack(PAItems.COPPER_SICKLE.get()), stack(PAItems.LEAD_SHOVEL.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_SHOVEL.get()), stack(PAItems.LEAD_PICKAXE.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_PICKAXE.get()), stack(PAItems.LEAD_AXE.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_AXE.get()), stack(PAItems.LEAD_HOE.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_HOE.get()), stack(PAItems.LEAD_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_HAMMER.get()), stack(PAItems.LEAD_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_EXCAVATOR.get()), stack(PAItems.LEAD_SICKLE.get()), vis);
        event.insertAfter(stack(Items.IRON_HOE), stack(PAItems.IRON_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.IRON_HAMMER.get()), stack(PAItems.IRON_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.IRON_EXCAVATOR.get()), stack(PAItems.IRON_SICKLE.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_HOE), stack(PAItems.GOLDEN_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.GOLDEN_HAMMER.get()), stack(PAItems.GOLDEN_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.GOLDEN_EXCAVATOR.get()), stack(PAItems.GOLDEN_SICKLE.get()), vis);
        event.insertAfter(stack(PAItems.GOLDEN_SICKLE.get()), stack(PAItems.LAPIS_SHOVEL.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_SHOVEL.get()), stack(PAItems.LAPIS_PICKAXE.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_PICKAXE.get()), stack(PAItems.LAPIS_AXE.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_AXE.get()), stack(PAItems.LAPIS_HOE.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_HOE.get()), stack(PAItems.LAPIS_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_HAMMER.get()), stack(PAItems.LAPIS_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_EXCAVATOR.get()), stack(PAItems.LAPIS_SICKLE.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_SICKLE.get()), stack(PAItems.REDSTONE_SHOVEL.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_SHOVEL.get()), stack(PAItems.REDSTONE_PICKAXE.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_PICKAXE.get()), stack(PAItems.REDSTONE_AXE.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_AXE.get()), stack(PAItems.REDSTONE_HOE.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_HOE.get()), stack(PAItems.REDSTONE_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_HAMMER.get()), stack(PAItems.REDSTONE_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_EXCAVATOR.get()), stack(PAItems.REDSTONE_SICKLE.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_SICKLE.get()), stack(PAItems.COBALT_SHOVEL.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_SHOVEL.get()), stack(PAItems.COBALT_PICKAXE.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_PICKAXE.get()), stack(PAItems.COBALT_AXE.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_AXE.get()), stack(PAItems.COBALT_HOE.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_HOE.get()), stack(PAItems.COBALT_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_HAMMER.get()), stack(PAItems.COBALT_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_EXCAVATOR.get()), stack(PAItems.COBALT_SICKLE.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_SICKLE.get()), stack(PAItems.EMERALD_SHOVEL.get()), vis);
        event.insertAfter(stack(PAItems.EMERALD_SHOVEL.get()), stack(PAItems.EMERALD_PICKAXE.get()), vis);
        event.insertAfter(stack(PAItems.EMERALD_PICKAXE.get()), stack(PAItems.EMERALD_AXE.get()), vis);
        event.insertAfter(stack(PAItems.EMERALD_AXE.get()), stack(PAItems.EMERALD_HOE.get()), vis);
        event.insertAfter(stack(PAItems.EMERALD_HOE.get()), stack(PAItems.EMERALD_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.EMERALD_HAMMER.get()), stack(PAItems.EMERALD_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.EMERALD_EXCAVATOR.get()), stack(PAItems.EMERALD_SICKLE.get()), vis);
        event.insertAfter(stack(Items.DIAMOND_HOE), stack(PAItems.DIAMOND_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.DIAMOND_HAMMER.get()), stack(PAItems.DIAMOND_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.DIAMOND_EXCAVATOR.get()), stack(PAItems.DIAMOND_SICKLE.get()), vis);
        event.insertAfter(stack(Items.NETHERITE_HOE), stack(PAItems.NETHERITE_HAMMER.get()), vis);
        event.insertAfter(stack(PAItems.NETHERITE_HAMMER.get()), stack(PAItems.NETHERITE_EXCAVATOR.get()), vis);
        event.insertAfter(stack(PAItems.NETHERITE_EXCAVATOR.get()), stack(PAItems.NETHERITE_SICKLE.get()), vis);
        event.insertAfter(stack(Items.SPYGLASS), stack(PAItems.BASIC_MAGNET.get()), vis);
        event.insertAfter(stack(PAItems.BASIC_MAGNET.get()), stack(PAItems.ADVANCED_MAGNET.get()), vis);
        event.insertAfter(stack(Items.PINK_BUNDLE), stack(PAItems.BASIC_BACKPACK.get()), vis);
        event.insertAfter(stack(PAItems.BASIC_BACKPACK.get()), stack(PAItems.REINFORCED_BACKPACK.get()), vis);
        event.insertAfter(stack(PAItems.REINFORCED_BACKPACK.get()), stack(PAItems.BASIC_QUIVER.get()), vis);
        event.insertAfter(stack(PAItems.BASIC_QUIVER.get()), stack(PAItems.REINFORCED_QUIVER.get()), vis);
    }

    private static void addCombat(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.COPPER_SWORD), stack(PAItems.LEAD_SWORD.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_SWORD), stack(PAItems.LAPIS_SWORD.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_SWORD.get()), stack(PAItems.REDSTONE_SWORD.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_SWORD.get()), stack(PAItems.COBALT_SWORD.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_SWORD.get()), stack(PAItems.EMERALD_SWORD.get()), vis);
        event.insertAfter(stack(Items.COPPER_SPEAR), stack(PAItems.LEAD_SPEAR.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_SPEAR), stack(PAItems.LAPIS_SPEAR.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_SPEAR.get()), stack(PAItems.REDSTONE_SPEAR.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_SPEAR.get()), stack(PAItems.COBALT_SPEAR.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_SPEAR.get()), stack(PAItems.EMERALD_SPEAR.get()), vis);
        event.insertAfter(stack(Items.COPPER_AXE), stack(PAItems.LEAD_AXE.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_AXE), stack(PAItems.LAPIS_AXE.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_AXE.get()), stack(PAItems.REDSTONE_AXE.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_AXE.get()), stack(PAItems.COBALT_AXE.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_AXE.get()), stack(PAItems.EMERALD_AXE.get()), vis);
        event.insertAfter(stack(Items.SHIELD), stack(PAItems.KEVLAR_SHIELD.get()), vis);
        event.insertAfter(stack(Items.CROSSBOW), stack(PAItems.COBALT_BOW.get()), vis);
        event.insertAfter(stack(Items.COPPER_BOOTS), stack(PAItems.LEAD_HELMET.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_HELMET.get()), stack(PAItems.LEAD_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_CHESTPLATE.get()), stack(PAItems.LEAD_LEGGINGS.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_LEGGINGS.get()), stack(PAItems.LEAD_BOOTS.get()), vis);
        event.insertAfter(stack(Items.CHAINMAIL_BOOTS), stack(PAItems.BALLISTIC_HELMET.get()), vis);
        event.insertAfter(stack(PAItems.BALLISTIC_HELMET.get()), stack(PAItems.KEVLAR_VEST.get()), vis);
        event.insertAfter(stack(PAItems.KEVLAR_VEST.get()), stack(PAItems.KEVLAR_PANTS.get()), vis);
        event.insertAfter(stack(PAItems.KEVLAR_PANTS.get()), stack(PAItems.KEVLAR_BOOTS.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_BOOTS), stack(PAItems.LAPIS_HELMET.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_HELMET.get()), stack(PAItems.LAPIS_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_CHESTPLATE.get()), stack(PAItems.LAPIS_LEGGINGS.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_LEGGINGS.get()), stack(PAItems.LAPIS_BOOTS.get()), vis);
        event.insertAfter(stack(PAItems.LAPIS_BOOTS.get()), stack(PAItems.REDSTONE_HELMET.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_HELMET.get()), stack(PAItems.REDSTONE_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_CHESTPLATE.get()), stack(PAItems.REDSTONE_LEGGINGS.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_LEGGINGS.get()), stack(PAItems.REDSTONE_BOOTS.get()), vis);
        event.insertAfter(stack(PAItems.REDSTONE_BOOTS.get()), stack(PAItems.COBALT_HELMET.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_HELMET.get()), stack(PAItems.COBALT_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_CHESTPLATE.get()), stack(PAItems.COBALT_LEGGINGS.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_LEGGINGS.get()), stack(PAItems.COBALT_BOOTS.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_BOOTS.get()), stack(PAItems.EMERALD_HELMET.get()), vis);
        event.insertAfter(stack(PAItems.EMERALD_HELMET.get()), stack(PAItems.EMERALD_CHESTPLATE.get()), vis);
        event.insertAfter(stack(PAItems.EMERALD_CHESTPLATE.get()), stack(PAItems.EMERALD_LEGGINGS.get()), vis);
        event.insertAfter(stack(PAItems.EMERALD_LEGGINGS.get()), stack(PAItems.EMERALD_BOOTS.get()), vis);
        event.insertAfter(stack(Items.COPPER_HORSE_ARMOR), stack(PAItems.LEAD_HORSE_ARMOR.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_HORSE_ARMOR), stack(PAItems.COBALT_HORSE_ARMOR.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_HORSE_ARMOR.get()), stack(PAItems.EMERALD_HORSE_ARMOR.get()), vis);
        event.insertAfter(stack(Items.COPPER_NAUTILUS_ARMOR), stack(PAItems.LEAD_NAUTILUS_ARMOR.get()), vis);
        event.insertAfter(stack(Items.GOLDEN_NAUTILUS_ARMOR), stack(PAItems.COBALT_NAUTILUS_ARMOR.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_NAUTILUS_ARMOR.get()), stack(PAItems.EMERALD_NAUTILUS_ARMOR.get()), vis);
    }

    private static void addNaturalBlocks(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.DEEPSLATE_COPPER_ORE), stack(PAItems.LEAD_ORE.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_ORE.get()), stack(PAItems.DEEPSLATE_LEAD_ORE.get()), vis);
        event.insertAfter(stack(Items.DEEPSLATE_GOLD_ORE), stack(PAItems.COBALT_ORE.get()), vis);
        event.insertAfter(stack(PAItems.COBALT_ORE.get()), stack(PAItems.DEEPSLATE_COBALT_ORE.get()), vis);
        event.insertAfter(stack(Items.RAW_COPPER_BLOCK), stack(PAItems.RAW_LEAD_BLOCK.get()), vis);
        event.insertAfter(stack(Items.RAW_GOLD_BLOCK), stack(PAItems.RAW_COBALT_BLOCK.get()), vis);
    }

    private static void addBuildingBlocks(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.LIGHT_WEIGHTED_PRESSURE_PLATE), stack(PAItems.LEAD_BLOCK.get()), vis);
        event.insertAfter(stack(PAItems.LEAD_BLOCK.get()), stack(PAItems.DENSE_WEIGHTED_PRESSURE_PLATE.get()), vis);
        event.insertAfter(stack(Items.GOLD_BLOCK), stack(PAItems.COBALT_BLOCK.get()), vis);
    }

    private static void addIngredients(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab.TabVisibility vis = CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS;
        event.insertAfter(stack(Items.RAW_COPPER), stack(PAItems.RAW_LEAD.get()), vis);
        event.insertAfter(stack(Items.RAW_GOLD), stack(PAItems.RAW_COBALT.get()), vis);
        event.insertAfter(stack(Items.COPPER_NUGGET), stack(PAItems.LEAD_NUGGET.get()), vis);
        event.insertAfter(stack(Items.GOLD_NUGGET), stack(PAItems.COBALT_NUGGET.get()), vis);
        event.insertAfter(stack(Items.COPPER_INGOT), stack(PAItems.LEAD_INGOT.get()), vis);
        event.insertAfter(stack(Items.GOLD_INGOT), stack(PAItems.COBALT_INGOT.get()), vis);
        event.insertAfter(stack(Items.STRING), stack(PAItems.KEVLAR_FIBER.get()), vis);
        event.insertAfter(stack(Items.LEATHER), stack(PAItems.KEVLAR_SHEET.get()), vis);
    }
}