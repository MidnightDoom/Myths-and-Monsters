package io.github.MidnightDoom.mythsandmonsters.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModItemGroups {

    public static final CreativeModeTab MYTHS_AND_MONSTERS_MISC_TAB = new CreativeModeTab("myths_and_monsters_misc") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_NUGGET.get());
        }
    };

    public static final CreativeModeTab MYTHS_AND_MONSTERS_SPAWN_TAB = new CreativeModeTab("myths_and_monsters_egg") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.CHICKEN_SPAWN_EGG);
        }
    };
}
