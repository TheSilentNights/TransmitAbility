package com.thesilentnights.transmitability;

import com.thesilentnights.transmitability.repo.DefaultItem;
import org.bukkit.configuration.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

public final class TransmitAbility extends JavaPlugin {
    private static TransmitAbility instance;

    private static Configuration defaultConfig;

    @Override
    public void onEnable() {
        instance = this;

        //初始化config
        if (!getDataFolder().exists()){
            saveDefaultConfig();
        }
        defaultConfig = getConfig();

        //初始化物品
        DefaultItem.init();


    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public static TransmitAbility getInstance() {
        return instance;
    }

    public static Configuration getDefaultConfig() {
        return defaultConfig;
    }
}
