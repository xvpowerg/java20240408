/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_7_nio2_3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch25_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
           Path p1 = Paths.get("c:","mydir","msg.txt");
           Stream<String> st = Files.lines(p1);
           st.forEach(s->System.out.println(s));
    }
    
}
