package de.blutmondgilde.bloodguild;

import de.blutmondgilde.bloodguild.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BloodGuild.MODID, version = BloodGuild.VERSION, name = BloodGuild.NAME)
public class BloodGuild {
	public static final String MODID = "bloodguild";
	public static final String VERSION = "0.0.1a";
	public static final String NAME = "Blood Guild";

	//Instance register
	@Instance(MODID)
	public static BloodGuild instance = new BloodGuild();
	
	//Proxy register
	@SidedProxy(modId = MODID, serverSide = "de.blutmondgilde.bloodguild.proxy.CommonProxy", clientSide = "de.blutmondgilde.bloodguild.proxy.ClientProxy")
	public static CommonProxy proxy = new CommonProxy();
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		proxy.registerModels();
	}
}
