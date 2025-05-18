package io.github.MidnightDoom.mythsandmonsters.datagen;

import io.github.MidnightDoom.mythsandmonsters.MythsAndMonsters;
import io.github.MidnightDoom.mythsandmonsters.datagen.languages.ModLanguageProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MythsAndMonsters.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    // Run runData whenever something is updated in datagen

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));
        generator.addProvider(event.includeClient(), new ModLanguageProvider(generator, "en_us"));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, existingFileHelper));
    }
}
