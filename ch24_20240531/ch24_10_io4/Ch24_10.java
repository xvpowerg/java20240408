/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_10_io4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author xvpow
 */
public class Ch24_10 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        File f1 = new File("c:\\mydir\\netbeans-21-bin.zip");
        File outFile = new File("c:\\mydir\\netbeans-21-bin_copy.zip");
        BufferedInputStream bfIn = null;
        BufferedOutputStream bfOut = null ;
       try{
            FileInputStream fin = new FileInputStream(f1);
             bfIn = new BufferedInputStream(fin);
            FileOutputStream fout = new FileOutputStream(outFile);
             bfOut = new BufferedOutputStream(fout);
            int data = -1;
            while( (data = bfIn.read() ) != -1){
              bfOut.write(data);
            }     
          
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }finally{
           try{
                bfOut.close();
                bfIn.close();
           }catch(IOException ex){
               
           }
          
       }
    }
    
}
