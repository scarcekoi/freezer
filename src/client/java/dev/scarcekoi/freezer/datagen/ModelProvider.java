package dev.scarcekoi.freezer.datagen;

import dev.scarcekoi.freezer.item.Items;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Items.WAFFLE, Models.GENERATED);
        itemModelGenerator.register(Items.PARTIAL_CHOCOLATE_WAFFLE, Models.GENERATED);
        itemModelGenerator.register(Items.HALF_CHOCOLATE_WAFFLE, Models.GENERATED);
        itemModelGenerator.register(Items.CHOCOLATE_WAFFLE, Models.GENERATED);
    }
}
