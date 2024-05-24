/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240524.Ch21_3_map3;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch21_4 {
    public static void main(String[] args) {
        Comparator<Integer> comp = Comparator.comparing(v->v);
        comp = comp.reversed();
       TreeMap<Integer,String> treeMap = new TreeMap(comp);
       treeMap.put(25, "Lucy");
       treeMap.put(12, "Iris");
        treeMap.put(18, "Vivin");
        System.out.println(treeMap);
    }
    
}
