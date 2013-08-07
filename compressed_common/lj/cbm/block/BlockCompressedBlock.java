package lj.cbm.block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lj.cbm.CompressedMod;
import lj.cbm.lib.Reference;
import lj.cbm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockCompressedBlock extends Block{
    
    Icon[] icons;

    public BlockCompressedBlock(int par1) {
        super(par1, Material.iron);
        this.setUnlocalizedName(Strings.COMPRESSED_BLOCK_UNLOC_NAME);
        this.setHardness(5F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundMetalFootstep);
        this.setCreativeTab(CompressedMod.tabsCBM);
    }
    
    @Override
    public int damageDropped (int metadata) {
        return metadata;
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
        for (int ix = 0; ix < 5; ix++) {
            subItems.add(new ItemStack(this, 1, ix));
        }
    }
    
    public void registerIcons(IconRegister iconRegister) {
        icons = new Icon[5];
        for (int i = 0; i < 5; i++) {
            icons[i] = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                    + ":" + Strings.COMPRESSED_BLOCK_ENG_NAMES[i]);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int id, int meta) {
        if (meta < 5)
            return icons[meta];
        else return icons[0];
    }

}
