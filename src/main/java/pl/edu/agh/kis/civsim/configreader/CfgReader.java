package pl.edu.agh.kis.civsim.configreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class CfgReader {
    private static Properties properties = new Properties();

    static {
        InputStream is;
        try {
            File f = new File("simulation.properties");
            is = new FileInputStream(f);
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getStringProperty(String key) {
        return properties.getProperty(key);
    }

    public static int getIntProperty(String key) {
        int parsedInt;
        try {
            parsedInt = Integer.parseInt(properties.getProperty(key));
        } catch (Exception e) {
            parsedInt = 0;
        }
        return parsedInt;
    }
}
