package net.yunitrish.adaptor.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.yunitrish.adaptor.AdaptorMain;
import net.yunitrish.adaptor.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup AdaptorGroup = Registry.register(Registries.ITEM_GROUP,new Identifier(AdaptorMain.MOD_ID, "adaptor_group"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.adaptor_group")).icon(()-> new ItemStack(ModItems.SALT)).entries(((displayContext, entries) -> {
        entries.add(ModItems.FLOUR);
        entries.add(ModItems.DOUGH);
        entries.add(ModItems.SALT);

        entries.add(ModItems.SOYBEAN);
        entries.add(ModItems.CORN);
        entries.add(ModItems.CORN_SEEDS);
        entries.add(ModItems.MARIJUANA_LEAF);
        entries.add(ModItems.MARIJUANA_SEEDS);

        entries.add(ModItems.METAL_DETECTOR);
        entries.add(ModItems.IRON_HAMMER);

        entries.add(ModItems.COPPER_AXE);
        entries.add(ModItems.COPPER_HOE);
        entries.add(ModItems.COPPER_PICKAXE);
        entries.add(ModItems.COPPER_SHOVEL);
        entries.add(ModItems.COPPER_SWORD);

        entries.add(ModItems.COPPER_HELMET);
        entries.add(ModItems.COPPER_CHESTPLATE);
        entries.add(ModItems.COPPER_LEGGINGS);
        entries.add(ModItems.COPPER_BOOTS);

        entries.add(ModItems.BAMBOO_COAL);

        entries.add(ModBlocks.SALT_BLOCK);
        entries.add(ModBlocks.SALT_ORE);
        entries.add(ModBlocks.DEEPSLATE_SALT_ORE);
        entries.add(ModBlocks.NETHER_SALT_ORE);
        entries.add(ModBlocks.END_STONE_SALT_ORE);

        entries.add(ModBlocks.DIRT_BUTTON);
        entries.add(ModBlocks.DIRT_DOOR);
        entries.add(ModBlocks.DIRT_FENCE);
        entries.add(ModBlocks.DIRT_FENCE_GATE);
        entries.add(ModBlocks.DIRT_PRESSURE_PLATE);
        entries.add(ModBlocks.DIRT_SLAB);
        entries.add(ModBlocks.DIRT_STAIRS);
        entries.add(ModBlocks.DIRT_TRAPDOOR);
        entries.add(ModBlocks.DIRT_WALL);

        entries.add(ModItems.PORCUPINE_SPAWN_EGG);

        entries.add(ModBlocks.SOUND_BLOCK);
        entries.add(ModBlocks.GEM_POLISHING_STATION);

        entries.add(ModBlocks.DAHLIA);

        entries.add(ModItems.SAKURA_VALLEY_MUSIC_DISC);
        entries.add(ModItems.BAR_BRAWL_MUSIC_DISC);
    })).build());

    public static void registerItemGroups() {
        AdaptorMain.LOGGER.info("Registering Item Groups for " + AdaptorMain.MOD_ID);
    }
}
