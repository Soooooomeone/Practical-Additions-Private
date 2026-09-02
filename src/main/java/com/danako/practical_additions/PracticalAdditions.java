package com.danako.practical_additions;


import com.danako.practical_additions.combat.PAArmorEffectsHandler;
import com.danako.practical_additions.config.PracticalConfig;
import com.danako.practical_additions.core.*;
import com.danako.practical_additions.datagen.DataGenerators;
import com.danako.practical_additions.feature.gadget.backpack.BackpackContents;
import com.danako.practical_additions.feature.gadget.backpack.client.PABackpackClient;
import com.danako.practical_additions.feature.gadget.backpack.network.BackpackNetworking;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(PracticalAdditions.MODID)
public class PracticalAdditions {
    public static final String MODID = "practical_additions";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public PracticalAdditions(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(DataGenerators::gatherClientData);
        modEventBus.addListener(BackpackNetworking::register);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        PADataComponents.register(modEventBus);
        BackpackContents.register(modEventBus);
        PracticalMenuTypes.register(modEventBus);
        PABackpackClient.register(modEventBus);
        PracticalBlocks.register();
        PracticalItems.register();
        PracticalTabs.register(modEventBus);
        PAArmorEffectsHandler.register();

        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, PracticalConfig.COMMON_SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Practical Additions common setup complete");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}