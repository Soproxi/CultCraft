package net.soproxi.cultcraft.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.soproxi.cultcraft.CultCraft;
import net.soproxi.cultcraft.setup.items.JenItem;

public class ModItems {

    // CULTIST BONE
    public static final RegistryObject<Item> CULTIST_BONE = Registration.ITEMS.register("cultist_bone", () ->
            new Item(new Item.Properties().group(CultCraft.CULTCRAFT_GROUP)));


    // JEN KNIFE
    public static final RegistryObject<Item> JEN_KNIFE = Registration.ITEMS.register("jen_knife", JenItem::new);




    static void register() {}
}
