package com.example.examplemod.core.init;

import com.example.examplemod.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// init class for blocks created(just beskar_ore provides block name and properties)
public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			TutorialMod.MOD_ID);

	public static final RegistryObject<Block> BESKAR_ORE = BLOCKS.register("beskar_ore",
					() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));
}
