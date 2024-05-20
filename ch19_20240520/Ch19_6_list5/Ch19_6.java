/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240520.Ch19_6_list5;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it1 = new Item("A1",51);
        Item it2 = new Item("B2",78);
        Item it3 = new Item("C3",95);
        Item it4 = new Item("B2",78);
        ArrayList<Item> list = new ArrayList<>();
        list.add(it1);
        list.add(it2);
        list.add(it3);
        
        System.out.println(list);
        System.out.
       println(list.indexOf(it4));//物件必須複寫equals才可使用
        
    }
    
}
