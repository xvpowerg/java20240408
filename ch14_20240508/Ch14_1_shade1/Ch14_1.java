/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240508.Ch14_1_shade1;

/**
 *
 * @author xvpow
 */
public class Ch14_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Test1 t1 = new Test2();
      t1.setValue("SetValue1");
      System.out.println(t1);
      
       Test1 t2 = new Test2();
       t2.value = "SetValue2";
       System.out.println(t2);
    }
    
}
