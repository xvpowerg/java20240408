/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20240503.Ch12_5_string1;

/**
 *
 * @author xvpow
 */
public class Ch12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "ABCDEFG";
        //不包含5
       String str2 = str1.substring(2, 5);
        System.out.println(str1);
       System.out.println(str2);
       
       byte[] b2 =  str1.getBytes();
       System.out.println(b2[0]);
    }
    
}
