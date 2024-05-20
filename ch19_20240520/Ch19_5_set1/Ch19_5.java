/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240520.Ch19_5_set1;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author xvpow
 */
public class Ch19_5 {

   
    public static void main(String[] args) {
        //Set 可過濾重複
        //Set 基本上無順序 不會依造我放進去的順序
        HashSet<String> set = new HashSet();
        set.add("Ken");
        set.add("Vivin");
        set.add("Lucy");
        set.add("Vivin");
        set.forEach(v->System.out.println(v));
    }
    
}
