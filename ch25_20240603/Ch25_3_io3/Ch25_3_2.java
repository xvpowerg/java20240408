/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_3_io3;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author xvpow
 */
public class Ch25_3_2 {

  
    public static void main(String[] args) {
        //反序列化
       File file = new File("c:\\mydir\\msg.obj");
       try(FileInputStream fin = new FileInputStream(file);
            ObjectInputStream objin = new ObjectInputStream(fin)  ){
          Object obj =  objin.readObject();
          System.out.println(obj);
       }catch(Exception ex){
           System.out.println(ex);
       }
    }
    
}
