package com.ar13mis.arcaniacraft.item.tools.arcanetools;

import com.ar13mis.arcaniacraft.creativetab.CreativeTabArcaniaCraft;
import com.ar13mis.arcaniacraft.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemArcaneAxe extends ItemAxe
{
    public ItemArcaneAxe(ToolMaterial material, String name)
    {
        super(material);
        setUnlocalizedName(Reference.MOD_ID + ":" + name);
        setTextureName(Reference.MOD_ID + ":" + name);
        this.setCreativeTab(CreativeTabArcaniaCraft.ARC_TAB);
    }
}
