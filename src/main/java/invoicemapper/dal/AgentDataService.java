/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Agent;
import invoicemapper.lib.Sale;
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
    
    public ArrayList<Agent> GetById(int agentId) throws SQLException {
         // todo: implement
        return null;
    }
    
     public ArrayList<Agent> GetAll() throws SQLException {
         // todo: implement
        return null;
    }
    
    public Agent Create(Agent newSale) throws SQLException {
      // todo: implement
        return null;
    }
    
    public Agent Update(Sale sqleToUpdate) throws SQLException {
      // todo: implement
        return null;
    }
     
    public void Delete(int agentId) throws SQLException {
      // todo: implement
    }
}
