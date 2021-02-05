package net.soproxi.cultcraft.setup;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.soproxi.cultcraft.CultCraft;

public class ModSounds {

    //Jen Sounds
    public static final RegistryObject<SoundEvent> JEN_SOUND = Registration.SOUNDS.register("jen_sound", () ->
            new SoundEvent(new ResourceLocation(CultCraft.MOD_ID, "item.jen_sound")));

    static void register() {}
}