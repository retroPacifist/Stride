package stride;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StrideItems {
    public static final Food STRIDER_MEAT = (new Food.Builder()).hunger(2).saturation(0.3F).effect(new EffectInstance(Effects.SLOWNESS, 600, 1), 1F).meat().build();
    public static final Food COOKED_STRIDER_MEAT = new Food.Builder().hunger(7).saturation(0.7F).meat().build();
    public static final Food RAW_LAVA_BASKER = (new Food.Builder()).hunger(0).saturation(0.0F).effect(new EffectInstance(Effects.HUNGER, 600, 1), 1F).meat().build();
    public static final Food COOKED_LAVA_BASKER = (new Food.Builder()).hunger(4).saturation(0.4F).meat().build();
    public static final Food RAW_HOT_COD = (new Food.Builder()).hunger(2).saturation(0.1F).meat().build();
    public static final Food COOKED_HOT_COD = (new Food.Builder()).hunger(5).saturation(0.6F).meat().build();
    public static final Food RAW_EMBERSPAWN = (new Food.Builder()).hunger(2).saturation(0.1F).meat().build();
    public static final Food COOKED_EMBERSPAWN = (new Food.Builder()).hunger(5).saturation(0.6F).meat().build();
    public static final Food RAW_SALAMANDER = (new Food.Builder()).hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.FIRE_RESISTANCE, 200, 1), 1F).meat().build();
    public static final Food COOKED_SALAMANDER = (new Food.Builder()).hunger(3).saturation(0.4F).meat().build();
    public static final Food WARPED_PUFFERFISH = (new Food.Builder()).hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.REGENERATION, 200, 1), 1F).effect(new EffectInstance(Effects.MINING_FATIGUE, 250, 1), 1F).meat().build();
    public static final Food CRIMSON_PUFFERFISH = (new Food.Builder()).hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.POISON, 250, 1), 1F).effect(new EffectInstance(Effects.HASTE, 200, 1), 1F).meat().build();
    public static final Food ROTTEN_FISH = (new Food.Builder()).hunger(2).saturation(0.1F).effect(new EffectInstance(Effects.HUNGER, 400, 1), 1F).meat().build();
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS,Stride.MODID);
    public static final RegistryObject<Item> WOOLEN_STRIDER_ARMOR = REGISTER.register("woolen_strider_armor",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEATHER_STRIDER_ARMOR = REGISTER.register("leather_strider_armor",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAINMAIL_STRIDER_ARMOR = REGISTER.register("chainmail_strider_armor",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_STRIDER_ARMOR = REGISTER.register("iron_strider_armor",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_STRIDER_ARMOR = REGISTER.register("golden_strider_armor",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_STRIDER_ARMOR = REGISTER.register("diamond_strider_armor",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_STRIDER_ARMOR = REGISTER.register("netherite_strider_armor",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRIDER_MEAT_ITEM = REGISTER.register("strider_meat",()->new Item(new Item.Properties().food(STRIDER_MEAT)));
    public static final RegistryObject<Item> COOKED_STRIDER_MEAT_ITEM = REGISTER.register("cooked_strider_meat",()->new Item(new Item.Properties().food(COOKED_STRIDER_MEAT)));
    public static final RegistryObject<Item> RAW_HOT_COD_ITEM = REGISTER.register("raw_hot_cod",()->new Item(new Item.Properties().food(RAW_HOT_COD)));
    public static final RegistryObject<Item> COOKED_HOT_COD_ITEM = REGISTER.register("cooked_hot_cod",()->new Item(new Item.Properties().food(COOKED_HOT_COD)));
    public static final RegistryObject<Item> RAW_LAVA_BASKER_ITEM = REGISTER.register("raw_lava_basker",()->new RawLavaBasker(new Item.Properties().food(RAW_LAVA_BASKER)));
    public static final RegistryObject<Item> COOKED_LAVA_BASKER_ITEM = REGISTER.register("cooked_lava_basker",()->new Item(new Item.Properties().food(COOKED_LAVA_BASKER)));
    public static final RegistryObject<Item> RAW_EMBERSPAWN_ITEM = REGISTER.register("raw_emberspawn",()->new Item(new Item.Properties().food(RAW_EMBERSPAWN)));
    public static final RegistryObject<Item> COOKED_EMBERSPAWN_ITEM = REGISTER.register("cooked_emberspawn",()->new Item(new Item.Properties().food(COOKED_EMBERSPAWN)));
    public static final RegistryObject<Item> RAW_SALAMANDER_ITEM = REGISTER.register("raw_salamander",()->new Item(new Item.Properties().food(RAW_SALAMANDER)));
    public static final RegistryObject<Item> COOKED_SALAMANDER_ITEM = REGISTER.register("cooked_salamander",()->new Item(new Item.Properties().food(COOKED_SALAMANDER)));
    public static final RegistryObject<Item> WARPED_PUFFERFISH_ITEM = REGISTER.register("warped_pufferfish",()->new Item(new Item.Properties().food(WARPED_PUFFERFISH)));
    public static final RegistryObject<Item> CRIMSON_PUFFERFISH_ITEM = REGISTER.register("crimson_pufferfish",()->new Item(new Item.Properties().food(CRIMSON_PUFFERFISH)));
    public static final RegistryObject<Item> CUBELING = REGISTER.register("cubeling",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROTTEN_FISH_ITEM = REGISTER.register("rotten_fish",()->new Item(new Item.Properties().food(ROTTEN_FISH)));
    public static final RegistryObject<Item> BOTTLED_CUBELING = REGISTER.register("bottled_cubeling",()->new BottledCubeling(new Item.Properties()));

    private StrideItems() {}
}
