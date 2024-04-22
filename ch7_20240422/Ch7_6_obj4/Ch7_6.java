/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240422.Ch7_6_obj4;

/**
 *
 * @author xvpow
 */
public class Ch7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Teacher t1 = new Teacher("Ken",20,"A0001");
       t1.printInfo();
       Teacher t2 = new Teacher();
       t2.printInfo();
        Teacher t3 = new Teacher("Lucy");
        t3.printInfo();//Lucy -1 A0000
    }
    
}
