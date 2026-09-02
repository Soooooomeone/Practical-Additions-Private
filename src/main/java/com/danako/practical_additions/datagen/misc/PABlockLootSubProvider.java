package com.danako.practical_additions.datagen.misc;

import com.danako.practical_additions.PracticalAdditions;
import com.danako.practical_additions.core.PracticalBlocks;
import com.danako.practical_additions.core.PracticalItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class PABlockLootSubProvider extends BlockLootSubProvider {

    public PABlockLootSubProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
    }

    @Override
    protected void generate() {

        add(PracticalBlocks.LEAD_ORE.get(), block -> createOreDrop(block, PracticalItems.RAW_LEAD.get()));
        add(PracticalBlocks.DEEPSLATE_LEAD_ORE.get(), block -> createOreDrop(block, PracticalItems.RAW_LEAD.get()));
        add(PracticalBlocks.COBALT_ORE.get(), block -> createOreDrop(block, PracticalItems.RAW_COBALT.get()));
        add(PracticalBlocks.DEEPSLATE_COBALT_ORE.get(), block -> createOreDrop(block, PracticalItems.RAW_COBALT.get()));
        dropSelf(PracticalBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(PracticalBlocks.DENSE_WEIGHTED_PRESSURE_PLATE.get());
        dropSelf(PracticalBlocks.LEAD_BLOCK.get());
        dropSelf(PracticalBlocks.RAW_COBALT_BLOCK.get());
        dropSelf(PracticalBlocks.COBALT_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return PracticalAdditions.BLOCKS.getEntries().stream().map(holder -> (Block) holder.get()) // Explicitly cast to Block to satisfy Iterable<Block>
                .toList();
    }
}