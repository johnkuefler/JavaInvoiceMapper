/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Client;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author johnk
 */
public abstract class DataService {

    private String hostName;
    private String dbName;
    private String user; 
    private String password;
    
    protected Connection getConnection() throws SQLException {
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        
        return DriverManager.getConnection(url);
    };

    public DataService() {
        // todo: better error handling if config not present
        
        Properties properties = new Properties();
        InputStream is = null;
        try {
            is = new FileInputStream("src/main/resources/app.properties");
        } catch (FileNotFoundException ex) {
            System.out.println("Could not load database config");
            return;
        }
        try {
            properties.load(is);
        } catch (IOException ex) {
            System.out.println("Could not load database config input stream");
            return;
        }

        this.hostName = properties.getProperty("db.host");
        this.dbName = properties.getProperty("db.name");
        this.user = properties.getProperty("db.user");
        this.password = properties.getProperty("db.password");
        
    }
}
