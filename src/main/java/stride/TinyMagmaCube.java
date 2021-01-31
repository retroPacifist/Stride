package stride;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class TinyMagmaCube extends Item {
    public TinyMagmaCube(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
       World world = context.getWorld();
        if (!world.isRemote) {
            ServerWorld server = (ServerWorld) world;
            MagmaCubeEntity entity = EntityType.MAGMA_CUBE.create(server);
            BlockPos placePos = context.getPos();
            entity.setPosition(placePos.getX() + 0.5D, placePos.getY(), placePos.getZ() + 0.5D);

            if (server.addEntity(entity))
                context.getItem().shrink(1);
        }
        return ActionResultType.func_233537_a_(world.isRemote);
    }

}