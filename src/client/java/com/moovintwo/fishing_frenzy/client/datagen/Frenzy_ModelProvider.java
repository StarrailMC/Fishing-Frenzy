package com.moovintwo.fishing_frenzy.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class Frenzy_ModelProvider extends FabricModelProvider {
    public Frenzy_ModelProvider(FabricDataOutput output) {
        super(output);
    }

    private static final Model FISHING_ROD = new Model(
            Optional.of(new Identifier("item/handheld_rod")),
            Optional.empty(),
            TextureKey.LAYER0
    );

    private static final Model FISHING_ROD_CAST = new Model(
            Optional.of(new Identifier("item/handheld_rod")),
            Optional.empty(),
            TextureKey.LAYER0
    );

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    @Override
    public String getName() {
        return "Frenzy_ModelProvider";
    }
}