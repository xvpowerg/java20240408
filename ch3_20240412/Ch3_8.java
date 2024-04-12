/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240412;

/**
 *
 * @author xvpow
 */
public class Ch3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = {5,6,7,8};
        int sum =  0;
        for (int i = 0; i < array1.length;i++){
            sum += array1[i];
            System.out.print(array1[i]);
            if (i < array1.length -1){
                System.out.print("+"); 
            }
        }
        System.out.println("="+sum);
        //加種結果
    }
    
}
