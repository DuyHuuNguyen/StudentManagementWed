/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Config.ConnectionConfig;
import Model.Account;
import java.io.IOException;
import java.sql.SQLException;


/**
 * CHỈ LẤY THÔNG TIN TÊN DB
 *
 * @author Omni
 */
public class AccountRepository {
    private ConnectionConfig connectionConfig = new ConnectionConfig();
    
    public Account getAccountByAccountIdAndPassword(String accountId, String pass) throws Exception {
        Connection conn = connectionConfig.getConnection();
        Account user = new Account();
        String query = "SELECT AccountId ,Pass, IdHocVien  FROM Account   WHERE AccountId LIKE ? OR Pass like ? ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, "%"+accountId+"%");
        ps.setString(2, "%"+pass+"%");
        try {
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            user.setAccountId(rs.getString("AccountId"));
            user.setPassword(rs.getString("Pass"));
            user.setStudentId(rs.getInt("IdHocVien"));
        }
        } catch(Exception e){
            
        }
        System.out.println(user);
        ConnectionConfig.closeConnection(conn);
        return user;
    }
    
    public boolean create(Account newAccount) throws SQLException, ClassNotFoundException, IOException{
        Connection con = connectionConfig.getConnection();
        String query = "insert into Account (AccountId ,Pass,IdHocVien)\n" +
           "values (?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, newAccount.getAccountId());
        preparedStatement.setString(2, newAccount.getPassword());
        preparedStatement.setInt(3, newAccount.getStudentId() );
        int row = preparedStatement.executeUpdate();
         ConnectionConfig.closeConnection(con);
        return row>0;
    }

}
