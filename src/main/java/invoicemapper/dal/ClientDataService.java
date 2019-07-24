/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Client;
import java.sql.SQLException;
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
         // todo: implement
        return null;
    }
    
    public Client Create(Client newClient) throws SQLException {
      // todo: implement
        return null;
    }
    
    public Client Update(Client clientToUpdate) throws SQLException {
      // todo: implement
        return null;
    }
     
    public void Delete(int agentId) throws SQLException {
      // todo: implement
    }
}
