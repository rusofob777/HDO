package Hivens.hdo;

import Hivens.hdo.Registry.BlockRegistry;
import Hivens.hdo.Registry.CreativeTabRegistry;
import Hivens.hdo.Registry.ItemRegistry;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(HDO.MODID)
public class HDO {
    public static final String MODID = "hdo";
    public static final Logger LOGGER = LogUtils.getLogger();



    public HDO() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CreativeTabRegistry.register(modEventBus);
        ItemRegistry.register(modEventBus);
        BlockRegistry.register(modEventBus);


        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);



        LOGGER.info("HDO Mod Initialization Started");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HDO Common Setup Complete");
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ItemRegistry.ATLANTUM);
        }

    }
}
