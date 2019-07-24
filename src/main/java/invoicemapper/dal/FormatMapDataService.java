/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Agent;
import invoicemapper.lib.FormatMap;
import invoicemapper.lib.Sale;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class FormatMapDataService extends DataService {
    
    public FormatMapDataService() {
        super();
    }
    
   
     public ArrayList<FormatMap> GetAll() throws SQLException {
         // todo: implement
        return null;
    }
    
    public FormatMap Create(Agent newSale) throws SQLException {
      // todo: implement
        return null;
    }
    
    public FormatMap Update(Sale sqleToUpdate) throws SQLException {
      // todo: implement
        return null;
    }
     
    public void Delete(int agentId) throws SQLException {
      // todo: implement
    }
}
