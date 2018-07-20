/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.javacrud.util;
import java.sql.*;


/**
 *
 * @author detry
 */
public class connectionFactory {
    private static  Connection con;
     static String url = "jdbc:mysql://localhost:3306/javacrud";  
    
    
    public  static  Connection  getconnection() throws Exception {
    
      if(con == null){
        try{
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
       
        con= (Connection) DriverManager.getConnection(url, "root", "");
            
        }catch(SQLException e){
            throw new Exception (e.getMessage());
            
        }
      }
     return  con;
    }
    
    
    
   
}
