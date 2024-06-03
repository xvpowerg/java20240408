/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_9_nio2_5;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch25_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
      Path p1 =  Paths.get("c:","mydir","dir");
      Stream<Path> st =  Files.walk(p1);
      //st.forEach(p->System.out.println(p));
      //只列出文字檔txt
     st.filter(p->p.getFileName().toString().endsWith("txt")).
             forEach(v->System.out.println(v));
     System.out.println("================================");
       Stream<Path> st2 =  Files.walk(p1,2);
       st2.forEach(v->System.out.println(v));
    }
    
}
