package stride;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LanternBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StrideBlocks {
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS,Stride.MODID);
    public static final RegistryObject<Block> DULL_LANTERN = REGISTER.register("dull_lantern", () -> createBlockWithItem("dull_lantern", new LanternBlock(AbstractBlock.Properties.from(Blocks.LANTERN).setLightLevel((state) -> 7))));

    public static <T extends Block> T createBlockWithItem(String name, T block) {
        StrideItems.REGISTER.register(name, () -> new BlockItem(block, new Item.Properties().group(StrideItems.CREATIVE_TAB)));
        return block;
    }
}
