package stride;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StrideItems {
    public static final ItemGroup CREATIVE_TAB = new ItemGroup(Stride.MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(StrideItems.NETHERITE_STRIDER_ARMOR.get());
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }

        @Override
        public ResourceLocation getBackgroundImage() {
            return new ResourceLocation("minecraft", "textures/gui/container/creative_inventory/tab_item_search.png");
        }
    };

    public static final Food STRIDER_MEAT = (new Food.Builder()).hunger(2).saturation(0.3F).effect(new EffectInstance(Effects.SLOWNESS, 600, 0), 1F).meat().build();
    public static final Food COOKED_STRIDER_MEAT = new Food.Builder().hunger(7).saturation(0.7F).meat().build();
    public static final Food RAW_LAVA_BASKER = (new Food.Builder()).hunger(0).saturation(0.0F).effect(new EffectInstance(Effects.HUNGER, 600, 0), 1F).meat().build();
    public static final Food COOKED_LAVA_BASKER = (new Food.Builder()).hunger(4).saturation(0.4F).meat().build();
    public static final Food RAW_HOT_COD = (new Food.Builder()).hunger(2).saturation(0.1F).meat().build();
    public static final Food COOKED_HOT_COD = (new Food.Builder()).hunger(5).saturation(0.6F).meat().build();
    public static final Food RAW_EMBERSPAWN = (new Food.Builder()).hunger(2).saturation(0.1F).meat().build();
    public static final Food COOKED_EMBERSPAWN = (new Food.Builder()).hunger(5).saturation(0.6F).meat().build();
    public static final Food RAW_SALAMANDER = (new Food.Builder()).hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.FIRE_RESISTANCE, 200, 0), 1F).meat().build();
    public static final Food COOKED_SALAMANDER = (new Food.Builder()).hunger(3).saturation(0.4F).meat().build();
    public static final Food WARPED_PUFFERFISH = (new Food.Builder()).hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.REGENERATION, 200, 0), 1F).effect(new EffectInstance(Effects.MINING_FATIGUE, 250, 0), 1F).meat().build();
    public static final Food CRIMSON_PUFFERFISH = (new Food.Builder()).hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.POISON, 250, 0), 1F).effect(new EffectInstance(Effects.HASTE, 200, 0), 1F).meat().build();
    public static final Food ROTTEN_FISH = (new Food.Builder()).hunger(2).saturation(0.1F).effect(new EffectInstance(Effects.HUNGER, 400, 0), 1F).meat().build();
    public static final Food COOKED_EEL = (new Food.Builder()).hunger(2).saturation(0.3F).meat().fastToEat().build();
    public static final Food RAW_EEL = (new Food.Builder()).hunger(0).saturation(0.5F).effect(new EffectInstance(Effects.SPEED, 200, 0), 1F).meat().fastToEat().build();
    public static final Food SOUL_CARP = (new Food.Builder()).hunger(1).saturation(0.1F).meat().build();
    public static final Food SOUL = (new Food.Builder()).hunger(0).saturation(0.3F).build();
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS,Stride.MODID);
    public static final RegistryObject<Item> WOOLEN_STRIDER_ARMOR = REGISTER.register("woolen_strider_armor",()->new Item(new Item.Properties().group(CREATIVE_TAB).maxStackSize(1)));
    public static final RegistryObject<Item> LEATHER_STRIDER_ARMOR = REGISTER.register("leather_strider_armor",()->new Item(new Item.Properties().group(CREATIVE_TAB).maxStackSize(1)));
    public static final RegistryObject<Item> CHAINMAIL_STRIDER_ARMOR = REGISTER.register("chainmail_strider_armor",()->new Item(new Item.Properties().group(CREATIVE_TAB).maxStackSize(1)));
    public static final RegistryObject<Item> IRON_STRIDER_ARMOR = REGISTER.register("iron_strider_armor",()->new Item(new Item.Properties().group(CREATIVE_TAB).maxStackSize(1)));
    public static final RegistryObject<Item> GOLDEN_STRIDER_ARMOR = REGISTER.register("golden_strider_armor",()->new Item(new Item.Properties().group(CREATIVE_TAB).maxStackSize(1)));
    public static final RegistryObject<Item> DIAMOND_STRIDER_ARMOR = REGISTER.register("diamond_strider_armor",()->new Item(new Item.Properties().group(CREATIVE_TAB).maxStackSize(1)));
    public static final RegistryObject<Item> NETHERITE_STRIDER_ARMOR = REGISTER.register("netherite_strider_armor",()->new Item(new Item.Properties().group(CREATIVE_TAB).isImmuneToFire().maxStackSize(1)));
    public static final RegistryObject<Item> STRIDER_MEAT_ITEM = REGISTER.register("strider_meat",()->new Item(new Item.Properties().food(STRIDER_MEAT).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> COOKED_STRIDER_MEAT_ITEM = REGISTER.register("cooked_strider_meat",()->new Item(new Item.Properties().food(COOKED_STRIDER_MEAT).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> RAW_HOT_COD_ITEM = REGISTER.register("raw_hot_cod",()->new Item(new Item.Properties().food(RAW_HOT_COD).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> COOKED_HOT_COD_ITEM = REGISTER.register("cooked_hot_cod",()->new Item(new Item.Properties().food(COOKED_HOT_COD).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> RAW_LAVA_BASKER_ITEM = REGISTER.register("raw_lava_basker",()->new RawLavaBasker(new Item.Properties().food(RAW_LAVA_BASKER).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> COOKED_LAVA_BASKER_ITEM = REGISTER.register("cooked_lava_basker",()->new Item(new Item.Properties().food(COOKED_LAVA_BASKER).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> RAW_EMBERSPAWN_ITEM = REGISTER.register("raw_emberspawn",()->new Item(new Item.Properties().food(RAW_EMBERSPAWN).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> COOKED_EMBERSPAWN_ITEM = REGISTER.register("cooked_emberspawn",()->new Item(new Item.Properties().food(COOKED_EMBERSPAWN).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> RAW_SALAMANDER_ITEM = REGISTER.register("raw_salamander",()->new Item(new Item.Properties().food(RAW_SALAMANDER).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> COOKED_SALAMANDER_ITEM = REGISTER.register("cooked_salamander",()->new Item(new Item.Properties().food(COOKED_SALAMANDER).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> WARPED_PUFFERFISH_ITEM = REGISTER.register("warped_pufferfish",()->new Item(new Item.Properties().food(WARPED_PUFFERFISH).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> CRIMSON_PUFFERFISH_ITEM = REGISTER.register("crimson_pufferfish",()->new Item(new Item.Properties().food(CRIMSON_PUFFERFISH).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> CUBELING = REGISTER.register("cubeling",()->new Item(new Item.Properties().group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> ROTTEN_FISH_ITEM = REGISTER.register("rotten_fish",()->new Item(new Item.Properties().food(ROTTEN_FISH).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> BOTTLED_CUBELING = REGISTER.register("bottled_cubeling",()->new BottledCubeling(new Item.Properties().group(CREATIVE_TAB).isImmuneToFire().maxStackSize(1)));
    public static final RegistryObject<Item> COOKED_EEL_ITEM = REGISTER.register("cooked_eel",()->new Item(new Item.Properties().food(COOKED_EEL).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> RAW_EEL_ITEM = REGISTER.register("raw_eel",()->new RawEel(new Item.Properties().food(RAW_EEL).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> TINY_MAGMA_CUBE_ITEM = REGISTER.register("tiny_magma_cube",()->new Item(new Item.Properties().group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> SOUL_CARP_ITEM = REGISTER.register("soul_carp",()->new Item(new Item.Properties().food(SOUL_CARP).group(CREATIVE_TAB).isImmuneToFire()));
    public static final RegistryObject<Item> SOUL_ITEM = REGISTER.register("soul",()->new Soul(new Item.Properties().food(SOUL).group(CREATIVE_TAB).isImmuneToFire()));
    private StrideItems() {}
}
