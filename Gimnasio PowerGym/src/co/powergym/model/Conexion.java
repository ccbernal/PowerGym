/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.powergym.model;
import java.sql.*;

/**
 *
 * @author Ricardo
 */
public class Conexion {
    public Conexion(){
        
    }
    
    public Connection getConexion(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
        } catch (Exception e) {
        }
        
        return con;
    }
}
