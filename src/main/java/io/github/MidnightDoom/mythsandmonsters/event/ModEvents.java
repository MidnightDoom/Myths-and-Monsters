package io.github.MidnightDoom.mythsandmonsters.event;

import io.github.MidnightDoom.mythsandmonsters.MythsAndMonsters;
import io.github.MidnightDoom.mythsandmonsters.entity.ModEntityTypes;
import io.github.MidnightDoom.mythsandmonsters.entity.custom.HunDunEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = MythsAndMonsters.MOD_ID)
    public static class ForgeEvents {

    }

    @Mod.EventBusSubscriber(modid = MythsAndMonsters.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {

        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.HUN_DUN.get(), HunDunEntity.setAttributes());
        }

    }
}
