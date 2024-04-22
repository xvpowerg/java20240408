/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240422;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {
    /*
        多載函數執行規則
        1 找一樣類型
        2 相同類型可相容
        3 不同類型可相容
        4 封箱類型
    */
    static void test1(float v1){
        System.out.println("Test1 V1");
    }
    static void test1(Integer s2){
        System.out.println("Test1 s2");
    }
    
    static void test2(Float f1){
        System.out.println("Test2 f1");
    }
    static void test2(short s2){
        System.out.println("Test2 S2");
    }
    public static void main(String[] args) {
        test1(10);
        //test2(20);//因為Float封箱類型不支持整數基本型態
        test2(Float.valueOf(20));
    }
    
}
