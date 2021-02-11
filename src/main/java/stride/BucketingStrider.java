package stride;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

class MyForgeEventHandler {
    private static final RegistryObject<Item> STRIDER_BUCKET_ITEM = StrideItems.STRIDER_BUCKET_ITEM;

    @Mod.EventBusSubscriber(modid = Stride.MODID)
    public static class StrideEvents {
        @SubscribeEvent

        public static void bucketStrider(final PlayerInteractEvent.EntityInteractSpecific event) {
            if (event.getTarget() != null && !event.getWorld().isRemote) {
                ItemStack itemstack = event.getPlayer().getHeldItem(event.getHand());
                Item item = itemstack.getItem();

                Entity target = event.getTarget();
                EntityType<?> targetType = target.getType();
                PlayerEntity player = event.getPlayer();
                Hand hand = event.getHand();
                Item bucket = StrideItems.STRIDER_BUCKET_ITEM.get();
                ItemStack bucketItem = new ItemStack(bucket);
                boolean successful = false;

                if (targetType == EntityType.STRIDER) {
                    CompoundNBT tag = target.getPersistentData();
                    if (((AgeableEntity)target).isChild()) {
                        successful = true;
                    }
                }

                if (successful && ((MobEntity) target).isAlive()) {
                    if (item == Items.LAVA_BUCKET) {
                        itemstack.shrink(1);
                        event.getWorld().playSound(player, event.getPos(), SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                        player.addStat(Stats.ITEM_USED.get(event.getItemStack().getItem()));
                        event.getTarget().remove();
                        if (itemstack.isEmpty()) {
                            player.setHeldItem(hand, bucketItem);
                        } else if (!player.inventory.addItemStackToInventory(bucketItem)) {
                            player.dropItem(bucketItem, false);
                        }
                        player.swingArm(hand);
                    }
                }
            }
        }
    }
}