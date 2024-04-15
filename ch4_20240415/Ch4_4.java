/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240415;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {

    public static void main(String[] args) {
        int[][] array1 = new int[2][3];
        int[] array2[] = new int[2][3];
        int array3[][] = new int[2][3];
        
        int[][] array4 = {{4,5,6},
                          {9,2,3}  };
        
        for (int i = 0; i < array4.length; i++){
            for ( int k = 0; k <array4[i].length;k++ ){
                System.out.print(array4[i][k] +" ");
            }
            System.out.println();
        }
         System.out.println();
         
         for (int[] a1 :array4 ){
             for (int v : a1){
                 System.out.print(v+" ");
             }
             System.out.println();
         }
         
         
        
    }
    
}
