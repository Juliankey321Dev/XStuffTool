package de.juliankey321.xStuffTool.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Nick implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        Player player = (Player) commandSender;

        ArrayList<String> nickname = new ArrayList<>();

        if(player.hasPermission("Nick.use")) {
           if(strings.length == 1) {
               if(!nickname.contains(player.getName())) {
                player.setDisplayName(strings[0]);
                player.setCustomName(strings[0]);
                player.setPlayerListName(strings[0]);
                   player.sendMessage("§8[§6PREFIX§8] §aYou're now nicked as §e" + strings[0]);
               } else {
                   player.setDisplayName(player.getName());
                   player.setCustomName(player.getName());
                   player.setPlayerListName(player.getName());
                   player.sendMessage("§8[§6PREFIX§8] §cYou're not nicked anymore!");
               }
           }
        }


        return true;
    }
}
