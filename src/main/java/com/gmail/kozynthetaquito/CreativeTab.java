package com.gmail.kozynthetaquito;

import com.gmail.kozynthetaquito.block.BlockRegister;
import com.gmail.kozynthetaquito.item.ItemRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ProjectEggs.MODID
    );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register(
            "group",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + ProjectEggs.MODID + ".group"))
                    .icon(() -> new ItemStack(Items.EGG))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(BlockRegister.HAMPTER_BLOCK.get());
                        output.accept(ItemRegister.HAMPTER.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
