/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240529.Ch23_4_stream2;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
/**
 *
 * @author xvpow
 */
public class Ch23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList <String> list = new ArrayList<>();   
         list.add("Joy");
         list.add("Ken");
         list.add("Lucy");
         list.add("Iris");
         list.add("Ben");
         list.stream().map(s->s.toUpperCase()).
                 forEach(v->System.out.println(v));
         
        IntSummaryStatistics is = 
                list.stream().mapToInt(s->s.length()).summaryStatistics();
         System.out.println(is.getAverage());
         System.out.println(is.getCount());
          System.out.println(is.getSum());
          
          
    }
    
}
