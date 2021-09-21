package de.its.lf;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DBConnector {

    protected String ip;
    protected int port;
    protected String user;
    protected String password;
    protected String dbName;

    protected Connection con;
    protected ResultSet res;
    protected Statement stat;

    public DBConnector(String ip, int port, String user, String password, String dbName) {
        this.ip = ip;
        this.port = port;
        this.user = user;
        this.password = password;
        this.dbName = dbName;
    }

    public abstract void connect() throws SakilaException;

    public void disconnect() throws SakilaException {
        try {
            res.close();
            stat.close();
            con.close();
        } catch (SQLException se) {
            throw new SakilaException("Das schließen hat nicht funktioniert");
        }
    }

    public ResultSet query(String sql) throws SakilaException {
        if (sql != null) {
            try {
                stat = con.createStatement();
                stat.executeQuery(sql);
                res = stat.getResultSet();
                
                return res;
            } catch (SQLException ex) {
                throw new SakilaException("Queryausführung hat nicht funktioniert");
            }
        } else {
            return null;
        }
    }

    public void querydml(String sql) throws SakilaException {
        if (sql != null) {
            try {
                stat = con.createStatement();
                stat.executeUpdate(sql);
            } catch (SQLException ex) {
                throw new SakilaException("Updatequery hat nicht funktioniert");
            }
            
        } else {
            System.out.println("sql Statement is null");
        }
    }
}
