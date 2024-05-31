/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_3_stream3;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Ch24_3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Iris");
        list.add("Joy");
        list.add("Iris");
        
       Map<String,Integer> myMap = 
               list.stream().collect(Collectors.toMap(s->s, s->s.length(),
                       (v1,v2)->{
                 System.out.println(v1+":"+v2);
                return v1 + v2; 
               }));
       
       
      System.out.println(myMap);
    }
    
}
