package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class ItemELoyaltySword extends SwordItem {
    private static final IItemTier tireELoyalty = new TireELoyalty();
    public ItemELoyaltySword() {
        super(tireELoyalty, 3, -1.6F, new Item.Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
