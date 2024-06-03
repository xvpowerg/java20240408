/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_4_io4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author xvpow
 */
public class Ch25_4 {
    public static void main(String[] args) {
      Student st1 = new Student("Ken",75,163.5f);
      System.out.println(st1);
      File file = new File("c:\\mydir\\st.obj");
      try(FileOutputStream fout = 
              new FileOutputStream(file);
         ObjectOutputStream objOut = 
                 new ObjectOutputStream(fout);     ){
          objOut.writeObject(st1);
      }catch(Exception ex){
          System.out.println(ex);
      }
      
 


    }
    
    
}
