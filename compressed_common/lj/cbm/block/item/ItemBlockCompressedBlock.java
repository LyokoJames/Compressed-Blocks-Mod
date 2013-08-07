package lj.cbm.block.item;

import lj.cbm.lib.Reference;
import lj.cbm.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockCompressedBlock extends ItemBlock {
    
    Icon[] icons;

    public ItemBlockCompressedBlock(int par1) {
        super(par1);
        this.setHasSubtypes(true);
        this.setUnlocalizedName(Strings.COMPRESSED_BLOCK_UNLOC_NAME);
    }
    
    @Override
    public int getMetadata (int damageValue) {
        return damageValue;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return Strings.COMPRESSED_BLOCK_ENG_NAMES[itemstack.getItemDamage()];
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[5];
        for (int i = 0; i < 5; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + Strings.COMPRESSED_BLOCK_ENG_NAMES[i]);
        }
    }
    

}
