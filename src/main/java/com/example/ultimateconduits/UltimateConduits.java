package com.example.ultimateconduits;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(UltimateConduits.MOD_ID)
public class UltimateConduits {

    public static final String MOD_ID = "ultimateconduits";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public UltimateConduits(IEventBus modEventBus) {
        LOGGER.info("UltimateConduits initializing - adding ultimate tier conduits for EnderIO!");
    }
}
