/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240508.Ch14_6_interface3;

/**
 *
 * @author xvpow
 */
public class Ch14_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AnimalSkill monkey = new Monkey();
       System.out.println(Run.SPEED);
       monkey.jump();
       monkey.talk();
       monkey.run();
       monkey.walk();
       
    }
    
}
