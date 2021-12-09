package com.example.examplemod.core.init;

import com.example.examplemod.TutorialMod;
import com.example.examplemod.common.material.CustomArmorMaterial;
import com.example.examplemod.common.material.CustomToolMaterial;
import com.example.examplemod.core.itemgroup.TutorialModItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//this is the init class for items added to the game. code is repeitive for each item it
// registeres the item its name and its item group along with any stats the item may need such as damage

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			TutorialMod.MOD_ID);

	public static final RegistryObject<Item> BESKAR_INGOT = ITEMS.register("beskar_ingot",
			() -> new Item(new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));

	public static final RegistryObject<Item> BESKAR_SWORD = ITEMS.register("beskar_sword",
			() -> new SwordItem(CustomToolMaterial.BESKAR_TOOL, 5, -1f,
					new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));

	public static final RegistryObject<Item> BESKAR_AXE = ITEMS.register("beskar_axe",
			() -> new AxeItem(CustomToolMaterial.BESKAR_TOOL, 5, -1f,
					new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));

	public static final RegistryObject<Item> BESKAR_PICKAXE = ITEMS.register("beskar_pickaxe",
			() -> new PickaxeItem(CustomToolMaterial.BESKAR_TOOL, 5, -1f,
					new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));

	public static final RegistryObject<Item> BESKAR_SHOVEL = ITEMS.register("beskar_shovel",
			() -> new ShovelItem(CustomToolMaterial.BESKAR_TOOL, 5, -1f,
					new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));

	public static final RegistryObject<Item> BESKAR_HOE = ITEMS.register("beskar_hoe",
			() -> new HoeItem(CustomToolMaterial.BESKAR_TOOL, 5, -1f,
					new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));

	public static final RegistryObject<Item> BESKAR_HELMET = ITEMS.register("beskar_helmet",
			() -> new ArmorItem(CustomArmorMaterial.BESKAR_ARMOR, EquipmentSlotType.HEAD,
					new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));

	public static final RegistryObject<Item> BESKAR_CHESTPLATE = ITEMS.register("beskar_chestplate",
			() -> new ArmorItem(CustomArmorMaterial.BESKAR_ARMOR, EquipmentSlotType.CHEST,
					new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));

	public static final RegistryObject<Item> BESKAR_LEGGINGS = ITEMS.register("beskar_leggings",
			() -> new ArmorItem(CustomArmorMaterial.BESKAR_ARMOR, EquipmentSlotType.LEGS,
					new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));

	public static final RegistryObject<Item> BESKAR_BOOTS = ITEMS.register("beskar_boots",
			() -> new ArmorItem(CustomArmorMaterial.BESKAR_ARMOR, EquipmentSlotType.FEET,
					new Item.Properties().group(TutorialModItemGroup.TUTORIAL_MOD)));
}
