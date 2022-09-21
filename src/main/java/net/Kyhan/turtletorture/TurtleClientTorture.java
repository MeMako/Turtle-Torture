package net.Kyhan.turtletorture;

import net.Kyhan.turtletorture.entity.ModEntities;
import net.Kyhan.turtletorture.entity.client.DyingTurtleRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;


public class TurtleClientTorture implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.DyingTurtle, DyingTurtleRenderer::new);

    }

}
