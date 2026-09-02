package com.danako.practical_additions.feature.gadget.backpack.client;

import com.danako.practical_additions.client.PAKeyBindings;
import com.danako.practical_additions.core.PracticalItems;
import com.danako.practical_additions.feature.gadget.backpack.BackpackTypes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import top.theillusivec4.curios.api.client.ICurioRenderer;

public class PABackpackClient {

    public static void register(IEventBus modEventBus) {
        modEventBus.addListener(PABackpackClient::registerLayers);
        modEventBus.addListener(PABackpackClient::clientSetup);
        PAKeyBindings.register(modEventBus);
    }

    private static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(BackpackTypes.LAYER_LOCATION, BackpackTypes::createBodyLayer);
    }

    private static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            BackpackCurioRenderer renderer = new BackpackCurioRenderer();
            ICurioRenderer.register(PracticalItems.BASIC_BACKPACK.get(), () -> renderer);
            ICurioRenderer.register(PracticalItems.REINFORCED_BACKPACK.get(), () -> renderer);
        });
    }
}