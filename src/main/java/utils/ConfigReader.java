package utils;

import java.util.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ConfigReader {
	static Properties props;
	static {
		props = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream(new File("src/main/resources/Properties/props.properties"));
			props.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getValue(String key) {
		return props.getProperty(key);
	}

}
