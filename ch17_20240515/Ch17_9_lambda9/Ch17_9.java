/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240515.Ch17_9_lambda9;
import java.util.function.Consumer;

public class Ch17_9 {

    static void testSplit(String s,Consumer<String> c){
        c.accept(s);
    }
    
    static void splitString(String str){
        String[] vs = str.split(",");
        for (String v : vs){
            System.out.println(v);
        }
    }
    public static void main(String[] args) {
        String s = "A,B,C,D";
        String[] value =  s.split(",");
        for (String v :value){
             System.out.println(v);
        }
       
        testSplit(s,(str)->{
            String[] vs = str.split(",");
            for (String v : vs){
                System.out.println(v);
            }
        });
        //method reference 把方法傳到變數
        testSplit(s,Ch17_9::splitString);
        
    }
    
}
