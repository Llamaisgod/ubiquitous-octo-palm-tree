package com.skyblockbridge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/**
 * Skyblock Bridge. All content is data-driven (see src/main/resources/data/skyblock_bridge/recipe);
 * this class only exists so the project builds as a normal NeoForge mod.
 */
@Mod(SkyblockBridge.MOD_ID)
public class SkyblockBridge {
    public static final String MOD_ID = "skyblock_bridge";

    public SkyblockBridge(IEventBus modEventBus) {
    }
}
