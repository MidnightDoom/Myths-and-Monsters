package io.github.MidnightDoom.mythsandmonsters.entity;

import io.github.MidnightDoom.mythsandmonsters.MythsAndMonsters;
import io.github.MidnightDoom.mythsandmonsters.entity.custom.HunDunEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MythsAndMonsters.MOD_ID);

    public static final RegistryObject<EntityType<HunDunEntity>> HUN_DUN = ENTITY_TYPES.register("hun_dun",
            () -> EntityType.Builder.of(HunDunEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f)
                    .build(new ResourceLocation(MythsAndMonsters.MOD_ID, "hun_dun").toString())
    );


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
