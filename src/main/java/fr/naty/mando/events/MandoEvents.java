package fr.naty.mando.events;

import fr.naty.mando.items.MandoItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MandoEvents {

	public void init() {
	}

	@SubscribeEvent
	public void onLivingFall(LivingFallEvent event) {
		if(event.getEntityLiving().getItemBySlot(EquipmentSlotType.CHEST).getItem() == MandoItems.BESKAR_CHESTPLATE_JETPACK.get()) event.setDamageMultiplier(0.0F);
		else event.setDamageMultiplier(1.0F);
	}
}

