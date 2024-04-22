/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240422;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {

    /*
      多載的定義
      函式名稱要一樣
      傳入參數的類型或數量不樣
    */
    /*
        多載函數執行規則
        1 找一樣類型
        2 相同類型可相容
        3 不同類型可相容
        4 封箱類型
    */
    
    static void test1(int v1){
        System.out.println("Test1 V1");
    }
    static void test1(String s2){
        System.out.println("Test1 s2");
    }
    
    static void test2(int v1){
        System.out.println("Test2 V1");
    }
    static void test2(short s2){
         System.out.println("Test2 S2");
    }
     //2 相同類型可相容
    static void test3(short s1){
        System.out.println("Test3 S1");
    }
    static void test3(long v2){
        System.out.println("Test3 V2");
    }
    //3 不同類型可相容
    static void test4(short s1){
        System.out.println("Test4 S1");
    }
    //4 封箱類型
    static void test4(float f2){
        System.out.println("Test4 F2");
    }
    
    static void test5(byte b1){
        System.out.println("Test5 B1");
    }
    static void test5(Integer i2){
          System.out.println("Test5 i2");
    }
    
    public static void main(String[] args) {
        test5(13);
        test4(25);
        
        test3(10);
        short s = 20;
        test2(20);
        test2(s);
        
        test1(10);
        test1("Vivin");
       
    }
    
}
