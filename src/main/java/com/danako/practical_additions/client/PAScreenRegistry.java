package com.danako.practical_additions.client;

import com.danako.practical_additions.PracticalAdditions;
import com.danako.practical_additions.core.PracticalMenuTypes;
import com.danako.practical_additions.feature.gadget.backpack.client.BackpackScreen;
import com.danako.practical_additions.feature.gadget.magnet.client.AdvancedMagnetScreen;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

@EventBusSubscriber(modid = PracticalAdditions.MODID, value = net.neoforged.api.distmarker.Dist.CLIENT)
public class PAScreenRegistry {

    @SubscribeEvent
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(PracticalMenuTypes.ADVANCED_MAGNET_MENU.get(), AdvancedMagnetScreen::new);
        event.register(PracticalMenuTypes.BASIC_BACKPACK_MENU.get(), BackpackScreen::new);
        event.register(PracticalMenuTypes.REINFORCED_BACKPACK_MENU.get(), BackpackScreen::new);
    }
}