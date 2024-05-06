/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240506.Ch13_3_init2;

/**
 *
 * @author xvpow
 */
public class Ch13_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person();
       System.out.println(p1.getHobby(2));//Empty
      System.out.println(Person.getHobby(4));
    }
    
}
