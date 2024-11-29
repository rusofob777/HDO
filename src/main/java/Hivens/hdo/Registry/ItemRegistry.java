package Hivens.hdo.Registry;

import Hivens.hdo.HDO;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, HDO.MODID);

   public static final RegistryObject<Item> ATLANTUM = Items.register("atlantum",
           ()-> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
