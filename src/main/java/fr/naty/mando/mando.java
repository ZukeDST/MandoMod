package fr.naty.mando;

import fr.naty.mando.blocks.MandoBlocks;
import fr.naty.mando.events.MandoEvents;
import fr.naty.mando.items.MandoItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(mando.MODID)
public class mando {

	public static final String MODID = "mando";
	
	public mando()
	{
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MandoItems.ITEMS.register(bus);
		MandoBlocks.BLOCKS.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent e)
	{
        fr.naty.mando.init.ModFeatures features = new fr.naty.mando.init.ModFeatures();
        features.init();
        MinecraftForge.EVENT_BUS.register(features);	
        
		MandoEvents Events = new MandoEvents();
		Events.init();
		MinecraftForge.EVENT_BUS.register(Events);
		
	}
	
	private void clientSetup(FMLClientSetupEvent e)
	{
		
		
	}
}
