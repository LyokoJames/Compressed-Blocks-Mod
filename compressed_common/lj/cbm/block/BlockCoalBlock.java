package lj.cbm.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lj.cbm.CompressedMod;
import lj.cbm.lib.Reference;
import lj.cbm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockCoalBlock extends Block {

    public BlockCoalBlock(int par1) {
        super(par1, Material.iron);
        this.setUnlocalizedName(Strings.COAL_BLOCK_UNLOC_NAME);
        this.setHardness(3F);
        this.setResistance(10.0F);
        this.setStepSound(Block.soundMetalFootstep);
        this.setCreativeTab(CompressedMod.tabsCBM);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase()
                + ":"
                + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
