package de.blutmondgilde.bloodguild;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BloodGuild.MODID, version = BloodGuild.VERSION, name = BloodGuild.NAME)
public class BloodGuild {
	public static final String MODID = "BloodGuild";
	public static final String VERSION = "0.0.1a";
	public static final String NAME = "Blood Guild";

	
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
	}
}
