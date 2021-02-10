package stride;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class StriderBucket extends Item {
    public StriderBucket(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        PlayerEntity player = context.getPlayer();
        Hand handIn = player.getActiveHand();
        World world = context.getWorld();
        if (!world.isRemote) {
            ServerWorld server = (ServerWorld) world;
            StriderEntity entity = EntityType.STRIDER.create(server);
            BlockPos placePos = context.getPos();
            entity.setPosition(placePos.getX() + 0.5D, placePos.getY() + 1.0D, placePos.getZ() + 0.5D);
            entity.setChild(true);

            if (server.addEntity(entity))
                if (!player.abilities.isCreativeMode) {
                    context.getPlayer().setHeldItem(handIn, new ItemStack(Items.LAVA_BUCKET));
                }
        }
        return ActionResultType.func_233537_a_(world.isRemote);
    }

}