/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch16_20240513.Ch16_8_interface8;

/**
 *
 * @author xvpow
 */
public interface Test3 extends Test1,Test2 {
       default void func1(){
        System.out.println("Test3 func1");
    } 
}
