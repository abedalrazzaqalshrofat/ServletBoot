package com.selflearning.webapp.common.datasource.connectivity;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionDB {

    void closeConnection();

    Connection openConnection() throws SQLException;



}
