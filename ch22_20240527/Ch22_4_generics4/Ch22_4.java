/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240527.Ch22_4_generics4;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch22_4 {

    static <T>void foreach(ArrayList<T> list,Consumer<T> con){
        for (T v : list){
          con.accept(v);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Ken");
        list1.add("Vivin");
        list1.add("Lucy");
        foreach(list1,v->System.out.println(v+" "));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.add(77);
        list2.add(99);
         foreach(list2,v->System.out.println(v+" "));
    }
    
}
