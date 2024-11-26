package org.ex.hdo;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Hdo.MODID);

    public static final RegistryObject<CreativeModeTab> HDO_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("Dendrarion Ocean",
            ()-> CreativeModeTab.builder().build() );

    public static void register(IEventBus eventBus){
              CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);

    }
}
