/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240529.Ch23_5_stream3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
      ArrayList <String> list = new ArrayList<>(); 
     ArrayList <String> list2 = new ArrayList<>(); 
     ArrayList <String> list3 = new ArrayList<>(); 
     
     list.add("AAA");
     list.add("BB");
     
     list2.add("CCCCC");
     list2.add("D");
     
     list3.add("EFF");
     list3.add("G");
     list3.add("HHHH");
      HashMap<Integer,ArrayList<String>> map = new HashMap<>();
      
      map.put(10, list);
      map.put(6, list2);
      map.put(7, list3);
      
      ArrayList<ArrayList<String>>  
               dataList = new  ArrayList<ArrayList<String>> ();
      for (int k : map.keySet()){
          dataList.add(map.get(k));
      }
      
     IntSummaryStatistics is =  dataList.stream().flatMap(data->data.stream()).
              mapToInt(st->st.length()).summaryStatistics();
     long count = is.getCount();
     long  sum = is.getSum();
     double avg = is.getAverage();
     System.out.println(count);
     System.out.println(sum);
     System.out.println(avg);
    }
    
}
