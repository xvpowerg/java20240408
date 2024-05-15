/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_5_lambda5;
import java.util.ArrayList;
import java.util.function.Consumer;
public class Ch17_5 {

     
    
     static void foreach(ArrayList<String> list,Consumer<String> c){
         
         for (String s : list){
             c.accept(s);
         }
     }
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList();
      list.add("Ken");
      list.add("Vivin");
      list.add("Lucy");
      foreach(list,(String n)->System.out.println(n));
      /*Ken
      Vivin
      Lucy
      */

    }
    
}
