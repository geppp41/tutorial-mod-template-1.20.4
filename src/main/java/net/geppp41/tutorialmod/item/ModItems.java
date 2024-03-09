package net.geppp41.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.geppp41.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CELESTIAL_BRONZE_INGOT = registerItem("celestial_bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item WOLF_TOOTH = registerItem("wolf_tooth", new Item(new FabricItemSettings()));
    public static final Item CELESTIAL_BRONZE_WOLF_TOOTH = registerItem("celestial_bronze_wolf_tooth", new Item(new FabricItemSettings()));
    public static final Item CELESTIAL_BRONZE_NUGGET = registerItem("celestial_bronze_nugget", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(CELESTIAL_BRONZE_INGOT);
    }

private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
}
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
