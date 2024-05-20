/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240520.Ch19_1_list1;
import java.util.ArrayList;
public class Ch19_1 {

    public static void main(String[] args) {
       ArrayList list = new ArrayList();
       list.add("Ken");
       list.add("Lucy");
       list.add("Iris");
       
       System.out.println(list.get(1));
       System.out.println("===========================");
       for (int i = 0 ; i <list.size() ;i++){
           System.out.println(list.get(i));
       }
      System.out.println("===========================");
      for (Object ob : list){
          System.out.println(ob);
      }
      System.out.println("===========================");
      list.forEach(s->System.out.println(s));
    }
}
