/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240426.Ch9_5_obj5;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        this("Test1");
    }
    Test1(String s1){
        this(10,s1);
        System.out.println("Test1(String s1):"+s1);
    }
    Test1(int v1,String s1){
        
        System.out.println("Test1(int v1,String s1)"+v1+":"+s1);
    }
}
