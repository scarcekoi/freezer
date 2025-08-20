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
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Freezer.MOD_ID,"waffle")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Freezer.MOD_ID, name), item);
    }

    public static void registerItems() {
        Freezer.LOGGER.info("Registering Items for " + Freezer.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(WAFFLE);
        });
    }
}
