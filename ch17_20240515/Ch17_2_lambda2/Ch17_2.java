/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_2_lambda2;

/**
 *
 * @author xvpow
 */
public class Ch17_2 {

    static void testFunc2(int v,TestLambda2 lambda){
        lambda.func2(v);
    }
    public static void main(String[] args) {
        testFunc2(25,(int x)->{System.out.println(x);});
        testFunc2(21,(x)->{System.out.println(x);});
        testFunc2(21,(x)->System.out.println(x));
        testFunc2(21,x->System.out.println(x));
    }
    
}
