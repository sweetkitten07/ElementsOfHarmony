package top.xuogroup.mcmods.elementsofharmony.test;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ElementsOfHarmonyGroup extends ItemGroup {
    public ElementsOfHarmonyGroup(){
        super("elementsofharmony_group");
    }
    @Override @Nonnull
    public ItemStack createIcon(){
        return new ItemStack(ItemRegistry.itemEMagicGem.get());
    }
}
