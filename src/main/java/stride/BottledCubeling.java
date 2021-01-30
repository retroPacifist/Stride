package stride;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.world.World;

public class BottledCubeling extends PotionItem {
    public BottledCubeling(Properties builder) {
        super(builder);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entity) {
        if (!worldIn.isRemote) {
            entity.setFire(5);
        }
        return super.onItemUseFinish(stack, worldIn, entity);
    }
}
