/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240415;

/**
 *
 * @author xvpow
 */
public class Ch4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array1 = {9,7,8,11,12,1};
       System.out.println(array1[0]);
       System.out.println(array1[array1.length - 1]);
       //java.lang.ArrayIndexOutOfBoundsException
       //System.out.println(array1[-1]);
       System.out.println(array1[10]);
    }
    
}
