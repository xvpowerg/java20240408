/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240412;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tag:
        for (int i = 1; i<= 3; i++){
            System.out.println(i+":Start");
            for (int  k= 1; k<= 3; k++){
               
                System.out.println(i+"_"+k+" Start");
                if (i == 2){
                    //break tag;
                    continue tag;
                }
               System.out.println(i+"_"+k+" End");  
            }
             System.out.println(i+":End");
            System.out.println();
        }
        
        
    }
    
}
