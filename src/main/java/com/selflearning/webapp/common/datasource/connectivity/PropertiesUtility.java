package com.selflearning.webapp.common.datasource.connectivity;

import com.selflearning.webapp.common.ConstantValues;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesUtility {

    private static final Properties properties = new Properties();
    private static PropertiesUtility propertiesUtility = null;

    private PropertiesUtility(){}

    public void load() throws IOException {
        try(InputStream resourceStream = Files.newInputStream(Paths.get(ConstantValues.DEFAULT_RESOURCES_PATH + "/jdbc.properties"))) {
            properties.load(resourceStream);
        }
    }
    public Object get(String key) throws IOException{
        if (properties.get(key) == null){
            getInstance().load();
        }
        return properties.get(key);
    }

    public static PropertiesUtility getInstance(){
        if (propertiesUtility == null)
            propertiesUtility = new PropertiesUtility();
        return propertiesUtility;
    }
}
