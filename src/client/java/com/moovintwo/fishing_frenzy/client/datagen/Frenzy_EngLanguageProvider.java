package com.moovintwo.fishing_frenzy.client.datagen;

import com.moovintwo.fishing_frenzy.item.Frenzy_Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class Frenzy_EngLanguageProvider extends FabricLanguageProvider {
    protected Frenzy_EngLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Frenzy_Items.BARREL_ROD, "Barrel Rod");
        translationBuilder.add(Frenzy_Items.REINFORCED_ROD, "Reinforced Rod");
        translationBuilder.add(Frenzy_Items.POLAR_SNARE, "Polar Snare");
        translationBuilder.add(Frenzy_Items.PUFFERLINE, "Pufferline");

    }
}
