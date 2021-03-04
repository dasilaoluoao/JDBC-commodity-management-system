/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlwork;

import java.sql.*;

/**
 *
 * @author admin
 */
public class Connect {

    Connection con;
    Statement sql;
    ResultSet rs;

    public Connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasework", "root", "longma5201314");
        sql = con.createStatement();
    }

    /*
     Class.forName (driver);
     con  = DriverManager.getConnection(url, user, password);
     sql  = con.createStatement();
     rs  = sql.executeQuery("");
     */
    public ResultSet connect(String s) throws SQLException {

        rs = sql.executeQuery(s);
        return rs;
    }
}
