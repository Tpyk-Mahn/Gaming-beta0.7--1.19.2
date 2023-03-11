package net.tpykmahn.jaune.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tpykmahn.jaune.JauneJade;

public class ModItems {
    public static final Item HANDLE = registerItem("handle",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item PEBBLE = registerItem("pebble",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item GRANITE_RUBBLE = registerItem("granite_rubble",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item DIORITE_RUBBLE = registerItem("diorite_rubble",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ANDESITE_RUBBLE = registerItem("andesite_rubble",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item DEEPSLATE_RUBBLE = registerItem("deepslate_rubble",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item TUFF_RUBBLE = registerItem("tuff_rubble",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item NETHERRACK_RUBBLE = registerItem("netherrack_rubble",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item BASALT_RUBBLE = registerItem("basalt_rubble",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ENDSTONE_RUBBLE = registerItem("end_stone_rubble",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SHARP_STONE_PIECE = registerItem("sharp_stone_piece",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SHARP_IRON_PIECE = registerItem("sharp_iron_piece",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SHARP_GOLD_PIECE = registerItem("sharp_gold_piece",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item SHARP_DIAMOND = registerItem("sharp_diamond",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CHARGED_LAPIS_CRYSTAL = registerItem("charged_lapis_lazuli_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item BLAZING_COAL = registerItem("blazing_coal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ENCHANTER_BOOK = registerItem("enchanter_book",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(JauneJade.MOD_ID, name), item);
    }
    public static void registerModItems() {
        JauneJade.LOGGER.debug("Registering Mod items for" + JauneJade.MOD_ID);
    }
}
