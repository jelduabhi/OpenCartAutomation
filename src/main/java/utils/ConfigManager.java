package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager {

    public static String getProperty(String key){
        Properties properties=new Properties();
        try{
            FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\ConfigProperty.properties");
            properties.load(fis);
            return properties.getProperty(key);
        }catch (Exception e){
            System.out.println("Unable to get the property value "+e.getMessage());
            return null;
        }
    }
}
