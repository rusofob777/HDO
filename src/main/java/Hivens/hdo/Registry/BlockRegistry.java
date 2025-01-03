package Hivens.hdo.Registry;

import Hivens.hdo.HDO;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HDO.MODID);

    public static final RegistryObject<Block> ATLANTUM_ORE = registerBlock("atlantum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(4)
                    .requiresCorrectToolForDrops(), UniformInt.of(4,5)));

    public static final RegistryObject<Block> ATLANTUM_BLOCK = registerBlock("atlantum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)
                    .sound(SoundType.METAL)));














    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends  Block> RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<T> block){
        return ItemRegistry.Items.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus modEventBus) {
            BLOCKS.register(modEventBus);
    }
}
