/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240605.Ch26_6_db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class Ch26_6_2 {
    public static void main(String[] args) {
         String url = "jdbc:derby://localhost:1527/mydb20240605";
        String user = "qwer";
        String password = "123456";
       try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement statem =    conn.createStatement();){
       ResultSet rest =  statem.executeQuery("SELECT * FROM STUDENT");
        while(rest.next()){
            System.out.println(rest.getInt(1));
            System.out.println(rest.getString(2));
            System.out.println(rest.getDouble("score"));
              System.out.println("=========================");
        }
       } catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
