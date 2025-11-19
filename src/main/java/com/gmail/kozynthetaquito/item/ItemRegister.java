package com.gmail.kozynthetaquito.item;

import com.gmail.kozynthetaquito.ProjectEggs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ItemRegister {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectEggs.MODID);

    public static final DeferredItem<Item> HAMPTER = ITEMS.register(
            "hampter",
            () -> new Item(new Item.Properties())
    );

    public static final DeferredItem<Item> HAMPTER_INGOT = ITEMS.register(
            "hampter_ingot",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
