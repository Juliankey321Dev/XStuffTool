package de.juliankey321.xStuffTool.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        Player player = (Player) commandSender;
        if(player.hasPermission("Fly.use")) {
            if(player.getAllowFlight()) {
                player.setAllowFlight(true);
                player.setFlying(true);
                player.sendMessage("§8[§6PREFIX§8] §aYou can fly now!");
            }else {
                player.setFlying(false);
                player.sendMessage("§8[§6PREFIX§8] §cYou can't fly now!");
            }
        }


        return true;
    }
}
