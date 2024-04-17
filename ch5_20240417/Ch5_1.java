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
public class Ch5_1 {

    public static void main(String[] args) {
        
        int[] array2 = {28,4,10,18,9};
        //排序 小到大
        Arrays.sort(array2);
        for (int v : array2){
            System.out.print(v+" ");
        }
        System.out.println();
        int search = 77;
        
        int x =-1;
        for (int i = 0; i < array2.length;i++){
            if (array2[i] == search){
                x = i;
                break;
            }
        }
        System.out.println("index:"+x);
             
        
    }
    
}
