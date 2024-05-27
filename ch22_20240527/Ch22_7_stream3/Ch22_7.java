/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240527.Ch22_7_stream3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch22_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<Integer> arrayList = new ArrayList();
     arrayList.add(25);
     arrayList.add(18);
     arrayList.add(31);
     arrayList.add(53);
     //所有條件都成立回傳true
     //只要一個條件不成立就短路
     boolean b1 = arrayList.stream().allMatch(p->p > 10);
     System.out.println(b1);
     //只要一個條件成立回傳true
     //只要一個條件成立就短路
     boolean b2 = arrayList.stream().anyMatch(p->p > 30);
     System.out.println(b2);
     //只要一個條件成立回傳false
     //只要一個條件成立就短路
     boolean b3 =  arrayList.stream().noneMatch(p->p < 10);
     System.out.println(b3);
     
     
     arrayList.stream().
             peek(v->System.out.println("allMatch:"+v)).allMatch(p->p > 20);
     
      arrayList.stream().
             peek(v->System.out.println("anyMatch:"+v)).anyMatch(p->p > 30);
         arrayList.stream().
             peek(v->System.out.println("noneMatch:"+v)).noneMatch(p->p > 20);
    }
    
}
