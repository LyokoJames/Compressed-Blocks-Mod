package lj.cbm.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import lj.cbm.block.item.ItemBlockCompressedBlock;
import lj.cbm.lib.BlockIds;
import lj.cbm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ModBlocks {
    
    public static Block compressedBlock;
    public static Block coalBlock;
    public static Block compressedGold;
    
    public static void init() {
        compressedBlock = new BlockCompressedBlock(BlockIds.COMPRESSED_BLOCK);
        coalBlock = new BlockCoalBlock(BlockIds.COAL_BLOCK);
        compressedGold = new BlockCompressedGold(BlockIds.COMPRESSED_GOLD);
        
        GameRegistry.registerBlock(compressedBlock,
                ItemBlockCompressedBlock.class, Strings.COMPRESSED_BLOCK_UNLOC_NAME);
        GameRegistry.registerBlock(coalBlock, Strings.COAL_BLOCK_UNLOC_NAME);
        GameRegistry.registerBlock(compressedGold, Strings.COMPRESSED_GOLD_UNLOC_NAME);
        
        for (int i = 0; i < 5; i++) {
            LanguageRegistry.addName(new ItemStack(compressedBlock, 1, i),
                    Strings.COMPRESSED_BLOCK_ENG_NAMES[i]);
        }
        
        LanguageRegistry.addName(coalBlock, Strings.COAL_BLOCK_ENG_NAME);
        LanguageRegistry.addName(compressedGold, Strings.COMPRESSED_GOLD_ENG_NAME);
    }
}
