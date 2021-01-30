package stride;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class RawLavaBasker extends Item {
    public RawLavaBasker(Item.Properties builder) {
        super(builder);
    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entity) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entity);
        if (!worldIn.isRemote) {
            entity.heal(2);
        }

        return new ItemStack(Items.GLASS_BOTTLE);
    }

    @Override
    public boolean isPiglinCurrency(ItemStack stack) {
        return true;
    }
}
