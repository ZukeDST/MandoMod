package fr.naty.mitige.events;

import fr.naty.mitige.items.MitigeItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MitigeEvents {
	
	public void init() {
	}

	@SubscribeEvent
	public void onLivingFall(LivingFallEvent event) {
		if(event.getEntityLiving().getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == MitigeItems.BESKAR_CHESTPLATE_JETPACK.get()) event.setDamageMultiplier(0.0F);
		else event.setDamageMultiplier(1.0F);
	}
}
