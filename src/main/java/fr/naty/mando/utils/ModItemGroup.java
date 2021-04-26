package fr.naty.mando.utils;

import fr.naty.mando.items.MandoItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {


	public static final ItemGroup Mandalorian_stuff = new ItemGroup("mandaloriantab")
	{
		@Override
		public ItemStack getIconItem () {
			return new ItemStack(MandoItems.JETPACK.get());
		}

		@Override
		public ItemStack makeIcon() {
			// TODO Auto-generated method stub
			return null;
		}
	};
}
