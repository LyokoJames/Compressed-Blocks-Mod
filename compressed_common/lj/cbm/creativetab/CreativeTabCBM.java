package lj.cbm.creativetab;

import lj.cbm.lib.BlockIds;
import lj.cbm.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabCBM extends CreativeTabs {

    public CreativeTabCBM(int par1, String par2Str) {
        super(par1, par2Str);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {

        return BlockIds.COAL_BLOCK;
    }

    @Override
    public String getTranslatedTabLabel() {
        return Reference.MOD_NAME;
    }


}
