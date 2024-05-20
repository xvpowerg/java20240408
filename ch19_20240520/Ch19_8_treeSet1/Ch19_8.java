/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240520.Ch19_8_treeSet1;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch19_8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Integer> set = new TreeSet();
        set.add(25);
        set.add(15);
        set.add(31);
        set.add(12);
        set.add(29);
        System.out.println(set);
        
       System.out.println(set.first());
       System.out.println(set.last());
       
       System.out.println("higher:"+set.higher(16));//set內是剛剛好大於>16的數值 
       System.out.println("ceiling:"+set.ceiling(16));//set內是剛剛好大等於>=16的數值
       System.out.println("higher:"+set.higher(15));//set內是剛剛好大於>15的數值 
       System.out.println("ceiling:"+set.ceiling(15));//set內是剛剛好大等於>=15的數值 
       
       System.out.println("lower:"+set.lower(16));//set內是剛剛好小於<16的數值 
       System.out.println("floor:"+set.floor(16));//set內是剛剛好小等於<=16的數值
       System.out.println("lower:"+set.lower(15));//set內是剛剛好小於<15的數值 
       System.out.println("floor:"+set.floor(15));//set內是剛剛好小等於<=15的數值 
    }
    
}
