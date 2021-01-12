package me.myfirstplugin.welcome;



import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	
	public Inventory inv;
	
	@Override
	public void onEnable(){
	     getCommand("market").setExecutor(this);
	}
	
	@Override
	public void onDisable() {
		
	}	
	
	public boolean onCommand(BlockCommandSender sender, Command cmd, String label, String[] args) {
	
		if (label.equalsIgnoreCase("market")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("You cannot do this!");
				return true;
			}
			Player player = (Player) sender;
			// open the GUI
		}
	return false;
	}
	
	public void createInv() {
		
		inv = Bukkit.createInventory(null, 9, ChatColor.GREEN + "The Bandai Boys Market");
		
		ItemStack item = new ItemStack(Material.EMERALD);
		ItemMeta meta = item.getItemMeta();
		
		//Put up a Market Item
		meta.setDisplayName("Put up a Market Item");
		List<String> lore = new ArrayList<String>();
		lore.add("Click to put an item up on the market!");
		meta.setLore(lore);
		item.setItemMeta(meta);
		inv.setItem(4, item);
	}
	
	
	
	
	
	
	
	

	
	
	
} 
