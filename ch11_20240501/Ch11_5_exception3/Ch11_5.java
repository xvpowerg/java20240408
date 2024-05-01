/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240501.Ch11_5_exception3;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
public class Ch11_5 {

   static void TestException(int v)throws FileNotFoundException,IOException,SQLException{
       if (v > 50){
           throw new FileNotFoundException("找不到檔案");
       }else if(v > 30){
           throw new IOException("無授權");
       }else{
           throw new SQLException("SQL語法錯誤"); 
       }
   }
   //FileNotFoundException 繼成了IOException
   //IOException 是 FileNotFoundException 父類
   IOException ioex = new FileNotFoundException();
   
    public static void main(String[] args) {
        //越下越父
        try{
           TestException(40); 
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }catch(SQLException ex){
             System.out.println(ex);
        }
    }
    
}
