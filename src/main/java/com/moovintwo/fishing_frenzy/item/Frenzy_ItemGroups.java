package com.moovintwo.fishing_frenzy.item;

import com.moovintwo.fishing_frenzy.Fishing_frenzy;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Frenzy_ItemGroups {

    public static String groupKey(String identifier) { return "itemGroup." + Fishing_frenzy.MOD_ID + "." + identifier; }

    public static final net.minecraft.item.ItemGroup PIXEL_PROMISE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Fishing_frenzy.MOD_ID, "fishing_tools"),
            FabricItemGroup.builder().displayName(Text.translatable(groupKey("fishing_tools")))
                    .icon(() -> new ItemStack(Frenzy_Items.BARREL_ROD)).entries((displayContext, entries) -> {
                        entries.add(Frenzy_Items.BARREL_ROD);
                        entries.add(Frenzy_Items.REINFORCED_ROD);
                        entries.add(Frenzy_Items.POLAR_SNARE);
                        entries.add(Frenzy_Items.PUFFERLINE);

                    }).build());


    public static void registerItemGroups() {
        Fishing_frenzy.LOGGER.info("Registering Item Groups for " + Fishing_frenzy.MOD_ID);
    }
}