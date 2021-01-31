package stride;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Stride.MODID)
public class Stride {
    public static final String MODID = "stride";

    public Stride() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        StrideBlocks.REGISTER.register(bus);
        StrideItems.REGISTER.register(bus);
        bus.addListener(this::clientSetup);
    }
    private void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(StrideBlocks.DULL_LANTERN.get(), RenderType.getCutoutMipped());
    }
}
