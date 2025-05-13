package io.github.MidnightDoom.mythsandmonsters.item;

import io.github.MidnightDoom.mythsandmonsters.MythsAndMonsters;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MythsAndMonsters.MOD_ID);

    // Name must be lowercase a-z, 0-9, - and _ only
    // Add properties after Item.Properties().<here>
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).tab(ModItemGroups.MYTHS_AND_MONSTERS_MISC_TAB))
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
