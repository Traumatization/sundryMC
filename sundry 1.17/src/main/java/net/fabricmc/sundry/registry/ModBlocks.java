package net.fabricmc.sundry.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks extends Block {

    public ModBlocks() {
        super(FabricBlockSettings.of(Material.POWDER_SNOW).breakByHand(true).breakByTool(FabricToolTags.SHOVELS).sounds(BlockSoundGroup.SAND).strength(0.5f, 0.2f));
    }

}
