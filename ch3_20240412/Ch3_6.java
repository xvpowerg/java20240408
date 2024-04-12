/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240412;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] scores = new int[5];
        scores[2] = 67;
        scores[1] = 86;
        scores[4] = 73;
        System.out.println(scores[2]);
        int x = 1;
        System.out.println(scores[x]);
        
        for (int i = 0; i < 5; i++){
            System.out.print(i+"_"+scores[i]+" ");
        }
         System.out.println();
         
        for (int i = 0; i <scores.length ;i++){
            int v = scores[i];
            System.out.print(v+" ");
        } 
        System.out.println();
        
        for(int i=0; i <scores.length ;  i++){
              int v=scores[i];
             System.out.println(v+" ");  
          }
          System.out.println();
       
        for (int v : scores){
              System.out.println(v+" ");
         }
          
        
        
    }
    
}
