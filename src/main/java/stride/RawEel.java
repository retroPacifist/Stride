package stride;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class RawEel extends Item {
    public static final DamageSource ZAP = new DamageSource("ZAP").setDamageBypassesArmor();

    public RawEel(Item.Properties builder) {
        super(builder);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entity) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entity);
        if (!worldIn.isRemote) {
            entity.attackEntityFrom(ZAP, 1);
        }

        return itemstack;
    }

}
