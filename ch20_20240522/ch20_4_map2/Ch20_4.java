/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240522.ch20_4_map2;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch20_4 {

 
    public static void main(String[] args) {
      HashMap <String,Integer> map = new HashMap();
      map.put("Ken",82);
      map.put("Vivin",73);
      map.put("Lucy",62);
      
      System.out.println(map.get("Joy"));
      System.out.println(map.getOrDefault("Joy",-1));
      //Key存在呼叫合併的方法
      //Key不存在寫入Map
      map.merge("Vivin", 25,(v1,v2)->{
      
          System.out.println(v1+":"+v2);
          return v1 + v2;
      } );
      
      System.out.println(map);
    }
    
}
