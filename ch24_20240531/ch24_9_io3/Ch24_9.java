/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_9_io3;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class Ch24_9 {
    public static void main(String[] args) {
          File f1 = new File("c:\\mydir\\netbeans-21-bin.zip");
       File outFile = new File("c:\\mydir\\netbeans-21-bin_copy.zip");
       try{
            FileInputStream fin = new FileInputStream(f1);
            BufferedInputStream bfIn = new BufferedInputStream(fin);
            FileOutputStream fout = new FileOutputStream(outFile);
            BufferedOutputStream bfOut = new BufferedOutputStream(fout);
            int data = -1;
            while( (data = bfIn.read() ) != -1){
              bfOut.write(data);
            }     
          bfOut.close();
          bfIn.close();
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
