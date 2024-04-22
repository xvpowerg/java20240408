/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240422;

/**
 *
 * @author xvpow
 */
public class Ch7_3 {

    static void test1(int v1,short s2){
        System.out.println("Test1 int short");
    }
    
    static void test1(int v1,float s2){
        System.out.println("Test1 int float");
    }
    
    static void test2(int v1,float f1){
        System.out.println("test2 int float");
    }
    
    static void test2(float f2,int v2){
         System.out.println("test2 float int");
    }
    public static void main(String[] args) {
      test1(10,20);
      //test2(30,40);
      test2(30f,40);
    }
    
}
