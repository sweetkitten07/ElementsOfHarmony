package top.xuogroup.mcmods.elementsofharmony;


import net.minecraft.client.util.SearchTreeManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("elementsofharmony")
public class ElementsOfHarmony {

    public ElementsOfHarmony() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
