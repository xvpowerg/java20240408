/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240408;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char c1 = 'A';
        char c2 = 'A';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2);
        
        String st1 = "BA";
        String st2 = "BA";
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st1 == st2);
        
        
        String st3 = "C";
        String st4 = new String("C");
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st3 == st4);
        System.out.println(st3.equals(st4));
    }
    
}
