/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_8_io2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch24_8 {

  
    public static void main(String[] args) {
       File f1 = new File("c:\\mydir\\msg.txt");
       File outFile = new File("c:\\mydir\\msg_copy.txt");
       try{
            FileInputStream fin = new FileInputStream(f1);
            FileOutputStream fout = new FileOutputStream(outFile);
            int data = -1;
            while( (data = fin.read() ) != -1){
              fout.write(data);
            }     
            
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
      
    }
    
}
