package fr.naty.mitige;

import fr.naty.mitige.blocks.MitigeBlocks;
import fr.naty.mitige.items.MitigeItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(mitige.MODID)
public class mitige {

	public static final String MODID = "mitige";
	
	public mitige() 
	{
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MitigeItems.ITEMS.register(bus);
		MitigeBlocks.BLOCKS.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent e)
	{
		
		
	}
	
	private void clientSetup(FMLClientSetupEvent e)
	{
		
		
	}
}
