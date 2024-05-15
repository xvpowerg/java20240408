/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_3_lambda3;

/**
 *
 * @author xvpow
 */
public class Ch17_3 {
    static void testFunc3(int x,TestLambda3 lam){
       String v =  lam.func3(x);
       System.out.println("Func3:"+v);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        testFunc3(65,(int x) ->{
            return ((char)x)+""; 
        });
        testFunc3(66,x->String.valueOf((char)x));
        
    }
    
}
