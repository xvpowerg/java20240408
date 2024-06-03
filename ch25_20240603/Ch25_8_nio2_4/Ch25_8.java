/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_8_nio2_4;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch25_8 {

   
    public static void main(String[] args)throws Exception {
        
        Path dirPath = Paths.get("c:","mydir","dir");
        Stream<Path> st =  Files.list(dirPath);
        st.forEach(p->System.out.println(p));
    }
    
}
