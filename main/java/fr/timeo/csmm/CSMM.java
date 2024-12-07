package fr.timeo.csmm;

import fr.timeo.csmm.init.ModBlock;
import fr.timeo.csmm.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CSMM.MODID)
public class CSMM {
    public static final String MODID = "csmm";

    public CSMM() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // Enregistrer les items directement ici
        ModItems.ITEMS.register(bus);
        ModBlock.BLOCK.register(bus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModItems::addCreativeTab);
    }

    private void setup(FMLCommonSetupEvent e){
        // Configuration côté serveur, si nécessaire
    }

    private void clientSetup(FMLClientSetupEvent e){
        // Configuration côté client, si nécessaire
    }
}
