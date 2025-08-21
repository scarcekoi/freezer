package dev.scarcekoi.freezer;

import dev.scarcekoi.freezer.item.ItemGroups;
import dev.scarcekoi.freezer.item.Items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Freezer implements ModInitializer {
    public static final String MOD_ID = "freezer";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        Items.registerItems();
        ItemGroups.registerItemGroups();
    }
}
