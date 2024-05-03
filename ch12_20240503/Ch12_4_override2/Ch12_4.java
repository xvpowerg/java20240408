/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20240503.Ch12_4_override2;

/**
 *
 * @author xvpow
 */
public class Ch12_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student("Ken",25);
      Student st2 = new Student("Vivin",32);
      Student st3 = new Student("Ken",25);
      System.out.println(st1.getName());
      System.out.println(st2);
      System.out.println(st1 == st3);
      System.out.println(st1.equals(st3));
       Object obj = new Object();
       //java.lang.ClassCastException
       System.out.println(st1.equals(obj));
    }
    
}
