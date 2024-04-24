package com.thesilentnights.transmitability.commands;

import com.thesilentnights.transmitability.repo.DefaultItem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.jetbrains.annotations.NotNull;

public class GetItem implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player){
            PlayerInventory inventory = ((Player) commandSender).getInventory();
            inventory.addItem(DefaultItem.defaultItem);
        }
        return false;
    }
}
