package fr.naty.mando.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MandoArmorItem extends ArmorItem {

	public MandoArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		// TODO Auto-generated constructor stub
	}
	  @Override
		public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
			

			if (player.getItemBySlot (EquipmentSlotType.CHEST) .getItem () == MandoItems.BESKAR_CHESTPLATE_JETPACK.get() &&
		    	player.getItemBySlot (EquipmentSlotType.OFFHAND) .getItem () == MandoItems.MANDALORIAN_GAUNTLET.get())
				{
					player.abilities.mayfly = true;
					player.abilities.setFlyingSpeed(0.02f);				}
			
			else {
					player.abilities.mayfly = false;
					player.abilities.setFlyingSpeed(0f);
				}
	  }
}