package dev.scarcekoi.freezer.item;

import dev.scarcekoi.freezer.Freezer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Items {
    public static final Item WAFFLE = registerItem("waffle", new Item(new Item.Settings()
            .food(FoodComponents.WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID,
                    "waffle")))));
    public static final Item PARTIAL_CHOCOLATE_WAFFLE = registerItem("partial_chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.PARTIAL_CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID,
                    "partial_chocolate_waffle")))));
    public static final Item HALF_CHOCOLATE_WAFFLE = registerItem("half_chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.HALF_CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID,
                    "half_chocolate_waffle")))));
    public static final Item CHOCOLATE_WAFFLE = registerItem("chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID,
                    "chocolate_waffle")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Freezer.MOD_ID, name), item);
    }

    public static void registerItems() {
        Freezer.LOGGER.info("Registering Items for " + Freezer.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(WAFFLE);
            entries.add(PARTIAL_CHOCOLATE_WAFFLE);
            entries.add(HALF_CHOCOLATE_WAFFLE);
            entries.add(CHOCOLATE_WAFFLE);
        });
    }
}
