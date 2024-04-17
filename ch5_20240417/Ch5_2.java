/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240417;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array2 = {28,4,10,18,9};
        Arrays.sort(array2);
        for (int x : array2){
            System.out.print(x+" ");
        }
        
        System.out.println();
        int index = Arrays.binarySearch(array2, 10);
        System.out.println(index);
        //找不到
        //比所有小 -1
           index = Arrays.binarySearch(array2, 2);
           System.out.println(index);
        //比所有大 (陣列長度 + 1) * -1
           index = Arrays.binarySearch(array2, 30);
           System.out.println(index);
        //在中間
          index =  Arrays.binarySearch(array2, 12);
          System.out.println(index);
    }
    
}
