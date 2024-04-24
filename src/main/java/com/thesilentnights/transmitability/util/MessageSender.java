package com.thesilentnights.transmitability.util;

import org.bukkit.entity.Player;

public class MessageSender {
    public static void sendMessage(Player player, String ...args){
        for (String str : args){
            player.sendMessage(str);
        }
    }
}
