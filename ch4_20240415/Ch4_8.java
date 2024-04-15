/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240415;

/**
 *
 * @author xvpow
 */
public class Ch4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[][] array1 = new int[2][];
        
        array1[0] = new int[]{5,6,7};
        array1[1] = new int[]{10,11};
        
        for (int i = 0; i< array1.length; i++){
            System.out.println(array1[i].length);
        }
        
        int[][] array2 = new int[2][];
        array2[0] = new int[3];
        array2[0][1] = 7;
        //java.lang.NullPointerException:
        array2[1][0] = 5;
       
    }
    
}
