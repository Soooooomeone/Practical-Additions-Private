package com.danako.practical_additions.client.tooltip;

import com.danako.practical_additions.PracticalAdditions;
import com.danako.practical_additions.feature.gadget.quiver.QuiverTooltip;
import com.danako.practical_additions.feature.gadget.quiver.client.ClientQuiverTooltip;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterClientTooltipComponentFactoriesEvent;

@EventBusSubscriber(modid = PracticalAdditions.MODID, value = Dist.CLIENT)
public class PAClientTooltips {

    @SubscribeEvent
    public static void registerTooltipComponents(RegisterClientTooltipComponentFactoriesEvent event) {
        event.register(QuiverTooltip.class, tooltip -> new ClientQuiverTooltip(tooltip.contents(), tooltip.capacity()));
    }
}