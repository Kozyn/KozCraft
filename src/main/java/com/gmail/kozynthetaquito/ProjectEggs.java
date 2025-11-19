package com.gmail.kozynthetaquito;


import com.gmail.kozynthetaquito.block.BlockRegister;
import com.gmail.kozynthetaquito.item.ItemRegister;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.fml.common.Mod;

@Mod(ProjectEggs.MODID)
public class ProjectEggs {
    public static final String MODID = "projecteggs";

    public static final Logger LOGGER = LogUtils.getLogger();

    public ProjectEggs(IEventBus eventBus) {
        BlockRegister.register(eventBus);
        ItemRegister.register(eventBus);
        CreativeTab.register(eventBus);

        eventBus.addListener(this::addCreativeTabs);
    }

    public void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        // Do Nothing
    }

}
