package top.xuogroup.mcmods.elementsofharmony;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class ItemEHonestySword extends SwordItem {
    private static final IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 2400;
        }

        @Override
        public float getEfficiency() {
            return 10.0F;
        }

        @Override
        public float getAttackDamage() {
            return 4.0F;
        }

        @Override
        public int getHarvestLevel() {
            return 5;
        }

        @Override
        public int getEnchantability() {
            return 50;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ItemRegistry.itemEHonestyGem.get());
        }
    };
    public ItemEHonestySword(){
        super(iItemTier, 3, -2.0F, new Item.Properties().group(ModGroup.elementsofharmonyGroup));
    }
}
