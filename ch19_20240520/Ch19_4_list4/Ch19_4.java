/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240520.Ch19_4_list4;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch19_4 {
    
        static void printList(List<String> list){
        for (String v : list){
            System.out.print(v+" ");
        }
        System.out.println();
        System.out.println("======================");
    }
    public static void main(String[] args) {
       
        LinkedList<String> list = new LinkedList();
        list.add("Ken");
        list.add("Lucy");
        list.add("Vivin");
        printList(list);
        System.out.println(list.peek());
        System.out.println(list.peek());//List空回傳null
        printList(list);
        System.out.println(list.poll());//List空回傳null
        printList(list);
        System.out.println(list.pop());//List空回傳拋例外
        printList(list);
        list.poll();
        String value = list.poll();
        System.out.println(value);
    }
    
    
}
