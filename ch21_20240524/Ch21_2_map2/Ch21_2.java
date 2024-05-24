/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240524.Ch21_2_map2;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

  
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken",25);
        map.put("Vivin",17);
        map.put("Lucy",51);
        
        //Ken存在 會執行方法
        map.compute("Ken",(ken,v)->{
            System.out.println(ken+":"+v);
        return 7;
        });
        System.out.println(map);
        //Ken存在 不會執行方法
        map.computeIfAbsent("Ken",(f)->{System.out.println(f); return 10;});
        //Ken存在 會執行方法
        map.computeIfPresent("Ken", (k,v)->{
                System.out.println(k+":"+v);
                return 100;
        });
         System.out.println(map);
         
         //Joy 不存在 會執行方法 
         map.compute("Joy", (k,v)->{
             System.out.println(k+":"+v);
             return 88;
         });
           System.out.println(map);
        //Iris 不存在  會執行方法 
        map.computeIfAbsent("Iris", (key)->{
            System.out.println("k:"+key);
            return 97;
        });
        System.out.println(map);
        
         //Ben 不存在  不會執行方法 
        map.computeIfPresent("Ben", (k,v)->{
            System.out.println(k+v); 
            return 100;});
    }
    
}
