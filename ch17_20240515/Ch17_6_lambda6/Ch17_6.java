/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_6_lambda6;
import java.util.Collection;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.function.Supplier;
public class Ch17_6 {

    static Collection<String> toCollection(Supplier<Collection<String>> su,
                        String ... values){
        Collection collection = su.get();
        for (String s : values){
            collection.add(s);
        }
        return collection;
    } 
    public static void main(String[] args) {
      Collection<String> nameC = 
              toCollection(()->new ArrayList<String>(),
                      "Ken","Apple","Lucy");
      
       System.out.println(nameC);
    }
    
}
