package io.github.MidnightDoom.mythsandmonsters.datagen;

import io.github.MidnightDoom.mythsandmonsters.MythsAndMonsters;
import io.github.MidnightDoom.mythsandmonsters.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MythsAndMonsters.MOD_ID, existingFileHelper);
    }

    // Note: will crash if textures don't exist

    @Override
    protected void registerModels() {
        basicItem(ModItems.NETHERITE_NUGGET.get());
        //basicItem(ModItems.NETHERITE_SCRAP_SCRAP.get());
    }
}
