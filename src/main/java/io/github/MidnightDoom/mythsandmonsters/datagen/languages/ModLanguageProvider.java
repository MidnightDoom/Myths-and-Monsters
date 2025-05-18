package io.github.MidnightDoom.mythsandmonsters.datagen.languages;

import io.github.MidnightDoom.mythsandmonsters.MythsAndMonsters;
import io.github.MidnightDoom.mythsandmonsters.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    // https://docs.minecraftforge.net/en/1.19.2/datagen/client/localization/#language-generation
    // create a copy of this class for other translations

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, MythsAndMonsters.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        this.addItem(ModItems.NETHERITE_SCRAP_SCRAP, "Netherite Scrap Scrap");
        this.addItem(ModItems.NETHERITE_NUGGET, "Netherite Nugget");
        this.add("myths_and_monsters_misc", "Misc");
        this.add("myths_and_monsters_egg", "Spawn Eggs");
    }
}
