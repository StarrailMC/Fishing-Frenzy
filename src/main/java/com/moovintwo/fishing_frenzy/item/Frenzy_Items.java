package com.moovintwo.fishing_frenzy.item;

import com.moovintwo.fishing_frenzy.Fishing_frenzy;
import com.moovintwo.fishing_frenzy.item.rods.Barrel_Rod;
import com.moovintwo.fishing_frenzy.item.rods.Polar_Snare;
import com.moovintwo.fishing_frenzy.item.rods.Pufferline;
import com.moovintwo.fishing_frenzy.item.rods.Reinforced_Rod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Frenzy_Items {

    public static final Item BARREL_ROD = registerItem("barrel_rod", new Barrel_Rod(new FabricItemSettings().maxDamage(64)));
    public static final Item REINFORCED_ROD = registerItem("reinforced_rod", new Reinforced_Rod(new FabricItemSettings().maxDamage(64)));
    public static final Item POLAR_SNARE = registerItem("polar_snare", new Polar_Snare(new FabricItemSettings().maxDamage(64)));
    public static final Item PUFFERLINE = registerItem("pufferline", new Pufferline(new FabricItemSettings().maxDamage(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Fishing_frenzy.MOD_ID, name), item);
    }



    public static void registerItems() {
        Fishing_frenzy.LOGGER.info("Registering Mod Items for " + Fishing_frenzy.MOD_ID);
    }
}
