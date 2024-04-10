/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240410;

/**
 *
 * @author xvpow
 */
public class Ch2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int count = 0;
       boolean b1 = true && ++count < 0;//無短路
       System.out.println(b1);
       System.out.println(count);
       
       count = 0;
       boolean b2 = false && ++count < 0;//左邊false短路了
       System.out.println(b2);
       System.out.println(count);
       
       count = 0;
       boolean b3 = false || ++count > 0;//無短路
       System.out.println(b3);
       System.out.println(count);
       count = 0;
       boolean b4 = true || ++count > 0;// 左邊true短路了
       System.out.println(b4);
       System.out.println(count);
    }
    
}
