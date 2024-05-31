/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_6_stream6;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

public class Ch24_6 {

  
    public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Iris");
        list.add("Joy");
        
       Map<Boolean,List<String>> pMap =  list.stream().collect(
                Collectors.partitioningBy(p->p.length() > 3));
      System.out.println(pMap); 
      
      String msg = 
              list.stream().collect(Collectors.joining(",", "Tile:", "."));
      System.out.println(msg);
    }
    
}
