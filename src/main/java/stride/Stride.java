package stride;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Stride.MODID)
public class Stride {
    public static final String MODID = "stride";

    public Stride() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        StrideItems.REGISTER.register(bus);
    }
}
