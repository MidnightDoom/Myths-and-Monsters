package io.github.MidnightDoom.mythsandmonsters.datagen;

import io.github.MidnightDoom.mythsandmonsters.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    // https://docs.minecraftforge.net/en/1.19.2/datagen/server/recipes/

    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        // Examples of shaped and shapeless recipes
        // Check out https://youtu.be/rGURjv3jH7Y?t=265 for more info
        // note: the "unlockedBy" code shown in the video is outdated, see below for new code

        /*
        ShapelessRecipeBuilder.shapeless(ModItems.NETHERITE_NUGGET.get(), 9)
                .requires(Items.NETHERITE_INGOT)
                .unlockedBy("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(Items.NETHERITE_INGOT)
                .define('N', ModItems.NETHERITE_NUGGET.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .unlockedBy("has_netherite_nugget", has(ModItems.NETHERITE_NUGGET.get()))
                .save(pFinishedRecipeConsumer);
         */

        // Look in RecipeProvider (near the bottom) for pre-made recipe patterns

        nineBlockStorageRecipesWithCustomPacking(
                pFinishedRecipeConsumer,
                ModItems.NETHERITE_NUGGET.get(),
                Items.NETHERITE_INGOT,
                "netherite_ingot_from_nuggets",
                "netherite_ingot");

        ShapelessRecipeBuilder.shapeless(ModItems.NETHERITE_NUGGET.get())
                .requires(ModItems.NETHERITE_SCRAP_SCRAP.get(), 4)
                .requires(Items.GOLD_NUGGET, 4)
                .unlockedBy("has_netherite_scrap_scrap", has(Items.NETHERITE_SCRAP))
                .save(pFinishedRecipeConsumer);


    }
}
