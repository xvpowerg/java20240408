/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240501.Ch11_2_overrid2;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
     public int sum(){
        System.out.println("Test2 sum");
        return 20;
    }
      public Test4 testFunc(){
        System.out.println("Test2 testFunc");
        return new Test4();
    }
}
