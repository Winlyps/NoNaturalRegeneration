package winlyps.noNaturalRegeneration

import org.bukkit.plugin.java.JavaPlugin

class NoNaturalRegeneration : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("naturalRegeneration", "false")
        }
        logger.info("NoNaturalRegeneration plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoNaturalRegeneration plugin has been disabled.")
    }
}