package de.its.lf;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnectorMySQL extends DBConnector {

    public DBConnectorMySQL(String ip, int port, String user, String password, String dbName) throws ClassNotFoundException, SQLException {
        super(ip, port, user, password, dbName);
    }

    @Override
    public void connect() throws Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new Exception("Treiber konnte nicht geladen werden");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + dbName, user, password);
        } catch (SQLException ex) {
             throw new Exception("DB-Verbindung konnte nicht aufgebaut werden");
        }
    }
}
