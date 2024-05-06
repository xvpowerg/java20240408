/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240506.Ch13_1_static1;

/**
 *
 * @author xvpow
 */
public class Ch13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Ken",10);
        Person p2 = new Person("Vivin",25);
        System.out.println(p1);
        p1.setName("Iris");
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p1.getTotalCount());
        System.out.println(p2.getTotalCount());
        
        System.out.println(Person.getTotalCount());
    }
    
}
