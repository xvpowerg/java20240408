/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240508.Ch14_5_interface2;

/**
 *
 * @author xvpow
 */
public class Ch14_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Ken");
        Jump j1 = p1;
        Run r1 = p1;
        j1.jump();
        r1.run();
    }
    
}
