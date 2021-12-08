/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dcL
 */
 public class MySqlConnect {
    Connection conn= null;
    public static Connection ConnectDB()
  
    {
    
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/museum?autoReconnect=true&useSSL=false","root","root");
            return conn;
        }
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    
    }
}
