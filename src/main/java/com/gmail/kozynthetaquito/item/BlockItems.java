package com.gmail.kozynthetaquito.item;

import com.gmail.kozynthetaquito.ProjectEggs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockItems {
    public static final DeferredRegister.Items BLOCKITEMS = DeferredRegister.createItems(ProjectEggs.MODID);



    public static void register(IEventBus eventBus) {
        BLOCKITEMS.register(eventBus);
    }
}
