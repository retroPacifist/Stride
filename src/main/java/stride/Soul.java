package stride;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Soul extends Item {
    public Soul(Item.Properties builder) {super(builder);}

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entity) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entity);
        if (!worldIn.isRemote) {
            entity.heal(2);
        }

        return itemstack;
    }


}
