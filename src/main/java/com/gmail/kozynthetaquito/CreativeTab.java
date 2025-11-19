package com.gmail.kozynthetaquito;

import com.gmail.kozynthetaquito.block.BlockRegister;
import com.gmail.kozynthetaquito.item.HampterItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            KozCraft.MODID
    );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB_MOD = CREATIVE_MODE_TABS.register(
            "creative_tab_main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + KozCraft.MODID + ".creative_tab_main"))
                    .icon(() -> new ItemStack(HampterItems.HAMPTER.get()))
                    .displayItems((params, output) -> {
                        output.accept(HampterItems.RAW_HAMPTER.get());
                        output.accept(BlockRegister.RAW_HAMPTER_BLOCK.get());
                        output.accept(HampterItems.HAMPTER_INGOT.get());
                        output.accept(BlockRegister.HAMPTER_BLOCK.get());
                        output.accept(HampterItems.HAMPTER.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
