/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240520.Ch19_7_set2;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch19_7 {
    public static void main(String[] args) {
        Item it1 = new Item("A1",51);
        Item it2 = new Item("B2",78);
        Item it3 = new Item("C3",95);
        Item it4 = new Item("B2",78);
        HashSet<Item> set = new HashSet();//hashcode
        set.add(it1);
        set.add(it2);
        set.add(it3);
        set.add(it4);
        System.out.println(set);
    }
    
}
