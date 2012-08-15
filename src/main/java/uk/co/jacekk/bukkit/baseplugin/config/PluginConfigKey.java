package uk.co.jacekk.bukkit.baseplugin.config;

/**
 * Represents a config value for a plugin.
 * 
 * @author Jacek Kuzemczak
 */
public interface PluginConfigKey {
	
	/**
	 * Gets the key for this config entry.
	 * 
	 * @return	The key.
	 */
	public String getKey();
	
	/**
	 * Gets the default value for this config entry.
	 * 
	 * @return The value.
	 */
	public Object getDefault();
	
}
