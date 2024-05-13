/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20240513.Ch16_1_interface1;

/**
 *
 * @author xvpow
 */
public class Ch16_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person("Ken");
       p1.addMovie("M1");
       p1.addMovie("M2");
       p1.addMovie("M3");
       p1.foreach(new PersonPrint());
    }
    
}
