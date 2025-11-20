package com.gmail.kozynthetaquito.block;

import com.gmail.kozynthetaquito.KozCraft;
import com.gmail.kozynthetaquito.item.HampterItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockRegister {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(KozCraft.MODID);

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        HampterItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static final DeferredBlock<Block> HAMPTER_BLOCK = registerBlock(
            "hampter_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5,6)
                    .friction(0.6f)
                    .sound(SoundType.SLIME_BLOCK)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final DeferredBlock<Block> RAW_HAMPTER_BLOCK = registerBlock(
            "raw_hampter_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5, 6)
                    .friction(0.6f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final DeferredBlock<Block> HAMPTER_ORE = registerBlock(
            "hampter_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(68,6)
                    .friction(0.6f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            )
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
