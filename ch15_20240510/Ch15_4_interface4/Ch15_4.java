/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch15_20240510.Ch15_4_interface4;

/**
 *
 * @author xvpow
 */
public class Ch15_4 {
        
       static void prints(MyIterator it,Consumer c){
            it.foreach(c);
            //System.out.println();
        }
     public static void main(String[] args){
         Student st1 = new Student("Ken");
         st1.addBook("Java");
         st1.addBook("Go");
         st1.addBook("Python");
         StudentPrint sp = new StudentPrint(st1.getName());
         prints(st1,sp);
         
     }
}
