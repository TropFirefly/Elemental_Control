package com.TropFirefly.EC;

import com.TropFirefly.EC.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "EC", name = "Elemental Control", version = "1.7.10-v.1.0")
public class EC
{
    @Mod.Instance("EC")
    public static EC instance;

    @SidedProxy(clientSide = "com.TropFirefly.EC.proxy.ClienProxy", serverSide = "com.TropFirefly.EC.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}