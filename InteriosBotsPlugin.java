package com.interio.bots;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class InteriosBotsPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("Interios Bots enabled. NPC integration and PvP AI are the next development stages.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!command.getName().equalsIgnoreCase("interiobot")) return false;
        if (!sender.hasPermission("interiobots.admin")) {
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command.");
            return true;
        }
        if (args.length == 0 || args[0].equalsIgnoreCase("help")) {
            sender.sendMessage(ChatColor.GOLD + "Interios Bots commands:");
            sender.sendMessage(ChatColor.YELLOW + "/interiobot help" + ChatColor.GRAY + " - Show commands");
            sender.sendMessage(ChatColor.YELLOW + "/interiobot status" + ChatColor.GRAY + " - Show plugin integration status");
            sender.sendMessage(ChatColor.YELLOW + "/interiobot mass_spawn" + ChatColor.GRAY + " - Planned: spawn 10 player NPCs");
            sender.sendMessage(ChatColor.YELLOW + "/interiobot spawn <name>" + ChatColor.GRAY + " - Planned: spawn a player NPC");
            sender.sendMessage(ChatColor.YELLOW + "/interiobot remove <name>" + ChatColor.GRAY + " - Planned: remove a bot");
            return true;
        }
        if (args[0].equalsIgnoreCase("status")) {
            boolean fancy = getServer().getPluginManager().getPlugin("FancyNpcs") != null;
            sender.sendMessage(ChatColor.GOLD + "Interios Bots status:");
            sender.sendMessage(ChatColor.GRAY + "FancyNpcs detected: " + (fancy ? ChatColor.GREEN + "yes" : ChatColor.RED + "no"));
            sender.sendMessage(ChatColor.GRAY + "NPC spawning / combat AI: " + ChatColor.YELLOW + "not implemented in this starter build");
            return true;
        }
        sender.sendMessage(ChatColor.RED + "That subcommand is not implemented yet. Use /interiobot help.");
        return true;
    }
}
