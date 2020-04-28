package config;

import java.util.Properties;

import config.BrowserSetup.BrowserType;

public class ConfigReader {
	
	public static String URL;
	public static BrowserType browser;
	
	public static void readConfigData() throws Exception {
		ConfigReader conf = new ConfigReader();
		conf.readConfigFile();
	}
	
	public void readConfigFile() throws Exception {
		Properties prop = new Properties();
		prop.load(getClass().getResourceAsStream("globalConfig.properties"));
		URL=prop.getProperty("url");
		browser= BrowserType.valueOf(prop.getProperty("browser"));
	}

}
