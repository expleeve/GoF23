package gof.creation.factory.simpleFactory;

import gof.creation.singleton.ConfigManager;

public class TestConfigManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigManager configManager = ConfigManager.getInstance();
		configManager.getConfigItem("a", 0);
	}

}
