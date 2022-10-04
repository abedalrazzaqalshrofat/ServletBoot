package com.selflearning.webapp;

import com.selflearning.webapp.common.datasource.connectivity.PropertiesUtility;
import java.io.IOException;

/**
 *
 * @author abed.alshorofat
 */
public class Starter {
    
    public static void main(String[] args) throws IOException {
        PropertiesUtility propertiesUtility = PropertiesUtility.getInstance();
        
        System.out.println("jdbc url is "+propertiesUtility.get("jdbc.url"));
    }
    
}
