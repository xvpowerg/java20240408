/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240408;

/**
 *
 * @author xvpow
 */
public class Ch1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v1 = 13;
        int v2 = 5;
        System.out.println(v1 + v2);
        System.out.println(v1 - v2);
        System.out.println(v1 * v2);
        System.out.println(v1 / v2);
        System.out.println(v1 % v2);
        
        int maxHp = 100;
        int hp = maxHp;
        int atk = 5;
        hp = hp - atk;
        System.out.println(hp / (float)maxHp);
        
        
    }
    
}
