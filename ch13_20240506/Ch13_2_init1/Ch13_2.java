/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240506.Ch13_2_init1;

/**
 *
 * @author xvpow
 */
public class Ch13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student();
      System.out.println(st1.getScore(5)); 
       Student st2 = new Student();
         System.out.println(st2.getScore(2)); 
         
      Student st3 = new Student("Iris");
    System.out.println(st3);
    System.out.println(st3.getScore(2));
    
    Student st4 = new Student("Vivin",25);
    System.out.println(st4);
    System.out.println(st4.getScore(3));
       
    }
    
}
