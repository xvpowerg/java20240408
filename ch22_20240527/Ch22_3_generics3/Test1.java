/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20240527.Ch22_3_generics3;
import java.util.function.UnaryOperator;

/**
 *
 * @author xvpow
 */
public class Test1{
    
   public  static <T> T test1(T v){
       return v;
   }
   
   public static <T> T test2(T v,
           UnaryOperator<T> callBack){
       return callBack.apply(v);
   }
    
}
