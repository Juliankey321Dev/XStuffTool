package de.juliankey321.xStuffTool.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class Freeze implements CommandExecutor {
    public static ArrayList<Player> freeze = new ArrayList<>();
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        Player player = (Player) commandSender;
        Player target = Bukkit.getPlayer(strings[0]);
        if(strings.length == 1) {
            if(player.hasPermission("Freeze.use")) {
                if(target != null || strings[0].equalsIgnoreCase(target.getName())) {
                    if(!freeze.contains(target)) {
                        freeze.add(target);
                        player.sendMessage("§8[§6PREFIX] §aYou have successfully froze §e" + target.getName());
                    } else {
                        freeze.remove(target);
                        player.sendMessage("§8[§6PREFIX] §aYou have successfully unfreeze §e" + target.getName());
                    }
                }
            }
        }



        return true;
    }
}
