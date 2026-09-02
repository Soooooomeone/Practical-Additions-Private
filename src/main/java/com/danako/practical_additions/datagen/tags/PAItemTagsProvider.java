package com.danako.practical_additions.datagen.tags;

import com.danako.practical_additions.PracticalAdditions;
import com.danako.practical_additions.core.PracticalItems;
import com.danako.practical_additions.core.PracticalTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class PAItemTagsProvider extends ItemTagsProvider {

    public PAItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, PracticalAdditions.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        addEnchantableTags();
        addVanillaTags();
        addNeoForgeConventionTags();
        addCustomTags();
    }

    private void addEnchantableTags() {

        tag(ItemTags.FIRE_ASPECT_ENCHANTABLE).add(PracticalItems.LEAD_SWORD.get()).add(PracticalItems.LEAD_SPEAR.get()).add(PracticalItems.COBALT_SWORD.get()).add(PracticalItems.COBALT_SPEAR.get());

        tag(ItemTags.MINING_ENCHANTABLE).add(PracticalItems.LEAD_PICKAXE.get()).add(PracticalItems.LEAD_AXE.get()).add(PracticalItems.LEAD_SHOVEL.get()).add(PracticalItems.LEAD_HOE.get()).add(PracticalItems.COBALT_PICKAXE.get()).add(PracticalItems.COBALT_AXE.get()).add(PracticalItems.COBALT_SHOVEL.get()).add(PracticalItems.COBALT_HOE.get()).add(PracticalItems.GOLDEN_HAMMER.get()).add(PracticalItems.COPPER_HAMMER.get()).add(PracticalItems.LEAD_HAMMER.get()).add(PracticalItems.IRON_HAMMER.get()).add(PracticalItems.COBALT_HAMMER.get()).add(PracticalItems.DIAMOND_HAMMER.get()).add(PracticalItems.NETHERITE_HAMMER.get()).add(PracticalItems.GOLDEN_EXCAVATOR.get()).add(PracticalItems.COPPER_EXCAVATOR.get()).add(PracticalItems.LEAD_EXCAVATOR.get()).add(PracticalItems.IRON_EXCAVATOR.get()).add(PracticalItems.COBALT_EXCAVATOR.get()).add(PracticalItems.DIAMOND_EXCAVATOR.get()).add(PracticalItems.NETHERITE_EXCAVATOR.get()).add(PracticalItems.GOLDEN_SICKLE.get()).add(PracticalItems.COPPER_SICKLE.get()).add(PracticalItems.LEAD_SICKLE.get()).add(PracticalItems.IRON_SICKLE.get()).add(PracticalItems.COBALT_SICKLE.get()).add(PracticalItems.DIAMOND_SICKLE.get()).add(PracticalItems.NETHERITE_SICKLE.get());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(PracticalItems.LEAD_PICKAXE.get()).add(PracticalItems.LEAD_AXE.get()).add(PracticalItems.LEAD_SHOVEL.get()).add(PracticalItems.LEAD_HOE.get()).add(PracticalItems.COBALT_PICKAXE.get()).add(PracticalItems.COBALT_AXE.get()).add(PracticalItems.COBALT_SHOVEL.get()).add(PracticalItems.COBALT_HOE.get()).add(PracticalItems.GOLDEN_HAMMER.get()).add(PracticalItems.COPPER_HAMMER.get()).add(PracticalItems.LEAD_HAMMER.get()).add(PracticalItems.IRON_HAMMER.get()).add(PracticalItems.COBALT_HAMMER.get()).add(PracticalItems.DIAMOND_HAMMER.get()).add(PracticalItems.NETHERITE_HAMMER.get()).add(PracticalItems.GOLDEN_EXCAVATOR.get()).add(PracticalItems.COPPER_EXCAVATOR.get()).add(PracticalItems.LEAD_EXCAVATOR.get()).add(PracticalItems.IRON_EXCAVATOR.get()).add(PracticalItems.COBALT_EXCAVATOR.get()).add(PracticalItems.DIAMOND_EXCAVATOR.get()).add(PracticalItems.NETHERITE_EXCAVATOR.get()).add(PracticalItems.GOLDEN_SICKLE.get()).add(PracticalItems.COPPER_SICKLE.get()).add(PracticalItems.LEAD_SICKLE.get()).add(PracticalItems.IRON_SICKLE.get()).add(PracticalItems.COBALT_SICKLE.get()).add(PracticalItems.DIAMOND_SICKLE.get()).add(PracticalItems.NETHERITE_SICKLE.get());

        tag(ItemTags.SWEEPING_ENCHANTABLE).add(PracticalItems.LEAD_SWORD.get()).add(PracticalItems.COBALT_SWORD.get());
        tag(ItemTags.LUNGE_ENCHANTABLE).add(PracticalItems.LEAD_SPEAR.get()).add(PracticalItems.COBALT_SPEAR.get());

        tag(ItemTags.MELEE_WEAPON_ENCHANTABLE).add(PracticalItems.LEAD_SWORD.get()).add(PracticalItems.LEAD_SPEAR.get()).add(PracticalItems.COBALT_SWORD.get()).add(PracticalItems.COBALT_SPEAR.get());

        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).add(PracticalItems.LEAD_AXE.get()).add(PracticalItems.COBALT_AXE.get());

        tag(ItemTags.ARMOR_ENCHANTABLE).add(PracticalItems.LEAD_HELMET.get()).add(PracticalItems.LEAD_CHESTPLATE.get()).add(PracticalItems.LEAD_LEGGINGS.get()).add(PracticalItems.LEAD_BOOTS.get()).add(PracticalItems.LEAD_HORSE_ARMOR.get()).add(PracticalItems.LEAD_NAUTILUS_ARMOR.get()).add(PracticalItems.COBALT_HELMET.get()).add(PracticalItems.COBALT_CHESTPLATE.get()).add(PracticalItems.COBALT_LEGGINGS.get()).add(PracticalItems.COBALT_BOOTS.get()).add(PracticalItems.COBALT_HORSE_ARMOR.get()).add(PracticalItems.COBALT_NAUTILUS_ARMOR.get()).add(PracticalItems.BALLISTIC_HELMET.get()).add(PracticalItems.KEVLAR_VEST.get()).add(PracticalItems.KEVLAR_PANTS.get()).add(PracticalItems.KEVLAR_BOOTS.get());

        tag(ItemTags.DURABILITY_ENCHANTABLE).add(PracticalItems.LEAD_SWORD.get()).add(PracticalItems.LEAD_SPEAR.get()).add(PracticalItems.LEAD_PICKAXE.get()).add(PracticalItems.LEAD_AXE.get()).add(PracticalItems.LEAD_SHOVEL.get()).add(PracticalItems.LEAD_HOE.get()).add(PracticalItems.LEAD_HELMET.get()).add(PracticalItems.LEAD_CHESTPLATE.get()).add(PracticalItems.LEAD_LEGGINGS.get()).add(PracticalItems.LEAD_BOOTS.get()).add(PracticalItems.LEAD_HORSE_ARMOR.get()).add(PracticalItems.LEAD_NAUTILUS_ARMOR.get()).add(PracticalItems.COBALT_SWORD.get()).add(PracticalItems.COBALT_SPEAR.get()).add(PracticalItems.COBALT_PICKAXE.get()).add(PracticalItems.COBALT_AXE.get()).add(PracticalItems.COBALT_SHOVEL.get()).add(PracticalItems.COBALT_HOE.get()).add(PracticalItems.COBALT_HELMET.get()).add(PracticalItems.COBALT_CHESTPLATE.get()).add(PracticalItems.COBALT_LEGGINGS.get()).add(PracticalItems.COBALT_BOOTS.get()).add(PracticalItems.COBALT_HORSE_ARMOR.get()).add(PracticalItems.COBALT_NAUTILUS_ARMOR.get()).add(PracticalItems.GOLDEN_HAMMER.get()).add(PracticalItems.COPPER_HAMMER.get()).add(PracticalItems.LEAD_HAMMER.get()).add(PracticalItems.IRON_HAMMER.get()).add(PracticalItems.COBALT_HAMMER.get()).add(PracticalItems.DIAMOND_HAMMER.get()).add(PracticalItems.NETHERITE_HAMMER.get()).add(PracticalItems.GOLDEN_EXCAVATOR.get()).add(PracticalItems.COPPER_EXCAVATOR.get()).add(PracticalItems.LEAD_EXCAVATOR.get()).add(PracticalItems.IRON_EXCAVATOR.get()).add(PracticalItems.COBALT_EXCAVATOR.get()).add(PracticalItems.DIAMOND_EXCAVATOR.get()).add(PracticalItems.NETHERITE_EXCAVATOR.get()).add(PracticalItems.GOLDEN_SICKLE.get()).add(PracticalItems.COPPER_SICKLE.get()).add(PracticalItems.LEAD_SICKLE.get()).add(PracticalItems.IRON_SICKLE.get()).add(PracticalItems.COBALT_SICKLE.get()).add(PracticalItems.DIAMOND_SICKLE.get()).add(PracticalItems.NETHERITE_SICKLE.get()).add(PracticalItems.BALLISTIC_HELMET.get()).add(PracticalItems.KEVLAR_VEST.get()).add(PracticalItems.KEVLAR_PANTS.get()).add(PracticalItems.KEVLAR_BOOTS.get());

        tag(ItemTags.VANISHING_ENCHANTABLE).add(PracticalItems.LEAD_SWORD.get()).add(PracticalItems.LEAD_SPEAR.get()).add(PracticalItems.LEAD_PICKAXE.get()).add(PracticalItems.LEAD_AXE.get()).add(PracticalItems.LEAD_SHOVEL.get()).add(PracticalItems.LEAD_HOE.get()).add(PracticalItems.LEAD_HELMET.get()).add(PracticalItems.LEAD_CHESTPLATE.get()).add(PracticalItems.LEAD_LEGGINGS.get()).add(PracticalItems.LEAD_BOOTS.get()).add(PracticalItems.LEAD_HORSE_ARMOR.get()).add(PracticalItems.LEAD_NAUTILUS_ARMOR.get()).add(PracticalItems.COBALT_SWORD.get()).add(PracticalItems.COBALT_SPEAR.get()).add(PracticalItems.COBALT_PICKAXE.get()).add(PracticalItems.COBALT_AXE.get()).add(PracticalItems.COBALT_SHOVEL.get()).add(PracticalItems.COBALT_HOE.get()).add(PracticalItems.COBALT_HELMET.get()).add(PracticalItems.COBALT_CHESTPLATE.get()).add(PracticalItems.COBALT_LEGGINGS.get()).add(PracticalItems.COBALT_BOOTS.get()).add(PracticalItems.COBALT_HORSE_ARMOR.get()).add(PracticalItems.COBALT_NAUTILUS_ARMOR.get()).add(PracticalItems.GOLDEN_HAMMER.get()).add(PracticalItems.COPPER_HAMMER.get()).add(PracticalItems.LEAD_HAMMER.get()).add(PracticalItems.IRON_HAMMER.get()).add(PracticalItems.COBALT_HAMMER.get()).add(PracticalItems.DIAMOND_HAMMER.get()).add(PracticalItems.NETHERITE_HAMMER.get()).add(PracticalItems.GOLDEN_EXCAVATOR.get()).add(PracticalItems.COPPER_EXCAVATOR.get()).add(PracticalItems.LEAD_EXCAVATOR.get()).add(PracticalItems.IRON_EXCAVATOR.get()).add(PracticalItems.COBALT_EXCAVATOR.get()).add(PracticalItems.DIAMOND_EXCAVATOR.get()).add(PracticalItems.NETHERITE_EXCAVATOR.get()).add(PracticalItems.GOLDEN_SICKLE.get()).add(PracticalItems.COPPER_SICKLE.get()).add(PracticalItems.LEAD_SICKLE.get()).add(PracticalItems.IRON_SICKLE.get()).add(PracticalItems.COBALT_SICKLE.get()).add(PracticalItems.DIAMOND_SICKLE.get()).add(PracticalItems.NETHERITE_SICKLE.get()).add(PracticalItems.BALLISTIC_HELMET.get()).add(PracticalItems.KEVLAR_VEST.get()).add(PracticalItems.KEVLAR_PANTS.get()).add(PracticalItems.KEVLAR_BOOTS.get());

        tag(ItemTags.HEAD_ARMOR_ENCHANTABLE).add(PracticalItems.LEAD_HELMET.get()).add(PracticalItems.COBALT_HELMET.get()).add(PracticalItems.BALLISTIC_HELMET.get());

        tag(ItemTags.CHEST_ARMOR_ENCHANTABLE).add(PracticalItems.LEAD_CHESTPLATE.get()).add(PracticalItems.COBALT_CHESTPLATE.get()).add(PracticalItems.KEVLAR_VEST.get());

        tag(ItemTags.LEG_ARMOR_ENCHANTABLE).add(PracticalItems.LEAD_LEGGINGS.get()).add(PracticalItems.COBALT_LEGGINGS.get()).add(PracticalItems.KEVLAR_PANTS.get());

        tag(ItemTags.FOOT_ARMOR_ENCHANTABLE).add(PracticalItems.LEAD_BOOTS.get()).add(PracticalItems.COBALT_BOOTS.get()).add(PracticalItems.KEVLAR_BOOTS.get());

        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(PracticalItems.LEAD_HELMET.get()).add(PracticalItems.LEAD_CHESTPLATE.get()).add(PracticalItems.LEAD_LEGGINGS.get()).add(PracticalItems.LEAD_BOOTS.get()).add(PracticalItems.LEAD_HORSE_ARMOR.get()).add(PracticalItems.LEAD_NAUTILUS_ARMOR.get()).add(PracticalItems.COBALT_HELMET.get()).add(PracticalItems.COBALT_CHESTPLATE.get()).add(PracticalItems.COBALT_LEGGINGS.get()).add(PracticalItems.COBALT_BOOTS.get()).add(PracticalItems.COBALT_HORSE_ARMOR.get()).add(PracticalItems.COBALT_NAUTILUS_ARMOR.get()).add(PracticalItems.BALLISTIC_HELMET.get()).add(PracticalItems.KEVLAR_VEST.get()).add(PracticalItems.KEVLAR_PANTS.get()).add(PracticalItems.KEVLAR_BOOTS.get());

        tag(ItemTags.DURABILITY_ENCHANTABLE).add(PracticalItems.KEVLAR_SHIELD.get());

        tag(ItemTags.BOW_ENCHANTABLE).add(PracticalItems.COBALT_BOW.get());
        tag(ItemTags.DURABILITY_ENCHANTABLE).add(PracticalItems.COBALT_BOW.get());
        tag(ItemTags.VANISHING_ENCHANTABLE).add(PracticalItems.COBALT_BOW.get());
        tag(ItemTags.VANISHING_ENCHANTABLE).add(PracticalItems.KEVLAR_SHIELD.get());

        tag(ItemTags.FIRE_ASPECT_ENCHANTABLE).add(PracticalItems.EMERALD_SWORD.get()).add(PracticalItems.EMERALD_SPEAR.get()).add(PracticalItems.LAPIS_SWORD.get()).add(PracticalItems.LAPIS_SPEAR.get()).add(PracticalItems.REDSTONE_SWORD.get()).add(PracticalItems.REDSTONE_SPEAR.get());

        tag(ItemTags.MINING_ENCHANTABLE).add(PracticalItems.EMERALD_PICKAXE.get()).add(PracticalItems.EMERALD_AXE.get()).add(PracticalItems.EMERALD_SHOVEL.get()).add(PracticalItems.EMERALD_HOE.get()).add(PracticalItems.EMERALD_HAMMER.get()).add(PracticalItems.EMERALD_EXCAVATOR.get()).add(PracticalItems.EMERALD_SICKLE.get()).add(PracticalItems.LAPIS_PICKAXE.get()).add(PracticalItems.LAPIS_AXE.get()).add(PracticalItems.LAPIS_SHOVEL.get()).add(PracticalItems.LAPIS_HOE.get()).add(PracticalItems.LAPIS_HAMMER.get()).add(PracticalItems.LAPIS_EXCAVATOR.get()).add(PracticalItems.LAPIS_SICKLE.get()).add(PracticalItems.REDSTONE_PICKAXE.get()).add(PracticalItems.REDSTONE_AXE.get()).add(PracticalItems.REDSTONE_SHOVEL.get()).add(PracticalItems.REDSTONE_HOE.get()).add(PracticalItems.REDSTONE_HAMMER.get()).add(PracticalItems.REDSTONE_EXCAVATOR.get()).add(PracticalItems.REDSTONE_SICKLE.get());

        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(PracticalItems.EMERALD_PICKAXE.get()).add(PracticalItems.EMERALD_AXE.get()).add(PracticalItems.EMERALD_SHOVEL.get()).add(PracticalItems.EMERALD_HOE.get()).add(PracticalItems.EMERALD_HAMMER.get()).add(PracticalItems.EMERALD_EXCAVATOR.get()).add(PracticalItems.EMERALD_SICKLE.get()).add(PracticalItems.LAPIS_PICKAXE.get()).add(PracticalItems.LAPIS_AXE.get()).add(PracticalItems.LAPIS_SHOVEL.get()).add(PracticalItems.LAPIS_HOE.get()).add(PracticalItems.LAPIS_HAMMER.get()).add(PracticalItems.LAPIS_EXCAVATOR.get()).add(PracticalItems.LAPIS_SICKLE.get()).add(PracticalItems.REDSTONE_PICKAXE.get()).add(PracticalItems.REDSTONE_AXE.get()).add(PracticalItems.REDSTONE_SHOVEL.get()).add(PracticalItems.REDSTONE_HOE.get()).add(PracticalItems.REDSTONE_HAMMER.get()).add(PracticalItems.REDSTONE_EXCAVATOR.get()).add(PracticalItems.REDSTONE_SICKLE.get());

        tag(ItemTags.SWEEPING_ENCHANTABLE).add(PracticalItems.EMERALD_SWORD.get()).add(PracticalItems.LAPIS_SWORD.get()).add(PracticalItems.REDSTONE_SWORD.get());
        tag(ItemTags.LUNGE_ENCHANTABLE).add(PracticalItems.EMERALD_SPEAR.get()).add(PracticalItems.LAPIS_SPEAR.get()).add(PracticalItems.REDSTONE_SPEAR.get());

        tag(ItemTags.MELEE_WEAPON_ENCHANTABLE).add(PracticalItems.EMERALD_SWORD.get()).add(PracticalItems.EMERALD_SPEAR.get()).add(PracticalItems.LAPIS_SWORD.get()).add(PracticalItems.LAPIS_SPEAR.get()).add(PracticalItems.REDSTONE_SWORD.get()).add(PracticalItems.REDSTONE_SPEAR.get());

        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).add(PracticalItems.EMERALD_AXE.get()).add(PracticalItems.LAPIS_AXE.get()).add(PracticalItems.REDSTONE_AXE.get());

        tag(ItemTags.ARMOR_ENCHANTABLE).add(PracticalItems.EMERALD_HELMET.get()).add(PracticalItems.EMERALD_CHESTPLATE.get()).add(PracticalItems.EMERALD_LEGGINGS.get()).add(PracticalItems.EMERALD_BOOTS.get()).add(PracticalItems.EMERALD_HORSE_ARMOR.get()).add(PracticalItems.EMERALD_NAUTILUS_ARMOR.get()).add(PracticalItems.LAPIS_HELMET.get()).add(PracticalItems.LAPIS_CHESTPLATE.get()).add(PracticalItems.LAPIS_LEGGINGS.get()).add(PracticalItems.LAPIS_BOOTS.get()).add(PracticalItems.REDSTONE_HELMET.get()).add(PracticalItems.REDSTONE_CHESTPLATE.get()).add(PracticalItems.REDSTONE_LEGGINGS.get()).add(PracticalItems.REDSTONE_BOOTS.get());

        tag(ItemTags.DURABILITY_ENCHANTABLE).add(PracticalItems.EMERALD_SWORD.get()).add(PracticalItems.EMERALD_SPEAR.get()).add(PracticalItems.EMERALD_PICKAXE.get()).add(PracticalItems.EMERALD_AXE.get()).add(PracticalItems.EMERALD_SHOVEL.get()).add(PracticalItems.EMERALD_HOE.get()).add(PracticalItems.EMERALD_HELMET.get()).add(PracticalItems.EMERALD_CHESTPLATE.get()).add(PracticalItems.EMERALD_LEGGINGS.get()).add(PracticalItems.EMERALD_BOOTS.get()).add(PracticalItems.EMERALD_HORSE_ARMOR.get()).add(PracticalItems.EMERALD_NAUTILUS_ARMOR.get()).add(PracticalItems.EMERALD_HAMMER.get()).add(PracticalItems.EMERALD_EXCAVATOR.get()).add(PracticalItems.EMERALD_SICKLE.get()).add(PracticalItems.LAPIS_SWORD.get()).add(PracticalItems.LAPIS_SPEAR.get()).add(PracticalItems.LAPIS_PICKAXE.get()).add(PracticalItems.LAPIS_AXE.get()).add(PracticalItems.LAPIS_SHOVEL.get()).add(PracticalItems.LAPIS_HOE.get()).add(PracticalItems.LAPIS_HELMET.get()).add(PracticalItems.LAPIS_CHESTPLATE.get()).add(PracticalItems.LAPIS_LEGGINGS.get()).add(PracticalItems.LAPIS_BOOTS.get()).add(PracticalItems.LAPIS_HAMMER.get()).add(PracticalItems.LAPIS_EXCAVATOR.get()).add(PracticalItems.LAPIS_SICKLE.get()).add(PracticalItems.REDSTONE_SWORD.get()).add(PracticalItems.REDSTONE_SPEAR.get()).add(PracticalItems.REDSTONE_PICKAXE.get()).add(PracticalItems.REDSTONE_AXE.get()).add(PracticalItems.REDSTONE_SHOVEL.get()).add(PracticalItems.REDSTONE_HOE.get()).add(PracticalItems.REDSTONE_HELMET.get()).add(PracticalItems.REDSTONE_CHESTPLATE.get()).add(PracticalItems.REDSTONE_LEGGINGS.get()).add(PracticalItems.REDSTONE_BOOTS.get()).add(PracticalItems.REDSTONE_HAMMER.get()).add(PracticalItems.REDSTONE_EXCAVATOR.get()).add(PracticalItems.REDSTONE_SICKLE.get());

        tag(ItemTags.VANISHING_ENCHANTABLE).add(PracticalItems.EMERALD_SWORD.get()).add(PracticalItems.EMERALD_SPEAR.get()).add(PracticalItems.EMERALD_PICKAXE.get()).add(PracticalItems.EMERALD_AXE.get()).add(PracticalItems.EMERALD_SHOVEL.get()).add(PracticalItems.EMERALD_HOE.get()).add(PracticalItems.EMERALD_HELMET.get()).add(PracticalItems.EMERALD_CHESTPLATE.get()).add(PracticalItems.EMERALD_LEGGINGS.get()).add(PracticalItems.EMERALD_BOOTS.get()).add(PracticalItems.EMERALD_HORSE_ARMOR.get()).add(PracticalItems.EMERALD_NAUTILUS_ARMOR.get()).add(PracticalItems.EMERALD_HAMMER.get()).add(PracticalItems.EMERALD_EXCAVATOR.get()).add(PracticalItems.EMERALD_SICKLE.get()).add(PracticalItems.LAPIS_SWORD.get()).add(PracticalItems.LAPIS_SPEAR.get()).add(PracticalItems.LAPIS_PICKAXE.get()).add(PracticalItems.LAPIS_AXE.get()).add(PracticalItems.LAPIS_SHOVEL.get()).add(PracticalItems.LAPIS_HOE.get()).add(PracticalItems.LAPIS_HELMET.get()).add(PracticalItems.LAPIS_CHESTPLATE.get()).add(PracticalItems.LAPIS_LEGGINGS.get()).add(PracticalItems.LAPIS_BOOTS.get()).add(PracticalItems.LAPIS_HAMMER.get()).add(PracticalItems.LAPIS_EXCAVATOR.get()).add(PracticalItems.LAPIS_SICKLE.get()).add(PracticalItems.REDSTONE_SWORD.get()).add(PracticalItems.REDSTONE_SPEAR.get()).add(PracticalItems.REDSTONE_PICKAXE.get()).add(PracticalItems.REDSTONE_AXE.get()).add(PracticalItems.REDSTONE_SHOVEL.get()).add(PracticalItems.REDSTONE_HOE.get()).add(PracticalItems.REDSTONE_HELMET.get()).add(PracticalItems.REDSTONE_CHESTPLATE.get()).add(PracticalItems.REDSTONE_LEGGINGS.get()).add(PracticalItems.REDSTONE_BOOTS.get()).add(PracticalItems.REDSTONE_HAMMER.get()).add(PracticalItems.REDSTONE_EXCAVATOR.get()).add(PracticalItems.REDSTONE_SICKLE.get());

        tag(ItemTags.HEAD_ARMOR_ENCHANTABLE).add(PracticalItems.EMERALD_HELMET.get()).add(PracticalItems.LAPIS_HELMET.get()).add(PracticalItems.REDSTONE_HELMET.get());
        tag(ItemTags.CHEST_ARMOR_ENCHANTABLE).add(PracticalItems.EMERALD_CHESTPLATE.get()).add(PracticalItems.LAPIS_CHESTPLATE.get()).add(PracticalItems.REDSTONE_CHESTPLATE.get());
        tag(ItemTags.LEG_ARMOR_ENCHANTABLE).add(PracticalItems.EMERALD_LEGGINGS.get()).add(PracticalItems.LAPIS_LEGGINGS.get()).add(PracticalItems.REDSTONE_LEGGINGS.get());
        tag(ItemTags.FOOT_ARMOR_ENCHANTABLE).add(PracticalItems.EMERALD_BOOTS.get()).add(PracticalItems.LAPIS_BOOTS.get()).add(PracticalItems.REDSTONE_BOOTS.get());

        tag(ItemTags.EQUIPPABLE_ENCHANTABLE).add(PracticalItems.EMERALD_HELMET.get()).add(PracticalItems.EMERALD_CHESTPLATE.get()).add(PracticalItems.EMERALD_LEGGINGS.get()).add(PracticalItems.EMERALD_BOOTS.get()).add(PracticalItems.EMERALD_HORSE_ARMOR.get()).add(PracticalItems.EMERALD_NAUTILUS_ARMOR.get()).add(PracticalItems.LAPIS_HELMET.get()).add(PracticalItems.LAPIS_CHESTPLATE.get()).add(PracticalItems.LAPIS_LEGGINGS.get()).add(PracticalItems.LAPIS_BOOTS.get()).add(PracticalItems.REDSTONE_HELMET.get()).add(PracticalItems.REDSTONE_CHESTPLATE.get()).add(PracticalItems.REDSTONE_LEGGINGS.get()).add(PracticalItems.REDSTONE_BOOTS.get());
    }

    private void addVanillaTags() {
        tag(ItemTags.HEAD_ARMOR).add(PracticalItems.LEAD_HELMET.get()).add(PracticalItems.COBALT_HELMET.get()).add(PracticalItems.BALLISTIC_HELMET.get());
        tag(ItemTags.CHEST_ARMOR).add(PracticalItems.LEAD_CHESTPLATE.get()).add(PracticalItems.COBALT_CHESTPLATE.get()).add(PracticalItems.KEVLAR_VEST.get());
        tag(ItemTags.LEG_ARMOR).add(PracticalItems.LEAD_LEGGINGS.get()).add(PracticalItems.COBALT_LEGGINGS.get()).add(PracticalItems.KEVLAR_PANTS.get());
        tag(ItemTags.FOOT_ARMOR).add(PracticalItems.LEAD_BOOTS.get()).add(PracticalItems.COBALT_BOOTS.get()).add(PracticalItems.KEVLAR_BOOTS.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(PracticalItems.LEAD_HELMET.get()).add(PracticalItems.LEAD_CHESTPLATE.get()).add(PracticalItems.LEAD_LEGGINGS.get()).add(PracticalItems.LEAD_BOOTS.get()).add(PracticalItems.COBALT_HELMET.get()).add(PracticalItems.COBALT_CHESTPLATE.get()).add(PracticalItems.COBALT_LEGGINGS.get()).add(PracticalItems.COBALT_BOOTS.get()).add(PracticalItems.BALLISTIC_HELMET.get()).add(PracticalItems.KEVLAR_VEST.get()).add(PracticalItems.KEVLAR_PANTS.get()).add(PracticalItems.KEVLAR_BOOTS.get());

        tag(ItemTags.SPEARS).add(PracticalItems.LEAD_SPEAR.get()).add(PracticalItems.COBALT_SPEAR.get());

        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(PracticalItems.LEAD_INGOT.get()).add(PracticalItems.COBALT_INGOT.get());

        tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(PracticalItems.LEAD_PICKAXE.get()).add(PracticalItems.COBALT_PICKAXE.get());

        tag(ItemTags.PICKAXES).add(PracticalItems.LEAD_PICKAXE.get()).add(PracticalItems.COBALT_PICKAXE.get());
        tag(ItemTags.AXES).add(PracticalItems.LEAD_AXE.get()).add(PracticalItems.COBALT_AXE.get());
        tag(ItemTags.SHOVELS).add(PracticalItems.LEAD_SHOVEL.get()).add(PracticalItems.COBALT_SHOVEL.get());
        tag(ItemTags.HOES).add(PracticalItems.LEAD_HOE.get()).add(PracticalItems.COBALT_HOE.get());
        tag(ItemTags.SWORDS).add(PracticalItems.LEAD_SWORD.get()).add(PracticalItems.COBALT_SWORD.get());

        tag(ItemTags.HEAD_ARMOR).add(PracticalItems.EMERALD_HELMET.get()).add(PracticalItems.LAPIS_HELMET.get()).add(PracticalItems.REDSTONE_HELMET.get());
        tag(ItemTags.CHEST_ARMOR).add(PracticalItems.EMERALD_CHESTPLATE.get()).add(PracticalItems.LAPIS_CHESTPLATE.get()).add(PracticalItems.REDSTONE_CHESTPLATE.get());
        tag(ItemTags.LEG_ARMOR).add(PracticalItems.EMERALD_LEGGINGS.get()).add(PracticalItems.LAPIS_LEGGINGS.get()).add(PracticalItems.REDSTONE_LEGGINGS.get());
        tag(ItemTags.FOOT_ARMOR).add(PracticalItems.EMERALD_BOOTS.get()).add(PracticalItems.LAPIS_BOOTS.get()).add(PracticalItems.REDSTONE_BOOTS.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(PracticalItems.EMERALD_HELMET.get()).add(PracticalItems.EMERALD_CHESTPLATE.get()).add(PracticalItems.EMERALD_LEGGINGS.get()).add(PracticalItems.EMERALD_BOOTS.get()).add(PracticalItems.LAPIS_HELMET.get()).add(PracticalItems.LAPIS_CHESTPLATE.get()).add(PracticalItems.LAPIS_LEGGINGS.get()).add(PracticalItems.LAPIS_BOOTS.get()).add(PracticalItems.REDSTONE_HELMET.get()).add(PracticalItems.REDSTONE_CHESTPLATE.get()).add(PracticalItems.REDSTONE_LEGGINGS.get()).add(PracticalItems.REDSTONE_BOOTS.get());

        tag(ItemTags.SPEARS).add(PracticalItems.EMERALD_SPEAR.get()).add(PracticalItems.LAPIS_SPEAR.get()).add(PracticalItems.REDSTONE_SPEAR.get());

        tag(ItemTags.PICKAXES).add(PracticalItems.EMERALD_PICKAXE.get()).add(PracticalItems.LAPIS_PICKAXE.get()).add(PracticalItems.REDSTONE_PICKAXE.get());
        tag(ItemTags.AXES).add(PracticalItems.EMERALD_AXE.get()).add(PracticalItems.LAPIS_AXE.get()).add(PracticalItems.REDSTONE_AXE.get());
        tag(ItemTags.SHOVELS).add(PracticalItems.EMERALD_SHOVEL.get()).add(PracticalItems.LAPIS_SHOVEL.get()).add(PracticalItems.REDSTONE_SHOVEL.get());
        tag(ItemTags.HOES).add(PracticalItems.EMERALD_HOE.get()).add(PracticalItems.LAPIS_HOE.get()).add(PracticalItems.REDSTONE_HOE.get());
        tag(ItemTags.SWORDS).add(PracticalItems.EMERALD_SWORD.get()).add(PracticalItems.LAPIS_SWORD.get()).add(PracticalItems.REDSTONE_SWORD.get());
    }

    private void addNeoForgeConventionTags() {
        tag(PracticalTags.Items.INGOTS_LEAD).add(PracticalItems.LEAD_INGOT.get());
        tag(commonTag("nuggets/lead")).add(PracticalItems.LEAD_NUGGET.get());
        tag(commonTag("raw_materials/lead")).add(PracticalItems.RAW_LEAD.get());
        tag(commonTag("ores/lead")).add(PracticalItems.LEAD_ORE.get()).add(PracticalItems.DEEPSLATE_LEAD_ORE.get());
        tag(commonTag("storage_blocks/lead")).add(PracticalItems.LEAD_BLOCK.get());
        tag(commonTag("storage_blocks/raw_lead")).add(PracticalItems.RAW_LEAD_BLOCK.get());

        tag(PracticalTags.Items.INGOTS_COBALT).add(PracticalItems.COBALT_INGOT.get());
        tag(commonTag("nuggets/cobalt")).add(PracticalItems.COBALT_NUGGET.get());
        tag(commonTag("raw_materials/cobalt")).add(PracticalItems.RAW_COBALT.get());
        tag(commonTag("ores/cobalt")).add(PracticalItems.COBALT_ORE.get()).add(PracticalItems.DEEPSLATE_COBALT_ORE.get());
        tag(commonTag("storage_blocks/cobalt")).add(PracticalItems.COBALT_BLOCK.get());
        tag(commonTag("storage_blocks/raw_cobalt")).add(PracticalItems.RAW_COBALT_BLOCK.get());

        tag(Tags.Items.INGOTS).addTag(PracticalTags.Items.INGOTS_LEAD).addTag(PracticalTags.Items.INGOTS_COBALT);
        tag(Tags.Items.NUGGETS).addTag(commonTag("nuggets/lead")).addTag(commonTag("nuggets/cobalt"));
        tag(Tags.Items.RAW_MATERIALS).addTag(commonTag("raw_materials/lead")).addTag(commonTag("raw_materials/cobalt"));
        tag(Tags.Items.ORES).addTag(commonTag("ores/lead")).addTag(commonTag("ores/cobalt"));
        tag(Tags.Items.STORAGE_BLOCKS).addTag(commonTag("storage_blocks/lead")).addTag(commonTag("storage_blocks/raw_lead")).addTag(commonTag("storage_blocks/cobalt")).addTag(commonTag("storage_blocks/raw_cobalt"));

        tag(Tags.Items.ORES_IN_GROUND_STONE).add(PracticalItems.LEAD_ORE.get()).add(PracticalItems.COBALT_ORE.get());
        tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(PracticalItems.DEEPSLATE_LEAD_ORE.get()).add(PracticalItems.DEEPSLATE_COBALT_ORE.get());
        tag(Tags.Items.ORE_RATES_SINGULAR).add(PracticalItems.LEAD_ORE.get()).add(PracticalItems.DEEPSLATE_LEAD_ORE.get()).add(PracticalItems.COBALT_ORE.get()).add(PracticalItems.DEEPSLATE_COBALT_ORE.get());

        tag(Tags.Items.TOOLS).add(PracticalItems.LEAD_SWORD.get()).add(PracticalItems.LEAD_PICKAXE.get()).add(PracticalItems.LEAD_AXE.get()).add(PracticalItems.LEAD_SHOVEL.get()).add(PracticalItems.LEAD_HOE.get()).add(PracticalItems.COBALT_SWORD.get()).add(PracticalItems.COBALT_PICKAXE.get()).add(PracticalItems.COBALT_AXE.get()).add(PracticalItems.COBALT_SHOVEL.get()).add(PracticalItems.COBALT_HOE.get()).add(PracticalItems.GOLDEN_HAMMER.get()).add(PracticalItems.COPPER_HAMMER.get()).add(PracticalItems.LEAD_HAMMER.get()).add(PracticalItems.IRON_HAMMER.get()).add(PracticalItems.COBALT_HAMMER.get()).add(PracticalItems.DIAMOND_HAMMER.get()).add(PracticalItems.NETHERITE_HAMMER.get()).add(PracticalItems.GOLDEN_EXCAVATOR.get()).add(PracticalItems.COPPER_EXCAVATOR.get()).add(PracticalItems.LEAD_EXCAVATOR.get()).add(PracticalItems.IRON_EXCAVATOR.get()).add(PracticalItems.COBALT_EXCAVATOR.get()).add(PracticalItems.DIAMOND_EXCAVATOR.get()).add(PracticalItems.NETHERITE_EXCAVATOR.get()).add(PracticalItems.GOLDEN_SICKLE.get()).add(PracticalItems.COPPER_SICKLE.get()).add(PracticalItems.LEAD_SICKLE.get()).add(PracticalItems.IRON_SICKLE.get()).add(PracticalItems.COBALT_SICKLE.get()).add(PracticalItems.DIAMOND_SICKLE.get()).add(PracticalItems.NETHERITE_SICKLE.get());

        tag(Tags.Items.ARMORS).add(PracticalItems.LEAD_HELMET.get()).add(PracticalItems.LEAD_CHESTPLATE.get()).add(PracticalItems.LEAD_LEGGINGS.get()).add(PracticalItems.LEAD_BOOTS.get()).add(PracticalItems.COBALT_HELMET.get()).add(PracticalItems.COBALT_CHESTPLATE.get()).add(PracticalItems.COBALT_LEGGINGS.get()).add(PracticalItems.COBALT_BOOTS.get()).add(PracticalItems.BALLISTIC_HELMET.get()).add(PracticalItems.KEVLAR_VEST.get()).add(PracticalItems.KEVLAR_PANTS.get()).add(PracticalItems.KEVLAR_BOOTS.get());

        tag(commonTag("tools/mining_tool")).add(PracticalItems.LEAD_PICKAXE.get()).add(PracticalItems.COBALT_PICKAXE.get()).add(PracticalItems.GOLDEN_HAMMER.get()).add(PracticalItems.COPPER_HAMMER.get()).add(PracticalItems.LEAD_HAMMER.get()).add(PracticalItems.IRON_HAMMER.get()).add(PracticalItems.COBALT_HAMMER.get()).add(PracticalItems.DIAMOND_HAMMER.get()).add(PracticalItems.NETHERITE_HAMMER.get()).add(PracticalItems.GOLDEN_EXCAVATOR.get()).add(PracticalItems.COPPER_EXCAVATOR.get()).add(PracticalItems.LEAD_EXCAVATOR.get()).add(PracticalItems.IRON_EXCAVATOR.get()).add(PracticalItems.COBALT_EXCAVATOR.get()).add(PracticalItems.DIAMOND_EXCAVATOR.get()).add(PracticalItems.NETHERITE_EXCAVATOR.get());

        tag(commonTag("tools/melee_weapon")).add(PracticalItems.LEAD_SWORD.get()).add(PracticalItems.LEAD_AXE.get()).add(PracticalItems.COBALT_SWORD.get()).add(PracticalItems.COBALT_AXE.get());

        tag(commonTag("tools/ranged_weapon")).add(PracticalItems.COBALT_BOW.get());
        tag(Tags.Items.TOOLS).add(PracticalItems.COBALT_BOW.get());

        tag(modTag("tools/hammers")).add(PracticalItems.GOLDEN_HAMMER.get()).add(PracticalItems.COPPER_HAMMER.get()).add(PracticalItems.LEAD_HAMMER.get()).add(PracticalItems.IRON_HAMMER.get()).add(PracticalItems.COBALT_HAMMER.get()).add(PracticalItems.DIAMOND_HAMMER.get()).add(PracticalItems.NETHERITE_HAMMER.get());

        tag(modTag("tools/excavators")).add(PracticalItems.GOLDEN_EXCAVATOR.get()).add(PracticalItems.COPPER_EXCAVATOR.get()).add(PracticalItems.LEAD_EXCAVATOR.get()).add(PracticalItems.IRON_EXCAVATOR.get()).add(PracticalItems.COBALT_EXCAVATOR.get()).add(PracticalItems.DIAMOND_EXCAVATOR.get()).add(PracticalItems.NETHERITE_EXCAVATOR.get());

        tag(modTag("tools/sickles")).add(PracticalItems.GOLDEN_SICKLE.get()).add(PracticalItems.COPPER_SICKLE.get()).add(PracticalItems.LEAD_SICKLE.get()).add(PracticalItems.IRON_SICKLE.get()).add(PracticalItems.COBALT_SICKLE.get()).add(PracticalItems.DIAMOND_SICKLE.get()).add(PracticalItems.NETHERITE_SICKLE.get());

        tag(commonTag("shields")).add(PracticalItems.KEVLAR_SHIELD.get());

        tag(Tags.Items.TOOLS).add(PracticalItems.EMERALD_SWORD.get()).add(PracticalItems.EMERALD_PICKAXE.get()).add(PracticalItems.EMERALD_AXE.get()).add(PracticalItems.EMERALD_SHOVEL.get()).add(PracticalItems.EMERALD_HOE.get()).add(PracticalItems.EMERALD_HAMMER.get()).add(PracticalItems.EMERALD_EXCAVATOR.get()).add(PracticalItems.EMERALD_SICKLE.get()).add(PracticalItems.LAPIS_SWORD.get()).add(PracticalItems.LAPIS_PICKAXE.get()).add(PracticalItems.LAPIS_AXE.get()).add(PracticalItems.LAPIS_SHOVEL.get()).add(PracticalItems.LAPIS_HOE.get()).add(PracticalItems.LAPIS_HAMMER.get()).add(PracticalItems.LAPIS_EXCAVATOR.get()).add(PracticalItems.LAPIS_SICKLE.get()).add(PracticalItems.REDSTONE_SWORD.get()).add(PracticalItems.REDSTONE_PICKAXE.get()).add(PracticalItems.REDSTONE_AXE.get()).add(PracticalItems.REDSTONE_SHOVEL.get()).add(PracticalItems.REDSTONE_HOE.get()).add(PracticalItems.REDSTONE_HAMMER.get()).add(PracticalItems.REDSTONE_EXCAVATOR.get()).add(PracticalItems.REDSTONE_SICKLE.get());

        tag(Tags.Items.ARMORS).add(PracticalItems.EMERALD_HELMET.get()).add(PracticalItems.EMERALD_CHESTPLATE.get()).add(PracticalItems.EMERALD_LEGGINGS.get()).add(PracticalItems.EMERALD_BOOTS.get()).add(PracticalItems.LAPIS_HELMET.get()).add(PracticalItems.LAPIS_CHESTPLATE.get()).add(PracticalItems.LAPIS_LEGGINGS.get()).add(PracticalItems.LAPIS_BOOTS.get()).add(PracticalItems.REDSTONE_HELMET.get()).add(PracticalItems.REDSTONE_CHESTPLATE.get()).add(PracticalItems.REDSTONE_LEGGINGS.get()).add(PracticalItems.REDSTONE_BOOTS.get());

        tag(commonTag("tools/mining_tool")).add(PracticalItems.EMERALD_PICKAXE.get()).add(PracticalItems.EMERALD_HAMMER.get()).add(PracticalItems.EMERALD_EXCAVATOR.get()).add(PracticalItems.LAPIS_PICKAXE.get()).add(PracticalItems.LAPIS_HAMMER.get()).add(PracticalItems.LAPIS_EXCAVATOR.get()).add(PracticalItems.REDSTONE_PICKAXE.get()).add(PracticalItems.REDSTONE_HAMMER.get()).add(PracticalItems.REDSTONE_EXCAVATOR.get());

        tag(commonTag("tools/melee_weapon")).add(PracticalItems.EMERALD_SWORD.get()).add(PracticalItems.EMERALD_AXE.get()).add(PracticalItems.LAPIS_SWORD.get()).add(PracticalItems.LAPIS_AXE.get()).add(PracticalItems.REDSTONE_SWORD.get()).add(PracticalItems.REDSTONE_AXE.get());

        tag(modTag("tools/hammers")).add(PracticalItems.EMERALD_HAMMER.get()).add(PracticalItems.LAPIS_HAMMER.get()).add(PracticalItems.REDSTONE_HAMMER.get());
        tag(modTag("tools/excavators")).add(PracticalItems.EMERALD_EXCAVATOR.get()).add(PracticalItems.LAPIS_EXCAVATOR.get()).add(PracticalItems.REDSTONE_EXCAVATOR.get());
        tag(modTag("tools/sickles")).add(PracticalItems.EMERALD_SICKLE.get()).add(PracticalItems.LAPIS_SICKLE.get()).add(PracticalItems.REDSTONE_SICKLE.get());
    }

    private void addCustomTags() {
        tag(PracticalTags.Items.REPAIRS_LEAD_ARMOR).add(PracticalItems.LEAD_INGOT.get());
        tag(PracticalTags.Items.LEAD_TOOL_MATERIALS).add(PracticalItems.LEAD_INGOT.get());
        tag(PracticalTags.Items.REPAIRS_COBALT_ARMOR).add(PracticalItems.COBALT_INGOT.get());
        tag(PracticalTags.Items.COBALT_TOOL_MATERIALS).add(PracticalItems.COBALT_INGOT.get());
        tag(PracticalTags.Items.REPAIRS_KEVLAR_ARMOR).add(PracticalItems.KEVLAR_SHEET.get());
        TagKey<Item> curioTag = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("curios", "curio"));
        this.tag(curioTag).add(PracticalItems.BASIC_MAGNET.get()).add(PracticalItems.ADVANCED_MAGNET.get());

        TagKey<Item> curioBackTag = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("curios", "back"));
        this.tag(curioBackTag).add(PracticalItems.BASIC_BACKPACK.get()).add(PracticalItems.REINFORCED_BACKPACK.get());

        TagKey<Item> curioBeltTag = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("curios", "belt"));
        this.tag(curioBeltTag).add(PracticalItems.BASIC_QUIVER.get()).add(PracticalItems.REINFORCED_QUIVER.get()).add(PracticalItems.LEAD_DIVING_BELT.get());

        tag(PracticalTags.Items.REPAIRS_EMERALD_ARMOR).add(Items.EMERALD);
        tag(PracticalTags.Items.EMERALD_TOOL_MATERIALS).add(Items.EMERALD);

        tag(PracticalTags.Items.REPAIRS_LAPIS_ARMOR).add(Items.LAPIS_LAZULI);
        tag(PracticalTags.Items.LAPIS_TOOL_MATERIALS).add(Items.LAPIS_LAZULI);

        tag(PracticalTags.Items.REPAIRS_REDSTONE_ARMOR).add(Items.REDSTONE);
        tag(PracticalTags.Items.REDSTONE_TOOL_MATERIALS).add(Items.REDSTONE);
    }


    private static TagKey<Item> commonTag(String path) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("c", path));
    }

    private static TagKey<Item> modTag(String path) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(PracticalAdditions.MODID, path));
    }
}