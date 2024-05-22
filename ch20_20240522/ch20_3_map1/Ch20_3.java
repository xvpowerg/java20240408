/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240522.ch20_3_map1;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author xvpow
 */
public class Ch20_3 {

   
    public static void main(String[] args) {
       
        HashMap<Integer,String> map = new HashMap();
        map.put(10, "A1");
        map.put(16, "B2");
        map.put(31, "C3");
        System.out.println(map.get(16));
        System.out.println(map.get(99));
        
        Set<Integer> keys =  map.keySet();
        for (Integer k : keys){
            System.out.println(k+":"+map.get(k));
        }
        
        map.forEach((k,v)->System.out.println(k+":"+v));
        
        //key不存在
        if (!map.containsKey(16)){
             map.put(16, "B3");//key存在覆蓋    
        }
        
        System.out.println(map);
        
        map.putIfAbsent(82, "X1");
        System.out.println(map);
        map.putIfAbsent(31, "R8");
          System.out.println(map);
        
    }
    
}
