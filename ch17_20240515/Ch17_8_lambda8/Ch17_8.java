/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_8_lambda8;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Ch17_8 {

    static void filter(ArrayList<String> names,Predicate<String> p){
        for (String n : names){
            if (p.test(n)){
                 System.out.println(n);
            }
           
        }
    }
    public static void main(String[] args) {
        //選一個functioninterface
        //實現字串長度等於4顯示
        //使用lambda
        // TODO code application logic here
        ArrayList<String> nList =  new ArrayList<>(); 
        nList.add("Joy");
        nList.add("Iris");
        nList.add("Vivin");
        nList.add("Lucy");
        filter(nList,n->n.length() == 4);
    }
    
}
