package fr.naty.mando.blocks;

import fr.naty.mando.mando;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MandoBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, mando.MODID);
    
    //beskar   
    public static final RegistryObject<Block> Beskar_ore = BLOCKS.register( "beskar_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> Beskar_block = BLOCKS.register( "beskar_block", () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3f, 15f).sound(SoundType.METAL)));
   
}