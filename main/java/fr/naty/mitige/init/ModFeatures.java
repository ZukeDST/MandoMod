package fr.naty.mitige.init;

import fr.naty.mitige.blocks.MitigeBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModFeatures {

    public ConfiguredFeature<?, ?> ORE_BESKAR_FEATURE;

    public void init()
    {
        ORE_BESKAR_FEATURE = register("ore_beskar", Feature.ORE.withConfiguration(new OreFeatureConfig(ModOreFeatureConfig.FillerBlockType.END, MitigeBlocks.Beskar_ore.get().getDefaultState(), 1))
        .square()
        .range(300)
        .func_242731_b(3));
    }

    public <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> feature)
    {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, feature);
    }

    @SubscribeEvent
    public void biomeLoading(BiomeLoadingEvent e)
    {
        BiomeGenerationSettingsBuilder generation = e.getGeneration();
        if(e.getCategory() != Biome.Category.NETHER)
        {
            generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_BESKAR_FEATURE);
        }
    }

}