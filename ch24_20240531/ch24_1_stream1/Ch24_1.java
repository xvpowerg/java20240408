/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240531.ch24_1_stream1;

import java.util.ArrayList;

public class Ch24_1 {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(70);
       list.add(30);
       
     int result = list.stream().parallel().reduce(2, (v1,v2)->{
          System.out.println("ac:"+v1+":"+v2);
          return v1 + v2;
       }, (v1,v2)->{
          System.out.println("com:"+v1+":"+v2);
          return v1 + v2;
       });
     
     System.out.println(result);
    }
    
}
