package com.danako.practical_additions.datagen.model;

import com.danako.practical_additions.PracticalAdditions;
import com.danako.practical_additions.core.PracticalBlocks;
import com.danako.practical_additions.core.PracticalItems;
import com.danako.practical_additions.material.kevlar.client.KevlarShieldSpecialRenderer;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.SpecialModelWrapper;
import net.minecraft.client.renderer.item.properties.numeric.UseDuration;
import net.minecraft.client.renderer.item.properties.select.DisplayContext;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;


public class PAModelProvider extends ModelProvider {

    public PAModelProvider(PackOutput output) {
        super(output, PracticalAdditions.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        registerBlockModels(blockModels);
        registerItemModels(itemModels);
    }

    private void registerBlockModels(BlockModelGenerators blockModels) {

        blockModels.createTrivialCube(PracticalBlocks.LEAD_ORE.get());
        blockModels.createTrivialCube(PracticalBlocks.DEEPSLATE_LEAD_ORE.get());
        blockModels.createTrivialCube(PracticalBlocks.RAW_LEAD_BLOCK.get());
        blockModels.createTrivialCube(PracticalBlocks.LEAD_BLOCK.get());
        blockModels.createWeightedPressurePlate(PracticalBlocks.DENSE_WEIGHTED_PRESSURE_PLATE.get(), PracticalBlocks.LEAD_BLOCK.get());
        blockModels.createTrivialCube(PracticalBlocks.COBALT_ORE.get());
        blockModels.createTrivialCube(PracticalBlocks.DEEPSLATE_COBALT_ORE.get());
        blockModels.createTrivialCube(PracticalBlocks.RAW_COBALT_BLOCK.get());
        blockModels.createTrivialCube(PracticalBlocks.COBALT_BLOCK.get());
    }

    private void registerItemModels(ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(PracticalItems.LEAD_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.RAW_LEAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.RAW_COBALT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        registerSpearModel(itemModels, PracticalItems.LEAD_SPEAR.get());
        registerSpearModel(itemModels, PracticalItems.COBALT_SPEAR.get());
        itemModels.generateFlatItem(PracticalItems.LEAD_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_DIVING_BELT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_NAUTILUS_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_NAUTILUS_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.GOLDEN_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COPPER_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.IRON_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.DIAMOND_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.NETHERITE_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.GOLDEN_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COPPER_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.IRON_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.DIAMOND_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.NETHERITE_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.GOLDEN_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COPPER_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LEAD_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.IRON_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.COBALT_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.DIAMOND_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.NETHERITE_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        registerSpearModel(itemModels, PracticalItems.EMERALD_SPEAR.get());
        itemModels.generateFlatItem(PracticalItems.EMERALD_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_NAUTILUS_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.EMERALD_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        registerSpearModel(itemModels, PracticalItems.LAPIS_SPEAR.get());
        itemModels.generateFlatItem(PracticalItems.LAPIS_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.LAPIS_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        registerSpearModel(itemModels, PracticalItems.REDSTONE_SPEAR.get());
        itemModels.generateFlatItem(PracticalItems.REDSTONE_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_EXCAVATOR.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.REDSTONE_SICKLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(PracticalItems.BASIC_MAGNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.ADVANCED_MAGNET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.KEVLAR_FIBER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.KEVLAR_SHEET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.BALLISTIC_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.KEVLAR_VEST.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.KEVLAR_PANTS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.KEVLAR_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.BASIC_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.REINFORCED_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.BASIC_QUIVER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(PracticalItems.REINFORCED_QUIVER.get(), ModelTemplates.FLAT_ITEM);
        registerShieldModel(itemModels, PracticalItems.KEVLAR_SHIELD.get());

        registerCobaltBowModel(itemModels);
    }

    private void registerCobaltBowModel(ItemModelGenerators itemModels) {
        Item bowItem = PracticalItems.COBALT_BOW.get();
        Identifier idleModelId = ModelLocationUtils.getModelLocation(bowItem);
        Identifier texture = TextureMapping.getItemTexture(bowItem);

        itemModels.modelOutput.accept(idleModelId, () -> {
            JsonObject json = new JsonObject();
            json.addProperty("parent", "item/generated");

            JsonObject textures = new JsonObject();
            textures.addProperty("layer0", texture.toString());
            json.add("textures", textures);

            JsonObject display = new JsonObject();
            display.add("thirdperson_righthand", displayEntry(new float[]{-80, 260, -40}, new float[]{-1, -2, 2.5f}, new float[]{0.9f, 0.9f, 0.9f}));
            display.add("thirdperson_lefthand", displayEntry(new float[]{-80, -280, 40}, new float[]{-1, -2, 2.5f}, new float[]{0.9f, 0.9f, 0.9f}));
            display.add("firstperson_righthand", displayEntry(new float[]{0, -90, 25}, new float[]{1.13f, 3.2f, 1.13f}, new float[]{0.68f, 0.68f, 0.68f}));
            display.add("firstperson_lefthand", displayEntry(new float[]{0, 90, -25}, new float[]{1.13f, 3.2f, 1.13f}, new float[]{0.68f, 0.68f, 0.68f}));
            json.add("display", display);

            return json;
        });

        ItemModel.Unbaked idleModel = ItemModelUtils.plainModel(idleModelId);
        ItemModel.Unbaked pulling0 = ItemModelUtils.plainModel(itemModels.createFlatItemModel(bowItem, "_pulling_0", ModelTemplates.BOW));
        ItemModel.Unbaked pulling1 = ItemModelUtils.plainModel(itemModels.createFlatItemModel(bowItem, "_pulling_1", ModelTemplates.BOW));
        ItemModel.Unbaked pulling2 = ItemModelUtils.plainModel(itemModels.createFlatItemModel(bowItem, "_pulling_2", ModelTemplates.BOW));

        itemModels.itemModelOutput.accept(bowItem, ItemModelUtils.conditional(ItemModelUtils.isUsingItem(), ItemModelUtils.rangeSelect(new UseDuration(false), 0.1F, pulling0, ItemModelUtils.override(pulling1, 0.65F), ItemModelUtils.override(pulling2, 0.9F)), idleModel));
    }

    private JsonObject displayEntry(float[] rotation, float[] translation, float[] scale) {
        JsonObject obj = new JsonObject();
        obj.add("rotation", toArray(rotation));
        obj.add("translation", toArray(translation));
        obj.add("scale", toArray(scale));
        return obj;
    }

    private JsonArray toArray(float[] values) {
        JsonArray arr = new JsonArray();
        for (float v : values) arr.add(v);
        return arr;
    }

    private void registerShieldModel(ItemModelGenerators itemModels, Item shieldItem) {
        Identifier particle = Identifier.fromNamespaceAndPath("minecraft", "block/dark_oak_planks");

        Identifier idleModelId = Identifier.fromNamespaceAndPath(PracticalAdditions.MODID, "item/kevlar_shield");
        Identifier blockingModelId = Identifier.fromNamespaceAndPath(PracticalAdditions.MODID, "item/kevlar_shield_blocking");

        ShieldDisplayModel idleModel = ShieldDisplayModel.builder(particle).add("thirdperson_righthand", new float[]{0, 90, 0}, new float[]{10, 6, -4}, new float[]{1, 1, 1}).add("thirdperson_lefthand", new float[]{0, 90, 0}, new float[]{10, 6, 12}, new float[]{1, 1, 1}).add("firstperson_righthand", new float[]{0, 180, 5}, new float[]{-10, 2, -10}, new float[]{1.25f, 1.25f, 1.25f}).add("firstperson_lefthand", new float[]{0, 180, 5}, new float[]{10, 0, -10}, new float[]{1.25f, 1.25f, 1.25f}).add("gui", new float[]{15, -25, -5}, new float[]{2, 3, 0}, new float[]{0.65f, 0.65f, 0.65f}).add("fixed", new float[]{0, 180, 0}, new float[]{-4.5f, 4.5f, -5}, new float[]{0.55f, 0.55f, 0.55f}).add("ground", new float[]{0, 0, 0}, new float[]{2, 4, 2}, new float[]{0.25f, 0.25f, 0.25f}).build();

        ShieldDisplayModel blockingModel = ShieldDisplayModel.builder(particle).add("thirdperson_righthand", new float[]{45, 155, 0}, new float[]{-3.49f, 11, -2}, new float[]{1, 1, 1}).add("thirdperson_lefthand", new float[]{45, 155, 0}, new float[]{11.51f, 7, 2.5f}, new float[]{1, 1, 1}).add("firstperson_righthand", new float[]{0, 180, -5}, new float[]{-15, 5, -11}, new float[]{1.25f, 1.25f, 1.25f}).add("firstperson_lefthand", new float[]{0, 180, -5}, new float[]{5, 5, -11}, new float[]{1.25f, 1.25f, 1.25f}).add("gui", new float[]{15, -25, -5}, new float[]{2, 3, 0}, new float[]{0.65f, 0.65f, 0.65f}).build();

        itemModels.modelOutput.accept(idleModelId, idleModel);
        itemModels.modelOutput.accept(blockingModelId, blockingModel);

        ItemModel.Unbaked idleWrapped = new SpecialModelWrapper.Unbaked(idleModelId, new KevlarShieldSpecialRenderer.Unbaked());
        ItemModel.Unbaked blockingWrapped = new SpecialModelWrapper.Unbaked(blockingModelId, new KevlarShieldSpecialRenderer.Unbaked());

        itemModels.itemModelOutput.accept(shieldItem, ItemModelUtils.conditional(ItemModelUtils.isUsingItem(), blockingWrapped, idleWrapped));
    }

    private void registerSpearModel(ItemModelGenerators itemModels, Item spearItem) {
        ItemModel.Unbaked guiModel = ItemModelUtils.plainModel(itemModels.createFlatItemModel(spearItem, ModelTemplates.FLAT_HANDHELD_ITEM));

        ItemModel.Unbaked inHandModel = ItemModelUtils.plainModel(itemModels.createFlatItemModel(spearItem, "_in_hand", ModelTemplates.SPEAR_IN_HAND));

        itemModels.itemModelOutput.accept(spearItem, ItemModelUtils.select(new DisplayContext(), ItemModelUtils.when(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, inHandModel), ItemModelUtils.when(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, inHandModel), ItemModelUtils.when(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, inHandModel), ItemModelUtils.when(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, inHandModel), ItemModelUtils.when(ItemDisplayContext.GUI, guiModel), ItemModelUtils.when(ItemDisplayContext.GROUND, guiModel), ItemModelUtils.when(ItemDisplayContext.FIXED, guiModel), ItemModelUtils.when(ItemDisplayContext.HEAD, guiModel), ItemModelUtils.when(ItemDisplayContext.NONE, guiModel)));
    }
}