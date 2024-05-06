/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20240506.Ch13_4_init3;

/**
 *
 * @author xvpow
 */
public class TestInit {
    {
    System.out.println("init 1");
    }
    
    static{
       System.out.println(" static init 1"); 
    }
    TestInit(){
        System.out.println("TestInit()");
    }
    
    {
    System.out.println("init 2");
    }
    static{
       System.out.println(" static init 2"); 
    }
    
    
    public static void TestStatic(){
    
    }
}
