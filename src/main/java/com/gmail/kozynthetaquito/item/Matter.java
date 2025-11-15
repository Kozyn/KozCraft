package com.gmail.kozynthetaquito.item;

import com.gmail.kozynthetaquito.ProjectEggs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Matter {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectEggs.MODID);

    public static final DeferredItem<Item> MAGENTA_MATTER = ITEMS.register("magenta_matter",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PINK_MATTER = ITEMS.register("pink_matter",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> YELLOW_MATTER = ITEMS.register("yellow_matter",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
