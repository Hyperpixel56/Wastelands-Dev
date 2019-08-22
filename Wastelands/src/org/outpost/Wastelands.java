package org.outpost;
import org.bukkit.plugin.java.JavaPlugin;
/**
 * @author computerneek
 */
public class Wastelands extends JavaPlugin{
    public static Wastelands instance;
    @Override
    public void onLoad(){
        instance = this;//So we only  Wastelands.instance  instead of any fancy getPlugin() calls to get this instance from elsewhere
    }
}
