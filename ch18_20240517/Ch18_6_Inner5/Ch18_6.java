/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240517.Ch18_6_Inner5;

/**
 *
 * @author xvpow
 */
public class Ch18_6 {

    static void runtTestIF(TestIF tif){
        tif.func1();
        tif.func2();
    }
    
    static void runTestIF2(TestIF2 tif2){
        tif2.func1();
    }
    public static void main(String[] args) {
       runtTestIF(new TestIF(){
           public void func1(){
               System.out.println("TestIF func1!!");
           }
           public void func2(){
               System.out.println("TestIF func2!!");
           }
       });
       
       runTestIF2(()->System.out.println("A1"));
       runTestIF2(new TestIF2(){
           public void func1(){
               System.out.println("B1");
           }
       
       });
    }
    
}
