package com.thesilentnights.transmitability.util;

import io.papermc.paper.math.BlockPosition;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class AngleCalculator {
    public static Block calculate(Player player){
        BlockFace facing = player.getFacing();
        Vector direction = facing.getDirection();
        MessageSender.sendMessage(player,Double.toString(direction.getX()),Double.toString(direction.getY()),Double.toString(direction.getZ()));
        return null;
    }
}
