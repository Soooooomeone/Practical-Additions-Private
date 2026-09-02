package com.danako.practical_additions.datagen.misc;

import com.danako.practical_additions.core.PracticalItems;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class PARecipeProvider extends RecipeProvider {
    private final HolderGetter<Item> items;

    public PARecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
        this.items = registries.lookupOrThrow(Registries.ITEM);
    }

    @Override
    protected void buildRecipes() {
        buildSmelting();
        buildStorageAndNuggets();
        buildTools();
        buildArmor();
        buildAOETools();
        buildMagnets();
        buildKevlar();
        buildBackpacks();
        buildQuivers();
        buildHorseArmors();
        buildNautilusArmors();
        buildMisc();
    }

    private void buildSmelting() {
        var leadSmeltInputs = java.util.List.<net.minecraft.world.level.ItemLike>of(PracticalItems.RAW_LEAD.get(), PracticalItems.LEAD_ORE.get(), PracticalItems.DEEPSLATE_LEAD_ORE.get());

        oreSmelting(leadSmeltInputs, RecipeCategory.MISC, PracticalItems.LEAD_INGOT.get(), 0.7F, 200, "lead_ingot");
        oreBlasting(leadSmeltInputs, RecipeCategory.MISC, PracticalItems.LEAD_INGOT.get(), 0.7F, 100, "lead_ingot");

        var cobaltSmeltInputs = java.util.List.<net.minecraft.world.level.ItemLike>of(PracticalItems.RAW_COBALT.get(), PracticalItems.COBALT_ORE.get(), PracticalItems.DEEPSLATE_COBALT_ORE.get());

        oreSmelting(cobaltSmeltInputs, RecipeCategory.MISC, PracticalItems.COBALT_INGOT.get(), 1.0F, 200, "cobalt_ingot");
        oreBlasting(cobaltSmeltInputs, RecipeCategory.MISC, PracticalItems.COBALT_INGOT.get(), 1.0F, 100, "cobalt_ingot");
    }

    private void buildStorageAndNuggets() {
        nineBlockStorageRecipes(RecipeCategory.MISC, PracticalItems.LEAD_NUGGET.get(), RecipeCategory.MISC, PracticalItems.LEAD_INGOT.get(), "practical_additions:lead_ingot_from_nuggets", null, "practical_additions:lead_nugget_from_lead_ingot", null);
        nineBlockStorageRecipes(RecipeCategory.MISC, PracticalItems.RAW_LEAD.get(), RecipeCategory.MISC, PracticalItems.RAW_LEAD_BLOCK.get(), "practical_additions:raw_lead_block", null, "practical_additions:raw_lead_from_raw_lead_block", null);
        nineBlockStorageRecipes(RecipeCategory.MISC, PracticalItems.LEAD_INGOT.get(), RecipeCategory.MISC, PracticalItems.LEAD_BLOCK.get(), "practical_additions:lead_block", null, "practical_additions:lead_ingot_from_lead_block", null);

        nineBlockStorageRecipes(RecipeCategory.MISC, PracticalItems.COBALT_NUGGET.get(), RecipeCategory.MISC, PracticalItems.COBALT_INGOT.get(), "practical_additions:cobalt_ingot_from_nuggets", null, "practical_additions:cobalt_nugget_from_cobalt_ingot", null);
        nineBlockStorageRecipes(RecipeCategory.MISC, PracticalItems.RAW_COBALT.get(), RecipeCategory.MISC, PracticalItems.RAW_COBALT_BLOCK.get(), "practical_additions:raw_cobalt_block", null, "practical_additions:raw_cobalt_from_raw_cobalt_block", null);
        nineBlockStorageRecipes(RecipeCategory.MISC, PracticalItems.COBALT_INGOT.get(), RecipeCategory.MISC, PracticalItems.COBALT_BLOCK.get(), "practical_additions:cobalt_block", null, "practical_additions:cobalt_ingot_from_cobalt_block", null);
    }


    private void buildTools() {
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LEAD_SWORD.get()).pattern("X").pattern("X").pattern("S").define('X', PracticalItems.LEAD_INGOT.get()).define('S', Items.STICK).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);


        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LEAD_PICKAXE.get()).pattern("XXX").pattern(" S ").pattern(" S ").define('X', PracticalItems.LEAD_INGOT.get()).define('S', Items.STICK).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);


        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LEAD_AXE.get()).pattern("XX").pattern("XS").pattern(" S").define('X', PracticalItems.LEAD_INGOT.get()).define('S', Items.STICK).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);


        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LEAD_SHOVEL.get()).pattern("X").pattern("S").pattern("S").define('X', PracticalItems.LEAD_INGOT.get()).define('S', Items.STICK).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);


        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LEAD_HOE.get()).pattern("XX").pattern(" S").pattern(" S").define('X', PracticalItems.LEAD_INGOT.get()).define('S', Items.STICK).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);


        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LEAD_SPEAR.get()).pattern("I").pattern("S").pattern("S").define('I', PracticalItems.LEAD_INGOT.get()).define('S', Items.STICK).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.COBALT_SWORD.get()).pattern("X").pattern("X").pattern("S").define('X', PracticalItems.COBALT_INGOT.get()).define('S', Items.STICK).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COBALT_PICKAXE.get()).pattern("XXX").pattern(" S ").pattern(" S ").define('X', PracticalItems.COBALT_INGOT.get()).define('S', Items.STICK).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COBALT_AXE.get()).pattern("XX").pattern("XS").pattern(" S").define('X', PracticalItems.COBALT_INGOT.get()).define('S', Items.STICK).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COBALT_SHOVEL.get()).pattern("X").pattern("S").pattern("S").define('X', PracticalItems.COBALT_INGOT.get()).define('S', Items.STICK).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COBALT_HOE.get()).pattern("XX").pattern(" S").pattern(" S").define('X', PracticalItems.COBALT_INGOT.get()).define('S', Items.STICK).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.COBALT_SPEAR.get()).pattern("I").pattern("S").pattern("S").define('I', PracticalItems.COBALT_INGOT.get()).define('S', Items.STICK).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.COBALT_BOW.get()).pattern(" SX").pattern("S X").pattern(" SX").define('X', PracticalItems.COBALT_INGOT.get()).define('S', Items.STRING).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.EMERALD_SWORD.get()).pattern("X").pattern("X").pattern("S").define('X', Items.EMERALD).define('S', Items.STICK).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.EMERALD_PICKAXE.get()).pattern("XXX").pattern(" S ").pattern(" S ").define('X', Items.EMERALD).define('S', Items.STICK).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.EMERALD_AXE.get()).pattern("XX").pattern("XS").pattern(" S").define('X', Items.EMERALD).define('S', Items.STICK).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.EMERALD_SHOVEL.get()).pattern("X").pattern("S").pattern("S").define('X', Items.EMERALD).define('S', Items.STICK).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.EMERALD_HOE.get()).pattern("XX").pattern(" S").pattern(" S").define('X', Items.EMERALD).define('S', Items.STICK).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.EMERALD_SPEAR.get()).pattern("I").pattern("S").pattern("S").define('I', Items.EMERALD).define('S', Items.STICK).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LAPIS_SWORD.get()).pattern("X").pattern("X").pattern("S").define('X', Items.LAPIS_LAZULI).define('S', Items.STICK).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LAPIS_PICKAXE.get()).pattern("XXX").pattern(" S ").pattern(" S ").define('X', Items.LAPIS_LAZULI).define('S', Items.STICK).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LAPIS_AXE.get()).pattern("XX").pattern("XS").pattern(" S").define('X', Items.LAPIS_LAZULI).define('S', Items.STICK).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LAPIS_SHOVEL.get()).pattern("X").pattern("S").pattern("S").define('X', Items.LAPIS_LAZULI).define('S', Items.STICK).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LAPIS_HOE.get()).pattern("XX").pattern(" S").pattern(" S").define('X', Items.LAPIS_LAZULI).define('S', Items.STICK).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LAPIS_SPEAR.get()).pattern("I").pattern("S").pattern("S").define('I', Items.LAPIS_LAZULI).define('S', Items.STICK).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.REDSTONE_SWORD.get()).pattern("X").pattern("X").pattern("S").define('X', Items.REDSTONE).define('S', Items.STICK).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.REDSTONE_PICKAXE.get()).pattern("XXX").pattern(" S ").pattern(" S ").define('X', Items.REDSTONE).define('S', Items.STICK).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.REDSTONE_AXE.get()).pattern("XX").pattern("XS").pattern(" S").define('X', Items.REDSTONE).define('S', Items.STICK).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.REDSTONE_SHOVEL.get()).pattern("X").pattern("S").pattern("S").define('X', Items.REDSTONE).define('S', Items.STICK).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.REDSTONE_HOE.get()).pattern("XX").pattern(" S").pattern(" S").define('X', Items.REDSTONE).define('S', Items.STICK).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.REDSTONE_SPEAR.get()).pattern("I").pattern("S").pattern("S").define('I', Items.REDSTONE).define('S', Items.STICK).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
    }

    private void buildArmor() {
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LEAD_HELMET.get()).pattern("XXX").pattern("X X").define('X', PracticalItems.LEAD_INGOT.get()).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LEAD_CHESTPLATE.get()).pattern("X X").pattern("XXX").pattern("XXX").define('X', PracticalItems.LEAD_INGOT.get()).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LEAD_LEGGINGS.get()).pattern("XXX").pattern("X X").pattern("X X").define('X', PracticalItems.LEAD_INGOT.get()).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LEAD_BOOTS.get()).pattern("X X").pattern("X X").define('X', PracticalItems.LEAD_INGOT.get()).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.COBALT_HELMET.get()).pattern("XXX").pattern("X X").define('X', PracticalItems.COBALT_INGOT.get()).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.COBALT_CHESTPLATE.get()).pattern("X X").pattern("XXX").pattern("XXX").define('X', PracticalItems.COBALT_INGOT.get()).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.COBALT_LEGGINGS.get()).pattern("XXX").pattern("X X").pattern("X X").define('X', PracticalItems.COBALT_INGOT.get()).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.COBALT_BOOTS.get()).pattern("X X").pattern("X X").define('X', PracticalItems.COBALT_INGOT.get()).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.EMERALD_HELMET.get()).pattern("XXX").pattern("X X").define('X', Items.EMERALD).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.EMERALD_CHESTPLATE.get()).pattern("X X").pattern("XXX").pattern("XXX").define('X', Items.EMERALD).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.EMERALD_LEGGINGS.get()).pattern("XXX").pattern("X X").pattern("X X").define('X', Items.EMERALD).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.EMERALD_BOOTS.get()).pattern("X X").pattern("X X").define('X', Items.EMERALD).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LAPIS_HELMET.get()).pattern("XXX").pattern("X X").define('X', Items.LAPIS_LAZULI).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LAPIS_CHESTPLATE.get()).pattern("X X").pattern("XXX").pattern("XXX").define('X', Items.LAPIS_LAZULI).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LAPIS_LEGGINGS.get()).pattern("XXX").pattern("X X").pattern("X X").define('X', Items.LAPIS_LAZULI).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LAPIS_BOOTS.get()).pattern("X X").pattern("X X").define('X', Items.LAPIS_LAZULI).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.REDSTONE_HELMET.get()).pattern("XXX").pattern("X X").define('X', Items.REDSTONE).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.REDSTONE_CHESTPLATE.get()).pattern("X X").pattern("XXX").pattern("XXX").define('X', Items.REDSTONE).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.REDSTONE_LEGGINGS.get()).pattern("XXX").pattern("X X").pattern("X X").define('X', Items.REDSTONE).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.REDSTONE_BOOTS.get()).pattern("X X").pattern("X X").define('X', Items.REDSTONE).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);

    }


    private void buildAOETools() {

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.GOLDEN_HAMMER.get()).pattern("MMM").pattern("MSM").pattern(" S ").define('M', Items.GOLD_INGOT).define('S', Items.STICK).unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COPPER_HAMMER.get()).pattern("MMM").pattern("MSM").pattern(" S ").define('M', Items.COPPER_INGOT).define('S', Items.STICK).unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LEAD_HAMMER.get()).pattern("MMM").pattern("MSM").pattern(" S ").define('M', PracticalItems.LEAD_INGOT.get()).define('S', Items.STICK).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.IRON_HAMMER.get()).pattern("MMM").pattern("MSM").pattern(" S ").define('M', Items.IRON_INGOT).define('S', Items.STICK).unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.DIAMOND_HAMMER.get()).pattern("MMM").pattern("MSM").pattern(" S ").define('M', Items.DIAMOND).define('S', Items.STICK).unlockedBy("has_diamond", has(Items.DIAMOND)).save(output);

        netheriteSmithing(PracticalItems.DIAMOND_HAMMER.get(), RecipeCategory.TOOLS, PracticalItems.NETHERITE_HAMMER.get());

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COBALT_HAMMER.get()).pattern("MMM").pattern("MSM").pattern(" S ").define('M', PracticalItems.COBALT_INGOT.get()).define('S', Items.STICK).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);


        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.GOLDEN_EXCAVATOR.get()).pattern(" M ").pattern("MSM").pattern(" S ").define('M', Items.GOLD_INGOT).define('S', Items.STICK).unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COPPER_EXCAVATOR.get()).pattern(" M ").pattern("MSM").pattern(" S ").define('M', Items.COPPER_INGOT).define('S', Items.STICK).unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LEAD_EXCAVATOR.get()).pattern(" M ").pattern("MSM").pattern(" S ").define('M', PracticalItems.LEAD_INGOT.get()).define('S', Items.STICK).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.IRON_EXCAVATOR.get()).pattern(" M ").pattern("MSM").pattern(" S ").define('M', Items.IRON_INGOT).define('S', Items.STICK).unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.DIAMOND_EXCAVATOR.get()).pattern(" M ").pattern("MSM").pattern(" S ").define('M', Items.DIAMOND).define('S', Items.STICK).unlockedBy("has_diamond", has(Items.DIAMOND)).save(output);

        netheriteSmithing(PracticalItems.DIAMOND_EXCAVATOR.get(), RecipeCategory.TOOLS, PracticalItems.NETHERITE_EXCAVATOR.get());

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COBALT_EXCAVATOR.get()).pattern(" M ").pattern("MSM").pattern(" S ").define('M', PracticalItems.COBALT_INGOT.get()).define('S', Items.STICK).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);


        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.GOLDEN_SICKLE.get()).pattern(" M ").pattern("  M").pattern("SM ").define('M', Items.GOLD_INGOT).define('S', Items.STICK).unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COPPER_SICKLE.get()).pattern(" M ").pattern("  M").pattern("SM ").define('M', Items.COPPER_INGOT).define('S', Items.STICK).unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LEAD_SICKLE.get()).pattern(" M ").pattern("  M").pattern("SM ").define('M', PracticalItems.LEAD_INGOT.get()).define('S', Items.STICK).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.IRON_SICKLE.get()).pattern(" M ").pattern("  M").pattern("SM ").define('M', Items.IRON_INGOT).define('S', Items.STICK).unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.DIAMOND_SICKLE.get()).pattern(" M ").pattern("  M").pattern("SM ").define('M', Items.DIAMOND).define('S', Items.STICK).unlockedBy("has_diamond", has(Items.DIAMOND)).save(output);

        netheriteSmithing(PracticalItems.DIAMOND_SICKLE.get(), RecipeCategory.TOOLS, PracticalItems.NETHERITE_SICKLE.get());

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.COBALT_SICKLE.get()).pattern(" M ").pattern("  M").pattern("SM ").define('M', PracticalItems.COBALT_INGOT.get()).define('S', Items.STICK).unlockedBy("has_cobalt_ingot", has(PracticalItems.COBALT_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.EMERALD_HAMMER.get()).pattern("MMM").pattern("MSM").pattern(" S ").define('M', Items.EMERALD).define('S', Items.STICK).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.EMERALD_EXCAVATOR.get()).pattern(" M ").pattern("MSM").pattern(" S ").define('M', Items.EMERALD).define('S', Items.STICK).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.EMERALD_SICKLE.get()).pattern(" M ").pattern("  M").pattern("SM ").define('M', Items.EMERALD).define('S', Items.STICK).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LAPIS_HAMMER.get()).pattern("MMM").pattern("MSM").pattern(" S ").define('M', Items.LAPIS_LAZULI).define('S', Items.STICK).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LAPIS_EXCAVATOR.get()).pattern(" M ").pattern("MSM").pattern(" S ").define('M', Items.LAPIS_LAZULI).define('S', Items.STICK).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LAPIS_SICKLE.get()).pattern(" M ").pattern("  M").pattern("SM ").define('M', Items.LAPIS_LAZULI).define('S', Items.STICK).unlockedBy("has_lapis", has(Items.LAPIS_LAZULI)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.REDSTONE_HAMMER.get()).pattern("MMM").pattern("MSM").pattern(" S ").define('M', Items.REDSTONE).define('S', Items.STICK).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.REDSTONE_EXCAVATOR.get()).pattern(" M ").pattern("MSM").pattern(" S ").define('M', Items.REDSTONE).define('S', Items.STICK).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.REDSTONE_SICKLE.get()).pattern(" M ").pattern("  M").pattern("SM ").define('M', Items.REDSTONE).define('S', Items.STICK).unlockedBy("has_redstone", has(Items.REDSTONE)).save(output);

    }

    private void buildMagnets() {
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.BASIC_MAGNET.get()).pattern("R L").pattern("I E").pattern("III").define('I', Items.IRON_INGOT).define('L', Items.LAPIS_LAZULI).define('R', Items.REDSTONE).define('E', Items.ENDER_PEARL).unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.ADVANCED_MAGNET.get()).pattern("D A").pattern("C B").pattern("CCC").define('C', PracticalItems.COBALT_INGOT.get()).define('D', Items.DIAMOND).define('A', Items.AMETHYST_SHARD).define('B', PracticalItems.BASIC_MAGNET.get()).unlockedBy("has_basic_magnet", has(PracticalItems.BASIC_MAGNET.get())).save(output);
    }

    private void buildKevlar() {
        ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, PracticalItems.KEVLAR_FIBER.get()).pattern("SSS").pattern("SGS").pattern("SSS").define('S', Items.STRING).define('G', Items.GOLD_NUGGET).unlockedBy("has_string", has(Items.STRING)).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, PracticalItems.KEVLAR_SHEET.get()).pattern("FF").pattern("FF").define('F', PracticalItems.KEVLAR_FIBER.get()).unlockedBy("has_kevlar_fiber", has(PracticalItems.KEVLAR_FIBER.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.BALLISTIC_HELMET.get()).pattern("XXX").pattern("X X").define('X', PracticalItems.KEVLAR_SHEET.get()).unlockedBy("has_kevlar_sheet", has(PracticalItems.KEVLAR_SHEET.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.KEVLAR_VEST.get()).pattern("X X").pattern("XXX").pattern("XXX").define('X', PracticalItems.KEVLAR_SHEET.get()).unlockedBy("has_kevlar_sheet", has(PracticalItems.KEVLAR_SHEET.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.KEVLAR_PANTS.get()).pattern("XXX").pattern("X X").pattern("X X").define('X', PracticalItems.KEVLAR_SHEET.get()).unlockedBy("has_kevlar_sheet", has(PracticalItems.KEVLAR_SHEET.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.KEVLAR_BOOTS.get()).pattern("X X").pattern("X X").define('X', PracticalItems.KEVLAR_SHEET.get()).unlockedBy("has_kevlar_sheet", has(PracticalItems.KEVLAR_SHEET.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.KEVLAR_SHIELD.get()).pattern("KKK").pattern("KSK").pattern(" K ").define('K', PracticalItems.KEVLAR_SHEET.get()).define('S', Items.SHIELD).unlockedBy("has_kevlar_sheet", has(PracticalItems.KEVLAR_SHEET.get())).save(output);
    }

    private void buildBackpacks() {
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.BASIC_BACKPACK.get()).pattern("LIL").pattern("LCL").pattern("LSL").define('L', Items.LEATHER).define('I', Items.IRON_INGOT).define('C', Items.CHEST).define('S', Items.STRING).unlockedBy("has_chest", has(Items.CHEST)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.REINFORCED_BACKPACK.get()).pattern("KKK").pattern("KBK").pattern("KKK").define('K', PracticalItems.KEVLAR_SHEET.get()).define('B', PracticalItems.BASIC_BACKPACK.get()).unlockedBy("has_basic_backpack", has(PracticalItems.BASIC_BACKPACK.get())).save(output);
    }

    private void buildQuivers() {
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.BASIC_QUIVER.get()).pattern(" SL").pattern("S L").pattern(" LL").define('S', Items.STRING).define('L', Items.LEATHER).unlockedBy("has_leather", has(Items.LEATHER)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.REINFORCED_QUIVER.get()).pattern("KKK").pattern("KQK").pattern("KKK").define('K', PracticalItems.KEVLAR_SHEET.get()).define('Q', PracticalItems.BASIC_QUIVER.get()).unlockedBy("has_basic_quiver", has(PracticalItems.BASIC_QUIVER.get())).save(output);
    }

    private void buildHorseArmors() {
        String[] pattern = {"X X", "XXX", "X X"};

        ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, Items.COPPER_HORSE_ARMOR).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.COPPER_INGOT).unlockedBy("has_copper", has(Items.COPPER_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, Items.IRON_HORSE_ARMOR).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.IRON_INGOT).unlockedBy("has_iron", has(Items.IRON_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, Items.GOLDEN_HORSE_ARMOR).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.GOLD_INGOT).unlockedBy("has_gold", has(Items.GOLD_INGOT)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, Items.DIAMOND_HORSE_ARMOR).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.DIAMOND).unlockedBy("has_diamond", has(Items.DIAMOND)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, PracticalItems.LEAD_HORSE_ARMOR.get()).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', PracticalItems.LEAD_INGOT.get()).unlockedBy("has_lead", has(PracticalItems.LEAD_INGOT.get())).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, PracticalItems.COBALT_HORSE_ARMOR.get()).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', PracticalItems.COBALT_INGOT.get()).unlockedBy("has_cobalt", has(PracticalItems.COBALT_INGOT.get())).save(output);

        netheriteSmithing(Items.DIAMOND_HORSE_ARMOR, RecipeCategory.MISC, Items.NETHERITE_HORSE_ARMOR);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, PracticalItems.EMERALD_HORSE_ARMOR.get()).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.EMERALD).unlockedBy("has_emerald", has(Items.EMERALD)).save(output);
    }

    private void buildNautilusArmors() {
        String[] pattern = {"XXX", "XNX", "XXX"};

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, Items.COPPER_NAUTILUS_ARMOR).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.COPPER_INGOT).define('N', Items.NAUTILUS_SHELL).unlockedBy("has_nautilus", has(Items.NAUTILUS_SHELL)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, Items.IRON_NAUTILUS_ARMOR).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.IRON_INGOT).define('N', Items.NAUTILUS_SHELL).unlockedBy("has_nautilus", has(Items.NAUTILUS_SHELL)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, Items.GOLDEN_NAUTILUS_ARMOR).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.GOLD_INGOT).define('N', Items.NAUTILUS_SHELL).unlockedBy("has_nautilus", has(Items.NAUTILUS_SHELL)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, Items.DIAMOND_NAUTILUS_ARMOR).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.DIAMOND).define('N', Items.NAUTILUS_SHELL).unlockedBy("has_nautilus", has(Items.NAUTILUS_SHELL)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.LEAD_NAUTILUS_ARMOR.get()).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', PracticalItems.LEAD_INGOT.get()).define('N', Items.NAUTILUS_SHELL).unlockedBy("has_nautilus", has(Items.NAUTILUS_SHELL)).save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.COBALT_NAUTILUS_ARMOR.get()).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', PracticalItems.COBALT_INGOT.get()).define('N', Items.NAUTILUS_SHELL).unlockedBy("has_nautilus", has(Items.NAUTILUS_SHELL)).save(output);

        netheriteSmithing(Items.DIAMOND_NAUTILUS_ARMOR, RecipeCategory.COMBAT, Items.NETHERITE_NAUTILUS_ARMOR);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.COMBAT, PracticalItems.EMERALD_NAUTILUS_ARMOR.get()).pattern(pattern[0]).pattern(pattern[1]).pattern(pattern[2]).define('X', Items.EMERALD).define('N', Items.NAUTILUS_SHELL).unlockedBy("has_nautilus", has(Items.NAUTILUS_SHELL)).save(output);
    }

    private void buildMisc() {
        ShapedRecipeBuilder.shaped(items, RecipeCategory.TOOLS, PracticalItems.LEAD_DIVING_BELT.get()).pattern("LLL").pattern("LCL").define('L', PracticalItems.LEAD_INGOT.get()).define('C', PracticalItems.COBALT_INGOT.get()).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);
        ShapedRecipeBuilder.shaped(items, RecipeCategory.REDSTONE, PracticalItems.DENSE_WEIGHTED_PRESSURE_PLATE.get()).pattern("XX").define('X', PracticalItems.LEAD_INGOT.get()).unlockedBy("has_lead_ingot", has(PracticalItems.LEAD_INGOT.get())).save(output);
    }


    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesLookup) {
            super(output, registriesLookup);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new PARecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Practical Additions Recipes";
        }
    }
}