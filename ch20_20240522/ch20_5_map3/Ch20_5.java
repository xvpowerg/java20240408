/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240522.ch20_5_map3;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch20_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Student> list = new ArrayList();
       Student st1 = new Student("Ken",77);
       Student st2 = new Student("Ken",32);
       Student st3 = new Student("Vivin",82);
       Student st4 = new Student("Vivin",51);
       Student st5 = new Student("Ken",77);
       Student st6 = new Student("Lucy",94);
       Student st7 = new Student("Vivin",77);
       list.add(st1);
       list.add(st2);
       list.add(st3);
       list.add(st4);
       list.add(st5);
       list.add(st6);
       list.add(st7);
       HashMap<String,Integer> map = new HashMap();
       for (Student s : list){
           map.merge(s.getName(), s.getScore(), (s1,s2)->s1+s2);
       }
       System.out.println(map);
       //小作業
       //Ken 77 32 77   Vivivn 82 51 77  Lucy 94
    }
    
}
