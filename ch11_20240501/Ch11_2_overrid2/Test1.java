/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240501.Ch11_2_overrid2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public int sum(){
        System.out.println("Test1 sum");
        return 10;
    }
    
    public Test3 testFunc(){
        System.out.println("Test1 testFunc");
        return new Test3();
    }
}
