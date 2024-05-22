/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240522.ch20_1_treeset1;
import java.util.TreeSet;
public class Ch20_1 {

    public static void main(String[] args) {
        Item it1 = new Item("A1",25);
        Item it2 = new Item("A2",62);
        Item it3 = new Item("A3",31);
        Item it4 = new Item("A4",16);
        TreeSet set1 = new TreeSet();
        set1.add(it1);
        set1.add(it2);
        set1.add(it3);
        set1.add(it4);
       System.out.println(set1);
    }
    
}
