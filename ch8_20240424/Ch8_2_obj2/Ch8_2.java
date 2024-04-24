/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20240424.Ch8_2_obj2;

/**
 *
 * @author xvpow
 */
public class Ch8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Ken",18);
        p1.setName("Iris");
        p1.printInfo();
        
       Student st1 = new Student();
       st1.setAge(25);
       st1.setName("Ken");
       st1.printInfo();
       Student st2 = new Student("Lucy",25);
       st2.printInfo();
       Teacher t1 = new Teacher("Ben",23);
       t1.printInfo();
       
       
       Person p2 = new Student("Sean",18);
       Person p3 = new Teacher("Vivin",22);
       p2.printInfo();
       p3.printInfo();
       
    }
    
}
