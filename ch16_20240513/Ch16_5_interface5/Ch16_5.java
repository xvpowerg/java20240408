/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20240513.Ch16_5_interface5;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch16_5 {

    static void accumulate(ArrayList<Integer> number,UnaryOperator<Integer> calu){
        
        for (int i = 0; i <number.size();i++){
           Integer v =  number.get(i);
           Integer ans = calu.apply(v);
           number.set(i, ans);
        }
        
    }
    
    public static void main(String[] args) {
      
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(50);
        numberList.add(13);
        numberList.add(16);
        System.out.println(numberList);
        accumulate(numberList,new Accumulate(6));
        System.out.println(numberList);
        
    }
    
}
