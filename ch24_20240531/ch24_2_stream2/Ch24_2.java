/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_2_stream2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Ch24_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Iris");
        list.add("Joy");
        
      List<String> dataList = 
              list.stream().filter(s->s.length() > 3).
                      collect(Collectors.toList());
      System.out.println(dataList);
    }
    
}
