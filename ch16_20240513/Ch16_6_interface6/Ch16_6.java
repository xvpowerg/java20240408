/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20240513.Ch16_6_interface6;
import java.util.ArrayList;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch16_6 {

   static void filter(ArrayList<String> data,Predicate<String> p){
       
       for (String n : data){
           if (p.test(n)){
               System.out.println(n);
           }
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<String> names = new ArrayList();
       names.add("Iris");
       names.add("Joy");
       names.add("Howard");
       filter(names,new FilterLen(4));
        
    }
    
    
}
