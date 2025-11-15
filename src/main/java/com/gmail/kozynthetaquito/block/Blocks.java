package com.gmail.kozynthetaquito.block;

import com.gmail.kozynthetaquito.ProjectEggs;
import com.gmail.kozynthetaquito.item.BlockItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ProjectEggs.MODID);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static<T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        BlockItems.BLOCKITEMS.register(name, () -> new BlockItem((block.get()), new Item.Properties()));
    }

    public static final DeferredBlock<Block> PERSONAL_EMC_LINK = registerBlock("personal_emc_link",
            () -> new Block(BlockBehaviour.Properties.of()
            ));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
