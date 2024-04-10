/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240410;

/**
 *
 * @author xvpow
 */
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        for ( i = 1; i<= 5; i++){
            System.out.println(i);
        }
        System.out.println("i:"+i);
          
        //都不會輸出
        for (int k = 3; k > 9 ;k++){
            System.out.println("k:"+k);
        }
          
    }
    
}
