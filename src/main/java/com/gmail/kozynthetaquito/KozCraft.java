package com.gmail.kozynthetaquito;


import com.gmail.kozynthetaquito.block.BlockRegister;
import com.gmail.kozynthetaquito.item.HampterItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.fml.common.Mod;

@Mod(KozCraft.MODID)
public class KozCraft {
    public static final String MODID = "kozcraft";

    public static final Logger LOGGER = LogUtils.getLogger();

    public KozCraft(IEventBus eventBus) {
        BlockRegister.register(eventBus);
        HampterItems.register(eventBus);
        CreativeTab.register(eventBus);

        eventBus.addListener(this::addCreativeTabs);
    }

    public void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        // Do Nothing
    }

}
