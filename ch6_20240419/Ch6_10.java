/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240419;

/**
 *
 * @author xvpow
 */
public class Ch6_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //只要不是true 一律回傳false
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        boolean b2 = Boolean.parseBoolean("xxxxxx");
        System.out.println(b2);
    }
    
}
