package com.selflearning.webapp.common.datasource.connectivity;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionJDBC implements ConnectionDB {

    private Connection connection = null;
    private final PropertiesUtility propertiesUtility;
    
    public ConnectionJDBC(){
        propertiesUtility = PropertiesUtility.getInstance();
    }

    @Override
    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("cannot close connection cause "+e.getCause());
        }
    }

    @Override
    public Connection openConnection()  {
        try {
            connection =  DriverManager.getConnection(
                    String.valueOf(propertiesUtility.get("jdbc.url")),
                    String.valueOf(propertiesUtility.get("jdbc.username")),
                    String.valueOf(propertiesUtility.get("jdbc.password"))
                    );
        } catch (IOException ioException) {
            System.out.println("cannot get values of connection cause "+ioException.getCause());
        } catch (SQLException sqlException){
            System.out.println("cannot open connection cause "+sqlException.getCause());
        }
        return connection;
    }
    
    
    

}
