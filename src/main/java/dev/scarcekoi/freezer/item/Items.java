package dev.scarcekoi.freezer.item;

import dev.scarcekoi.freezer.Freezer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Items {
    public static final Item WAFFLE = registerItem("waffle", new Item(new Item.Settings()
            .food(FoodComponents.WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "waffle")))));
    public static final Item PARTIAL_CHOCOLATE_WAFFLE = registerItem("partial_chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.PARTIAL_CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "partial_chocolate_waffle")))));
    public static final Item HALF_CHOCOLATE_WAFFLE = registerItem("half_chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.HALF_CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "half_chocolate_waffle")))));
    public static final Item MOST_CHOCOLATE_WAFFLE = registerItem("most_chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.MOST_CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "most_chocolate_waffle")))));
    public static final Item CHOCOLATE_WAFFLE = registerItem("chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "chocolate_waffle")))));

    public static final Item PARTIAL_CHOCOLATE_CHIP_WAFFLE = registerItem("partial_chocolate_chip_waffle", new Item(new Item.Settings()
            .food(FoodComponents.PARTIAL_CHOCOLATE_CHIP_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "partial_chocolate_chip_waffle")))));
    public static final Item HALF_CHOCOLATE_CHIP_WAFFLE = registerItem("half_chocolate_chip_waffle", new Item(new Item.Settings()
            .food(FoodComponents.HALF_CHOCOLATE_CHIP_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "half_chocolate_chip_waffle")))));
    public static final Item MOST_CHOCOLATE_CHIP_WAFFLE = registerItem("most_chocolate_chip_waffle", new Item(new Item.Settings()
            .food(FoodComponents.MOST_CHOCOLATE_CHIP_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "most_chocolate_chip_waffle")))));
    public static final Item CHOCOLATE_CHIP_WAFFLE = registerItem("chocolate_chip_waffle", new Item(new Item.Settings()
            .food(FoodComponents.CHOCOLATE_CHIP_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "chocolate_chip_waffle")))));

    public static final Item PARTIAL_BLUEBERRY_WAFFLE = registerItem("partial_blueberry_waffle", new Item(new Item.Settings()
            .food(FoodComponents.PARTIAL_BLUEBERRY_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "partial_blueberry_waffle")))));
    public static final Item HALF_BLUEBERRY_WAFFLE = registerItem("half_blueberry_waffle", new Item(new Item.Settings()
            .food(FoodComponents.HALF_BLUEBERRY_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "half_blueberry_waffle")))));
    public static final Item MOST_BLUEBERRY_WAFFLE = registerItem("most_blueberry_waffle", new Item(new Item.Settings()
            .food(FoodComponents.MOST_BLUEBERRY_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "most_blueberry_waffle")))));
    public static final Item BLUEBERRY_WAFFLE = registerItem("blueberry_waffle", new Item(new Item.Settings()
            .food(FoodComponents.BLUEBERRY_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "blueberry_waffle")))));

    public static final Item FROZEN_WAFFLE = registerItem("frozen_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_waffle")))));
    public static final Item FROZEN_PARTIAL_CHOCOLATE_WAFFLE = registerItem("frozen_partial_chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_PARTIAL_CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_partial_chocolate_waffle")))));
    public static final Item FROZEN_HALF_CHOCOLATE_WAFFLE = registerItem("frozen_half_chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_HALF_CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_half_chocolate_waffle")))));
    public static final Item FROZEN_MOST_CHOCOLATE_WAFFLE = registerItem("frozen_most_chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_MOST_CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_most_chocolate_waffle")))));
    public static final Item FROZEN_CHOCOLATE_WAFFLE = registerItem("frozen_chocolate_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_CHOCOLATE_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_chocolate_waffle")))));
    public static final Item FROZEN_PARTIAL_CHOCOLATE_CHIP_WAFFLE = registerItem("frozen_partial_chocolate_chip_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_PARTIAL_CHOCOLATE_CHIP_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_partial_chocolate_chip_waffle")))));
    public static final Item FROZEN_HALF_CHOCOLATE_CHIP_WAFFLE = registerItem("frozen_half_chocolate_chip_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_HALF_CHOCOLATE_CHIP_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_half_chocolate_chip_waffle")))));
    public static final Item FROZEN_MOST_CHOCOLATE_CHIP_WAFFLE = registerItem("frozen_most_chocolate_chip_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_MOST_CHOCOLATE_CHIP_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_most_chocolate_chip_waffle")))));
    public static final Item FROZEN_CHOCOLATE_CHIP_WAFFLE = registerItem("frozen_chocolate_chip_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_CHOCOLATE_CHIP_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_chocolate_chip_waffle")))));
    public static final Item FROZEN_PARTIAL_BLUEBERRY_WAFFLE = registerItem("frozen_partial_blueberry_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_PARTIAL_BLUEBERRY_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_partial_blueberry_waffle")))));
    public static final Item FROZEN_HALF_BLUEBERRY_WAFFLE = registerItem("frozen_half_blueberry_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_HALF_BLUEBERRY_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_half_blueberry_waffle")))));
    public static final Item FROZEN_MOST_BLUEBERRY_WAFFLE = registerItem("frozen_most_blueberry_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_MOST_BLUEBERRY_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_most_blueberry_waffle")))));
    public static final Item FROZEN_BLUEBERRY_WAFFLE = registerItem("frozen_blueberry_waffle", new Item(new Item.Settings()
            .food(FoodComponents.FROZEN_BLUEBERRY_WAFFLE)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID, "frozen_blueberry_waffle")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Freezer.MOD_ID, name), item);
    }

    public static void registerItems() {
        Freezer.LOGGER.info("Registering Items for " + Freezer.MOD_ID);
    }
}
