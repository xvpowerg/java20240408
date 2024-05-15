/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_1_lambda1;

/**
 *
 * @author xvpow
 */
public class Ch17_1 {

    static void runFunc(TestLambda1 lambda){
        lambda.func1();
    }
    public static void main(String[] args) {
        runFunc(()->{System.out.println("TestLambda");});
        runFunc(()->System.out.println("TestLambda2"));
    }
    
}
