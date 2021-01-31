package stride;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StrideBlocks {
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS,Stride.MODID);
    public static final RegistryObject<Block> DULL_LANTERN = REGISTER.register("dull_lantern", () -> createBlockWithItem("dull_lantern", new LanternBlock(AbstractBlock.Properties.from(Blocks.LANTERN).setLightLevel((state) -> 7))));
    private BlockState defaultState;
    protected static final Direction[] UPDATE_ORDER = new Direction[]{Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH, Direction.DOWN, Direction.UP};

    public static <T extends Block> T createBlockWithItem(String name, T block) {
        StrideItems.REGISTER.register(name, () -> new BlockItem(block, new Item.Properties().group(StrideItems.CREATIVE_TAB)));
        return block;
    }
}
