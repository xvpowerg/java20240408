/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240520.Ch19_3_list3;
import java.util.ArrayList;
public class Ch19_3 {

    static void printList(ArrayList<Integer> list){
        for (int v : list){
            System.out.print(v+" ");
        }
        System.out.println();
        System.out.println("======================");
    }
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
       list.add(25);
       list.add(18);
       list.add(26);
       list.add(71);
       printList(list);
       list.add(2, 102);
       printList(list);
       ArrayList<Integer> dataList = new  ArrayList();
       dataList.add(125);
       dataList.add(126);
       dataList.add(129);
       list.addAll(dataList);
       printList(list);
       list.set(4, 37);
       printList(list);
       list.replaceAll(x->x+2);
       printList(list);
       list.remove(Integer.valueOf(128) );
       printList(list);
      int index =  list.indexOf(28);
      System.out.println(index);
      if (index > -1) list.remove(index);
      printList(list); 
      
      ArrayList<Integer> reomveList = new  ArrayList();
      reomveList.add(20);
      reomveList.add(39);
      list.removeAll(reomveList);
      printList(list); 
      list.removeIf(p->p > 120);
      printList(list);
      
      
    }
    
}
