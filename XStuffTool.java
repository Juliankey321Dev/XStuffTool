package de.juliankey321.xStuffTool;

import de.juliankey321.xStuffTool.commands.Fly;
import de.juliankey321.xStuffTool.commands.Nick;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class XStuffTool extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes(ChatColor.COLOR_CHAR, "§8[§6PREFIX§8] §aPlugin is now enabled!"));
        getCommand("fly").setExecutor(new Fly());
        getCommand("nick").setExecutor(new Nick());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes(ChatColor.COLOR_CHAR, "§8[§6PREFIX§8] §cPlugin is now disabled!"));

    }
}
