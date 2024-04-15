/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240415;

/**
 *
 * @author xvpow
 */
public class Ch4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array1 = new int[][]{
        
            {5,6,8},
            {9,3,2}
        };
        
        int[][] array2 = new int[2][];
        array2[0] = new int[3];
        array2[1] = new int[]{8,7,11};
        
        for (int[] a1 : array2){
            for (int v : a1){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }
    
}
