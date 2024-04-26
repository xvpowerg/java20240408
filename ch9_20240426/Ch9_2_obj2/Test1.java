/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240426.Ch9_2_obj2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){//預設建構式
            this("S1");
           System.out.println("Test1():");  
    }
    //預設建構式只有在無任何建構式時自動加入
    Test1(String v1){
        this(25);
        System.out.println("Test1(String v1):"+v1);
        
    }
    Test1(int v1){
        this(v1,"Test1 V2"); 
        System.out.println("Test1(int v1):"+v1);
    }
    Test1(int v1,String v2){
        System.out.println("Test1(int v1,String v2):"+v1+":"+v2);
    }
}
