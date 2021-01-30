package stride;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RawLavaBasker extends Item {
    public RawLavaBasker(Item.Properties builder) {
        super(builder);
    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */

    @Override
    public boolean isPiglinCurrency(ItemStack stack) {
        return true;
    }
}
