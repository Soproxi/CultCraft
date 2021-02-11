package net.soproxi.cultcraft.setup;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.soproxi.cultcraft.CultCraft;

import java.util.function.Supplier;

public class ModBlocks {

    public static final RegistryObject<Block> ANCIENT_FOSSIL = register("ancient_fossil", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE).setRequiresTool()));


    // machines
    public static final RegistryObject<Block> BONE_POLISHER = register("bone_polisher", () ->
            new FurnaceBlock(AbstractBlock.Properties.create(Material.ANVIL).hardnessAndResistance(3,10).harvestLevel(2).sound(SoundType.ANVIL).setRequiresTool()));



    static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(CultCraft.CULTCRAFT_GROUP)));
        return ret;
    }
}
