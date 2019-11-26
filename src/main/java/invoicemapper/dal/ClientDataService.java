/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Client;
import java.sql.PreparedStatement;
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
         
        PreparedStatement statement = super.getConnection().prepareStatement("SELECT * FROM IM_Client");
        ResultSet resultSet = statement.executeQuery();
        
        while (resultSet.next())
        {
            Client client = new Client();
            client.setName(resultSet.getString(1));
            output.add(client);
        }

        return output;
    }
     
    public Client GetByName(String name) throws SQLException {
        
        PreparedStatement statement = super.getConnection().prepareStatement("SELECT * FROM IM_Client WHERE Name = ?");
        statement.setString(1, name);
        ResultSet resultSet = statement.executeQuery();
        
        while (resultSet.next())
        {
            Client client = new Client();
            client.setName(resultSet.getString(2));
            return client;
        }        
        return null;
    }
    
    public Client Create(Client newClient) throws SQLException {
       
        PreparedStatement statement = super.getConnection().prepareStatement("INSERT INTO IM_Client (Name) VALUES (?)");
        statement.setString(1, newClient.getName());
        statement.executeUpdate();
        
        return GetByName(newClient.getName());
    }
    
    public Client Update(Client clientToUpdate) throws SQLException {
      // todo: implement
        return null;
    }
     
    public void Delete(String clientName) throws SQLException {
        PreparedStatement statement = super.getConnection().prepareStatement("DELETE FROM IM_FormatMap WHERE ClientName = ?");
        statement.setString(1, clientName);
        statement.executeUpdate();
        
        PreparedStatement statement2 = super.getConnection().prepareStatement("DELETE FROM IM_Client WHERE name = ?");
        statement2.setString(1, clientName);
        statement2.executeUpdate();
    }
}
