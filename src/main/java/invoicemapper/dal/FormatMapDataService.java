/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicemapper.dal;

import invoicemapper.lib.Agent;
import invoicemapper.lib.Client;
import invoicemapper.lib.FormatMap;
import invoicemapper.lib.Sale;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public FormatMap GetByClientName(String clientName) throws SQLException {

        PreparedStatement statement = super.getConnection().prepareStatement("SELECT AgentIdColumn, DateColumn, CustomerNameColumn, CustomerAddressColumn, CustomerCityColumn, CustomerStateColumn, CustomerZipColumn, StatusColumn, StatusReasonColumn, PayableColumn, ChargebackColumn, UsageColumn, UtilityAccountNumberColumn, VerificationNumberColumn, Flex1Column, Flex2Column, Flex3Column, Flex4Column, Flex5Column, AmountColumn, CommissionRate FROM IM_FormatMap WHERE ClientName = ?");
        statement.setString(1, clientName);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            FormatMap map = new FormatMap();
            map.setAgentIdColumn(resultSet.getInt(1));
            map.setDateColumn(resultSet.getInt(2));
            map.setCustomerNameColumn(resultSet.getInt(3));
            map.setCustomerAddressColumn(resultSet.getInt(4));
            map.setCustomerCityColumn(resultSet.getInt(5));
            map.setCustomerStateColumn(resultSet.getInt(6));
            map.setCustomerZipColumn(resultSet.getInt(7));
            map.setStatusColumn(resultSet.getInt(8));
            map.setStatusReasonColumn(resultSet.getInt(9));
            map.setPayableColumn(resultSet.getInt(10));
            map.setChargebackColumn(resultSet.getInt(11));
            map.setUsageColumn(resultSet.getInt(12));
            map.setUtilityAccountNumberColumn(resultSet.getInt(13));
            map.setVerificationNumberColumn(resultSet.getInt(14));
            map.setFlex1Column(resultSet.getInt(15));
            map.setFlex2Column(resultSet.getInt(16));
            map.setFlex3Column(resultSet.getInt(17));
            map.setFlex4Column(resultSet.getInt(18));
            map.setFlex5Column(resultSet.getInt(19));
            map.setAmountColumn(resultSet.getInt(20));
            map.setCommissionRate(resultSet.getFloat(21));
            
            return map;
        }


        return null;
    }

    public void Create(FormatMap newFormatMap, String clientName) throws SQLException {
       PreparedStatement statement = super.getConnection()
               .prepareStatement("INSERT INTO IM_FormatMap (ClientName, AgentIdColumn, DateColumn, CustomerNameColumn, CustomerAddressColumn, CustomerCityColumn, CustomerStateColumn, CustomerZipColumn, StatusColumn, StatusReasonColumn, PayableColumn, ChargebackColumn, UsageColumn, UtilityAccountNumberColumn, VerificationNumberColumn, Flex1Column, Flex2Column, Flex3Column, Flex4Column, Flex5Column, AmountColumn, CommissionRate) " + 
                       "Values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        statement.setString(1, clientName);
        statement.setInt(2, newFormatMap.getAgentIdColumn());
        statement.setInt(3, newFormatMap.getDateColumn());
        statement.setInt(4, newFormatMap.getCustomerNameColumn());
        statement.setInt(5, newFormatMap.getCustomerAddressColumn());
        statement.setInt(6, newFormatMap.getCustomerCityColumn());
        statement.setInt(7, newFormatMap.getCustomerStateColumn());
        statement.setInt(8, newFormatMap.getCustomerZipColumn());
        statement.setInt(9, newFormatMap.getStatusColumn());
        statement.setInt(10, newFormatMap.getStatusReasonColumn());
        statement.setInt(11, newFormatMap.getPayableColumn());
        statement.setInt(12, newFormatMap.getChargebackColumn());
        statement.setInt(13, newFormatMap.getUsageColumn());
        statement.setInt(14, newFormatMap.getUtilityAccountNumberColumn());
        statement.setInt(15, newFormatMap.getVerificationNumberColumn());
        statement.setInt(16, newFormatMap.getFlex1Column());
        statement.setInt(17, newFormatMap.getFlex2Column());
        statement.setInt(18, newFormatMap.getFlex3Column());
        statement.setInt(19, newFormatMap.getFlex4Column());
        statement.setInt(20, newFormatMap.getFlex5Column());
        statement.setInt(21, newFormatMap.getAmountColumn());
        statement.setFloat(22, newFormatMap.getCommissionRate());

        statement.executeUpdate();
    }

    public void Update(FormatMap formatMapToUpdate, String clientName) throws SQLException {
          PreparedStatement statement = super.getConnection()
               .prepareStatement("Update IM_FormatMap " +
                       "SET AgentIdColumn = ?, " +
                       "DateColumn = ?, " +
                       "CustomerNameColumn = ?, " +
                       "CustomerAddressColumn = ?, " +
                       "CustomerCityColumn = ?, " +
                       "CustomerStateColumn = ?, " +
                       "CustomerZipColumn = ?, " +
                       "StatusColumn = ?, " +
                       "StatusReasonColumn = ?, " +
                       "PayableColumn = ?, " +
                       "ChargebackColumn = ?, " +
                       "UsageColumn = ?, " +
                       "UtilityAccountNumberColumn = ?, " +
                       "VerificationNumberColumn = ?, " +
                       "Flex1Column = ?, " +
                       "Flex2Column = ?, " +
                       "Flex3Column = ?, " +
                       "Flex4Column = ?, " +
                       "Flex5Column = ?, " +
                       "AmountColumn = ?, " +
                       "CommissionRate = ? " +
                       "WHERE ClientName = ?");
        statement.setInt(1, formatMapToUpdate.getAgentIdColumn());
        statement.setInt(2, formatMapToUpdate.getDateColumn());
        statement.setInt(3, formatMapToUpdate.getCustomerNameColumn());
        statement.setInt(4, formatMapToUpdate.getCustomerAddressColumn());
        statement.setInt(5, formatMapToUpdate.getCustomerCityColumn());
        statement.setInt(6, formatMapToUpdate.getCustomerStateColumn());
        statement.setInt(7, formatMapToUpdate.getCustomerZipColumn());
        statement.setInt(8, formatMapToUpdate.getStatusColumn());
        statement.setInt(9, formatMapToUpdate.getStatusReasonColumn());
        statement.setInt(10, formatMapToUpdate.getPayableColumn());
        statement.setInt(11, formatMapToUpdate.getChargebackColumn());
        statement.setInt(12, formatMapToUpdate.getUsageColumn());
        statement.setInt(13, formatMapToUpdate.getUtilityAccountNumberColumn());
        statement.setInt(14, formatMapToUpdate.getVerificationNumberColumn());
        statement.setInt(15, formatMapToUpdate.getFlex1Column());
        statement.setInt(16, formatMapToUpdate.getFlex2Column());
        statement.setInt(17, formatMapToUpdate.getFlex3Column());
        statement.setInt(18, formatMapToUpdate.getFlex4Column());
        statement.setInt(19, formatMapToUpdate.getFlex5Column());
        statement.setInt(20, formatMapToUpdate.getAmountColumn());
        statement.setFloat(21, formatMapToUpdate.getCommissionRate());
        statement.setString(22, clientName);
        
        statement.executeUpdate();
    }
}
