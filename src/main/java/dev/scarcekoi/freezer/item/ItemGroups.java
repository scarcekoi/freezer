package dev.scarcekoi.freezer.item;

import dev.scarcekoi.freezer.Freezer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup WAFFLES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Freezer.MOD_ID, "waffles"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.WAFFLE))
                    .displayName(Text.translatable("itemgroup.freezer.waffles"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.WAFFLE);
                        entries.add(Items.PARTIAL_CHOCOLATE_WAFFLE);
                        entries.add(Items.HALF_CHOCOLATE_WAFFLE);
                        entries.add(Items.MOST_CHOCOLATE_WAFFLE);
                        entries.add(Items.CHOCOLATE_WAFFLE);

                        entries.add(Items.FROZEN_WAFFLE);
                        entries.add(Items.FROZEN_PARTIAL_CHOCOLATE_WAFFLE);
                        entries.add(Items.FROZEN_HALF_CHOCOLATE_WAFFLE);
                        entries.add(Items.FROZEN_MOST_CHOCOLATE_WAFFLE);
                        entries.add(Items.FROZEN_CHOCOLATE_WAFFLE);
                    }).build());

    public static void registerItemGroups() {
        Freezer.LOGGER.info("Registering Item Groups for " + Freezer.MOD_ID);
    }
}
