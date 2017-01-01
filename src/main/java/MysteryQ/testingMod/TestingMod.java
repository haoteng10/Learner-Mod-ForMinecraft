package MysteryQ.testingMod;

import MysteryQ.testingMod.Proxy.CommonProxy;
import MysteryQ.testingMod.tab.CreativeTabTesting;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TestingMod.MODID, version = TestingMod.VERSION, name = TestingMod.NAME)
public class TestingMod
{
    public static final String MODID = "testingmod";
    public static final String VERSION = "1.0";
    public static  final String NAME = "Testing Mod";

    @SidedProxy(clientSide = "MysteryQ.testingMod.Proxy.ClientProxy", serverSide = "MysteryQ.testingMod.Proxy.CommonProxy")
    public static CommonProxy proxy;


    @Mod.Instance
    public static TestingMod instance;

    public static CreativeTabTesting tabTesting;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabTesting = new CreativeTabTesting(CreativeTabs.getNextID(),"tab_testing");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }

}
