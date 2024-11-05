package de.juliankey321.xStuffTool.Listeners;

import de.juliankey321.xStuffTool.commands.Freeze;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage(null);
        Player player = e.getPlayer();
        player.sendMessage("§8[§6PREFIX§8] §aWelcome");
    }

    //Freeze Command
    @EventHandler
    public void onMove(PlayerMoveEvent e) {
    if(Freeze.freeze.contains(e.getPlayer())) {
        if(e.getFrom().blockX() != e.getTo().blockX()) {
            e.setCancelled(true);
            e.getPlayer().sendMessage("§8[§6PREFIX§8] §cYou got freezed!");
        }
    }
    }

}
