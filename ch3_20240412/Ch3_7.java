/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240412;

/**
 *
 * @author xvpow
 */
public class Ch3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Ken";
        names[1] = "Vivin";
        names[2] = "Lucy";
        names[3] = "Iris";
        names[4] = "Sean";
        
        for (int i = 0; i < names.length;i++){
            if (i % 2 == 0){
                System.out.println(names[i]);
            }
        }
    }
    
}
