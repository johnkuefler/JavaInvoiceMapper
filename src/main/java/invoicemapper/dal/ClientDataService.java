/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Client;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class ClientDataService extends DataService {
    
    public ClientDataService() {
        super();
    }
    
     public ArrayList<Client> GetAll() throws SQLException {
        ArrayList<Client> output = new ArrayList<Client>();
         
        String selectSql = "SELECT * FROM IM_Client";
        Statement statement = super.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(selectSql);
        
        while (resultSet.next())
        {
            Client client = new Client();
            client.setName(resultSet.getString(2));
            output.add(client);
        }

        return output;
    }
     
    public Client GetByName(String name) throws SQLException {
        String selectSql = "SELECT * FROM IM_Client WHERE Name = '"+name+"'";
        Statement statement = super.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(selectSql);
        
        while (resultSet.next())
        {
            Client client = new Client();
            client.setName(resultSet.getString(2));
            return client;
        }        
        return null;
    }
    
    public Client Create(Client newClient) throws SQLException {
        String insertSql = "INSERT INTO IM_Client (Name) VALUES ('"+newClient.getName()+"')";
        Statement statement = super.getConnection().createStatement();
        statement.executeUpdate(insertSql);
        
        return GetByName(newClient.getName());
    }
    
    public Client Update(Client clientToUpdate) throws SQLException {
      // todo: implement
        return null;
    }
     
    public void Delete(String clientName) throws SQLException {
       Statement deleteStatement = super.getConnection().createStatement();

        String sql = "DELETE FROM IM_Client "
                + " WHERE name = '" + clientName+"'";

        deleteStatement.executeUpdate(sql);
    }
}
