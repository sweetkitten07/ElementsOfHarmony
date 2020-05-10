package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "elementsofharmony");
    public static RegistryObject<Item> itemEMagicGem = ITEMS.register("item_e_magic_gem", ItemEMagicGem::new);
}
