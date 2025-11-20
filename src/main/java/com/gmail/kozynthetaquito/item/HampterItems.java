package com.gmail.kozynthetaquito.item;

import com.gmail.kozynthetaquito.KozCraft;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HampterItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KozCraft.MODID);

    public static final DeferredItem<Item> HAMPTER = ITEMS.register(
            "hampter",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationModifier(0)
                            .build())
            )
    );

    public static final DeferredItem<Item> EVIL_HAMPTER = ITEMS.register(
            "evil_hampter",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .alwaysEdible()
                            .effect(
                                    () -> new MobEffectInstance(
                                            MobEffects.HUNGER,
                                            72000,
                                            99,
                                            false,
                                            true,
                                            false
                                    ),
                                    1
                            )
                            .effect(
                                    () -> new MobEffectInstance(
                                            MobEffects.WITHER,
                                            72000,
                                            19,
                                            false,
                                            true,
                                            false
                                    ),
                                    1
                            )
                            .build()
                    )
            )
    );

    public static final DeferredItem<Item> HAMPTER_INGOT = ITEMS.register(
            "hampter_ingot",
            () -> new Item(new Item.Properties())
    );

    public static final DeferredItem<Item> RAW_HAMPTER = ITEMS.register(
            "raw_hampter",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
