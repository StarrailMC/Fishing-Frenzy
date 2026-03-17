package com.moovintwo.fishing_frenzy;

import com.moovintwo.fishing_frenzy.item.Frenzy_ItemGroups;
import com.moovintwo.fishing_frenzy.item.Frenzy_Items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fishing_frenzy implements ModInitializer {

    public static final String MOD_ID = "fishing_frenzy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        Frenzy_Items.registerItems();
        Frenzy_ItemGroups.registerItemGroups();

    }
}
