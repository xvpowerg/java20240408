/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_6_nio2_2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
/**
 *
 * @author xvpow
 */
public class Ch25_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Path p1 = Paths.get("c:","mydir","netbeans-21-bin.zip");
       Path p2 = Paths.get("c:","mydir","netbeans-21-bin_copyx.zip");
       try{
           Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
    
}
