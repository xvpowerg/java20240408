/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_5_stream5;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

public class Ch24_5 {

 
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Iris");
        list.add("Joy");
      Map<Integer,Long> groupMap =   
              list.stream().collect(
                      Collectors.groupingBy(s->s.length(), 
                              Collectors.counting()));
      System.out.println(groupMap);
       
    }
    
}
