package Hivens.hdo.Registry;

import Hivens.hdo.HDO;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HDO.MODID);
    public static final RegistryObject<CreativeModeTab> HDO_TAB = CREATIVE_MODE_TABS.register("hdo_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistry.ATLANTUM.get()))
                    .title(Component.translatable("creativetab.hdo_tab"))
                    .displayItems((pParameters, pOutput) -> {


                  pOutput.accept(ItemRegistry.ATLANTUM.get());

                  pOutput.accept(BlockRegistry.ATLANTUM_ORE.get());







                    }).build());




}
