package Java_Concepts;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	
	private static Properties config;
	
	
	static {
		try {
			File file = new File("./src/Java_Concepts/configuration.properties");
			FileInputStream input = new FileInputStream(file);
			config = new Properties();
			config.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String getProperty(String key) {
		return config.getProperty(key);
	}
}
