package com.example.examplemod.core.itemgroup;

import com.example.examplemod.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
//class allows for grouping of created item which in this case is the beskar ignot when smelted down can be put in stacks
public class TutorialModItemGroup extends ItemGroup {

	public static final TutorialModItemGroup TUTORIAL_MOD = new TutorialModItemGroup(ItemGroup.GROUPS.length,
			"tutorial_mod");

	public TutorialModItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {

		return new ItemStack(ItemInit.BESKAR_INGOT.get());
	}

}
