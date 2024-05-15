/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_10_lambda10;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch17_10 {

    static void testFunc(String s,UnaryOperator<String> uo){
        System.out.println(uo.apply(s));
    }
    public static void main(String[] args) {
       
       String s = "abcd";
       System.out.println(s.toUpperCase());
       //呼叫傳入字串的toUpperCase()並回傳
       testFunc(s,String::toUpperCase);
        
    }
    
}
