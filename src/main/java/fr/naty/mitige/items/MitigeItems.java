package fr.naty.mitige.items;

import fr.naty.mitige.mitige;
import fr.naty.mitige.utils.CustomArmorMaterials;
import fr.naty.mitige.utils.CustomItemTiers;
import fr.naty.mitige.utils.ModItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MitigeItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,  mitige.MODID);

//dragon
	public static final RegistryObject<Item> dragon_leather = ITEMS.register( "dragon_leather", () -> new Item(new Item.Properties().maxStackSize(16).group(ModItemGroup.Mitige)));
	public static final RegistryObject<Item> dragon_claw = ITEMS.register( "dragon_claw", () -> new SwordItem(CustomItemTiers.Dragon, 4, -2.5f, new Item.Properties().maxStackSize(1).group(ModItemGroup.Mitige)));
	public static final RegistryObject<Item> dragon_spear = ITEMS.register( "dragon_spear", () -> new SwordItem(CustomItemTiers.Dragon, 5, -2f, new Item.Properties().maxStackSize(1).group(ModItemGroup.Mitige)));
//bouffe
	public static final RegistryObject<Item> tacos_tv = ITEMS.register("tacos_tv", () -> new Item(new Item.Properties().maxStackSize(4).group(ModItemGroup.Mitige).food(new Food.Builder().hunger(10).saturation(1.0F).meat().effect(() -> new EffectInstance(Effects.SLOWNESS, 20*20, 0), 1f).effect(() -> new EffectInstance(Effects.NAUSEA, 20*10, 5), 1f).build())));;
	public static final RegistryObject<Item> nrj_choc = ITEMS.register("nrj_choc", () -> new Item(new Item.Properties().maxStackSize(32).group(ModItemGroup.Mitige).food(new Food.Builder().hunger(5).saturation(0.8F).effect(() -> new EffectInstance(Effects.JUMP_BOOST, 20*120, 0), 1f).build())));;
	public static final RegistryObject<Item> nrj_appl = ITEMS.register("nrj_appl", () -> new Item(new Item.Properties().maxStackSize(32).group(ModItemGroup.Mitige).food(new Food.Builder().hunger(5).saturation(0.8F).effect(() -> new EffectInstance(Effects.SPEED, 20*120, 0), 1f).build())));;	
	public static final RegistryObject<Item> cereal = ITEMS.register( "cereal", () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.Mitige)));
//beskar
	public static final RegistryObject<Item> beskar_scrap = ITEMS.register("beskar_scrap", () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.Mitige)));
	public static final RegistryObject<Item> BESKAR_INGOT = ITEMS.register("beskar_ingot", () -> new Item(new Item.Properties().maxStackSize(64).group(ModItemGroup.Mitige)));
	public static final RegistryObject<Item> MANDALORIAN_GAUNTLET = ITEMS.register("mandalorian_gauntlet", () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.Mandalorian_stuff)));
	public static final RegistryObject<Item> BESKAR_SPEAR = ITEMS.register( "beskar_spear", () -> new SwordItem(CustomItemTiers.Beskar, 5, -2f, new Item.Properties().maxStackSize(1).group(ModItemGroup.Mandalorian_stuff)));
	public static final RegistryObject<Item> JETPACK = ITEMS.register("jetpack", () -> new Item(new Item.Properties().maxStackSize(1).group(ModItemGroup.Mandalorian_stuff)));
//armure
    public static final RegistryObject<Item> BESKAR_HELMET = ITEMS.register("beskar_helmet", () -> new ArmorItem(CustomArmorMaterials.BESKAR_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroup.Mandalorian_stuff)));
    public static final RegistryObject<Item> BESKAR_CHESTPLATE = ITEMS.register("beskar_chestplate", () -> new ArmorItem(CustomArmorMaterials.BESKAR_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroup.Mandalorian_stuff)));
    public static final RegistryObject<Item> BESKAR_LEGGINGS = ITEMS.register("beskar_leggings", () -> new ArmorItem(CustomArmorMaterials.BESKAR_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroup.Mandalorian_stuff)));
    public static final RegistryObject<Item> BESKAR_BOOTS = ITEMS.register("beskar_boots", () -> new ArmorItem(CustomArmorMaterials.BESKAR_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroup.Mandalorian_stuff)));
    public static final RegistryObject<Item> BESKAR_CHESTPLATE_JETPACK = ITEMS.register("beskar_chestplate_jetpack", () -> new MitigeArmorItem(CustomArmorMaterials.BESKAR_ARMOR_JETPACK, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroup.Mandalorian_stuff)));
    
}