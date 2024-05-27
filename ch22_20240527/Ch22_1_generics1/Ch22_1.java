/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240527.Ch22_1_generics1;

/**
 *
 * @author xvpow
 */
public class Ch22_1 {

 
    public static void main(String[] args) {
        MyList<String> myList = new MyList();
        myList.add("Ken");
        myList.add("Vivin");
        myList.add("Lucy");
        myList.foreach(v->System.out.println(v));
        String v = myList.get(1);
        System.out.println(v);
        
        MyList<Integer> myList2 = new MyList();
        myList2.add(10);
        myList2.add(35);
        myList2.add(70);
        int x = myList2.get(1);
        myList2.foreach(v2->System.out.println(v2));
        System.out.println(x);
        
    }
    
}
