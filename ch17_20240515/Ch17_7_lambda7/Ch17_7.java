/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_7_lambda7;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch17_7 {

    static String mapTo(int c,Function<Integer,String> func){
        
        return func.apply(c);
    }
    public static void main(String[] args) {
       String[] data = {"Apple","Banana","Kewi","Cherry"};
       
       String fruit =  mapTo(25,(x)->{
           return  data[x % data.length];
        });
       System.out.println(fruit);
    }
    
}
