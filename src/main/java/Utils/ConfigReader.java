package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// To read the file from config.properties file this code will be helpful

public class ConfigReader {
    private static Properties prop;

    public static String getProperty(String key) {
        if (prop == null) {
            prop = new Properties();
            try (FileInputStream fis = new FileInputStream("src/main/resources/Config.properties")) {
                prop.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop.getProperty(key);
    }
}
