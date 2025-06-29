package io.github.MidnightDoom.mythsandmonsters.entity.client.hunDun;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.MidnightDoom.mythsandmonsters.MythsAndMonsters;
import io.github.MidnightDoom.mythsandmonsters.entity.custom.HunDunEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HunDunRenderer extends GeoEntityRenderer<HunDunEntity> {
    public HunDunRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HunDunModel());
        this.shadowRadius = .3f;
    }

    @Override
    public ResourceLocation getTextureLocation(HunDunEntity animatable) {
        return new ResourceLocation(MythsAndMonsters.MOD_ID, "textures/entity/hundun.png");
    }

    @Override
    public RenderType getRenderType(HunDunEntity animatable, float partialTick, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        // stack.scale(.8f, .8f, .8f);
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
