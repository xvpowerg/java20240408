/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240605.Ch26_6_db1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch26_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20240605";
        String user = "qwer";
        String password = "123456";
       try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement statem =    conn.createStatement();){
           statem.executeUpdate("INSERT INTO student(id,name,score)VALUES(200,'Lucy',75)");
       } catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
