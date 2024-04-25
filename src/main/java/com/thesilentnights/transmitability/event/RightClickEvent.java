package com.thesilentnights.transmitability.event;

import com.thesilentnights.transmitability.repo.DefaultItem;
import com.thesilentnights.transmitability.util.AngleCalculator;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class RightClickEvent implements Listener {
    @EventHandler
    public void PlayerOnClick(PlayerInteractEvent event){
        AngleCalculator.calculate(event.getPlayer());

    }
}
