/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240527.Ch22_3_generics3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch22_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String v1 =  Test1.test1("Vivin");
       System.out.println(v1);
       int v2 =  Test1.test1(10);
        System.out.println(v2);
        //指定類型
       ArrayList list =  Test1.<ArrayList>test1(new ArrayList());
       
      int v3 =  Test1.test2(20, v->v * 5);
      System.out.println(v3);
      String v4 = Test1.test2("Vivin", v->"Title:"+v);
       System.out.println(v4);
    }
    
}
