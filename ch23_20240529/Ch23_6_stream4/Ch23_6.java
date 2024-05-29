/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240529.Ch23_6_stream4;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
/**
 *
 * @author xvpow
 */
public class Ch23_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Item> list = new ArrayList<>();
        Item i1 = new Item();
        Item i2 = new Item();
        Item i3 = new Item();
        
        i1.add(50);
        i1.add(63);
        i1.add(77);
        
        i2.add(81);
        i2.add(32);
        
        i3.add(71);
        i3.add(45);
        list.add(i1);
        list.add(i2);
        list.add(i3);
        
        IntSummaryStatistics is = 
                list.stream().flatMapToInt(it->it.getStream()).summaryStatistics();
       System.out.println(is.getCount());
        System.out.println(is.getAverage());
        
    }
    
}
