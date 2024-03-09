package net.geppp41.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.geppp41.tutorialmod.TutorialMod;
import net.geppp41.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CELESTIAL_BRONZE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ir"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.celestial_bronze"))
                    .icon(() -> new ItemStack(ModItems.CELESTIAL_BRONZE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CELESTIAL_BRONZE_INGOT);
                        entries.add(ModBlocks.CELESTIAL_BRONZE_ORE);
                        entries.add(ModBlocks.CELESTIAL_BRONZE_BLOCK);
                        entries.add(ModItems.CELESTIAL_BRONZE_WOLF_TOOTH);
                        entries.add(ModItems.WOLF_TOOTH);
                        entries.add(ModItems.CELESTIAL_BRONZE_NUGGET);
                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
