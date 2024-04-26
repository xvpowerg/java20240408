/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240426.Ch9_6_obj6;



/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    Test2(){
        this("Value1");
        System.out.println("Test2()");
    }
     Test2(String s1){
          this(s1,20);
       System.out.println("Test2(String s1):"+s1);
    }
    Test2(String s1,int v1){
        super("Test2 String");
       System.out.println("Test2(String s1,int v1):"+s1+":"+v1);
    }
    
}
