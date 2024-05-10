/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20240510.Ch15_3_interface3;

/**
 *
 * @author xvpow
 */
public class Ch15_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println(Calculate.add(15, 26));
     
      Calculate c =  new  MyPower();
     System.out.println(c.compute(2, 4));
      
    }
    
}
