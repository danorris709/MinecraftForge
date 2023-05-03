/*
 * Copyright (c) Forge Development LLC and contributors
 * SPDX-License-Identifier: LGPL-2.1-only
 */

package net.minecraftforge.debug;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.FireworkRocketItem;
import net.minecraftforge.client.event.FireworkShapeRenderEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.Objects;

@Mod("custom_firework_shape_test")
@Mod.EventBusSubscriber
public class CustomFireworkShapeTest
{

    private static FireworkRocketItem.Shape pikachu;

    public CustomFireworkShapeTest()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onSetup);
    }

    private void onSetup(FMLCommonSetupEvent event)
    {
        pikachu = FireworkRocketItem.Shape.create("pikachu", 5, "pikachu");
    }

    @SubscribeEvent
    public static void onRenderShape(FireworkShapeRenderEvent event)
    {
        if (!Objects.equals(pikachu, event.getShape()))
        {
            return;
        }

        createParticleShape(event, 0.5D, new double[][]{
                {0.0D,0.8421D},{0.0D,0.8684D},{0.0D,0.8947D},{0.0D,0.9211D},{0.0D,0.9474D},{0.0D,0.9737D},{0.0196D,0.8158D},
                {0.0196D,0.8421D},{0.0196D,0.8684D},{0.0196D,0.8947D},{0.0196D,0.9211D},{0.0196D,0.9474D},{0.0196D,0.9737D},
                {0.0392D,0.7632D},{0.0392D,0.7895D},{0.0392D,0.8158D},{0.0392D,0.8421D},{0.0392D,0.8684D},{0.0392D,0.8947D},
                {0.0392D,0.9211D},{0.0392D,0.9474D},{0.0392D,0.9737D},{0.0588D,0.7368D},{0.0588D,0.7632D},{0.0588D,0.7895D},
                {0.0588D,0.8158D},{0.0588D,0.8421D},{0.0588D,0.8684D},{0.0588D,0.8947D},{0.0588D,0.9211D},{0.0588D,0.9474D},
                {0.0588D,0.9737D},{0.0784D,0.7105D},{0.0784D,0.7368D},{0.0784D,0.7632D},{0.0784D,0.7895D},{0.0784D,0.8158D},
                {0.0784D,0.8421D},{0.0784D,0.8684D},{0.0784D,0.8947D},{0.0784D,0.9211D},{0.0784D,0.9474D},{0.0784D,0.9737D},
                {0.098D,0.6579D},{0.098D,0.6842D},{0.098D,0.7105D},{0.098D,0.7368D},{0.098D,0.7632D},{0.098D,0.7895D},
                {0.098D,0.8158D},{0.098D,0.8421D},{0.098D,0.8684D},{0.098D,0.8947D},{0.098D,0.9211D},{0.098D,0.9474D},
                {0.098D,0.9737D},{0.1176D,0.6316D},{0.1176D,0.6579D},{0.1176D,0.6842D},{0.1176D,0.7105D},{0.1176D,0.7368D},
                {0.1176D,0.7632D},{0.1176D,0.7895D},{0.1176D,0.8158D},{0.1176D,0.8421D},{0.1176D,0.8684D},{0.1176D,0.8947D},
                {0.1176D,0.9211D},{0.1176D,0.9474D},{0.1373D,0.6053D},{0.1373D,0.6316D},{0.1373D,0.6579D},{0.1373D,0.6842D},
                {0.1373D,0.7105D},{0.1373D,0.7368D},{0.1373D,0.7632D},{0.1373D,0.7895D},{0.1373D,0.8158D},{0.1373D,0.8421D},
                {0.1373D,0.8684D},{0.1373D,0.8947D},{0.1373D,0.9211D},{0.1373D,0.9474D},{0.1569D,0.6053D},{0.1569D,0.6316D},
                {0.1569D,0.6579D},{0.1569D,0.6842D},{0.1569D,0.7105D},{0.1569D,0.7368D},{0.1569D,0.7632D},{0.1569D,0.7895D},
                {0.1569D,0.8158D},{0.1569D,0.8421D},{0.1569D,0.8684D},{0.1569D,0.8947D},{0.1569D,0.9211D},{0.1765D,0.2368D},
                {0.1765D,0.2632D},{0.1765D,0.2895D},{0.1765D,0.3158D},{0.1765D,0.3421D},{0.1765D,0.3684D},{0.1765D,0.3947D},
                {0.1765D,0.4211D},{0.1765D,0.5789D},{0.1765D,0.6053D},{0.1765D,0.6316D},{0.1765D,0.6579D},{0.1765D,0.6842D},
                {0.1765D,0.7105D},{0.1765D,0.7368D},{0.1765D,0.7632D},{0.1765D,0.7895D},{0.1765D,0.8158D},{0.1765D,0.8421D},
                {0.1765D,0.8684D},{0.1765D,0.8947D},{0.1961D,0.1842D},{0.1961D,0.2105D},{0.1961D,0.2368D},{0.1961D,0.2632D},
                {0.1961D,0.2895D},{0.1961D,0.3158D},{0.1961D,0.3421D},{0.1961D,0.3684D},{0.1961D,0.3947D},{0.1961D,0.4211D},
                {0.1961D,0.4474D},{0.1961D,0.4737D},{0.1961D,0.5526D},{0.1961D,0.5789D},{0.1961D,0.6053D},{0.1961D,0.6316D},
                {0.1961D,0.6579D},{0.1961D,0.6842D},{0.1961D,0.7105D},{0.1961D,0.7368D},{0.1961D,0.7632D},{0.1961D,0.7895D},
                {0.1961D,0.8158D},{0.1961D,0.8421D},{0.1961D,0.8684D},{0.2157D,0.1316D},{0.2157D,0.1579D},{0.2157D,0.1842D},
                {0.2157D,0.2105D},{0.2157D,0.2368D},{0.2157D,0.2632D},{0.2157D,0.2895D},{0.2157D,0.3158D},{0.2157D,0.3421D},
                {0.2157D,0.3684D},{0.2157D,0.3947D},{0.2157D,0.4211D},{0.2157D,0.4474D},{0.2157D,0.4737D},{0.2157D,0.5D},
                {0.2157D,0.5263D},{0.2157D,0.5526D},{0.2157D,0.5789D},{0.2157D,0.6053D},{0.2157D,0.6316D},{0.2157D,0.6579D},
                {0.2157D,0.6842D},{0.2157D,0.7105D},{0.2157D,0.7368D},{0.2157D,0.7632D},{0.2157D,0.7895D},{0.2157D,0.8158D},
                {0.2157D,0.8421D},{0.2353D,0.1053D},{0.2353D,0.1316D},{0.2353D,0.1579D},{0.2353D,0.1842D},{0.2353D,0.2105D},
                {0.2353D,0.2368D},{0.2353D,0.2632D},{0.2353D,0.2895D},{0.2353D,0.3158D},{0.2353D,0.3421D},{0.2353D,0.3684D},
                {0.2353D,0.3947D},{0.2353D,0.4211D},{0.2353D,0.4474D},{0.2353D,0.4737D},{0.2353D,0.5D},{0.2353D,0.5263D},
                {0.2353D,0.5526D},{0.2353D,0.5789D},{0.2353D,0.6053D},{0.2353D,0.6316D},{0.2353D,0.6579D},{0.2353D,0.6842D},
                {0.2353D,0.7105D},{0.2353D,0.7368D},{0.2353D,0.7632D},{0.2353D,0.7895D},{0.2353D,0.8158D},{0.2353D,0.8421D},
                {0.2549D,0.0789D},{0.2549D,0.1053D},{0.2549D,0.1316D},{0.2549D,0.1579D},{0.2549D,0.1842D},{0.2549D,0.2105D},
                {0.2549D,0.2368D},{0.2549D,0.2632D},{0.2549D,0.2895D},{0.2549D,0.3158D},{0.2549D,0.3421D},{0.2549D,0.3684D},
                {0.2549D,0.3947D},{0.2549D,0.4211D},{0.2549D,0.4474D},{0.2549D,0.4737D},{0.2549D,0.5D},{0.2549D,0.5263D},
                {0.2549D,0.5526D},{0.2549D,0.5789D},{0.2549D,0.6053D},{0.2549D,0.6316D},{0.2549D,0.6579D},{0.2549D,0.6842D},
                {0.2549D,0.7105D},{0.2549D,0.7368D},{0.2549D,0.7632D},{0.2549D,0.7895D},{0.2745D,0.0526D},{0.2745D,0.0789D},
                {0.2745D,0.1053D},{0.2745D,0.1316D},{0.2745D,0.1579D},{0.2745D,0.1842D},{0.2745D,0.2105D},{0.2745D,0.2368D},
                {0.2745D,0.2632D},{0.2745D,0.2895D},{0.2745D,0.3158D},{0.2745D,0.3421D},{0.2745D,0.3684D},{0.2745D,0.3947D},
                {0.2745D,0.4211D},{0.2745D,0.4474D},{0.2745D,0.4737D},{0.2745D,0.5D},{0.2745D,0.5263D},{0.2745D,0.5526D},
                {0.2745D,0.5789D},{0.2745D,0.6053D},{0.2745D,0.6316D},{0.2745D,0.6579D},{0.2745D,0.6842D},{0.2745D,0.7105D},
                {0.2745D,0.7368D},{0.2745D,0.7632D},{0.2941D,0.0526D},{0.2941D,0.0789D},{0.2941D,0.1053D},{0.2941D,0.1316D},
                {0.2941D,0.1579D},{0.2941D,0.1842D},{0.2941D,0.2105D},{0.2941D,0.2368D},{0.2941D,0.2632D},{0.2941D,0.2895D},
                {0.2941D,0.3158D},{0.2941D,0.3421D},{0.2941D,0.3684D},{0.2941D,0.3947D},{0.2941D,0.4211D},{0.2941D,0.4474D},
                {0.2941D,0.4737D},{0.2941D,0.5D},{0.2941D,0.5263D},{0.2941D,0.5526D},{0.2941D,0.5789D},{0.2941D,0.6053D},
                {0.2941D,0.6316D},{0.2941D,0.6579D},{0.2941D,0.6842D},{0.2941D,0.7105D},{0.2941D,0.7368D},{0.3137D,0.0263D},
                {0.3137D,0.0526D},{0.3137D,0.0789D},{0.3137D,0.1053D},{0.3137D,0.1316D},{0.3137D,0.1579D},{0.3137D,0.1842D},
                {0.3137D,0.2105D},{0.3137D,0.2368D},{0.3137D,0.2632D},{0.3137D,0.2895D},{0.3137D,0.3158D},{0.3137D,0.3421D},
                {0.3137D,0.3684D},{0.3137D,0.3947D},{0.3137D,0.4211D},{0.3137D,0.4474D},{0.3137D,0.4737D},{0.3137D,0.5D},
                {0.3137D,0.5263D},{0.3137D,0.5526D},{0.3137D,0.5789D},{0.3137D,0.6053D},{0.3137D,0.6316D},{0.3137D,0.6579D},
                {0.3137D,0.6842D},{0.3333D,0.0263D},{0.3333D,0.0526D},{0.3333D,0.0789D},{0.3333D,0.1053D},{0.3333D,0.1316D},
                {0.3333D,0.1579D},{0.3333D,0.1842D},{0.3333D,0.2105D},{0.3333D,0.2368D},{0.3333D,0.2632D},{0.3333D,0.2895D},
                {0.3333D,0.3158D},{0.3333D,0.3421D},{0.3333D,0.3684D},{0.3333D,0.3947D},{0.3333D,0.4211D},{0.3333D,0.4474D},
                {0.3333D,0.4737D},{0.3333D,0.5D},{0.3333D,0.5263D},{0.3333D,0.5526D},{0.3333D,0.5789D},{0.3333D,0.6053D},
                {0.3333D,0.6316D},{0.3333D,0.6579D},{0.3529D,0.0D},{0.3529D,0.0263D},{0.3529D,0.0526D},{0.3529D,0.0789D},
                {0.3529D,0.1053D},{0.3529D,0.1316D},{0.3529D,0.1579D},{0.3529D,0.1842D},{0.3529D,0.2105D},{0.3529D,0.2368D},
                {0.3529D,0.2632D},{0.3529D,0.2895D},{0.3529D,0.3158D},{0.3529D,0.3421D},{0.3529D,0.3684D},{0.3529D,0.3947D},
                {0.3529D,0.4211D},{0.3529D,0.4474D},{0.3529D,0.4737D},{0.3529D,0.5D},{0.3529D,0.5263D},{0.3529D,0.5526D},
                {0.3529D,0.5789D},{0.3529D,0.6053D},{0.3529D,0.6316D},{0.3529D,0.6579D},{0.3725D,0.0D},{0.3725D,0.0263D},
                {0.3725D,0.0526D},{0.3725D,0.0789D},{0.3725D,0.1053D},{0.3725D,0.1316D},{0.3725D,0.1579D},{0.3725D,0.1842D},
                {0.3725D,0.2105D},{0.3725D,0.2368D},{0.3725D,0.2632D},{0.3725D,0.2895D},{0.3725D,0.3158D},{0.3725D,0.3421D},
                {0.3725D,0.3684D},{0.3725D,0.3947D},{0.3725D,0.4211D},{0.3725D,0.4474D},{0.3725D,0.4737D},{0.3725D,0.5D},
                {0.3725D,0.5263D},{0.3725D,0.5526D},{0.3725D,0.5789D},{0.3725D,0.6053D},{0.3725D,0.6316D},{0.3725D,0.6579D},
                {0.3922D,0.0D},{0.3922D,0.0263D},{0.3922D,0.0526D},{0.3922D,0.0789D},{0.3922D,0.1053D},{0.3922D,0.1316D},
                {0.3922D,0.1579D},{0.3922D,0.1842D},{0.3922D,0.2105D},{0.3922D,0.2368D},{0.3922D,0.2632D},{0.3922D,0.2895D},
                {0.3922D,0.3158D},{0.3922D,0.3421D},{0.3922D,0.3684D},{0.3922D,0.3947D},{0.3922D,0.4211D},{0.3922D,0.4474D},
                {0.3922D,0.4737D},{0.3922D,0.5D},{0.3922D,0.5263D},{0.3922D,0.5526D},{0.3922D,0.5789D},{0.3922D,0.6053D},
                {0.3922D,0.6316D},{0.3922D,0.6579D},{0.4118D,0.0D},{0.4118D,0.0263D},{0.4118D,0.0526D},{0.4118D,0.0789D},
                {0.4118D,0.1053D},{0.4118D,0.1316D},{0.4118D,0.1579D},{0.4118D,0.1842D},{0.4118D,0.2105D},{0.4118D,0.2368D},
                {0.4118D,0.2632D},{0.4118D,0.2895D},{0.4118D,0.3158D},{0.4118D,0.3421D},{0.4118D,0.3684D},{0.4118D,0.3947D},
                {0.4118D,0.4211D},{0.4118D,0.4474D},{0.4118D,0.4737D},{0.4118D,0.5D},{0.4118D,0.5263D},{0.4118D,0.5526D},
                {0.4118D,0.5789D},{0.4118D,0.6053D},{0.4118D,0.6316D},{0.4118D,0.6579D},{0.4314D,0.0D},{0.4314D,0.0263D},
                {0.4314D,0.0526D},{0.4314D,0.0789D},{0.4314D,0.1053D},{0.4314D,0.1316D},{0.4314D,0.1579D},{0.4314D,0.1842D},
                {0.4314D,0.2105D},{0.4314D,0.2368D},{0.4314D,0.2632D},{0.4314D,0.2895D},{0.4314D,0.3158D},{0.4314D,0.3421D},
                {0.4314D,0.3684D},{0.4314D,0.3947D},{0.4314D,0.4211D},{0.4314D,0.4474D},{0.4314D,0.4737D},{0.4314D,0.5D},
                {0.4314D,0.5263D},{0.4314D,0.5526D},{0.4314D,0.5789D},{0.4314D,0.6053D},{0.4314D,0.6316D},{0.4314D,0.6579D},
                {0.4314D,0.6842D},{0.451D,0.0D},{0.451D,0.0263D},{0.451D,0.0526D},{0.451D,0.0789D},{0.451D,0.1053D},
                {0.451D,0.1316D},{0.451D,0.1579D},{0.451D,0.1842D},{0.451D,0.2105D},{0.451D,0.2368D},{0.451D,0.2632D},
                {0.451D,0.2895D},{0.451D,0.3158D},{0.451D,0.3421D},{0.451D,0.3684D},{0.451D,0.3947D},{0.451D,0.4211D},
                {0.451D,0.4474D},{0.451D,0.4737D},{0.451D,0.5D},{0.451D,0.5263D},{0.451D,0.5526D},{0.451D,0.5789D},
                {0.451D,0.6053D},{0.451D,0.6316D},{0.451D,0.6579D},{0.451D,0.6842D},{0.4706D,0.0D},{0.4706D,0.0263D},
                {0.4706D,0.0526D},{0.4706D,0.0789D},{0.4706D,0.1053D},{0.4706D,0.1316D},{0.4706D,0.1579D},{0.4706D,0.1842D},
                {0.4706D,0.2105D},{0.4706D,0.2368D},{0.4706D,0.2632D},{0.4706D,0.2895D},{0.4706D,0.3158D},{0.4706D,0.3421D},
                {0.4706D,0.3684D},{0.4706D,0.3947D},{0.4706D,0.4211D},{0.4706D,0.4474D},{0.4706D,0.4737D},{0.4706D,0.5D},
                {0.4706D,0.5263D},{0.4706D,0.5526D},{0.4706D,0.5789D},{0.4706D,0.6053D},{0.4706D,0.6316D},{0.4706D,0.6579D},
                {0.4706D,0.6842D},{0.4902D,0.0D},{0.4902D,0.0263D},{0.4902D,0.0526D},{0.4902D,0.0789D},{0.4902D,0.1053D},
                {0.4902D,0.1316D},{0.4902D,0.1579D},{0.4902D,0.1842D},{0.4902D,0.2105D},{0.4902D,0.2368D},{0.4902D,0.2632D},
                {0.4902D,0.2895D},{0.4902D,0.3158D},{0.4902D,0.3421D},{0.4902D,0.3684D},{0.4902D,0.3947D},{0.4902D,0.4211D},
                {0.4902D,0.4474D},{0.4902D,0.4737D},{0.4902D,0.5D},{0.4902D,0.5263D},{0.4902D,0.5526D},{0.4902D,0.5789D},
                {0.4902D,0.6053D},{0.4902D,0.6316D},{0.4902D,0.6579D},{0.4902D,0.6842D},{0.5098D,0.0D},{0.5098D,0.0263D},
                {0.5098D,0.0526D},{0.5098D,0.0789D},{0.5098D,0.1053D},{0.5098D,0.1316D},{0.5098D,0.1579D},{0.5098D,0.1842D},
                {0.5098D,0.2105D},{0.5098D,0.2368D},{0.5098D,0.2632D},{0.5098D,0.2895D},{0.5098D,0.3158D},{0.5098D,0.3421D},
                {0.5098D,0.3684D},{0.5098D,0.3947D},{0.5098D,0.4211D},{0.5098D,0.4474D},{0.5098D,0.4737D},{0.5098D,0.5D},
                {0.5098D,0.5263D},{0.5098D,0.5526D},{0.5098D,0.5789D},{0.5098D,0.6053D},{0.5098D,0.6316D},{0.5098D,0.6579D},
                {0.5098D,0.6842D},{0.5294D,0.0D},{0.5294D,0.0263D},{0.5294D,0.0526D},{0.5294D,0.0789D},{0.5294D,0.1053D},
                {0.5294D,0.1316D},{0.5294D,0.1579D},{0.5294D,0.1842D},{0.5294D,0.2105D},{0.5294D,0.2368D},{0.5294D,0.2632D},
                {0.5294D,0.2895D},{0.5294D,0.3158D},{0.5294D,0.3421D},{0.5294D,0.3684D},{0.5294D,0.3947D},{0.5294D,0.4211D},
                {0.5294D,0.4474D},{0.5294D,0.4737D},{0.5294D,0.5D},{0.5294D,0.5263D},{0.5294D,0.5526D},{0.5294D,0.5789D},
                {0.5294D,0.6053D},{0.5294D,0.6316D},{0.5294D,0.6579D},{0.5294D,0.6842D},{0.549D,0.0D},{0.549D,0.0263D},
                {0.549D,0.0526D},{0.549D,0.0789D},{0.549D,0.1053D},{0.549D,0.1316D},{0.549D,0.1579D},{0.549D,0.1842D},
                {0.549D,0.2105D},{0.549D,0.2368D},{0.549D,0.2632D},{0.549D,0.2895D},{0.549D,0.3158D},{0.549D,0.3421D},
                {0.549D,0.3684D},{0.549D,0.3947D},{0.549D,0.4211D},{0.549D,0.4474D},{0.549D,0.4737D},{0.549D,0.5D},
                {0.549D,0.5263D},{0.549D,0.5526D},{0.549D,0.5789D},{0.549D,0.6053D},{0.549D,0.6316D},{0.549D,0.6579D},
                {0.549D,0.6842D},{0.5686D,0.0D},{0.5686D,0.0263D},{0.5686D,0.0526D},{0.5686D,0.0789D},{0.5686D,0.1053D},
                {0.5686D,0.1316D},{0.5686D,0.1579D},{0.5686D,0.1842D},{0.5686D,0.2105D},{0.5686D,0.2368D},{0.5686D,0.2632D},
                {0.5686D,0.2895D},{0.5686D,0.3158D},{0.5686D,0.3421D},{0.5686D,0.3684D},{0.5686D,0.3947D},{0.5686D,0.4211D},
                {0.5686D,0.4474D},{0.5686D,0.4737D},{0.5686D,0.5D},{0.5686D,0.5263D},{0.5686D,0.5526D},{0.5686D,0.5789D},
                {0.5686D,0.6053D},{0.5686D,0.6316D},{0.5686D,0.6579D},{0.5882D,0.0D},{0.5882D,0.0263D},{0.5882D,0.0526D},
                {0.5882D,0.0789D},{0.5882D,0.1053D},{0.5882D,0.1316D},{0.5882D,0.1579D},{0.5882D,0.1842D},{0.5882D,0.2105D},
                {0.5882D,0.2368D},{0.5882D,0.2632D},{0.5882D,0.2895D},{0.5882D,0.3158D},{0.5882D,0.3421D},{0.5882D,0.3684D},
                {0.5882D,0.3947D},{0.5882D,0.4211D},{0.5882D,0.4474D},{0.5882D,0.4737D},{0.5882D,0.5D},{0.5882D,0.5263D},
                {0.5882D,0.5526D},{0.5882D,0.5789D},{0.5882D,0.6053D},{0.5882D,0.6316D},{0.5882D,0.6579D},{0.6078D,0.0D},
                {0.6078D,0.0263D},{0.6078D,0.0526D},{0.6078D,0.0789D},{0.6078D,0.1053D},{0.6078D,0.1316D},{0.6078D,0.1579D},
                {0.6078D,0.1842D},{0.6078D,0.2105D},{0.6078D,0.2368D},{0.6078D,0.2632D},{0.6078D,0.2895D},{0.6078D,0.3158D},
                {0.6078D,0.3421D},{0.6078D,0.3684D},{0.6078D,0.3947D},{0.6078D,0.4211D},{0.6078D,0.4474D},{0.6078D,0.4737D},
                {0.6078D,0.5D},{0.6078D,0.5263D},{0.6078D,0.5526D},{0.6078D,0.5789D},{0.6078D,0.6053D},{0.6078D,0.6316D},
                {0.6078D,0.6579D},{0.6275D,0.0D},{0.6275D,0.0263D},{0.6275D,0.0526D},{0.6275D,0.0789D},{0.6275D,0.1053D},
                {0.6275D,0.1316D},{0.6275D,0.1579D},{0.6275D,0.1842D},{0.6275D,0.2105D},{0.6275D,0.2368D},{0.6275D,0.2632D},
                {0.6275D,0.2895D},{0.6275D,0.3158D},{0.6275D,0.3421D},{0.6275D,0.3684D},{0.6275D,0.3947D},{0.6275D,0.4211D},
                {0.6275D,0.4474D},{0.6275D,0.4737D},{0.6275D,0.5D},{0.6275D,0.5263D},{0.6275D,0.5526D},{0.6275D,0.5789D},
                {0.6275D,0.6053D},{0.6275D,0.6316D},{0.6471D,0.0263D},{0.6471D,0.0526D},{0.6471D,0.0789D},{0.6471D,0.1053D},
                {0.6471D,0.1316D},{0.6471D,0.1579D},{0.6471D,0.1842D},{0.6471D,0.2105D},{0.6471D,0.2368D},{0.6471D,0.2632D},
                {0.6471D,0.2895D},{0.6471D,0.3158D},{0.6471D,0.3421D},{0.6471D,0.3684D},{0.6471D,0.3947D},{0.6471D,0.4211D},
                {0.6471D,0.4474D},{0.6471D,0.4737D},{0.6471D,0.5D},{0.6471D,0.5263D},{0.6471D,0.5526D},{0.6471D,0.5789D},
                {0.6471D,0.6053D},{0.6471D,0.6316D},{0.6471D,0.6579D},{0.6667D,0.0263D},{0.6667D,0.0526D},{0.6667D,0.0789D},
                {0.6667D,0.1053D},{0.6667D,0.1316D},{0.6667D,0.1579D},{0.6667D,0.1842D},{0.6667D,0.2105D},{0.6667D,0.2368D},
                {0.6667D,0.2632D},{0.6667D,0.2895D},{0.6667D,0.3158D},{0.6667D,0.3421D},{0.6667D,0.3684D},{0.6667D,0.3947D},
                {0.6667D,0.4211D},{0.6667D,0.4474D},{0.6667D,0.4737D},{0.6667D,0.5D},{0.6667D,0.5263D},{0.6667D,0.5526D},
                {0.6667D,0.5789D},{0.6667D,0.6053D},{0.6667D,0.6316D},{0.6667D,0.6579D},{0.6667D,0.6842D},{0.6667D,0.7105D},
                {0.6863D,0.0526D},{0.6863D,0.0789D},{0.6863D,0.1053D},{0.6863D,0.1316D},{0.6863D,0.1579D},{0.6863D,0.1842D},
                {0.6863D,0.2105D},{0.6863D,0.2368D},{0.6863D,0.2632D},{0.6863D,0.2895D},{0.6863D,0.3158D},{0.6863D,0.3421D},
                {0.6863D,0.3684D},{0.6863D,0.3947D},{0.6863D,0.4211D},{0.6863D,0.4474D},{0.6863D,0.4737D},{0.6863D,0.5D},
                {0.6863D,0.5263D},{0.6863D,0.5526D},{0.6863D,0.5789D},{0.6863D,0.6053D},{0.6863D,0.6316D},{0.6863D,0.6579D},
                {0.6863D,0.6842D},{0.6863D,0.7105D},{0.6863D,0.7368D},{0.7059D,0.0789D},{0.7059D,0.1053D},{0.7059D,0.1316D},
                {0.7059D,0.1579D},{0.7059D,0.1842D},{0.7059D,0.2105D},{0.7059D,0.2368D},{0.7059D,0.2632D},{0.7059D,0.2895D},
                {0.7059D,0.3158D},{0.7059D,0.3421D},{0.7059D,0.3684D},{0.7059D,0.3947D},{0.7059D,0.4211D},{0.7059D,0.4474D},
                {0.7059D,0.4737D},{0.7059D,0.5D},{0.7059D,0.5263D},{0.7059D,0.5526D},{0.7059D,0.5789D},{0.7059D,0.6053D},
                {0.7059D,0.6316D},{0.7059D,0.6579D},{0.7059D,0.6842D},{0.7059D,0.7105D},{0.7059D,0.7368D},{0.7059D,0.7632D},
                {0.7255D,0.0789D},{0.7255D,0.1053D},{0.7255D,0.1316D},{0.7255D,0.1579D},{0.7255D,0.1842D},{0.7255D,0.2105D},
                {0.7255D,0.2368D},{0.7255D,0.2632D},{0.7255D,0.2895D},{0.7255D,0.3158D},{0.7255D,0.3421D},{0.7255D,0.3684D},
                {0.7255D,0.3947D},{0.7255D,0.4211D},{0.7255D,0.4474D},{0.7255D,0.4737D},{0.7255D,0.5D},{0.7255D,0.5263D},
                {0.7255D,0.5526D},{0.7255D,0.5789D},{0.7255D,0.6053D},{0.7255D,0.6316D},{0.7255D,0.6579D},{0.7255D,0.6842D},
                {0.7255D,0.7105D},{0.7255D,0.7368D},{0.7255D,0.7632D},{0.7255D,0.7895D},{0.7451D,0.1053D},{0.7451D,0.1316D},
                {0.7451D,0.1579D},{0.7451D,0.1842D},{0.7451D,0.2105D},{0.7451D,0.2368D},{0.7451D,0.2632D},{0.7451D,0.2895D},
                {0.7451D,0.3158D},{0.7451D,0.3421D},{0.7451D,0.3684D},{0.7451D,0.3947D},{0.7451D,0.4211D},{0.7451D,0.4474D},
                {0.7451D,0.4737D},{0.7451D,0.5D},{0.7451D,0.5263D},{0.7451D,0.5526D},{0.7451D,0.5789D},{0.7451D,0.6053D},
                {0.7451D,0.6316D},{0.7451D,0.6579D},{0.7451D,0.6842D},{0.7451D,0.7105D},{0.7451D,0.7368D},{0.7451D,0.7632D},
                {0.7451D,0.7895D},{0.7451D,0.8158D},{0.7451D,0.8421D},{0.7647D,0.1316D},{0.7647D,0.1579D},{0.7647D,0.1842D},
                {0.7647D,0.2105D},{0.7647D,0.2368D},{0.7647D,0.2632D},{0.7647D,0.2895D},{0.7647D,0.3158D},{0.7647D,0.3421D},
                {0.7647D,0.3684D},{0.7647D,0.3947D},{0.7647D,0.4211D},{0.7647D,0.4474D},{0.7647D,0.4737D},{0.7647D,0.5D},
                {0.7647D,0.5263D},{0.7647D,0.5526D},{0.7647D,0.5789D},{0.7647D,0.6053D},{0.7647D,0.6316D},{0.7647D,0.6579D},
                {0.7647D,0.6842D},{0.7647D,0.7105D},{0.7647D,0.7368D},{0.7647D,0.7632D},{0.7647D,0.7895D},{0.7647D,0.8158D},
                {0.7647D,0.8421D},{0.7647D,0.8684D},{0.7843D,0.1842D},{0.7843D,0.2105D},{0.7843D,0.2368D},{0.7843D,0.2632D},
                {0.7843D,0.2895D},{0.7843D,0.3158D},{0.7843D,0.3421D},{0.7843D,0.3684D},{0.7843D,0.3947D},{0.7843D,0.4211D},
                {0.7843D,0.4474D},{0.7843D,0.4737D},{0.7843D,0.5526D},{0.7843D,0.5789D},{0.7843D,0.6053D},{0.7843D,0.6316D},
                {0.7843D,0.6579D},{0.7843D,0.6842D},{0.7843D,0.7105D},{0.7843D,0.7368D},{0.7843D,0.7632D},{0.7843D,0.7895D},
                {0.7843D,0.8158D},{0.7843D,0.8421D},{0.7843D,0.8684D},{0.8039D,0.2368D},{0.8039D,0.2632D},{0.8039D,0.2895D},
                {0.8039D,0.3158D},{0.8039D,0.3421D},{0.8039D,0.3684D},{0.8039D,0.3947D},{0.8039D,0.4211D},{0.8039D,0.5789D},
                {0.8039D,0.6053D},{0.8039D,0.6316D},{0.8039D,0.6579D},{0.8039D,0.6842D},{0.8039D,0.7105D},{0.8039D,0.7368D},
                {0.8039D,0.7632D},{0.8039D,0.7895D},{0.8039D,0.8158D},{0.8039D,0.8421D},{0.8039D,0.8684D},{0.8039D,0.8947D},
                {0.8235D,0.6053D},{0.8235D,0.6316D},{0.8235D,0.6579D},{0.8235D,0.6842D},{0.8235D,0.7105D},{0.8235D,0.7368D},
                {0.8235D,0.7632D},{0.8235D,0.7895D},{0.8235D,0.8158D},{0.8235D,0.8421D},{0.8235D,0.8684D},{0.8235D,0.8947D},
                {0.8235D,0.9211D},{0.8431D,0.6053D},{0.8431D,0.6316D},{0.8431D,0.6579D},{0.8431D,0.6842D},{0.8431D,0.7105D},
                {0.8431D,0.7368D},{0.8431D,0.7632D},{0.8431D,0.7895D},{0.8431D,0.8158D},{0.8431D,0.8421D},{0.8431D,0.8684D},
                {0.8431D,0.8947D},{0.8431D,0.9211D},{0.8431D,0.9474D},{0.8627D,0.6316D},{0.8627D,0.6579D},{0.8627D,0.6842D},
                {0.8627D,0.7105D},{0.8627D,0.7368D},{0.8627D,0.7632D},{0.8627D,0.7895D},{0.8627D,0.8158D},{0.8627D,0.8421D},
                {0.8627D,0.8684D},{0.8627D,0.8947D},{0.8627D,0.9211D},{0.8627D,0.9474D},{0.8824D,0.6579D},{0.8824D,0.6842D},
                {0.8824D,0.7105D},{0.8824D,0.7368D},{0.8824D,0.7632D},{0.8824D,0.7895D},{0.8824D,0.8158D},{0.8824D,0.8421D},
                {0.8824D,0.8684D},{0.8824D,0.8947D},{0.8824D,0.9211D},{0.8824D,0.9474D},{0.8824D,0.9737D},{0.902D,0.7105D},
                {0.902D,0.7368D},{0.902D,0.7632D},{0.902D,0.7895D},{0.902D,0.8158D},{0.902D,0.8421D},{0.902D,0.8684D},
                {0.902D,0.8947D},{0.902D,0.9211D},{0.902D,0.9474D},{0.902D,0.9737D},{0.9216D,0.7368D},{0.9216D,0.7632D},
                {0.9216D,0.7895D},{0.9216D,0.8158D},{0.9216D,0.8421D},{0.9216D,0.8684D},{0.9216D,0.8947D},{0.9216D,0.9211D},
                {0.9216D,0.9474D},{0.9216D,0.9737D},{0.9412D,0.7632D},{0.9412D,0.7895D},{0.9412D,0.8158D},{0.9412D,0.8421D},
                {0.9412D,0.8684D},{0.9412D,0.8947D},{0.9412D,0.9211D},{0.9412D,0.9474D},{0.9412D,0.9737D},{0.9608D,0.8158D},
                {0.9608D,0.8421D},{0.9608D,0.8684D},{0.9608D,0.8947D},{0.9608D,0.9211D},{0.9608D,0.9474D},{0.9608D,0.9737D},
                {0.9804D,0.8684D},{0.9804D,0.8947D},{0.9804D,0.9211D},{0.9804D,0.9474D},{0.9804D,0.9737D}
        }, event.getColors(), event.getFadeColors(), event.isFlickers(), event.isTrail(), true);
    }

    private static void createParticleShape(FireworkShapeRenderEvent event, double radius, double[][] coords, int[] colors, int[] fadeColors, boolean trail, boolean flickers, boolean thickness)
    {
        float f = RandomSource.create().nextFloat() * (float)Math.PI;
        double d2 = thickness ? 0.034D : 0.34D;

        for(int i = 0; i < 3; ++i)
        {
            double d3 = (double)f + (double)((float)i * (float)Math.PI) * d2;

            for(int j = 1; j < coords.length; ++j)
            {
                double d6 = coords[j][0];
                double d7 = coords[j][1];

                double d9 = d6 * radius;
                double d10 = d7 * radius;
                double d11 = d9 * Math.sin(d3);
                d9 *= Math.cos(d3);

                event.getParticleShapeRenderer().render(event.getParticlePos().x, event.getParticlePos().y, event.getParticlePos().z, d9, d10, d11, colors, fadeColors, trail, flickers);
            }
        }
    }
}
