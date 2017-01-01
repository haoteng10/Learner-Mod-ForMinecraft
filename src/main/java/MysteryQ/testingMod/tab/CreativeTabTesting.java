package MysteryQ.testingMod.tab;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by ei on 2016/12/31.
 */
public class CreativeTabTesting extends CreativeTabs {

    public CreativeTabTesting(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        ItemStack diamond = new ItemStack(Items.DIAMOND,1);
        return diamond;
    }
}
