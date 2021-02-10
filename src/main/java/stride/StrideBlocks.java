package stride;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StrideBlocks {
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS,Stride.MODID);
    public static final RegistryObject<Block> DULL_LANTERN = REGISTER.register("dull_lantern", () -> createBlockWithItem("dull_lantern", new LanternBlock(AbstractBlock.Properties.from(Blocks.LANTERN).setLightLevel((state) -> 7))));
    public static final RegistryObject<Block> FISH_TRAP = REGISTER.register("fish_trap", () -> createBlockWithItem("fish_trap", new FishTrapBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 2.0F).sound(SoundType.METAL).notSolid())));
    private BlockState defaultState;
    protected static final Direction[] UPDATE_ORDER = new Direction[]{Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH, Direction.DOWN, Direction.UP};

    private static Boolean neverAllowSpawn(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity) {
        return (boolean)false;
    }

    public static <T extends Block> T createBlockWithItem(String name, T block) {
        StrideItems.REGISTER.register(name, () -> new BlockItem(block, new Item.Properties().group(StrideItems.CREATIVE_TAB)));
        return block;
    }
}