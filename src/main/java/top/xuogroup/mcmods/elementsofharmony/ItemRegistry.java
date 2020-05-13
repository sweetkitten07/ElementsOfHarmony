package top.xuogroup.mcmods.elementsofharmony;

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
}
