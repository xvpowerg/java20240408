/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240605.Ch26_6_db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xvpow
 */
public class Ch26_6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //交易
             String url = "jdbc:derby://localhost:1527/mydb20240605";
        String user = "qwer";
        String password = "123456";
       try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement statem =    conn.createStatement();){
           conn.setAutoCommit(false);
           
           try{
                statem.executeUpdate("INSERT INTO student(id,name,score)VALUES(400,'XXXX',75)");
                statem.executeUpdate("INSERT INTO student(id,name,score)VALUES(600,'Lucy',75)"); 
           }catch(Exception ex){
              conn.rollback();
           }
           conn.setAutoCommit(true);
       } catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
