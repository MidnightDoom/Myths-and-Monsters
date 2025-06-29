package io.github.MidnightDoom.mythsandmonsters.entity.client.hunDun;

import io.github.MidnightDoom.mythsandmonsters.MythsAndMonsters;
import io.github.MidnightDoom.mythsandmonsters.entity.custom.HunDunEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HunDunModel extends AnimatedGeoModel<HunDunEntity> {
    @Override
    public ResourceLocation getModelResource(HunDunEntity hunDunEntity) {
        return new ResourceLocation(MythsAndMonsters.MOD_ID, "geo/hunDun.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HunDunEntity hunDunEntity) {
        return new ResourceLocation(MythsAndMonsters.MOD_ID, "textures/entity/hundun.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HunDunEntity hunDunEntity) {
        return new ResourceLocation(MythsAndMonsters.MOD_ID, "animations/hundun.animation.json");
    }
}
