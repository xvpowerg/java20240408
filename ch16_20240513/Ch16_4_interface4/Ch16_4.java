/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20240513.Ch16_4_interface4;
import java.util.ArrayList;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch16_4 {

    static ArrayList<Integer> mapToInt(ArrayList<String> data,
                        Function<String,Integer> toIntFunc){
        ArrayList<Integer> result = new ArrayList();
        
        for (String v : data){
            Integer n = toIntFunc.apply(v);
            result.add(n);
        }
        
        return result;
    }
    public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<>();
       names.add("Ken");
       names.add("Lucy");
       names.add("Vivin");
       
     ArrayList<Integer> lenList = mapToInt(names,new ToStringLen());
     System.out.println(lenList);
     
       ArrayList<String> sex = new ArrayList<>();
       sex.add("M");//1
       sex.add("W");//0
       sex.add("M");//1
       sex.add("W");//0
       sex.add("W");//0
     ArrayList<Integer> sexNumber = mapToInt(sex,new SexMapping());
     System.out.println(sexNumber);
    }
    
}
