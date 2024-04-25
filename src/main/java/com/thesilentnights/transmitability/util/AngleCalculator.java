package com.thesilentnights.transmitability.util;

import com.thesilentnights.transmitability.TransmitAbility;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class AngleCalculator {
    public static Block calculate(Player player){
        Vector vector = player.getLocation().getDirection();
        Location location = player.getLocation();
        int distance = TransmitAbility.getDefaultConfig().getInt("distance");
        location.add(vector.getX()*distance,vector.getY()*distance,vector.getZ()*distance);
        player.teleport(location);
        player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT,1,1);

        //MessageSender.sendMessage(player,Double.toString(vector.getX()),Double.toString(vector.getY()),Double.toString(vector.getZ()));
        return null;
    }
}
