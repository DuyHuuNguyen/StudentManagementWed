/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.io.IOException;
import java.sql.*;

/**
 * Lớp tạo kết nối với database
 * đổi tên lớp thành ConnectionConfig
 * @author Omni
 */
public class ConnectionConfig {
    private final String serverName = "localhost";
    private final String dbName = "QuanLyKhoaHoc";
    private final String portNumber = "1433";
    private final String instance = ""; 
    private final String userID = "DUY";
    private final String password = "1111";

    public  Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
        if (instance == null || instance.trim().isEmpty()) {
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    public static void closeConnection(Connection conn) throws IOException, SQLException {
        if (conn != null) {
            System.out.println("close connection");
            conn.close();
        } else {
            System.out.println("Connection is close");
        }
    }
}
