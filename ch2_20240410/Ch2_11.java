/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240410;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i<= 5; i++){
            
            if (i == 3 || i== 2){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
