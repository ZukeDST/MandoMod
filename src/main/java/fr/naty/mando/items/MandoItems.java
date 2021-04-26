package fr.naty.mando.items;

import fr.naty.mando.mando;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MandoItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,  mando.MODID);

	//beskar (scrap a remettre quand j'aurais un four)
	//public static final RegistryObject<Item> beskar_scrap = ITEMS.register("beskar_scrap", () -> new Item(new Item.Properties().stacksTo(64).tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
	public static final RegistryObject<Item> BESKAR_INGOT = ITEMS.register("beskar_ingot", () -> new Item(new Item.Properties().stacksTo(64).tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
	
	//items
	public static final RegistryObject<Item> MANDALORIAN_GAUNTLET = ITEMS.register("mandalorian_gauntlet", () -> new Item(new Item.Properties().stacksTo(1).tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
	public static final RegistryObject<Item> BESKAR_SPEAR = ITEMS.register( "beskar_spear", () -> new SwordItem(fr.naty.mando.utils.CustomItemTiers.Beskar, 5, -2f, new Item.Properties().stacksTo(1).tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
	public static final RegistryObject<Item> JETPACK = ITEMS.register("jetpack", () -> new Item(new Item.Properties().stacksTo(1).tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));

	//armure
    public static final RegistryObject<Item> BESKAR_HELMET = ITEMS.register("beskar_helmet", () -> new ArmorItem(fr.naty.mando.utils.CustomArmorMaterials.BESKAR_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
    public static final RegistryObject<Item> BESKAR_CHESTPLATE = ITEMS.register("beskar_chestplate", () -> new ArmorItem(fr.naty.mando.utils.CustomArmorMaterials.BESKAR_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
    public static final RegistryObject<Item> BESKAR_LEGGINGS = ITEMS.register("beskar_leggings", () -> new ArmorItem(fr.naty.mando.utils.CustomArmorMaterials.BESKAR_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
    public static final RegistryObject<Item> BESKAR_BOOTS = ITEMS.register("beskar_boots", () -> new ArmorItem(fr.naty.mando.utils.CustomArmorMaterials.BESKAR_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
    public static final RegistryObject<Item> BESKAR_CHESTPLATE_JETPACK = ITEMS.register("beskar_chestplate_jetpack", () -> new MandoArmorItem(fr.naty.mando.utils.CustomArmorMaterials.BESKAR_ARMOR_JETPACK, EquipmentSlotType.CHEST, new Item.Properties().tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
    //public static final RegistryObject<Item> BESKAR_CHESTPLATE_JETPACK = ITEMS.register("beskar_chestplate_jetpack", () -> new MandoElytraItem(new Item.Properties().tab(fr.naty.mando.utils.ModItemGroup.Mandalorian_stuff)));
    
}
