package net.soproxi.cultcraft.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.soproxi.cultcraft.CultCraft;
import net.soproxi.cultcraft.setup.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, CultCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    simpleBlock(ModBlocks.ANCIENT_FOSSIL.get());
    }
}
