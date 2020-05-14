package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "elementsofharmony");
    // Create ITEMS Object

    public static RegistryObject<Item> itemELoyaltyGem = ITEMS.register("item_e_loyalty_gem", ItemELoyaltyGem::new);
    public static RegistryObject<Item> itemELaughterGem = ITEMS.register("item_e_laughter_gem", ItemELaughterGem::new);
    public static RegistryObject<Item> itemEGenerosityGem = ITEMS.register("item_e_generosity_gem", ItemEGenerosityGem::new);
    public static RegistryObject<Item> itemEHonestyGem = ITEMS.register("item_e_honesty_gem", ItemEHonestyGem::new);
    public static RegistryObject<Item> itemEKindnessGem = ITEMS.register("item_e_kindness_gem", ItemEKindnessGem::new);
    public static RegistryObject<Item> itemEMagicGem = ITEMS.register("item_e_magic_gem", ItemEMagicGem::new);
    // Register Six Elements

    // Sep -------------------------------------------------------------------------------------------------------------

    public static RegistryObject<Item> blockELoyaltyMine = ITEMS.register("block_e_loyalty_mine",
            () -> new BlockItem(BlockRegistry.blockELoyaltyMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockELaughterMine = ITEMS.register("block_e_laughter_mine",
            () -> new BlockItem(BlockRegistry.blockELaughterMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockEGenerosityMine = ITEMS.register("block_e_generosity_mine",
            () -> new BlockItem(BlockRegistry.blockEGenerosityMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockEHonestyMine = ITEMS.register("block_e_honesty_mine",
            () -> new BlockItem(BlockRegistry.blockEHonestyMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockEKindnessMine = ITEMS.register("block_e_kindness_mine",
            () -> new BlockItem(BlockRegistry.blockEKindnessMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));
    public static RegistryObject<Item> blockEMagicMine = ITEMS.register("block_e_magic_mine",
            () -> new BlockItem(BlockRegistry.blockEMagicMine.get(), new Item.Properties().group(ModGroup.elementsofharmonyGroup)));

}
