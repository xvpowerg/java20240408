/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240419;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

    static void test1(int a1,int ... a2){
        System.out.println("a1:"+a1);
        for (int v: a2){
            System.out.println(v);
        }
    }
    public static void main(String[] args) {
       test1(10,20,30,40,50);
    }
    
}
