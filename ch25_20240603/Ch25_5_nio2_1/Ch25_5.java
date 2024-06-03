/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240603.Ch25_5_nio2_1;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author xvpow
 */
public class Ch25_5 {
    
    public static void main(String[] args) {
      Path path = Paths.get("c:","mydir","msg.txt");
      System.out.println(path);
       
     Path path2 = Paths.get("c:","A","S","D","F","G");
     System.out.println(path2);
     System.out.println(path2.getRoot());
     System.out.println(path2.subpath(1, 3));
     
     Path path3 = Paths.get("c:","mydir");
     Path path4 = Paths.get("my.jpg");
     Path newPath1 =  path3.resolve(path4);
     System.out.println(newPath1);
     Path path5 = Paths.get("c:","x","..","y");
     Path path6 = Paths.get("c:",".","h");
     System.out.println(path5.normalize());
     System.out.println(path6.normalize());
    }
    
}
