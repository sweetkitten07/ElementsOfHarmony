package top.xuogroup.mcmods.elementsofharmony.test;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("elementsofharmony")
public class ElementsOfHarmony {

    public ElementsOfHarmony() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
