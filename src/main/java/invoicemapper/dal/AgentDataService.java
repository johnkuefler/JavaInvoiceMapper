/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Agent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class AgentDataService extends DataService {

    public AgentDataService() {
        super();
    }

    public ArrayList<Agent> GetByClientName(String clientName) throws SQLException {
        ArrayList<Agent> output = new ArrayList<Agent>();

        PreparedStatement statement = super.getConnection().prepareStatement("SELECT Id, ClientName, FirstName, LastName  FROM IM_Agent WHERE ClientName = ?");
        statement.setString(1, clientName);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Agent agent = new Agent();

            agent.setId(resultSet.getString(0));
            agent.setClientName(resultSet.getString(1));
            agent.setFirstName(resultSet.getString(2));
            agent.setLastName(resultSet.getString(3));

            output.add(agent);
        }

        return output;
    }

    public Agent GetById(String agentId) throws SQLException {

        PreparedStatement statement = super.getConnection().prepareStatement("SELECT Id, ClientName, FirstName, LastName  FROM IM_Agent WHERE Id = ?");
        statement.setString(1, agentId);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            Agent agent = new Agent();

            agent.setId(resultSet.getString(0));
            agent.setClientName(resultSet.getString(1));
            agent.setFirstName(resultSet.getString(2));
            agent.setLastName(resultSet.getString(3));

            return agent;
        }

        return null;
    }

    public void Create(Agent newAgent) throws SQLException {
        PreparedStatement statement = super.getConnection().prepareStatement("INSERT INTO IM_Agent(Id, ClientName, FirstName, LastName) " 
        + "VALUES (?,?,?,?)");
        
        statement.setString(1, newAgent.getId());
        statement.setString(2, newAgent.getClientName());
        statement.setString(3, newAgent.getFirstName());
        statement.setString(4, newAgent.getLastName());
       
        statement.executeUpdate();
    }

    public void Update(Agent agentToUpdate) throws SQLException {
          PreparedStatement statement = super.getConnection().prepareStatement("UPDATE IM_Agent " 
        + "SET FirstName = ?, LastName = ? WHERE Id = ?");
        
        statement.setString(1, agentToUpdate.getFirstName());
        statement.setString(2, agentToUpdate.getLastName());
        statement.setString(3, agentToUpdate.getId());
       
        statement.executeUpdate();
    }

    public void Delete(String agentId) throws SQLException {
           PreparedStatement statement = super.getConnection().prepareStatement("DELETE From IM_Agent WHERE Id = ?");
        
        statement.setString(1, agentId);
        
        statement.executeUpdate();
    }
}
