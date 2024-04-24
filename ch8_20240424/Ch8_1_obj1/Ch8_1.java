/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20240424.Ch8_1_obj1;

/**
 *
 * @author xvpow
 */
public class Ch8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //name長度必須大於1 小於10 且不可為null
       Animal a1 = new Animal("Bobo",2,20);
      a1.setAge(-100);
      a1.setName("ABC");
        //a1 .age = -100;
        a1.printInfo();
    }
    
}
