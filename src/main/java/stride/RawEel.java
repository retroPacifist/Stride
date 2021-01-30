package stride;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class RawEel extends Item {
    public RawEel(Item.Properties builder) {super(builder);}

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entity) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entity);
        if (!worldIn.isRemote) {
            entity.attackEntityFrom (new DamageSource("ZAP"), 1);
        }
//HOW DO I MAKE IT NOT DAMAGE ARMOR?
        return itemstack;
    }


}
