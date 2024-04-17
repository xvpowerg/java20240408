/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240417;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {

    static void testReturn(int x){
        System.out.println("Start");
        if (x > 10){
            return;//離開函式
        }
        System.out.println("End");
    }
    
    static void test2(int x){
        System.out.println("Start:"+x);
        if (x <= 3){
            System.out.println("Inner Start:"+x);
            test2(x + 1);
            System.out.println("Inner End:"+x);
        }
        System.out.println("End:"+x);
    }
    
    public static void main(String[] args) {
        testReturn(2);
        testReturn(15);
        
        test2(1);
         System.out.println();
    }
    
}
