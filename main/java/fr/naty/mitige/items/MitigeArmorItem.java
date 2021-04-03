package fr.naty.mitige.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MitigeArmorItem extends ArmorItem {

	public MitigeArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		// TODO Auto-generated constructor stub
	}
	  @Override
		public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
			

			if (player.getItemStackFromSlot (EquipmentSlotType.CHEST) .getItem () == MitigeItems.BESKAR_CHESTPLATE_JETPACK.get() &&
		    	player.getItemStackFromSlot (EquipmentSlotType.OFFHAND) .getItem () == MitigeItems.MANDALORIAN_GAUNTLET.get())
				{
					player.abilities.allowFlying = true;
					player.abilities.setFlySpeed(0.02f);				}
			
			else {
					player.abilities.allowFlying = false;
					player.abilities.setFlySpeed(0f);
				}
	  }
}